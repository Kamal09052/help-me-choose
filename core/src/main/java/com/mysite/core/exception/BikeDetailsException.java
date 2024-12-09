package com.mysite.core.exception;

public class BikeDetailsException extends RuntimeException {
    public BikeDetailsException(String message){
        super(message);
    }

    public BikeDetailsException(String message , Throwable cause){
        super(message,cause);
    }
    public BikeDetailsException(String message, Throwable cause, String additionalInfo) {
        super(message + " - " + additionalInfo, cause);
    }

}
