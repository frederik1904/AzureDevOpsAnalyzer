package therealflamingo.ado.api;

import therealflamingo.ado.invoker.ApiException;
import therealflamingo.ado.invoker.ApiClient;
import therealflamingo.ado.invoker.Configuration;
import therealflamingo.ado.invoker.Pair;

import javax.ws.rs.core.GenericType;

import therealflamingo.ado.models.GitCommit;
import therealflamingo.ado.models.GitCommitChanges;
import therealflamingo.ado.models.GitCommitRef;
import therealflamingo.ado.models.GitQueryCommitsCriteria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class CommitsApi {
  private ApiClient apiClient;

  public CommitsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CommitsApi(ApiClient apiClient) {
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
   * Retrieve a particular commit.
   * @param organization The name of the Azure DevOps organization. (required)
   * @param commitId The id of the commit. (required)
   * @param repositoryId The id or friendly name of the repository. To use the friendly name, projectId must also be specified. (required)
   * @param project Project ID or project name (required)
   * @param apiVersion Version of the API to use.  This should be set to &#39;7.2-preview.2&#39; to use this version of the api. (required)
   * @param changeCount The number of changes to include in the result. (optional)
   * @return GitCommit
   * @throws ApiException if fails to make API call
   */
  public GitCommit commitsGet(String organization, String commitId, String repositoryId, String project, String apiVersion, Integer changeCount) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling commitsGet");
    }
    
    // verify the required parameter 'commitId' is set
    if (commitId == null) {
      throw new ApiException(400, "Missing the required parameter 'commitId' when calling commitsGet");
    }
    
    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling commitsGet");
    }
    
    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling commitsGet");
    }
    
    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling commitsGet");
    }
    
    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/commits/{commitId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
      .replaceAll("\\{" + "commitId" + "\\}", apiClient.escapeString(commitId.toString()))
      .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()))
      .replaceAll("\\{" + "project" + "\\}", apiClient.escapeString(project.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "changeCount", changeCount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "api-version", apiVersion));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2", "accessToken" };

    GenericType<GitCommit> localVarReturnType = new GenericType<GitCommit>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Retrieve changes for a particular commit.
   * @param organization The name of the Azure DevOps organization. (required)
   * @param commitId The id of the commit. (required)
   * @param repositoryId The id or friendly name of the repository. To use the friendly name, projectId must also be specified. (required)
   * @param project Project ID or project name (required)
   * @param apiVersion Version of the API to use.  This should be set to &#39;7.2-preview.1&#39; to use this version of the api. (required)
   * @param top The maximum number of changes to return. (optional)
   * @param skip The number of changes to skip. (optional)
   * @return GitCommitChanges
   * @throws ApiException if fails to make API call
   */
  public GitCommitChanges commitsGetChanges(String organization, String commitId, String repositoryId, String project, String apiVersion, Integer top, Integer skip) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling commitsGetChanges");
    }
    
    // verify the required parameter 'commitId' is set
    if (commitId == null) {
      throw new ApiException(400, "Missing the required parameter 'commitId' when calling commitsGetChanges");
    }
    
    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling commitsGetChanges");
    }
    
    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling commitsGetChanges");
    }
    
    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling commitsGetChanges");
    }
    
    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/commits/{commitId}/changes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
      .replaceAll("\\{" + "commitId" + "\\}", apiClient.escapeString(commitId.toString()))
      .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()))
      .replaceAll("\\{" + "project" + "\\}", apiClient.escapeString(project.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "top", top));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "skip", skip));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "api-version", apiVersion));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2", "accessToken" };

    GenericType<GitCommitChanges> localVarReturnType = new GenericType<GitCommitChanges>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Retrieve git commits for a project matching the search criteria
   * @param organization The name of the Azure DevOps organization. (required)
   * @param body Search options (required)
   * @param repositoryId The name or ID of the repository. (required)
   * @param project Project ID or project name (required)
   * @param apiVersion Version of the API to use.  This should be set to &#39;7.2-preview.2&#39; to use this version of the api. (required)
   * @param skip Number of commits to skip. The value cannot exceed 3,000,000. (optional)
   * @param top Maximum number of commits to return. The value cannot exceed 50,000. (optional)
   * @param includeStatuses True to include additional commit status information. (optional)
   * @return List<GitCommitRef>
   * @throws ApiException if fails to make API call
   */
  public List<GitCommitRef> commitsGetCommitsBatch(String organization, GitQueryCommitsCriteria body, String repositoryId, String project, String apiVersion, Integer skip, Integer top, Boolean includeStatuses) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling commitsGetCommitsBatch");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling commitsGetCommitsBatch");
    }
    
    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling commitsGetCommitsBatch");
    }
    
    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling commitsGetCommitsBatch");
    }
    
    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling commitsGetCommitsBatch");
    }
    
    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/commitsbatch".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
      .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()))
      .replaceAll("\\{" + "project" + "\\}", apiClient.escapeString(project.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "$skip", skip));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "$top", top));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeStatuses", includeStatuses));
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

    GenericType<List<GitCommitRef>> localVarReturnType = new GenericType<List<GitCommitRef>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Retrieve a list of commits associated with a particular push.
   * @param organization The name of the Azure DevOps organization. (required)
   * @param repositoryId The id or friendly name of the repository. To use the friendly name, projectId must also be specified. (required)
   * @param pushId The id of the push. (required)
   * @param project Project ID or project name (required)
   * @param apiVersion Version of the API to use.  This should be set to &#39;7.2-preview.2&#39; to use this version of the api. (required)
   * @param top The maximum number of commits to return (\&quot;get the top x commits\&quot;). (optional)
   * @param skip The number of commits to skip. (optional)
   * @param includeLinks Set to false to avoid including REST Url links for resources. Defaults to true. (optional)
   * @return List<GitCommitRef>
   * @throws ApiException if fails to make API call
   */
  public List<GitCommitRef> commitsGetPushCommits(String organization, String repositoryId, Integer pushId, String project, String apiVersion, Integer top, Integer skip, Boolean includeLinks) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling commitsGetPushCommits");
    }
    
    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling commitsGetPushCommits");
    }
    
    // verify the required parameter 'pushId' is set
    if (pushId == null) {
      throw new ApiException(400, "Missing the required parameter 'pushId' when calling commitsGetPushCommits");
    }
    
    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling commitsGetPushCommits");
    }
    
    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling commitsGetPushCommits");
    }
    
    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/commits".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
      .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()))
      .replaceAll("\\{" + "project" + "\\}", apiClient.escapeString(project.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pushId", pushId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "top", top));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "skip", skip));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeLinks", includeLinks));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "api-version", apiVersion));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2", "accessToken" };

    GenericType<List<GitCommitRef>> localVarReturnType = new GenericType<List<GitCommitRef>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
