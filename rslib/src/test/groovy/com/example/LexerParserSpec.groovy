package com.example

import com.example.gen.DelimitedFileLexer
import com.example.gen.DelimitedFileParser
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.FailedPredicateException
import org.antlr.v4.runtime.LexerNoViableAltException
import org.antlr.v4.runtime.NoViableAltException
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Created by kelvin.johnson on 1/28/2016.
 */
public class LexerParserSpec extends spock.lang.Specification {

    def "Testing the lexer and parser on various input files"()
    {
        given: "An input stream of data in a format supported by our grammar"

        // Create an input stream
        String inputString = new File(filename).text
        ANTLRInputStream input = new ANTLRInputStream(inputString)

        when: "I try to lex and parse the input"

        // Create a lexer bound to the input stream
        DelimitedFileLexer lexer = new DelimitedFileLexer(input)

        // Create a token stream bound to the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer)

        //Create a parser bound to the token stream
        DelimitedFileParser parser = new DelimitedFileParser(tokens)

        //Parse the file
        ParseTree tree = parser.file()

        then:
        //todo: test the parser for errors
        //todo: register custom error strategy to allow exceptions to bubble up from antlr

        //System.out.println(tree.toStringTree());
        notThrown(NoViableAltException)
        //notThrown(LexerNoViableAltException)
        //notThrown(InputMismatchException)
        //notThrown(FailedPredicateException)


        where:
        filename | _
        "src/test/resources/com/example/CommaDelimited.txt" | _
        "src/test/resources/com/example/MultiSpaceDelimited.txt" | _
        "src/test/resources/com/example/PipeDelimited.txt" | _
    }

}
