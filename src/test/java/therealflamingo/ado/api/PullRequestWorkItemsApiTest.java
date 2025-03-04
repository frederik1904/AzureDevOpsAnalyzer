/*
 * Git
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 7.2-preview
 * Contact: nugetvss@microsoft.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package therealflamingo.ado.api;

import org.junit.Ignore;
import org.junit.Test;
import therealflamingo.ado.models.ResourceRef;

import java.util.List;

/**
 * API tests for PullRequestWorkItemsApi
 */
@Ignore
public class PullRequestWorkItemsApiTest {

    private final PullRequestWorkItemsApi api = new PullRequestWorkItemsApi();


    /**
     * Retrieve a list of work items associated with a pull request.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void pullRequestWorkItemsListTest() throws Exception {
        String organization = null;
        String repositoryId = null;
        Integer pullRequestId = null;
        String project = null;
        String apiVersion = null;
        List<ResourceRef> response = api.pullRequestWorkItemsList(organization, repositoryId, pullRequestId, project, apiVersion);

        // TODO: test validations
    }

}
