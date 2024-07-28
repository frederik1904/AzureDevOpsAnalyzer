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

import therealflamingo.ado.models.GitPullRequestIterationChanges;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PullRequestIterationChangesApi
 */
@Ignore
public class PullRequestIterationChangesApiTest {

    private final PullRequestIterationChangesApi api = new PullRequestIterationChangesApi();

    
    /**
     * 
     *
     * Retrieve the changes made in a pull request between two iterations.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void pullRequestIterationChangesGetTest() throws Exception {
        String organization = null;
        String repositoryId = null;
        Integer pullRequestId = null;
        Integer iterationId = null;
        String project = null;
        String apiVersion = null;
        Integer top = null;
        Integer skip = null;
        Integer compareTo = null;
        GitPullRequestIterationChanges response = api.pullRequestIterationChangesGet(organization, repositoryId, pullRequestId, iterationId, project, apiVersion, top, skip, compareTo);

        // TODO: test validations
    }
    
}
