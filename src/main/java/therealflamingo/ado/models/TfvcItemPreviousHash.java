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
import org.threeten.bp.OffsetDateTime;
import therealflamingo.ado.models.FileContentMetadata;
import therealflamingo.ado.models.ReferenceLinks;
import therealflamingo.ado.models.TfvcItem;

/**
 * Metadata for an item including the previous hash value for files.
 */
@ApiModel(description = "Metadata for an item including the previous hash value for files.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class TfvcItemPreviousHash extends TfvcItem {
  @JsonProperty("changeDate")
  private OffsetDateTime changeDate = null;

  @JsonProperty("deletionId")
  private Integer deletionId = null;

  @JsonProperty("encoding")
  private Integer encoding = null;

  @JsonProperty("hashValue")
  private String hashValue = null;

  @JsonProperty("isBranch")
  private Boolean isBranch = null;

  @JsonProperty("isPendingChange")
  private Boolean isPendingChange = null;

  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("version")
  private Integer version = null;

  @JsonProperty("_links")
  private ReferenceLinks links = null;

  @JsonProperty("content")
  private String content = null;

  @JsonProperty("contentMetadata")
  private FileContentMetadata contentMetadata = null;

  @JsonProperty("isFolder")
  private Boolean isFolder = null;

  @JsonProperty("isSymLink")
  private Boolean isSymLink = null;

  @JsonProperty("path")
  private String path = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("previousHashValue")
  private String previousHashValue = null;

  public TfvcItemPreviousHash changeDate(OffsetDateTime changeDate) {
    this.changeDate = changeDate;
    return this;
  }

   /**
   * Item changed datetime.
   * @return changeDate
  **/
  @ApiModelProperty(value = "Item changed datetime.")
  public OffsetDateTime getChangeDate() {
    return changeDate;
  }

  public void setChangeDate(OffsetDateTime changeDate) {
    this.changeDate = changeDate;
  }

  public TfvcItemPreviousHash deletionId(Integer deletionId) {
    this.deletionId = deletionId;
    return this;
  }

   /**
   * Greater than 0 if item is deleted.
   * @return deletionId
  **/
  @ApiModelProperty(value = "Greater than 0 if item is deleted.")
  public Integer getDeletionId() {
    return deletionId;
  }

  public void setDeletionId(Integer deletionId) {
    this.deletionId = deletionId;
  }

  public TfvcItemPreviousHash encoding(Integer encoding) {
    this.encoding = encoding;
    return this;
  }

   /**
   * File encoding from database, -1 represents binary.
   * @return encoding
  **/
  @ApiModelProperty(value = "File encoding from database, -1 represents binary.")
  public Integer getEncoding() {
    return encoding;
  }

  public void setEncoding(Integer encoding) {
    this.encoding = encoding;
  }

  public TfvcItemPreviousHash hashValue(String hashValue) {
    this.hashValue = hashValue;
    return this;
  }

   /**
   * MD5 hash as a base 64 string, applies to files only.
   * @return hashValue
  **/
  @ApiModelProperty(value = "MD5 hash as a base 64 string, applies to files only.")
  public String getHashValue() {
    return hashValue;
  }

  public void setHashValue(String hashValue) {
    this.hashValue = hashValue;
  }

  public TfvcItemPreviousHash isBranch(Boolean isBranch) {
    this.isBranch = isBranch;
    return this;
  }

   /**
   * True if item is a branch.
   * @return isBranch
  **/
  @ApiModelProperty(value = "True if item is a branch.")
  public Boolean isIsBranch() {
    return isBranch;
  }

  public void setIsBranch(Boolean isBranch) {
    this.isBranch = isBranch;
  }

  public TfvcItemPreviousHash isPendingChange(Boolean isPendingChange) {
    this.isPendingChange = isPendingChange;
    return this;
  }

   /**
   * True if there is a change pending.
   * @return isPendingChange
  **/
  @ApiModelProperty(value = "True if there is a change pending.")
  public Boolean isIsPendingChange() {
    return isPendingChange;
  }

  public void setIsPendingChange(Boolean isPendingChange) {
    this.isPendingChange = isPendingChange;
  }

  public TfvcItemPreviousHash size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * The size of the file, if applicable.
   * @return size
  **/
  @ApiModelProperty(value = "The size of the file, if applicable.")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public TfvcItemPreviousHash version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Changeset version Id.
   * @return version
  **/
  @ApiModelProperty(value = "Changeset version Id.")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public TfvcItemPreviousHash links(ReferenceLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public ReferenceLinks getLinks() {
    return links;
  }

  public void setLinks(ReferenceLinks links) {
    this.links = links;
  }

  public TfvcItemPreviousHash content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(value = "")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public TfvcItemPreviousHash contentMetadata(FileContentMetadata contentMetadata) {
    this.contentMetadata = contentMetadata;
    return this;
  }

   /**
   * Get contentMetadata
   * @return contentMetadata
  **/
  @ApiModelProperty(value = "")
  public FileContentMetadata getContentMetadata() {
    return contentMetadata;
  }

  public void setContentMetadata(FileContentMetadata contentMetadata) {
    this.contentMetadata = contentMetadata;
  }

  public TfvcItemPreviousHash isFolder(Boolean isFolder) {
    this.isFolder = isFolder;
    return this;
  }

   /**
   * Get isFolder
   * @return isFolder
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsFolder() {
    return isFolder;
  }

  public void setIsFolder(Boolean isFolder) {
    this.isFolder = isFolder;
  }

  public TfvcItemPreviousHash isSymLink(Boolean isSymLink) {
    this.isSymLink = isSymLink;
    return this;
  }

   /**
   * Get isSymLink
   * @return isSymLink
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsSymLink() {
    return isSymLink;
  }

  public void setIsSymLink(Boolean isSymLink) {
    this.isSymLink = isSymLink;
  }

  public TfvcItemPreviousHash path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @ApiModelProperty(value = "")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public TfvcItemPreviousHash url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public TfvcItemPreviousHash previousHashValue(String previousHashValue) {
    this.previousHashValue = previousHashValue;
    return this;
  }

   /**
   * MD5 hash as a base 64 string, applies to files only.
   * @return previousHashValue
  **/
  @ApiModelProperty(value = "MD5 hash as a base 64 string, applies to files only.")
  public String getPreviousHashValue() {
    return previousHashValue;
  }

  public void setPreviousHashValue(String previousHashValue) {
    this.previousHashValue = previousHashValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TfvcItemPreviousHash tfvcItemPreviousHash = (TfvcItemPreviousHash) o;
    return Objects.equals(this.changeDate, tfvcItemPreviousHash.changeDate) &&
        Objects.equals(this.deletionId, tfvcItemPreviousHash.deletionId) &&
        Objects.equals(this.encoding, tfvcItemPreviousHash.encoding) &&
        Objects.equals(this.hashValue, tfvcItemPreviousHash.hashValue) &&
        Objects.equals(this.isBranch, tfvcItemPreviousHash.isBranch) &&
        Objects.equals(this.isPendingChange, tfvcItemPreviousHash.isPendingChange) &&
        Objects.equals(this.size, tfvcItemPreviousHash.size) &&
        Objects.equals(this.version, tfvcItemPreviousHash.version) &&
        Objects.equals(this.links, tfvcItemPreviousHash.links) &&
        Objects.equals(this.content, tfvcItemPreviousHash.content) &&
        Objects.equals(this.contentMetadata, tfvcItemPreviousHash.contentMetadata) &&
        Objects.equals(this.isFolder, tfvcItemPreviousHash.isFolder) &&
        Objects.equals(this.isSymLink, tfvcItemPreviousHash.isSymLink) &&
        Objects.equals(this.path, tfvcItemPreviousHash.path) &&
        Objects.equals(this.url, tfvcItemPreviousHash.url) &&
        Objects.equals(this.previousHashValue, tfvcItemPreviousHash.previousHashValue) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changeDate, deletionId, encoding, hashValue, isBranch, isPendingChange, size, version, links, content, contentMetadata, isFolder, isSymLink, path, url, previousHashValue, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TfvcItemPreviousHash {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    changeDate: ").append(toIndentedString(changeDate)).append("\n");
    sb.append("    deletionId: ").append(toIndentedString(deletionId)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    hashValue: ").append(toIndentedString(hashValue)).append("\n");
    sb.append("    isBranch: ").append(toIndentedString(isBranch)).append("\n");
    sb.append("    isPendingChange: ").append(toIndentedString(isPendingChange)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    contentMetadata: ").append(toIndentedString(contentMetadata)).append("\n");
    sb.append("    isFolder: ").append(toIndentedString(isFolder)).append("\n");
    sb.append("    isSymLink: ").append(toIndentedString(isSymLink)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    previousHashValue: ").append(toIndentedString(previousHashValue)).append("\n");
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

