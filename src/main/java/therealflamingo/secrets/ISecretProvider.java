package therealflamingo.secrets;

import therealflamingo.secrets.exceptions.EntryDoesNotExistException;
import therealflamingo.secrets.exceptions.MultipleEntriesExistException;
import therealflamingo.secrets.models.SecretEntry;

public interface ISecretProvider {
    SecretEntry getSecretEntry(String entryName) throws MultipleEntriesExistException, EntryDoesNotExistException;
}
