package com.compropago.sdk.resources;

public class Resource<T> {

    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return this.t;
    }
}
