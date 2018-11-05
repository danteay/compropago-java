package com.compropago.sdk.exceptions;

public class RequestValidationException extends Exception {

    private int code;

    public RequestValidationException(int code) {
        this.code = code;
    }

    public RequestValidationException(String message, int code) {
        super(message);
        this.code = code;
    }

    public RequestValidationException(String message, Throwable cause, int code) {
        super(message, cause);
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }
}
