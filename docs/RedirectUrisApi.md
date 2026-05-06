# RedirectUrisApi

All URIs are relative to *https://api.trinsic.id*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**add**](RedirectUrisApi.md#add) | **POST** /api/valpha/redirect-uris | Add Redirect URI |
| [**addWithHttpInfo**](RedirectUrisApi.md#addWithHttpInfo) | **POST** /api/valpha/redirect-uris | Add Redirect URI |
| [**callList**](RedirectUrisApi.md#callList) | **GET** /api/valpha/redirect-uris | List Redirect URIs |
| [**callListWithHttpInfo**](RedirectUrisApi.md#callListWithHttpInfo) | **GET** /api/valpha/redirect-uris | List Redirect URIs |
| [**delete**](RedirectUrisApi.md#delete) | **DELETE** /api/valpha/redirect-uris/{id} | Delete Redirect URI |
| [**deleteWithHttpInfo**](RedirectUrisApi.md#deleteWithHttpInfo) | **DELETE** /api/valpha/redirect-uris/{id} | Delete Redirect URI |



## add

> AddRedirectUriResponse add(addRedirectUriRequest)

Add Redirect URI

Add a new redirect uri to the authenticated environment.

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.RedirectUrisApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        RedirectUrisApi apiInstance = new RedirectUrisApi(defaultClient);
        AddRedirectUriRequest addRedirectUriRequest = new AddRedirectUriRequest(); // AddRedirectUriRequest | Request for uri to add to the environment. Must be absolute, not relative. Wildcard \"*\" accepted.
        try {
            AddRedirectUriResponse result = apiInstance.add(addRedirectUriRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RedirectUrisApi#add");
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
| **addRedirectUriRequest** | [**AddRedirectUriRequest**](AddRedirectUriRequest.md)| Request for uri to add to the environment. Must be absolute, not relative. Wildcard \&quot;*\&quot; accepted. | [optional] |

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

> ApiResponse<AddRedirectUriResponse> addWithHttpInfo(addRedirectUriRequest)

Add Redirect URI

Add a new redirect uri to the authenticated environment.

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.ApiResponse;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.RedirectUrisApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        RedirectUrisApi apiInstance = new RedirectUrisApi(defaultClient);
        AddRedirectUriRequest addRedirectUriRequest = new AddRedirectUriRequest(); // AddRedirectUriRequest | Request for uri to add to the environment. Must be absolute, not relative. Wildcard \"*\" accepted.
        try {
            ApiResponse<AddRedirectUriResponse> response = apiInstance.addWithHttpInfo(addRedirectUriRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RedirectUrisApi#add");
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
| **addRedirectUriRequest** | [**AddRedirectUriRequest**](AddRedirectUriRequest.md)| Request for uri to add to the environment. Must be absolute, not relative. Wildcard \&quot;*\&quot; accepted. | [optional] |

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

> ListRedirectUrisResponse callList(page, pageSize)

List Redirect URIs

List registered Redirect URIs for the authenticated environment

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.RedirectUrisApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        RedirectUrisApi apiInstance = new RedirectUrisApi(defaultClient);
        Integer page = 1; // Integer | Number of pages of uris to return.
        Integer pageSize = 20; // Integer | Size of the list to be returned. Accepted range from 1 to 100
        try {
            ListRedirectUrisResponse result = apiInstance.callList(page, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RedirectUrisApi#callList");
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

[**ListRedirectUrisResponse**](ListRedirectUrisResponse.md)


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

> ApiResponse<ListRedirectUrisResponse> callListWithHttpInfo(page, pageSize)

List Redirect URIs

List registered Redirect URIs for the authenticated environment

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.ApiResponse;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.RedirectUrisApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        RedirectUrisApi apiInstance = new RedirectUrisApi(defaultClient);
        Integer page = 1; // Integer | Number of pages of uris to return.
        Integer pageSize = 20; // Integer | Size of the list to be returned. Accepted range from 1 to 100
        try {
            ApiResponse<ListRedirectUrisResponse> response = apiInstance.callListWithHttpInfo(page, pageSize);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling RedirectUrisApi#callList");
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

ApiResponse<[**ListRedirectUrisResponse**](ListRedirectUrisResponse.md)>


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
import id.trinsic.api.RedirectUrisApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        RedirectUrisApi apiInstance = new RedirectUrisApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The id of the redirect uri to delete.
        try {
            apiInstance.delete(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling RedirectUrisApi#delete");
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

> ApiResponse<Void> deleteWithHttpInfo(id)

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
import id.trinsic.api.RedirectUrisApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        RedirectUrisApi apiInstance = new RedirectUrisApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The id of the redirect uri to delete.
        try {
            ApiResponse<Void> response = apiInstance.deleteWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling RedirectUrisApi#delete");
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

