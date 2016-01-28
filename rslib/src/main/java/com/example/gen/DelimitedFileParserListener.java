// Generated from C:/Users/kelvin.johnson/IdeaProjects/RecordSort/rslib/src/main/java/com/example/grammar\DelimitedFileParser.g4 by ANTLR 4.5.1
package com.example.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DelimitedFileParser}.
 */
public interface DelimitedFileParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DelimitedFileParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(DelimitedFileParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link DelimitedFileParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(DelimitedFileParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link DelimitedFileParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(DelimitedFileParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link DelimitedFileParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(DelimitedFileParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link DelimitedFileParser#rowc}.
	 * @param ctx the parse tree
	 */
	void enterRowc(DelimitedFileParser.RowcContext ctx);
	/**
	 * Exit a parse tree produced by {@link DelimitedFileParser#rowc}.
	 * @param ctx the parse tree
	 */
	void exitRowc(DelimitedFileParser.RowcContext ctx);
	/**
	 * Enter a parse tree produced by {@link DelimitedFileParser#rowp}.
	 * @param ctx the parse tree
	 */
	void enterRowp(DelimitedFileParser.RowpContext ctx);
	/**
	 * Exit a parse tree produced by {@link DelimitedFileParser#rowp}.
	 * @param ctx the parse tree
	 */
	void exitRowp(DelimitedFileParser.RowpContext ctx);
	/**
	 * Enter a parse tree produced by {@link DelimitedFileParser#rows}.
	 * @param ctx the parse tree
	 */
	void enterRows(DelimitedFileParser.RowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DelimitedFileParser#rows}.
	 * @param ctx the parse tree
	 */
	void exitRows(DelimitedFileParser.RowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DelimitedFileParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(DelimitedFileParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link DelimitedFileParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(DelimitedFileParser.FieldContext ctx);
}