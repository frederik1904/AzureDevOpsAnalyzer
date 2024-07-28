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
import therealflamingo.ado.models.IdentityRef;
import therealflamingo.ado.models.ReferenceLinks;

/**
 * Metadata for a Label.
 */
@ApiModel(description = "Metadata for a Label.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class TfvcLabelRef {
  @JsonProperty("_links")
  private ReferenceLinks links = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("labelScope")
  private String labelScope = null;

  @JsonProperty("modifiedDate")
  private OffsetDateTime modifiedDate = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("owner")
  private IdentityRef owner = null;

  @JsonProperty("url")
  private String url = null;

  public TfvcLabelRef links(ReferenceLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Collection of reference links.
   * @return links
  **/
  @ApiModelProperty(value = "Collection of reference links.")
  public ReferenceLinks getLinks() {
    return links;
  }

  public void setLinks(ReferenceLinks links) {
    this.links = links;
  }

  public TfvcLabelRef description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Label description.
   * @return description
  **/
  @ApiModelProperty(value = "Label description.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TfvcLabelRef id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Label Id.
   * @return id
  **/
  @ApiModelProperty(value = "Label Id.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public TfvcLabelRef labelScope(String labelScope) {
    this.labelScope = labelScope;
    return this;
  }

   /**
   * Label scope.
   * @return labelScope
  **/
  @ApiModelProperty(value = "Label scope.")
  public String getLabelScope() {
    return labelScope;
  }

  public void setLabelScope(String labelScope) {
    this.labelScope = labelScope;
  }

  public TfvcLabelRef modifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }

   /**
   * Last modified datetime for the label.
   * @return modifiedDate
  **/
  @ApiModelProperty(value = "Last modified datetime for the label.")
  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }

  public void setModifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  public TfvcLabelRef name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Label name.
   * @return name
  **/
  @ApiModelProperty(value = "Label name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TfvcLabelRef owner(IdentityRef owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Label owner.
   * @return owner
  **/
  @ApiModelProperty(value = "Label owner.")
  public IdentityRef getOwner() {
    return owner;
  }

  public void setOwner(IdentityRef owner) {
    this.owner = owner;
  }

  public TfvcLabelRef url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Label Url.
   * @return url
  **/
  @ApiModelProperty(value = "Label Url.")
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
    TfvcLabelRef tfvcLabelRef = (TfvcLabelRef) o;
    return Objects.equals(this.links, tfvcLabelRef.links) &&
        Objects.equals(this.description, tfvcLabelRef.description) &&
        Objects.equals(this.id, tfvcLabelRef.id) &&
        Objects.equals(this.labelScope, tfvcLabelRef.labelScope) &&
        Objects.equals(this.modifiedDate, tfvcLabelRef.modifiedDate) &&
        Objects.equals(this.name, tfvcLabelRef.name) &&
        Objects.equals(this.owner, tfvcLabelRef.owner) &&
        Objects.equals(this.url, tfvcLabelRef.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, description, id, labelScope, modifiedDate, name, owner, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TfvcLabelRef {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    labelScope: ").append(toIndentedString(labelScope)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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

