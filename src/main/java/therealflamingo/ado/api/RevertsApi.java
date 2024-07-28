package therealflamingo.ado.api;

import therealflamingo.ado.invoker.ApiClient;
import therealflamingo.ado.invoker.ApiException;
import therealflamingo.ado.invoker.Configuration;
import therealflamingo.ado.invoker.Pair;
import therealflamingo.ado.models.GitAsyncRefOperationParameters;
import therealflamingo.ado.models.GitRevert;

import javax.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class RevertsApi {
    private ApiClient apiClient;

    public RevertsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RevertsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Starts the operation to create a new branch which reverts changes introduced by either a specific commit or commits that are associated to a pull request.
     *
     * @param organization The name of the Azure DevOps organization. (required)
     * @param body         (required)
     * @param project      Project ID or project name (required)
     * @param repositoryId ID of the repository. (required)
     * @param apiVersion   Version of the API to use.  This should be set to &#39;7.2-preview.2&#39; to use this version of the api. (required)
     * @return GitRevert
     * @throws ApiException if fails to make API call
     */
    public GitRevert revertsCreate(String organization, GitAsyncRefOperationParameters body, String project, String repositoryId, String apiVersion) throws ApiException {
        Object localVarPostBody = body;

        // verify the required parameter 'organization' is set
        if (organization == null) {
            throw new ApiException(400, "Missing the required parameter 'organization' when calling revertsCreate");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling revertsCreate");
        }

        // verify the required parameter 'project' is set
        if (project == null) {
            throw new ApiException(400, "Missing the required parameter 'project' when calling revertsCreate");
        }

        // verify the required parameter 'repositoryId' is set
        if (repositoryId == null) {
            throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling revertsCreate");
        }

        // verify the required parameter 'apiVersion' is set
        if (apiVersion == null) {
            throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling revertsCreate");
        }

        // create path and map variables
        String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/reverts".replaceAll("\\{format\\}", "json")
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

        String[] localVarAuthNames = new String[]{"oauth2", "accessToken"};

        GenericType<GitRevert> localVarReturnType = new GenericType<GitRevert>() {
        };
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve information about a revert operation by revert Id.
     *
     * @param organization The name of the Azure DevOps organization. (required)
     * @param project      Project ID or project name (required)
     * @param revertId     ID of the revert operation. (required)
     * @param repositoryId ID of the repository. (required)
     * @param apiVersion   Version of the API to use.  This should be set to &#39;7.2-preview.2&#39; to use this version of the api. (required)
     * @return GitRevert
     * @throws ApiException if fails to make API call
     */
    public GitRevert revertsGetRevert(String organization, String project, Integer revertId, String repositoryId, String apiVersion) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'organization' is set
        if (organization == null) {
            throw new ApiException(400, "Missing the required parameter 'organization' when calling revertsGetRevert");
        }

        // verify the required parameter 'project' is set
        if (project == null) {
            throw new ApiException(400, "Missing the required parameter 'project' when calling revertsGetRevert");
        }

        // verify the required parameter 'revertId' is set
        if (revertId == null) {
            throw new ApiException(400, "Missing the required parameter 'revertId' when calling revertsGetRevert");
        }

        // verify the required parameter 'repositoryId' is set
        if (repositoryId == null) {
            throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling revertsGetRevert");
        }

        // verify the required parameter 'apiVersion' is set
        if (apiVersion == null) {
            throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling revertsGetRevert");
        }

        // create path and map variables
        String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/reverts/{revertId}".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
                .replaceAll("\\{" + "project" + "\\}", apiClient.escapeString(project.toString()))
                .replaceAll("\\{" + "revertId" + "\\}", apiClient.escapeString(revertId.toString()))
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

        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{"oauth2", "accessToken"};

        GenericType<GitRevert> localVarReturnType = new GenericType<GitRevert>() {
        };
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieve information about a revert operation for a specific branch.
     *
     * @param organization The name of the Azure DevOps organization. (required)
     * @param project      Project ID or project name (required)
     * @param repositoryId ID of the repository. (required)
     * @param refName      The GitAsyncRefOperationParameters generatedRefName used for the revert operation. (required)
     * @param apiVersion   Version of the API to use.  This should be set to &#39;7.2-preview.2&#39; to use this version of the api. (required)
     * @return GitRevert
     * @throws ApiException if fails to make API call
     */
    public GitRevert revertsGetRevertForRefName(String organization, String project, String repositoryId, String refName, String apiVersion) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'organization' is set
        if (organization == null) {
            throw new ApiException(400, "Missing the required parameter 'organization' when calling revertsGetRevertForRefName");
        }

        // verify the required parameter 'project' is set
        if (project == null) {
            throw new ApiException(400, "Missing the required parameter 'project' when calling revertsGetRevertForRefName");
        }

        // verify the required parameter 'repositoryId' is set
        if (repositoryId == null) {
            throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling revertsGetRevertForRefName");
        }

        // verify the required parameter 'refName' is set
        if (refName == null) {
            throw new ApiException(400, "Missing the required parameter 'refName' when calling revertsGetRevertForRefName");
        }

        // verify the required parameter 'apiVersion' is set
        if (apiVersion == null) {
            throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling revertsGetRevertForRefName");
        }

        // create path and map variables
        String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/reverts".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
                .replaceAll("\\{" + "project" + "\\}", apiClient.escapeString(project.toString()))
                .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "refName", refName));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "api-version", apiVersion));


        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{"oauth2", "accessToken"};

        GenericType<GitRevert> localVarReturnType = new GenericType<GitRevert>() {
        };
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
