package therealflamingo.ado.api;

import therealflamingo.ado.invoker.ApiClient;
import therealflamingo.ado.invoker.ApiException;
import therealflamingo.ado.invoker.Configuration;
import therealflamingo.ado.invoker.Pair;
import therealflamingo.ado.models.GitCommitDiffs;

import javax.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class DiffsApi {
  private ApiClient apiClient;

  public DiffsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DiffsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Find the closest common commit (the merge base) between base and target commits, and get the diff between either the base and target commits or common and target commits.
   *
   * @param organization         The name of the Azure DevOps organization. (required)
   * @param repositoryId         The name or ID of the repository. (required)
   * @param project              Project ID or project name (required)
   * @param apiVersion           Version of the API to use.  This should be set to &#39;7.2-preview.1&#39; to use this version of the api. (required)
   * @param diffCommonCommit     If true, diff between common and target commits. If false, diff between base and target commits. (optional)
   * @param top                  Maximum number of changes to return. Defaults to 100. (optional)
   * @param skip                 Number of changes to skip (optional)
   * @param baseVersion          Version string identifier (name of tag/branch, SHA1 of commit) (optional)
   * @param baseVersionOptions   Version options - Specify additional modifiers to version (e.g Previous) (optional)
   * @param baseVersionType      Version type (branch, tag, or commit). Determines how Id is interpreted (optional)
   * @param targetVersion        Version string identifier (name of tag/branch, SHA1 of commit) (optional)
   * @param targetVersionOptions Version options - Specify additional modifiers to version (e.g Previous) (optional)
   * @param targetVersionType    Version type (branch, tag, or commit). Determines how Id is interpreted (optional)
   * @return GitCommitDiffs
   * @throws ApiException if fails to make API call
   */
  public GitCommitDiffs diffsGet(String organization, String repositoryId, String project, String apiVersion, Boolean diffCommonCommit, Integer top, Integer skip, String baseVersion, String baseVersionOptions, String baseVersionType, String targetVersion, String targetVersionOptions, String targetVersionType) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling diffsGet");
    }

    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling diffsGet");
    }

    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling diffsGet");
    }

    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling diffsGet");
    }

    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/diffs/commits".replaceAll("\\{format\\}", "json")
            .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
            .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()))
            .replaceAll("\\{" + "project" + "\\}", apiClient.escapeString(project.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "diffCommonCommit", diffCommonCommit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "$top", top));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "$skip", skip));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "baseVersion", baseVersion));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "baseVersionOptions", baseVersionOptions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "baseVersionType", baseVersionType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "targetVersion", targetVersion));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "targetVersionOptions", targetVersionOptions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "targetVersionType", targetVersionType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "api-version", apiVersion));


    final String[] localVarAccepts = {
            "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {

    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[]{"oauth2", "accessToken"};

    GenericType<GitCommitDiffs> localVarReturnType = new GenericType<GitCommitDiffs>() {
    };
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
