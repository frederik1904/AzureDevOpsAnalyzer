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
 * Initial config contract sent to extensions creating tabs on the pull request page
 */
@ApiModel(description = "Initial config contract sent to extensions creating tabs on the pull request page")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class PullRequestTabExtensionConfig {
  @JsonProperty("pullRequestId")
  private Integer pullRequestId = null;

  @JsonProperty("repositoryId")
  private String repositoryId = null;

  public PullRequestTabExtensionConfig pullRequestId(Integer pullRequestId) {
    this.pullRequestId = pullRequestId;
    return this;
  }

  /**
   * Get pullRequestId
   *
   * @return pullRequestId
   **/
  @ApiModelProperty(value = "")
  public Integer getPullRequestId() {
    return pullRequestId;
  }

  public void setPullRequestId(Integer pullRequestId) {
    this.pullRequestId = pullRequestId;
  }

  public PullRequestTabExtensionConfig repositoryId(String repositoryId) {
    this.repositoryId = repositoryId;
    return this;
  }

  /**
   * Get repositoryId
   *
   * @return repositoryId
   **/
  @ApiModelProperty(value = "")
  public String getRepositoryId() {
    return repositoryId;
  }

  public void setRepositoryId(String repositoryId) {
    this.repositoryId = repositoryId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PullRequestTabExtensionConfig pullRequestTabExtensionConfig = (PullRequestTabExtensionConfig) o;
    return Objects.equals(this.pullRequestId, pullRequestTabExtensionConfig.pullRequestId) &&
            Objects.equals(this.repositoryId, pullRequestTabExtensionConfig.repositoryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pullRequestId, repositoryId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PullRequestTabExtensionConfig {\n");

    sb.append("    pullRequestId: ").append(toIndentedString(pullRequestId)).append("\n");
    sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
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

