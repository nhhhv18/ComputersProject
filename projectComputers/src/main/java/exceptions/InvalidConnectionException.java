package exceptions;

public class InvalidConnectionException extends Exception {
    public InvalidConnectionException(String message) {
        super(message);
    }
}