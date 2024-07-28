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
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class IncludedGitCommit {
  @JsonProperty("commitId")
  private String commitId = null;

  @JsonProperty("commitTime")
  private OffsetDateTime commitTime = null;

  @JsonProperty("parentCommitIds")
  private List<String> parentCommitIds = null;

  @JsonProperty("repositoryId")
  private UUID repositoryId = null;

  public IncludedGitCommit commitId(String commitId) {
    this.commitId = commitId;
    return this;
  }

   /**
   * Get commitId
   * @return commitId
  **/
  @ApiModelProperty(value = "")
  public String getCommitId() {
    return commitId;
  }

  public void setCommitId(String commitId) {
    this.commitId = commitId;
  }

  public IncludedGitCommit commitTime(OffsetDateTime commitTime) {
    this.commitTime = commitTime;
    return this;
  }

   /**
   * Get commitTime
   * @return commitTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCommitTime() {
    return commitTime;
  }

  public void setCommitTime(OffsetDateTime commitTime) {
    this.commitTime = commitTime;
  }

  public IncludedGitCommit parentCommitIds(List<String> parentCommitIds) {
    this.parentCommitIds = parentCommitIds;
    return this;
  }

  public IncludedGitCommit addParentCommitIdsItem(String parentCommitIdsItem) {
    if (this.parentCommitIds == null) {
      this.parentCommitIds = new ArrayList<String>();
    }
    this.parentCommitIds.add(parentCommitIdsItem);
    return this;
  }

   /**
   * Get parentCommitIds
   * @return parentCommitIds
  **/
  @ApiModelProperty(value = "")
  public List<String> getParentCommitIds() {
    return parentCommitIds;
  }

  public void setParentCommitIds(List<String> parentCommitIds) {
    this.parentCommitIds = parentCommitIds;
  }

  public IncludedGitCommit repositoryId(UUID repositoryId) {
    this.repositoryId = repositoryId;
    return this;
  }

   /**
   * Get repositoryId
   * @return repositoryId
  **/
  @ApiModelProperty(value = "")
  public UUID getRepositoryId() {
    return repositoryId;
  }

  public void setRepositoryId(UUID repositoryId) {
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
    IncludedGitCommit includedGitCommit = (IncludedGitCommit) o;
    return Objects.equals(this.commitId, includedGitCommit.commitId) &&
        Objects.equals(this.commitTime, includedGitCommit.commitTime) &&
        Objects.equals(this.parentCommitIds, includedGitCommit.parentCommitIds) &&
        Objects.equals(this.repositoryId, includedGitCommit.repositoryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commitId, commitTime, parentCommitIds, repositoryId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncludedGitCommit {\n");
    
    sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
    sb.append("    commitTime: ").append(toIndentedString(commitTime)).append("\n");
    sb.append("    parentCommitIds: ").append(toIndentedString(parentCommitIds)).append("\n");
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

