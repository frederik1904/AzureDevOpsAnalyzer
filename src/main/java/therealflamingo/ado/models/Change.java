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
public class Change {
  @JsonProperty("changeType")
  private ChangeTypeEnum changeType = null;
  @JsonProperty("item")
  private String item = null;
  @JsonProperty("newContent")
  private ItemContent newContent = null;
  @JsonProperty("sourceServerItem")
  private String sourceServerItem = null;
  @JsonProperty("url")
  private String url = null;

  public Change changeType(ChangeTypeEnum changeType) {
    this.changeType = changeType;
    return this;
  }

  /**
   * The type of change that was made to the item.
   *
   * @return changeType
   **/
  @ApiModelProperty(value = "The type of change that was made to the item.")
  public GitPullRequestChange.ChangeTypeEnum getChangeType() {
    return changeType;
  }

  public void setChangeType(ChangeTypeEnum changeType) {
    this.changeType = changeType;
  }

  public Change item(String item) {
    this.item = item;
    return this;
  }

  /**
   * Current version.
   *
   * @return item
   **/
  @ApiModelProperty(value = "Current version.")
  public String getItem() {
    return item;
  }

  public void setItem(String item) {
    this.item = item;
  }

  public Change newContent(ItemContent newContent) {
    this.newContent = newContent;
    return this;
  }

  /**
   * Content of the item after the change.
   *
   * @return newContent
   **/
  @ApiModelProperty(value = "Content of the item after the change.")
  public ItemContent getNewContent() {
    return newContent;
  }

  public void setNewContent(ItemContent newContent) {
    this.newContent = newContent;
  }

  public Change sourceServerItem(String sourceServerItem) {
    this.sourceServerItem = sourceServerItem;
    return this;
  }

  /**
   * Path of the item on the server.
   *
   * @return sourceServerItem
   **/
  @ApiModelProperty(value = "Path of the item on the server.")
  public String getSourceServerItem() {
    return sourceServerItem;
  }

  public void setSourceServerItem(String sourceServerItem) {
    this.sourceServerItem = sourceServerItem;
  }

  public Change url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL to retrieve the item.
   *
   * @return url
   **/
  @ApiModelProperty(value = "URL to retrieve the item.")
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
    Change change = (Change) o;
    return Objects.equals(this.changeType, change.changeType) &&
            Objects.equals(this.item, change.item) &&
            Objects.equals(this.newContent, change.newContent) &&
            Objects.equals(this.sourceServerItem, change.sourceServerItem) &&
            Objects.equals(this.url, change.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changeType, item, newContent, sourceServerItem, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Change {\n");

    sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    newContent: ").append(toIndentedString(newContent)).append("\n");
    sb.append("    sourceServerItem: ").append(toIndentedString(sourceServerItem)).append("\n");
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
   * The type of change that was made to the item.
   */
  public enum ChangeTypeEnum {
    NONE("none"),

    ADD("add"),

    EDIT("edit"),

    ENCODING("encoding"),

    RENAME("rename"),

    DELETE("delete"),

    UNDELETE("undelete"),

    BRANCH("branch"),

    MERGE("merge"),

    LOCK("lock"),

    ROLLBACK("rollback"),

    SOURCERENAME("sourceRename"),

    TARGETRENAME("targetRename"),

    PROPERTY("property"),

    ALL("all");

    private String value;

    ChangeTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ChangeTypeEnum fromValue(String value) {
      for (ChangeTypeEnum b : ChangeTypeEnum.values()) {
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

