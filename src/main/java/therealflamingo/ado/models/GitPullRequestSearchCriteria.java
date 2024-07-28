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

import java.util.Objects;
import java.util.UUID;

/**
 * Pull requests can be searched for matching this criteria.
 */
@ApiModel(description = "Pull requests can be searched for matching this criteria.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class GitPullRequestSearchCriteria {
    @JsonProperty("creatorId")
    private UUID creatorId = null;

    @JsonProperty("includeLinks")
    private Boolean includeLinks = null;

    @JsonProperty("maxTime")
    private OffsetDateTime maxTime = null;

    @JsonProperty("minTime")
    private OffsetDateTime minTime = null;
    @JsonProperty("queryTimeRangeType")
    private QueryTimeRangeTypeEnum queryTimeRangeType = null;
    @JsonProperty("repositoryId")
    private UUID repositoryId = null;
    @JsonProperty("reviewerId")
    private UUID reviewerId = null;
    @JsonProperty("sourceRefName")
    private String sourceRefName = null;
    @JsonProperty("sourceRepositoryId")
    private UUID sourceRepositoryId = null;
    @JsonProperty("status")
    private StatusEnum status = null;
    @JsonProperty("targetRefName")
    private String targetRefName = null;

    public GitPullRequestSearchCriteria creatorId(UUID creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * If set, search for pull requests that were created by this identity.
     *
     * @return creatorId
     **/
    @ApiModelProperty(value = "If set, search for pull requests that were created by this identity.")
    public UUID getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(UUID creatorId) {
        this.creatorId = creatorId;
    }

    public GitPullRequestSearchCriteria includeLinks(Boolean includeLinks) {
        this.includeLinks = includeLinks;
        return this;
    }

    /**
     * Whether to include the _links field on the shallow references
     *
     * @return includeLinks
     **/
    @ApiModelProperty(value = "Whether to include the _links field on the shallow references")
    public Boolean isIncludeLinks() {
        return includeLinks;
    }

    public void setIncludeLinks(Boolean includeLinks) {
        this.includeLinks = includeLinks;
    }

    public GitPullRequestSearchCriteria maxTime(OffsetDateTime maxTime) {
        this.maxTime = maxTime;
        return this;
    }

    /**
     * If specified, filters pull requests that created/closed before this date based on the queryTimeRangeType specified.
     *
     * @return maxTime
     **/
    @ApiModelProperty(value = "If specified, filters pull requests that created/closed before this date based on the queryTimeRangeType specified.")
    public OffsetDateTime getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(OffsetDateTime maxTime) {
        this.maxTime = maxTime;
    }

    public GitPullRequestSearchCriteria minTime(OffsetDateTime minTime) {
        this.minTime = minTime;
        return this;
    }

    /**
     * If specified, filters pull requests that created/closed after this date based on the queryTimeRangeType specified.
     *
     * @return minTime
     **/
    @ApiModelProperty(value = "If specified, filters pull requests that created/closed after this date based on the queryTimeRangeType specified.")
    public OffsetDateTime getMinTime() {
        return minTime;
    }

    public void setMinTime(OffsetDateTime minTime) {
        this.minTime = minTime;
    }

    public GitPullRequestSearchCriteria queryTimeRangeType(QueryTimeRangeTypeEnum queryTimeRangeType) {
        this.queryTimeRangeType = queryTimeRangeType;
        return this;
    }

    /**
     * The type of time range which should be used for minTime and maxTime. Defaults to Created if unset.
     *
     * @return queryTimeRangeType
     **/
    @ApiModelProperty(value = "The type of time range which should be used for minTime and maxTime. Defaults to Created if unset.")
    public QueryTimeRangeTypeEnum getQueryTimeRangeType() {
        return queryTimeRangeType;
    }

    public void setQueryTimeRangeType(QueryTimeRangeTypeEnum queryTimeRangeType) {
        this.queryTimeRangeType = queryTimeRangeType;
    }

    public GitPullRequestSearchCriteria repositoryId(UUID repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * If set, search for pull requests whose target branch is in this repository.
     *
     * @return repositoryId
     **/
    @ApiModelProperty(value = "If set, search for pull requests whose target branch is in this repository.")
    public UUID getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(UUID repositoryId) {
        this.repositoryId = repositoryId;
    }

    public GitPullRequestSearchCriteria reviewerId(UUID reviewerId) {
        this.reviewerId = reviewerId;
        return this;
    }

    /**
     * If set, search for pull requests that have this identity as a reviewer.
     *
     * @return reviewerId
     **/
    @ApiModelProperty(value = "If set, search for pull requests that have this identity as a reviewer.")
    public UUID getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(UUID reviewerId) {
        this.reviewerId = reviewerId;
    }

    public GitPullRequestSearchCriteria sourceRefName(String sourceRefName) {
        this.sourceRefName = sourceRefName;
        return this;
    }

    /**
     * If set, search for pull requests from this branch.
     *
     * @return sourceRefName
     **/
    @ApiModelProperty(value = "If set, search for pull requests from this branch.")
    public String getSourceRefName() {
        return sourceRefName;
    }

    public void setSourceRefName(String sourceRefName) {
        this.sourceRefName = sourceRefName;
    }

    public GitPullRequestSearchCriteria sourceRepositoryId(UUID sourceRepositoryId) {
        this.sourceRepositoryId = sourceRepositoryId;
        return this;
    }

    /**
     * If set, search for pull requests whose source branch is in this repository.
     *
     * @return sourceRepositoryId
     **/
    @ApiModelProperty(value = "If set, search for pull requests whose source branch is in this repository.")
    public UUID getSourceRepositoryId() {
        return sourceRepositoryId;
    }

    public void setSourceRepositoryId(UUID sourceRepositoryId) {
        this.sourceRepositoryId = sourceRepositoryId;
    }

    public GitPullRequestSearchCriteria status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * If set, search for pull requests that are in this state. Defaults to Active if unset.
     *
     * @return status
     **/
    @ApiModelProperty(value = "If set, search for pull requests that are in this state. Defaults to Active if unset.")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public GitPullRequestSearchCriteria targetRefName(String targetRefName) {
        this.targetRefName = targetRefName;
        return this;
    }

    /**
     * If set, search for pull requests into this branch.
     *
     * @return targetRefName
     **/
    @ApiModelProperty(value = "If set, search for pull requests into this branch.")
    public String getTargetRefName() {
        return targetRefName;
    }

    public void setTargetRefName(String targetRefName) {
        this.targetRefName = targetRefName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GitPullRequestSearchCriteria gitPullRequestSearchCriteria = (GitPullRequestSearchCriteria) o;
        return Objects.equals(this.creatorId, gitPullRequestSearchCriteria.creatorId) &&
                Objects.equals(this.includeLinks, gitPullRequestSearchCriteria.includeLinks) &&
                Objects.equals(this.maxTime, gitPullRequestSearchCriteria.maxTime) &&
                Objects.equals(this.minTime, gitPullRequestSearchCriteria.minTime) &&
                Objects.equals(this.queryTimeRangeType, gitPullRequestSearchCriteria.queryTimeRangeType) &&
                Objects.equals(this.repositoryId, gitPullRequestSearchCriteria.repositoryId) &&
                Objects.equals(this.reviewerId, gitPullRequestSearchCriteria.reviewerId) &&
                Objects.equals(this.sourceRefName, gitPullRequestSearchCriteria.sourceRefName) &&
                Objects.equals(this.sourceRepositoryId, gitPullRequestSearchCriteria.sourceRepositoryId) &&
                Objects.equals(this.status, gitPullRequestSearchCriteria.status) &&
                Objects.equals(this.targetRefName, gitPullRequestSearchCriteria.targetRefName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creatorId, includeLinks, maxTime, minTime, queryTimeRangeType, repositoryId, reviewerId, sourceRefName, sourceRepositoryId, status, targetRefName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GitPullRequestSearchCriteria {\n");

        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    includeLinks: ").append(toIndentedString(includeLinks)).append("\n");
        sb.append("    maxTime: ").append(toIndentedString(maxTime)).append("\n");
        sb.append("    minTime: ").append(toIndentedString(minTime)).append("\n");
        sb.append("    queryTimeRangeType: ").append(toIndentedString(queryTimeRangeType)).append("\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    reviewerId: ").append(toIndentedString(reviewerId)).append("\n");
        sb.append("    sourceRefName: ").append(toIndentedString(sourceRefName)).append("\n");
        sb.append("    sourceRepositoryId: ").append(toIndentedString(sourceRepositoryId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    targetRefName: ").append(toIndentedString(targetRefName)).append("\n");
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
     * The type of time range which should be used for minTime and maxTime. Defaults to Created if unset.
     */
    public enum QueryTimeRangeTypeEnum {
        CREATED("created"),

        CLOSED("closed");

        private String value;

        QueryTimeRangeTypeEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static QueryTimeRangeTypeEnum fromValue(String value) {
            for (QueryTimeRangeTypeEnum b : QueryTimeRangeTypeEnum.values()) {
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

    /**
     * If set, search for pull requests that are in this state. Defaults to Active if unset.
     */
    public enum StatusEnum {
        NOTSET("notSet"),

        ACTIVE("active"),

        ABANDONED("abandoned"),

        COMPLETED("completed"),

        ALL("all");

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

