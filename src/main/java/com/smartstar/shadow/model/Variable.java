package com.smartstar.shadow.model;

public class Variable {
    public enum Type {
        VOID(void.class, Void.class),
        RESULT(boolean.class, Boolean.class),
        VAR(Variable.class, Variable.class),
        INT(int.class, Integer.class),
        FLOAT(float.class, Float.class),
        DOUBLE(double.class, Double.class),
        LONG(long.class, Long.class),
        BOOL(boolean.class, Boolean.class),
        STRING(String.class, String.class),
        COMPLEX(ComplexNumber.class, ComplexNumber.class);

        public Class type;
        public Class advanced;

        Type(Class t, Class a) {
            this.type = t;
            this.advanced = a;
        }
    }

    public boolean unsigned;

    private int intVal;
    private float floatVal;
    private double doubleVal;
    private long longVal;
    private boolean boolVal;
    private String stringVal;
    private ComplexNumber complexVal;

    public Type type;

    public String name;

    public Variable(Type type, String name) {
        this.type = type;
        this.name = name;
    }

    public void intValue(int val) {
        intVal = val;
    }

    public void floatValue(float val) {
        floatVal = val;
    }

    public void doubleValue(double val) {
        doubleVal = val;
    }

    public void longValue(long val) {
        longVal = val;
    }

    public void boolValue(boolean val) {
        boolVal = val;
    }

    public void stringValue(String val) {
        stringVal = val;
    }

    public void complexValue(ComplexNumber val) {
        complexVal = val;
    }

    public void value(TypedValue val) {
        if (type == Type.INT) {
            intVal = (int) val.value;
        } else if (type == Type.FLOAT) {
            floatVal = (float) val.value;
        } else if (val.type == Double.class) {
            doubleVal = (double) val.value;
        } else if (val.type == Long.class) {
            longVal = (long) val.value;
        } else if (val.type == Boolean.class) {
            boolVal = (boolean) val.value;
        } else if (val.type == String.class) {
            stringVal = (String) val.value;
        } else if (val.type == ComplexNumber.class) {
            complexVal = (ComplexNumber) val.value;
        }
    }

    public int intValue() {
        return intVal;
    }

    public float floatValue() {
        return floatVal;
    }

    public double doubleValue() {
        return doubleVal;
    }

    public long longValue() {
        return longVal;
    }

    public boolean boolValue() {
        return boolVal;
    }

    public String stringValue() {
        return stringVal;
    }

    public ComplexNumber complexValue() {
        return complexVal;
    }

    /*public <T> T tValue() {
        if (type == Type.INT) {
            return (T) intVal;
        } else if (type == Type.FLOAT) {
            floatVal = (float) val.value;
        } else if (val.type == Double.class) {
            doubleVal = (double) val.value;
        } else if (val.type == Long.class) {
            longVal = (long) val.value;
        } else if (val.type == Boolean.class) {
            boolVal = (boolean) val.value;
        } else if (val.type == String.class) {
            stringVal = (String) val.value;
        } else if (val.type == ComplexNumber.class) {
            complexVal = (ComplexNumber) val.value;
        }
    }*/
}
