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
 * Pull request query input parameters.
 */
@ApiModel(description = "Pull request query input parameters.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class GitPullRequestQueryInput {
    @JsonProperty("items")
    private List<String> items = null;
    @JsonProperty("type")
    private TypeEnum type = null;

    public GitPullRequestQueryInput items(List<String> items) {
        this.items = items;
        return this;
    }

    public GitPullRequestQueryInput addItemsItem(String itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<String>();
        }
        this.items.add(itemsItem);
        return this;
    }

    /**
     * The list of commit IDs to search for.
     *
     * @return items
     **/
    @ApiModelProperty(value = "The list of commit IDs to search for.")
    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public GitPullRequestQueryInput type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * The type of query to perform.
     *
     * @return type
     **/
    @ApiModelProperty(value = "The type of query to perform.")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GitPullRequestQueryInput gitPullRequestQueryInput = (GitPullRequestQueryInput) o;
        return Objects.equals(this.items, gitPullRequestQueryInput.items) &&
                Objects.equals(this.type, gitPullRequestQueryInput.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GitPullRequestQueryInput {\n");

        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
     * The type of query to perform.
     */
    public enum TypeEnum {
        NOTSET("notSet"),

        LASTMERGECOMMIT("lastMergeCommit"),

        COMMIT("commit");

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
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

