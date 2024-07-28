package therealflamingo.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import therealflamingo.config.models.Config;

import java.io.File;
import java.io.IOException;

public class YamlConfigLoader implements IConfigLoader {

    @Override
    public Config load() throws IOException {
        var mapper = new ObjectMapper(new YAMLFactory());
        mapper.findAndRegisterModules();
        return mapper.readValue(new File("src/main/resources/config/config.yaml"), Config.class);
    }
}
