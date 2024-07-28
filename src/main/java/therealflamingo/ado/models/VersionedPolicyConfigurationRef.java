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

import java.util.Objects;

/**
 * A particular revision for a policy configuration.
 */
@ApiModel(description = "A particular revision for a policy configuration.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class VersionedPolicyConfigurationRef extends PolicyConfigurationRef {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("type")
  private PolicyTypeRef type = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("revision")
  private Integer revision = null;

  public VersionedPolicyConfigurationRef id(Integer id) {
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

  public VersionedPolicyConfigurationRef type(PolicyTypeRef type) {
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

  public VersionedPolicyConfigurationRef url(String url) {
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

  public VersionedPolicyConfigurationRef revision(Integer revision) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionedPolicyConfigurationRef versionedPolicyConfigurationRef = (VersionedPolicyConfigurationRef) o;
    return Objects.equals(this.id, versionedPolicyConfigurationRef.id) &&
            Objects.equals(this.type, versionedPolicyConfigurationRef.type) &&
            Objects.equals(this.url, versionedPolicyConfigurationRef.url) &&
            Objects.equals(this.revision, versionedPolicyConfigurationRef.revision) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, url, revision, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionedPolicyConfigurationRef {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
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

