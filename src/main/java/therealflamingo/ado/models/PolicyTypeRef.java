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
import java.util.UUID;

/**
 * Policy type reference.
 */
@ApiModel(description = "Policy type reference.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class PolicyTypeRef {
  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("url")
  private String url = null;

  public PolicyTypeRef displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Display name of the policy type.
   *
   * @return displayName
   **/
  @ApiModelProperty(value = "Display name of the policy type.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public PolicyTypeRef id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * The policy type ID.
   *
   * @return id
   **/
  @ApiModelProperty(value = "The policy type ID.")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public PolicyTypeRef url(String url) {
    this.url = url;
    return this;
  }

  /**
   * The URL where the policy type can be retrieved.
   *
   * @return url
   **/
  @ApiModelProperty(value = "The URL where the policy type can be retrieved.")
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
    PolicyTypeRef policyTypeRef = (PolicyTypeRef) o;
    return Objects.equals(this.displayName, policyTypeRef.displayName) &&
            Objects.equals(this.id, policyTypeRef.id) &&
            Objects.equals(this.url, policyTypeRef.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, id, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyTypeRef {\n");

    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

