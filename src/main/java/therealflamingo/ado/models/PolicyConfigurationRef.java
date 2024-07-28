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
 * Policy configuration reference.
 */
@ApiModel(description = "Policy configuration reference.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class PolicyConfigurationRef {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("type")
  private PolicyTypeRef type = null;

  @JsonProperty("url")
  private String url = null;

  public PolicyConfigurationRef id(Integer id) {
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

  public PolicyConfigurationRef type(PolicyTypeRef type) {
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

  public PolicyConfigurationRef url(String url) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyConfigurationRef policyConfigurationRef = (PolicyConfigurationRef) o;
    return Objects.equals(this.id, policyConfigurationRef.id) &&
            Objects.equals(this.type, policyConfigurationRef.type) &&
            Objects.equals(this.url, policyConfigurationRef.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyConfigurationRef {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

