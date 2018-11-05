package com.compropago.sdk.exceptions;

public class ResourceNotFoundException extends ClassNotFoundException {

    public ResourceNotFoundException() {
    }

    public ResourceNotFoundException(String s) {
        super(s);
    }

    public ResourceNotFoundException(String s, Throwable ex) {
        super(s, ex);
    }
}
