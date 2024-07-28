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
import therealflamingo.ado.models.GitItemDescriptor;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class GitItemRequestData {
  @JsonProperty("includeContentMetadata")
  private Boolean includeContentMetadata = null;

  @JsonProperty("includeLinks")
  private Boolean includeLinks = null;

  @JsonProperty("itemDescriptors")
  private List<GitItemDescriptor> itemDescriptors = null;

  @JsonProperty("latestProcessedChange")
  private Boolean latestProcessedChange = null;

  public GitItemRequestData includeContentMetadata(Boolean includeContentMetadata) {
    this.includeContentMetadata = includeContentMetadata;
    return this;
  }

   /**
   * Whether to include metadata for all items
   * @return includeContentMetadata
  **/
  @ApiModelProperty(value = "Whether to include metadata for all items")
  public Boolean isIncludeContentMetadata() {
    return includeContentMetadata;
  }

  public void setIncludeContentMetadata(Boolean includeContentMetadata) {
    this.includeContentMetadata = includeContentMetadata;
  }

  public GitItemRequestData includeLinks(Boolean includeLinks) {
    this.includeLinks = includeLinks;
    return this;
  }

   /**
   * Whether to include the _links field on the shallow references
   * @return includeLinks
  **/
  @ApiModelProperty(value = "Whether to include the _links field on the shallow references")
  public Boolean isIncludeLinks() {
    return includeLinks;
  }

  public void setIncludeLinks(Boolean includeLinks) {
    this.includeLinks = includeLinks;
  }

  public GitItemRequestData itemDescriptors(List<GitItemDescriptor> itemDescriptors) {
    this.itemDescriptors = itemDescriptors;
    return this;
  }

  public GitItemRequestData addItemDescriptorsItem(GitItemDescriptor itemDescriptorsItem) {
    if (this.itemDescriptors == null) {
      this.itemDescriptors = new ArrayList<GitItemDescriptor>();
    }
    this.itemDescriptors.add(itemDescriptorsItem);
    return this;
  }

   /**
   * Collection of items to fetch, including path, version, and recursion level
   * @return itemDescriptors
  **/
  @ApiModelProperty(value = "Collection of items to fetch, including path, version, and recursion level")
  public List<GitItemDescriptor> getItemDescriptors() {
    return itemDescriptors;
  }

  public void setItemDescriptors(List<GitItemDescriptor> itemDescriptors) {
    this.itemDescriptors = itemDescriptors;
  }

  public GitItemRequestData latestProcessedChange(Boolean latestProcessedChange) {
    this.latestProcessedChange = latestProcessedChange;
    return this;
  }

   /**
   * Whether to include shallow ref to commit that last changed each item
   * @return latestProcessedChange
  **/
  @ApiModelProperty(value = "Whether to include shallow ref to commit that last changed each item")
  public Boolean isLatestProcessedChange() {
    return latestProcessedChange;
  }

  public void setLatestProcessedChange(Boolean latestProcessedChange) {
    this.latestProcessedChange = latestProcessedChange;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitItemRequestData gitItemRequestData = (GitItemRequestData) o;
    return Objects.equals(this.includeContentMetadata, gitItemRequestData.includeContentMetadata) &&
        Objects.equals(this.includeLinks, gitItemRequestData.includeLinks) &&
        Objects.equals(this.itemDescriptors, gitItemRequestData.itemDescriptors) &&
        Objects.equals(this.latestProcessedChange, gitItemRequestData.latestProcessedChange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeContentMetadata, includeLinks, itemDescriptors, latestProcessedChange);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitItemRequestData {\n");
    
    sb.append("    includeContentMetadata: ").append(toIndentedString(includeContentMetadata)).append("\n");
    sb.append("    includeLinks: ").append(toIndentedString(includeLinks)).append("\n");
    sb.append("    itemDescriptors: ").append(toIndentedString(itemDescriptors)).append("\n");
    sb.append("    latestProcessedChange: ").append(toIndentedString(latestProcessedChange)).append("\n");
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

