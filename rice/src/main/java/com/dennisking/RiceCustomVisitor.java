
package com.dennisking;

import java.util.HashMap;
import java.util.Map;

public class RiceCustomVisitor extends RiceBaseVisitor<Object> {

    // Create a symbol table to store variable values
    private Map<String, Object> symbolTable;

    public CustomVisitor() {
        symbolTable = new HashMap<>();
    }

    @Override
    public Void visitRiceProgram(RiceParser.RiceProgramContext ctx) {
        // Visit the cookCodeBlock
        visit(ctx.cookCodeBlock);
        return null;
    }

    @Override
    public Void visitCookCodeBlock(RiceParser.CookCodeBlockContext ctx) {
        // Visit each statement in the riceCodeBlock
        for (RiceParser.StatementContext statementContext : ctx.riceCodeBlock().statement()) {
            visit(statementContext);
        }
        return null;
    }

    @Override
    public Void visitAssignmentStatement(RiceParser.AssignmentStatementContext ctx) {
        // Get the variable name and expression value
        String variableName = ctx.variableName().getText();
        Object value = visit(ctx.expression());

        // Store the value in the symbol table
        symbolTable.put(variableName, value);
        return null;
    }

    @Override
    public Void visitExpressionStatement(RiceParser.ExpressionStatementContext ctx) {
        // Visit the expression
        visit(ctx.expression());
        return null;
    }

    @Override
    public Object visitAdditiveExpression(RiceParser.AdditiveExpressionContext ctx) {
        if (ctx.getChildCount() == 1) {
            // If there is only one child, visit it and return the result
            return visit(ctx.getChild(0));
        } else {
            // Evaluate the left and right expressions
            Object leftValue = visit(ctx.additiveExpression());
            Object rightValue = visit(ctx.multiplicativeExpression());

            // Perform addition or subtraction based on the operator
            if (ctx.getChild(1).getText().equals("+")) {
                // Addition
                if (leftValue instanceof Integer && rightValue instanceof Integer) {
                    return (int) leftValue + (int) rightValue;
                } else if (leftValue instanceof String || rightValue instanceof String) {
                    return leftValue.toString() + rightValue.toString();
                }
            } else {
                // Subtraction
                if (leftValue instanceof Integer && rightValue instanceof Integer) {
                    return (int) leftValue - (int) rightValue;
                }
            }
        }

        throw new RuntimeException("Invalid expression: " + ctx.getText());
    }

    @Override
    public Object visitMultiplicativeExpression(RiceParser.MultiplicativeExpressionContext ctx) {
        if (ctx.getChildCount() == 1) {
            // If there is only one child, visit it and return the result
            return visit(ctx.getChild(0));
        } else {
            // Evaluate the left and right expressions
            Object leftValue = visit(ctx.multiplicativeExpression());
            Object rightValue = visit(ctx.primaryExpression());

            // Perform multiplication or division based on the operator
            if (ctx.getChild(1).getText().equals("*")) {
                // Multiplication
                if (leftValue instanceof Integer && rightValue instanceof Integer) {
                    return (int) leftValue * (int) rightValue;
                }
            } else {
                // Division
                if (leftValue instanceof Integer && rightValue instanceof Integer) {
                    return (int) leftValue / (int) rightValue;
                }
            }
        }

        throw new RuntimeException("Invalid expression: " + ctx.getText());
    }

    @Override
    public Object visitLiteral(RiceParser.LiteralContext ctx) {
        if (ctx.STRING() != null) {
            // Remove the enclosing quotes and unescape the string
            String text = ctx.STRING().getText();
            String unescapedText = text.substring(1, text.length() - 1).replace("\"\"", "\"");
            return unescapedText;
        } else if (ctx.INTEGER() != null) {
            // Parse the integer value
            return Integer.parseInt(ctx.INTEGER().getText());
        }

        throw new RuntimeException("Invalid literal: " + ctx.getText());
    }

    @Override
    public Object visitVariableName(RiceParser.VariableNameContext ctx) {
        // Get the variable name
        String variableName = ctx.getText();

        // Check if the variable exists in the symbol table
        if (symbolTable.containsKey(variableName)) {
            return symbolTable.get(variableName);
        } else {
            throw new RuntimeException("Variable not found: " + variableName);
        }
    }

    @Override
    public Void visitPrintStatement(RiceParser.PrintStatementContext ctx) {
        // Visit the expression inside the print statement
        Object value = visit(ctx.expression());

        // Print the value
        System.out.println(value);
        return null;
    }

}
