package com.smartstar.shadow.lexer.exception;

public class ProgramNotFoundException extends RuntimeException {

    String program;

    public ProgramNotFoundException(String program) {
        this.program = program;
    }

    public String format() {
        return String.format("Program %s not found", program);
    }
}
