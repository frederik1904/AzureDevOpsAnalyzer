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
import therealflamingo.ado.models.GitDeletedRepository;
import therealflamingo.ado.models.GitRecycleBinRepositoryDetails;
import therealflamingo.ado.models.GitRepository;
import therealflamingo.ado.models.GitRepositoryCreateOptions;

import java.util.List;
import java.util.UUID;

/**
 * API tests for RepositoriesApi
 */
@Ignore
public class RepositoriesApiTest {

    private final RepositoriesApi api = new RepositoriesApi();


    /**
     * Create a git repository in a team project.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void repositoriesCreateTest() throws Exception {
        String organization = null;
        GitRepositoryCreateOptions body = null;
        String project = null;
        String apiVersion = null;
        String sourceRef = null;
        GitRepository response = api.repositoriesCreate(organization, body, project, apiVersion, sourceRef);

        // TODO: test validations
    }

    /**
     * Delete a git repository
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void repositoriesDeleteTest() throws Exception {
        String organization = null;
        UUID repositoryId = null;
        String project = null;
        String apiVersion = null;
        api.repositoriesDelete(organization, repositoryId, project, apiVersion);

        // TODO: test validations
    }

    /**
     * Destroy (hard delete) a soft-deleted Git repository.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void repositoriesDeleteRepositoryFromRecycleBinTest() throws Exception {
        String organization = null;
        String project = null;
        UUID repositoryId = null;
        String apiVersion = null;
        api.repositoriesDeleteRepositoryFromRecycleBin(organization, project, repositoryId, apiVersion);

        // TODO: test validations
    }

    /**
     * Retrieve deleted git repositories.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void repositoriesGetDeletedRepositoriesTest() throws Exception {
        String organization = null;
        String project = null;
        String apiVersion = null;
        List<GitDeletedRepository> response = api.repositoriesGetDeletedRepositories(organization, project, apiVersion);

        // TODO: test validations
    }

    /**
     * Retrieve soft-deleted git repositories from the recycle bin.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void repositoriesGetRecycleBinRepositoriesTest() throws Exception {
        String organization = null;
        String project = null;
        String apiVersion = null;
        List<GitDeletedRepository> response = api.repositoriesGetRecycleBinRepositories(organization, project, apiVersion);

        // TODO: test validations
    }

    /**
     * Retrieve a git repository.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void repositoriesGetRepositoryTest() throws Exception {
        String organization = null;
        String repositoryId = null;
        String project = null;
        String apiVersion = null;
        GitRepository response = api.repositoriesGetRepository(organization, repositoryId, project, apiVersion);

        // TODO: test validations
    }

    /**
     * Retrieve git repositories.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void repositoriesListTest() throws Exception {
        String organization = null;
        String project = null;
        String apiVersion = null;
        Boolean includeLinks = null;
        Boolean includeAllUrls = null;
        Boolean includeHidden = null;
        List<GitRepository> response = api.repositoriesList(organization, project, apiVersion, includeLinks, includeAllUrls, includeHidden);

        // TODO: test validations
    }

    /**
     * Recover a soft-deleted Git repository. Recently deleted repositories go into a soft-delete state for a period of time before they are hard deleted and become unrecoverable.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void repositoriesRestoreRepositoryFromRecycleBinTest() throws Exception {
        String organization = null;
        GitRecycleBinRepositoryDetails body = null;
        String project = null;
        UUID repositoryId = null;
        String apiVersion = null;
        GitRepository response = api.repositoriesRestoreRepositoryFromRecycleBin(organization, body, project, repositoryId, apiVersion);

        // TODO: test validations
    }

    /**
     * Updates the Git repository with either a new repo name or a new default branch.
     *
     * @throws Exception if the Api call fails
     */
    @Test
    public void repositoriesUpdateTest() throws Exception {
        String organization = null;
        GitRepository body = null;
        UUID repositoryId = null;
        String project = null;
        String apiVersion = null;
        GitRepository response = api.repositoriesUpdate(organization, body, repositoryId, project, apiVersion);

        // TODO: test validations
    }

}
