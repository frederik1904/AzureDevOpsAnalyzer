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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * An object describing the git suggestion.  Git suggestions are currently limited to suggested pull requests.
 */
@ApiModel(description = "An object describing the git suggestion.  Git suggestions are currently limited to suggested pull requests.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class GitSuggestion {
  @JsonProperty("properties")
  private Map<String, Object> properties = null;

  @JsonProperty("type")
  private String type = null;

  public GitSuggestion properties(Map<String, Object> properties) {
    this.properties = properties;
    return this;
  }

  public GitSuggestion putPropertiesItem(String key, Object propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<String, Object>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * Specific properties describing the suggestion.
   * @return properties
  **/
  @ApiModelProperty(value = "Specific properties describing the suggestion.")
  public Map<String, Object> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, Object> properties) {
    this.properties = properties;
  }

  public GitSuggestion type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of suggestion (e.g. pull request).
   * @return type
  **/
  @ApiModelProperty(value = "The type of suggestion (e.g. pull request).")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitSuggestion gitSuggestion = (GitSuggestion) o;
    return Objects.equals(this.properties, gitSuggestion.properties) &&
        Objects.equals(this.type, gitSuggestion.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(properties, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitSuggestion {\n");
    
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

