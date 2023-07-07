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
	 * Enter a parse tree produced by {@link RiceParser#cookMainMethod}.
	 * @param ctx the parse tree
	 */
	void enterCookMainMethod(RiceParser.CookMainMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#cookMainMethod}.
	 * @param ctx the parse tree
	 */
	void exitCookMainMethod(RiceParser.CookMainMethodContext ctx);
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
	 * Enter a parse tree produced by {@link RiceParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(RiceParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(RiceParser.IfStatementContext ctx);
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
	 * Enter a parse tree produced by {@link RiceParser#eatPrint}.
	 * @param ctx the parse tree
	 */
	void enterEatPrint(RiceParser.EatPrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#eatPrint}.
	 * @param ctx the parse tree
	 */
	void exitEatPrint(RiceParser.EatPrintContext ctx);
}