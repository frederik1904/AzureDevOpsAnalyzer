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
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * The full policy configuration with settings.
 */
@ApiModel(description = "The full policy configuration with settings.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class PolicyConfiguration extends VersionedPolicyConfigurationRef {
  @JsonProperty("revision")
  private Integer revision = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("type")
  private PolicyTypeRef type = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("_links")
  private ReferenceLinks links = null;

  @JsonProperty("createdBy")
  private IdentityRef createdBy = null;

  @JsonProperty("createdDate")
  private OffsetDateTime createdDate = null;

  @JsonProperty("isBlocking")
  private Boolean isBlocking = null;

  @JsonProperty("isDeleted")
  private Boolean isDeleted = null;

  @JsonProperty("isEnabled")
  private Boolean isEnabled = null;

  @JsonProperty("isEnterpriseManaged")
  private Boolean isEnterpriseManaged = null;

  @JsonProperty("settings")
  private String settings = null;

  public PolicyConfiguration revision(Integer revision) {
    this.revision = revision;
    return this;
  }

  /**
   * The policy configuration revision ID.
   *
   * @return revision
   **/
  @ApiModelProperty(value = "The policy configuration revision ID.")
  public Integer getRevision() {
    return revision;
  }

  public void setRevision(Integer revision) {
    this.revision = revision;
  }

  public PolicyConfiguration id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The policy configuration ID.
   *
   * @return id
   **/
  @ApiModelProperty(value = "The policy configuration ID.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public PolicyConfiguration type(PolicyTypeRef type) {
    this.type = type;
    return this;
  }

  /**
   * The policy configuration type.
   *
   * @return type
   **/
  @ApiModelProperty(value = "The policy configuration type.")
  public PolicyTypeRef getType() {
    return type;
  }

  public void setType(PolicyTypeRef type) {
    this.type = type;
  }

  public PolicyConfiguration url(String url) {
    this.url = url;
    return this;
  }

  /**
   * The URL where the policy configuration can be retrieved.
   *
   * @return url
   **/
  @ApiModelProperty(value = "The URL where the policy configuration can be retrieved.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public PolicyConfiguration links(ReferenceLinks links) {
    this.links = links;
    return this;
  }

  /**
   * The links to other objects related to this object.
   *
   * @return links
   **/
  @ApiModelProperty(value = "The links to other objects related to this object.")
  public ReferenceLinks getLinks() {
    return links;
  }

  public void setLinks(ReferenceLinks links) {
    this.links = links;
  }

  public PolicyConfiguration createdBy(IdentityRef createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * A reference to the identity that created the policy.
   *
   * @return createdBy
   **/
  @ApiModelProperty(value = "A reference to the identity that created the policy.")
  public IdentityRef getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(IdentityRef createdBy) {
    this.createdBy = createdBy;
  }

  public PolicyConfiguration createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * The date and time when the policy was created.
   *
   * @return createdDate
   **/
  @ApiModelProperty(value = "The date and time when the policy was created.")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public PolicyConfiguration isBlocking(Boolean isBlocking) {
    this.isBlocking = isBlocking;
    return this;
  }

  /**
   * Indicates whether the policy is blocking.
   *
   * @return isBlocking
   **/
  @ApiModelProperty(value = "Indicates whether the policy is blocking.")
  public Boolean isIsBlocking() {
    return isBlocking;
  }

  public void setIsBlocking(Boolean isBlocking) {
    this.isBlocking = isBlocking;
  }

  public PolicyConfiguration isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * Indicates whether the policy has been (soft) deleted.
   *
   * @return isDeleted
   **/
  @ApiModelProperty(value = "Indicates whether the policy has been (soft) deleted.")
  public Boolean isIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  public PolicyConfiguration isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * Indicates whether the policy is enabled.
   *
   * @return isEnabled
   **/
  @ApiModelProperty(value = "Indicates whether the policy is enabled.")
  public Boolean isIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public PolicyConfiguration isEnterpriseManaged(Boolean isEnterpriseManaged) {
    this.isEnterpriseManaged = isEnterpriseManaged;
    return this;
  }

  /**
   * If set, this policy requires \&quot;Manage Enterprise Policies\&quot; permission to create, edit, or delete.
   *
   * @return isEnterpriseManaged
   **/
  @ApiModelProperty(value = "If set, this policy requires \"Manage Enterprise Policies\" permission to create, edit, or delete.")
  public Boolean isIsEnterpriseManaged() {
    return isEnterpriseManaged;
  }

  public void setIsEnterpriseManaged(Boolean isEnterpriseManaged) {
    this.isEnterpriseManaged = isEnterpriseManaged;
  }

  public PolicyConfiguration settings(String settings) {
    this.settings = settings;
    return this;
  }

  /**
   * The policy configuration settings.
   *
   * @return settings
   **/
  @ApiModelProperty(value = "The policy configuration settings.")
  public String getSettings() {
    return settings;
  }

  public void setSettings(String settings) {
    this.settings = settings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyConfiguration policyConfiguration = (PolicyConfiguration) o;
    return Objects.equals(this.revision, policyConfiguration.revision) &&
            Objects.equals(this.id, policyConfiguration.id) &&
            Objects.equals(this.type, policyConfiguration.type) &&
            Objects.equals(this.url, policyConfiguration.url) &&
            Objects.equals(this.links, policyConfiguration.links) &&
            Objects.equals(this.createdBy, policyConfiguration.createdBy) &&
            Objects.equals(this.createdDate, policyConfiguration.createdDate) &&
            Objects.equals(this.isBlocking, policyConfiguration.isBlocking) &&
            Objects.equals(this.isDeleted, policyConfiguration.isDeleted) &&
            Objects.equals(this.isEnabled, policyConfiguration.isEnabled) &&
            Objects.equals(this.isEnterpriseManaged, policyConfiguration.isEnterpriseManaged) &&
            Objects.equals(this.settings, policyConfiguration.settings) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(revision, id, type, url, links, createdBy, createdDate, isBlocking, isDeleted, isEnabled, isEnterpriseManaged, settings, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyConfiguration {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    isBlocking: ").append(toIndentedString(isBlocking)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    isEnterpriseManaged: ").append(toIndentedString(isEnterpriseManaged)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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

