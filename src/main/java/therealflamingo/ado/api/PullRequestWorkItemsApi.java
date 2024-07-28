package therealflamingo.ado.api;

import therealflamingo.ado.invoker.ApiClient;
import therealflamingo.ado.invoker.ApiException;
import therealflamingo.ado.invoker.Configuration;
import therealflamingo.ado.invoker.Pair;
import therealflamingo.ado.models.ResourceRef;

import javax.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class PullRequestWorkItemsApi {
    private ApiClient apiClient;

    public PullRequestWorkItemsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PullRequestWorkItemsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Retrieve a list of work items associated with a pull request.
     *
     * @param organization  The name of the Azure DevOps organization. (required)
     * @param repositoryId  ID or name of the repository. (required)
     * @param pullRequestId ID of the pull request. (required)
     * @param project       Project ID or project name (required)
     * @param apiVersion    Version of the API to use.  This should be set to &#39;7.2-preview.1&#39; to use this version of the api. (required)
     * @return List<ResourceRef>
     * @throws ApiException if fails to make API call
     */
    public List<ResourceRef> pullRequestWorkItemsList(String organization, String repositoryId, Integer pullRequestId, String project, String apiVersion) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'organization' is set
        if (organization == null) {
            throw new ApiException(400, "Missing the required parameter 'organization' when calling pullRequestWorkItemsList");
        }

        // verify the required parameter 'repositoryId' is set
        if (repositoryId == null) {
            throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling pullRequestWorkItemsList");
        }

        // verify the required parameter 'pullRequestId' is set
        if (pullRequestId == null) {
            throw new ApiException(400, "Missing the required parameter 'pullRequestId' when calling pullRequestWorkItemsList");
        }

        // verify the required parameter 'project' is set
        if (project == null) {
            throw new ApiException(400, "Missing the required parameter 'project' when calling pullRequestWorkItemsList");
        }

        // verify the required parameter 'apiVersion' is set
        if (apiVersion == null) {
            throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling pullRequestWorkItemsList");
        }

        // create path and map variables
        String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/workitems".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
                .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()))
                .replaceAll("\\{" + "pullRequestId" + "\\}", apiClient.escapeString(pullRequestId.toString()))
                .replaceAll("\\{" + "project" + "\\}", apiClient.escapeString(project.toString()));

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

        String[] localVarAuthNames = new String[]{"oauth2", "accessToken"};

        GenericType<List<ResourceRef>> localVarReturnType = new GenericType<List<ResourceRef>>() {
        };
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
