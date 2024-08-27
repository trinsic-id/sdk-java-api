# SessionsApi

All URIs are relative to *https://api.trinsic.id*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelSession**](SessionsApi.md#cancelSession) | **POST** /api/v1/sessions/{sessionId}/cancel | Cancel Session |
| [**cancelSessionWithHttpInfo**](SessionsApi.md#cancelSessionWithHttpInfo) | **POST** /api/v1/sessions/{sessionId}/cancel | Cancel Session |
| [**createSession**](SessionsApi.md#createSession) | **POST** /api/v1/sessions | Create Session |
| [**createSessionWithHttpInfo**](SessionsApi.md#createSessionWithHttpInfo) | **POST** /api/v1/sessions | Create Session |
| [**getSession**](SessionsApi.md#getSession) | **GET** /api/v1/sessions/{sessionId} | Get Session |
| [**getSessionWithHttpInfo**](SessionsApi.md#getSessionWithHttpInfo) | **GET** /api/v1/sessions/{sessionId} | Get Session |
| [**getSessionResult**](SessionsApi.md#getSessionResult) | **POST** /api/v1/sessions/{sessionId}/results | Get Session Results |
| [**getSessionResultWithHttpInfo**](SessionsApi.md#getSessionResultWithHttpInfo) | **POST** /api/v1/sessions/{sessionId}/results | Get Session Results |
| [**listSessions**](SessionsApi.md#listSessions) | **GET** /api/v1/sessions | List Sessions |
| [**listSessionsWithHttpInfo**](SessionsApi.md#listSessionsWithHttpInfo) | **GET** /api/v1/sessions | List Sessions |
| [**redactSession**](SessionsApi.md#redactSession) | **POST** /api/v1/sessions/{sessionId}/redact | Redact Session |
| [**redactSessionWithHttpInfo**](SessionsApi.md#redactSessionWithHttpInfo) | **POST** /api/v1/sessions/{sessionId}/redact | Redact Session |



## cancelSession

> CancelSessionResponse cancelSession(sessionId)

Cancel Session

Cancel a Session by its ID

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.SessionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        SessionsApi apiInstance = new SessionsApi(defaultClient);
        String sessionId = "sessionId_example"; // String | 
        try {
            CancelSessionResponse result = apiInstance.cancelSession(sessionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SessionsApi#cancelSession");
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
| **sessionId** | **String**|  | |

### Return type

[**CancelSessionResponse**](CancelSessionResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Validation Failed |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

## cancelSessionWithHttpInfo

> ApiResponse<CancelSessionResponse> cancelSession cancelSessionWithHttpInfo(sessionId)

Cancel Session

Cancel a Session by its ID

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.ApiResponse;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.SessionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        SessionsApi apiInstance = new SessionsApi(defaultClient);
        String sessionId = "sessionId_example"; // String | 
        try {
            ApiResponse<CancelSessionResponse> response = apiInstance.cancelSessionWithHttpInfo(sessionId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SessionsApi#cancelSession");
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
| **sessionId** | **String**|  | |

### Return type

ApiResponse<[**CancelSessionResponse**](CancelSessionResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Validation Failed |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |


## createSession

> CreateSessionResponse createSession(createSessionRequest)

Create Session

Create a Session to verify a user&#39;s identity

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.SessionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        SessionsApi apiInstance = new SessionsApi(defaultClient);
        CreateSessionRequest createSessionRequest = new CreateSessionRequest(); // CreateSessionRequest | 
        try {
            CreateSessionResponse result = apiInstance.createSession(createSessionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SessionsApi#createSession");
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
| **createSessionRequest** | [**CreateSessionRequest**](CreateSessionRequest.md)|  | [optional] |

### Return type

[**CreateSessionResponse**](CreateSessionResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Validation Failed |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

## createSessionWithHttpInfo

> ApiResponse<CreateSessionResponse> createSession createSessionWithHttpInfo(createSessionRequest)

Create Session

Create a Session to verify a user&#39;s identity

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.ApiResponse;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.SessionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        SessionsApi apiInstance = new SessionsApi(defaultClient);
        CreateSessionRequest createSessionRequest = new CreateSessionRequest(); // CreateSessionRequest | 
        try {
            ApiResponse<CreateSessionResponse> response = apiInstance.createSessionWithHttpInfo(createSessionRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SessionsApi#createSession");
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
| **createSessionRequest** | [**CreateSessionRequest**](CreateSessionRequest.md)|  | [optional] |

### Return type

ApiResponse<[**CreateSessionResponse**](CreateSessionResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Validation Failed |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |


## getSession

> GetSessionResponse getSession(sessionId)

Get Session

Get a Session by its ID

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.SessionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        SessionsApi apiInstance = new SessionsApi(defaultClient);
        String sessionId = "sessionId_example"; // String | 
        try {
            GetSessionResponse result = apiInstance.getSession(sessionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SessionsApi#getSession");
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
| **sessionId** | **String**|  | |

### Return type

[**GetSessionResponse**](GetSessionResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Validation Failed |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

## getSessionWithHttpInfo

> ApiResponse<GetSessionResponse> getSession getSessionWithHttpInfo(sessionId)

Get Session

Get a Session by its ID

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.ApiResponse;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.SessionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        SessionsApi apiInstance = new SessionsApi(defaultClient);
        String sessionId = "sessionId_example"; // String | 
        try {
            ApiResponse<GetSessionResponse> response = apiInstance.getSessionWithHttpInfo(sessionId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SessionsApi#getSession");
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
| **sessionId** | **String**|  | |

### Return type

ApiResponse<[**GetSessionResponse**](GetSessionResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Validation Failed |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |


## getSessionResult

> GetSessionResultResponse getSessionResult(sessionId, getSessionResultRequest)

Get Session Results

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.SessionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        SessionsApi apiInstance = new SessionsApi(defaultClient);
        String sessionId = "sessionId_example"; // String | 
        GetSessionResultRequest getSessionResultRequest = new GetSessionResultRequest(); // GetSessionResultRequest | 
        try {
            GetSessionResultResponse result = apiInstance.getSessionResult(sessionId, getSessionResultRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SessionsApi#getSessionResult");
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
| **sessionId** | **String**|  | |
| **getSessionResultRequest** | [**GetSessionResultRequest**](GetSessionResultRequest.md)|  | [optional] |

### Return type

[**GetSessionResultResponse**](GetSessionResultResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Validation Failed |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

## getSessionResultWithHttpInfo

> ApiResponse<GetSessionResultResponse> getSessionResult getSessionResultWithHttpInfo(sessionId, getSessionResultRequest)

Get Session Results

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.ApiResponse;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.SessionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        SessionsApi apiInstance = new SessionsApi(defaultClient);
        String sessionId = "sessionId_example"; // String | 
        GetSessionResultRequest getSessionResultRequest = new GetSessionResultRequest(); // GetSessionResultRequest | 
        try {
            ApiResponse<GetSessionResultResponse> response = apiInstance.getSessionResultWithHttpInfo(sessionId, getSessionResultRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SessionsApi#getSessionResult");
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
| **sessionId** | **String**|  | |
| **getSessionResultRequest** | [**GetSessionResultRequest**](GetSessionResultRequest.md)|  | [optional] |

### Return type

ApiResponse<[**GetSessionResultResponse**](GetSessionResultResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Validation Failed |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |


## listSessions

> ListSessionsResponse listSessions(orderBy, orderDirection, pageSize, page)

List Sessions

List Sessions created by your account

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.SessionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        SessionsApi apiInstance = new SessionsApi(defaultClient);
        SessionOrdering orderBy = SessionOrdering.fromValue("Created"); // SessionOrdering | The field by which sessions should be ordered
        OrderDirection orderDirection = OrderDirection.fromValue("Ascending"); // OrderDirection | 
        Integer pageSize = 50; // Integer | The number of items to return per page -- must be between `1` and `50`
        Integer page = 1; // Integer | The page number to return -- starts at `1`
        try {
            ListSessionsResponse result = apiInstance.listSessions(orderBy, orderDirection, pageSize, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SessionsApi#listSessions");
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
| **orderBy** | [**SessionOrdering**](.md)| The field by which sessions should be ordered | [optional] [enum: Created, Updated, State] |
| **orderDirection** | [**OrderDirection**](.md)|  | [optional] [enum: Ascending, Descending] |
| **pageSize** | **Integer**| The number of items to return per page -- must be between &#x60;1&#x60; and &#x60;50&#x60; | [optional] |
| **page** | **Integer**| The page number to return -- starts at &#x60;1&#x60; | [optional] |

### Return type

[**ListSessionsResponse**](ListSessionsResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Validation Failed |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

## listSessionsWithHttpInfo

> ApiResponse<ListSessionsResponse> listSessions listSessionsWithHttpInfo(orderBy, orderDirection, pageSize, page)

List Sessions

List Sessions created by your account

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.ApiResponse;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.SessionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        SessionsApi apiInstance = new SessionsApi(defaultClient);
        SessionOrdering orderBy = SessionOrdering.fromValue("Created"); // SessionOrdering | The field by which sessions should be ordered
        OrderDirection orderDirection = OrderDirection.fromValue("Ascending"); // OrderDirection | 
        Integer pageSize = 50; // Integer | The number of items to return per page -- must be between `1` and `50`
        Integer page = 1; // Integer | The page number to return -- starts at `1`
        try {
            ApiResponse<ListSessionsResponse> response = apiInstance.listSessionsWithHttpInfo(orderBy, orderDirection, pageSize, page);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SessionsApi#listSessions");
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
| **orderBy** | [**SessionOrdering**](.md)| The field by which sessions should be ordered | [optional] [enum: Created, Updated, State] |
| **orderDirection** | [**OrderDirection**](.md)|  | [optional] [enum: Ascending, Descending] |
| **pageSize** | **Integer**| The number of items to return per page -- must be between &#x60;1&#x60; and &#x60;50&#x60; | [optional] |
| **page** | **Integer**| The page number to return -- starts at &#x60;1&#x60; | [optional] |

### Return type

ApiResponse<[**ListSessionsResponse**](ListSessionsResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Validation Failed |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |


## redactSession

> void redactSession(sessionId)

Redact Session

Redact a Session, removing all identity data from Trinsic&#39;s servers.                Identity data that a user has chosen to save in their passkey-protected wallet will not be deleted.

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.SessionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        SessionsApi apiInstance = new SessionsApi(defaultClient);
        String sessionId = "sessionId_example"; // String | 
        try {
            apiInstance.redactSession(sessionId);
        } catch (ApiException e) {
            System.err.println("Exception when calling SessionsApi#redactSession");
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
| **sessionId** | **String**|  | |

### Return type


null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Validation Failed |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

## redactSessionWithHttpInfo

> ApiResponse<Void> redactSession redactSessionWithHttpInfo(sessionId)

Redact Session

Redact a Session, removing all identity data from Trinsic&#39;s servers.                Identity data that a user has chosen to save in their passkey-protected wallet will not be deleted.

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.ApiResponse;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.SessionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        SessionsApi apiInstance = new SessionsApi(defaultClient);
        String sessionId = "sessionId_example"; // String | 
        try {
            ApiResponse<Void> response = apiInstance.redactSessionWithHttpInfo(sessionId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling SessionsApi#redactSession");
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
| **sessionId** | **String**|  | |

### Return type


ApiResponse<Void>

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Validation Failed |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

