package com.smartstar.shadow.lexer;

import com.smartstar.shadow.model.Program;
import com.smartstar.shadow.model.ShadowAssembly;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lexer {

    ShadowAssembly assembly;

    Dictionary<Program, List<String>> lines;

    public void createProgram(String file, String code) {
        Program program = new Program(file);
        Pattern requires = Pattern.compile("requires ([a-zA-Z._]+);");
        Pattern classDeclaration = Pattern.compile("(open|closed|isolated) class ([a-zA-Z_]+)( ?< ?([a-zA-Z._]+))? ?\\{");
        Pattern variableDeclaration = Pattern.compile("(var|int|uint|float|ufloat|double|udouble|long|ulong|string|bool|complex) ([a-zA-Z_]+)( ?= ?(.+))?;");
        Pattern methodDeclaration = Pattern.compile("(open|closed|isolated) (var|int|uint|float|ufloat|double|udouble|long|ulong|string|bool|complex|void|result) ([a-zA-Z_]+)\\((.+)?\\) ?\\{");
        Matcher requiresMatcher = requires.matcher(code);
        List<String> requiredNamespaces = new ArrayList<>();
        for (int i = 0; i < ; i++) {
            
        }
    }

    public void interpret(String code[]) {

    }
}
