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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class GitQueryRefsCriteria {
    @JsonProperty("commitIds")
    private List<String> commitIds = null;

    @JsonProperty("refNames")
    private List<String> refNames = null;
    @JsonProperty("searchType")
    private SearchTypeEnum searchType = null;

    public GitQueryRefsCriteria commitIds(List<String> commitIds) {
        this.commitIds = commitIds;
        return this;
    }

    public GitQueryRefsCriteria addCommitIdsItem(String commitIdsItem) {
        if (this.commitIds == null) {
            this.commitIds = new ArrayList<String>();
        }
        this.commitIds.add(commitIdsItem);
        return this;
    }

    /**
     * List of commit Ids to be searched
     *
     * @return commitIds
     **/
    @ApiModelProperty(value = "List of commit Ids to be searched")
    public List<String> getCommitIds() {
        return commitIds;
    }

    public void setCommitIds(List<String> commitIds) {
        this.commitIds = commitIds;
    }

    public GitQueryRefsCriteria refNames(List<String> refNames) {
        this.refNames = refNames;
        return this;
    }

    public GitQueryRefsCriteria addRefNamesItem(String refNamesItem) {
        if (this.refNames == null) {
            this.refNames = new ArrayList<String>();
        }
        this.refNames.add(refNamesItem);
        return this;
    }

    /**
     * List of complete or partial names for refs to be searched
     *
     * @return refNames
     **/
    @ApiModelProperty(value = "List of complete or partial names for refs to be searched")
    public List<String> getRefNames() {
        return refNames;
    }

    public void setRefNames(List<String> refNames) {
        this.refNames = refNames;
    }

    public GitQueryRefsCriteria searchType(SearchTypeEnum searchType) {
        this.searchType = searchType;
        return this;
    }

    /**
     * Type of search on refNames, if provided
     *
     * @return searchType
     **/
    @ApiModelProperty(value = "Type of search on refNames, if provided")
    public SearchTypeEnum getSearchType() {
        return searchType;
    }

    public void setSearchType(SearchTypeEnum searchType) {
        this.searchType = searchType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GitQueryRefsCriteria gitQueryRefsCriteria = (GitQueryRefsCriteria) o;
        return Objects.equals(this.commitIds, gitQueryRefsCriteria.commitIds) &&
                Objects.equals(this.refNames, gitQueryRefsCriteria.refNames) &&
                Objects.equals(this.searchType, gitQueryRefsCriteria.searchType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commitIds, refNames, searchType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GitQueryRefsCriteria {\n");

        sb.append("    commitIds: ").append(toIndentedString(commitIds)).append("\n");
        sb.append("    refNames: ").append(toIndentedString(refNames)).append("\n");
        sb.append("    searchType: ").append(toIndentedString(searchType)).append("\n");
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
     * Type of search on refNames, if provided
     */
    public enum SearchTypeEnum {
        EXACT("exact"),

        STARTSWITH("startsWith"),

        CONTAINS("contains");

        private String value;

        SearchTypeEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static SearchTypeEnum fromValue(String value) {
            for (SearchTypeEnum b : SearchTypeEnum.values()) {
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

