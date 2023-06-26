
package com.dennisking;

import java.util.ArrayList;
import java.util.List;

public class RiceCustomVisitor extends RiceBaseVisitor<Object> {

    @Override
    public Object visitVariableDeclaration(RiceParser.VariableDeclarationContext ctx) {
        String type = ctx.type().getText();
        String identifier = ctx.Identifier().getText();
        Object value = visitExpression(ctx.expression());

        // Store the variable in the symbol table or perform necessary actions
        // based on the declaration, such as type checking or assigning the value.

        return null;
    }

    @Override
    public Object visitAdditiveExpression(RiceParser.AdditiveExpressionContext ctx) {
        Object leftValue = visitMultiplicativeExpression(ctx.multiplicativeExpression(0));
        for (int i = 1; i < ctx.multiplicativeExpression().size(); i++) {
            Object rightValue = visitMultiplicativeExpression(ctx.multiplicativeExpression(i));
            String operator = ctx.getChild(i).getText();
            if (operator.equals("+")) {
                leftValue = addValues(leftValue, rightValue);
            } else if (operator.equals("-")) {
                leftValue = subtractValues(leftValue, rightValue);
            }
        }
        return leftValue;
    }

    @Override
    public Object visitPrintStatement(RiceParser.PrintStatementContext ctx) {
        Object value = visitExpression(ctx.expression());
        System.out.println(value);
        return null;
    }

    @Override
    public Object visitVariableDeclaration(RiceParser.VariableDeclarationContext ctx) {
        String type = ctx.type().getText();
        String identifier = ctx.Identifier().getText();
        Object value = visitExpression(ctx.expression());

        // Perform type checking and error handling
        if (!isValidType(type)) {
            throw new RuntimeException("Invalid type: " + type);
        }

    // Store the variable in the symbol table or perform necessary actions

    @Override
    public Object visitCodeCompletion(RiceParser.CodeCompletionContext ctx) {
        String dataType = ctx.dataType().getText();
        List<String> completions = new ArrayList<>();

        // Generate code completions based on the specified data type
        if (dataType.equals("int")) {
            completions.add("0");
            completions.add("1");
            completions.add("2");
            // Add more integer completions as needed
        } else if (dataType.equals("float")) {
            completions.add("0.0");
            completions.add("1.0");
            completions.add("2.0");
            // Add more float completions as needed
        } else if (dataType.equals("string")) {
            completions.add("\"Hello\"");
            completions.add("\"World\"");
            // Add more string completions as needed
        }

        // Return the generated completions
        return completions;
    }

    // Implement similar methods for multiplicative expressions, primary
    // expressions, etc.

}
