# NetworkApi

All URIs are relative to *https://api.trinsic.id*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listProviderContracts**](NetworkApi.md#listProviderContracts) | **GET** /api/v1/network/{verificationProfileId}/providers/contracts | List Provider Contracts |
| [**listProviderContractsWithHttpInfo**](NetworkApi.md#listProviderContractsWithHttpInfo) | **GET** /api/v1/network/{verificationProfileId}/providers/contracts | List Provider Contracts |
| [**listProviders**](NetworkApi.md#listProviders) | **GET** /api/v1/network/{verificationProfileId}/providers |  |
| [**listProvidersWithHttpInfo**](NetworkApi.md#listProvidersWithHttpInfo) | **GET** /api/v1/network/{verificationProfileId}/providers |  |
| [**recommendProviders**](NetworkApi.md#recommendProviders) | **POST** /api/v1/network/recommend | Recommend Providers |
| [**recommendProvidersWithHttpInfo**](NetworkApi.md#recommendProvidersWithHttpInfo) | **POST** /api/v1/network/recommend | Recommend Providers |



## listProviderContracts

> ListProviderContractsResponse listProviderContracts(verificationProfileId)

List Provider Contracts

List the contracts for all Providers available to your App.              If your App is in test mode, this call will only return Providers available in test mode. If your App is not in test mode, this call will only return Providers available in production.

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
        UUID verificationProfileId = UUID.randomUUID(); // UUID | 
        try {
            ListProviderContractsResponse result = apiInstance.listProviderContracts(verificationProfileId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkApi#listProviderContracts");
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
| **verificationProfileId** | **UUID**|  | |

### Return type

[**ListProviderContractsResponse**](ListProviderContractsResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

## listProviderContractsWithHttpInfo

> ApiResponse<ListProviderContractsResponse> listProviderContracts listProviderContractsWithHttpInfo(verificationProfileId)

List Provider Contracts

List the contracts for all Providers available to your App.              If your App is in test mode, this call will only return Providers available in test mode. If your App is not in test mode, this call will only return Providers available in production.

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
        UUID verificationProfileId = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<ListProviderContractsResponse> response = apiInstance.listProviderContractsWithHttpInfo(verificationProfileId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling NetworkApi#listProviderContracts");
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
| **verificationProfileId** | **UUID**|  | |

### Return type

ApiResponse<[**ListProviderContractsResponse**](ListProviderContractsResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |


## listProviders

> ListProvidersResponse listProviders(verificationProfileId, health)



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
        UUID verificationProfileId = UUID.randomUUID(); // UUID | 
        String health = "health_example"; // String | 
        try {
            ListProvidersResponse result = apiInstance.listProviders(verificationProfileId, health);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **verificationProfileId** | **UUID**|  | |
| **health** | **String**|  | [optional] |

### Return type

[**ListProvidersResponse**](ListProvidersResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

## listProvidersWithHttpInfo

> ApiResponse<ListProvidersResponse> listProviders listProvidersWithHttpInfo(verificationProfileId, health)



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
        UUID verificationProfileId = UUID.randomUUID(); // UUID | 
        String health = "health_example"; // String | 
        try {
            ApiResponse<ListProvidersResponse> response = apiInstance.listProvidersWithHttpInfo(verificationProfileId, health);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **verificationProfileId** | **UUID**|  | |
| **health** | **String**|  | [optional] |

### Return type

ApiResponse<[**ListProvidersResponse**](ListProvidersResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json, application/problem+json

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

Generate provider recommendations based on signals about the user&#39;s location (phone number, countries, states).

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
- **Accept**: text/plain, application/json, text/json, application/problem+json

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

Generate provider recommendations based on signals about the user&#39;s location (phone number, countries, states).

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
- **Accept**: text/plain, application/json, text/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

