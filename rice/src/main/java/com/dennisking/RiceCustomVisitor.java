
package com.dennisking;

import java.util.HashMap;
import java.util.Map;

public class RiceCustomVisitor extends RiceBaseVisitor<Object> {

    private Map<String, Integer> bowlVariables;
    private Map<String, String> grainVariables;

    public RiceCustomVisitor() {
        bowlVariables = new HashMap<>();
        grainVariables = new HashMap<>();
    }

    @Override
    public Void visitProgram(RiceParser.ProgramContext ctx) {
        visit(ctx.riceBlock());
        return null;
    }

    @Override
    public Void visitRiceBlock(RiceParser.RiceBlockContext ctx) {
        visit(ctx.cookBlock());
        return null;
    }

    @Override
    public Void visitCookBlock(RiceParser.CookBlockContext ctx) {
        for (RiceParser.StatementContext stmtCtx : ctx.statement()) {
            visit(stmtCtx);
        }
        return null;
    }

    @Override
    public Void visitDeclarationStmt(RiceParser.DeclarationStmtContext ctx) {
        String variableName = ctx.ID().getText();
        if (ctx.BOWL() != null) {
            int value = Integer.parseInt(ctx.INT().getText());
            bowlVariables.put(variableName, value);
        } else if (ctx.GRAIN() != null) {
            String value = ctx.STRING().getText();
            grainVariables.put(variableName, value);
        }
        if (ctx.declarationStmtTail() != null) {
            visit(ctx.declarationStmtTail());
        }
        return null;
    }

    @Override
    public Void visitDeclarationStmtTail(RiceParser.DeclarationStmtTailContext ctx) {
        for (RiceParser.DeclarationStmtContext stmtCtx : ctx.declarationStmt()) {
            visit(stmtCtx);
        }
        return null;
    }

    @Override
    public Void visitAssignmentStmt(RiceParser.AssignmentStmtContext ctx) {
        String variableName = ctx.ID().getText();
        int value = visit(ctx.expr());
        bowlVariables.put(variableName, value);
        return null;
    }

    @Override
    public Void visitPrintStmt(RiceParser.PrintStmtContext ctx) {
        String expression = visit(ctx.expr()).toString();
        System.out.println(expression);
        return null;
    }

    @Override
    public Integer visitExpr(RiceParser.ExprContext ctx) {
        int result = visit(ctx.term());
        for (int i = 0; i < ctx.addExpr().size(); i++) {
            String operator = ctx.addOp(i).getText();
            int operand = visit(ctx.term(i + 1));
            if (operator.equals("+")) {
                result += operand;
            } else if (operator.equals("-")) {
                result -= operand;
            }
        }
        return result;
    }

    @Override
    public Integer visitTerm(RiceParser.TermContext ctx) {
        int result = visit(ctx.factor());
        for (int i = 0; i < ctx.mulExpr().size(); i++) {
            String operator = ctx.mulOp(i).getText();
            int operand = visit(ctx.factor(i + 1));
            if (operator.equals("*")) {
                result *= operand;
            }
        }
        return result;
    }

    @Override
    public Integer visitFactor(RiceParser.FactorContext ctx) {
        if (ctx.ID() != null) {
            String variableName = ctx.ID().getText();
            if (bowlVariables.containsKey(variableName)) {
                return bowlVariables.get(variableName);
            }
        } else if (ctx.INT() != null) {
            return Integer.parseInt(ctx.INT().getText());
        } else if (ctx.STRING() != null) {
            String stringLiteral = ctx.STRING().getText();
            // Remove the double quotes from the string literal
            return Integer.parseInt(stringLiteral.substring(1, stringLiteral.length() - 1));
        } else if (ctx.expr() != null) {
            return visit(ctx.expr());
        }
        throw new RuntimeException("Invalid expression");
    }

}
