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
import java.util.UUID;

/**
 * The representation of a tag definition which is sent across the wire.
 */
@ApiModel(description = "The representation of a tag definition which is sent across the wire.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class WebApiTagDefinition {
    @JsonProperty("active")
    private Boolean active = null;

    @JsonProperty("id")
    private UUID id = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("url")
    private String url = null;

    public WebApiTagDefinition active(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Whether or not the tag definition is active.
     *
     * @return active
     **/
    @ApiModelProperty(value = "Whether or not the tag definition is active.")
    public Boolean isActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public WebApiTagDefinition id(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * ID of the tag definition.
     *
     * @return id
     **/
    @ApiModelProperty(value = "ID of the tag definition.")
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public WebApiTagDefinition name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the tag definition.
     *
     * @return name
     **/
    @ApiModelProperty(value = "The name of the tag definition.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WebApiTagDefinition url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Resource URL for the Tag Definition.
     *
     * @return url
     **/
    @ApiModelProperty(value = "Resource URL for the Tag Definition.")
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
        WebApiTagDefinition webApiTagDefinition = (WebApiTagDefinition) o;
        return Objects.equals(this.active, webApiTagDefinition.active) &&
                Objects.equals(this.id, webApiTagDefinition.id) &&
                Objects.equals(this.name, webApiTagDefinition.name) &&
                Objects.equals(this.url, webApiTagDefinition.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(active, id, name, url);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebApiTagDefinition {\n");

        sb.append("    active: ").append(toIndentedString(active)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

