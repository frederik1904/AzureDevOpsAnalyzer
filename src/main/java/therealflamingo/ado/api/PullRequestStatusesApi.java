package therealflamingo.ado.api;

import therealflamingo.ado.invoker.ApiException;
import therealflamingo.ado.invoker.ApiClient;
import therealflamingo.ado.invoker.Configuration;
import therealflamingo.ado.invoker.Pair;

import javax.ws.rs.core.GenericType;

import therealflamingo.ado.models.GitPullRequestStatus;
import therealflamingo.ado.models.JsonPatchDocument;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class PullRequestStatusesApi {
  private ApiClient apiClient;

  public PullRequestStatusesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PullRequestStatusesApi(ApiClient apiClient) {
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
   * Create a pull request status.  The only required field for the status is &#x60;Context.Name&#x60; that uniquely identifies the status. Note that you can specify iterationId in the request body to post the status on the iteration.
   * @param organization The name of the Azure DevOps organization. (required)
   * @param body Pull request status to create. (required)
   * @param repositoryId The repository ID of the pull request’s target branch. (required)
   * @param pullRequestId ID of the pull request. (required)
   * @param project Project ID or project name (required)
   * @param apiVersion Version of the API to use.  This should be set to &#39;7.2-preview.2&#39; to use this version of the api. (required)
   * @return GitPullRequestStatus
   * @throws ApiException if fails to make API call
   */
  public GitPullRequestStatus pullRequestStatusesCreate(String organization, GitPullRequestStatus body, String repositoryId, Integer pullRequestId, String project, String apiVersion) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling pullRequestStatusesCreate");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling pullRequestStatusesCreate");
    }
    
    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling pullRequestStatusesCreate");
    }
    
    // verify the required parameter 'pullRequestId' is set
    if (pullRequestId == null) {
      throw new ApiException(400, "Missing the required parameter 'pullRequestId' when calling pullRequestStatusesCreate");
    }
    
    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling pullRequestStatusesCreate");
    }
    
    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling pullRequestStatusesCreate");
    }
    
    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/statuses".replaceAll("\\{format\\}","json")
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

    GenericType<GitPullRequestStatus> localVarReturnType = new GenericType<GitPullRequestStatus>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Delete pull request status.  You can remove multiple statuses in one call by using Update operation.
   * @param organization The name of the Azure DevOps organization. (required)
   * @param repositoryId The repository ID of the pull request’s target branch. (required)
   * @param pullRequestId ID of the pull request. (required)
   * @param statusId ID of the pull request status. (required)
   * @param project Project ID or project name (required)
   * @param apiVersion Version of the API to use.  This should be set to &#39;7.2-preview.2&#39; to use this version of the api. (required)
   * @throws ApiException if fails to make API call
   */
  public void pullRequestStatusesDelete(String organization, String repositoryId, Integer pullRequestId, Integer statusId, String project, String apiVersion) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling pullRequestStatusesDelete");
    }
    
    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling pullRequestStatusesDelete");
    }
    
    // verify the required parameter 'pullRequestId' is set
    if (pullRequestId == null) {
      throw new ApiException(400, "Missing the required parameter 'pullRequestId' when calling pullRequestStatusesDelete");
    }
    
    // verify the required parameter 'statusId' is set
    if (statusId == null) {
      throw new ApiException(400, "Missing the required parameter 'statusId' when calling pullRequestStatusesDelete");
    }
    
    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling pullRequestStatusesDelete");
    }
    
    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling pullRequestStatusesDelete");
    }
    
    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/statuses/{statusId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
      .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()))
      .replaceAll("\\{" + "pullRequestId" + "\\}", apiClient.escapeString(pullRequestId.toString()))
      .replaceAll("\\{" + "statusId" + "\\}", apiClient.escapeString(statusId.toString()))
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
   * Get the specific pull request status by ID. The status ID is unique within the pull request across all iterations.
   * @param organization The name of the Azure DevOps organization. (required)
   * @param repositoryId The repository ID of the pull request’s target branch. (required)
   * @param pullRequestId ID of the pull request. (required)
   * @param statusId ID of the pull request status. (required)
   * @param project Project ID or project name (required)
   * @param apiVersion Version of the API to use.  This should be set to &#39;7.2-preview.2&#39; to use this version of the api. (required)
   * @return GitPullRequestStatus
   * @throws ApiException if fails to make API call
   */
  public GitPullRequestStatus pullRequestStatusesGet(String organization, String repositoryId, Integer pullRequestId, Integer statusId, String project, String apiVersion) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling pullRequestStatusesGet");
    }
    
    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling pullRequestStatusesGet");
    }
    
    // verify the required parameter 'pullRequestId' is set
    if (pullRequestId == null) {
      throw new ApiException(400, "Missing the required parameter 'pullRequestId' when calling pullRequestStatusesGet");
    }
    
    // verify the required parameter 'statusId' is set
    if (statusId == null) {
      throw new ApiException(400, "Missing the required parameter 'statusId' when calling pullRequestStatusesGet");
    }
    
    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling pullRequestStatusesGet");
    }
    
    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling pullRequestStatusesGet");
    }
    
    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/statuses/{statusId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
      .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()))
      .replaceAll("\\{" + "pullRequestId" + "\\}", apiClient.escapeString(pullRequestId.toString()))
      .replaceAll("\\{" + "statusId" + "\\}", apiClient.escapeString(statusId.toString()))
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

    GenericType<GitPullRequestStatus> localVarReturnType = new GenericType<GitPullRequestStatus>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Get all the statuses associated with a pull request.
   * @param organization The name of the Azure DevOps organization. (required)
   * @param repositoryId The repository ID of the pull request’s target branch. (required)
   * @param pullRequestId ID of the pull request. (required)
   * @param project Project ID or project name (required)
   * @param apiVersion Version of the API to use.  This should be set to &#39;7.2-preview.2&#39; to use this version of the api. (required)
   * @return List<GitPullRequestStatus>
   * @throws ApiException if fails to make API call
   */
  public List<GitPullRequestStatus> pullRequestStatusesList(String organization, String repositoryId, Integer pullRequestId, String project, String apiVersion) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling pullRequestStatusesList");
    }
    
    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling pullRequestStatusesList");
    }
    
    // verify the required parameter 'pullRequestId' is set
    if (pullRequestId == null) {
      throw new ApiException(400, "Missing the required parameter 'pullRequestId' when calling pullRequestStatusesList");
    }
    
    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling pullRequestStatusesList");
    }
    
    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling pullRequestStatusesList");
    }
    
    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/statuses".replaceAll("\\{format\\}","json")
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

    GenericType<List<GitPullRequestStatus>> localVarReturnType = new GenericType<List<GitPullRequestStatus>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Update pull request statuses collection. The only supported operation type is &#x60;remove&#x60;.  This operation allows to delete multiple statuses in one call. The path of the &#x60;remove&#x60; operation should refer to the ID of the pull request status. For example &#x60;path&#x3D;\&quot;/1\&quot;&#x60; refers to the pull request status with ID 1.
   * @param organization The name of the Azure DevOps organization. (required)
   * @param body Operations to apply to the pull request statuses in JSON Patch format. (required)
   * @param repositoryId The repository ID of the pull request’s target branch. (required)
   * @param pullRequestId ID of the pull request. (required)
   * @param project Project ID or project name (required)
   * @param apiVersion Version of the API to use.  This should be set to &#39;7.2-preview.2&#39; to use this version of the api. (required)
   * @throws ApiException if fails to make API call
   */
  public void pullRequestStatusesUpdate(String organization, JsonPatchDocument body, String repositoryId, Integer pullRequestId, String project, String apiVersion) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling pullRequestStatusesUpdate");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling pullRequestStatusesUpdate");
    }
    
    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling pullRequestStatusesUpdate");
    }
    
    // verify the required parameter 'pullRequestId' is set
    if (pullRequestId == null) {
      throw new ApiException(400, "Missing the required parameter 'pullRequestId' when calling pullRequestStatusesUpdate");
    }
    
    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling pullRequestStatusesUpdate");
    }
    
    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling pullRequestStatusesUpdate");
    }
    
    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/statuses".replaceAll("\\{format\\}","json")
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
      "application/json-patch+json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2", "accessToken" };


    apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
