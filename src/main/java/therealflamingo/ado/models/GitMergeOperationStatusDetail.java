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
 * Status information about a requested merge operation.
 */
@ApiModel(description = "Status information about a requested merge operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class GitMergeOperationStatusDetail {
  @JsonProperty("failureMessage")
  private String failureMessage = null;

  @JsonProperty("mergeCommitId")
  private String mergeCommitId = null;

  public GitMergeOperationStatusDetail failureMessage(String failureMessage) {
    this.failureMessage = failureMessage;
    return this;
  }

  /**
   * Error message if the operation failed.
   *
   * @return failureMessage
   **/
  @ApiModelProperty(value = "Error message if the operation failed.")
  public String getFailureMessage() {
    return failureMessage;
  }

  public void setFailureMessage(String failureMessage) {
    this.failureMessage = failureMessage;
  }

  public GitMergeOperationStatusDetail mergeCommitId(String mergeCommitId) {
    this.mergeCommitId = mergeCommitId;
    return this;
  }

  /**
   * The commitId of the resultant merge commit.
   *
   * @return mergeCommitId
   **/
  @ApiModelProperty(value = "The commitId of the resultant merge commit.")
  public String getMergeCommitId() {
    return mergeCommitId;
  }

  public void setMergeCommitId(String mergeCommitId) {
    this.mergeCommitId = mergeCommitId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitMergeOperationStatusDetail gitMergeOperationStatusDetail = (GitMergeOperationStatusDetail) o;
    return Objects.equals(this.failureMessage, gitMergeOperationStatusDetail.failureMessage) &&
            Objects.equals(this.mergeCommitId, gitMergeOperationStatusDetail.mergeCommitId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failureMessage, mergeCommitId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitMergeOperationStatusDetail {\n");

    sb.append("    failureMessage: ").append(toIndentedString(failureMessage)).append("\n");
    sb.append("    mergeCommitId: ").append(toIndentedString(mergeCommitId)).append("\n");
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

