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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;

import java.util.*;

/**
 * Represents a comment thread of a pull request. A thread contains meta data about the file it was left on along with one or more comments (an initial comment and the subsequent replies).
 */
@ApiModel(description = "Represents a comment thread of a pull request. A thread contains meta data about the file it was left on along with one or more comments (an initial comment and the subsequent replies).")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class CommentThread {
  @JsonProperty("_links")
  private ReferenceLinks links = null;

  @JsonProperty("comments")
  private List<Comment> comments = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("identities")
  private Map<String, IdentityRef> identities = null;

  @JsonProperty("isDeleted")
  private Boolean isDeleted = null;

  @JsonProperty("lastUpdatedDate")
  private OffsetDateTime lastUpdatedDate = null;

  @JsonProperty("properties")
  private PropertiesCollection properties = null;

  @JsonProperty("publishedDate")
  private OffsetDateTime publishedDate = null;
  @JsonProperty("status")
  private StatusEnum status = null;
  @JsonProperty("threadContext")
  private CommentThreadContext threadContext = null;

  public CommentThread links(ReferenceLinks links) {
    this.links = links;
    return this;
  }

  /**
   * Links to other related objects.
   *
   * @return links
   **/
  @ApiModelProperty(value = "Links to other related objects.")
  public ReferenceLinks getLinks() {
    return links;
  }

  public void setLinks(ReferenceLinks links) {
    this.links = links;
  }

  public CommentThread comments(List<Comment> comments) {
    this.comments = comments;
    return this;
  }

  public CommentThread addCommentsItem(Comment commentsItem) {
    if (this.comments == null) {
      this.comments = new ArrayList<Comment>();
    }
    this.comments.add(commentsItem);
    return this;
  }

  /**
   * A list of the comments.
   *
   * @return comments
   **/
  @ApiModelProperty(value = "A list of the comments.")
  public List<Comment> getComments() {
    return comments;
  }

  public void setComments(List<Comment> comments) {
    this.comments = comments;
  }

  public CommentThread id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The comment thread id.
   *
   * @return id
   **/
  @ApiModelProperty(value = "The comment thread id.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CommentThread identities(Map<String, IdentityRef> identities) {
    this.identities = identities;
    return this;
  }

  public CommentThread putIdentitiesItem(String key, IdentityRef identitiesItem) {
    if (this.identities == null) {
      this.identities = new HashMap<String, IdentityRef>();
    }
    this.identities.put(key, identitiesItem);
    return this;
  }

  /**
   * Set of identities related to this thread
   *
   * @return identities
   **/
  @ApiModelProperty(value = "Set of identities related to this thread")
  public Map<String, IdentityRef> getIdentities() {
    return identities;
  }

  public void setIdentities(Map<String, IdentityRef> identities) {
    this.identities = identities;
  }

  public CommentThread isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * Specify if the thread is deleted which happens when all comments are deleted.
   *
   * @return isDeleted
   **/
  @ApiModelProperty(value = "Specify if the thread is deleted which happens when all comments are deleted.")
  public Boolean isIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  public CommentThread lastUpdatedDate(OffsetDateTime lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
    return this;
  }

  /**
   * The time this thread was last updated.
   *
   * @return lastUpdatedDate
   **/
  @ApiModelProperty(value = "The time this thread was last updated.")
  public OffsetDateTime getLastUpdatedDate() {
    return lastUpdatedDate;
  }

  public void setLastUpdatedDate(OffsetDateTime lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
  }

  public CommentThread properties(PropertiesCollection properties) {
    this.properties = properties;
    return this;
  }

  /**
   * Optional properties associated with the thread as a collection of key-value pairs.
   *
   * @return properties
   **/
  @ApiModelProperty(value = "Optional properties associated with the thread as a collection of key-value pairs.")
  public PropertiesCollection getProperties() {
    return properties;
  }

  public void setProperties(PropertiesCollection properties) {
    this.properties = properties;
  }

  public CommentThread publishedDate(OffsetDateTime publishedDate) {
    this.publishedDate = publishedDate;
    return this;
  }

  /**
   * The time this thread was published.
   *
   * @return publishedDate
   **/
  @ApiModelProperty(value = "The time this thread was published.")
  public OffsetDateTime getPublishedDate() {
    return publishedDate;
  }

  public void setPublishedDate(OffsetDateTime publishedDate) {
    this.publishedDate = publishedDate;
  }

  public CommentThread status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the comment thread.
   *
   * @return status
   **/
  @ApiModelProperty(value = "The status of the comment thread.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public CommentThread threadContext(CommentThreadContext threadContext) {
    this.threadContext = threadContext;
    return this;
  }

  /**
   * Specify thread context such as position in left/right file.
   *
   * @return threadContext
   **/
  @ApiModelProperty(value = "Specify thread context such as position in left/right file.")
  public CommentThreadContext getThreadContext() {
    return threadContext;
  }

  public void setThreadContext(CommentThreadContext threadContext) {
    this.threadContext = threadContext;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommentThread commentThread = (CommentThread) o;
    return Objects.equals(this.links, commentThread.links) &&
            Objects.equals(this.comments, commentThread.comments) &&
            Objects.equals(this.id, commentThread.id) &&
            Objects.equals(this.identities, commentThread.identities) &&
            Objects.equals(this.isDeleted, commentThread.isDeleted) &&
            Objects.equals(this.lastUpdatedDate, commentThread.lastUpdatedDate) &&
            Objects.equals(this.properties, commentThread.properties) &&
            Objects.equals(this.publishedDate, commentThread.publishedDate) &&
            Objects.equals(this.status, commentThread.status) &&
            Objects.equals(this.threadContext, commentThread.threadContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, comments, id, identities, isDeleted, lastUpdatedDate, properties, publishedDate, status, threadContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentThread {\n");

    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    identities: ").append(toIndentedString(identities)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    lastUpdatedDate: ").append(toIndentedString(lastUpdatedDate)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    publishedDate: ").append(toIndentedString(publishedDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    threadContext: ").append(toIndentedString(threadContext)).append("\n");
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

  /**
   * The status of the comment thread.
   */
  public enum StatusEnum {
    UNKNOWN("unknown"),

    ACTIVE("active"),

    FIXED("fixed"),

    WONTFIX("wontFix"),

    CLOSED("closed"),

    BYDESIGN("byDesign"),

    PENDING("pending");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

}

