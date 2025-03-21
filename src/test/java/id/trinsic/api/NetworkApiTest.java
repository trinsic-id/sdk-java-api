/*
 * Trinsic API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package id.trinsic.api;

import id.trinsic.ApiException;
import id.trinsic.api.models.ListProvidersResponse;
import id.trinsic.api.models.ProblemDetails;
import id.trinsic.api.models.RecommendRequest;
import id.trinsic.api.models.RecommendResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * API tests for NetworkApi
 */
@Disabled
public class NetworkApiTest {

    private final NetworkApi api = new NetworkApi();

    
    /**
     * List Identity Providers
     *
     * List all identity providers available for use
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listProvidersTest() throws ApiException {
        ListProvidersResponse response = 
        api.listProviders();
        
        // TODO: test validations
    }
    
    /**
     * Recommend Providers
     *
     * Generate provider recommendations based on the given signals (phone number, countries, states).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void recommendProvidersTest() throws ApiException {
        RecommendRequest recommendRequest = null;
        RecommendResponse response = 
        api.recommendProviders(recommendRequest);
        
        // TODO: test validations
    }
    
}
