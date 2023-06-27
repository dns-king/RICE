package com.dennisking;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class Main {
    public static void main(String[] args) {
        // Create an input stream from the Rice program
        String riceCode = "Rice { int x = 5; print(x); }";
        CharStream input = CharStreams.fromString(riceCode);

        // Create a lexer that feeds off the input stream
        RiceLexer lexer = new RiceLexer(input);

        // Create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create a parser that feeds off the tokens buffer
        RiceParser parser = new RiceParser(tokens);

        // Start parsing at the program rule
        ParseTree tree = parser.program();

        // Create a visitor instance to interpret the program
        RiceCustomVisitor visitor = new RiceCustomVisitor();

        // Traverse the parse tree using the visitor
        visitor.visit(tree);
    }
}


// import java.io.IOException;
// import org.antlr.v4.runtime.CharStream;
// import org.antlr.v4.runtime.CharStreams;
// import org.antlr.v4.runtime.CommonTokenStream;

// public class Main {

//     private static final String EXTENSION = "rice";
//     private static final String DIRBASE = "src/test/resources/";

//     public static void main(String[] args) throws IOException {
//         String files[] = args.length==0? new String[]{ "test." + EXTENSION } : args;
//         System.out.println("Dirbase: " + DIRBASE);
//         for (String file : files){
//             System.out.println("START: " + file);

//             CharStream in = CharStreams.fromFileName(DIRBASE + file);
//             RiceLexer lexer = new RiceLexer(in);
//             CommonTokenStream tokens = new CommonTokenStream(lexer);
//             RiceParser parser = new RiceParser(tokens);
//             RiceParser.StartContext tree = parser.start();
//             RiceCustomVisitor visitor = new RiceCustomVisitor();
//             visitor.visit(tree);

//             System.out.println("FINISH: " + file);
//         }
//     }
// }
