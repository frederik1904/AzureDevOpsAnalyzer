package therealflamingo.ado.api;

import therealflamingo.ado.invoker.ApiException;
import therealflamingo.ado.invoker.ApiClient;
import therealflamingo.ado.invoker.Configuration;
import therealflamingo.ado.invoker.Pair;

import javax.ws.rs.core.GenericType;

import therealflamingo.ado.models.GitTreeRef;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class TreesApi {
  private ApiClient apiClient;

  public TreesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TreesApi(ApiClient apiClient) {
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
   * The Tree endpoint returns the collection of objects underneath the specified tree. Trees are folders in a Git repository.  Repositories have both a name and an identifier. Identifiers are globally unique, but several projects may contain a repository of the same name. You don&#39;t need to include the project if you specify a repository by ID. However, if you specify a repository by name, you must also specify the project (by name or ID.
   * @param organization The name of the Azure DevOps organization. (required)
   * @param repositoryId Repository Id. (required)
   * @param sha1 SHA1 hash of the tree object. (required)
   * @param project Project ID or project name (required)
   * @param apiVersion Version of the API to use.  This should be set to &#39;7.2-preview.1&#39; to use this version of the api. (required)
   * @param projectId Project Id. (optional)
   * @param recursive Search recursively. Include trees underneath this tree. Default is false. (optional)
   * @param fileName Name to use if a .zip file is returned. Default is the object ID. (optional)
   * @param format Use \&quot;zip\&quot;. Defaults to the MIME type set in the Accept header. (optional)
   * @return GitTreeRef
   * @throws ApiException if fails to make API call
   */
  public GitTreeRef treesGet(String organization, String repositoryId, String sha1, String project, String apiVersion, String projectId, Boolean recursive, String fileName, String format) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling treesGet");
    }
    
    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling treesGet");
    }
    
    // verify the required parameter 'sha1' is set
    if (sha1 == null) {
      throw new ApiException(400, "Missing the required parameter 'sha1' when calling treesGet");
    }
    
    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling treesGet");
    }
    
    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling treesGet");
    }
    
    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/trees/{sha1}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
      .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()))
      .replaceAll("\\{" + "sha1" + "\\}", apiClient.escapeString(sha1.toString()))
      .replaceAll("\\{" + "project" + "\\}", apiClient.escapeString(project.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "projectId", projectId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "recursive", recursive));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fileName", fileName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "$format", format));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "api-version", apiVersion));

    
    
    final String[] localVarAccepts = {
      "application/zip", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2", "accessToken" };

    GenericType<GitTreeRef> localVarReturnType = new GenericType<GitTreeRef>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
