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
import therealflamingo.ado.models.GitStatus;
import therealflamingo.ado.models.IdentityRef;
import therealflamingo.ado.models.ReferenceLinks;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class GitRef {
  @JsonProperty("_links")
  private ReferenceLinks links = null;

  @JsonProperty("creator")
  private IdentityRef creator = null;

  @JsonProperty("isLocked")
  private Boolean isLocked = null;

  @JsonProperty("isLockedBy")
  private IdentityRef isLockedBy = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("objectId")
  private String objectId = null;

  @JsonProperty("peeledObjectId")
  private String peeledObjectId = null;

  @JsonProperty("statuses")
  private List<GitStatus> statuses = null;

  @JsonProperty("url")
  private String url = null;

  public GitRef links(ReferenceLinks links) {
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

  public GitRef creator(IdentityRef creator) {
    this.creator = creator;
    return this;
  }

   /**
   * Get creator
   * @return creator
  **/
  @ApiModelProperty(value = "")
  public IdentityRef getCreator() {
    return creator;
  }

  public void setCreator(IdentityRef creator) {
    this.creator = creator;
  }

  public GitRef isLocked(Boolean isLocked) {
    this.isLocked = isLocked;
    return this;
  }

   /**
   * Get isLocked
   * @return isLocked
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsLocked() {
    return isLocked;
  }

  public void setIsLocked(Boolean isLocked) {
    this.isLocked = isLocked;
  }

  public GitRef isLockedBy(IdentityRef isLockedBy) {
    this.isLockedBy = isLockedBy;
    return this;
  }

   /**
   * Get isLockedBy
   * @return isLockedBy
  **/
  @ApiModelProperty(value = "")
  public IdentityRef getIsLockedBy() {
    return isLockedBy;
  }

  public void setIsLockedBy(IdentityRef isLockedBy) {
    this.isLockedBy = isLockedBy;
  }

  public GitRef name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GitRef objectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

   /**
   * Get objectId
   * @return objectId
  **/
  @ApiModelProperty(value = "")
  public String getObjectId() {
    return objectId;
  }

  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }

  public GitRef peeledObjectId(String peeledObjectId) {
    this.peeledObjectId = peeledObjectId;
    return this;
  }

   /**
   * Get peeledObjectId
   * @return peeledObjectId
  **/
  @ApiModelProperty(value = "")
  public String getPeeledObjectId() {
    return peeledObjectId;
  }

  public void setPeeledObjectId(String peeledObjectId) {
    this.peeledObjectId = peeledObjectId;
  }

  public GitRef statuses(List<GitStatus> statuses) {
    this.statuses = statuses;
    return this;
  }

  public GitRef addStatusesItem(GitStatus statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<GitStatus>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

   /**
   * Get statuses
   * @return statuses
  **/
  @ApiModelProperty(value = "")
  public List<GitStatus> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<GitStatus> statuses) {
    this.statuses = statuses;
  }

  public GitRef url(String url) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitRef gitRef = (GitRef) o;
    return Objects.equals(this.links, gitRef.links) &&
        Objects.equals(this.creator, gitRef.creator) &&
        Objects.equals(this.isLocked, gitRef.isLocked) &&
        Objects.equals(this.isLockedBy, gitRef.isLockedBy) &&
        Objects.equals(this.name, gitRef.name) &&
        Objects.equals(this.objectId, gitRef.objectId) &&
        Objects.equals(this.peeledObjectId, gitRef.peeledObjectId) &&
        Objects.equals(this.statuses, gitRef.statuses) &&
        Objects.equals(this.url, gitRef.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, creator, isLocked, isLockedBy, name, objectId, peeledObjectId, statuses, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitRef {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    isLocked: ").append(toIndentedString(isLocked)).append("\n");
    sb.append("    isLockedBy: ").append(toIndentedString(isLockedBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    peeledObjectId: ").append(toIndentedString(peeledObjectId)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
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

