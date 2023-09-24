package com.dennisking;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        RiceCustomVisitor visitor = new RiceCustomVisitor();
        visitor.executeRiceFile("rice/src/main/java/com/dennisking/program.rice");
        // CharStream input = CharStreams.fromString("rice { cook; serve 10 with 20 and
        // 30; eat print \"Delicious!\"; }");
        // RiceLexer lexer = new RiceLexer(input);
        // CommonTokenStream tokens = new CommonTokenStream(lexer);
        // RiceParser parser = new RiceParser(tokens);
        // RiceParser.ProgramContext programContext = parser.program();

        // RiceCustomVisitor visitor = new RiceCustomVisitor();
        // visitor.visitProgram(programContext);

    }
}
