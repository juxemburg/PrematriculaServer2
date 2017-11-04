package com.aliance.services.Exceptions;

public class WebServiceException extends Exception {

    public WebServiceException(String message) {
        super(message);
    }

    public WebServiceException(String message, Throwable cause) {
        super(message, cause);
    }

}
