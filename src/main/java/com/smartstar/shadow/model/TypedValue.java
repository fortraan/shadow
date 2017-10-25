package com.smartstar.shadow.model;

public class TypedValue<T> {
    public Class type;
    public T value;

    public TypedValue(T val) {
        value = val;
        type = val.getClass();
    }

    public <S> S cast(Class<S> type) {
        return type.cast(value);
    }

    public <V> void assign(V newVal, boolean weak) {
        if (weak) {
            type = newVal.getClass();

        } else {
            value = (T) type.cast(newVal);
        }
    }
}
