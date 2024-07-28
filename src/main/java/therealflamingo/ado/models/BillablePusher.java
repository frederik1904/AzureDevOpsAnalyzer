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
 * Used by AdvSec to estimate billable pushers for a Host or Project.
 */
@ApiModel(description = "Used by AdvSec to estimate billable pushers for a Host or Project.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class BillablePusher {
  @JsonProperty("projectId")
  private UUID projectId = null;

  @JsonProperty("repoId")
  private UUID repoId = null;

  @JsonProperty("vsid")
  private UUID vsid = null;

  public BillablePusher projectId(UUID projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * ProjectId that was pushed to.
   *
   * @return projectId
   **/
  @ApiModelProperty(value = "ProjectId that was pushed to.")
  public UUID getProjectId() {
    return projectId;
  }

  public void setProjectId(UUID projectId) {
    this.projectId = projectId;
  }

  public BillablePusher repoId(UUID repoId) {
    this.repoId = repoId;
    return this;
  }

  /**
   * RepositoryId that was pushed to.
   *
   * @return repoId
   **/
  @ApiModelProperty(value = "RepositoryId that was pushed to.")
  public UUID getRepoId() {
    return repoId;
  }

  public void setRepoId(UUID repoId) {
    this.repoId = repoId;
  }

  public BillablePusher vsid(UUID vsid) {
    this.vsid = vsid;
    return this;
  }

  /**
   * Visual Studio ID /Team Foundation ID
   *
   * @return vsid
   **/
  @ApiModelProperty(value = "Visual Studio ID /Team Foundation ID")
  public UUID getVsid() {
    return vsid;
  }

  public void setVsid(UUID vsid) {
    this.vsid = vsid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillablePusher billablePusher = (BillablePusher) o;
    return Objects.equals(this.projectId, billablePusher.projectId) &&
            Objects.equals(this.repoId, billablePusher.repoId) &&
            Objects.equals(this.vsid, billablePusher.vsid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId, repoId, vsid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillablePusher {\n");

    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    repoId: ").append(toIndentedString(repoId)).append("\n");
    sb.append("    vsid: ").append(toIndentedString(vsid)).append("\n");
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

