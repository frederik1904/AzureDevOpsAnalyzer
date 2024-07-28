package therealflamingo.secrets;

import org.jetbrains.annotations.NotNull;
import org.linguafranca.pwdb.Database;
import org.linguafranca.pwdb.kdbx.KdbxCreds;
import org.linguafranca.pwdb.kdbx.simple.SimpleDatabase;
import org.linguafranca.pwdb.kdbx.simple.SimpleEntry;
import org.linguafranca.pwdb.kdbx.simple.SimpleGroup;
import org.linguafranca.pwdb.kdbx.simple.SimpleIcon;
import therealflamingo.config.models.Config;
import therealflamingo.secrets.exceptions.EntryDoesNotExistException;
import therealflamingo.secrets.exceptions.MultipleEntriesExistException;
import therealflamingo.secrets.models.SecretEntry;

import java.io.Console;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class KeePassSecretProvider implements ISecretProvider {
    Database<SimpleDatabase, SimpleGroup, SimpleEntry, SimpleIcon> database;

    public KeePassSecretProvider(Config config) throws IOException {
        String password = config.getKeePass().getPassword();

        if (password == null) {
            Console console = getConsole();

            password = Arrays.toString(console.readPassword("Enter your secret password: "));
        }

        KdbxCreds creds = new KdbxCreds(password.getBytes());
        InputStream inputStream = new FileInputStream(config.getKeePass().getPath());
        database = SimpleDatabase.load(creds, inputStream);
    }

    private static @NotNull Console getConsole() {
        Console console = System.console();
        if (console == null) {
            System.out.println("Couldn't get Console instance");
            System.exit(0);
        }
        return console;
    }


    @Override
    public SecretEntry getSecretEntry(String entryName) throws MultipleEntriesExistException, EntryDoesNotExistException {
        var entries = database.findEntries(entryName);
        if (entries == null || entries.isEmpty()) {
            throw new EntryDoesNotExistException(String.format("Entry [%s] does not exist in the KeePass kdbx file", entryName));
        }

        if (entries.size() != 1) {
            throw new MultipleEntriesExistException(String.format("Multiple entries found for entry [%s] exist in the KeePass kdbx file", entryName));
        }

        SimpleEntry entry = entries.getFirst();

        return new SecretEntry(entry.getUsername(), entry.getPassword());
    }
}
