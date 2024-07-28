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
import org.threeten.bp.OffsetDateTime;
import therealflamingo.ado.models.GitBlobRef;
import therealflamingo.ado.models.GitCommitRef;
import therealflamingo.ado.models.GitConflict;
import therealflamingo.ado.models.GitMergeOriginRef;
import therealflamingo.ado.models.GitResolutionPickOneAction;
import therealflamingo.ado.models.IdentityRef;
import therealflamingo.ado.models.ReferenceLinks;

/**
 * Data object for DeleteRename conflict
 */
@ApiModel(description = "Data object for DeleteRename conflict")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class GitConflictRenameDelete extends GitConflict {
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

  @JsonProperty("resolution")
  private GitResolutionPickOneAction resolution = null;

  @JsonProperty("sourceBlob")
  private GitBlobRef sourceBlob = null;

  @JsonProperty("sourceNewPath")
  private String sourceNewPath = null;

  public GitConflictRenameDelete links(ReferenceLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public ReferenceLinks getLinks() {
    return links;
  }

  public void setLinks(ReferenceLinks links) {
    this.links = links;
  }

  public GitConflictRenameDelete conflictId(Integer conflictId) {
    this.conflictId = conflictId;
    return this;
  }

   /**
   * Get conflictId
   * @return conflictId
  **/
  @ApiModelProperty(value = "")
  public Integer getConflictId() {
    return conflictId;
  }

  public void setConflictId(Integer conflictId) {
    this.conflictId = conflictId;
  }

  public GitConflictRenameDelete conflictPath(String conflictPath) {
    this.conflictPath = conflictPath;
    return this;
  }

   /**
   * Get conflictPath
   * @return conflictPath
  **/
  @ApiModelProperty(value = "")
  public String getConflictPath() {
    return conflictPath;
  }

  public void setConflictPath(String conflictPath) {
    this.conflictPath = conflictPath;
  }

  public GitConflictRenameDelete mergeBaseCommit(GitCommitRef mergeBaseCommit) {
    this.mergeBaseCommit = mergeBaseCommit;
    return this;
  }

   /**
   * Get mergeBaseCommit
   * @return mergeBaseCommit
  **/
  @ApiModelProperty(value = "")
  public GitCommitRef getMergeBaseCommit() {
    return mergeBaseCommit;
  }

  public void setMergeBaseCommit(GitCommitRef mergeBaseCommit) {
    this.mergeBaseCommit = mergeBaseCommit;
  }

  public GitConflictRenameDelete mergeOrigin(GitMergeOriginRef mergeOrigin) {
    this.mergeOrigin = mergeOrigin;
    return this;
  }

   /**
   * Get mergeOrigin
   * @return mergeOrigin
  **/
  @ApiModelProperty(value = "")
  public GitMergeOriginRef getMergeOrigin() {
    return mergeOrigin;
  }

  public void setMergeOrigin(GitMergeOriginRef mergeOrigin) {
    this.mergeOrigin = mergeOrigin;
  }

  public GitConflictRenameDelete mergeSourceCommit(GitCommitRef mergeSourceCommit) {
    this.mergeSourceCommit = mergeSourceCommit;
    return this;
  }

   /**
   * Get mergeSourceCommit
   * @return mergeSourceCommit
  **/
  @ApiModelProperty(value = "")
  public GitCommitRef getMergeSourceCommit() {
    return mergeSourceCommit;
  }

  public void setMergeSourceCommit(GitCommitRef mergeSourceCommit) {
    this.mergeSourceCommit = mergeSourceCommit;
  }

  public GitConflictRenameDelete mergeTargetCommit(GitCommitRef mergeTargetCommit) {
    this.mergeTargetCommit = mergeTargetCommit;
    return this;
  }

   /**
   * Get mergeTargetCommit
   * @return mergeTargetCommit
  **/
  @ApiModelProperty(value = "")
  public GitCommitRef getMergeTargetCommit() {
    return mergeTargetCommit;
  }

  public void setMergeTargetCommit(GitCommitRef mergeTargetCommit) {
    this.mergeTargetCommit = mergeTargetCommit;
  }

  public GitConflictRenameDelete resolvedBy(IdentityRef resolvedBy) {
    this.resolvedBy = resolvedBy;
    return this;
  }

   /**
   * Get resolvedBy
   * @return resolvedBy
  **/
  @ApiModelProperty(value = "")
  public IdentityRef getResolvedBy() {
    return resolvedBy;
  }

  public void setResolvedBy(IdentityRef resolvedBy) {
    this.resolvedBy = resolvedBy;
  }

  public GitConflictRenameDelete resolvedDate(OffsetDateTime resolvedDate) {
    this.resolvedDate = resolvedDate;
    return this;
  }

   /**
   * Get resolvedDate
   * @return resolvedDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getResolvedDate() {
    return resolvedDate;
  }

  public void setResolvedDate(OffsetDateTime resolvedDate) {
    this.resolvedDate = resolvedDate;
  }

  public GitConflictRenameDelete url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public GitConflictRenameDelete baseBlob(GitBlobRef baseBlob) {
    this.baseBlob = baseBlob;
    return this;
  }

   /**
   * Get baseBlob
   * @return baseBlob
  **/
  @ApiModelProperty(value = "")
  public GitBlobRef getBaseBlob() {
    return baseBlob;
  }

  public void setBaseBlob(GitBlobRef baseBlob) {
    this.baseBlob = baseBlob;
  }

  public GitConflictRenameDelete resolution(GitResolutionPickOneAction resolution) {
    this.resolution = resolution;
    return this;
  }

   /**
   * Get resolution
   * @return resolution
  **/
  @ApiModelProperty(value = "")
  public GitResolutionPickOneAction getResolution() {
    return resolution;
  }

  public void setResolution(GitResolutionPickOneAction resolution) {
    this.resolution = resolution;
  }

  public GitConflictRenameDelete sourceBlob(GitBlobRef sourceBlob) {
    this.sourceBlob = sourceBlob;
    return this;
  }

   /**
   * Get sourceBlob
   * @return sourceBlob
  **/
  @ApiModelProperty(value = "")
  public GitBlobRef getSourceBlob() {
    return sourceBlob;
  }

  public void setSourceBlob(GitBlobRef sourceBlob) {
    this.sourceBlob = sourceBlob;
  }

  public GitConflictRenameDelete sourceNewPath(String sourceNewPath) {
    this.sourceNewPath = sourceNewPath;
    return this;
  }

   /**
   * Get sourceNewPath
   * @return sourceNewPath
  **/
  @ApiModelProperty(value = "")
  public String getSourceNewPath() {
    return sourceNewPath;
  }

  public void setSourceNewPath(String sourceNewPath) {
    this.sourceNewPath = sourceNewPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitConflictRenameDelete gitConflictRenameDelete = (GitConflictRenameDelete) o;
    return Objects.equals(this.links, gitConflictRenameDelete.links) &&
        Objects.equals(this.conflictId, gitConflictRenameDelete.conflictId) &&
        Objects.equals(this.conflictPath, gitConflictRenameDelete.conflictPath) &&
        Objects.equals(this.mergeBaseCommit, gitConflictRenameDelete.mergeBaseCommit) &&
        Objects.equals(this.mergeOrigin, gitConflictRenameDelete.mergeOrigin) &&
        Objects.equals(this.mergeSourceCommit, gitConflictRenameDelete.mergeSourceCommit) &&
        Objects.equals(this.mergeTargetCommit, gitConflictRenameDelete.mergeTargetCommit) &&
        Objects.equals(this.resolvedBy, gitConflictRenameDelete.resolvedBy) &&
        Objects.equals(this.resolvedDate, gitConflictRenameDelete.resolvedDate) &&
        Objects.equals(this.url, gitConflictRenameDelete.url) &&
        Objects.equals(this.baseBlob, gitConflictRenameDelete.baseBlob) &&
        Objects.equals(this.resolution, gitConflictRenameDelete.resolution) &&
        Objects.equals(this.sourceBlob, gitConflictRenameDelete.sourceBlob) &&
        Objects.equals(this.sourceNewPath, gitConflictRenameDelete.sourceNewPath) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, conflictId, conflictPath, mergeBaseCommit, mergeOrigin, mergeSourceCommit, mergeTargetCommit, resolvedBy, resolvedDate, url, baseBlob, resolution, sourceBlob, sourceNewPath, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitConflictRenameDelete {\n");
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
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    sourceBlob: ").append(toIndentedString(sourceBlob)).append("\n");
    sb.append("    sourceNewPath: ").append(toIndentedString(sourceNewPath)).append("\n");
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

