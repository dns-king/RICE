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
	 * Enter a parse tree produced by {@link RiceParser#code_block}.
	 * @param ctx the parse tree
	 */
	void enterCode_block(RiceParser.Code_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#code_block}.
	 * @param ctx the parse tree
	 */
	void exitCode_block(RiceParser.Code_blockContext ctx);
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
	 * Enter a parse tree produced by {@link RiceParser#cook_statement}.
	 * @param ctx the parse tree
	 */
	void enterCook_statement(RiceParser.Cook_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#cook_statement}.
	 * @param ctx the parse tree
	 */
	void exitCook_statement(RiceParser.Cook_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiceParser#serve_statement}.
	 * @param ctx the parse tree
	 */
	void enterServe_statement(RiceParser.Serve_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#serve_statement}.
	 * @param ctx the parse tree
	 */
	void exitServe_statement(RiceParser.Serve_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiceParser#eat_statement}.
	 * @param ctx the parse tree
	 */
	void enterEat_statement(RiceParser.Eat_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#eat_statement}.
	 * @param ctx the parse tree
	 */
	void exitEat_statement(RiceParser.Eat_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiceParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint_statement(RiceParser.Print_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint_statement(RiceParser.Print_statementContext ctx);
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
	 * Enter a parse tree produced by {@link RiceParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression(RiceParser.Additive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression(RiceParser.Additive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiceParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative_expression(RiceParser.Multiplicative_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative_expression(RiceParser.Multiplicative_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiceParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(RiceParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(RiceParser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiceParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(RiceParser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(RiceParser.Primary_expressionContext ctx);
}