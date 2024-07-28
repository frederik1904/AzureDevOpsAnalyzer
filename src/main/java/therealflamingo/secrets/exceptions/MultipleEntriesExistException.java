package therealflamingo.secrets.exceptions;

public class MultipleEntriesExistException extends Exception {
    public MultipleEntriesExistException(String errorMessage) {
        super(errorMessage);
    }
}
