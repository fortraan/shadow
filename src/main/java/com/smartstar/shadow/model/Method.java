package com.smartstar.shadow.model;

import java.util.List;

public class Method {
    Scope scope;
    Variable.Type returnType;
    List<Component> components;

    public Variable run(Variable args[]) {
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
    }
}
