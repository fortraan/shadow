package com.smartstar.shadow.model;

import com.smartstar.shadow.lexer.exception.ProgramNotFoundException;

import java.util.List;

public class ShadowAssembly {
    List<Program> programs;

    public ShadowAssembly(List<Program> programs) {
        this.programs = programs;
    }

    public void run(String program, String method, Variable[] args) {
        for (Program prog : programs) {
            if (prog.name == program) {
                prog.callMethod(method, args);
            }
        }
        throw new ProgramNotFoundException(program);
    }
}
