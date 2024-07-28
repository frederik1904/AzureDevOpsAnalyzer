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
import therealflamingo.ado.models.GitVersionDescriptor;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class GitQueryCommitsCriteria {
  @JsonProperty("$skip")
  private Integer skip = null;

  @JsonProperty("$top")
  private Integer top = null;

  @JsonProperty("author")
  private String author = null;

  @JsonProperty("compareVersion")
  private GitVersionDescriptor compareVersion = null;

  @JsonProperty("excludeDeletes")
  private Boolean excludeDeletes = null;

  @JsonProperty("fromCommitId")
  private String fromCommitId = null;

  @JsonProperty("fromDate")
  private String fromDate = null;

  /**
   * What Git history mode should be used. This only applies to the search criteria when Ids &#x3D; null and an itemPath is specified.
   */
  public enum HistoryModeEnum {
    SIMPLIFIEDHISTORY("simplifiedHistory"),
    
    FIRSTPARENT("firstParent"),
    
    FULLHISTORY("fullHistory"),
    
    FULLHISTORYSIMPLIFYMERGES("fullHistorySimplifyMerges");

    private String value;

    HistoryModeEnum(String value) {
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
    public static HistoryModeEnum fromValue(String value) {
      for (HistoryModeEnum b : HistoryModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("historyMode")
  private HistoryModeEnum historyMode = null;

  @JsonProperty("ids")
  private List<String> ids = null;

  @JsonProperty("includeLinks")
  private Boolean includeLinks = null;

  @JsonProperty("includePushData")
  private Boolean includePushData = null;

  @JsonProperty("includeUserImageUrl")
  private Boolean includeUserImageUrl = null;

  @JsonProperty("includeWorkItems")
  private Boolean includeWorkItems = null;

  @JsonProperty("itemPath")
  private String itemPath = null;

  @JsonProperty("itemVersion")
  private GitVersionDescriptor itemVersion = null;

  @JsonProperty("showOldestCommitsFirst")
  private Boolean showOldestCommitsFirst = null;

  @JsonProperty("toCommitId")
  private String toCommitId = null;

  @JsonProperty("toDate")
  private String toDate = null;

  @JsonProperty("user")
  private String user = null;

  public GitQueryCommitsCriteria skip(Integer skip) {
    this.skip = skip;
    return this;
  }

   /**
   * Number of entries to skip
   * @return skip
  **/
  @ApiModelProperty(value = "Number of entries to skip")
  public Integer getSkip() {
    return skip;
  }

  public void setSkip(Integer skip) {
    this.skip = skip;
  }

  public GitQueryCommitsCriteria top(Integer top) {
    this.top = top;
    return this;
  }

   /**
   * Maximum number of entries to retrieve
   * @return top
  **/
  @ApiModelProperty(value = "Maximum number of entries to retrieve")
  public Integer getTop() {
    return top;
  }

  public void setTop(Integer top) {
    this.top = top;
  }

  public GitQueryCommitsCriteria author(String author) {
    this.author = author;
    return this;
  }

   /**
   * Alias or display name of the author
   * @return author
  **/
  @ApiModelProperty(value = "Alias or display name of the author")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public GitQueryCommitsCriteria compareVersion(GitVersionDescriptor compareVersion) {
    this.compareVersion = compareVersion;
    return this;
  }

   /**
   * Only applicable when ItemVersion specified. If provided, start walking history starting at this commit.
   * @return compareVersion
  **/
  @ApiModelProperty(value = "Only applicable when ItemVersion specified. If provided, start walking history starting at this commit.")
  public GitVersionDescriptor getCompareVersion() {
    return compareVersion;
  }

  public void setCompareVersion(GitVersionDescriptor compareVersion) {
    this.compareVersion = compareVersion;
  }

  public GitQueryCommitsCriteria excludeDeletes(Boolean excludeDeletes) {
    this.excludeDeletes = excludeDeletes;
    return this;
  }

   /**
   * Only applies when an itemPath is specified. This determines whether to exclude delete entries of the specified path.
   * @return excludeDeletes
  **/
  @ApiModelProperty(value = "Only applies when an itemPath is specified. This determines whether to exclude delete entries of the specified path.")
  public Boolean isExcludeDeletes() {
    return excludeDeletes;
  }

  public void setExcludeDeletes(Boolean excludeDeletes) {
    this.excludeDeletes = excludeDeletes;
  }

  public GitQueryCommitsCriteria fromCommitId(String fromCommitId) {
    this.fromCommitId = fromCommitId;
    return this;
  }

   /**
   * If provided, a lower bound for filtering commits alphabetically
   * @return fromCommitId
  **/
  @ApiModelProperty(value = "If provided, a lower bound for filtering commits alphabetically")
  public String getFromCommitId() {
    return fromCommitId;
  }

  public void setFromCommitId(String fromCommitId) {
    this.fromCommitId = fromCommitId;
  }

  public GitQueryCommitsCriteria fromDate(String fromDate) {
    this.fromDate = fromDate;
    return this;
  }

   /**
   * If provided, only include history entries created after this date (string)
   * @return fromDate
  **/
  @ApiModelProperty(value = "If provided, only include history entries created after this date (string)")
  public String getFromDate() {
    return fromDate;
  }

  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }

  public GitQueryCommitsCriteria historyMode(HistoryModeEnum historyMode) {
    this.historyMode = historyMode;
    return this;
  }

   /**
   * What Git history mode should be used. This only applies to the search criteria when Ids &#x3D; null and an itemPath is specified.
   * @return historyMode
  **/
  @ApiModelProperty(value = "What Git history mode should be used. This only applies to the search criteria when Ids = null and an itemPath is specified.")
  public HistoryModeEnum getHistoryMode() {
    return historyMode;
  }

  public void setHistoryMode(HistoryModeEnum historyMode) {
    this.historyMode = historyMode;
  }

  public GitQueryCommitsCriteria ids(List<String> ids) {
    this.ids = ids;
    return this;
  }

  public GitQueryCommitsCriteria addIdsItem(String idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<String>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * If provided, specifies the exact commit ids of the commits to fetch. May not be combined with other parameters.
   * @return ids
  **/
  @ApiModelProperty(value = "If provided, specifies the exact commit ids of the commits to fetch. May not be combined with other parameters.")
  public List<String> getIds() {
    return ids;
  }

  public void setIds(List<String> ids) {
    this.ids = ids;
  }

  public GitQueryCommitsCriteria includeLinks(Boolean includeLinks) {
    this.includeLinks = includeLinks;
    return this;
  }

   /**
   * Whether to include the _links field on the shallow references
   * @return includeLinks
  **/
  @ApiModelProperty(value = "Whether to include the _links field on the shallow references")
  public Boolean isIncludeLinks() {
    return includeLinks;
  }

  public void setIncludeLinks(Boolean includeLinks) {
    this.includeLinks = includeLinks;
  }

  public GitQueryCommitsCriteria includePushData(Boolean includePushData) {
    this.includePushData = includePushData;
    return this;
  }

   /**
   * Whether to include the push information
   * @return includePushData
  **/
  @ApiModelProperty(value = "Whether to include the push information")
  public Boolean isIncludePushData() {
    return includePushData;
  }

  public void setIncludePushData(Boolean includePushData) {
    this.includePushData = includePushData;
  }

  public GitQueryCommitsCriteria includeUserImageUrl(Boolean includeUserImageUrl) {
    this.includeUserImageUrl = includeUserImageUrl;
    return this;
  }

   /**
   * Whether to include the image Url for committers and authors
   * @return includeUserImageUrl
  **/
  @ApiModelProperty(value = "Whether to include the image Url for committers and authors")
  public Boolean isIncludeUserImageUrl() {
    return includeUserImageUrl;
  }

  public void setIncludeUserImageUrl(Boolean includeUserImageUrl) {
    this.includeUserImageUrl = includeUserImageUrl;
  }

  public GitQueryCommitsCriteria includeWorkItems(Boolean includeWorkItems) {
    this.includeWorkItems = includeWorkItems;
    return this;
  }

   /**
   * Whether to include linked work items
   * @return includeWorkItems
  **/
  @ApiModelProperty(value = "Whether to include linked work items")
  public Boolean isIncludeWorkItems() {
    return includeWorkItems;
  }

  public void setIncludeWorkItems(Boolean includeWorkItems) {
    this.includeWorkItems = includeWorkItems;
  }

  public GitQueryCommitsCriteria itemPath(String itemPath) {
    this.itemPath = itemPath;
    return this;
  }

   /**
   * Path of item to search under
   * @return itemPath
  **/
  @ApiModelProperty(value = "Path of item to search under")
  public String getItemPath() {
    return itemPath;
  }

  public void setItemPath(String itemPath) {
    this.itemPath = itemPath;
  }

  public GitQueryCommitsCriteria itemVersion(GitVersionDescriptor itemVersion) {
    this.itemVersion = itemVersion;
    return this;
  }

   /**
   * If provided, identifies the commit or branch to search
   * @return itemVersion
  **/
  @ApiModelProperty(value = "If provided, identifies the commit or branch to search")
  public GitVersionDescriptor getItemVersion() {
    return itemVersion;
  }

  public void setItemVersion(GitVersionDescriptor itemVersion) {
    this.itemVersion = itemVersion;
  }

  public GitQueryCommitsCriteria showOldestCommitsFirst(Boolean showOldestCommitsFirst) {
    this.showOldestCommitsFirst = showOldestCommitsFirst;
    return this;
  }

   /**
   * If enabled, this option will ignore the itemVersion and compareVersion parameters
   * @return showOldestCommitsFirst
  **/
  @ApiModelProperty(value = "If enabled, this option will ignore the itemVersion and compareVersion parameters")
  public Boolean isShowOldestCommitsFirst() {
    return showOldestCommitsFirst;
  }

  public void setShowOldestCommitsFirst(Boolean showOldestCommitsFirst) {
    this.showOldestCommitsFirst = showOldestCommitsFirst;
  }

  public GitQueryCommitsCriteria toCommitId(String toCommitId) {
    this.toCommitId = toCommitId;
    return this;
  }

   /**
   * If provided, an upper bound for filtering commits alphabetically
   * @return toCommitId
  **/
  @ApiModelProperty(value = "If provided, an upper bound for filtering commits alphabetically")
  public String getToCommitId() {
    return toCommitId;
  }

  public void setToCommitId(String toCommitId) {
    this.toCommitId = toCommitId;
  }

  public GitQueryCommitsCriteria toDate(String toDate) {
    this.toDate = toDate;
    return this;
  }

   /**
   * If provided, only include history entries created before this date (string)
   * @return toDate
  **/
  @ApiModelProperty(value = "If provided, only include history entries created before this date (string)")
  public String getToDate() {
    return toDate;
  }

  public void setToDate(String toDate) {
    this.toDate = toDate;
  }

  public GitQueryCommitsCriteria user(String user) {
    this.user = user;
    return this;
  }

   /**
   * Alias or display name of the committer
   * @return user
  **/
  @ApiModelProperty(value = "Alias or display name of the committer")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitQueryCommitsCriteria gitQueryCommitsCriteria = (GitQueryCommitsCriteria) o;
    return Objects.equals(this.skip, gitQueryCommitsCriteria.skip) &&
        Objects.equals(this.top, gitQueryCommitsCriteria.top) &&
        Objects.equals(this.author, gitQueryCommitsCriteria.author) &&
        Objects.equals(this.compareVersion, gitQueryCommitsCriteria.compareVersion) &&
        Objects.equals(this.excludeDeletes, gitQueryCommitsCriteria.excludeDeletes) &&
        Objects.equals(this.fromCommitId, gitQueryCommitsCriteria.fromCommitId) &&
        Objects.equals(this.fromDate, gitQueryCommitsCriteria.fromDate) &&
        Objects.equals(this.historyMode, gitQueryCommitsCriteria.historyMode) &&
        Objects.equals(this.ids, gitQueryCommitsCriteria.ids) &&
        Objects.equals(this.includeLinks, gitQueryCommitsCriteria.includeLinks) &&
        Objects.equals(this.includePushData, gitQueryCommitsCriteria.includePushData) &&
        Objects.equals(this.includeUserImageUrl, gitQueryCommitsCriteria.includeUserImageUrl) &&
        Objects.equals(this.includeWorkItems, gitQueryCommitsCriteria.includeWorkItems) &&
        Objects.equals(this.itemPath, gitQueryCommitsCriteria.itemPath) &&
        Objects.equals(this.itemVersion, gitQueryCommitsCriteria.itemVersion) &&
        Objects.equals(this.showOldestCommitsFirst, gitQueryCommitsCriteria.showOldestCommitsFirst) &&
        Objects.equals(this.toCommitId, gitQueryCommitsCriteria.toCommitId) &&
        Objects.equals(this.toDate, gitQueryCommitsCriteria.toDate) &&
        Objects.equals(this.user, gitQueryCommitsCriteria.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skip, top, author, compareVersion, excludeDeletes, fromCommitId, fromDate, historyMode, ids, includeLinks, includePushData, includeUserImageUrl, includeWorkItems, itemPath, itemVersion, showOldestCommitsFirst, toCommitId, toDate, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitQueryCommitsCriteria {\n");
    
    sb.append("    skip: ").append(toIndentedString(skip)).append("\n");
    sb.append("    top: ").append(toIndentedString(top)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    compareVersion: ").append(toIndentedString(compareVersion)).append("\n");
    sb.append("    excludeDeletes: ").append(toIndentedString(excludeDeletes)).append("\n");
    sb.append("    fromCommitId: ").append(toIndentedString(fromCommitId)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    historyMode: ").append(toIndentedString(historyMode)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    includeLinks: ").append(toIndentedString(includeLinks)).append("\n");
    sb.append("    includePushData: ").append(toIndentedString(includePushData)).append("\n");
    sb.append("    includeUserImageUrl: ").append(toIndentedString(includeUserImageUrl)).append("\n");
    sb.append("    includeWorkItems: ").append(toIndentedString(includeWorkItems)).append("\n");
    sb.append("    itemPath: ").append(toIndentedString(itemPath)).append("\n");
    sb.append("    itemVersion: ").append(toIndentedString(itemVersion)).append("\n");
    sb.append("    showOldestCommitsFirst: ").append(toIndentedString(showOldestCommitsFirst)).append("\n");
    sb.append("    toCommitId: ").append(toIndentedString(toCommitId)).append("\n");
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

