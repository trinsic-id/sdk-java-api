# SessionsApi

All URIs are relative to *https://api.trinsic.id*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelSession**](SessionsApi.md#cancelSession) | **POST** /api/v1/sessions/{sessionId}/cancel | Cancel Session |
| [**cancelSessionWithHttpInfo**](SessionsApi.md#cancelSessionWithHttpInfo) | **POST** /api/v1/sessions/{sessionId}/cancel | Cancel Session |
| [**createDirectProviderSession**](SessionsApi.md#createDirectProviderSession) | **POST** /api/v1/sessions/provider/direct | Create Direct Provider Session |
| [**createDirectProviderSessionWithHttpInfo**](SessionsApi.md#createDirectProviderSessionWithHttpInfo) | **POST** /api/v1/sessions/provider/direct | Create Direct Provider Session |
| [**createHostedProviderSession**](SessionsApi.md#createHostedProviderSession) | **POST** /api/v1/sessions/provider/hosted | Create Hosted Provider Session |
| [**createHostedProviderSessionWithHttpInfo**](SessionsApi.md#createHostedProviderSessionWithHttpInfo) | **POST** /api/v1/sessions/provider/hosted | Create Hosted Provider Session |
| [**createWidgetSession**](SessionsApi.md#createWidgetSession) | **POST** /api/v1/sessions/widget | Create Widget Session |
| [**createWidgetSessionWithHttpInfo**](SessionsApi.md#createWidgetSessionWithHttpInfo) | **POST** /api/v1/sessions/widget | Create Widget Session |
| [**getSession**](SessionsApi.md#getSession) | **GET** /api/v1/sessions/{sessionId} | Get Session |
| [**getSessionWithHttpInfo**](SessionsApi.md#getSessionWithHttpInfo) | **GET** /api/v1/sessions/{sessionId} | Get Session |
| [**getSessionResult**](SessionsApi.md#getSessionResult) | **POST** /api/v1/sessions/{sessionId}/results | Get Session Results |
| [**getSessionResultWithHttpInfo**](SessionsApi.md#getSessionResultWithHttpInfo) | **POST** /api/v1/sessions/{sessionId}/results | Get Session Results |
| [**listSessions**](SessionsApi.md#listSessions) | **GET** /api/v1/verification-profiles/{verificationProfileId}/sessions | List Sessions |
| [**listSessionsWithHttpInfo**](SessionsApi.md#listSessionsWithHttpInfo) | **GET** /api/v1/verification-profiles/{verificationProfileId}/sessions | List Sessions |
| [**redactSession**](SessionsApi.md#redactSession) | **POST** /api/v1/sessions/{sessionId}/redact | Redact Session |
| [**redactSessionWithHttpInfo**](SessionsApi.md#redactSessionWithHttpInfo) | **POST** /api/v1/sessions/{sessionId}/redact | Redact Session |
| [**refreshStepContent**](SessionsApi.md#refreshStepContent) | **POST** /api/v1/sessions/{sessionId}/step/refresh | Refresh Step Content |
| [**refreshStepContentWithHttpInfo**](SessionsApi.md#refreshStepContentWithHttpInfo) | **POST** /api/v1/sessions/{sessionId}/step/refresh | Refresh Step Content |
| [**submitNativeChallengeResponse**](SessionsApi.md#submitNativeChallengeResponse) | **POST** /api/v1/sessions/{sessionId}/native-challenge/submit | Submit Native Challenge Response |
| [**submitNativeChallengeResponseWithHttpInfo**](SessionsApi.md#submitNativeChallengeResponseWithHttpInfo) | **POST** /api/v1/sessions/{sessionId}/native-challenge/submit | Submit Native Challenge Response |



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
        UUID sessionId = UUID.randomUUID(); // UUID | 
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
| **sessionId** | **UUID**|  | |

### Return type

[**CancelSessionResponse**](CancelSessionResponse.md)


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
        UUID sessionId = UUID.randomUUID(); // UUID | 
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
| **sessionId** | **UUID**|  | |

### Return type

ApiResponse<[**CancelSessionResponse**](CancelSessionResponse.md)>


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


## createDirectProviderSession

> CreateDirectProviderSessionResponse createDirectProviderSession(createDirectProviderSessionRequest)

Create Direct Provider Session

Verify a user&#39;s identity with a specific provider, handling additional user interaction in your own UI.   Signal which kinds of user interactions your UI can handle using the &#x60;Capabilities&#x60; field.   If &#x60;FallbackToHostedUi&#x60; is &#x60;true&#x60;, Trinsic&#39;s hosted UI will automatically be invoked to handle any capabilities you do not support.

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
        CreateDirectProviderSessionRequest createDirectProviderSessionRequest = new CreateDirectProviderSessionRequest(); // CreateDirectProviderSessionRequest | 
        try {
            CreateDirectProviderSessionResponse result = apiInstance.createDirectProviderSession(createDirectProviderSessionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SessionsApi#createDirectProviderSession");
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
| **createDirectProviderSessionRequest** | [**CreateDirectProviderSessionRequest**](CreateDirectProviderSessionRequest.md)|  | [optional] |

### Return type

[**CreateDirectProviderSessionResponse**](CreateDirectProviderSessionResponse.md)


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

## createDirectProviderSessionWithHttpInfo

> ApiResponse<CreateDirectProviderSessionResponse> createDirectProviderSession createDirectProviderSessionWithHttpInfo(createDirectProviderSessionRequest)

Create Direct Provider Session

Verify a user&#39;s identity with a specific provider, handling additional user interaction in your own UI.   Signal which kinds of user interactions your UI can handle using the &#x60;Capabilities&#x60; field.   If &#x60;FallbackToHostedUi&#x60; is &#x60;true&#x60;, Trinsic&#39;s hosted UI will automatically be invoked to handle any capabilities you do not support.

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
        CreateDirectProviderSessionRequest createDirectProviderSessionRequest = new CreateDirectProviderSessionRequest(); // CreateDirectProviderSessionRequest | 
        try {
            ApiResponse<CreateDirectProviderSessionResponse> response = apiInstance.createDirectProviderSessionWithHttpInfo(createDirectProviderSessionRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SessionsApi#createDirectProviderSession");
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
| **createDirectProviderSessionRequest** | [**CreateDirectProviderSessionRequest**](CreateDirectProviderSessionRequest.md)|  | [optional] |

### Return type

ApiResponse<[**CreateDirectProviderSessionResponse**](CreateDirectProviderSessionResponse.md)>


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


## createHostedProviderSession

> CreateHostedProviderSessionResponse createHostedProviderSession(createHostedProviderSessionRequest)

Create Hosted Provider Session

Verify a user&#39;s identity with a specific provider, using Trinsic-hosted UI for providers which require additional user interaction.

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
        CreateHostedProviderSessionRequest createHostedProviderSessionRequest = new CreateHostedProviderSessionRequest(); // CreateHostedProviderSessionRequest | 
        try {
            CreateHostedProviderSessionResponse result = apiInstance.createHostedProviderSession(createHostedProviderSessionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SessionsApi#createHostedProviderSession");
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
| **createHostedProviderSessionRequest** | [**CreateHostedProviderSessionRequest**](CreateHostedProviderSessionRequest.md)|  | [optional] |

### Return type

[**CreateHostedProviderSessionResponse**](CreateHostedProviderSessionResponse.md)


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

## createHostedProviderSessionWithHttpInfo

> ApiResponse<CreateHostedProviderSessionResponse> createHostedProviderSession createHostedProviderSessionWithHttpInfo(createHostedProviderSessionRequest)

Create Hosted Provider Session

Verify a user&#39;s identity with a specific provider, using Trinsic-hosted UI for providers which require additional user interaction.

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
        CreateHostedProviderSessionRequest createHostedProviderSessionRequest = new CreateHostedProviderSessionRequest(); // CreateHostedProviderSessionRequest | 
        try {
            ApiResponse<CreateHostedProviderSessionResponse> response = apiInstance.createHostedProviderSessionWithHttpInfo(createHostedProviderSessionRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SessionsApi#createHostedProviderSession");
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
| **createHostedProviderSessionRequest** | [**CreateHostedProviderSessionRequest**](CreateHostedProviderSessionRequest.md)|  | [optional] |

### Return type

ApiResponse<[**CreateHostedProviderSessionResponse**](CreateHostedProviderSessionResponse.md)>


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


## createWidgetSession

> CreateWidgetSessionResponse createWidgetSession(createWidgetSessionRequest)

Create Widget Session

Verify a user&#39;s identity using Trinsic&#39;s hosted Widget flow.

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
        CreateWidgetSessionRequest createWidgetSessionRequest = new CreateWidgetSessionRequest(); // CreateWidgetSessionRequest | 
        try {
            CreateWidgetSessionResponse result = apiInstance.createWidgetSession(createWidgetSessionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SessionsApi#createWidgetSession");
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
| **createWidgetSessionRequest** | [**CreateWidgetSessionRequest**](CreateWidgetSessionRequest.md)|  | [optional] |

### Return type

[**CreateWidgetSessionResponse**](CreateWidgetSessionResponse.md)


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

## createWidgetSessionWithHttpInfo

> ApiResponse<CreateWidgetSessionResponse> createWidgetSession createWidgetSessionWithHttpInfo(createWidgetSessionRequest)

Create Widget Session

Verify a user&#39;s identity using Trinsic&#39;s hosted Widget flow.

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
        CreateWidgetSessionRequest createWidgetSessionRequest = new CreateWidgetSessionRequest(); // CreateWidgetSessionRequest | 
        try {
            ApiResponse<CreateWidgetSessionResponse> response = apiInstance.createWidgetSessionWithHttpInfo(createWidgetSessionRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SessionsApi#createWidgetSession");
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
| **createWidgetSessionRequest** | [**CreateWidgetSessionRequest**](CreateWidgetSessionRequest.md)|  | [optional] |

### Return type

ApiResponse<[**CreateWidgetSessionResponse**](CreateWidgetSessionResponse.md)>


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
        UUID sessionId = UUID.randomUUID(); // UUID | 
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
| **sessionId** | **UUID**|  | |

### Return type

[**GetSessionResponse**](GetSessionResponse.md)


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
        UUID sessionId = UUID.randomUUID(); // UUID | 
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
| **sessionId** | **UUID**|  | |

### Return type

ApiResponse<[**GetSessionResponse**](GetSessionResponse.md)>


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
        UUID sessionId = UUID.randomUUID(); // UUID | 
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
| **sessionId** | **UUID**|  | |
| **getSessionResultRequest** | [**GetSessionResultRequest**](GetSessionResultRequest.md)|  | [optional] |

### Return type

[**GetSessionResultResponse**](GetSessionResultResponse.md)


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
        UUID sessionId = UUID.randomUUID(); // UUID | 
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
| **sessionId** | **UUID**|  | |
| **getSessionResultRequest** | [**GetSessionResultRequest**](GetSessionResultRequest.md)|  | [optional] |

### Return type

ApiResponse<[**GetSessionResultResponse**](GetSessionResultResponse.md)>


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


## listSessions

> ListSessionsResponse listSessions(verificationProfileId, orderBy, orderDirection, pageSize, page)

List Sessions

List Sessions created for a specific Verification Profile

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
        UUID verificationProfileId = UUID.randomUUID(); // UUID | 
        SessionOrdering orderBy = SessionOrdering.fromValue("Created"); // SessionOrdering | The field by which sessions should be ordered
        OrderDirection orderDirection = OrderDirection.fromValue("Ascending"); // OrderDirection | 
        Integer pageSize = 50; // Integer | The number of items to return per page -- must be between `1` and `50`
        Integer page = 1; // Integer | The page number to return -- starts at `1`
        try {
            ListSessionsResponse result = apiInstance.listSessions(verificationProfileId, orderBy, orderDirection, pageSize, page);
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
| **verificationProfileId** | **UUID**|  | |
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
- **Accept**: text/plain, application/json, text/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

## listSessionsWithHttpInfo

> ApiResponse<ListSessionsResponse> listSessions listSessionsWithHttpInfo(verificationProfileId, orderBy, orderDirection, pageSize, page)

List Sessions

List Sessions created for a specific Verification Profile

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
        UUID verificationProfileId = UUID.randomUUID(); // UUID | 
        SessionOrdering orderBy = SessionOrdering.fromValue("Created"); // SessionOrdering | The field by which sessions should be ordered
        OrderDirection orderDirection = OrderDirection.fromValue("Ascending"); // OrderDirection | 
        Integer pageSize = 50; // Integer | The number of items to return per page -- must be between `1` and `50`
        Integer page = 1; // Integer | The page number to return -- starts at `1`
        try {
            ApiResponse<ListSessionsResponse> response = apiInstance.listSessionsWithHttpInfo(verificationProfileId, orderBy, orderDirection, pageSize, page);
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
| **verificationProfileId** | **UUID**|  | |
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
- **Accept**: text/plain, application/json, text/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |


## redactSession

> void redactSession(sessionId)

Redact Session

Redact a Session, removing all identity data from Trinsic&#39;s servers. Every application has a redaction period that dictates how long we will hold on to your users&#39; PII data. Once a session falls outside the redaction cutoff date, all PII will automatically be removed from that session. You can utilize this endpoint to redact a session immediately.

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
        UUID sessionId = UUID.randomUUID(); // UUID | 
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
| **sessionId** | **UUID**|  | |

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
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

## redactSessionWithHttpInfo

> ApiResponse<Void> redactSession redactSessionWithHttpInfo(sessionId)

Redact Session

Redact a Session, removing all identity data from Trinsic&#39;s servers. Every application has a redaction period that dictates how long we will hold on to your users&#39; PII data. Once a session falls outside the redaction cutoff date, all PII will automatically be removed from that session. You can utilize this endpoint to redact a session immediately.

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
        UUID sessionId = UUID.randomUUID(); // UUID | 
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
| **sessionId** | **UUID**|  | |

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
| **200** | OK |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |


## refreshStepContent

> RefreshStepContentResponse refreshStepContent(sessionId, refreshStepContentRequest)

Refresh Step Content

Refreshes the content of a Step for a Direct Provider Session.

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
        UUID sessionId = UUID.randomUUID(); // UUID | 
        RefreshStepContentRequest refreshStepContentRequest = new RefreshStepContentRequest(); // RefreshStepContentRequest | 
        try {
            RefreshStepContentResponse result = apiInstance.refreshStepContent(sessionId, refreshStepContentRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SessionsApi#refreshStepContent");
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
| **sessionId** | **UUID**|  | |
| **refreshStepContentRequest** | [**RefreshStepContentRequest**](RefreshStepContentRequest.md)|  | [optional] |

### Return type

[**RefreshStepContentResponse**](RefreshStepContentResponse.md)


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

## refreshStepContentWithHttpInfo

> ApiResponse<RefreshStepContentResponse> refreshStepContent refreshStepContentWithHttpInfo(sessionId, refreshStepContentRequest)

Refresh Step Content

Refreshes the content of a Step for a Direct Provider Session.

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
        UUID sessionId = UUID.randomUUID(); // UUID | 
        RefreshStepContentRequest refreshStepContentRequest = new RefreshStepContentRequest(); // RefreshStepContentRequest | 
        try {
            ApiResponse<RefreshStepContentResponse> response = apiInstance.refreshStepContentWithHttpInfo(sessionId, refreshStepContentRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SessionsApi#refreshStepContent");
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
| **sessionId** | **UUID**|  | |
| **refreshStepContentRequest** | [**RefreshStepContentRequest**](RefreshStepContentRequest.md)|  | [optional] |

### Return type

ApiResponse<[**RefreshStepContentResponse**](RefreshStepContentResponse.md)>


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


## submitNativeChallengeResponse

> SubmitNativeChallengeResponseResponse submitNativeChallengeResponse(sessionId, submitNativeChallengeResponseRequest)

Submit Native Challenge Response

Submits the response from a Native Challenge (e.g., mDL exchange via DC API) and processes the results.

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
        UUID sessionId = UUID.randomUUID(); // UUID | 
        SubmitNativeChallengeResponseRequest submitNativeChallengeResponseRequest = new SubmitNativeChallengeResponseRequest(); // SubmitNativeChallengeResponseRequest | 
        try {
            SubmitNativeChallengeResponseResponse result = apiInstance.submitNativeChallengeResponse(sessionId, submitNativeChallengeResponseRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SessionsApi#submitNativeChallengeResponse");
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
| **sessionId** | **UUID**|  | |
| **submitNativeChallengeResponseRequest** | [**SubmitNativeChallengeResponseRequest**](SubmitNativeChallengeResponseRequest.md)|  | [optional] |

### Return type

[**SubmitNativeChallengeResponseResponse**](SubmitNativeChallengeResponseResponse.md)


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

## submitNativeChallengeResponseWithHttpInfo

> ApiResponse<SubmitNativeChallengeResponseResponse> submitNativeChallengeResponse submitNativeChallengeResponseWithHttpInfo(sessionId, submitNativeChallengeResponseRequest)

Submit Native Challenge Response

Submits the response from a Native Challenge (e.g., mDL exchange via DC API) and processes the results.

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
        UUID sessionId = UUID.randomUUID(); // UUID | 
        SubmitNativeChallengeResponseRequest submitNativeChallengeResponseRequest = new SubmitNativeChallengeResponseRequest(); // SubmitNativeChallengeResponseRequest | 
        try {
            ApiResponse<SubmitNativeChallengeResponseResponse> response = apiInstance.submitNativeChallengeResponseWithHttpInfo(sessionId, submitNativeChallengeResponseRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SessionsApi#submitNativeChallengeResponse");
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
| **sessionId** | **UUID**|  | |
| **submitNativeChallengeResponseRequest** | [**SubmitNativeChallengeResponseRequest**](SubmitNativeChallengeResponseRequest.md)|  | [optional] |

### Return type

ApiResponse<[**SubmitNativeChallengeResponseResponse**](SubmitNativeChallengeResponseResponse.md)>


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

