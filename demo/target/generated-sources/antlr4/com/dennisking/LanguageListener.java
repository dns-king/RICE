// Generated from com/dennisking/Language.g4 by ANTLR 4.9.2
package com.dennisking;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LanguageParser}.
 */
public interface LanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LanguageParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(LanguageParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(LanguageParser.StartContext ctx);
}