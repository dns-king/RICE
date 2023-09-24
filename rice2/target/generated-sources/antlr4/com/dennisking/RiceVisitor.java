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
	 * Visit a parse tree produced by {@link RiceParser#codeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeBlock(RiceParser.CodeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiceParser#mainMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainMethod(RiceParser.MainMethodContext ctx);
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
	 * Visit a parse tree produced by {@link RiceParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(RiceParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiceParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(RiceParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiceParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(RiceParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiceParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(RiceParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiceParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(RiceParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiceParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(RiceParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link RiceParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(RiceParser.DataTypeContext ctx);
}