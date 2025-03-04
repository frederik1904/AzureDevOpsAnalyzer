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
import therealflamingo.ado.models.GitRef;
import therealflamingo.ado.models.GitRefUpdate;
import therealflamingo.ado.models.GitRefUpdateResult;

import java.util.List;

/**
 * API tests for RefsApi
 */
@Ignore
public class RefsApiTest {

    private final RefsApi api = new RefsApi();


    /**
     * Queries the provided repository for its refs and returns them.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void refsListTest() throws Exception {
        String organization = null;
        String repositoryId = null;
        String project = null;
        String apiVersion = null;
        String filter = null;
        Boolean includeLinks = null;
        Boolean includeStatuses = null;
        Boolean includeMyBranches = null;
        Boolean latestStatusesOnly = null;
        Boolean peelTags = null;
        String filterContains = null;
        Integer top = null;
        String continuationToken = null;
        List<GitRef> response = api.refsList(organization, repositoryId, project, apiVersion, filter, includeLinks, includeStatuses, includeMyBranches, latestStatusesOnly, peelTags, filterContains, top, continuationToken);

        // TODO: test validations
    }

    /**
     * Lock or Unlock a branch.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void refsUpdateRefTest() throws Exception {
        String organization = null;
        GitRefUpdate body = null;
        String repositoryId = null;
        String filter = null;
        String project = null;
        String apiVersion = null;
        String projectId = null;
        GitRef response = api.refsUpdateRef(organization, body, repositoryId, filter, project, apiVersion, projectId);

        // TODO: test validations
    }

    /**
     * Creating, updating, or deleting refs(branches).  Updating a ref means making it point at a different commit than it used to. You must specify both the old and new commit to avoid race conditions.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void refsUpdateRefsTest() throws Exception {
        String organization = null;
        List<GitRefUpdate> body = null;
        String repositoryId = null;
        String project = null;
        String apiVersion = null;
        String projectId = null;
        List<GitRefUpdateResult> response = api.refsUpdateRefs(organization, body, repositoryId, project, apiVersion, projectId);

        // TODO: test validations
    }

}
