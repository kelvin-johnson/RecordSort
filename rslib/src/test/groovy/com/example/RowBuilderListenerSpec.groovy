package com.example

import com.example.gen.DelimitedFileLexer
import com.example.gen.DelimitedFileParser
import com.example.gen.DelimitedFileParserBaseListener
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.ParseTreeWalker

/**
 * Created by kelvin.johnson on 1/28/2016.
 */
class RowBuilderListenerSpec extends spock.lang.Specification {
    def "Create list of Row objects"()
    {
        given: "A parse tree"

        // Create an input stream
        String inputString = new File(filename).text
        ANTLRInputStream input = new ANTLRInputStream(inputString)

        // Create a lexer bound to the input stream
        DelimitedFileLexer lexer = new DelimitedFileLexer(input)

        // Create a token stream bound to the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer)

        //Create a parser bound to the token stream
        DelimitedFileParser parser = new DelimitedFileParser(tokens)

        //Parse the file
        ParseTree tree = parser.file()

        when: "I traverse the tree with the RowBuilderListener"
        RowBuilderListener listener = new RowBuilderListener()
        ParseTreeWalker walker = new ParseTreeWalker()
        walker.walk(listener, tree)

        then: "The row counts should equal 12"

        System.out.println(listener.getRows().toString())
        listener.getRows().size() == rowcount

        where: "This data is used as input"
        filename | rowcount
        "src/test/resources/com/example/CommaDelimited.txt" | 12
        "src/test/resources/com/example/MultiSpaceDelimited.txt" | 12
        "src/test/resources/com/example/PipeDelimited.txt" | 12

    }
}
