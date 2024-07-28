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
import java.util.UUID;

/**
 * Reference object for a TeamProjectCollection.
 */
@ApiModel(description = "Reference object for a TeamProjectCollection.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class TeamProjectCollectionReference {
  @JsonProperty("avatarUrl")
  private String avatarUrl = null;

  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("url")
  private String url = null;

  public TeamProjectCollectionReference avatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

   /**
   * Collection avatar Url.
   * @return avatarUrl
  **/
  @ApiModelProperty(value = "Collection avatar Url.")
  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public TeamProjectCollectionReference id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Collection Id.
   * @return id
  **/
  @ApiModelProperty(value = "Collection Id.")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public TeamProjectCollectionReference name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Collection Name.
   * @return name
  **/
  @ApiModelProperty(value = "Collection Name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TeamProjectCollectionReference url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Collection REST Url.
   * @return url
  **/
  @ApiModelProperty(value = "Collection REST Url.")
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
    TeamProjectCollectionReference teamProjectCollectionReference = (TeamProjectCollectionReference) o;
    return Objects.equals(this.avatarUrl, teamProjectCollectionReference.avatarUrl) &&
        Objects.equals(this.id, teamProjectCollectionReference.id) &&
        Objects.equals(this.name, teamProjectCollectionReference.name) &&
        Objects.equals(this.url, teamProjectCollectionReference.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarUrl, id, name, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamProjectCollectionReference {\n");
    
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

