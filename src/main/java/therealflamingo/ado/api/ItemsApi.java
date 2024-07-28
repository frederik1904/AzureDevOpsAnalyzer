package therealflamingo.ado.api;

import therealflamingo.ado.invoker.ApiException;
import therealflamingo.ado.invoker.ApiClient;
import therealflamingo.ado.invoker.Configuration;
import therealflamingo.ado.invoker.Pair;

import javax.ws.rs.core.GenericType;

import therealflamingo.ado.models.GitItem;
import therealflamingo.ado.models.GitItemRequestData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class ItemsApi {
  private ApiClient apiClient;

  public ItemsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ItemsApi(ApiClient apiClient) {
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
   * Get Item Metadata and/or Content for a collection of items. The download parameter is to indicate whether the content should be available as a download or just sent as a stream in the response. Doesn&#39;t apply to zipped content which is always returned as a download.
   * @param organization The name of the Azure DevOps organization. (required)
   * @param repositoryId The name or ID of the repository. (required)
   * @param project Project ID or project name (required)
   * @param apiVersion Version of the API to use.  This should be set to &#39;7.2-preview.1&#39; to use this version of the api. (required)
   * @param scopePath The path scope.  The default is null. (optional)
   * @param recursionLevel The recursion level of this request. The default is &#39;none&#39;, no recursion. (optional)
   * @param includeContentMetadata Set to true to include content metadata.  Default is false. (optional)
   * @param latestProcessedChange Set to true to include the latest changes.  Default is false. (optional)
   * @param download Set to true to download the response as a file.  Default is false. (optional)
   * @param includeLinks Set to true to include links to items.  Default is false. (optional)
   * @param format If specified, this overrides the HTTP Accept request header to return either &#39;json&#39; or &#39;zip&#39;. If $format is specified, then api-version should also be specified as a query parameter. (optional)
   * @param versionDescriptorVersion Version string identifier (name of tag/branch, SHA1 of commit) (optional)
   * @param versionDescriptorVersionOptions Version options - Specify additional modifiers to version (e.g Previous) (optional)
   * @param versionDescriptorVersionType Version type (branch, tag, or commit). Determines how Id is interpreted (optional)
   * @param zipForUnix Set to true to keep the file permissions for unix (and POSIX) systems like executables and symlinks (optional)
   * @return List<GitItem>
   * @throws ApiException if fails to make API call
   */
  public List<GitItem> itemsList(String organization, String repositoryId, String project, String apiVersion, String scopePath, String recursionLevel, Boolean includeContentMetadata, Boolean latestProcessedChange, Boolean download, Boolean includeLinks, String format, String versionDescriptorVersion, String versionDescriptorVersionOptions, String versionDescriptorVersionType, Boolean zipForUnix) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling itemsList");
    }
    
    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling itemsList");
    }
    
    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling itemsList");
    }
    
    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling itemsList");
    }
    
    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/items".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
      .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()))
      .replaceAll("\\{" + "project" + "\\}", apiClient.escapeString(project.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "scopePath", scopePath));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "recursionLevel", recursionLevel));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeContentMetadata", includeContentMetadata));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "latestProcessedChange", latestProcessedChange));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "download", download));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeLinks", includeLinks));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "$format", format));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "versionDescriptor.version", versionDescriptorVersion));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "versionDescriptor.versionOptions", versionDescriptorVersionOptions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "versionDescriptor.versionType", versionDescriptorVersionType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "zipForUnix", zipForUnix));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "api-version", apiVersion));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2", "accessToken" };

    GenericType<List<GitItem>> localVarReturnType = new GenericType<List<GitItem>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
