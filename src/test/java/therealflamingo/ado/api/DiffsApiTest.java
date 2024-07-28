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

import therealflamingo.ado.models.GitCommitDiffs;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DiffsApi
 */
@Ignore
public class DiffsApiTest {

    private final DiffsApi api = new DiffsApi();

    
    /**
     * 
     *
     * Find the closest common commit (the merge base) between base and target commits, and get the diff between either the base and target commits or common and target commits.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void diffsGetTest() throws Exception {
        String organization = null;
        String repositoryId = null;
        String project = null;
        String apiVersion = null;
        Boolean diffCommonCommit = null;
        Integer top = null;
        Integer skip = null;
        String baseVersion = null;
        String baseVersionOptions = null;
        String baseVersionType = null;
        String targetVersion = null;
        String targetVersionOptions = null;
        String targetVersionType = null;
        GitCommitDiffs response = api.diffsGet(organization, repositoryId, project, apiVersion, diffCommonCommit, top, skip, baseVersion, baseVersionOptions, baseVersionType, targetVersion, targetVersionOptions, targetVersionType);

        // TODO: test validations
    }
    
}
