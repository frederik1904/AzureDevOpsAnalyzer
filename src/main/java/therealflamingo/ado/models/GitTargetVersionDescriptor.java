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
public class GitTargetVersionDescriptor extends GitVersionDescriptor {
  @JsonProperty("version")
  private String version = null;

  @JsonProperty("targetVersion")
  private String targetVersion = null;
  @JsonProperty("targetVersionOptions")
  private TargetVersionOptionsEnum targetVersionOptions = null;
  @JsonProperty("targetVersionType")
  private TargetVersionTypeEnum targetVersionType = null;

  public GitTargetVersionDescriptor version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Version string identifier (name of tag/branch, SHA1 of commit)
   *
   * @return version
   **/
  @ApiModelProperty(value = "Version string identifier (name of tag/branch, SHA1 of commit)")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public GitTargetVersionDescriptor targetVersion(String targetVersion) {
    this.targetVersion = targetVersion;
    return this;
  }

  /**
   * Version string identifier (name of tag/branch, SHA1 of commit)
   *
   * @return targetVersion
   **/
  @ApiModelProperty(value = "Version string identifier (name of tag/branch, SHA1 of commit)")
  public String getTargetVersion() {
    return targetVersion;
  }

  public void setTargetVersion(String targetVersion) {
    this.targetVersion = targetVersion;
  }

  public GitTargetVersionDescriptor targetVersionOptions(TargetVersionOptionsEnum targetVersionOptions) {
    this.targetVersionOptions = targetVersionOptions;
    return this;
  }

  /**
   * Version options - Specify additional modifiers to version (e.g Previous)
   *
   * @return targetVersionOptions
   **/
  @ApiModelProperty(value = "Version options - Specify additional modifiers to version (e.g Previous)")
  public TargetVersionOptionsEnum getTargetVersionOptions() {
    return targetVersionOptions;
  }

  public void setTargetVersionOptions(TargetVersionOptionsEnum targetVersionOptions) {
    this.targetVersionOptions = targetVersionOptions;
  }

  public GitTargetVersionDescriptor targetVersionType(TargetVersionTypeEnum targetVersionType) {
    this.targetVersionType = targetVersionType;
    return this;
  }

  /**
   * Version type (branch, tag, or commit). Determines how Id is interpreted
   *
   * @return targetVersionType
   **/
  @ApiModelProperty(value = "Version type (branch, tag, or commit). Determines how Id is interpreted")
  public TargetVersionTypeEnum getTargetVersionType() {
    return targetVersionType;
  }

  public void setTargetVersionType(TargetVersionTypeEnum targetVersionType) {
    this.targetVersionType = targetVersionType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitTargetVersionDescriptor gitTargetVersionDescriptor = (GitTargetVersionDescriptor) o;
    return Objects.equals(this.version, gitTargetVersionDescriptor.version) &&
            Objects.equals(this.targetVersion, gitTargetVersionDescriptor.targetVersion) &&
            Objects.equals(this.targetVersionOptions, gitTargetVersionDescriptor.targetVersionOptions) &&
            Objects.equals(this.targetVersionType, gitTargetVersionDescriptor.targetVersionType) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, targetVersion, targetVersionOptions, targetVersionType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitTargetVersionDescriptor {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    targetVersion: ").append(toIndentedString(targetVersion)).append("\n");
    sb.append("    targetVersionOptions: ").append(toIndentedString(targetVersionOptions)).append("\n");
    sb.append("    targetVersionType: ").append(toIndentedString(targetVersionType)).append("\n");
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
   * Version options - Specify additional modifiers to version (e.g Previous)
   */
  public enum TargetVersionOptionsEnum {
    NONE("none"),

    PREVIOUSCHANGE("previousChange"),

    FIRSTPARENT("firstParent");

    private String value;

    TargetVersionOptionsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TargetVersionOptionsEnum fromValue(String value) {
      for (TargetVersionOptionsEnum b : TargetVersionOptionsEnum.values()) {
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
   * Version type (branch, tag, or commit). Determines how Id is interpreted
   */
  public enum TargetVersionTypeEnum {
    BRANCH("branch"),

    TAG("tag"),

    COMMIT("commit");

    private String value;

    TargetVersionTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TargetVersionTypeEnum fromValue(String value) {
      for (TargetVersionTypeEnum b : TargetVersionTypeEnum.values()) {
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

