package com.smartstar.shadow.model;

import com.smartstar.shadow.lexer.exception.MethodNotFoundExeption;

import java.util.List;

public class Program {

    public String name;
    public Namespace residentNamespace;
    public List<Namespace> requiredNamespaces;
    public Scope globalScope;
    public List<Method> methods;

    public Program(String name) {
        this.name = name;
    }

    public Program(String name, Namespace residentNamespace, List<Namespace> requiredNamespaces, Scope globalScope, List<Method> methods) {
        this.name = name;
        this.residentNamespace = residentNamespace;
        this.requiredNamespaces = requiredNamespaces;
        this.globalScope = globalScope;
        this.methods = methods;
    }

    public Variable callMethod(String name, Variable[] args) {
        for (Method method : methods) {
            if (method.name == name) {
                return method.run(args);
            }
        }
        throw new MethodNotFoundExeption(name, this.name);
    }

}
