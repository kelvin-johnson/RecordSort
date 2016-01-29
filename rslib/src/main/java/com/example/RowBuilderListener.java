package com.example;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;
import com.example.gen.DelimitedFileParser;
import com.example.gen.DelimitedFileParserBaseListener;

import java.util.LinkedList;
import java.util.List;


/**
 * Created by kelvin.johnson on 1/28/2016.
 */
public class RowBuilderListener extends DelimitedFileParserBaseListener
{
    List<Row> rows = new LinkedList<Row>();
    List<Row> getRows() { return rows; }

    Row row = new Row();
    int fieldIndex = 0;

    @Override
    public void enterRowc(DelimitedFileParser.RowcContext ctx) {

    }

    @Override
    public void exitRowc(DelimitedFileParser.RowcContext ctx) {
        rows.add(row);
    }

    @Override
    public void enterRowp(DelimitedFileParser.RowpContext ctx) {

    }

    @Override
    public void exitRowp(DelimitedFileParser.RowpContext ctx) {
        rows.add(row);
    }

    @Override
    public void enterRows(DelimitedFileParser.RowsContext ctx) {

    }

    @Override
    public void exitRows(DelimitedFileParser.RowsContext ctx) {
        rows.add(row);
    }

    @Override
    public void enterField(DelimitedFileParser.FieldContext ctx) {

        String field = ctx.TEXT().getText();

        switch(fieldIndex)
        {
            case 0:
                row.setLastName(field);
                System.out.println("LastName: " + field);
                break;

            case 1:
                row.setFirstName(field);
                System.out.println("FirstName: " + field);
                break;

            case 2:
                row.setGender(field);
                System.out.println("Gender: " + field);
                break;

            case 3:
                row.setFavoriteColor(field);
                System.out.println("Favorite Color: " + field);
                break;

            case 4:
                row.setDob(field);
                System.out.println("Date of Birth: " + field);
                break;

            default:
                //uh oh
        }
        fieldIndex++;
    }

    @Override
    public void exitField(DelimitedFileParser.FieldContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode node) {

    }

}
