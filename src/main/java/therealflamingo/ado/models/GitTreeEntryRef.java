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
public class GitTreeEntryRef {
  @JsonProperty("gitObjectType")
  private GitObjectTypeEnum gitObjectType = null;
  @JsonProperty("mode")
  private String mode = null;
  @JsonProperty("objectId")
  private String objectId = null;
  @JsonProperty("relativePath")
  private String relativePath = null;
  @JsonProperty("size")
  private Long size = null;
  @JsonProperty("url")
  private String url = null;

  public GitTreeEntryRef gitObjectType(GitObjectTypeEnum gitObjectType) {
    this.gitObjectType = gitObjectType;
    return this;
  }

  /**
   * Blob or tree
   *
   * @return gitObjectType
   **/
  @ApiModelProperty(value = "Blob or tree")
  public GitObjectTypeEnum getGitObjectType() {
    return gitObjectType;
  }

  public void setGitObjectType(GitObjectTypeEnum gitObjectType) {
    this.gitObjectType = gitObjectType;
  }

  public GitTreeEntryRef mode(String mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Mode represented as octal string
   *
   * @return mode
   **/
  @ApiModelProperty(value = "Mode represented as octal string")
  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public GitTreeEntryRef objectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

  /**
   * SHA1 hash of git object
   *
   * @return objectId
   **/
  @ApiModelProperty(value = "SHA1 hash of git object")
  public String getObjectId() {
    return objectId;
  }

  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }

  public GitTreeEntryRef relativePath(String relativePath) {
    this.relativePath = relativePath;
    return this;
  }

  /**
   * Path relative to parent tree object
   *
   * @return relativePath
   **/
  @ApiModelProperty(value = "Path relative to parent tree object")
  public String getRelativePath() {
    return relativePath;
  }

  public void setRelativePath(String relativePath) {
    this.relativePath = relativePath;
  }

  public GitTreeEntryRef size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * Size of content
   *
   * @return size
   **/
  @ApiModelProperty(value = "Size of content")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public GitTreeEntryRef url(String url) {
    this.url = url;
    return this;
  }

  /**
   * url to retrieve tree or blob
   *
   * @return url
   **/
  @ApiModelProperty(value = "url to retrieve tree or blob")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitTreeEntryRef gitTreeEntryRef = (GitTreeEntryRef) o;
    return Objects.equals(this.gitObjectType, gitTreeEntryRef.gitObjectType) &&
            Objects.equals(this.mode, gitTreeEntryRef.mode) &&
            Objects.equals(this.objectId, gitTreeEntryRef.objectId) &&
            Objects.equals(this.relativePath, gitTreeEntryRef.relativePath) &&
            Objects.equals(this.size, gitTreeEntryRef.size) &&
            Objects.equals(this.url, gitTreeEntryRef.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gitObjectType, mode, objectId, relativePath, size, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitTreeEntryRef {\n");

    sb.append("    gitObjectType: ").append(toIndentedString(gitObjectType)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    relativePath: ").append(toIndentedString(relativePath)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
   * Blob or tree
   */
  public enum GitObjectTypeEnum {
    BAD("bad"),

    COMMIT("commit"),

    TREE("tree"),

    BLOB("blob"),

    TAG("tag"),

    EXT2("ext2"),

    OFSDELTA("ofsDelta"),

    REFDELTA("refDelta");

    private String value;

    GitObjectTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static GitObjectTypeEnum fromValue(String value) {
      for (GitObjectTypeEnum b : GitObjectTypeEnum.values()) {
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

