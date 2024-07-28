package therealflamingo.config.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
public class Config {
    @JsonProperty("azureDevOps")
    private AzureDevOps azureDevOps;
    @JsonProperty("keePass")
    private KeePass keePass;

    public KeePass getKeePass() {
        return keePass;
    }

    public AzureDevOps getAzureDevOps() {
        return azureDevOps;
    }

    @Override
    public String toString() {
        return "config{" +
                "azureDevOps=" + azureDevOps +
                ", keePass=" + keePass +
                '}';
    }
}
