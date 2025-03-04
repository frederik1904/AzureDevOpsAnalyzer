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

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class GitTreeRef {
  @JsonProperty("_links")
  private ReferenceLinks links = null;

  @JsonProperty("objectId")
  private String objectId = null;

  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("treeEntries")
  private List<GitTreeEntryRef> treeEntries = null;

  @JsonProperty("url")
  private String url = null;

  public GitTreeRef links(ReferenceLinks links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   *
   * @return links
   **/
  @ApiModelProperty(value = "")
  public ReferenceLinks getLinks() {
    return links;
  }

  public void setLinks(ReferenceLinks links) {
    this.links = links;
  }

  public GitTreeRef objectId(String objectId) {
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

  public GitTreeRef size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * Sum of sizes of all children
   *
   * @return size
   **/
  @ApiModelProperty(value = "Sum of sizes of all children")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public GitTreeRef treeEntries(List<GitTreeEntryRef> treeEntries) {
    this.treeEntries = treeEntries;
    return this;
  }

  public GitTreeRef addTreeEntriesItem(GitTreeEntryRef treeEntriesItem) {
    if (this.treeEntries == null) {
      this.treeEntries = new ArrayList<GitTreeEntryRef>();
    }
    this.treeEntries.add(treeEntriesItem);
    return this;
  }

  /**
   * Blobs and trees under this tree
   *
   * @return treeEntries
   **/
  @ApiModelProperty(value = "Blobs and trees under this tree")
  public List<GitTreeEntryRef> getTreeEntries() {
    return treeEntries;
  }

  public void setTreeEntries(List<GitTreeEntryRef> treeEntries) {
    this.treeEntries = treeEntries;
  }

  public GitTreeRef url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Url to tree
   *
   * @return url
   **/
  @ApiModelProperty(value = "Url to tree")
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
    GitTreeRef gitTreeRef = (GitTreeRef) o;
    return Objects.equals(this.links, gitTreeRef.links) &&
            Objects.equals(this.objectId, gitTreeRef.objectId) &&
            Objects.equals(this.size, gitTreeRef.size) &&
            Objects.equals(this.treeEntries, gitTreeRef.treeEntries) &&
            Objects.equals(this.url, gitTreeRef.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, objectId, size, treeEntries, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitTreeRef {\n");

    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    treeEntries: ").append(toIndentedString(treeEntries)).append("\n");
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

}

