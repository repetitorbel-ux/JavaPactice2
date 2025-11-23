package by.vadarod.practiceThemes15_16.Exception.exception;

public class NotCorrectPasswordException extends RuntimeException{
    public NotCorrectPasswordException(String message) {
        super(message);
    }
}
