package com.smartstar.shadow.model;

import java.util.List;

public class Scope {
    List<Variable> variables;
    List<Method> methods;

    public void addVariable(Variable var) {
        variables.add(var);
    }

    public void applyVariable(Variable var) {
        if (variables.contains(var)) {
            variables.remove(var);
            addVariable(var);
        } else {
            addVariable(var);
        }
    }

    public void removeVariable(Variable var) {
        variables.remove(var);
    }
}
