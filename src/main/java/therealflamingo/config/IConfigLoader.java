package therealflamingo.config;

import therealflamingo.config.models.Config;

import java.io.IOException;

public interface IConfigLoader {
    Config load() throws IOException;
}
