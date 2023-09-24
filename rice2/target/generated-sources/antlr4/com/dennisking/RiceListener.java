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
	 * Enter a parse tree produced by {@link RiceParser#mainMethod}.
	 * @param ctx the parse tree
	 */
	void enterMainMethod(RiceParser.MainMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#mainMethod}.
	 * @param ctx the parse tree
	 */
	void exitMainMethod(RiceParser.MainMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiceParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(RiceParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(RiceParser.BlockContext ctx);
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
	 * Enter a parse tree produced by {@link RiceParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(RiceParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(RiceParser.ExpressionStatementContext ctx);
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
	 * Enter a parse tree produced by {@link RiceParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(RiceParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(RiceParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiceParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(RiceParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(RiceParser.DataTypeContext ctx);
}