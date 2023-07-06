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
	 * Visit a parse tree produced by {@link RiceParser#riceBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRiceBlock(RiceParser.RiceBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiceParser#cookBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCookBlock(RiceParser.CookBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiceParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(RiceParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiceParser#declarationStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStmt(RiceParser.DeclarationStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiceParser#declarationStmtTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStmtTail(RiceParser.DeclarationStmtTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiceParser#assignmentStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStmt(RiceParser.AssignmentStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiceParser#printStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStmt(RiceParser.PrintStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiceParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(RiceParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiceParser#addExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(RiceParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiceParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(RiceParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiceParser#mulExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpr(RiceParser.MulExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiceParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(RiceParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiceParser#addOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOp(RiceParser.AddOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiceParser#mulOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulOp(RiceParser.MulOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiceParser#serveStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServeStmt(RiceParser.ServeStmtContext ctx);
}