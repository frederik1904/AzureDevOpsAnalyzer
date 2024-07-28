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

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import therealflamingo.ado.models.Change;
import therealflamingo.ado.models.ItemContent;
import therealflamingo.ado.models.TfvcMergeSource;

/**
 * A change.
 */
@ApiModel(description = "A change.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class TfvcChange extends Change {
  @JsonProperty("item")
  private String item = null;

  @JsonProperty("newContent")
  private ItemContent newContent = null;

  @JsonProperty("sourceServerItem")
  private String sourceServerItem = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("mergeSources")
  private List<TfvcMergeSource> mergeSources = null;

  @JsonProperty("pendingVersion")
  private Integer pendingVersion = null;

  public TfvcChange item(String item) {
    this.item = item;
    return this;
  }

   /**
   * Current version.
   * @return item
  **/
  @ApiModelProperty(value = "Current version.")
  public String getItem() {
    return item;
  }

  public void setItem(String item) {
    this.item = item;
  }

  public TfvcChange newContent(ItemContent newContent) {
    this.newContent = newContent;
    return this;
  }

   /**
   * Content of the item after the change.
   * @return newContent
  **/
  @ApiModelProperty(value = "Content of the item after the change.")
  public ItemContent getNewContent() {
    return newContent;
  }

  public void setNewContent(ItemContent newContent) {
    this.newContent = newContent;
  }

  public TfvcChange sourceServerItem(String sourceServerItem) {
    this.sourceServerItem = sourceServerItem;
    return this;
  }

   /**
   * Path of the item on the server.
   * @return sourceServerItem
  **/
  @ApiModelProperty(value = "Path of the item on the server.")
  public String getSourceServerItem() {
    return sourceServerItem;
  }

  public void setSourceServerItem(String sourceServerItem) {
    this.sourceServerItem = sourceServerItem;
  }

  public TfvcChange url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL to retrieve the item.
   * @return url
  **/
  @ApiModelProperty(value = "URL to retrieve the item.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public TfvcChange mergeSources(List<TfvcMergeSource> mergeSources) {
    this.mergeSources = mergeSources;
    return this;
  }

  public TfvcChange addMergeSourcesItem(TfvcMergeSource mergeSourcesItem) {
    if (this.mergeSources == null) {
      this.mergeSources = new ArrayList<TfvcMergeSource>();
    }
    this.mergeSources.add(mergeSourcesItem);
    return this;
  }

   /**
   * List of merge sources in case of rename or branch creation.
   * @return mergeSources
  **/
  @ApiModelProperty(value = "List of merge sources in case of rename or branch creation.")
  public List<TfvcMergeSource> getMergeSources() {
    return mergeSources;
  }

  public void setMergeSources(List<TfvcMergeSource> mergeSources) {
    this.mergeSources = mergeSources;
  }

  public TfvcChange pendingVersion(Integer pendingVersion) {
    this.pendingVersion = pendingVersion;
    return this;
  }

   /**
   * Version at which a (shelved) change was pended against
   * @return pendingVersion
  **/
  @ApiModelProperty(value = "Version at which a (shelved) change was pended against")
  public Integer getPendingVersion() {
    return pendingVersion;
  }

  public void setPendingVersion(Integer pendingVersion) {
    this.pendingVersion = pendingVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TfvcChange tfvcChange = (TfvcChange) o;
    return Objects.equals(this.item, tfvcChange.item) &&
        Objects.equals(this.newContent, tfvcChange.newContent) &&
        Objects.equals(this.sourceServerItem, tfvcChange.sourceServerItem) &&
        Objects.equals(this.url, tfvcChange.url) &&
        Objects.equals(this.mergeSources, tfvcChange.mergeSources) &&
        Objects.equals(this.pendingVersion, tfvcChange.pendingVersion) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(item, newContent, sourceServerItem, url, mergeSources, pendingVersion, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TfvcChange {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    newContent: ").append(toIndentedString(newContent)).append("\n");
    sb.append("    sourceServerItem: ").append(toIndentedString(sourceServerItem)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    mergeSources: ").append(toIndentedString(mergeSources)).append("\n");
    sb.append("    pendingVersion: ").append(toIndentedString(pendingVersion)).append("\n");
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

}

