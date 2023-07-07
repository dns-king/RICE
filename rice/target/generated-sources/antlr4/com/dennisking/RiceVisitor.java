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
	 * Visit a parse tree produced by {@link RiceParser#cookMainMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCookMainMethod(RiceParser.CookMainMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiceParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(RiceParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiceParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(RiceParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiceParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(RiceParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiceParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(RiceParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiceParser#eatPrint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEatPrint(RiceParser.EatPrintContext ctx);
}