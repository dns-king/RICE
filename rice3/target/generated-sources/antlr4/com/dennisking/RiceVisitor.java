// Generated from com/dennisking/Rice.g4 by ANTLR 4.9.2
package com.dennisking;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RiceParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RiceVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RiceParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(RiceParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiceParser#code_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode_block(RiceParser.Code_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiceParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(RiceParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiceParser#cook_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCook_statement(RiceParser.Cook_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiceParser#serve_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServe_statement(RiceParser.Serve_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiceParser#eat_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEat_statement(RiceParser.Eat_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiceParser#print_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_statement(RiceParser.Print_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiceParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(RiceParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiceParser#additive_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive_expression(RiceParser.Additive_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiceParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicative_expression(RiceParser.Multiplicative_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiceParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expression(RiceParser.Unary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiceParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expression(RiceParser.Primary_expressionContext ctx);
}