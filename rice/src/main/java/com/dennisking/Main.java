package com.dennisking;

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

    private static final String EXTENSION = "rice";
    private static final String DIRBASE = "src/test/resources/";

    public static void main(String[] args) throws IOException {
        String files[] = args.length==0? new String[]{ "test." + EXTENSION } : args;
        System.out.println("Dirbase: " + DIRBASE);
        for (String file : files){
            System.out.println("START: " + file);

            CharStream in = CharStreams.fromFileName(DIRBASE + file);
            RiceLexer lexer = new RiceLexer(in);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            RiceParser parser = new RiceParser(tokens);
            RiceParser.StartContext tree = parser.start();
            RiceCustomVisitor visitor = new RiceCustomVisitor();
            visitor.visit(tree);

            System.out.println("FINISH: " + file);
        }
    }
}
