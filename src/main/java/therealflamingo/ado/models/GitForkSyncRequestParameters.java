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
import therealflamingo.ado.models.GlobalGitRepositoryKey;
import therealflamingo.ado.models.SourceToTargetRef;

/**
 * Parameters for creating a fork request
 */
@ApiModel(description = "Parameters for creating a fork request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class GitForkSyncRequestParameters {
  @JsonProperty("source")
  private GlobalGitRepositoryKey source = null;

  @JsonProperty("sourceToTargetRefs")
  private List<SourceToTargetRef> sourceToTargetRefs = null;

  public GitForkSyncRequestParameters source(GlobalGitRepositoryKey source) {
    this.source = source;
    return this;
  }

   /**
   * Fully-qualified identifier for the source repository.
   * @return source
  **/
  @ApiModelProperty(value = "Fully-qualified identifier for the source repository.")
  public GlobalGitRepositoryKey getSource() {
    return source;
  }

  public void setSource(GlobalGitRepositoryKey source) {
    this.source = source;
  }

  public GitForkSyncRequestParameters sourceToTargetRefs(List<SourceToTargetRef> sourceToTargetRefs) {
    this.sourceToTargetRefs = sourceToTargetRefs;
    return this;
  }

  public GitForkSyncRequestParameters addSourceToTargetRefsItem(SourceToTargetRef sourceToTargetRefsItem) {
    if (this.sourceToTargetRefs == null) {
      this.sourceToTargetRefs = new ArrayList<SourceToTargetRef>();
    }
    this.sourceToTargetRefs.add(sourceToTargetRefsItem);
    return this;
  }

   /**
   * If supplied, the set of ref mappings to use when performing a \&quot;sync\&quot; or create. If missing, all refs will be synchronized.
   * @return sourceToTargetRefs
  **/
  @ApiModelProperty(value = "If supplied, the set of ref mappings to use when performing a \"sync\" or create. If missing, all refs will be synchronized.")
  public List<SourceToTargetRef> getSourceToTargetRefs() {
    return sourceToTargetRefs;
  }

  public void setSourceToTargetRefs(List<SourceToTargetRef> sourceToTargetRefs) {
    this.sourceToTargetRefs = sourceToTargetRefs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitForkSyncRequestParameters gitForkSyncRequestParameters = (GitForkSyncRequestParameters) o;
    return Objects.equals(this.source, gitForkSyncRequestParameters.source) &&
        Objects.equals(this.sourceToTargetRefs, gitForkSyncRequestParameters.sourceToTargetRefs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, sourceToTargetRefs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitForkSyncRequestParameters {\n");
    
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    sourceToTargetRefs: ").append(toIndentedString(sourceToTargetRefs)).append("\n");
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

