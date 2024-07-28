package therealflamingo.ado.api;

import therealflamingo.ado.invoker.ApiException;
import therealflamingo.ado.invoker.ApiClient;
import therealflamingo.ado.invoker.Configuration;
import therealflamingo.ado.invoker.Pair;

import javax.ws.rs.core.GenericType;

import therealflamingo.ado.models.IdentityRef;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class PullRequestCommentLikesApi {
  private ApiClient apiClient;

  public PullRequestCommentLikesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PullRequestCommentLikesApi(ApiClient apiClient) {
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
   * Add a like on a comment.
   * @param organization The name of the Azure DevOps organization. (required)
   * @param repositoryId The repository ID of the pull request&#39;s target branch. (required)
   * @param pullRequestId ID of the pull request. (required)
   * @param threadId The ID of the thread that contains the comment. (required)
   * @param commentId The ID of the comment. (required)
   * @param project Project ID or project name (required)
   * @param apiVersion Version of the API to use.  This should be set to &#39;7.2-preview.1&#39; to use this version of the api. (required)
   * @throws ApiException if fails to make API call
   */
  public void pullRequestCommentLikesCreate(String organization, String repositoryId, Integer pullRequestId, Integer threadId, Integer commentId, String project, String apiVersion) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling pullRequestCommentLikesCreate");
    }
    
    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling pullRequestCommentLikesCreate");
    }
    
    // verify the required parameter 'pullRequestId' is set
    if (pullRequestId == null) {
      throw new ApiException(400, "Missing the required parameter 'pullRequestId' when calling pullRequestCommentLikesCreate");
    }
    
    // verify the required parameter 'threadId' is set
    if (threadId == null) {
      throw new ApiException(400, "Missing the required parameter 'threadId' when calling pullRequestCommentLikesCreate");
    }
    
    // verify the required parameter 'commentId' is set
    if (commentId == null) {
      throw new ApiException(400, "Missing the required parameter 'commentId' when calling pullRequestCommentLikesCreate");
    }
    
    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling pullRequestCommentLikesCreate");
    }
    
    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling pullRequestCommentLikesCreate");
    }
    
    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/threads/{threadId}/comments/{commentId}/likes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
      .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()))
      .replaceAll("\\{" + "pullRequestId" + "\\}", apiClient.escapeString(pullRequestId.toString()))
      .replaceAll("\\{" + "threadId" + "\\}", apiClient.escapeString(threadId.toString()))
      .replaceAll("\\{" + "commentId" + "\\}", apiClient.escapeString(commentId.toString()))
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


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * 
   * Delete a like on a comment.
   * @param organization The name of the Azure DevOps organization. (required)
   * @param repositoryId The repository ID of the pull request&#39;s target branch. (required)
   * @param pullRequestId ID of the pull request. (required)
   * @param threadId The ID of the thread that contains the comment. (required)
   * @param commentId The ID of the comment. (required)
   * @param project Project ID or project name (required)
   * @param apiVersion Version of the API to use.  This should be set to &#39;7.2-preview.1&#39; to use this version of the api. (required)
   * @throws ApiException if fails to make API call
   */
  public void pullRequestCommentLikesDelete(String organization, String repositoryId, Integer pullRequestId, Integer threadId, Integer commentId, String project, String apiVersion) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling pullRequestCommentLikesDelete");
    }
    
    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling pullRequestCommentLikesDelete");
    }
    
    // verify the required parameter 'pullRequestId' is set
    if (pullRequestId == null) {
      throw new ApiException(400, "Missing the required parameter 'pullRequestId' when calling pullRequestCommentLikesDelete");
    }
    
    // verify the required parameter 'threadId' is set
    if (threadId == null) {
      throw new ApiException(400, "Missing the required parameter 'threadId' when calling pullRequestCommentLikesDelete");
    }
    
    // verify the required parameter 'commentId' is set
    if (commentId == null) {
      throw new ApiException(400, "Missing the required parameter 'commentId' when calling pullRequestCommentLikesDelete");
    }
    
    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling pullRequestCommentLikesDelete");
    }
    
    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling pullRequestCommentLikesDelete");
    }
    
    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/threads/{threadId}/comments/{commentId}/likes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
      .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()))
      .replaceAll("\\{" + "pullRequestId" + "\\}", apiClient.escapeString(pullRequestId.toString()))
      .replaceAll("\\{" + "threadId" + "\\}", apiClient.escapeString(threadId.toString()))
      .replaceAll("\\{" + "commentId" + "\\}", apiClient.escapeString(commentId.toString()))
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
   * Get likes for a comment.
   * @param organization The name of the Azure DevOps organization. (required)
   * @param repositoryId The repository ID of the pull request&#39;s target branch. (required)
   * @param pullRequestId ID of the pull request. (required)
   * @param threadId The ID of the thread that contains the comment. (required)
   * @param commentId The ID of the comment. (required)
   * @param project Project ID or project name (required)
   * @param apiVersion Version of the API to use.  This should be set to &#39;7.2-preview.1&#39; to use this version of the api. (required)
   * @return List<IdentityRef>
   * @throws ApiException if fails to make API call
   */
  public List<IdentityRef> pullRequestCommentLikesList(String organization, String repositoryId, Integer pullRequestId, Integer threadId, Integer commentId, String project, String apiVersion) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling pullRequestCommentLikesList");
    }
    
    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling pullRequestCommentLikesList");
    }
    
    // verify the required parameter 'pullRequestId' is set
    if (pullRequestId == null) {
      throw new ApiException(400, "Missing the required parameter 'pullRequestId' when calling pullRequestCommentLikesList");
    }
    
    // verify the required parameter 'threadId' is set
    if (threadId == null) {
      throw new ApiException(400, "Missing the required parameter 'threadId' when calling pullRequestCommentLikesList");
    }
    
    // verify the required parameter 'commentId' is set
    if (commentId == null) {
      throw new ApiException(400, "Missing the required parameter 'commentId' when calling pullRequestCommentLikesList");
    }
    
    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling pullRequestCommentLikesList");
    }
    
    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling pullRequestCommentLikesList");
    }
    
    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/threads/{threadId}/comments/{commentId}/likes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
      .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()))
      .replaceAll("\\{" + "pullRequestId" + "\\}", apiClient.escapeString(pullRequestId.toString()))
      .replaceAll("\\{" + "threadId" + "\\}", apiClient.escapeString(threadId.toString()))
      .replaceAll("\\{" + "commentId" + "\\}", apiClient.escapeString(commentId.toString()))
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

    GenericType<List<IdentityRef>> localVarReturnType = new GenericType<List<IdentityRef>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
