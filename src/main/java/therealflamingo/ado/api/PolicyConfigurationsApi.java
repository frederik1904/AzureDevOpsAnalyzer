package therealflamingo.ado.api;

import therealflamingo.ado.invoker.ApiException;
import therealflamingo.ado.invoker.ApiClient;
import therealflamingo.ado.invoker.Configuration;
import therealflamingo.ado.invoker.Pair;

import javax.ws.rs.core.GenericType;

import therealflamingo.ado.models.PolicyConfiguration;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class PolicyConfigurationsApi {
  private ApiClient apiClient;

  public PolicyConfigurationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PolicyConfigurationsApi(ApiClient apiClient) {
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
   * Retrieve a list of policy configurations by a given set of scope/filtering criteria.  Below is a short description of how all of the query parameters interact with each other: - repositoryId set, refName set: returns all policy configurations that *apply* to a particular branch in a repository - repositoryId set, refName unset: returns all policy configurations that *apply* to a particular repository - repositoryId unset, refName unset: returns all policy configurations that are *defined* at the project level - repositoryId unset, refName set: returns all project-level branch policies, plus the project level configurations For all of the examples above, when policyType is set, it&#39;ll restrict results to the given policy type
   * @param organization The name of the Azure DevOps organization. (required)
   * @param project Project ID or project name (required)
   * @param apiVersion Version of the API to use.  This should be set to &#39;7.2-preview.1&#39; to use this version of the api. (required)
   * @param repositoryId The repository id. (optional)
   * @param refName The fully-qualified Git ref name (e.g. refs/heads/master). (optional)
   * @param policyType The policy type filter. (optional)
   * @param top Maximum number of policies to return. (optional)
   * @param continuationToken Pass a policy configuration ID to fetch the next page of results, up to top number of results, for this endpoint. (optional)
   * @return List<PolicyConfiguration>
   * @throws ApiException if fails to make API call
   */
  public List<PolicyConfiguration> policyConfigurationsGet(String organization, String project, String apiVersion, UUID repositoryId, String refName, UUID policyType, Integer top, String continuationToken) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling policyConfigurationsGet");
    }
    
    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling policyConfigurationsGet");
    }
    
    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling policyConfigurationsGet");
    }
    
    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/policy/configurations".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
      .replaceAll("\\{" + "project" + "\\}", apiClient.escapeString(project.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "repositoryId", repositoryId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "refName", refName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "policyType", policyType));
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

    GenericType<List<PolicyConfiguration>> localVarReturnType = new GenericType<List<PolicyConfiguration>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
