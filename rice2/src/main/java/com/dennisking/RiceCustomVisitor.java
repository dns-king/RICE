
package com.dennisking;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class RiceCustomVisitor extends RiceBaseVisitor<Object> {

    private Map<String, Object> variables = new HashMap<>();

    public void executeRiceFile(String filePath) {
        try {
            String riceCode = readFile(filePath);
            CharStream input = CharStreams.fromString(riceCode);
            RiceLexer lexer = new RiceLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            RiceParser parser = new RiceParser(tokens);
            RiceParser.ProgramContext programContext = parser.program();
            visitProgram(programContext);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String readFile(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)), StandardCharsets.UTF_8);
    }

    @Override
    public Object visitProgram(RiceParser.ProgramContext ctx) {
        return visit(ctx.codeBlock());
    }

    @Override
    public Object visitMainMethod(RiceParser.MainMethodContext ctx) {
        return visit(ctx.block());
    }

    @Override
    public Object visitVariableDeclaration(RiceParser.VariableDeclarationContext ctx) {
        String dataType = ctx.dataType().getText();
        String variableName = ctx.ID().getText();
        Object value = visit(ctx.expression());

        // Store the variable in the map
        variables.put(variableName, value);
        return null;
    }

    @Override
    public Object visitAssignmentStatement(RiceParser.AssignmentStatementContext ctx) {
        String variableName = ctx.ID().getText();
        Object value = visit(ctx.expression());

        // Update the variable value in the map
        variables.put(variableName, value);
        return null;
    }

    @Override
    public Object visitExpressionStatement(RiceParser.ExpressionStatementContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public Object visitPrintStatement(RiceParser.PrintStatementContext ctx) {
        Object value = visit(ctx.expression());
        System.out.println(value);
        return null;
    }

    @Override
    public Object visitExpression(RiceParser.ExpressionContext ctx) {
        Object left = visit(ctx.primary(0));
        for (int i = 1; i < ctx.primary().size(); i += 2) {
            String operator = ctx.getChild(i).getText();
            Object right = visit(ctx.primary(i + 1));

            // Evaluate the expression based on the operator
            if (operator.equals("+")) {
                left = add(left, right);
            } else if (operator.equals("-")) {
                left = subtract(left, right);
            } else if (operator.equals("*")) {
                left = multiply(left, right);
            } else if (operator.equals("/")) {
                left = divide(left, right);
            }
        }
        return left;
    }

    private Object add(Object left, Object right) {
        if (left instanceof Integer && right instanceof Integer) {
            return (Integer) left + (Integer) right;
        } else if (left instanceof String && right instanceof String) {
            return left.toString() + right.toString();
        }
        throw new RuntimeException("Unsupported data types for addition");
    }

    private Object subtract(Object left, Object right) {
        if (left instanceof Integer && right instanceof Integer) {
            return (Integer) left - (Integer) right;
        }
        throw new RuntimeException("Unsupported data types for subtraction");
    }

    private Object multiply(Object left, Object right) {
        if (left instanceof Integer && right instanceof Integer) {
            return (Integer) left * (Integer) right;
        }
        throw new RuntimeException("Unsupported data types for multiplication");
    }

    private Object divide(Object left, Object right) {
        if (left instanceof Integer && right instanceof Integer) {
            return (Integer) left / (Integer) right;
        }
        throw new RuntimeException("Unsupported data types for division");
    }

    @Override
    public Object visitPrimary(RiceParser.PrimaryContext ctx) {
        if (ctx.ID() != null) {
            String variableName = ctx.ID().getText();
            // Retrieve the value of the variable from the map
            Object value = variables.get(variableName);
            if (value == null) {
                throw new RuntimeException("Variable '" + variableName + "' not defined");
            }
            return value;
        } else if (ctx.INT_LITERAL() != null) {
            return Integer.parseInt(ctx.INT_LITERAL().getText());
        } else if (ctx.STRING_LITERAL() != null) {
            return ctx.STRING_LITERAL().getText();
        } else if (ctx.BOOL_LITERAL() != null) {
            return Boolean.parseBoolean(ctx.BOOL_LITERAL().getText());
        }
        return null;
    }

}
