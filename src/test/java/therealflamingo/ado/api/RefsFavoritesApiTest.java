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

import therealflamingo.ado.models.GitRefFavorite;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RefsFavoritesApi
 */
@Ignore
public class RefsFavoritesApiTest {

    private final RefsFavoritesApi api = new RefsFavoritesApi();

    
    /**
     * 
     *
     * Creates a ref favorite
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void refsFavoritesCreateTest() throws Exception {
        String organization = null;
        GitRefFavorite body = null;
        String project = null;
        String apiVersion = null;
        GitRefFavorite response = api.refsFavoritesCreate(organization, body, project, apiVersion);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Deletes the refs favorite specified
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void refsFavoritesDeleteTest() throws Exception {
        String organization = null;
        String project = null;
        Integer favoriteId = null;
        String apiVersion = null;
        api.refsFavoritesDelete(organization, project, favoriteId, apiVersion);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets the refs favorite for a favorite Id.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void refsFavoritesGetTest() throws Exception {
        String organization = null;
        String project = null;
        Integer favoriteId = null;
        String apiVersion = null;
        GitRefFavorite response = api.refsFavoritesGet(organization, project, favoriteId, apiVersion);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets the refs favorites for a repo and an identity.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void refsFavoritesListTest() throws Exception {
        String organization = null;
        String project = null;
        String apiVersion = null;
        String repositoryId = null;
        String identityId = null;
        List<GitRefFavorite> response = api.refsFavoritesList(organization, project, apiVersion, repositoryId, identityId);

        // TODO: test validations
    }
    
}
