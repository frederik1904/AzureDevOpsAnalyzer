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
 * Version descriptor properties.
 */
@ApiModel(description = "Version descriptor properties.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class TfvcVersionDescriptor {
    @JsonProperty("version")
    private String version = null;
    @JsonProperty("versionOption")
    private VersionOptionEnum versionOption = null;
    @JsonProperty("versionType")
    private VersionTypeEnum versionType = null;

    public TfvcVersionDescriptor version(String version) {
        this.version = version;
        return this;
    }

    /**
     * Version object.
     *
     * @return version
     **/
    @ApiModelProperty(value = "Version object.")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public TfvcVersionDescriptor versionOption(VersionOptionEnum versionOption) {
        this.versionOption = versionOption;
        return this;
    }

    /**
     * Get versionOption
     *
     * @return versionOption
     **/
    @ApiModelProperty(value = "")
    public VersionOptionEnum getVersionOption() {
        return versionOption;
    }

    public void setVersionOption(VersionOptionEnum versionOption) {
        this.versionOption = versionOption;
    }

    public TfvcVersionDescriptor versionType(VersionTypeEnum versionType) {
        this.versionType = versionType;
        return this;
    }

    /**
     * Get versionType
     *
     * @return versionType
     **/
    @ApiModelProperty(value = "")
    public VersionTypeEnum getVersionType() {
        return versionType;
    }

    public void setVersionType(VersionTypeEnum versionType) {
        this.versionType = versionType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TfvcVersionDescriptor tfvcVersionDescriptor = (TfvcVersionDescriptor) o;
        return Objects.equals(this.version, tfvcVersionDescriptor.version) &&
                Objects.equals(this.versionOption, tfvcVersionDescriptor.versionOption) &&
                Objects.equals(this.versionType, tfvcVersionDescriptor.versionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, versionOption, versionType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TfvcVersionDescriptor {\n");

        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    versionOption: ").append(toIndentedString(versionOption)).append("\n");
        sb.append("    versionType: ").append(toIndentedString(versionType)).append("\n");
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
     * Gets or Sets versionOption
     */
    public enum VersionOptionEnum {
        NONE("none"),

        PREVIOUS("previous"),

        USERENAME("useRename");

        private String value;

        VersionOptionEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static VersionOptionEnum fromValue(String value) {
            for (VersionOptionEnum b : VersionOptionEnum.values()) {
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

    /**
     * Gets or Sets versionType
     */
    public enum VersionTypeEnum {
        NONE("none"),

        CHANGESET("changeset"),

        SHELVESET("shelveset"),

        CHANGE("change"),

        DATE("date"),

        LATEST("latest"),

        TIP("tip"),

        MERGESOURCE("mergeSource");

        private String value;

        VersionTypeEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static VersionTypeEnum fromValue(String value) {
            for (VersionTypeEnum b : VersionTypeEnum.values()) {
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

