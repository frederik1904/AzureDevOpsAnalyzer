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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Provides properties that describe inputs for the file diffs
 */
@ApiModel(description = "Provides properties that describe inputs for the file diffs")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class FileDiffsCriteria {
  @JsonProperty("baseVersionCommit")
  private String baseVersionCommit = null;

  @JsonProperty("fileDiffParams")
  private List<FileDiffParams> fileDiffParams = null;

  @JsonProperty("targetVersionCommit")
  private String targetVersionCommit = null;

  public FileDiffsCriteria baseVersionCommit(String baseVersionCommit) {
    this.baseVersionCommit = baseVersionCommit;
    return this;
  }

  /**
   * Commit ID of the base version
   *
   * @return baseVersionCommit
   **/
  @ApiModelProperty(value = "Commit ID of the base version")
  public String getBaseVersionCommit() {
    return baseVersionCommit;
  }

  public void setBaseVersionCommit(String baseVersionCommit) {
    this.baseVersionCommit = baseVersionCommit;
  }

  public FileDiffsCriteria fileDiffParams(List<FileDiffParams> fileDiffParams) {
    this.fileDiffParams = fileDiffParams;
    return this;
  }

  public FileDiffsCriteria addFileDiffParamsItem(FileDiffParams fileDiffParamsItem) {
    if (this.fileDiffParams == null) {
      this.fileDiffParams = new ArrayList<FileDiffParams>();
    }
    this.fileDiffParams.add(fileDiffParamsItem);
    return this;
  }

  /**
   * List of parameters for each of the files for which we need to get the file diff
   *
   * @return fileDiffParams
   **/
  @ApiModelProperty(value = "List of parameters for each of the files for which we need to get the file diff")
  public List<FileDiffParams> getFileDiffParams() {
    return fileDiffParams;
  }

  public void setFileDiffParams(List<FileDiffParams> fileDiffParams) {
    this.fileDiffParams = fileDiffParams;
  }

  public FileDiffsCriteria targetVersionCommit(String targetVersionCommit) {
    this.targetVersionCommit = targetVersionCommit;
    return this;
  }

  /**
   * Commit ID of the target version
   *
   * @return targetVersionCommit
   **/
  @ApiModelProperty(value = "Commit ID of the target version")
  public String getTargetVersionCommit() {
    return targetVersionCommit;
  }

  public void setTargetVersionCommit(String targetVersionCommit) {
    this.targetVersionCommit = targetVersionCommit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileDiffsCriteria fileDiffsCriteria = (FileDiffsCriteria) o;
    return Objects.equals(this.baseVersionCommit, fileDiffsCriteria.baseVersionCommit) &&
            Objects.equals(this.fileDiffParams, fileDiffsCriteria.fileDiffParams) &&
            Objects.equals(this.targetVersionCommit, fileDiffsCriteria.targetVersionCommit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseVersionCommit, fileDiffParams, targetVersionCommit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileDiffsCriteria {\n");

    sb.append("    baseVersionCommit: ").append(toIndentedString(baseVersionCommit)).append("\n");
    sb.append("    fileDiffParams: ").append(toIndentedString(fileDiffParams)).append("\n");
    sb.append("    targetVersionCommit: ").append(toIndentedString(targetVersionCommit)).append("\n");
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

