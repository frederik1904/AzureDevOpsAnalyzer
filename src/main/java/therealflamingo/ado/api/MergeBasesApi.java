package therealflamingo.ado.api;

import therealflamingo.ado.invoker.ApiException;
import therealflamingo.ado.invoker.ApiClient;
import therealflamingo.ado.invoker.Configuration;
import therealflamingo.ado.invoker.Pair;

import javax.ws.rs.core.GenericType;

import therealflamingo.ado.models.GitCommitRef;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class MergeBasesApi {
  private ApiClient apiClient;

  public MergeBasesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MergeBasesApi(ApiClient apiClient) {
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
   * Find the merge bases of two commits, optionally across forks. If otherRepositoryId is not specified, the merge bases will only be calculated within the context of the local repositoryNameOrId.
   * @param organization The name of the Azure DevOps organization. (required)
   * @param repositoryNameOrId ID or name of the local repository. (required)
   * @param commitId First commit, usually the tip of the target branch of the potential merge. (required)
   * @param otherCommitId Other commit, usually the tip of the source branch of the potential merge. (required)
   * @param project Project ID or project name (required)
   * @param apiVersion Version of the API to use.  This should be set to &#39;7.2-preview.1&#39; to use this version of the api. (required)
   * @param otherCollectionId The collection ID where otherCommitId lives. (optional)
   * @param otherRepositoryId The repository ID where otherCommitId lives. (optional)
   * @return List<GitCommitRef>
   * @throws ApiException if fails to make API call
   */
  public List<GitCommitRef> mergeBasesList(String organization, String repositoryNameOrId, String commitId, String otherCommitId, String project, String apiVersion, UUID otherCollectionId, UUID otherRepositoryId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling mergeBasesList");
    }
    
    // verify the required parameter 'repositoryNameOrId' is set
    if (repositoryNameOrId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryNameOrId' when calling mergeBasesList");
    }
    
    // verify the required parameter 'commitId' is set
    if (commitId == null) {
      throw new ApiException(400, "Missing the required parameter 'commitId' when calling mergeBasesList");
    }
    
    // verify the required parameter 'otherCommitId' is set
    if (otherCommitId == null) {
      throw new ApiException(400, "Missing the required parameter 'otherCommitId' when calling mergeBasesList");
    }
    
    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling mergeBasesList");
    }
    
    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling mergeBasesList");
    }
    
    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryNameOrId}/commits/{commitId}/mergebases".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
      .replaceAll("\\{" + "repositoryNameOrId" + "\\}", apiClient.escapeString(repositoryNameOrId.toString()))
      .replaceAll("\\{" + "commitId" + "\\}", apiClient.escapeString(commitId.toString()))
      .replaceAll("\\{" + "project" + "\\}", apiClient.escapeString(project.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "otherCommitId", otherCommitId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "otherCollectionId", otherCollectionId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "otherRepositoryId", otherRepositoryId));
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
