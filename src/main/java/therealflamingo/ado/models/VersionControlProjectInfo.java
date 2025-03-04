/*
 * Git
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 7.2-preview
 * Contact: nugetvss@microsoft.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package therealflamingo.ado.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 *
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class VersionControlProjectInfo {
    @JsonProperty("defaultSourceControlType")
    private DefaultSourceControlTypeEnum defaultSourceControlType = null;
    @JsonProperty("project")
    private TeamProjectReference project = null;
    @JsonProperty("supportsGit")
    private Boolean supportsGit = null;
    @JsonProperty("supportsTFVC")
    private Boolean supportsTFVC = null;

    public VersionControlProjectInfo defaultSourceControlType(DefaultSourceControlTypeEnum defaultSourceControlType) {
        this.defaultSourceControlType = defaultSourceControlType;
        return this;
    }

    /**
     * Get defaultSourceControlType
     *
     * @return defaultSourceControlType
     **/
    @ApiModelProperty(value = "")
    public DefaultSourceControlTypeEnum getDefaultSourceControlType() {
        return defaultSourceControlType;
    }

    public void setDefaultSourceControlType(DefaultSourceControlTypeEnum defaultSourceControlType) {
        this.defaultSourceControlType = defaultSourceControlType;
    }

    public VersionControlProjectInfo project(TeamProjectReference project) {
        this.project = project;
        return this;
    }

    /**
     * Get project
     *
     * @return project
     **/
    @ApiModelProperty(value = "")
    public TeamProjectReference getProject() {
        return project;
    }

    public void setProject(TeamProjectReference project) {
        this.project = project;
    }

    public VersionControlProjectInfo supportsGit(Boolean supportsGit) {
        this.supportsGit = supportsGit;
        return this;
    }

    /**
     * Get supportsGit
     *
     * @return supportsGit
     **/
    @ApiModelProperty(value = "")
    public Boolean isSupportsGit() {
        return supportsGit;
    }

    public void setSupportsGit(Boolean supportsGit) {
        this.supportsGit = supportsGit;
    }

    public VersionControlProjectInfo supportsTFVC(Boolean supportsTFVC) {
        this.supportsTFVC = supportsTFVC;
        return this;
    }

    /**
     * Get supportsTFVC
     *
     * @return supportsTFVC
     **/
    @ApiModelProperty(value = "")
    public Boolean isSupportsTFVC() {
        return supportsTFVC;
    }

    public void setSupportsTFVC(Boolean supportsTFVC) {
        this.supportsTFVC = supportsTFVC;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VersionControlProjectInfo versionControlProjectInfo = (VersionControlProjectInfo) o;
        return Objects.equals(this.defaultSourceControlType, versionControlProjectInfo.defaultSourceControlType) &&
                Objects.equals(this.project, versionControlProjectInfo.project) &&
                Objects.equals(this.supportsGit, versionControlProjectInfo.supportsGit) &&
                Objects.equals(this.supportsTFVC, versionControlProjectInfo.supportsTFVC);
    }

    @Override
    public int hashCode() {
        return Objects.hash(defaultSourceControlType, project, supportsGit, supportsTFVC);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionControlProjectInfo {\n");

        sb.append("    defaultSourceControlType: ").append(toIndentedString(defaultSourceControlType)).append("\n");
        sb.append("    project: ").append(toIndentedString(project)).append("\n");
        sb.append("    supportsGit: ").append(toIndentedString(supportsGit)).append("\n");
        sb.append("    supportsTFVC: ").append(toIndentedString(supportsTFVC)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    /**
     * Gets or Sets defaultSourceControlType
     */
    public enum DefaultSourceControlTypeEnum {
        TFVC("tfvc"),

        GIT("git");

        private String value;

        DefaultSourceControlTypeEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static DefaultSourceControlTypeEnum fromValue(String value) {
            for (DefaultSourceControlTypeEnum b : DefaultSourceControlTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

}

