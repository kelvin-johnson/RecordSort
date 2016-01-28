// Generated from C:/Users/kelvin.johnson/IdeaProjects/RecordSort/rslib/src/main/java/com/example/grammar\DelimitedFileParser.g4 by ANTLR 4.5.1
package com.example.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DelimitedFileParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DelimitedFileParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DelimitedFileParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(DelimitedFileParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link DelimitedFileParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(DelimitedFileParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link DelimitedFileParser#rowc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowc(DelimitedFileParser.RowcContext ctx);
	/**
	 * Visit a parse tree produced by {@link DelimitedFileParser#rowp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowp(DelimitedFileParser.RowpContext ctx);
	/**
	 * Visit a parse tree produced by {@link DelimitedFileParser#rows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRows(DelimitedFileParser.RowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DelimitedFileParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(DelimitedFileParser.FieldContext ctx);
}