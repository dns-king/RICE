package com.dennisking;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;


public class Main {


    public static void main(String[] args) throws IOException {

        try {
        // Read the Rice program from a file
        String filePath = "rice/src/main/java/com/dennisking/program.rice";
        String riceProgram = new String(Files.readAllBytes(Paths.get(filePath)));

        // Create an input stream of the Rice program
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
}
