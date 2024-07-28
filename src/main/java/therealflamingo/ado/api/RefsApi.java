package therealflamingo.ado.api;

import therealflamingo.ado.invoker.ApiException;
import therealflamingo.ado.invoker.ApiClient;
import therealflamingo.ado.invoker.Configuration;
import therealflamingo.ado.invoker.Pair;

import javax.ws.rs.core.GenericType;

import therealflamingo.ado.models.GitRef;
import therealflamingo.ado.models.GitRefUpdate;
import therealflamingo.ado.models.GitRefUpdateResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class RefsApi {
  private ApiClient apiClient;

  public RefsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RefsApi(ApiClient apiClient) {
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
   * Queries the provided repository for its refs and returns them.
   * @param organization The name of the Azure DevOps organization. (required)
   * @param repositoryId The name or ID of the repository. (required)
   * @param project Project ID or project name (required)
   * @param apiVersion Version of the API to use.  This should be set to &#39;7.2-preview.2&#39; to use this version of the api. (required)
   * @param filter [optional] A filter to apply to the refs (starts with). (optional)
   * @param includeLinks [optional] Specifies if referenceLinks should be included in the result. default is false. (optional)
   * @param includeStatuses [optional] Includes up to the first 1000 commit statuses for each ref. The default value is false. (optional)
   * @param includeMyBranches [optional] Includes only branches that the user owns, the branches the user favorites, and the default branch. The default value is false. Cannot be combined with the filter parameter. (optional)
   * @param latestStatusesOnly [optional] True to include only the tip commit status for each ref. This option requires &#x60;includeStatuses&#x60; to be true. The default value is false. (optional)
   * @param peelTags [optional] Annotated tags will populate the PeeledObjectId property. default is false. (optional)
   * @param filterContains [optional] A filter to apply to the refs (contains). (optional)
   * @param top [optional] Maximum number of refs to return. It cannot be bigger than 1000. If it is not provided but continuationToken is, top will default to 100. (optional)
   * @param continuationToken The continuation token used for pagination. (optional)
   * @return List<GitRef>
   * @throws ApiException if fails to make API call
   */
  public List<GitRef> refsList(String organization, String repositoryId, String project, String apiVersion, String filter, Boolean includeLinks, Boolean includeStatuses, Boolean includeMyBranches, Boolean latestStatusesOnly, Boolean peelTags, String filterContains, Integer top, String continuationToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling refsList");
    }
    
    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling refsList");
    }
    
    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling refsList");
    }
    
    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling refsList");
    }
    
    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/refs".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
      .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()))
      .replaceAll("\\{" + "project" + "\\}", apiClient.escapeString(project.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeLinks", includeLinks));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeStatuses", includeStatuses));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeMyBranches", includeMyBranches));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "latestStatusesOnly", latestStatusesOnly));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "peelTags", peelTags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filterContains", filterContains));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "$top", top));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "continuationToken", continuationToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "api-version", apiVersion));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2", "accessToken" };

    GenericType<List<GitRef>> localVarReturnType = new GenericType<List<GitRef>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Lock or Unlock a branch.
   * @param organization The name of the Azure DevOps organization. (required)
   * @param body The ref update action (lock/unlock) to perform (required)
   * @param repositoryId The name or ID of the repository. (required)
   * @param filter The name of the branch to lock/unlock (required)
   * @param project Project ID or project name (required)
   * @param apiVersion Version of the API to use.  This should be set to &#39;7.2-preview.2&#39; to use this version of the api. (required)
   * @param projectId ID or name of the team project. Optional if specifying an ID for repository. (optional)
   * @return GitRef
   * @throws ApiException if fails to make API call
   */
  public GitRef refsUpdateRef(String organization, GitRefUpdate body, String repositoryId, String filter, String project, String apiVersion, String projectId) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling refsUpdateRef");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling refsUpdateRef");
    }
    
    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling refsUpdateRef");
    }
    
    // verify the required parameter 'filter' is set
    if (filter == null) {
      throw new ApiException(400, "Missing the required parameter 'filter' when calling refsUpdateRef");
    }
    
    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling refsUpdateRef");
    }
    
    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling refsUpdateRef");
    }
    
    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/refs".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
      .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()))
      .replaceAll("\\{" + "project" + "\\}", apiClient.escapeString(project.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "projectId", projectId));
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

    GenericType<GitRef> localVarReturnType = new GenericType<GitRef>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Creating, updating, or deleting refs(branches).  Updating a ref means making it point at a different commit than it used to. You must specify both the old and new commit to avoid race conditions.
   * @param organization The name of the Azure DevOps organization. (required)
   * @param body List of ref updates to attempt to perform (required)
   * @param repositoryId The name or ID of the repository. (required)
   * @param project Project ID or project name (required)
   * @param apiVersion Version of the API to use.  This should be set to &#39;7.2-preview.2&#39; to use this version of the api. (required)
   * @param projectId ID or name of the team project. Optional if specifying an ID for repository. (optional)
   * @return List<GitRefUpdateResult>
   * @throws ApiException if fails to make API call
   */
  public List<GitRefUpdateResult> refsUpdateRefs(String organization, List<GitRefUpdate> body, String repositoryId, String project, String apiVersion, String projectId) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling refsUpdateRefs");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling refsUpdateRefs");
    }
    
    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling refsUpdateRefs");
    }
    
    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling refsUpdateRefs");
    }
    
    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling refsUpdateRefs");
    }
    
    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/refs".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
      .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()))
      .replaceAll("\\{" + "project" + "\\}", apiClient.escapeString(project.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "projectId", projectId));
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

    GenericType<List<GitRefUpdateResult>> localVarReturnType = new GenericType<List<GitRefUpdateResult>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
