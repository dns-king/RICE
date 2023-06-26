// Generated from com/dennisking/Rice.g4 by ANTLR 4.9.2
package com.dennisking;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RiceParser}.
 */
public interface RiceListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RiceParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(RiceParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(RiceParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiceParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlock(RiceParser.CodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlock(RiceParser.CodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiceParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(RiceParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(RiceParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiceParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(RiceParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(RiceParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiceParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(RiceParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(RiceParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiceParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(RiceParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(RiceParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiceParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(RiceParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(RiceParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiceParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(RiceParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(RiceParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiceParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(RiceParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(RiceParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiceParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(RiceParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(RiceParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiceParser#codeSnippet}.
	 * @param ctx the parse tree
	 */
	void enterCodeSnippet(RiceParser.CodeSnippetContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#codeSnippet}.
	 * @param ctx the parse tree
	 */
	void exitCodeSnippet(RiceParser.CodeSnippetContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiceParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(RiceParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(RiceParser.TypeContext ctx);
}