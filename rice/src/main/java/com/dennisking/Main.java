package com.dennisking;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {

    public static void main(String[] args) throws IOException {

        // Read Rice program from a file
        String riceProgram = readFile("path/to/your-program.rice");

        // Create a lexer and parser for the Rice language
        RiceLexer lexer = new RiceLexer(CharStreams.fromString(riceProgram));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RiceParser parser = new RiceParser(tokens);

        // Parse the Rice program and obtain the parse tree
        ParseTree tree = parser.riceBlock();

        // Create a visitor and visit the parse tree to execute the Rice program
        RiceCustomVisitor visitor = new RiceCustomVisitor();
        visitor.visit(tree);
    }

    // Helper method to read the contents of a file into a string
    private static String readFile(String filePath) {
        try {
            byte[] encodedBytes = Files.readAllBytes(Paths.get(filePath));
            return new String(encodedBytes, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
