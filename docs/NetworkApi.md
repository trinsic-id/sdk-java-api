# NetworkApi

All URIs are relative to *https://api.trinsic.id*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listProviders**](NetworkApi.md#listProviders) | **GET** /api/v1/network/providers | List Identity Providers |
| [**listProvidersWithHttpInfo**](NetworkApi.md#listProvidersWithHttpInfo) | **GET** /api/v1/network/providers | List Identity Providers |
| [**recommendProviders**](NetworkApi.md#recommendProviders) | **POST** /api/v1/network/recommend | Recommend Providers |
| [**recommendProvidersWithHttpInfo**](NetworkApi.md#recommendProvidersWithHttpInfo) | **POST** /api/v1/network/recommend | Recommend Providers |



## listProviders

> ListProvidersResponse listProviders()

List Identity Providers

List all identity providers available for use

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.NetworkApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        NetworkApi apiInstance = new NetworkApi(defaultClient);
        try {
            ListProvidersResponse result = apiInstance.listProviders();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkApi#listProviders");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ListProvidersResponse**](ListProvidersResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

## listProvidersWithHttpInfo

> ApiResponse<ListProvidersResponse> listProviders listProvidersWithHttpInfo()

List Identity Providers

List all identity providers available for use

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.ApiResponse;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.NetworkApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        NetworkApi apiInstance = new NetworkApi(defaultClient);
        try {
            ApiResponse<ListProvidersResponse> response = apiInstance.listProvidersWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkApi#listProviders");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**ListProvidersResponse**](ListProvidersResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |


## recommendProviders

> RecommendResponse recommendProviders(recommendRequest)

Recommend Providers

Generate provider recommendations based on the given signals (phone number, countries, states).

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.NetworkApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        NetworkApi apiInstance = new NetworkApi(defaultClient);
        RecommendRequest recommendRequest = new RecommendRequest(); // RecommendRequest | 
        try {
            RecommendResponse result = apiInstance.recommendProviders(recommendRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkApi#recommendProviders");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **recommendRequest** | [**RecommendRequest**](RecommendRequest.md)|  | [optional] |

### Return type

[**RecommendResponse**](RecommendResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

## recommendProvidersWithHttpInfo

> ApiResponse<RecommendResponse> recommendProviders recommendProvidersWithHttpInfo(recommendRequest)

Recommend Providers

Generate provider recommendations based on the given signals (phone number, countries, states).

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.ApiResponse;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.NetworkApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        NetworkApi apiInstance = new NetworkApi(defaultClient);
        RecommendRequest recommendRequest = new RecommendRequest(); // RecommendRequest | 
        try {
            ApiResponse<RecommendResponse> response = apiInstance.recommendProvidersWithHttpInfo(recommendRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkApi#recommendProviders");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **recommendRequest** | [**RecommendRequest**](RecommendRequest.md)|  | [optional] |

### Return type

ApiResponse<[**RecommendResponse**](RecommendResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

