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
	 * Enter a parse tree produced by {@link RiceParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(RiceParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(RiceParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiceParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(RiceParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(RiceParser.PrintContext ctx);
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
	 * Enter a parse tree produced by {@link RiceParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(RiceParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(RiceParser.AtomContext ctx);
}