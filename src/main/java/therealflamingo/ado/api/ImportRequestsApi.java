package therealflamingo.ado.api;

import therealflamingo.ado.invoker.ApiException;
import therealflamingo.ado.invoker.ApiClient;
import therealflamingo.ado.invoker.Configuration;
import therealflamingo.ado.invoker.Pair;

import javax.ws.rs.core.GenericType;

import therealflamingo.ado.models.GitImportRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class ImportRequestsApi {
  private ApiClient apiClient;

  public ImportRequestsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ImportRequestsApi(ApiClient apiClient) {
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
   * Create an import request.
   * @param organization The name of the Azure DevOps organization. (required)
   * @param body The import request to create. (required)
   * @param project Project ID or project name (required)
   * @param repositoryId The name or ID of the repository. (required)
   * @param apiVersion Version of the API to use.  This should be set to &#39;7.2-preview.1&#39; to use this version of the api. (required)
   * @return GitImportRequest
   * @throws ApiException if fails to make API call
   */
  public GitImportRequest importRequestsCreate(String organization, GitImportRequest body, String project, String repositoryId, String apiVersion) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling importRequestsCreate");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling importRequestsCreate");
    }
    
    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling importRequestsCreate");
    }
    
    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling importRequestsCreate");
    }
    
    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling importRequestsCreate");
    }
    
    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/importRequests".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
      .replaceAll("\\{" + "project" + "\\}", apiClient.escapeString(project.toString()))
      .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()));

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

    GenericType<GitImportRequest> localVarReturnType = new GenericType<GitImportRequest>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Retrieve a particular import request.
   * @param organization The name of the Azure DevOps organization. (required)
   * @param project Project ID or project name (required)
   * @param repositoryId The name or ID of the repository. (required)
   * @param importRequestId The unique identifier for the import request. (required)
   * @param apiVersion Version of the API to use.  This should be set to &#39;7.2-preview.1&#39; to use this version of the api. (required)
   * @return GitImportRequest
   * @throws ApiException if fails to make API call
   */
  public GitImportRequest importRequestsGet(String organization, String project, String repositoryId, Integer importRequestId, String apiVersion) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling importRequestsGet");
    }
    
    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling importRequestsGet");
    }
    
    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling importRequestsGet");
    }
    
    // verify the required parameter 'importRequestId' is set
    if (importRequestId == null) {
      throw new ApiException(400, "Missing the required parameter 'importRequestId' when calling importRequestsGet");
    }
    
    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling importRequestsGet");
    }
    
    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/importRequests/{importRequestId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
      .replaceAll("\\{" + "project" + "\\}", apiClient.escapeString(project.toString()))
      .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()))
      .replaceAll("\\{" + "importRequestId" + "\\}", apiClient.escapeString(importRequestId.toString()));

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

    GenericType<GitImportRequest> localVarReturnType = new GenericType<GitImportRequest>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Retrieve import requests for a repository.
   * @param organization The name of the Azure DevOps organization. (required)
   * @param project Project ID or project name (required)
   * @param repositoryId The name or ID of the repository. (required)
   * @param apiVersion Version of the API to use.  This should be set to &#39;7.2-preview.1&#39; to use this version of the api. (required)
   * @param includeAbandoned True to include abandoned import requests in the results. (optional)
   * @return List<GitImportRequest>
   * @throws ApiException if fails to make API call
   */
  public List<GitImportRequest> importRequestsQuery(String organization, String project, String repositoryId, String apiVersion, Boolean includeAbandoned) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling importRequestsQuery");
    }
    
    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling importRequestsQuery");
    }
    
    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling importRequestsQuery");
    }
    
    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling importRequestsQuery");
    }
    
    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/importRequests".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
      .replaceAll("\\{" + "project" + "\\}", apiClient.escapeString(project.toString()))
      .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeAbandoned", includeAbandoned));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "api-version", apiVersion));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2", "accessToken" };

    GenericType<List<GitImportRequest>> localVarReturnType = new GenericType<List<GitImportRequest>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Retry or abandon a failed import request.  There can only be one active import request associated with a repository. Marking a failed import request abandoned makes it inactive.
   * @param organization The name of the Azure DevOps organization. (required)
   * @param body The updated version of the import request. Currently, the only change allowed is setting the Status to Queued or Abandoned. (required)
   * @param project Project ID or project name (required)
   * @param repositoryId The name or ID of the repository. (required)
   * @param importRequestId The unique identifier for the import request to update. (required)
   * @param apiVersion Version of the API to use.  This should be set to &#39;7.2-preview.1&#39; to use this version of the api. (required)
   * @return GitImportRequest
   * @throws ApiException if fails to make API call
   */
  public GitImportRequest importRequestsUpdate(String organization, GitImportRequest body, String project, String repositoryId, Integer importRequestId, String apiVersion) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling importRequestsUpdate");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling importRequestsUpdate");
    }
    
    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling importRequestsUpdate");
    }
    
    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling importRequestsUpdate");
    }
    
    // verify the required parameter 'importRequestId' is set
    if (importRequestId == null) {
      throw new ApiException(400, "Missing the required parameter 'importRequestId' when calling importRequestsUpdate");
    }
    
    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling importRequestsUpdate");
    }
    
    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/importRequests/{importRequestId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
      .replaceAll("\\{" + "project" + "\\}", apiClient.escapeString(project.toString()))
      .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()))
      .replaceAll("\\{" + "importRequestId" + "\\}", apiClient.escapeString(importRequestId.toString()));

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

    GenericType<GitImportRequest> localVarReturnType = new GenericType<GitImportRequest>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
