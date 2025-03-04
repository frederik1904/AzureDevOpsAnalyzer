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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class GitQueryBranchStatsCriteria {
  @JsonProperty("baseCommit")
  private GitVersionDescriptor baseCommit = null;

  @JsonProperty("targetCommits")
  private List<GitVersionDescriptor> targetCommits = null;

  public GitQueryBranchStatsCriteria baseCommit(GitVersionDescriptor baseCommit) {
    this.baseCommit = baseCommit;
    return this;
  }

  /**
   * Get baseCommit
   *
   * @return baseCommit
   **/
  @ApiModelProperty(value = "")
  public GitVersionDescriptor getBaseCommit() {
    return baseCommit;
  }

  public void setBaseCommit(GitVersionDescriptor baseCommit) {
    this.baseCommit = baseCommit;
  }

  public GitQueryBranchStatsCriteria targetCommits(List<GitVersionDescriptor> targetCommits) {
    this.targetCommits = targetCommits;
    return this;
  }

  public GitQueryBranchStatsCriteria addTargetCommitsItem(GitVersionDescriptor targetCommitsItem) {
    if (this.targetCommits == null) {
      this.targetCommits = new ArrayList<GitVersionDescriptor>();
    }
    this.targetCommits.add(targetCommitsItem);
    return this;
  }

  /**
   * Get targetCommits
   *
   * @return targetCommits
   **/
  @ApiModelProperty(value = "")
  public List<GitVersionDescriptor> getTargetCommits() {
    return targetCommits;
  }

  public void setTargetCommits(List<GitVersionDescriptor> targetCommits) {
    this.targetCommits = targetCommits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitQueryBranchStatsCriteria gitQueryBranchStatsCriteria = (GitQueryBranchStatsCriteria) o;
    return Objects.equals(this.baseCommit, gitQueryBranchStatsCriteria.baseCommit) &&
            Objects.equals(this.targetCommits, gitQueryBranchStatsCriteria.targetCommits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseCommit, targetCommits);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitQueryBranchStatsCriteria {\n");

    sb.append("    baseCommit: ").append(toIndentedString(baseCommit)).append("\n");
    sb.append("    targetCommits: ").append(toIndentedString(targetCommits)).append("\n");
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

