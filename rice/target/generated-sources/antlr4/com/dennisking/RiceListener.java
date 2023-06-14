// Generated from com/dennisking/Rice.g4 by ANTLR 4.9.3
package com.dennisking;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RiceParser}.
 */
public interface RiceListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RiceParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(RiceParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(RiceParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiceParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(RiceParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(RiceParser.ExprContext ctx);
}