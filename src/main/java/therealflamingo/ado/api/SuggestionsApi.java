package therealflamingo.ado.api;

import therealflamingo.ado.invoker.ApiClient;
import therealflamingo.ado.invoker.ApiException;
import therealflamingo.ado.invoker.Configuration;
import therealflamingo.ado.invoker.Pair;
import therealflamingo.ado.models.GitSuggestion;

import javax.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class SuggestionsApi {
    private ApiClient apiClient;

    public SuggestionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SuggestionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Retrieve a pull request suggestion for a particular repository or team project.
     *
     * @param organization        The name of the Azure DevOps organization. (required)
     * @param repositoryId        ID of the git repository. (required)
     * @param project             Project ID or project name (required)
     * @param apiVersion          Version of the API to use.  This should be set to &#39;7.2-preview.1&#39; to use this version of the api. (required)
     * @param preferCompareBranch If true, prefer the compare branch over the default branch as target branch for pull requests. (optional)
     * @return List<GitSuggestion>
     * @throws ApiException if fails to make API call
     */
    public List<GitSuggestion> suggestionsList(String organization, String repositoryId, String project, String apiVersion, Boolean preferCompareBranch) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'organization' is set
        if (organization == null) {
            throw new ApiException(400, "Missing the required parameter 'organization' when calling suggestionsList");
        }

        // verify the required parameter 'repositoryId' is set
        if (repositoryId == null) {
            throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling suggestionsList");
        }

        // verify the required parameter 'project' is set
        if (project == null) {
            throw new ApiException(400, "Missing the required parameter 'project' when calling suggestionsList");
        }

        // verify the required parameter 'apiVersion' is set
        if (apiVersion == null) {
            throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling suggestionsList");
        }

        // create path and map variables
        String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/suggestions".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
                .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()))
                .replaceAll("\\{" + "project" + "\\}", apiClient.escapeString(project.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "preferCompareBranch", preferCompareBranch));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "api-version", apiVersion));


        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{"oauth2", "accessToken"};

        GenericType<List<GitSuggestion>> localVarReturnType = new GenericType<List<GitSuggestion>>() {
        };
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
