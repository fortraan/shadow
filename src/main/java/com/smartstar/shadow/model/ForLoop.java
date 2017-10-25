package com.smartstar.shadow.model;

import java.util.List;

public class ForLoop implements Component {
    Scope scope;
    List<Component> components;
    String indexerName;
    Variable.Type indexerType;
    TypedValue<?> indexerValue;

    @Override
    public Variable evaluate(Scope parentScope) {
        scope = parentScope;
        Variable indexer = new Variable(indexerType, indexerName);
        indexer
        scope.addVariable();
        for (Component component : components) {

        }
    }

    @Override
    public Variable.Type returnType() {
        return Variable.Type.VOID;
    }

    @Override
    public boolean isReturnStatement() {
        for (Component component : components) {
            if (component.isReturnStatement()) {
                return true;
            }
        }
        return false;
    }
}
