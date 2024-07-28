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

import therealflamingo.ado.models.GitCommitRef;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PullRequestCommitsApi
 */
@Ignore
public class PullRequestCommitsApiTest {

    private final PullRequestCommitsApi api = new PullRequestCommitsApi();

    
    /**
     * 
     *
     * Get the commits for the specified pull request.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void pullRequestCommitsGetPullRequestCommitsTest() throws Exception {
        String organization = null;
        String repositoryId = null;
        Integer pullRequestId = null;
        String project = null;
        String apiVersion = null;
        Integer top = null;
        String continuationToken = null;
        List<GitCommitRef> response = api.pullRequestCommitsGetPullRequestCommits(organization, repositoryId, pullRequestId, project, apiVersion, top, continuationToken);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get the commits for the specified iteration of a pull request.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void pullRequestCommitsGetPullRequestIterationCommitsTest() throws Exception {
        String organization = null;
        String repositoryId = null;
        Integer pullRequestId = null;
        Integer iterationId = null;
        String project = null;
        String apiVersion = null;
        Integer top = null;
        Integer skip = null;
        List<GitCommitRef> response = api.pullRequestCommitsGetPullRequestIterationCommits(organization, repositoryId, pullRequestId, iterationId, project, apiVersion, top, skip);

        // TODO: test validations
    }
    
}
