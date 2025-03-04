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
 * Used by AdvSec to return billable committers.
 */
@ApiModel(description = "Used by AdvSec to return billable committers.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class BillableCommitter {
  @JsonProperty("repoId")
  private UUID repoId = null;

  @JsonProperty("vsid")
  private UUID vsid = null;

  public BillableCommitter repoId(UUID repoId) {
    this.repoId = repoId;
    return this;
  }

  /**
   * RepositoryId commit was pushed to.
   *
   * @return repoId
   **/
  @ApiModelProperty(value = "RepositoryId commit was pushed to.")
  public UUID getRepoId() {
    return repoId;
  }

  public void setRepoId(UUID repoId) {
    this.repoId = repoId;
  }

  public BillableCommitter vsid(UUID vsid) {
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
    BillableCommitter billableCommitter = (BillableCommitter) o;
    return Objects.equals(this.repoId, billableCommitter.repoId) &&
            Objects.equals(this.vsid, billableCommitter.vsid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repoId, vsid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillableCommitter {\n");

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

