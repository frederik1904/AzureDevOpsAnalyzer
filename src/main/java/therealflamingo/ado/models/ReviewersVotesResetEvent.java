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
import java.util.UUID;
import therealflamingo.ado.models.RealTimePullRequestEvent;

/**
 * Real time event (SignalR) for reviewer votes being reset on a pull request
 */
@ApiModel(description = "Real time event (SignalR) for reviewer votes being reset on a pull request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class ReviewersVotesResetEvent extends RealTimePullRequestEvent {
  @JsonProperty("eventId")
  private UUID eventId = null;

  @JsonProperty("pullRequestId")
  private Integer pullRequestId = null;

  public ReviewersVotesResetEvent eventId(UUID eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * The id of this event. Can be used to track send/receive state between client and server.
   * @return eventId
  **/
  @ApiModelProperty(value = "The id of this event. Can be used to track send/receive state between client and server.")
  public UUID getEventId() {
    return eventId;
  }

  public void setEventId(UUID eventId) {
    this.eventId = eventId;
  }

  public ReviewersVotesResetEvent pullRequestId(Integer pullRequestId) {
    this.pullRequestId = pullRequestId;
    return this;
  }

   /**
   * The id of the pull request this event was generated for.
   * @return pullRequestId
  **/
  @ApiModelProperty(value = "The id of the pull request this event was generated for.")
  public Integer getPullRequestId() {
    return pullRequestId;
  }

  public void setPullRequestId(Integer pullRequestId) {
    this.pullRequestId = pullRequestId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReviewersVotesResetEvent reviewersVotesResetEvent = (ReviewersVotesResetEvent) o;
    return Objects.equals(this.eventId, reviewersVotesResetEvent.eventId) &&
        Objects.equals(this.pullRequestId, reviewersVotesResetEvent.pullRequestId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, pullRequestId, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewersVotesResetEvent {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    pullRequestId: ").append(toIndentedString(pullRequestId)).append("\n");
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

