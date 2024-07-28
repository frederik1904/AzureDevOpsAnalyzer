package therealflamingo.ado.api;

import org.threeten.bp.OffsetDateTime;
import therealflamingo.ado.invoker.ApiClient;
import therealflamingo.ado.invoker.ApiException;
import therealflamingo.ado.invoker.Configuration;
import therealflamingo.ado.invoker.Pair;
import therealflamingo.ado.models.GitPullRequest;

import javax.ws.rs.core.GenericType;
import java.util.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class PullRequestsApi {
  private ApiClient apiClient;

  public PullRequestsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PullRequestsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a pull request.
   *
   * @param organization       The name of the Azure DevOps organization. (required)
   * @param body               The pull request to create. (required)
   * @param repositoryId       The repository ID of the pull request&#39;s target branch. (required)
   * @param project            Project ID or project name (required)
   * @param apiVersion         Version of the API to use.  This should be set to &#39;7.2-preview.2&#39; to use this version of the api. (required)
   * @param supportsIterations If true, subsequent pushes to the pull request will be individually reviewable. Set this to false for large pull requests for performance reasons if this functionality is not needed. (optional)
   * @return GitPullRequest
   * @throws ApiException if fails to make API call
   */
  public GitPullRequest pullRequestsCreate(String organization, GitPullRequest body, String repositoryId, String project, String apiVersion, Boolean supportsIterations) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling pullRequestsCreate");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling pullRequestsCreate");
    }

    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling pullRequestsCreate");
    }

    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling pullRequestsCreate");
    }

    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling pullRequestsCreate");
    }

    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullrequests".replaceAll("\\{format\\}", "json")
            .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
            .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()))
            .replaceAll("\\{" + "project" + "\\}", apiClient.escapeString(project.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "supportsIterations", supportsIterations));
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

    GenericType<GitPullRequest> localVarReturnType = new GenericType<GitPullRequest>() {
    };
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  /**
   * Retrieve a pull request.
   *
   * @param organization        The name of the Azure DevOps organization. (required)
   * @param repositoryId        The repository ID of the pull request&#39;s target branch. (required)
   * @param pullRequestId       The ID of the pull request to retrieve. (required)
   * @param project             Project ID or project name (required)
   * @param apiVersion          Version of the API to use.  This should be set to &#39;7.2-preview.2&#39; to use this version of the api. (required)
   * @param maxCommentLength    Not used. (optional)
   * @param skip                Not used. (optional)
   * @param top                 Not used. (optional)
   * @param includeCommits      If true, the pull request will be returned with the associated commits. (optional)
   * @param includeWorkItemRefs If true, the pull request will be returned with the associated work item references. (optional)
   * @return GitPullRequest
   * @throws ApiException if fails to make API call
   */
  public GitPullRequest pullRequestsGetPullRequest(String organization, String repositoryId, Integer pullRequestId, String project, String apiVersion, Integer maxCommentLength, Integer skip, Integer top, Boolean includeCommits, Boolean includeWorkItemRefs) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling pullRequestsGetPullRequest");
    }

    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling pullRequestsGetPullRequest");
    }

    // verify the required parameter 'pullRequestId' is set
    if (pullRequestId == null) {
      throw new ApiException(400, "Missing the required parameter 'pullRequestId' when calling pullRequestsGetPullRequest");
    }

    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling pullRequestsGetPullRequest");
    }

    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling pullRequestsGetPullRequest");
    }

    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullrequests/{pullRequestId}".replaceAll("\\{format\\}", "json")
            .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
            .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()))
            .replaceAll("\\{" + "pullRequestId" + "\\}", apiClient.escapeString(pullRequestId.toString()))
            .replaceAll("\\{" + "project" + "\\}", apiClient.escapeString(project.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxCommentLength", maxCommentLength));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "$skip", skip));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "$top", top));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeCommits", includeCommits));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeWorkItemRefs", includeWorkItemRefs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "api-version", apiVersion));


    final String[] localVarAccepts = {
            "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {

    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[]{"oauth2", "accessToken"};

    GenericType<GitPullRequest> localVarReturnType = new GenericType<GitPullRequest>() {
    };
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  /**
   * Retrieve a pull request.
   *
   * @param organization  The name of the Azure DevOps organization. (required)
   * @param pullRequestId The ID of the pull request to retrieve. (required)
   * @param project       Project ID or project name (required)
   * @param apiVersion    Version of the API to use.  This should be set to &#39;7.2-preview.2&#39; to use this version of the api. (required)
   * @return GitPullRequest
   * @throws ApiException if fails to make API call
   */
  public GitPullRequest pullRequestsGetPullRequestById(String organization, Integer pullRequestId, String project, String apiVersion) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling pullRequestsGetPullRequestById");
    }

    // verify the required parameter 'pullRequestId' is set
    if (pullRequestId == null) {
      throw new ApiException(400, "Missing the required parameter 'pullRequestId' when calling pullRequestsGetPullRequestById");
    }

    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling pullRequestsGetPullRequestById");
    }

    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling pullRequestsGetPullRequestById");
    }

    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/pullrequests/{pullRequestId}".replaceAll("\\{format\\}", "json")
            .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
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

    String[] localVarAuthNames = new String[]{"oauth2", "accessToken"};

    GenericType<GitPullRequest> localVarReturnType = new GenericType<GitPullRequest>() {
    };
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  /**
   * Retrieve all pull requests matching a specified criteria.  Please note that description field will be truncated up to 400 symbols in the result.
   *
   * @param organization                     The name of the Azure DevOps organization. (required)
   * @param repositoryId                     The repository ID of the pull request&#39;s target branch. (required)
   * @param project                          Project ID or project name (required)
   * @param apiVersion                       Version of the API to use.  This should be set to &#39;7.2-preview.2&#39; to use this version of the api. (required)
   * @param searchCriteriaCreatorId          If set, search for pull requests that were created by this identity. (optional)
   * @param searchCriteriaIncludeLinks       Whether to include the _links field on the shallow references (optional)
   * @param searchCriteriaMaxTime            If specified, filters pull requests that created/closed before this date based on the queryTimeRangeType specified. (optional)
   * @param searchCriteriaMinTime            If specified, filters pull requests that created/closed after this date based on the queryTimeRangeType specified. (optional)
   * @param searchCriteriaQueryTimeRangeType The type of time range which should be used for minTime and maxTime. Defaults to Created if unset. (optional)
   * @param searchCriteriaRepositoryId       If set, search for pull requests whose target branch is in this repository. (optional)
   * @param searchCriteriaReviewerId         If set, search for pull requests that have this identity as a reviewer. (optional)
   * @param searchCriteriaSourceRefName      If set, search for pull requests from this branch. (optional)
   * @param searchCriteriaSourceRepositoryId If set, search for pull requests whose source branch is in this repository. (optional)
   * @param searchCriteriaStatus             If set, search for pull requests that are in this state. Defaults to Active if unset. (optional)
   * @param searchCriteriaTargetRefName      If set, search for pull requests into this branch. (optional)
   * @param maxCommentLength                 Not used. (optional)
   * @param skip                             The number of pull requests to ignore. For example, to retrieve results 101-150, set top to 50 and skip to 100. (optional)
   * @param top                              The number of pull requests to retrieve. (optional)
   * @return List<GitPullRequest>
   * @throws ApiException if fails to make API call
   */
  public List<GitPullRequest> pullRequestsGetPullRequests(String organization, String repositoryId, String project, String apiVersion, UUID searchCriteriaCreatorId, Boolean searchCriteriaIncludeLinks, OffsetDateTime searchCriteriaMaxTime, OffsetDateTime searchCriteriaMinTime, String searchCriteriaQueryTimeRangeType, UUID searchCriteriaRepositoryId, UUID searchCriteriaReviewerId, String searchCriteriaSourceRefName, UUID searchCriteriaSourceRepositoryId, String searchCriteriaStatus, String searchCriteriaTargetRefName, Integer maxCommentLength, Integer skip, Integer top) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling pullRequestsGetPullRequests");
    }

    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling pullRequestsGetPullRequests");
    }

    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling pullRequestsGetPullRequests");
    }

    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling pullRequestsGetPullRequests");
    }

    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullrequests".replaceAll("\\{format\\}", "json")
            .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
            .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()))
            .replaceAll("\\{" + "project" + "\\}", apiClient.escapeString(project.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchCriteria.creatorId", searchCriteriaCreatorId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchCriteria.includeLinks", searchCriteriaIncludeLinks));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchCriteria.maxTime", searchCriteriaMaxTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchCriteria.minTime", searchCriteriaMinTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchCriteria.queryTimeRangeType", searchCriteriaQueryTimeRangeType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchCriteria.repositoryId", searchCriteriaRepositoryId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchCriteria.reviewerId", searchCriteriaReviewerId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchCriteria.sourceRefName", searchCriteriaSourceRefName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchCriteria.sourceRepositoryId", searchCriteriaSourceRepositoryId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchCriteria.status", searchCriteriaStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchCriteria.targetRefName", searchCriteriaTargetRefName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxCommentLength", maxCommentLength));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "$skip", skip));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "$top", top));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "api-version", apiVersion));


    final String[] localVarAccepts = {
            "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {

    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[]{"oauth2", "accessToken"};

    GenericType<List<GitPullRequest>> localVarReturnType = new GenericType<List<GitPullRequest>>() {
    };
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  /**
   * Retrieve all pull requests matching a specified criteria.  Please note that description field will be truncated up to 400 symbols in the result.
   *
   * @param organization                     The name of the Azure DevOps organization. (required)
   * @param project                          Project ID or project name (required)
   * @param apiVersion                       Version of the API to use.  This should be set to &#39;7.2-preview.2&#39; to use this version of the api. (required)
   * @param searchCriteriaCreatorId          If set, search for pull requests that were created by this identity. (optional)
   * @param searchCriteriaIncludeLinks       Whether to include the _links field on the shallow references (optional)
   * @param searchCriteriaMaxTime            If specified, filters pull requests that created/closed before this date based on the queryTimeRangeType specified. (optional)
   * @param searchCriteriaMinTime            If specified, filters pull requests that created/closed after this date based on the queryTimeRangeType specified. (optional)
   * @param searchCriteriaQueryTimeRangeType The type of time range which should be used for minTime and maxTime. Defaults to Created if unset. (optional)
   * @param searchCriteriaRepositoryId       If set, search for pull requests whose target branch is in this repository. (optional)
   * @param searchCriteriaReviewerId         If set, search for pull requests that have this identity as a reviewer. (optional)
   * @param searchCriteriaSourceRefName      If set, search for pull requests from this branch. (optional)
   * @param searchCriteriaSourceRepositoryId If set, search for pull requests whose source branch is in this repository. (optional)
   * @param searchCriteriaStatus             If set, search for pull requests that are in this state. Defaults to Active if unset. (optional)
   * @param searchCriteriaTargetRefName      If set, search for pull requests into this branch. (optional)
   * @param maxCommentLength                 Not used. (optional)
   * @param skip                             The number of pull requests to ignore. For example, to retrieve results 101-150, set top to 50 and skip to 100. (optional)
   * @param top                              The number of pull requests to retrieve. (optional)
   * @return List<GitPullRequest>
   * @throws ApiException if fails to make API call
   */
  public List<GitPullRequest> pullRequestsGetPullRequestsByProject(String organization, String project, String apiVersion, UUID searchCriteriaCreatorId, Boolean searchCriteriaIncludeLinks, OffsetDateTime searchCriteriaMaxTime, OffsetDateTime searchCriteriaMinTime, String searchCriteriaQueryTimeRangeType, UUID searchCriteriaRepositoryId, UUID searchCriteriaReviewerId, String searchCriteriaSourceRefName, UUID searchCriteriaSourceRepositoryId, String searchCriteriaStatus, String searchCriteriaTargetRefName, Integer maxCommentLength, Integer skip, Integer top) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling pullRequestsGetPullRequestsByProject");
    }

    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling pullRequestsGetPullRequestsByProject");
    }

    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling pullRequestsGetPullRequestsByProject");
    }

    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/pullrequests".replaceAll("\\{format\\}", "json")
            .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
            .replaceAll("\\{" + "project" + "\\}", apiClient.escapeString(project.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchCriteria.creatorId", searchCriteriaCreatorId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchCriteria.includeLinks", searchCriteriaIncludeLinks));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchCriteria.maxTime", searchCriteriaMaxTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchCriteria.minTime", searchCriteriaMinTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchCriteria.queryTimeRangeType", searchCriteriaQueryTimeRangeType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchCriteria.repositoryId", searchCriteriaRepositoryId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchCriteria.reviewerId", searchCriteriaReviewerId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchCriteria.sourceRefName", searchCriteriaSourceRefName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchCriteria.sourceRepositoryId", searchCriteriaSourceRepositoryId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchCriteria.status", searchCriteriaStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchCriteria.targetRefName", searchCriteriaTargetRefName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxCommentLength", maxCommentLength));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "$skip", skip));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "$top", top));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "api-version", apiVersion));


    final String[] localVarAccepts = {
            "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {

    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[]{"oauth2", "accessToken"};

    GenericType<List<GitPullRequest>> localVarReturnType = new GenericType<List<GitPullRequest>>() {
    };
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  /**
   * Update a pull request  These are the properties that can be updated with the API:  - Status  - Title  - Description (up to 4000 characters)  - CompletionOptions  - MergeOptions  - AutoCompleteSetBy.Id  - TargetRefName (when the PR retargeting feature is enabled)  Attempting to update other properties outside of this list will either cause the server to throw an &#x60;InvalidArgumentValueException&#x60;,  or to silently ignore the update.
   *
   * @param organization  The name of the Azure DevOps organization. (required)
   * @param body          The pull request content that should be updated. (required)
   * @param repositoryId  The repository ID of the pull request&#39;s target branch. (required)
   * @param pullRequestId ID of the pull request to update. (required)
   * @param project       Project ID or project name (required)
   * @param apiVersion    Version of the API to use.  This should be set to &#39;7.2-preview.2&#39; to use this version of the api. (required)
   * @return GitPullRequest
   * @throws ApiException if fails to make API call
   */
  public GitPullRequest pullRequestsUpdate(String organization, GitPullRequest body, String repositoryId, Integer pullRequestId, String project, String apiVersion) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling pullRequestsUpdate");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling pullRequestsUpdate");
    }

    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling pullRequestsUpdate");
    }

    // verify the required parameter 'pullRequestId' is set
    if (pullRequestId == null) {
      throw new ApiException(400, "Missing the required parameter 'pullRequestId' when calling pullRequestsUpdate");
    }

    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling pullRequestsUpdate");
    }

    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling pullRequestsUpdate");
    }

    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullrequests/{pullRequestId}".replaceAll("\\{format\\}", "json")
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

    String[] localVarAuthNames = new String[]{"oauth2", "accessToken"};

    GenericType<GitPullRequest> localVarReturnType = new GenericType<GitPullRequest>() {
    };
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
