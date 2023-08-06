
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
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

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
        // Visit the CookMainMethod node
        visit(ctx.cookMainMethod());
        return null;
    }

    @Override
    public Void visitCookMainMethod(RiceParser.CookMainMethodContext ctx) {
        // Visit the block node
        visit(ctx.block());
        return null;
    }

    @Override
    public Void visitBlock(RiceParser.BlockContext ctx) {
        // Visit each statement in the block
        for (RiceParser.StatementContext statement : ctx.statement()) {
            visit(statement);
        }
        return null;
    }

    @Override
    public Void visitEatPrintStatement(RiceParser.EatPrintStatementContext ctx) {
        // Get the expression argument for the Eat.print statement
        ParseTree expression = ctx.expression();

        // Perform actions for the Eat.print statement
        System.out.println("Printing: " + expression.getText());

        return null;
    }

    @Override
    public Void visitVariableDeclaration(RiceParser.VariableDeclarationContext ctx) {
        // Get the variable name and expression
        String variableName = ctx.ID().getText();
        ParseTree expression = ctx.expression();

        // Perform actions for the variable declaration statement
        System.out.println("Variable declaration: " + variableName + " = " + expression.getText());

        return null;
    }

    @Override
    public Void visitExpression(RiceParser.ExpressionContext ctx) {
        // Get the left and right expressions, and the operator
        ParseTree leftExpr = ctx.expression(0);
        ParseTree rightExpr = ctx.expression(1);
        String operator = ctx.getChild(1).getText();

        // Perform actions for the arithmetic expression
        System.out.println("Arithmetic expression: " + leftExpr.getText() + " " +
                operator + " " + rightExpr.getText());

        return null;
    }

    // Override visitTerminal for specific terminal nodes
    @Override
    public Void visitTerminal(TerminalNode node) {
        // Perform actions for specific terminal nodes if needed
        return null;
    }

}
