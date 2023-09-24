
package com.dennisking;

import org.antlr.v4.runtime.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RiceCustomVisitor extends RiceBaseVisitor<Object> {

    private Map<String, String> shortcuts;

    public RiceCustomVisitor() {
        shortcuts = new HashMap<>();
    }

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
    public Void visitProgram(RiceParser.ProgramContext ctx) {
        return visitCode_block(ctx.code_block());
    }

    @Override
    public Void visitCode_block(RiceParser.Code_blockContext ctx) {
        for (RiceParser.StatementContext statementContext : ctx.statement()) {
            visitStatement(statementContext);
        }
        return null;
    }

    @Override
    public Void visitCook_statement(RiceParser.Cook_statementContext ctx) {
        System.out.println("Cooking...");
        return null;
    }

    @Override
    public Void visitServe_statement(RiceParser.Serve_statementContext ctx) {
        List<RiceParser.ExpressionContext> expressions = ctx.expression();
        System.out.print("Serving with: ");
        for (RiceParser.ExpressionContext expression : expressions) {
            int value = Integer.parseInt(expression.getText());
            System.out.print(value + " ");
        }
        System.out.println();
        return null;
    }

    @Override
    public Void visitEat_statement(RiceParser.Eat_statementContext ctx) {
        if (ctx.expression() != null) {
            visitExpression(ctx.expression());
        }
        if (ctx.print_statement() != null) {
            visitPrint_statement(ctx.print_statement());
        }
        return null;
    }

    @Override
    public Void visitPrint_statement(RiceParser.Print_statementContext ctx) {
        String value = ctx.expression().getText();
        System.out.println("Print Statement: " + value);
        return null;
    }

    @Override
    public Void visitAdditive_expression(RiceParser.Additive_expressionContext ctx) {
        // Handle additive expressions
        // ...
        return null;
    }

    @Override
    public Void visitMultiplicative_expression(RiceParser.Multiplicative_expressionContext ctx) {
        // Handle multiplicative expressions
        // ...
        return null;
    }

    // @Override
    // public Void visitInteger(RiceParser.IntegerContext ctx) {
    // // Handle integer expressions
    // // ...
    // return null;
    // }

    // @Override
    // public Void visitString(RiceParser.StringContext ctx) {
    // // Handle string expressions
    // // ...
    // return null;
    // }

}
