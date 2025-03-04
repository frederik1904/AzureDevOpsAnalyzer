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
import therealflamingo.ado.models.GitBlobRef;

import java.util.List;

/**
 * API tests for BlobsApi
 */
@Ignore
public class BlobsApiTest {

    private final BlobsApi api = new BlobsApi();


    /**
     * Get a single blob.  Repositories have both a name and an identifier. Identifiers are globally unique, but several projects may contain a repository of the same name. You don&#39;t need to include the project if you specify a repository by ID. However, if you specify a repository by name, you must also specify the project (by name or ID).
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void blobsGetBlobTest() throws Exception {
        String organization = null;
        String repositoryId = null;
        String sha1 = null;
        String project = null;
        String apiVersion = null;
        Boolean download = null;
        String fileName = null;
        String format = null;
        Boolean resolveLfs = null;
        GitBlobRef response = api.blobsGetBlob(organization, repositoryId, sha1, project, apiVersion, download, fileName, format, resolveLfs);

        // TODO: test validations
    }

    /**
     * Gets one or more blobs in a zip file download.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void blobsGetBlobsZipTest() throws Exception {
        String organization = null;
        List<String> body = null;
        String repositoryId = null;
        String project = null;
        String apiVersion = null;
        String filename = null;
        String response = api.blobsGetBlobsZip(organization, body, repositoryId, project, apiVersion, filename);

        // TODO: test validations
    }

}
