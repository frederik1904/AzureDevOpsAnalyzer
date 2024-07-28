package therealflamingo.ado.api;

import therealflamingo.ado.invoker.ApiException;
import therealflamingo.ado.invoker.ApiClient;
import therealflamingo.ado.invoker.Configuration;
import therealflamingo.ado.invoker.Pair;

import javax.ws.rs.core.GenericType;

import therealflamingo.ado.models.GitPullRequestIterationChanges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class PullRequestIterationChangesApi {
  private ApiClient apiClient;

  public PullRequestIterationChangesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PullRequestIterationChangesApi(ApiClient apiClient) {
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
   * Retrieve the changes made in a pull request between two iterations.
   * @param organization The name of the Azure DevOps organization. (required)
   * @param repositoryId The repository ID of the pull request&#39;s target branch. (required)
   * @param pullRequestId ID of the pull request. (required)
   * @param iterationId ID of the pull request iteration. &lt;br /&gt; Iteration one is the head of the source branch at the time the pull request is created and subsequent iterations are created when there are pushes to the source branch. Allowed values are between 1 and the maximum iteration on this pull request. (required)
   * @param project Project ID or project name (required)
   * @param apiVersion Version of the API to use.  This should be set to &#39;7.2-preview.1&#39; to use this version of the api. (required)
   * @param top Optional. The number of changes to retrieve.  The default value is 100 and the maximum value is 2000. (optional)
   * @param skip Optional. The number of changes to ignore.  For example, to retrieve changes 101-150, set top 50 and skip to 100. (optional)
   * @param compareTo ID of the pull request iteration to compare against.  The default value is zero which indicates the comparison is made against the common commit between the source and target branches (optional)
   * @return GitPullRequestIterationChanges
   * @throws ApiException if fails to make API call
   */
  public GitPullRequestIterationChanges pullRequestIterationChangesGet(String organization, String repositoryId, Integer pullRequestId, Integer iterationId, String project, String apiVersion, Integer top, Integer skip, Integer compareTo) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling pullRequestIterationChangesGet");
    }
    
    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling pullRequestIterationChangesGet");
    }
    
    // verify the required parameter 'pullRequestId' is set
    if (pullRequestId == null) {
      throw new ApiException(400, "Missing the required parameter 'pullRequestId' when calling pullRequestIterationChangesGet");
    }
    
    // verify the required parameter 'iterationId' is set
    if (iterationId == null) {
      throw new ApiException(400, "Missing the required parameter 'iterationId' when calling pullRequestIterationChangesGet");
    }
    
    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling pullRequestIterationChangesGet");
    }
    
    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling pullRequestIterationChangesGet");
    }
    
    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/iterations/{iterationId}/changes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
      .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()))
      .replaceAll("\\{" + "pullRequestId" + "\\}", apiClient.escapeString(pullRequestId.toString()))
      .replaceAll("\\{" + "iterationId" + "\\}", apiClient.escapeString(iterationId.toString()))
      .replaceAll("\\{" + "project" + "\\}", apiClient.escapeString(project.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "$top", top));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "$skip", skip));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "$compareTo", compareTo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "api-version", apiVersion));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2", "accessToken" };

    GenericType<GitPullRequestIterationChanges> localVarReturnType = new GenericType<GitPullRequestIterationChanges>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
