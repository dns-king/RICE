
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

}
