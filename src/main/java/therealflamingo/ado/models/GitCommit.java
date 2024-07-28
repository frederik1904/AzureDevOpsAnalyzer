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
import therealflamingo.ado.models.ChangeCountDictionary;
import therealflamingo.ado.models.GitChange;
import therealflamingo.ado.models.GitCommitRef;
import therealflamingo.ado.models.GitPushRef;
import therealflamingo.ado.models.GitStatus;
import therealflamingo.ado.models.GitUserDate;
import therealflamingo.ado.models.ReferenceLinks;
import therealflamingo.ado.models.ResourceRef;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class GitCommit extends GitCommitRef {
  @JsonProperty("_links")
  private ReferenceLinks links = null;

  @JsonProperty("author")
  private GitUserDate author = null;

  @JsonProperty("changeCounts")
  private ChangeCountDictionary changeCounts = null;

  @JsonProperty("changes")
  private List<GitChange> changes = null;

  @JsonProperty("comment")
  private String comment = null;

  @JsonProperty("commentTruncated")
  private Boolean commentTruncated = null;

  @JsonProperty("commitId")
  private String commitId = null;

  @JsonProperty("committer")
  private GitUserDate committer = null;

  @JsonProperty("commitTooManyChanges")
  private Boolean commitTooManyChanges = null;

  @JsonProperty("parents")
  private List<String> parents = null;

  @JsonProperty("push")
  private GitPushRef push = null;

  @JsonProperty("remoteUrl")
  private String remoteUrl = null;

  @JsonProperty("statuses")
  private List<GitStatus> statuses = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("workItems")
  private List<ResourceRef> workItems = null;

  @JsonProperty("treeId")
  private String treeId = null;

  public GitCommit links(ReferenceLinks links) {
    this.links = links;
    return this;
  }

   /**
   * A collection of related REST reference links.
   * @return links
  **/
  @ApiModelProperty(value = "A collection of related REST reference links.")
  public ReferenceLinks getLinks() {
    return links;
  }

  public void setLinks(ReferenceLinks links) {
    this.links = links;
  }

  public GitCommit author(GitUserDate author) {
    this.author = author;
    return this;
  }

   /**
   * Author of the commit.
   * @return author
  **/
  @ApiModelProperty(value = "Author of the commit.")
  public GitUserDate getAuthor() {
    return author;
  }

  public void setAuthor(GitUserDate author) {
    this.author = author;
  }

  public GitCommit changeCounts(ChangeCountDictionary changeCounts) {
    this.changeCounts = changeCounts;
    return this;
  }

   /**
   * Counts of the types of changes (edits, deletes, etc.) included with the commit.
   * @return changeCounts
  **/
  @ApiModelProperty(value = "Counts of the types of changes (edits, deletes, etc.) included with the commit.")
  public ChangeCountDictionary getChangeCounts() {
    return changeCounts;
  }

  public void setChangeCounts(ChangeCountDictionary changeCounts) {
    this.changeCounts = changeCounts;
  }

  public GitCommit changes(List<GitChange> changes) {
    this.changes = changes;
    return this;
  }

  public GitCommit addChangesItem(GitChange changesItem) {
    if (this.changes == null) {
      this.changes = new ArrayList<GitChange>();
    }
    this.changes.add(changesItem);
    return this;
  }

   /**
   * An enumeration of the changes included with the commit.
   * @return changes
  **/
  @ApiModelProperty(value = "An enumeration of the changes included with the commit.")
  public List<GitChange> getChanges() {
    return changes;
  }

  public void setChanges(List<GitChange> changes) {
    this.changes = changes;
  }

  public GitCommit comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Comment or message of the commit.
   * @return comment
  **/
  @ApiModelProperty(value = "Comment or message of the commit.")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public GitCommit commentTruncated(Boolean commentTruncated) {
    this.commentTruncated = commentTruncated;
    return this;
  }

   /**
   * Indicates if the comment is truncated from the full Git commit comment message.
   * @return commentTruncated
  **/
  @ApiModelProperty(value = "Indicates if the comment is truncated from the full Git commit comment message.")
  public Boolean isCommentTruncated() {
    return commentTruncated;
  }

  public void setCommentTruncated(Boolean commentTruncated) {
    this.commentTruncated = commentTruncated;
  }

  public GitCommit commitId(String commitId) {
    this.commitId = commitId;
    return this;
  }

   /**
   * ID (SHA-1) of the commit.
   * @return commitId
  **/
  @ApiModelProperty(value = "ID (SHA-1) of the commit.")
  public String getCommitId() {
    return commitId;
  }

  public void setCommitId(String commitId) {
    this.commitId = commitId;
  }

  public GitCommit committer(GitUserDate committer) {
    this.committer = committer;
    return this;
  }

   /**
   * Committer of the commit.
   * @return committer
  **/
  @ApiModelProperty(value = "Committer of the commit.")
  public GitUserDate getCommitter() {
    return committer;
  }

  public void setCommitter(GitUserDate committer) {
    this.committer = committer;
  }

  public GitCommit commitTooManyChanges(Boolean commitTooManyChanges) {
    this.commitTooManyChanges = commitTooManyChanges;
    return this;
  }

   /**
   * Indicates that commit contains too many changes to be displayed
   * @return commitTooManyChanges
  **/
  @ApiModelProperty(value = "Indicates that commit contains too many changes to be displayed")
  public Boolean isCommitTooManyChanges() {
    return commitTooManyChanges;
  }

  public void setCommitTooManyChanges(Boolean commitTooManyChanges) {
    this.commitTooManyChanges = commitTooManyChanges;
  }

  public GitCommit parents(List<String> parents) {
    this.parents = parents;
    return this;
  }

  public GitCommit addParentsItem(String parentsItem) {
    if (this.parents == null) {
      this.parents = new ArrayList<String>();
    }
    this.parents.add(parentsItem);
    return this;
  }

   /**
   * An enumeration of the parent commit IDs for this commit.
   * @return parents
  **/
  @ApiModelProperty(value = "An enumeration of the parent commit IDs for this commit.")
  public List<String> getParents() {
    return parents;
  }

  public void setParents(List<String> parents) {
    this.parents = parents;
  }

  public GitCommit push(GitPushRef push) {
    this.push = push;
    return this;
  }

   /**
   * The push associated with this commit.
   * @return push
  **/
  @ApiModelProperty(value = "The push associated with this commit.")
  public GitPushRef getPush() {
    return push;
  }

  public void setPush(GitPushRef push) {
    this.push = push;
  }

  public GitCommit remoteUrl(String remoteUrl) {
    this.remoteUrl = remoteUrl;
    return this;
  }

   /**
   * Remote URL path to the commit.
   * @return remoteUrl
  **/
  @ApiModelProperty(value = "Remote URL path to the commit.")
  public String getRemoteUrl() {
    return remoteUrl;
  }

  public void setRemoteUrl(String remoteUrl) {
    this.remoteUrl = remoteUrl;
  }

  public GitCommit statuses(List<GitStatus> statuses) {
    this.statuses = statuses;
    return this;
  }

  public GitCommit addStatusesItem(GitStatus statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<GitStatus>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

   /**
   * A list of status metadata from services and extensions that may associate additional information to the commit.
   * @return statuses
  **/
  @ApiModelProperty(value = "A list of status metadata from services and extensions that may associate additional information to the commit.")
  public List<GitStatus> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<GitStatus> statuses) {
    this.statuses = statuses;
  }

  public GitCommit url(String url) {
    this.url = url;
    return this;
  }

   /**
   * REST URL for this resource.
   * @return url
  **/
  @ApiModelProperty(value = "REST URL for this resource.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public GitCommit workItems(List<ResourceRef> workItems) {
    this.workItems = workItems;
    return this;
  }

  public GitCommit addWorkItemsItem(ResourceRef workItemsItem) {
    if (this.workItems == null) {
      this.workItems = new ArrayList<ResourceRef>();
    }
    this.workItems.add(workItemsItem);
    return this;
  }

   /**
   * A list of workitems associated with this commit.
   * @return workItems
  **/
  @ApiModelProperty(value = "A list of workitems associated with this commit.")
  public List<ResourceRef> getWorkItems() {
    return workItems;
  }

  public void setWorkItems(List<ResourceRef> workItems) {
    this.workItems = workItems;
  }

  public GitCommit treeId(String treeId) {
    this.treeId = treeId;
    return this;
  }

   /**
   * Get treeId
   * @return treeId
  **/
  @ApiModelProperty(value = "")
  public String getTreeId() {
    return treeId;
  }

  public void setTreeId(String treeId) {
    this.treeId = treeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitCommit gitCommit = (GitCommit) o;
    return Objects.equals(this.links, gitCommit.links) &&
        Objects.equals(this.author, gitCommit.author) &&
        Objects.equals(this.changeCounts, gitCommit.changeCounts) &&
        Objects.equals(this.changes, gitCommit.changes) &&
        Objects.equals(this.comment, gitCommit.comment) &&
        Objects.equals(this.commentTruncated, gitCommit.commentTruncated) &&
        Objects.equals(this.commitId, gitCommit.commitId) &&
        Objects.equals(this.committer, gitCommit.committer) &&
        Objects.equals(this.commitTooManyChanges, gitCommit.commitTooManyChanges) &&
        Objects.equals(this.parents, gitCommit.parents) &&
        Objects.equals(this.push, gitCommit.push) &&
        Objects.equals(this.remoteUrl, gitCommit.remoteUrl) &&
        Objects.equals(this.statuses, gitCommit.statuses) &&
        Objects.equals(this.url, gitCommit.url) &&
        Objects.equals(this.workItems, gitCommit.workItems) &&
        Objects.equals(this.treeId, gitCommit.treeId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, author, changeCounts, changes, comment, commentTruncated, commitId, committer, commitTooManyChanges, parents, push, remoteUrl, statuses, url, workItems, treeId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitCommit {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    changeCounts: ").append(toIndentedString(changeCounts)).append("\n");
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    commentTruncated: ").append(toIndentedString(commentTruncated)).append("\n");
    sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
    sb.append("    committer: ").append(toIndentedString(committer)).append("\n");
    sb.append("    commitTooManyChanges: ").append(toIndentedString(commitTooManyChanges)).append("\n");
    sb.append("    parents: ").append(toIndentedString(parents)).append("\n");
    sb.append("    push: ").append(toIndentedString(push)).append("\n");
    sb.append("    remoteUrl: ").append(toIndentedString(remoteUrl)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    workItems: ").append(toIndentedString(workItems)).append("\n");
    sb.append("    treeId: ").append(toIndentedString(treeId)).append("\n");
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

