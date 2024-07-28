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

import java.util.Objects;

/**
 *
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class GitResolutionPathConflict extends GitResolution {
    @JsonProperty("author")
    private IdentityRef author = null;
    @JsonProperty("action")
    private ActionEnum action = null;
    @JsonProperty("renamePath")
    private String renamePath = null;

    public GitResolutionPathConflict author(IdentityRef author) {
        this.author = author;
        return this;
    }

    /**
     * User who created the resolution.
     *
     * @return author
     **/
    @ApiModelProperty(value = "User who created the resolution.")
    public IdentityRef getAuthor() {
        return author;
    }

    public void setAuthor(IdentityRef author) {
        this.author = author;
    }

    public GitResolutionPathConflict action(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * Get action
     *
     * @return action
     **/
    @ApiModelProperty(value = "")
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public GitResolutionPathConflict renamePath(String renamePath) {
        this.renamePath = renamePath;
        return this;
    }

    /**
     * Get renamePath
     *
     * @return renamePath
     **/
    @ApiModelProperty(value = "")
    public String getRenamePath() {
        return renamePath;
    }

    public void setRenamePath(String renamePath) {
        this.renamePath = renamePath;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GitResolutionPathConflict gitResolutionPathConflict = (GitResolutionPathConflict) o;
        return Objects.equals(this.author, gitResolutionPathConflict.author) &&
                Objects.equals(this.action, gitResolutionPathConflict.action) &&
                Objects.equals(this.renamePath, gitResolutionPathConflict.renamePath) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, action, renamePath, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GitResolutionPathConflict {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    renamePath: ").append(toIndentedString(renamePath)).append("\n");
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
     * Gets or Sets action
     */
    public enum ActionEnum {
        UNDECIDED("undecided"),

        KEEPSOURCERENAMETARGET("keepSourceRenameTarget"),

        KEEPSOURCEDELETETARGET("keepSourceDeleteTarget"),

        KEEPTARGETRENAMESOURCE("keepTargetRenameSource"),

        KEEPTARGETDELETESOURCE("keepTargetDeleteSource");

        private String value;

        ActionEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static ActionEnum fromValue(String value) {
            for (ActionEnum b : ActionEnum.values()) {
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

