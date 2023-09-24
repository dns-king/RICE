package com.dennisking;

import java.io.IOException;


public class Main {


    public static void main(String[] args) throws IOException {

        RiceCustomVisitor visitor = new RiceCustomVisitor();
        visitor.executeRiceFile("rice/src/main/java/com/dennisking/program.rice");
    }

}

