package therealflamingo.secrets.exceptions;

public class EntryDoesNotExistException extends Exception {
    public EntryDoesNotExistException(String errorMessage) {
        super(errorMessage);
    }
}
