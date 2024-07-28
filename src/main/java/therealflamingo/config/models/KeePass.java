package therealflamingo.config.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
public class KeePass {
    @JsonProperty("path")
    private String path;
    @JsonProperty("password")
    private String password;

    public String getPath() {
        return path;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "KeePass{" +
                "path='" + path + '\'' +
                ", password=<REDACTED>" +
                '}';
    }
}
