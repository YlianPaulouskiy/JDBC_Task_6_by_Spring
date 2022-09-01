package edu.step.exrsise06.exception;

public class DateTimeMapperException extends RuntimeException {

    public DateTimeMapperException() {
        this("Fail convert String line to Date");
    }

    public DateTimeMapperException(String message) {
        super(message);
    }
}
