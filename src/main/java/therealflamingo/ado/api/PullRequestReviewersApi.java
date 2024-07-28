package therealflamingo.ado.api;

import therealflamingo.ado.invoker.ApiException;
import therealflamingo.ado.invoker.ApiClient;
import therealflamingo.ado.invoker.Configuration;
import therealflamingo.ado.invoker.Pair;

import javax.ws.rs.core.GenericType;

import therealflamingo.ado.models.IdentityRef;
import therealflamingo.ado.models.IdentityRefWithVote;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class PullRequestReviewersApi {
  private ApiClient apiClient;

  public PullRequestReviewersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PullRequestReviewersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * 
   * Add a reviewer to a pull request or cast a vote.
   * @param organization The name of the Azure DevOps organization. (required)
   * @param body Reviewer&#39;s vote.&lt;br /&gt;If the reviewer&#39;s ID is included here, it must match the reviewerID parameter.&lt;br /&gt;Reviewers can set their own vote with this method.  When adding other reviewers, vote must be set to zero. (required)
   * @param repositoryId The repository ID of the pull request&#39;s target branch. (required)
   * @param pullRequestId ID of the pull request. (required)
   * @param reviewerId ID of the reviewer. (required)
   * @param project Project ID or project name (required)
   * @param apiVersion Version of the API to use.  This should be set to &#39;7.2-preview.1&#39; to use this version of the api. (required)
   * @return IdentityRefWithVote
   * @throws ApiException if fails to make API call
   */
  public IdentityRefWithVote pullRequestReviewersCreatePullRequestReviewer(String organization, IdentityRefWithVote body, String repositoryId, Integer pullRequestId, String reviewerId, String project, String apiVersion) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling pullRequestReviewersCreatePullRequestReviewer");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling pullRequestReviewersCreatePullRequestReviewer");
    }
    
    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling pullRequestReviewersCreatePullRequestReviewer");
    }
    
    // verify the required parameter 'pullRequestId' is set
    if (pullRequestId == null) {
      throw new ApiException(400, "Missing the required parameter 'pullRequestId' when calling pullRequestReviewersCreatePullRequestReviewer");
    }
    
    // verify the required parameter 'reviewerId' is set
    if (reviewerId == null) {
      throw new ApiException(400, "Missing the required parameter 'reviewerId' when calling pullRequestReviewersCreatePullRequestReviewer");
    }
    
    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling pullRequestReviewersCreatePullRequestReviewer");
    }
    
    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling pullRequestReviewersCreatePullRequestReviewer");
    }
    
    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/reviewers/{reviewerId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
      .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()))
      .replaceAll("\\{" + "pullRequestId" + "\\}", apiClient.escapeString(pullRequestId.toString()))
      .replaceAll("\\{" + "reviewerId" + "\\}", apiClient.escapeString(reviewerId.toString()))
      .replaceAll("\\{" + "project" + "\\}", apiClient.escapeString(project.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "api-version", apiVersion));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2", "accessToken" };

    GenericType<IdentityRefWithVote> localVarReturnType = new GenericType<IdentityRefWithVote>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Add reviewers to a pull request.
   * @param organization The name of the Azure DevOps organization. (required)
   * @param body Reviewers to add to the pull request. (required)
   * @param repositoryId The repository ID of the pull request&#39;s target branch. (required)
   * @param pullRequestId ID of the pull request. (required)
   * @param project Project ID or project name (required)
   * @param apiVersion Version of the API to use.  This should be set to &#39;7.2-preview.1&#39; to use this version of the api. (required)
   * @return List<IdentityRefWithVote>
   * @throws ApiException if fails to make API call
   */
  public List<IdentityRefWithVote> pullRequestReviewersCreatePullRequestReviewers(String organization, List<IdentityRef> body, String repositoryId, Integer pullRequestId, String project, String apiVersion) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling pullRequestReviewersCreatePullRequestReviewers");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling pullRequestReviewersCreatePullRequestReviewers");
    }
    
    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling pullRequestReviewersCreatePullRequestReviewers");
    }
    
    // verify the required parameter 'pullRequestId' is set
    if (pullRequestId == null) {
      throw new ApiException(400, "Missing the required parameter 'pullRequestId' when calling pullRequestReviewersCreatePullRequestReviewers");
    }
    
    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling pullRequestReviewersCreatePullRequestReviewers");
    }
    
    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling pullRequestReviewersCreatePullRequestReviewers");
    }
    
    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/reviewers".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
      .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()))
      .replaceAll("\\{" + "pullRequestId" + "\\}", apiClient.escapeString(pullRequestId.toString()))
      .replaceAll("\\{" + "project" + "\\}", apiClient.escapeString(project.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "api-version", apiVersion));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2", "accessToken" };

    GenericType<List<IdentityRefWithVote>> localVarReturnType = new GenericType<List<IdentityRefWithVote>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Add an unmaterialized identity to the reviewers of a pull request.
   * @param organization The name of the Azure DevOps organization. (required)
   * @param body Reviewer to add to the pull request. (required)
   * @param repositoryId The repository ID of the pull request&#39;s target branch. (required)
   * @param pullRequestId ID of the pull request. (required)
   * @param project Project ID or project name (required)
   * @param apiVersion Version of the API to use.  This should be set to &#39;7.2-preview.1&#39; to use this version of the api. (required)
   * @return IdentityRefWithVote
   * @throws ApiException if fails to make API call
   */
  public IdentityRefWithVote pullRequestReviewersCreateUnmaterializedPullRequestReviewer(String organization, IdentityRefWithVote body, String repositoryId, Integer pullRequestId, String project, String apiVersion) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling pullRequestReviewersCreateUnmaterializedPullRequestReviewer");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling pullRequestReviewersCreateUnmaterializedPullRequestReviewer");
    }
    
    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling pullRequestReviewersCreateUnmaterializedPullRequestReviewer");
    }
    
    // verify the required parameter 'pullRequestId' is set
    if (pullRequestId == null) {
      throw new ApiException(400, "Missing the required parameter 'pullRequestId' when calling pullRequestReviewersCreateUnmaterializedPullRequestReviewer");
    }
    
    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling pullRequestReviewersCreateUnmaterializedPullRequestReviewer");
    }
    
    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling pullRequestReviewersCreateUnmaterializedPullRequestReviewer");
    }
    
    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/reviewers".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
      .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()))
      .replaceAll("\\{" + "pullRequestId" + "\\}", apiClient.escapeString(pullRequestId.toString()))
      .replaceAll("\\{" + "project" + "\\}", apiClient.escapeString(project.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "api-version", apiVersion));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2", "accessToken" };

    GenericType<IdentityRefWithVote> localVarReturnType = new GenericType<IdentityRefWithVote>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Remove a reviewer from a pull request.
   * @param organization The name of the Azure DevOps organization. (required)
   * @param repositoryId The repository ID of the pull request&#39;s target branch. (required)
   * @param pullRequestId ID of the pull request. (required)
   * @param reviewerId ID of the reviewer to remove. (required)
   * @param project Project ID or project name (required)
   * @param apiVersion Version of the API to use.  This should be set to &#39;7.2-preview.1&#39; to use this version of the api. (required)
   * @throws ApiException if fails to make API call
   */
  public void pullRequestReviewersDelete(String organization, String repositoryId, Integer pullRequestId, String reviewerId, String project, String apiVersion) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling pullRequestReviewersDelete");
    }
    
    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling pullRequestReviewersDelete");
    }
    
    // verify the required parameter 'pullRequestId' is set
    if (pullRequestId == null) {
      throw new ApiException(400, "Missing the required parameter 'pullRequestId' when calling pullRequestReviewersDelete");
    }
    
    // verify the required parameter 'reviewerId' is set
    if (reviewerId == null) {
      throw new ApiException(400, "Missing the required parameter 'reviewerId' when calling pullRequestReviewersDelete");
    }
    
    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling pullRequestReviewersDelete");
    }
    
    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling pullRequestReviewersDelete");
    }
    
    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/reviewers/{reviewerId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
      .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()))
      .replaceAll("\\{" + "pullRequestId" + "\\}", apiClient.escapeString(pullRequestId.toString()))
      .replaceAll("\\{" + "reviewerId" + "\\}", apiClient.escapeString(reviewerId.toString()))
      .replaceAll("\\{" + "project" + "\\}", apiClient.escapeString(project.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "api-version", apiVersion));

    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2", "accessToken" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * 
   * Retrieve information about a particular reviewer on a pull request
   * @param organization The name of the Azure DevOps organization. (required)
   * @param repositoryId The repository ID of the pull request&#39;s target branch. (required)
   * @param pullRequestId ID of the pull request. (required)
   * @param reviewerId ID of the reviewer. (required)
   * @param project Project ID or project name (required)
   * @param apiVersion Version of the API to use.  This should be set to &#39;7.2-preview.1&#39; to use this version of the api. (required)
   * @return IdentityRefWithVote
   * @throws ApiException if fails to make API call
   */
  public IdentityRefWithVote pullRequestReviewersGet(String organization, String repositoryId, Integer pullRequestId, String reviewerId, String project, String apiVersion) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling pullRequestReviewersGet");
    }
    
    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling pullRequestReviewersGet");
    }
    
    // verify the required parameter 'pullRequestId' is set
    if (pullRequestId == null) {
      throw new ApiException(400, "Missing the required parameter 'pullRequestId' when calling pullRequestReviewersGet");
    }
    
    // verify the required parameter 'reviewerId' is set
    if (reviewerId == null) {
      throw new ApiException(400, "Missing the required parameter 'reviewerId' when calling pullRequestReviewersGet");
    }
    
    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling pullRequestReviewersGet");
    }
    
    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling pullRequestReviewersGet");
    }
    
    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/reviewers/{reviewerId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
      .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()))
      .replaceAll("\\{" + "pullRequestId" + "\\}", apiClient.escapeString(pullRequestId.toString()))
      .replaceAll("\\{" + "reviewerId" + "\\}", apiClient.escapeString(reviewerId.toString()))
      .replaceAll("\\{" + "project" + "\\}", apiClient.escapeString(project.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "api-version", apiVersion));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2", "accessToken" };

    GenericType<IdentityRefWithVote> localVarReturnType = new GenericType<IdentityRefWithVote>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Retrieve the reviewers for a pull request
   * @param organization The name of the Azure DevOps organization. (required)
   * @param repositoryId The repository ID of the pull request&#39;s target branch. (required)
   * @param pullRequestId ID of the pull request. (required)
   * @param project Project ID or project name (required)
   * @param apiVersion Version of the API to use.  This should be set to &#39;7.2-preview.1&#39; to use this version of the api. (required)
   * @return List<IdentityRefWithVote>
   * @throws ApiException if fails to make API call
   */
  public List<IdentityRefWithVote> pullRequestReviewersList(String organization, String repositoryId, Integer pullRequestId, String project, String apiVersion) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling pullRequestReviewersList");
    }
    
    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling pullRequestReviewersList");
    }
    
    // verify the required parameter 'pullRequestId' is set
    if (pullRequestId == null) {
      throw new ApiException(400, "Missing the required parameter 'pullRequestId' when calling pullRequestReviewersList");
    }
    
    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling pullRequestReviewersList");
    }
    
    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling pullRequestReviewersList");
    }
    
    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/reviewers".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
      .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()))
      .replaceAll("\\{" + "pullRequestId" + "\\}", apiClient.escapeString(pullRequestId.toString()))
      .replaceAll("\\{" + "project" + "\\}", apiClient.escapeString(project.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "api-version", apiVersion));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2", "accessToken" };

    GenericType<List<IdentityRefWithVote>> localVarReturnType = new GenericType<List<IdentityRefWithVote>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Edit a reviewer entry. These fields are patchable: isFlagged, hasDeclined
   * @param organization The name of the Azure DevOps organization. (required)
   * @param body Reviewer data.&lt;br /&gt;If the reviewer&#39;s ID is included here, it must match the reviewerID parameter. (required)
   * @param repositoryId The repository ID of the pull request&#39;s target branch. (required)
   * @param pullRequestId ID of the pull request. (required)
   * @param reviewerId ID of the reviewer. (required)
   * @param project Project ID or project name (required)
   * @param apiVersion Version of the API to use.  This should be set to &#39;7.2-preview.1&#39; to use this version of the api. (required)
   * @return IdentityRefWithVote
   * @throws ApiException if fails to make API call
   */
  public IdentityRefWithVote pullRequestReviewersUpdatePullRequestReviewer(String organization, IdentityRefWithVote body, String repositoryId, Integer pullRequestId, String reviewerId, String project, String apiVersion) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling pullRequestReviewersUpdatePullRequestReviewer");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling pullRequestReviewersUpdatePullRequestReviewer");
    }
    
    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling pullRequestReviewersUpdatePullRequestReviewer");
    }
    
    // verify the required parameter 'pullRequestId' is set
    if (pullRequestId == null) {
      throw new ApiException(400, "Missing the required parameter 'pullRequestId' when calling pullRequestReviewersUpdatePullRequestReviewer");
    }
    
    // verify the required parameter 'reviewerId' is set
    if (reviewerId == null) {
      throw new ApiException(400, "Missing the required parameter 'reviewerId' when calling pullRequestReviewersUpdatePullRequestReviewer");
    }
    
    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling pullRequestReviewersUpdatePullRequestReviewer");
    }
    
    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling pullRequestReviewersUpdatePullRequestReviewer");
    }
    
    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/reviewers/{reviewerId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
      .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()))
      .replaceAll("\\{" + "pullRequestId" + "\\}", apiClient.escapeString(pullRequestId.toString()))
      .replaceAll("\\{" + "reviewerId" + "\\}", apiClient.escapeString(reviewerId.toString()))
      .replaceAll("\\{" + "project" + "\\}", apiClient.escapeString(project.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "api-version", apiVersion));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2", "accessToken" };

    GenericType<IdentityRefWithVote> localVarReturnType = new GenericType<IdentityRefWithVote>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Reset the votes of multiple reviewers on a pull request.  NOTE: This endpoint only supports updating votes, but does not support updating required reviewers (use policy) or display names.
   * @param organization The name of the Azure DevOps organization. (required)
   * @param body IDs of the reviewers whose votes will be reset to zero (required)
   * @param repositoryId The repository ID of the pull request&#39;s target branch. (required)
   * @param pullRequestId ID of the pull request (required)
   * @param project Project ID or project name (required)
   * @param apiVersion Version of the API to use.  This should be set to &#39;7.2-preview.1&#39; to use this version of the api. (required)
   * @throws ApiException if fails to make API call
   */
  public void pullRequestReviewersUpdatePullRequestReviewers(String organization, List<IdentityRefWithVote> body, String repositoryId, Integer pullRequestId, String project, String apiVersion) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling pullRequestReviewersUpdatePullRequestReviewers");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling pullRequestReviewersUpdatePullRequestReviewers");
    }
    
    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling pullRequestReviewersUpdatePullRequestReviewers");
    }
    
    // verify the required parameter 'pullRequestId' is set
    if (pullRequestId == null) {
      throw new ApiException(400, "Missing the required parameter 'pullRequestId' when calling pullRequestReviewersUpdatePullRequestReviewers");
    }
    
    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling pullRequestReviewersUpdatePullRequestReviewers");
    }
    
    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling pullRequestReviewersUpdatePullRequestReviewers");
    }
    
    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/reviewers".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
      .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()))
      .replaceAll("\\{" + "pullRequestId" + "\\}", apiClient.escapeString(pullRequestId.toString()))
      .replaceAll("\\{" + "project" + "\\}", apiClient.escapeString(project.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "api-version", apiVersion));

    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2", "accessToken" };


    apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
