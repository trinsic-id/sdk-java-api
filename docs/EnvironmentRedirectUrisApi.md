# EnvironmentRedirectUrisApi

All URIs are relative to *https://api.trinsic.id*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**add**](EnvironmentRedirectUrisApi.md#add) | **POST** /api/valpha/environments/redirect-uris | Add Redirect URI |
| [**addWithHttpInfo**](EnvironmentRedirectUrisApi.md#addWithHttpInfo) | **POST** /api/valpha/environments/redirect-uris | Add Redirect URI |
| [**callList**](EnvironmentRedirectUrisApi.md#callList) | **GET** /api/valpha/environments/redirect-uris | List Redirect URIs |
| [**callListWithHttpInfo**](EnvironmentRedirectUrisApi.md#callListWithHttpInfo) | **GET** /api/valpha/environments/redirect-uris | List Redirect URIs |
| [**delete**](EnvironmentRedirectUrisApi.md#delete) | **DELETE** /api/valpha/environments/redirect-uris/{id} | Delete Redirect URI |
| [**deleteWithHttpInfo**](EnvironmentRedirectUrisApi.md#deleteWithHttpInfo) | **DELETE** /api/valpha/environments/redirect-uris/{id} | Delete Redirect URI |



## add

> AddRedirectUriResponse add(environmentRedirectUrisAddRequest)

Add Redirect URI

Add a new redirect uri to the environment.

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.EnvironmentRedirectUrisApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        EnvironmentRedirectUrisApi apiInstance = new EnvironmentRedirectUrisApi(defaultClient);
        EnvironmentRedirectUrisAddRequest environmentRedirectUrisAddRequest = new EnvironmentRedirectUrisAddRequest(); // EnvironmentRedirectUrisAddRequest | Request for uri to add to the environment. Must be absolute, not relative. Wildcard \"*\" accepted.
        try {
            AddRedirectUriResponse result = apiInstance.add(environmentRedirectUrisAddRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EnvironmentRedirectUrisApi#add");
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
| **environmentRedirectUrisAddRequest** | [**EnvironmentRedirectUrisAddRequest**](EnvironmentRedirectUrisAddRequest.md)| Request for uri to add to the environment. Must be absolute, not relative. Wildcard \&quot;*\&quot; accepted. | [optional] |

### Return type

[**AddRedirectUriResponse**](AddRedirectUriResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

## addWithHttpInfo

> ApiResponse<AddRedirectUriResponse> add addWithHttpInfo(environmentRedirectUrisAddRequest)

Add Redirect URI

Add a new redirect uri to the environment.

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.ApiResponse;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.EnvironmentRedirectUrisApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        EnvironmentRedirectUrisApi apiInstance = new EnvironmentRedirectUrisApi(defaultClient);
        EnvironmentRedirectUrisAddRequest environmentRedirectUrisAddRequest = new EnvironmentRedirectUrisAddRequest(); // EnvironmentRedirectUrisAddRequest | Request for uri to add to the environment. Must be absolute, not relative. Wildcard \"*\" accepted.
        try {
            ApiResponse<AddRedirectUriResponse> response = apiInstance.addWithHttpInfo(environmentRedirectUrisAddRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EnvironmentRedirectUrisApi#add");
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
| **environmentRedirectUrisAddRequest** | [**EnvironmentRedirectUrisAddRequest**](EnvironmentRedirectUrisAddRequest.md)| Request for uri to add to the environment. Must be absolute, not relative. Wildcard \&quot;*\&quot; accepted. | [optional] |

### Return type

ApiResponse<[**AddRedirectUriResponse**](AddRedirectUriResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |


## callList

> ListEnvironmentRedirectUrisResponse callList(page, pageSize)

List Redirect URIs

List redirect URIs within the environment.

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.EnvironmentRedirectUrisApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        EnvironmentRedirectUrisApi apiInstance = new EnvironmentRedirectUrisApi(defaultClient);
        Integer page = 1; // Integer | Number of pages of uris to return.
        Integer pageSize = 20; // Integer | Size of the list to be returned. Accepted range from 1 to 100
        try {
            ListEnvironmentRedirectUrisResponse result = apiInstance.callList(page, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EnvironmentRedirectUrisApi#callList");
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
| **page** | **Integer**| Number of pages of uris to return. | [optional] [default to 1] |
| **pageSize** | **Integer**| Size of the list to be returned. Accepted range from 1 to 100 | [optional] [default to 20] |

### Return type

[**ListEnvironmentRedirectUrisResponse**](ListEnvironmentRedirectUrisResponse.md)


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

## callListWithHttpInfo

> ApiResponse<ListEnvironmentRedirectUrisResponse> callList callListWithHttpInfo(page, pageSize)

List Redirect URIs

List redirect URIs within the environment.

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.ApiResponse;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.EnvironmentRedirectUrisApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        EnvironmentRedirectUrisApi apiInstance = new EnvironmentRedirectUrisApi(defaultClient);
        Integer page = 1; // Integer | Number of pages of uris to return.
        Integer pageSize = 20; // Integer | Size of the list to be returned. Accepted range from 1 to 100
        try {
            ApiResponse<ListEnvironmentRedirectUrisResponse> response = apiInstance.callListWithHttpInfo(page, pageSize);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling EnvironmentRedirectUrisApi#callList");
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
| **page** | **Integer**| Number of pages of uris to return. | [optional] [default to 1] |
| **pageSize** | **Integer**| Size of the list to be returned. Accepted range from 1 to 100 | [optional] [default to 20] |

### Return type

ApiResponse<[**ListEnvironmentRedirectUrisResponse**](ListEnvironmentRedirectUrisResponse.md)>


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


## delete

> void delete(id)

Delete Redirect URI

Delete a redirect uri from the environment.

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.EnvironmentRedirectUrisApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        EnvironmentRedirectUrisApi apiInstance = new EnvironmentRedirectUrisApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The id of the redirect uri to delete.
        try {
            apiInstance.delete(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling EnvironmentRedirectUrisApi#delete");
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
| **id** | **UUID**| The id of the redirect uri to delete. | |

### Return type


null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

## deleteWithHttpInfo

> ApiResponse<Void> delete deleteWithHttpInfo(id)

Delete Redirect URI

Delete a redirect uri from the environment.

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.ApiResponse;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.EnvironmentRedirectUrisApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        EnvironmentRedirectUrisApi apiInstance = new EnvironmentRedirectUrisApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The id of the redirect uri to delete.
        try {
            ApiResponse<Void> response = apiInstance.deleteWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling EnvironmentRedirectUrisApi#delete");
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
| **id** | **UUID**| The id of the redirect uri to delete. | |

### Return type


ApiResponse<Void>

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

