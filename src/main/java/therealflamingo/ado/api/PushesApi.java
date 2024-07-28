package therealflamingo.ado.api;

import org.threeten.bp.OffsetDateTime;
import therealflamingo.ado.invoker.ApiClient;
import therealflamingo.ado.invoker.ApiException;
import therealflamingo.ado.invoker.Configuration;
import therealflamingo.ado.invoker.Pair;
import therealflamingo.ado.models.GitPush;

import javax.ws.rs.core.GenericType;
import java.util.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class PushesApi {
    private ApiClient apiClient;

    public PushesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PushesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Push changes to the repository.
     *
     * @param organization The name of the Azure DevOps organization. (required)
     * @param body         (required)
     * @param repositoryId The name or ID of the repository. (required)
     * @param project      Project ID or project name (required)
     * @param apiVersion   Version of the API to use.  This should be set to &#39;7.2-preview.3&#39; to use this version of the api. (required)
     * @return GitPush
     * @throws ApiException if fails to make API call
     */
    public GitPush pushesCreate(String organization, GitPush body, String repositoryId, String project, String apiVersion) throws ApiException {
        Object localVarPostBody = body;

        // verify the required parameter 'organization' is set
        if (organization == null) {
            throw new ApiException(400, "Missing the required parameter 'organization' when calling pushesCreate");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling pushesCreate");
        }

        // verify the required parameter 'repositoryId' is set
        if (repositoryId == null) {
            throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling pushesCreate");
        }

        // verify the required parameter 'project' is set
        if (project == null) {
            throw new ApiException(400, "Missing the required parameter 'project' when calling pushesCreate");
        }

        // verify the required parameter 'apiVersion' is set
        if (apiVersion == null) {
            throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling pushesCreate");
        }

        // create path and map variables
        String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/pushes".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
                .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()))
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
                "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{"oauth2", "accessToken"};

        GenericType<GitPush> localVarReturnType = new GenericType<GitPush>() {
        };
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieves a particular push.
     *
     * @param organization      The name of the Azure DevOps organization. (required)
     * @param repositoryId      The name or ID of the repository. (required)
     * @param pushId            ID of the push. (required)
     * @param project           Project ID or project name (required)
     * @param apiVersion        Version of the API to use.  This should be set to &#39;7.2-preview.3&#39; to use this version of the api. (required)
     * @param includeCommits    The number of commits to include in the result. (optional)
     * @param includeRefUpdates If true, include the list of refs that were updated by the push. (optional)
     * @return GitPush
     * @throws ApiException if fails to make API call
     */
    public GitPush pushesGet(String organization, String repositoryId, Integer pushId, String project, String apiVersion, Integer includeCommits, Boolean includeRefUpdates) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'organization' is set
        if (organization == null) {
            throw new ApiException(400, "Missing the required parameter 'organization' when calling pushesGet");
        }

        // verify the required parameter 'repositoryId' is set
        if (repositoryId == null) {
            throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling pushesGet");
        }

        // verify the required parameter 'pushId' is set
        if (pushId == null) {
            throw new ApiException(400, "Missing the required parameter 'pushId' when calling pushesGet");
        }

        // verify the required parameter 'project' is set
        if (project == null) {
            throw new ApiException(400, "Missing the required parameter 'project' when calling pushesGet");
        }

        // verify the required parameter 'apiVersion' is set
        if (apiVersion == null) {
            throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling pushesGet");
        }

        // create path and map variables
        String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/pushes/{pushId}".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
                .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()))
                .replaceAll("\\{" + "pushId" + "\\}", apiClient.escapeString(pushId.toString()))
                .replaceAll("\\{" + "project" + "\\}", apiClient.escapeString(project.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeCommits", includeCommits));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "includeRefUpdates", includeRefUpdates));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "api-version", apiVersion));


        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{"oauth2", "accessToken"};

        GenericType<GitPush> localVarReturnType = new GenericType<GitPush>() {
        };
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Retrieves pushes associated with the specified repository.
     *
     * @param organization                    The name of the Azure DevOps organization. (required)
     * @param repositoryId                    The name or ID of the repository. (required)
     * @param project                         Project ID or project name (required)
     * @param apiVersion                      Version of the API to use.  This should be set to &#39;7.2-preview.3&#39; to use this version of the api. (required)
     * @param skip                            Number of pushes to skip. (optional)
     * @param top                             Number of pushes to return. (optional)
     * @param searchCriteriaFromDate          Search criteria attributes: fromDate, toDate, pusherId, refName, includeRefUpdates or includeLinks. fromDate: Start date to search from. toDate: End date to search to. pusherId: Identity of the person who submitted the push. refName: Branch name to consider. includeRefUpdates: If true, include the list of refs that were updated by the push. includeLinks: Whether to include the _links field on the shallow references. (optional)
     * @param searchCriteriaIncludeLinks      Whether to include the _links field on the shallow references (optional)
     * @param searchCriteriaIncludeRefUpdates Search criteria attributes: fromDate, toDate, pusherId, refName, includeRefUpdates or includeLinks. fromDate: Start date to search from. toDate: End date to search to. pusherId: Identity of the person who submitted the push. refName: Branch name to consider. includeRefUpdates: If true, include the list of refs that were updated by the push. includeLinks: Whether to include the _links field on the shallow references. (optional)
     * @param searchCriteriaPusherId          Search criteria attributes: fromDate, toDate, pusherId, refName, includeRefUpdates or includeLinks. fromDate: Start date to search from. toDate: End date to search to. pusherId: Identity of the person who submitted the push. refName: Branch name to consider. includeRefUpdates: If true, include the list of refs that were updated by the push. includeLinks: Whether to include the _links field on the shallow references. (optional)
     * @param searchCriteriaRefName           Search criteria attributes: fromDate, toDate, pusherId, refName, includeRefUpdates or includeLinks. fromDate: Start date to search from. toDate: End date to search to. pusherId: Identity of the person who submitted the push. refName: Branch name to consider. includeRefUpdates: If true, include the list of refs that were updated by the push. includeLinks: Whether to include the _links field on the shallow references. (optional)
     * @param searchCriteriaToDate            Search criteria attributes: fromDate, toDate, pusherId, refName, includeRefUpdates or includeLinks. fromDate: Start date to search from. toDate: End date to search to. pusherId: Identity of the person who submitted the push. refName: Branch name to consider. includeRefUpdates: If true, include the list of refs that were updated by the push. includeLinks: Whether to include the _links field on the shallow references. (optional)
     * @return List<GitPush>
     * @throws ApiException if fails to make API call
     */
    public List<GitPush> pushesList(String organization, String repositoryId, String project, String apiVersion, Integer skip, Integer top, OffsetDateTime searchCriteriaFromDate, Boolean searchCriteriaIncludeLinks, Boolean searchCriteriaIncludeRefUpdates, UUID searchCriteriaPusherId, String searchCriteriaRefName, OffsetDateTime searchCriteriaToDate) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'organization' is set
        if (organization == null) {
            throw new ApiException(400, "Missing the required parameter 'organization' when calling pushesList");
        }

        // verify the required parameter 'repositoryId' is set
        if (repositoryId == null) {
            throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling pushesList");
        }

        // verify the required parameter 'project' is set
        if (project == null) {
            throw new ApiException(400, "Missing the required parameter 'project' when calling pushesList");
        }

        // verify the required parameter 'apiVersion' is set
        if (apiVersion == null) {
            throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling pushesList");
        }

        // create path and map variables
        String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/pushes".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
                .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()))
                .replaceAll("\\{" + "project" + "\\}", apiClient.escapeString(project.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "$skip", skip));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "$top", top));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchCriteria.fromDate", searchCriteriaFromDate));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchCriteria.includeLinks", searchCriteriaIncludeLinks));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchCriteria.includeRefUpdates", searchCriteriaIncludeRefUpdates));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchCriteria.pusherId", searchCriteriaPusherId));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchCriteria.refName", searchCriteriaRefName));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "searchCriteria.toDate", searchCriteriaToDate));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "api-version", apiVersion));


        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{"oauth2", "accessToken"};

        GenericType<List<GitPush>> localVarReturnType = new GenericType<List<GitPush>>() {
        };
        return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
