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

/**
 * Preferences about how the pull request should be completed.
 */
@ApiModel(description = "Preferences about how the pull request should be completed.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class GitPullRequestCompletionOptions {
  @JsonProperty("autoCompleteIgnoreConfigIds")
  private List<Integer> autoCompleteIgnoreConfigIds = null;

  @JsonProperty("bypassPolicy")
  private Boolean bypassPolicy = null;

  @JsonProperty("bypassReason")
  private String bypassReason = null;

  @JsonProperty("deleteSourceBranch")
  private Boolean deleteSourceBranch = null;

  @JsonProperty("mergeCommitMessage")
  private String mergeCommitMessage = null;

  /**
   * Specify the strategy used to merge the pull request during completion. If MergeStrategy is not set to any value, a no-FF merge will be created if SquashMerge &#x3D;&#x3D; false. If MergeStrategy is not set to any value, the pull request commits will be squashed if SquashMerge &#x3D;&#x3D; true. The SquashMerge property is deprecated. It is recommended that you explicitly set MergeStrategy in all cases. If an explicit value is provided for MergeStrategy, the SquashMerge property will be ignored.
   */
  public enum MergeStrategyEnum {
    NOFASTFORWARD("noFastForward"),
    
    SQUASH("squash"),
    
    REBASE("rebase"),
    
    REBASEMERGE("rebaseMerge");

    private String value;

    MergeStrategyEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MergeStrategyEnum fromValue(String value) {
      for (MergeStrategyEnum b : MergeStrategyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("mergeStrategy")
  private MergeStrategyEnum mergeStrategy = null;

  @JsonProperty("squashMerge")
  private Boolean squashMerge = null;

  @JsonProperty("transitionWorkItems")
  private Boolean transitionWorkItems = null;

  @JsonProperty("triggeredByAutoComplete")
  private Boolean triggeredByAutoComplete = null;

  public GitPullRequestCompletionOptions autoCompleteIgnoreConfigIds(List<Integer> autoCompleteIgnoreConfigIds) {
    this.autoCompleteIgnoreConfigIds = autoCompleteIgnoreConfigIds;
    return this;
  }

  public GitPullRequestCompletionOptions addAutoCompleteIgnoreConfigIdsItem(Integer autoCompleteIgnoreConfigIdsItem) {
    if (this.autoCompleteIgnoreConfigIds == null) {
      this.autoCompleteIgnoreConfigIds = new ArrayList<Integer>();
    }
    this.autoCompleteIgnoreConfigIds.add(autoCompleteIgnoreConfigIdsItem);
    return this;
  }

   /**
   * List of any policy configuration Id&#39;s which auto-complete should not wait for. Only applies to optional policies (isBlocking &#x3D;&#x3D; false). Auto-complete always waits for required policies (isBlocking &#x3D;&#x3D; true).
   * @return autoCompleteIgnoreConfigIds
  **/
  @ApiModelProperty(value = "List of any policy configuration Id's which auto-complete should not wait for. Only applies to optional policies (isBlocking == false). Auto-complete always waits for required policies (isBlocking == true).")
  public List<Integer> getAutoCompleteIgnoreConfigIds() {
    return autoCompleteIgnoreConfigIds;
  }

  public void setAutoCompleteIgnoreConfigIds(List<Integer> autoCompleteIgnoreConfigIds) {
    this.autoCompleteIgnoreConfigIds = autoCompleteIgnoreConfigIds;
  }

  public GitPullRequestCompletionOptions bypassPolicy(Boolean bypassPolicy) {
    this.bypassPolicy = bypassPolicy;
    return this;
  }

   /**
   * If true, policies will be explicitly bypassed while the pull request is completed.
   * @return bypassPolicy
  **/
  @ApiModelProperty(value = "If true, policies will be explicitly bypassed while the pull request is completed.")
  public Boolean isBypassPolicy() {
    return bypassPolicy;
  }

  public void setBypassPolicy(Boolean bypassPolicy) {
    this.bypassPolicy = bypassPolicy;
  }

  public GitPullRequestCompletionOptions bypassReason(String bypassReason) {
    this.bypassReason = bypassReason;
    return this;
  }

   /**
   * If policies are bypassed, this reason is stored as to why bypass was used.
   * @return bypassReason
  **/
  @ApiModelProperty(value = "If policies are bypassed, this reason is stored as to why bypass was used.")
  public String getBypassReason() {
    return bypassReason;
  }

  public void setBypassReason(String bypassReason) {
    this.bypassReason = bypassReason;
  }

  public GitPullRequestCompletionOptions deleteSourceBranch(Boolean deleteSourceBranch) {
    this.deleteSourceBranch = deleteSourceBranch;
    return this;
  }

   /**
   * If true, the source branch of the pull request will be deleted after completion.
   * @return deleteSourceBranch
  **/
  @ApiModelProperty(value = "If true, the source branch of the pull request will be deleted after completion.")
  public Boolean isDeleteSourceBranch() {
    return deleteSourceBranch;
  }

  public void setDeleteSourceBranch(Boolean deleteSourceBranch) {
    this.deleteSourceBranch = deleteSourceBranch;
  }

  public GitPullRequestCompletionOptions mergeCommitMessage(String mergeCommitMessage) {
    this.mergeCommitMessage = mergeCommitMessage;
    return this;
  }

   /**
   * If set, this will be used as the commit message of the merge commit.
   * @return mergeCommitMessage
  **/
  @ApiModelProperty(value = "If set, this will be used as the commit message of the merge commit.")
  public String getMergeCommitMessage() {
    return mergeCommitMessage;
  }

  public void setMergeCommitMessage(String mergeCommitMessage) {
    this.mergeCommitMessage = mergeCommitMessage;
  }

  public GitPullRequestCompletionOptions mergeStrategy(MergeStrategyEnum mergeStrategy) {
    this.mergeStrategy = mergeStrategy;
    return this;
  }

   /**
   * Specify the strategy used to merge the pull request during completion. If MergeStrategy is not set to any value, a no-FF merge will be created if SquashMerge &#x3D;&#x3D; false. If MergeStrategy is not set to any value, the pull request commits will be squashed if SquashMerge &#x3D;&#x3D; true. The SquashMerge property is deprecated. It is recommended that you explicitly set MergeStrategy in all cases. If an explicit value is provided for MergeStrategy, the SquashMerge property will be ignored.
   * @return mergeStrategy
  **/
  @ApiModelProperty(value = "Specify the strategy used to merge the pull request during completion. If MergeStrategy is not set to any value, a no-FF merge will be created if SquashMerge == false. If MergeStrategy is not set to any value, the pull request commits will be squashed if SquashMerge == true. The SquashMerge property is deprecated. It is recommended that you explicitly set MergeStrategy in all cases. If an explicit value is provided for MergeStrategy, the SquashMerge property will be ignored.")
  public MergeStrategyEnum getMergeStrategy() {
    return mergeStrategy;
  }

  public void setMergeStrategy(MergeStrategyEnum mergeStrategy) {
    this.mergeStrategy = mergeStrategy;
  }

  public GitPullRequestCompletionOptions squashMerge(Boolean squashMerge) {
    this.squashMerge = squashMerge;
    return this;
  }

   /**
   * SquashMerge is deprecated. You should explicitly set the value of MergeStrategy. If MergeStrategy is set to any value, the SquashMerge value will be ignored. If MergeStrategy is not set, the merge strategy will be no-fast-forward if this flag is false, or squash if true.
   * @return squashMerge
  **/
  @ApiModelProperty(value = "SquashMerge is deprecated. You should explicitly set the value of MergeStrategy. If MergeStrategy is set to any value, the SquashMerge value will be ignored. If MergeStrategy is not set, the merge strategy will be no-fast-forward if this flag is false, or squash if true.")
  public Boolean isSquashMerge() {
    return squashMerge;
  }

  public void setSquashMerge(Boolean squashMerge) {
    this.squashMerge = squashMerge;
  }

  public GitPullRequestCompletionOptions transitionWorkItems(Boolean transitionWorkItems) {
    this.transitionWorkItems = transitionWorkItems;
    return this;
  }

   /**
   * If true, we will attempt to transition any work items linked to the pull request into the next logical state (i.e. Active -&gt; Resolved)
   * @return transitionWorkItems
  **/
  @ApiModelProperty(value = "If true, we will attempt to transition any work items linked to the pull request into the next logical state (i.e. Active -> Resolved)")
  public Boolean isTransitionWorkItems() {
    return transitionWorkItems;
  }

  public void setTransitionWorkItems(Boolean transitionWorkItems) {
    this.transitionWorkItems = transitionWorkItems;
  }

  public GitPullRequestCompletionOptions triggeredByAutoComplete(Boolean triggeredByAutoComplete) {
    this.triggeredByAutoComplete = triggeredByAutoComplete;
    return this;
  }

   /**
   * If true, the current completion attempt was triggered via auto-complete. Used internally.
   * @return triggeredByAutoComplete
  **/
  @ApiModelProperty(value = "If true, the current completion attempt was triggered via auto-complete. Used internally.")
  public Boolean isTriggeredByAutoComplete() {
    return triggeredByAutoComplete;
  }

  public void setTriggeredByAutoComplete(Boolean triggeredByAutoComplete) {
    this.triggeredByAutoComplete = triggeredByAutoComplete;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GitPullRequestCompletionOptions gitPullRequestCompletionOptions = (GitPullRequestCompletionOptions) o;
    return Objects.equals(this.autoCompleteIgnoreConfigIds, gitPullRequestCompletionOptions.autoCompleteIgnoreConfigIds) &&
        Objects.equals(this.bypassPolicy, gitPullRequestCompletionOptions.bypassPolicy) &&
        Objects.equals(this.bypassReason, gitPullRequestCompletionOptions.bypassReason) &&
        Objects.equals(this.deleteSourceBranch, gitPullRequestCompletionOptions.deleteSourceBranch) &&
        Objects.equals(this.mergeCommitMessage, gitPullRequestCompletionOptions.mergeCommitMessage) &&
        Objects.equals(this.mergeStrategy, gitPullRequestCompletionOptions.mergeStrategy) &&
        Objects.equals(this.squashMerge, gitPullRequestCompletionOptions.squashMerge) &&
        Objects.equals(this.transitionWorkItems, gitPullRequestCompletionOptions.transitionWorkItems) &&
        Objects.equals(this.triggeredByAutoComplete, gitPullRequestCompletionOptions.triggeredByAutoComplete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoCompleteIgnoreConfigIds, bypassPolicy, bypassReason, deleteSourceBranch, mergeCommitMessage, mergeStrategy, squashMerge, transitionWorkItems, triggeredByAutoComplete);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GitPullRequestCompletionOptions {\n");
    
    sb.append("    autoCompleteIgnoreConfigIds: ").append(toIndentedString(autoCompleteIgnoreConfigIds)).append("\n");
    sb.append("    bypassPolicy: ").append(toIndentedString(bypassPolicy)).append("\n");
    sb.append("    bypassReason: ").append(toIndentedString(bypassReason)).append("\n");
    sb.append("    deleteSourceBranch: ").append(toIndentedString(deleteSourceBranch)).append("\n");
    sb.append("    mergeCommitMessage: ").append(toIndentedString(mergeCommitMessage)).append("\n");
    sb.append("    mergeStrategy: ").append(toIndentedString(mergeStrategy)).append("\n");
    sb.append("    squashMerge: ").append(toIndentedString(squashMerge)).append("\n");
    sb.append("    transitionWorkItems: ").append(toIndentedString(transitionWorkItems)).append("\n");
    sb.append("    triggeredByAutoComplete: ").append(toIndentedString(triggeredByAutoComplete)).append("\n");
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

