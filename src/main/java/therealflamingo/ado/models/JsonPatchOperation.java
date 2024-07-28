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
 * The JSON model for a JSON Patch operation
 */
@ApiModel(description = "The JSON model for a JSON Patch operation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class JsonPatchOperation {
  @JsonProperty("from")
  private String from = null;

  /**
   * The patch operation
   */
  public enum OpEnum {
    ADD("add"),
    
    REMOVE("remove"),
    
    REPLACE("replace"),
    
    MOVE("move"),
    
    COPY("copy"),
    
    TEST("test");

    private String value;

    OpEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OpEnum fromValue(String value) {
      for (OpEnum b : OpEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("op")
  private OpEnum op = null;

  @JsonProperty("path")
  private String path = null;

  @JsonProperty("value")
  private Object value = null;

  public JsonPatchOperation from(String from) {
    this.from = from;
    return this;
  }

   /**
   * The path to copy from for the Move/Copy operation.
   * @return from
  **/
  @ApiModelProperty(value = "The path to copy from for the Move/Copy operation.")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public JsonPatchOperation op(OpEnum op) {
    this.op = op;
    return this;
  }

   /**
   * The patch operation
   * @return op
  **/
  @ApiModelProperty(value = "The patch operation")
  public OpEnum getOp() {
    return op;
  }

  public void setOp(OpEnum op) {
    this.op = op;
  }

  public JsonPatchOperation path(String path) {
    this.path = path;
    return this;
  }

   /**
   * The path for the operation. In the case of an array, a zero based index can be used to specify the position in the array (e.g. /biscuits/0/name). The \&quot;-\&quot; character can be used instead of an index to insert at the end of the array (e.g. /biscuits/-).
   * @return path
  **/
  @ApiModelProperty(value = "The path for the operation. In the case of an array, a zero based index can be used to specify the position in the array (e.g. /biscuits/0/name). The \"-\" character can be used instead of an index to insert at the end of the array (e.g. /biscuits/-).")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public JsonPatchOperation value(Object value) {
    this.value = value;
    return this;
  }

   /**
   * The value for the operation. This is either a primitive or a JToken.
   * @return value
  **/
  @ApiModelProperty(value = "The value for the operation. This is either a primitive or a JToken.")
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonPatchOperation jsonPatchOperation = (JsonPatchOperation) o;
    return Objects.equals(this.from, jsonPatchOperation.from) &&
        Objects.equals(this.op, jsonPatchOperation.op) &&
        Objects.equals(this.path, jsonPatchOperation.path) &&
        Objects.equals(this.value, jsonPatchOperation.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, op, path, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonPatchOperation {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

