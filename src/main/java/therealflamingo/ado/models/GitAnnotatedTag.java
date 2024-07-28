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

import java.util.Objects;

/**
 * A Git annotated tag.
 */
@ApiModel(description = "A Git annotated tag.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class GitAnnotatedTag {
    @JsonProperty("message")
    private String message = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("objectId")
    private String objectId = null;

    @JsonProperty("taggedBy")
    private GitUserDate taggedBy = null;

    @JsonProperty("taggedObject")
    private GitObject taggedObject = null;

    @JsonProperty("url")
    private String url = null;

    public GitAnnotatedTag message(String message) {
        this.message = message;
        return this;
    }

    /**
     * The tagging Message
     *
     * @return message
     **/
    @ApiModelProperty(value = "The tagging Message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public GitAnnotatedTag name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the annotated tag.
     *
     * @return name
     **/
    @ApiModelProperty(value = "The name of the annotated tag.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GitAnnotatedTag objectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * The objectId (Sha1Id) of the tag.
     *
     * @return objectId
     **/
    @ApiModelProperty(value = "The objectId (Sha1Id) of the tag.")
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public GitAnnotatedTag taggedBy(GitUserDate taggedBy) {
        this.taggedBy = taggedBy;
        return this;
    }

    /**
     * User info and date of tagging.
     *
     * @return taggedBy
     **/
    @ApiModelProperty(value = "User info and date of tagging.")
    public GitUserDate getTaggedBy() {
        return taggedBy;
    }

    public void setTaggedBy(GitUserDate taggedBy) {
        this.taggedBy = taggedBy;
    }

    public GitAnnotatedTag taggedObject(GitObject taggedObject) {
        this.taggedObject = taggedObject;
        return this;
    }

    /**
     * Tagged git object.
     *
     * @return taggedObject
     **/
    @ApiModelProperty(value = "Tagged git object.")
    public GitObject getTaggedObject() {
        return taggedObject;
    }

    public void setTaggedObject(GitObject taggedObject) {
        this.taggedObject = taggedObject;
    }

    public GitAnnotatedTag url(String url) {
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


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GitAnnotatedTag gitAnnotatedTag = (GitAnnotatedTag) o;
        return Objects.equals(this.message, gitAnnotatedTag.message) &&
                Objects.equals(this.name, gitAnnotatedTag.name) &&
                Objects.equals(this.objectId, gitAnnotatedTag.objectId) &&
                Objects.equals(this.taggedBy, gitAnnotatedTag.taggedBy) &&
                Objects.equals(this.taggedObject, gitAnnotatedTag.taggedObject) &&
                Objects.equals(this.url, gitAnnotatedTag.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, name, objectId, taggedBy, taggedObject, url);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GitAnnotatedTag {\n");

        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
        sb.append("    taggedBy: ").append(toIndentedString(taggedBy)).append("\n");
        sb.append("    taggedObject: ").append(toIndentedString(taggedObject)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

