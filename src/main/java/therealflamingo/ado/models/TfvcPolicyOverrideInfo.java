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
 * Information on the policy override.
 */
@ApiModel(description = "Information on the policy override.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class TfvcPolicyOverrideInfo {
    @JsonProperty("comment")
    private String comment = null;

    @JsonProperty("policyFailures")
    private List<TfvcPolicyFailureInfo> policyFailures = null;

    public TfvcPolicyOverrideInfo comment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Overidden policy comment.
     *
     * @return comment
     **/
    @ApiModelProperty(value = "Overidden policy comment.")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public TfvcPolicyOverrideInfo policyFailures(List<TfvcPolicyFailureInfo> policyFailures) {
        this.policyFailures = policyFailures;
        return this;
    }

    public TfvcPolicyOverrideInfo addPolicyFailuresItem(TfvcPolicyFailureInfo policyFailuresItem) {
        if (this.policyFailures == null) {
            this.policyFailures = new ArrayList<TfvcPolicyFailureInfo>();
        }
        this.policyFailures.add(policyFailuresItem);
        return this;
    }

    /**
     * Information on the failed policy that was overridden.
     *
     * @return policyFailures
     **/
    @ApiModelProperty(value = "Information on the failed policy that was overridden.")
    public List<TfvcPolicyFailureInfo> getPolicyFailures() {
        return policyFailures;
    }

    public void setPolicyFailures(List<TfvcPolicyFailureInfo> policyFailures) {
        this.policyFailures = policyFailures;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TfvcPolicyOverrideInfo tfvcPolicyOverrideInfo = (TfvcPolicyOverrideInfo) o;
        return Objects.equals(this.comment, tfvcPolicyOverrideInfo.comment) &&
                Objects.equals(this.policyFailures, tfvcPolicyOverrideInfo.policyFailures);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comment, policyFailures);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TfvcPolicyOverrideInfo {\n");

        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    policyFailures: ").append(toIndentedString(policyFailures)).append("\n");
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

