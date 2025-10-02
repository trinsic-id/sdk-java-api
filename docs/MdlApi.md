# MdlApi

All URIs are relative to *https://api.trinsic.id*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createMdlExchange**](MdlApi.md#createMdlExchange) | **POST** /api/valpha/mdl/exchanges/create | Create mDL Exchange |
| [**createMdlExchangeWithHttpInfo**](MdlApi.md#createMdlExchangeWithHttpInfo) | **POST** /api/valpha/mdl/exchanges/create | Create mDL Exchange |
| [**finalizeMdlExchange**](MdlApi.md#finalizeMdlExchange) | **POST** /api/valpha/mdl/exchanges/finalize | Finalize mDL Exchange |
| [**finalizeMdlExchangeWithHttpInfo**](MdlApi.md#finalizeMdlExchangeWithHttpInfo) | **POST** /api/valpha/mdl/exchanges/finalize | Finalize mDL Exchange |



## createMdlExchange

> CreateMdlExchangeResponse createMdlExchange(createMdlExchangeRequest)

Create mDL Exchange

Creates a new mDL Exchange, returning an exchange ID, request object string, and context string.              mDL Exchanges are ephemeral until completion -- no state is stored within Trinsic until the exchange is finalized.              This API currently only supports Google Wallet on Android via Web or Native. Apple Wallet support is coming soon.

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.MdlApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        MdlApi apiInstance = new MdlApi(defaultClient);
        CreateMdlExchangeRequest createMdlExchangeRequest = new CreateMdlExchangeRequest(); // CreateMdlExchangeRequest | 
        try {
            CreateMdlExchangeResponse result = apiInstance.createMdlExchange(createMdlExchangeRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MdlApi#createMdlExchange");
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
| **createMdlExchangeRequest** | [**CreateMdlExchangeRequest**](CreateMdlExchangeRequest.md)|  | [optional] |

### Return type

[**CreateMdlExchangeResponse**](CreateMdlExchangeResponse.md)


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

## createMdlExchangeWithHttpInfo

> ApiResponse<CreateMdlExchangeResponse> createMdlExchange createMdlExchangeWithHttpInfo(createMdlExchangeRequest)

Create mDL Exchange

Creates a new mDL Exchange, returning an exchange ID, request object string, and context string.              mDL Exchanges are ephemeral until completion -- no state is stored within Trinsic until the exchange is finalized.              This API currently only supports Google Wallet on Android via Web or Native. Apple Wallet support is coming soon.

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.ApiResponse;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.MdlApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        MdlApi apiInstance = new MdlApi(defaultClient);
        CreateMdlExchangeRequest createMdlExchangeRequest = new CreateMdlExchangeRequest(); // CreateMdlExchangeRequest | 
        try {
            ApiResponse<CreateMdlExchangeResponse> response = apiInstance.createMdlExchangeWithHttpInfo(createMdlExchangeRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MdlApi#createMdlExchange");
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
| **createMdlExchangeRequest** | [**CreateMdlExchangeRequest**](CreateMdlExchangeRequest.md)|  | [optional] |

### Return type

ApiResponse<[**CreateMdlExchangeResponse**](CreateMdlExchangeResponse.md)>


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


## finalizeMdlExchange

> FinalizeMdlExchangeResponse finalizeMdlExchange(finalizeMdlExchangeRequest)

Finalize mDL Exchange

Finalizes an mDL Exchange, processing the results

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.MdlApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        MdlApi apiInstance = new MdlApi(defaultClient);
        FinalizeMdlExchangeRequest finalizeMdlExchangeRequest = new FinalizeMdlExchangeRequest(); // FinalizeMdlExchangeRequest | 
        try {
            FinalizeMdlExchangeResponse result = apiInstance.finalizeMdlExchange(finalizeMdlExchangeRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MdlApi#finalizeMdlExchange");
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
| **finalizeMdlExchangeRequest** | [**FinalizeMdlExchangeRequest**](FinalizeMdlExchangeRequest.md)|  | [optional] |

### Return type

[**FinalizeMdlExchangeResponse**](FinalizeMdlExchangeResponse.md)


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

## finalizeMdlExchangeWithHttpInfo

> ApiResponse<FinalizeMdlExchangeResponse> finalizeMdlExchange finalizeMdlExchangeWithHttpInfo(finalizeMdlExchangeRequest)

Finalize mDL Exchange

Finalizes an mDL Exchange, processing the results

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.ApiResponse;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.MdlApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        MdlApi apiInstance = new MdlApi(defaultClient);
        FinalizeMdlExchangeRequest finalizeMdlExchangeRequest = new FinalizeMdlExchangeRequest(); // FinalizeMdlExchangeRequest | 
        try {
            ApiResponse<FinalizeMdlExchangeResponse> response = apiInstance.finalizeMdlExchangeWithHttpInfo(finalizeMdlExchangeRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MdlApi#finalizeMdlExchange");
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
| **finalizeMdlExchangeRequest** | [**FinalizeMdlExchangeRequest**](FinalizeMdlExchangeRequest.md)|  | [optional] |

### Return type

ApiResponse<[**FinalizeMdlExchangeResponse**](FinalizeMdlExchangeResponse.md)>


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

