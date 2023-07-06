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
	 * Enter a parse tree produced by {@link RiceParser#riceBlock}.
	 * @param ctx the parse tree
	 */
	void enterRiceBlock(RiceParser.RiceBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#riceBlock}.
	 * @param ctx the parse tree
	 */
	void exitRiceBlock(RiceParser.RiceBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiceParser#cookBlock}.
	 * @param ctx the parse tree
	 */
	void enterCookBlock(RiceParser.CookBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#cookBlock}.
	 * @param ctx the parse tree
	 */
	void exitCookBlock(RiceParser.CookBlockContext ctx);
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
	 * Enter a parse tree produced by {@link RiceParser#declarationStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStmt(RiceParser.DeclarationStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#declarationStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStmt(RiceParser.DeclarationStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiceParser#declarationStmtTail}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStmtTail(RiceParser.DeclarationStmtTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#declarationStmtTail}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStmtTail(RiceParser.DeclarationStmtTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiceParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStmt(RiceParser.AssignmentStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStmt(RiceParser.AssignmentStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiceParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(RiceParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(RiceParser.PrintStmtContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link RiceParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(RiceParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(RiceParser.AddExprContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link RiceParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(RiceParser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#mulExpr}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(RiceParser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiceParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(RiceParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(RiceParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiceParser#addOp}.
	 * @param ctx the parse tree
	 */
	void enterAddOp(RiceParser.AddOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#addOp}.
	 * @param ctx the parse tree
	 */
	void exitAddOp(RiceParser.AddOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiceParser#mulOp}.
	 * @param ctx the parse tree
	 */
	void enterMulOp(RiceParser.MulOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#mulOp}.
	 * @param ctx the parse tree
	 */
	void exitMulOp(RiceParser.MulOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link RiceParser#serveStmt}.
	 * @param ctx the parse tree
	 */
	void enterServeStmt(RiceParser.ServeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link RiceParser#serveStmt}.
	 * @param ctx the parse tree
	 */
	void exitServeStmt(RiceParser.ServeStmtContext ctx);
}