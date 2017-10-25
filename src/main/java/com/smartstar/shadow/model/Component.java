package com.smartstar.shadow.model;

public interface Component {
    Variable evaluate(Scope parentScope);
    Variable.Type returnType();
    boolean isReturnStatement();
}
