package com.dennisking;

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

    public static void main(String[] args) throws IOException {

        try {
            // Create an input stream of the Rice program
            String riceProgram = "Rice { Cook { bowl num1 = 10; bowl num2 = 5; bowl result = num1 + num2; Eat.print(result); } } Serve;";
            RiceLexer lexer = new RiceLexer(CharStreams.fromString(riceProgram));
            RiceParser parser = new RiceParser(new CommonTokenStream(lexer));

            // Build the parse tree
            RiceParser.RiceProgramContext riceProgramContext = parser.riceProgram();

            // Create a custom visitor
            CustomVisitor visitor = new CustomVisitor();

            // Execute the Rice program by visiting the parse tree
            visitor.visit(riceProgramContext);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
