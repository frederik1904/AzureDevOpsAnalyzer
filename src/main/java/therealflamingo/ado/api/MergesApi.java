package therealflamingo.ado.api;

import therealflamingo.ado.invoker.ApiException;
import therealflamingo.ado.invoker.ApiClient;
import therealflamingo.ado.invoker.Configuration;
import therealflamingo.ado.invoker.Pair;

import javax.ws.rs.core.GenericType;

import therealflamingo.ado.models.GitMerge;
import therealflamingo.ado.models.GitMergeParameters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class MergesApi {
  private ApiClient apiClient;

  public MergesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MergesApi(ApiClient apiClient) {
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
   * Request a git merge operation. Currently we support merging only 2 commits.
   * @param organization The name of the Azure DevOps organization. (required)
   * @param body Parents commitIds and merge commit messsage. (required)
   * @param project Project ID or project name (required)
   * @param repositoryNameOrId The name or ID of the repository. (required)
   * @param apiVersion Version of the API to use.  This should be set to &#39;7.2-preview.1&#39; to use this version of the api. (required)
   * @param includeLinks True to include links (optional)
   * @return GitMerge
   * @throws ApiException if fails to make API call
   */
  public GitMerge mergesCreate(String organization, GitMergeParameters body, String project, String repositoryNameOrId, String apiVersion, Boolean includeLinks) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling mergesCreate");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling mergesCreate");
    }
    
    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling mergesCreate");
    }
    
    // verify the required parameter 'repositoryNameOrId' is set
    if (repositoryNameOrId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryNameOrId' when calling mergesCreate");
    }
    
    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling mergesCreate");
    }
    
    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryNameOrId}/merges".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
      .replaceAll("\\{" + "project" + "\\}", apiClient.escapeString(project.toString()))
      .replaceAll("\\{" + "repositoryNameOrId" + "\\}", apiClient.escapeString(repositoryNameOrId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeLinks", includeLinks));
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

    GenericType<GitMerge> localVarReturnType = new GenericType<GitMerge>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Get a specific merge operation&#39;s details.
   * @param organization The name of the Azure DevOps organization. (required)
   * @param project Project ID or project name (required)
   * @param repositoryNameOrId The name or ID of the repository. (required)
   * @param mergeOperationId OperationId of the merge request. (required)
   * @param apiVersion Version of the API to use.  This should be set to &#39;7.2-preview.1&#39; to use this version of the api. (required)
   * @param includeLinks True to include links (optional)
   * @return GitMerge
   * @throws ApiException if fails to make API call
   */
  public GitMerge mergesGet(String organization, String project, String repositoryNameOrId, Integer mergeOperationId, String apiVersion, Boolean includeLinks) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling mergesGet");
    }
    
    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling mergesGet");
    }
    
    // verify the required parameter 'repositoryNameOrId' is set
    if (repositoryNameOrId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryNameOrId' when calling mergesGet");
    }
    
    // verify the required parameter 'mergeOperationId' is set
    if (mergeOperationId == null) {
      throw new ApiException(400, "Missing the required parameter 'mergeOperationId' when calling mergesGet");
    }
    
    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling mergesGet");
    }
    
    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryNameOrId}/merges/{mergeOperationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
      .replaceAll("\\{" + "project" + "\\}", apiClient.escapeString(project.toString()))
      .replaceAll("\\{" + "repositoryNameOrId" + "\\}", apiClient.escapeString(repositoryNameOrId.toString()))
      .replaceAll("\\{" + "mergeOperationId" + "\\}", apiClient.escapeString(mergeOperationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    GenericType<GitMerge> localVarReturnType = new GenericType<GitMerge>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
