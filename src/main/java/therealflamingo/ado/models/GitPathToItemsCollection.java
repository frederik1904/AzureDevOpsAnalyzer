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

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 *
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class GitPathToItemsCollection {
  @JsonProperty("items")
  private Map<String, List<GitItem>> items = null;

  public GitPathToItemsCollection items(Map<String, List<GitItem>> items) {
    this.items = items;
    return this;
  }

  public GitPathToItemsCollection putItemsItem(String key, List<GitItem> itemsItem) {
    if (this.items == null) {
      this.items = new HashMap<String, List<GitItem>>();
    }
    this.items.put(key, itemsItem);
    return this;
  }

  /**
   * Get items
   *
   * @return items
   **/
  @ApiModelProperty(value = "")
  public Map<String, List<GitItem>> getItems() {
    return items;
  }

  public void setItems(Map<String, List<GitItem>> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitPathToItemsCollection gitPathToItemsCollection = (GitPathToItemsCollection) o;
    return Objects.equals(this.items, gitPathToItemsCollection.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitPathToItemsCollection {\n");

    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

