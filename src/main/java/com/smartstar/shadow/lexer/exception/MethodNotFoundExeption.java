package com.smartstar.shadow.lexer.exception;

public class MethodNotFoundExeption extends ParserExcepton {

    String method, file;

    public MethodNotFoundExeption(String method, String file) {
        this.method = method;
        this.file = file;
    }

    public String format() {
        return String.format("In class %s: Method %s not found in this scope", file, method);
    }
}
