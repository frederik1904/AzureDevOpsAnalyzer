package therealflamingo.ado.api;

import therealflamingo.ado.invoker.ApiClient;
import therealflamingo.ado.invoker.ApiException;
import therealflamingo.ado.invoker.Configuration;
import therealflamingo.ado.invoker.Pair;
import therealflamingo.ado.models.Attachment;

import javax.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-07-28T21:17:42.501+02:00")
public class PullRequestAttachmentsApi {
  private ApiClient apiClient;

  public PullRequestAttachmentsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PullRequestAttachmentsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Attach a new file to a pull request.
   *
   * @param organization  The name of the Azure DevOps organization. (required)
   * @param body          Stream to upload (required)
   * @param fileName      The name of the file. (required)
   * @param repositoryId  The repository ID of the pull request’s target branch. (required)
   * @param pullRequestId ID of the pull request. (required)
   * @param project       Project ID or project name (required)
   * @param apiVersion    Version of the API to use.  This should be set to &#39;7.2-preview.1&#39; to use this version of the api. (required)
   * @return Attachment
   * @throws ApiException if fails to make API call
   */
  public Attachment pullRequestAttachmentsCreate(String organization, String body, String fileName, String repositoryId, Integer pullRequestId, String project, String apiVersion) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling pullRequestAttachmentsCreate");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling pullRequestAttachmentsCreate");
    }

    // verify the required parameter 'fileName' is set
    if (fileName == null) {
      throw new ApiException(400, "Missing the required parameter 'fileName' when calling pullRequestAttachmentsCreate");
    }

    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling pullRequestAttachmentsCreate");
    }

    // verify the required parameter 'pullRequestId' is set
    if (pullRequestId == null) {
      throw new ApiException(400, "Missing the required parameter 'pullRequestId' when calling pullRequestAttachmentsCreate");
    }

    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling pullRequestAttachmentsCreate");
    }

    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling pullRequestAttachmentsCreate");
    }

    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/attachments/{fileName}".replaceAll("\\{format\\}", "json")
            .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
            .replaceAll("\\{" + "fileName" + "\\}", apiClient.escapeString(fileName.toString()))
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
            "application/octet-stream"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[]{"oauth2", "accessToken"};

    GenericType<Attachment> localVarReturnType = new GenericType<Attachment>() {
    };
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  /**
   * Delete a pull request attachment.
   *
   * @param organization  The name of the Azure DevOps organization. (required)
   * @param fileName      The name of the attachment to delete. (required)
   * @param repositoryId  The repository ID of the pull request’s target branch. (required)
   * @param pullRequestId ID of the pull request. (required)
   * @param project       Project ID or project name (required)
   * @param apiVersion    Version of the API to use.  This should be set to &#39;7.2-preview.1&#39; to use this version of the api. (required)
   * @throws ApiException if fails to make API call
   */
  public void pullRequestAttachmentsDelete(String organization, String fileName, String repositoryId, Integer pullRequestId, String project, String apiVersion) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling pullRequestAttachmentsDelete");
    }

    // verify the required parameter 'fileName' is set
    if (fileName == null) {
      throw new ApiException(400, "Missing the required parameter 'fileName' when calling pullRequestAttachmentsDelete");
    }

    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling pullRequestAttachmentsDelete");
    }

    // verify the required parameter 'pullRequestId' is set
    if (pullRequestId == null) {
      throw new ApiException(400, "Missing the required parameter 'pullRequestId' when calling pullRequestAttachmentsDelete");
    }

    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling pullRequestAttachmentsDelete");
    }

    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling pullRequestAttachmentsDelete");
    }

    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/attachments/{fileName}".replaceAll("\\{format\\}", "json")
            .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
            .replaceAll("\\{" + "fileName" + "\\}", apiClient.escapeString(fileName.toString()))
            .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()))
            .replaceAll("\\{" + "pullRequestId" + "\\}", apiClient.escapeString(pullRequestId.toString()))
            .replaceAll("\\{" + "project" + "\\}", apiClient.escapeString(project.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "api-version", apiVersion));


    final String[] localVarAccepts = {

    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {

    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[]{"oauth2", "accessToken"};


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }

  /**
   * Get the file content of a pull request attachment.
   *
   * @param organization  The name of the Azure DevOps organization. (required)
   * @param fileName      The name of the attachment. (required)
   * @param repositoryId  The repository ID of the pull request’s target branch. (required)
   * @param pullRequestId ID of the pull request. (required)
   * @param project       Project ID or project name (required)
   * @param apiVersion    Version of the API to use.  This should be set to &#39;7.2-preview.1&#39; to use this version of the api. (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String pullRequestAttachmentsGet(String organization, String fileName, String repositoryId, Integer pullRequestId, String project, String apiVersion) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling pullRequestAttachmentsGet");
    }

    // verify the required parameter 'fileName' is set
    if (fileName == null) {
      throw new ApiException(400, "Missing the required parameter 'fileName' when calling pullRequestAttachmentsGet");
    }

    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling pullRequestAttachmentsGet");
    }

    // verify the required parameter 'pullRequestId' is set
    if (pullRequestId == null) {
      throw new ApiException(400, "Missing the required parameter 'pullRequestId' when calling pullRequestAttachmentsGet");
    }

    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling pullRequestAttachmentsGet");
    }

    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling pullRequestAttachmentsGet");
    }

    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/attachments/{fileName}".replaceAll("\\{format\\}", "json")
            .replaceAll("\\{" + "organization" + "\\}", apiClient.escapeString(organization.toString()))
            .replaceAll("\\{" + "fileName" + "\\}", apiClient.escapeString(fileName.toString()))
            .replaceAll("\\{" + "repositoryId" + "\\}", apiClient.escapeString(repositoryId.toString()))
            .replaceAll("\\{" + "pullRequestId" + "\\}", apiClient.escapeString(pullRequestId.toString()))
            .replaceAll("\\{" + "project" + "\\}", apiClient.escapeString(project.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "api-version", apiVersion));


    final String[] localVarAccepts = {
            "application/octet-stream", "application/zip"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {

    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[]{"oauth2", "accessToken"};

    GenericType<String> localVarReturnType = new GenericType<String>() {
    };
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  /**
   * Get a list of files attached to a given pull request.
   *
   * @param organization  The name of the Azure DevOps organization. (required)
   * @param repositoryId  The repository ID of the pull request’s target branch. (required)
   * @param pullRequestId ID of the pull request. (required)
   * @param project       Project ID or project name (required)
   * @param apiVersion    Version of the API to use.  This should be set to &#39;7.2-preview.1&#39; to use this version of the api. (required)
   * @return List<Attachment>
   * @throws ApiException if fails to make API call
   */
  public List<Attachment> pullRequestAttachmentsList(String organization, String repositoryId, Integer pullRequestId, String project, String apiVersion) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'organization' is set
    if (organization == null) {
      throw new ApiException(400, "Missing the required parameter 'organization' when calling pullRequestAttachmentsList");
    }

    // verify the required parameter 'repositoryId' is set
    if (repositoryId == null) {
      throw new ApiException(400, "Missing the required parameter 'repositoryId' when calling pullRequestAttachmentsList");
    }

    // verify the required parameter 'pullRequestId' is set
    if (pullRequestId == null) {
      throw new ApiException(400, "Missing the required parameter 'pullRequestId' when calling pullRequestAttachmentsList");
    }

    // verify the required parameter 'project' is set
    if (project == null) {
      throw new ApiException(400, "Missing the required parameter 'project' when calling pullRequestAttachmentsList");
    }

    // verify the required parameter 'apiVersion' is set
    if (apiVersion == null) {
      throw new ApiException(400, "Missing the required parameter 'apiVersion' when calling pullRequestAttachmentsList");
    }

    // create path and map variables
    String localVarPath = "/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/attachments".replaceAll("\\{format\\}", "json")
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

    GenericType<List<Attachment>> localVarReturnType = new GenericType<List<Attachment>>() {
    };
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }
}
