package com.example;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;
import com.example.gen.DelimitedFileParser;
import com.example.gen.DelimitedFileParserBaseListener;


/**
 * Created by kelvin.johnson on 1/28/2016.
 */
public class RowBuilderListener extends DelimitedFileParserBaseListener
{
    @Override
    public void enterFile(DelimitedFileParser.FileContext ctx) {
        super.enterFile(ctx);
    }

    @Override
    public void exitFile(DelimitedFileParser.FileContext ctx) {
        super.exitFile(ctx);
    }

    @Override
    public void enterRow(DelimitedFileParser.RowContext ctx) {
        super.enterRow(ctx);
    }

    @Override
    public void exitRow(DelimitedFileParser.RowContext ctx) {
        super.exitRow(ctx);
    }

    @Override
    public void enterRowc(DelimitedFileParser.RowcContext ctx) {
        super.enterRowc(ctx);
    }

    @Override
    public void exitRowc(DelimitedFileParser.RowcContext ctx) {
        super.exitRowc(ctx);
    }

    @Override
    public void enterRowp(DelimitedFileParser.RowpContext ctx) {
        super.enterRowp(ctx);
    }

    @Override
    public void exitRowp(DelimitedFileParser.RowpContext ctx) {
        super.exitRowp(ctx);
    }

    @Override
    public void enterRows(DelimitedFileParser.RowsContext ctx) {
        super.enterRows(ctx);
    }

    @Override
    public void exitRows(DelimitedFileParser.RowsContext ctx) {
        super.exitRows(ctx);
    }

    @Override
    public void enterField(DelimitedFileParser.FieldContext ctx) {
        super.enterField(ctx);
    }

    @Override
    public void exitField(DelimitedFileParser.FieldContext ctx) {
        super.exitField(ctx);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
    }
}
