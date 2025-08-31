package br.com.agend.me.core.exception;

public class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }

    public String getMessage(String message) {
        return message;
    }
}
