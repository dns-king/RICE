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
	 * Enter a parse tree produced by {@link RiceParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(RiceParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(RiceParser.VarDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link RiceParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(RiceParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(RiceParser.TermContext ctx);
}