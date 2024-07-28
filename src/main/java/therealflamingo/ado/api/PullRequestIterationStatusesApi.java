package therealflamingo.ado.api;

import therealflamingo.ado.invoker.ApiClient;
import therealflamingo.ado.invoker.ApiException;
import therealflamingo.ado.invoker.Configuration;
import therealflamingo.ado.invoker.Pair;
import therealflamingo.ado.models.GitPullRequestStatus;
import therealflamingo.ado.models.JsonPatchDocument;

import javax.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class PullRequestIterationStatusesApi {
  private ApiClient apiClient;

  public PullRequestIterationStatusesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PullRequestIterationStatusesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a pull request status on the iteration. This operation will have the same result as Create status on pull request with specified iteration ID in the request body.  The only required field for the status is &#x60;Context.Name&#x60; that uniquely identifies the status. Note that &#x60;iterationId&#x60; in the request body is optional since &#x60;iterationId&#x60; can be specified in the URL. A conflict between &#x60;iterationId&#x60; in the URL and &#x60;iterationId&#x60; in the request body will result in status code 400.
   *
   * @param organization  The name of the Azure DevOps organization. (required)
   * @param body          Pull request status to create. (required)
   * @param repositoryId  The repository ID of the pull request’s target branch. (required)
   * @param pullRequestId ID of the pull request. (required)
   * @param iterationId   ID of the pull request iteration. (required)
   * @param project       Project ID or project name (required)
   * @param apiVersion    Version of the API to use.  This should be set to &#39;7.2-preview.2&#39; to use this version of the api. (required)
   * @return GitPullRequestStatus
   * @throws ApiException if fails to make API call
   */
  public GitPullRequestStatus pullRequestIterationStatusesCreate(String organization, GitPullRequestStatus body, String repositoryId, Integer pullRequestId, Integer iterationId, String project, String apiVersion) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling pullRequestIterationStatusesCreate");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling pullRequestIterationStatusesCreate");
    }

    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling pullRequestIterationStatusesCreate");
    }

    // verify the required parameter 'pullRequestId' is set
    if (pullRequestId == null) {
      throw new ApiException(400, "Missing the required parameter 'pullRequestId' when calling pullRequestIterationStatusesCreate");
    }

    // verify the required parameter 'iterationId' is set
    if (iterationId == null) {
      throw new ApiException(400, "Missing the required parameter 'iterationId' when calling pullRequestIterationStatusesCreate");
    }

    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling pullRequestIterationStatusesCreate");
    }

    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling pullRequestIterationStatusesCreate");
    }

    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/iterations/{iterationId}/statuses".replaceAll("\\{format\\}", "json")
            .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
            .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()))
            .replaceAll("\\{" + "pullRequestId" + "\\}", apiClient.escapeString(pullRequestId.toString()))
            .replaceAll("\\{" + "iterationId" + "\\}", apiClient.escapeString(iterationId.toString()))
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

    String[] localVarAuthNames = new String[]{"oauth2", "accessToken"};

    GenericType<GitPullRequestStatus> localVarReturnType = new GenericType<GitPullRequestStatus>() {
    };
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  /**
   * Delete pull request iteration status.  You can remove multiple statuses in one call by using Update operation.
   *
   * @param organization  The name of the Azure DevOps organization. (required)
   * @param repositoryId  The repository ID of the pull request’s target branch. (required)
   * @param pullRequestId ID of the pull request. (required)
   * @param iterationId   ID of the pull request iteration. (required)
   * @param statusId      ID of the pull request status. (required)
   * @param project       Project ID or project name (required)
   * @param apiVersion    Version of the API to use.  This should be set to &#39;7.2-preview.2&#39; to use this version of the api. (required)
   * @throws ApiException if fails to make API call
   */
  public void pullRequestIterationStatusesDelete(String organization, String repositoryId, Integer pullRequestId, Integer iterationId, Integer statusId, String project, String apiVersion) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling pullRequestIterationStatusesDelete");
    }

    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling pullRequestIterationStatusesDelete");
    }

    // verify the required parameter 'pullRequestId' is set
    if (pullRequestId == null) {
      throw new ApiException(400, "Missing the required parameter 'pullRequestId' when calling pullRequestIterationStatusesDelete");
    }

    // verify the required parameter 'iterationId' is set
    if (iterationId == null) {
      throw new ApiException(400, "Missing the required parameter 'iterationId' when calling pullRequestIterationStatusesDelete");
    }

    // verify the required parameter 'statusId' is set
    if (statusId == null) {
      throw new ApiException(400, "Missing the required parameter 'statusId' when calling pullRequestIterationStatusesDelete");
    }

    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling pullRequestIterationStatusesDelete");
    }

    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling pullRequestIterationStatusesDelete");
    }

    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/iterations/{iterationId}/statuses/{statusId}".replaceAll("\\{format\\}", "json")
            .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
            .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()))
            .replaceAll("\\{" + "pullRequestId" + "\\}", apiClient.escapeString(pullRequestId.toString()))
            .replaceAll("\\{" + "iterationId" + "\\}", apiClient.escapeString(iterationId.toString()))
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

    String[] localVarAuthNames = new String[]{"oauth2", "accessToken"};


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }

  /**
   * Get the specific pull request iteration status by ID. The status ID is unique within the pull request across all iterations.
   *
   * @param organization  The name of the Azure DevOps organization. (required)
   * @param repositoryId  The repository ID of the pull request’s target branch. (required)
   * @param pullRequestId ID of the pull request. (required)
   * @param iterationId   ID of the pull request iteration. (required)
   * @param statusId      ID of the pull request status. (required)
   * @param project       Project ID or project name (required)
   * @param apiVersion    Version of the API to use.  This should be set to &#39;7.2-preview.2&#39; to use this version of the api. (required)
   * @return GitPullRequestStatus
   * @throws ApiException if fails to make API call
   */
  public GitPullRequestStatus pullRequestIterationStatusesGet(String organization, String repositoryId, Integer pullRequestId, Integer iterationId, Integer statusId, String project, String apiVersion) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling pullRequestIterationStatusesGet");
    }

    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling pullRequestIterationStatusesGet");
    }

    // verify the required parameter 'pullRequestId' is set
    if (pullRequestId == null) {
      throw new ApiException(400, "Missing the required parameter 'pullRequestId' when calling pullRequestIterationStatusesGet");
    }

    // verify the required parameter 'iterationId' is set
    if (iterationId == null) {
      throw new ApiException(400, "Missing the required parameter 'iterationId' when calling pullRequestIterationStatusesGet");
    }

    // verify the required parameter 'statusId' is set
    if (statusId == null) {
      throw new ApiException(400, "Missing the required parameter 'statusId' when calling pullRequestIterationStatusesGet");
    }

    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling pullRequestIterationStatusesGet");
    }

    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling pullRequestIterationStatusesGet");
    }

    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/iterations/{iterationId}/statuses/{statusId}".replaceAll("\\{format\\}", "json")
            .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
            .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()))
            .replaceAll("\\{" + "pullRequestId" + "\\}", apiClient.escapeString(pullRequestId.toString()))
            .replaceAll("\\{" + "iterationId" + "\\}", apiClient.escapeString(iterationId.toString()))
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

    String[] localVarAuthNames = new String[]{"oauth2", "accessToken"};

    GenericType<GitPullRequestStatus> localVarReturnType = new GenericType<GitPullRequestStatus>() {
    };
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  /**
   * Get all the statuses associated with a pull request iteration.
   *
   * @param organization  The name of the Azure DevOps organization. (required)
   * @param repositoryId  The repository ID of the pull request’s target branch. (required)
   * @param pullRequestId ID of the pull request. (required)
   * @param iterationId   ID of the pull request iteration. (required)
   * @param project       Project ID or project name (required)
   * @param apiVersion    Version of the API to use.  This should be set to &#39;7.2-preview.2&#39; to use this version of the api. (required)
   * @return List<GitPullRequestStatus>
   * @throws ApiException if fails to make API call
   */
  public List<GitPullRequestStatus> pullRequestIterationStatusesList(String organization, String repositoryId, Integer pullRequestId, Integer iterationId, String project, String apiVersion) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling pullRequestIterationStatusesList");
    }

    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling pullRequestIterationStatusesList");
    }

    // verify the required parameter 'pullRequestId' is set
    if (pullRequestId == null) {
      throw new ApiException(400, "Missing the required parameter 'pullRequestId' when calling pullRequestIterationStatusesList");
    }

    // verify the required parameter 'iterationId' is set
    if (iterationId == null) {
      throw new ApiException(400, "Missing the required parameter 'iterationId' when calling pullRequestIterationStatusesList");
    }

    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling pullRequestIterationStatusesList");
    }

    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling pullRequestIterationStatusesList");
    }

    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/iterations/{iterationId}/statuses".replaceAll("\\{format\\}", "json")
            .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
            .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()))
            .replaceAll("\\{" + "pullRequestId" + "\\}", apiClient.escapeString(pullRequestId.toString()))
            .replaceAll("\\{" + "iterationId" + "\\}", apiClient.escapeString(iterationId.toString()))
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

    String[] localVarAuthNames = new String[]{"oauth2", "accessToken"};

    GenericType<List<GitPullRequestStatus>> localVarReturnType = new GenericType<List<GitPullRequestStatus>>() {
    };
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  /**
   * Update pull request iteration statuses collection. The only supported operation type is &#x60;remove&#x60;.  This operation allows to delete multiple statuses in one call. The path of the &#x60;remove&#x60; operation should refer to the ID of the pull request status. For example &#x60;path&#x3D;\&quot;/1\&quot;&#x60; refers to the pull request status with ID 1.
   *
   * @param organization  The name of the Azure DevOps organization. (required)
   * @param body          Operations to apply to the pull request statuses in JSON Patch format. (required)
   * @param repositoryId  The repository ID of the pull request’s target branch. (required)
   * @param pullRequestId ID of the pull request. (required)
   * @param iterationId   ID of the pull request iteration. (required)
   * @param project       Project ID or project name (required)
   * @param apiVersion    Version of the API to use.  This should be set to &#39;7.2-preview.2&#39; to use this version of the api. (required)
   * @throws ApiException if fails to make API call
   */
  public void pullRequestIterationStatusesUpdate(String organization, JsonPatchDocument body, String repositoryId, Integer pullRequestId, Integer iterationId, String project, String apiVersion) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling pullRequestIterationStatusesUpdate");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling pullRequestIterationStatusesUpdate");
    }

    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling pullRequestIterationStatusesUpdate");
    }

    // verify the required parameter 'pullRequestId' is set
    if (pullRequestId == null) {
      throw new ApiException(400, "Missing the required parameter 'pullRequestId' when calling pullRequestIterationStatusesUpdate");
    }

    // verify the required parameter 'iterationId' is set
    if (iterationId == null) {
      throw new ApiException(400, "Missing the required parameter 'iterationId' when calling pullRequestIterationStatusesUpdate");
    }

    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling pullRequestIterationStatusesUpdate");
    }

    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling pullRequestIterationStatusesUpdate");
    }

    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/iterations/{iterationId}/statuses".replaceAll("\\{format\\}", "json")
            .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
            .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()))
            .replaceAll("\\{" + "pullRequestId" + "\\}", apiClient.escapeString(pullRequestId.toString()))
            .replaceAll("\\{" + "iterationId" + "\\}", apiClient.escapeString(iterationId.toString()))
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

    String[] localVarAuthNames = new String[]{"oauth2", "accessToken"};


    apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
