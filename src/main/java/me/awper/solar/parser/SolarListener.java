package me.awper.solar.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SolarParser}.
 */
public interface SolarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SolarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(SolarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(SolarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolarParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(SolarParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolarParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(SolarParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolarParser#application}.
	 * @param ctx the parse tree
	 */
	void enterApplication(SolarParser.ApplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolarParser#application}.
	 * @param ctx the parse tree
	 */
	void exitApplication(SolarParser.ApplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SolarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SolarParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolarParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(SolarParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolarParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(SolarParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolarParser#ifelse}.
	 * @param ctx the parse tree
	 */
	void enterIfelse(SolarParser.IfelseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolarParser#ifelse}.
	 * @param ctx the parse tree
	 */
	void exitIfelse(SolarParser.IfelseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(SolarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(SolarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolarParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(SolarParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolarParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(SolarParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SolarParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SolarParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SolarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SolarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SolarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SolarParser.ExpressionContext ctx);
}