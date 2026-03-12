# ProvidersApi

All URIs are relative to *https://api.trinsic.id*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getProvider**](ProvidersApi.md#getProvider) | **GET** /api/v1/providers/{providerId} | Get Provider |
| [**getProviderWithHttpInfo**](ProvidersApi.md#getProviderWithHttpInfo) | **GET** /api/v1/providers/{providerId} | Get Provider |
| [**listProviders**](ProvidersApi.md#listProviders) | **GET** /api/v1/providers | List Providers |
| [**listProvidersWithHttpInfo**](ProvidersApi.md#listProvidersWithHttpInfo) | **GET** /api/v1/providers | List Providers |



## getProvider

> GetProviderResponse getProvider(providerId)

Get Provider

Get a single identity provider by ID, including its license status.

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.ProvidersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ProvidersApi apiInstance = new ProvidersApi(defaultClient);
        String providerId = "providerId_example"; // String | The ID of the provider to retrieve
        try {
            GetProviderResponse result = apiInstance.getProvider(providerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProvidersApi#getProvider");
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
| **providerId** | **String**| The ID of the provider to retrieve | |

### Return type

[**GetProviderResponse**](GetProviderResponse.md)


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

## getProviderWithHttpInfo

> ApiResponse<GetProviderResponse> getProvider getProviderWithHttpInfo(providerId)

Get Provider

Get a single identity provider by ID, including its license status.

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.ApiResponse;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.ProvidersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ProvidersApi apiInstance = new ProvidersApi(defaultClient);
        String providerId = "providerId_example"; // String | The ID of the provider to retrieve
        try {
            ApiResponse<GetProviderResponse> response = apiInstance.getProviderWithHttpInfo(providerId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProvidersApi#getProvider");
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
| **providerId** | **String**| The ID of the provider to retrieve | |

### Return type

ApiResponse<[**GetProviderResponse**](GetProviderResponse.md)>


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

> ListProvidersResponse listProviders(licensed)

List Providers

List all identity providers available to your Organization, including their license status.

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.ProvidersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ProvidersApi apiInstance = new ProvidersApi(defaultClient);
        Boolean licensed = true; // Boolean | Filter by license status. If not specified, returns all providers.
        try {
            ListProvidersResponse result = apiInstance.listProviders(licensed);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProvidersApi#listProviders");
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
| **licensed** | **Boolean**| Filter by license status. If not specified, returns all providers. | [optional] |

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

> ApiResponse<ListProvidersResponse> listProviders listProvidersWithHttpInfo(licensed)

List Providers

List all identity providers available to your Organization, including their license status.

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.ApiResponse;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.ProvidersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ProvidersApi apiInstance = new ProvidersApi(defaultClient);
        Boolean licensed = true; // Boolean | Filter by license status. If not specified, returns all providers.
        try {
            ApiResponse<ListProvidersResponse> response = apiInstance.listProvidersWithHttpInfo(licensed);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ProvidersApi#listProviders");
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
| **licensed** | **Boolean**| Filter by license status. If not specified, returns all providers. | [optional] |

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

