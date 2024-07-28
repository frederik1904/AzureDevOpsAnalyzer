package therealflamingo.ado.api;

import therealflamingo.ado.invoker.ApiException;
import therealflamingo.ado.invoker.ApiClient;
import therealflamingo.ado.invoker.Configuration;
import therealflamingo.ado.invoker.Pair;

import javax.ws.rs.core.GenericType;

import therealflamingo.ado.models.GitForkSyncRequest;
import therealflamingo.ado.models.GitForkSyncRequestParameters;
import therealflamingo.ado.models.GitRepositoryRef;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class ForksApi {
  private ApiClient apiClient;

  public ForksApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ForksApi(ApiClient apiClient) {
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
   * Request that another repository&#39;s refs be fetched into this one. It syncs two existing forks. To create a fork, please see the &lt;a href&#x3D;\&quot;https://docs.microsoft.com/en-us/rest/api/vsts/git/repositories/create?view&#x3D;azure-devops-rest-5.1\&quot;&gt; repositories endpoint&lt;/a&gt;
   * @param organization The name of the Azure DevOps organization. (required)
   * @param body Source repository and ref mapping. (required)
   * @param repositoryNameOrId The name or ID of the repository. (required)
   * @param project Project ID or project name (required)
   * @param apiVersion Version of the API to use.  This should be set to &#39;7.2-preview.1&#39; to use this version of the api. (required)
   * @param includeLinks True to include links (optional)
   * @return GitForkSyncRequest
   * @throws ApiException if fails to make API call
   */
  public GitForkSyncRequest forksCreateForkSyncRequest(String organization, GitForkSyncRequestParameters body, String repositoryNameOrId, String project, String apiVersion, Boolean includeLinks) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling forksCreateForkSyncRequest");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling forksCreateForkSyncRequest");
    }
    
    // verify the required parameter 'repositoryNameOrId' is set
    if (repositoryNameOrId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryNameOrId' when calling forksCreateForkSyncRequest");
    }
    
    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling forksCreateForkSyncRequest");
    }
    
    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling forksCreateForkSyncRequest");
    }
    
    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryNameOrId}/forkSyncRequests".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
      .replaceAll("\\{" + "repositoryNameOrId" + "\\}", apiClient.escapeString(repositoryNameOrId.toString()))
      .replaceAll("\\{" + "project" + "\\}", apiClient.escapeString(project.toString()));

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

    GenericType<GitForkSyncRequest> localVarReturnType = new GenericType<GitForkSyncRequest>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Get a specific fork sync operation&#39;s details.
   * @param organization The name of the Azure DevOps organization. (required)
   * @param repositoryNameOrId The name or ID of the repository. (required)
   * @param forkSyncOperationId OperationId of the sync request. (required)
   * @param project Project ID or project name (required)
   * @param apiVersion Version of the API to use.  This should be set to &#39;7.2-preview.1&#39; to use this version of the api. (required)
   * @param includeLinks True to include links. (optional)
   * @return GitForkSyncRequest
   * @throws ApiException if fails to make API call
   */
  public GitForkSyncRequest forksGetForkSyncRequest(String organization, String repositoryNameOrId, Integer forkSyncOperationId, String project, String apiVersion, Boolean includeLinks) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling forksGetForkSyncRequest");
    }
    
    // verify the required parameter 'repositoryNameOrId' is set
    if (repositoryNameOrId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryNameOrId' when calling forksGetForkSyncRequest");
    }
    
    // verify the required parameter 'forkSyncOperationId' is set
    if (forkSyncOperationId == null) {
      throw new ApiException(400, "Missing the required parameter 'forkSyncOperationId' when calling forksGetForkSyncRequest");
    }
    
    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling forksGetForkSyncRequest");
    }
    
    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling forksGetForkSyncRequest");
    }
    
    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryNameOrId}/forkSyncRequests/{forkSyncOperationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
      .replaceAll("\\{" + "repositoryNameOrId" + "\\}", apiClient.escapeString(repositoryNameOrId.toString()))
      .replaceAll("\\{" + "forkSyncOperationId" + "\\}", apiClient.escapeString(forkSyncOperationId.toString()))
      .replaceAll("\\{" + "project" + "\\}", apiClient.escapeString(project.toString()));

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

    GenericType<GitForkSyncRequest> localVarReturnType = new GenericType<GitForkSyncRequest>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Retrieve all requested fork sync operations on this repository.
   * @param organization The name of the Azure DevOps organization. (required)
   * @param repositoryNameOrId The name or ID of the repository. (required)
   * @param project Project ID or project name (required)
   * @param apiVersion Version of the API to use.  This should be set to &#39;7.2-preview.1&#39; to use this version of the api. (required)
   * @param includeAbandoned True to include abandoned requests. (optional)
   * @param includeLinks True to include links. (optional)
   * @return List<GitForkSyncRequest>
   * @throws ApiException if fails to make API call
   */
  public List<GitForkSyncRequest> forksGetForkSyncRequests(String organization, String repositoryNameOrId, String project, String apiVersion, Boolean includeAbandoned, Boolean includeLinks) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling forksGetForkSyncRequests");
    }
    
    // verify the required parameter 'repositoryNameOrId' is set
    if (repositoryNameOrId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryNameOrId' when calling forksGetForkSyncRequests");
    }
    
    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling forksGetForkSyncRequests");
    }
    
    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling forksGetForkSyncRequests");
    }
    
    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryNameOrId}/forkSyncRequests".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
      .replaceAll("\\{" + "repositoryNameOrId" + "\\}", apiClient.escapeString(repositoryNameOrId.toString()))
      .replaceAll("\\{" + "project" + "\\}", apiClient.escapeString(project.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeAbandoned", includeAbandoned));
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

    GenericType<List<GitForkSyncRequest>> localVarReturnType = new GenericType<List<GitForkSyncRequest>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Retrieve all forks of a repository in the collection.
   * @param organization The name of the Azure DevOps organization. (required)
   * @param repositoryNameOrId The name or ID of the repository. (required)
   * @param collectionId Team project collection ID. (required)
   * @param project Project ID or project name (required)
   * @param apiVersion Version of the API to use.  This should be set to &#39;7.2-preview.1&#39; to use this version of the api. (required)
   * @param includeLinks True to include links. (optional)
   * @return List<GitRepositoryRef>
   * @throws ApiException if fails to make API call
   */
  public List<GitRepositoryRef> forksList(String organization, String repositoryNameOrId, UUID collectionId, String project, String apiVersion, Boolean includeLinks) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling forksList");
    }
    
    // verify the required parameter 'repositoryNameOrId' is set
    if (repositoryNameOrId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryNameOrId' when calling forksList");
    }
    
    // verify the required parameter 'collectionId' is set
    if (collectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'collectionId' when calling forksList");
    }
    
    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling forksList");
    }
    
    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling forksList");
    }
    
    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryNameOrId}/forks/{collectionId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
      .replaceAll("\\{" + "repositoryNameOrId" + "\\}", apiClient.escapeString(repositoryNameOrId.toString()))
      .replaceAll("\\{" + "collectionId" + "\\}", apiClient.escapeString(collectionId.toString()))
      .replaceAll("\\{" + "project" + "\\}", apiClient.escapeString(project.toString()));

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

    GenericType<List<GitRepositoryRef>> localVarReturnType = new GenericType<List<GitRepositoryRef>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
