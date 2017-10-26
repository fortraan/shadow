package com.smartstar.shadow.model;

import java.util.List;

public class Method {
    String name;
    Scope scope;
    Variable.Type returnType;
    List<Component> components;

    public Method(String name, Scope scope, Variable.Type returnType, List<Component> components) {
        this.name = name;
        this.scope = scope;
        this.returnType = returnType;
        this.components = components;
    }

    public Variable run(Variable args[]) {
        boolean errorEncountered = false;
        for (Variable arg : args) {
            scope.applyVariable(arg);
        }
        for (Component component : components) {
            if (component.isReturnStatement()) {
                return component.evaluate(scope);
            } else {
                component.evaluate(scope);
            }
        }
        Variable returnVar;
        if (returnType == Variable.Type.RESULT) {
            returnVar = new Variable(Variable.Type.BOOL, "__ret");
            returnVar.boolValue(!errorEncountered);
            return returnVar;
        }
        returnVar = new Variable(returnType, "__ret");
        return returnVar;
    }
}
