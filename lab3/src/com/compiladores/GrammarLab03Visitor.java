package com.compiladores;// Generated from GrammarLab03.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarLab03Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarLab03Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarLab03Parser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(GrammarLab03Parser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarLab03Parser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(GrammarLab03Parser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNum}
	 * labeled alternative in {@link GrammarLab03Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNum(GrammarLab03Parser.ExprNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMult}
	 * labeled alternative in {@link GrammarLab03Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMult(GrammarLab03Parser.ExprMultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprFuncCall}
	 * labeled alternative in {@link GrammarLab03Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFuncCall(GrammarLab03Parser.ExprFuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprSum}
	 * labeled alternative in {@link GrammarLab03Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSum(GrammarLab03Parser.ExprSumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprSub}
	 * labeled alternative in {@link GrammarLab03Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSub(GrammarLab03Parser.ExprSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParenthesis}
	 * labeled alternative in {@link GrammarLab03Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParenthesis(GrammarLab03Parser.ExprParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link GrammarLab03Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprId(GrammarLab03Parser.ExprIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprDiv}
	 * labeled alternative in {@link GrammarLab03Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDiv(GrammarLab03Parser.ExprDivContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarLab03Parser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(GrammarLab03Parser.VarContext ctx);
}