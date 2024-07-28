package therealflamingo.config.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
public class AzureDevOps {
    @JsonProperty("keePassEntry")
    private String keePassEntry;
    @JsonProperty("organization")
    private String organization;
    @JsonProperty("baseUrl")
    private String baseUrl;
    @JsonProperty("repo")
    private String repo;
    @JsonProperty("project")
    private String project;

    public String getKeePassEntry() {
        return keePassEntry;
    }

    public String getOrganization() {
        return organization;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public String getRepo() {
        return repo;
    }

    public String getProject() {
        return project;
    }

    @Override
    public String toString() {
        return "AzureDevOps{" +
                "keePassEntry='" + keePassEntry + '\'' +
                ", organization='" + organization + '\'' +
                ", baseUrl='" + baseUrl + '\'' +
                ", repo='" + repo + '\'' +
                ", project='" + project + '\'' +
                '}';
    }
}
