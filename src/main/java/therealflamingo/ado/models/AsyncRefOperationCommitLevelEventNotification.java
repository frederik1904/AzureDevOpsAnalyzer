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
 *
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class AsyncRefOperationCommitLevelEventNotification extends AsyncGitOperationNotification {
  @JsonProperty("operationId")
  private Integer operationId = null;

  @JsonProperty("commitId")
  private String commitId = null;

  public AsyncRefOperationCommitLevelEventNotification operationId(Integer operationId) {
    this.operationId = operationId;
    return this;
  }

  /**
   * Get operationId
   *
   * @return operationId
   **/
  @ApiModelProperty(value = "")
  public Integer getOperationId() {
    return operationId;
  }

  public void setOperationId(Integer operationId) {
    this.operationId = operationId;
  }

  public AsyncRefOperationCommitLevelEventNotification commitId(String commitId) {
    this.commitId = commitId;
    return this;
  }

  /**
   * Get commitId
   *
   * @return commitId
   **/
  @ApiModelProperty(value = "")
  public String getCommitId() {
    return commitId;
  }

  public void setCommitId(String commitId) {
    this.commitId = commitId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsyncRefOperationCommitLevelEventNotification asyncRefOperationCommitLevelEventNotification = (AsyncRefOperationCommitLevelEventNotification) o;
    return Objects.equals(this.operationId, asyncRefOperationCommitLevelEventNotification.operationId) &&
            Objects.equals(this.commitId, asyncRefOperationCommitLevelEventNotification.commitId) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationId, commitId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncRefOperationCommitLevelEventNotification {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
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

