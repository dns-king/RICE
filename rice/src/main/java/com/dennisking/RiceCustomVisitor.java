
package com.dennisking;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class RiceCustomVisitor extends RiceBaseVisitor<Object> {

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
    public Void visitIfStatement(RiceParser.IfStatementContext ctx) {
        // Visit the condition expression of the if statement
        visit(ctx.expression());

        // Visit the block of code inside the if statement
        visit(ctx.block());

        return null;
    }

    @Override
    public Void visitExpression(RiceParser.ExpressionContext ctx) {
        if (ctx.BOWL() != null) {
            // Handle integer expression
            int value = Integer.parseInt(ctx.BOWL().getText());
            System.out.println("Integer expression: " + value);
        } else if (ctx.GRAIN() != null) {
            // Handle string expression
            String value = ctx.GRAIN().getText();
            System.out.println("String expression: " + value);
        } else if (ctx.ID() != null) {
            // Handle identifier expression
            String identifier = ctx.ID().getText();
            System.out.println("Identifier expression: " + identifier);
        } else if (ctx.expression().size() == 2) {
            // Handle binary arithmetic expressions
            ParseTree leftExpr = ctx.expression(0);
            ParseTree rightExpr = ctx.expression(1);
            String operator = ctx.getChild(1).getText();

            System.out.println("Binary expression: " + leftExpr.getText() + " " + operator + " " + rightExpr.getText());
        }

        return null;
    }

    @Override
    public Void visitEatPrint(RiceParser.EatPrintContext ctx) {
        // Get the expression argument for the Eat.print statement
        ParseTree expression = ctx.getChild(0);

        // Perform actions for the Eat.print statement
        System.out.println("Printing: " + expression.getText());

        return null;
    }

    // Override other visit methods for different rules as needed

    // Override visitTerminal for specific terminal nodes
    @Override
    public Void visitTerminal(TerminalNode node) {
        // Perform actions for specific terminal nodes if needed
        return null;
    }

}
