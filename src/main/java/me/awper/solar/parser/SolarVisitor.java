package me.awper.solar.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SolarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SolarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SolarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(SolarParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolarParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(SolarParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolarParser#application}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplication(SolarParser.ApplicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SolarParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolarParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(SolarParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolarParser#ifelse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelse(SolarParser.IfelseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(SolarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolarParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(SolarParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolarParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(SolarParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SolarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SolarParser.ExpressionContext ctx);
}