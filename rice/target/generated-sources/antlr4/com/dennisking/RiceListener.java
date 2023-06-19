// Generated from com/dennisking/Rice.g4 by ANTLR 4.9.2
package com.dennisking;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RiceParser}.
 */
public interface RiceListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RiceParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(RiceParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(RiceParser.StartContext ctx);
}