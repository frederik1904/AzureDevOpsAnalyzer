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

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class VssJsonCollectionWrapperBase {
  @JsonProperty("count")
  private Integer count = null;

  public VssJsonCollectionWrapperBase count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * The number of serialized items.
   * @return count
  **/
  @ApiModelProperty(value = "The number of serialized items.")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VssJsonCollectionWrapperBase vssJsonCollectionWrapperBase = (VssJsonCollectionWrapperBase) o;
    return Objects.equals(this.count, vssJsonCollectionWrapperBase.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VssJsonCollectionWrapperBase {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

