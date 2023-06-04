package com.blog.exceptions;

public class InvalidCredentialException extends RuntimeException {
    public InvalidCredentialException() {
        
    }

    public InvalidCredentialException(String message) {
        super(message);
    }
}
