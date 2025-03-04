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
import therealflamingo.ado.models.Comment;

import java.util.List;

/**
 * API tests for PullRequestThreadCommentsApi
 */
@Ignore
public class PullRequestThreadCommentsApiTest {

    private final PullRequestThreadCommentsApi api = new PullRequestThreadCommentsApi();


    /**
     * Create a comment on a specific thread in a pull request (up to 500 comments can be created per thread).
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void pullRequestThreadCommentsCreateTest() throws Exception {
        String organization = null;
        Comment body = null;
        String repositoryId = null;
        Integer pullRequestId = null;
        Integer threadId = null;
        String project = null;
        String apiVersion = null;
        Comment response = api.pullRequestThreadCommentsCreate(organization, body, repositoryId, pullRequestId, threadId, project, apiVersion);

        // TODO: test validations
    }

    /**
     * Delete a comment associated with a specific thread in a pull request.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void pullRequestThreadCommentsDeleteTest() throws Exception {
        String organization = null;
        String repositoryId = null;
        Integer pullRequestId = null;
        Integer threadId = null;
        Integer commentId = null;
        String project = null;
        String apiVersion = null;
        api.pullRequestThreadCommentsDelete(organization, repositoryId, pullRequestId, threadId, commentId, project, apiVersion);

        // TODO: test validations
    }

    /**
     * Retrieve a comment associated with a specific thread in a pull request.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void pullRequestThreadCommentsGetTest() throws Exception {
        String organization = null;
        String repositoryId = null;
        Integer pullRequestId = null;
        Integer threadId = null;
        Integer commentId = null;
        String project = null;
        String apiVersion = null;
        Comment response = api.pullRequestThreadCommentsGet(organization, repositoryId, pullRequestId, threadId, commentId, project, apiVersion);

        // TODO: test validations
    }

    /**
     * Retrieve all comments associated with a specific thread in a pull request.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void pullRequestThreadCommentsListTest() throws Exception {
        String organization = null;
        String repositoryId = null;
        Integer pullRequestId = null;
        Integer threadId = null;
        String project = null;
        String apiVersion = null;
        List<Comment> response = api.pullRequestThreadCommentsList(organization, repositoryId, pullRequestId, threadId, project, apiVersion);

        // TODO: test validations
    }

    /**
     * Update a comment associated with a specific thread in a pull request.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void pullRequestThreadCommentsUpdateTest() throws Exception {
        String organization = null;
        Comment body = null;
        String repositoryId = null;
        Integer pullRequestId = null;
        Integer threadId = null;
        Integer commentId = null;
        String project = null;
        String apiVersion = null;
        Comment response = api.pullRequestThreadCommentsUpdate(organization, body, repositoryId, pullRequestId, threadId, commentId, project, apiVersion);

        // TODO: test validations
    }

}
