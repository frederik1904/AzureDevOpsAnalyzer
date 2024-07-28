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
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/**
 * Data object for RenameRename conflict
 */
@ApiModel(description = "Data object for RenameRename conflict")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class GitConflictRenameRename extends GitConflict {
  @JsonProperty("_links")
  private ReferenceLinks links = null;

  @JsonProperty("conflictId")
  private Integer conflictId = null;

  @JsonProperty("conflictPath")
  private String conflictPath = null;

  @JsonProperty("mergeBaseCommit")
  private GitCommitRef mergeBaseCommit = null;

  @JsonProperty("mergeOrigin")
  private GitMergeOriginRef mergeOrigin = null;

  @JsonProperty("mergeSourceCommit")
  private GitCommitRef mergeSourceCommit = null;

  @JsonProperty("mergeTargetCommit")
  private GitCommitRef mergeTargetCommit = null;

  @JsonProperty("resolvedBy")
  private IdentityRef resolvedBy = null;

  @JsonProperty("resolvedDate")
  private OffsetDateTime resolvedDate = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("baseBlob")
  private GitBlobRef baseBlob = null;

  @JsonProperty("originalPath")
  private String originalPath = null;

  @JsonProperty("resolution")
  private GitResolutionMergeContent resolution = null;

  @JsonProperty("sourceBlob")
  private GitBlobRef sourceBlob = null;

  @JsonProperty("targetBlob")
  private GitBlobRef targetBlob = null;

  public GitConflictRenameRename links(ReferenceLinks links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   *
   * @return links
   **/
  @ApiModelProperty(value = "")
  public ReferenceLinks getLinks() {
    return links;
  }

  public void setLinks(ReferenceLinks links) {
    this.links = links;
  }

  public GitConflictRenameRename conflictId(Integer conflictId) {
    this.conflictId = conflictId;
    return this;
  }

  /**
   * Get conflictId
   *
   * @return conflictId
   **/
  @ApiModelProperty(value = "")
  public Integer getConflictId() {
    return conflictId;
  }

  public void setConflictId(Integer conflictId) {
    this.conflictId = conflictId;
  }

  public GitConflictRenameRename conflictPath(String conflictPath) {
    this.conflictPath = conflictPath;
    return this;
  }

  /**
   * Get conflictPath
   *
   * @return conflictPath
   **/
  @ApiModelProperty(value = "")
  public String getConflictPath() {
    return conflictPath;
  }

  public void setConflictPath(String conflictPath) {
    this.conflictPath = conflictPath;
  }

  public GitConflictRenameRename mergeBaseCommit(GitCommitRef mergeBaseCommit) {
    this.mergeBaseCommit = mergeBaseCommit;
    return this;
  }

  /**
   * Get mergeBaseCommit
   *
   * @return mergeBaseCommit
   **/
  @ApiModelProperty(value = "")
  public GitCommitRef getMergeBaseCommit() {
    return mergeBaseCommit;
  }

  public void setMergeBaseCommit(GitCommitRef mergeBaseCommit) {
    this.mergeBaseCommit = mergeBaseCommit;
  }

  public GitConflictRenameRename mergeOrigin(GitMergeOriginRef mergeOrigin) {
    this.mergeOrigin = mergeOrigin;
    return this;
  }

  /**
   * Get mergeOrigin
   *
   * @return mergeOrigin
   **/
  @ApiModelProperty(value = "")
  public GitMergeOriginRef getMergeOrigin() {
    return mergeOrigin;
  }

  public void setMergeOrigin(GitMergeOriginRef mergeOrigin) {
    this.mergeOrigin = mergeOrigin;
  }

  public GitConflictRenameRename mergeSourceCommit(GitCommitRef mergeSourceCommit) {
    this.mergeSourceCommit = mergeSourceCommit;
    return this;
  }

  /**
   * Get mergeSourceCommit
   *
   * @return mergeSourceCommit
   **/
  @ApiModelProperty(value = "")
  public GitCommitRef getMergeSourceCommit() {
    return mergeSourceCommit;
  }

  public void setMergeSourceCommit(GitCommitRef mergeSourceCommit) {
    this.mergeSourceCommit = mergeSourceCommit;
  }

  public GitConflictRenameRename mergeTargetCommit(GitCommitRef mergeTargetCommit) {
    this.mergeTargetCommit = mergeTargetCommit;
    return this;
  }

  /**
   * Get mergeTargetCommit
   *
   * @return mergeTargetCommit
   **/
  @ApiModelProperty(value = "")
  public GitCommitRef getMergeTargetCommit() {
    return mergeTargetCommit;
  }

  public void setMergeTargetCommit(GitCommitRef mergeTargetCommit) {
    this.mergeTargetCommit = mergeTargetCommit;
  }

  public GitConflictRenameRename resolvedBy(IdentityRef resolvedBy) {
    this.resolvedBy = resolvedBy;
    return this;
  }

  /**
   * Get resolvedBy
   *
   * @return resolvedBy
   **/
  @ApiModelProperty(value = "")
  public IdentityRef getResolvedBy() {
    return resolvedBy;
  }

  public void setResolvedBy(IdentityRef resolvedBy) {
    this.resolvedBy = resolvedBy;
  }

  public GitConflictRenameRename resolvedDate(OffsetDateTime resolvedDate) {
    this.resolvedDate = resolvedDate;
    return this;
  }

  /**
   * Get resolvedDate
   *
   * @return resolvedDate
   **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getResolvedDate() {
    return resolvedDate;
  }

  public void setResolvedDate(OffsetDateTime resolvedDate) {
    this.resolvedDate = resolvedDate;
  }

  public GitConflictRenameRename url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   *
   * @return url
   **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public GitConflictRenameRename baseBlob(GitBlobRef baseBlob) {
    this.baseBlob = baseBlob;
    return this;
  }

  /**
   * Get baseBlob
   *
   * @return baseBlob
   **/
  @ApiModelProperty(value = "")
  public GitBlobRef getBaseBlob() {
    return baseBlob;
  }

  public void setBaseBlob(GitBlobRef baseBlob) {
    this.baseBlob = baseBlob;
  }

  public GitConflictRenameRename originalPath(String originalPath) {
    this.originalPath = originalPath;
    return this;
  }

  /**
   * Get originalPath
   *
   * @return originalPath
   **/
  @ApiModelProperty(value = "")
  public String getOriginalPath() {
    return originalPath;
  }

  public void setOriginalPath(String originalPath) {
    this.originalPath = originalPath;
  }

  public GitConflictRenameRename resolution(GitResolutionMergeContent resolution) {
    this.resolution = resolution;
    return this;
  }

  /**
   * Get resolution
   *
   * @return resolution
   **/
  @ApiModelProperty(value = "")
  public GitResolutionMergeContent getResolution() {
    return resolution;
  }

  public void setResolution(GitResolutionMergeContent resolution) {
    this.resolution = resolution;
  }

  public GitConflictRenameRename sourceBlob(GitBlobRef sourceBlob) {
    this.sourceBlob = sourceBlob;
    return this;
  }

  /**
   * Get sourceBlob
   *
   * @return sourceBlob
   **/
  @ApiModelProperty(value = "")
  public GitBlobRef getSourceBlob() {
    return sourceBlob;
  }

  public void setSourceBlob(GitBlobRef sourceBlob) {
    this.sourceBlob = sourceBlob;
  }

  public GitConflictRenameRename targetBlob(GitBlobRef targetBlob) {
    this.targetBlob = targetBlob;
    return this;
  }

  /**
   * Get targetBlob
   *
   * @return targetBlob
   **/
  @ApiModelProperty(value = "")
  public GitBlobRef getTargetBlob() {
    return targetBlob;
  }

  public void setTargetBlob(GitBlobRef targetBlob) {
    this.targetBlob = targetBlob;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitConflictRenameRename gitConflictRenameRename = (GitConflictRenameRename) o;
    return Objects.equals(this.links, gitConflictRenameRename.links) &&
            Objects.equals(this.conflictId, gitConflictRenameRename.conflictId) &&
            Objects.equals(this.conflictPath, gitConflictRenameRename.conflictPath) &&
            Objects.equals(this.mergeBaseCommit, gitConflictRenameRename.mergeBaseCommit) &&
            Objects.equals(this.mergeOrigin, gitConflictRenameRename.mergeOrigin) &&
            Objects.equals(this.mergeSourceCommit, gitConflictRenameRename.mergeSourceCommit) &&
            Objects.equals(this.mergeTargetCommit, gitConflictRenameRename.mergeTargetCommit) &&
            Objects.equals(this.resolvedBy, gitConflictRenameRename.resolvedBy) &&
            Objects.equals(this.resolvedDate, gitConflictRenameRename.resolvedDate) &&
            Objects.equals(this.url, gitConflictRenameRename.url) &&
            Objects.equals(this.baseBlob, gitConflictRenameRename.baseBlob) &&
            Objects.equals(this.originalPath, gitConflictRenameRename.originalPath) &&
            Objects.equals(this.resolution, gitConflictRenameRename.resolution) &&
            Objects.equals(this.sourceBlob, gitConflictRenameRename.sourceBlob) &&
            Objects.equals(this.targetBlob, gitConflictRenameRename.targetBlob) &&
            super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, conflictId, conflictPath, mergeBaseCommit, mergeOrigin, mergeSourceCommit, mergeTargetCommit, resolvedBy, resolvedDate, url, baseBlob, originalPath, resolution, sourceBlob, targetBlob, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitConflictRenameRename {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    conflictId: ").append(toIndentedString(conflictId)).append("\n");
    sb.append("    conflictPath: ").append(toIndentedString(conflictPath)).append("\n");
    sb.append("    mergeBaseCommit: ").append(toIndentedString(mergeBaseCommit)).append("\n");
    sb.append("    mergeOrigin: ").append(toIndentedString(mergeOrigin)).append("\n");
    sb.append("    mergeSourceCommit: ").append(toIndentedString(mergeSourceCommit)).append("\n");
    sb.append("    mergeTargetCommit: ").append(toIndentedString(mergeTargetCommit)).append("\n");
    sb.append("    resolvedBy: ").append(toIndentedString(resolvedBy)).append("\n");
    sb.append("    resolvedDate: ").append(toIndentedString(resolvedDate)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    baseBlob: ").append(toIndentedString(baseBlob)).append("\n");
    sb.append("    originalPath: ").append(toIndentedString(originalPath)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    sourceBlob: ").append(toIndentedString(sourceBlob)).append("\n");
    sb.append("    targetBlob: ").append(toIndentedString(targetBlob)).append("\n");
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

