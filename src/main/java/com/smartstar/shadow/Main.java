package com.smartstar.shadow;

import com.smartstar.shadow.lexer.Lexer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) {
        Lexer lexer = new Lexer();
        if (args.length < 1) {
            System.out.println("Usage: java -jar shadow.jar [shadow-file]");
            return;
        }
        final String[] code = new String[1];
        File shadowFile = new File(args[0]);
        if (!shadowFile.exists()) {
            System.err.println("File not found");
            return;
        }
        try {
            Files.lines(shadowFile.toPath()).forEachOrdered(line -> {
                code[0] = code[0] + line;
            });
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        lexer.createProgram(shadowFile.getName(), code[0]);
    }
}
