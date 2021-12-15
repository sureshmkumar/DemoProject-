package com.example.Empolyee;

public class EmpolyeeNotFoundException extends RuntimeException {
    public EmpolyeeNotFoundException() {
        super();
    }

    public EmpolyeeNotFoundException(String message) {
        super(message);

    }

    public EmpolyeeNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmpolyeeNotFoundException(Throwable cause) {
        super(cause);
    }

    protected EmpolyeeNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
