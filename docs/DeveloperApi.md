# DeveloperApi

All URIs are relative to *https://api.trinsic.id*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**testAgainstArbitraryKey**](DeveloperApi.md#testAgainstArbitraryKey) | **POST** /api/v1/developer/hpke-test | Test HPKE Against Arbitrary Key |
| [**testAgainstArbitraryKeyWithHttpInfo**](DeveloperApi.md#testAgainstArbitraryKeyWithHttpInfo) | **POST** /api/v1/developer/hpke-test | Test HPKE Against Arbitrary Key |
| [**testAgainstVerificationProfile**](DeveloperApi.md#testAgainstVerificationProfile) | **POST** /api/v1/developer/hpke-test/{verificationProfileId} | Test HPKE Against Verification Profile Key |
| [**testAgainstVerificationProfileWithHttpInfo**](DeveloperApi.md#testAgainstVerificationProfileWithHttpInfo) | **POST** /api/v1/developer/hpke-test/{verificationProfileId} | Test HPKE Against Verification Profile Key |



## testAgainstArbitraryKey

> TrinsicHPKEBundle testAgainstArbitraryKey(hpKETestRequest)

Test HPKE Against Arbitrary Key

Encrypts the provided data against the given public key using HPKE, and returns the resulting bundle. This is intended for integration testing and development purposes.

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.DeveloperApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        DeveloperApi apiInstance = new DeveloperApi(defaultClient);
        HPKETestRequest hpKETestRequest = new HPKETestRequest(); // HPKETestRequest | 
        try {
            TrinsicHPKEBundle result = apiInstance.testAgainstArbitraryKey(hpKETestRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeveloperApi#testAgainstArbitraryKey");
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
| **hpKETestRequest** | [**HPKETestRequest**](HPKETestRequest.md)|  | [optional] |

### Return type

[**TrinsicHPKEBundle**](TrinsicHPKEBundle.md)


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

## testAgainstArbitraryKeyWithHttpInfo

> ApiResponse<TrinsicHPKEBundle> testAgainstArbitraryKeyWithHttpInfo(hpKETestRequest)

Test HPKE Against Arbitrary Key

Encrypts the provided data against the given public key using HPKE, and returns the resulting bundle. This is intended for integration testing and development purposes.

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.ApiResponse;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.DeveloperApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        DeveloperApi apiInstance = new DeveloperApi(defaultClient);
        HPKETestRequest hpKETestRequest = new HPKETestRequest(); // HPKETestRequest | 
        try {
            ApiResponse<TrinsicHPKEBundle> response = apiInstance.testAgainstArbitraryKeyWithHttpInfo(hpKETestRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DeveloperApi#testAgainstArbitraryKey");
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
| **hpKETestRequest** | [**HPKETestRequest**](HPKETestRequest.md)|  | [optional] |

### Return type

ApiResponse<[**TrinsicHPKEBundle**](TrinsicHPKEBundle.md)>


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


## testAgainstVerificationProfile

> TrinsicHPKEBundle testAgainstVerificationProfile(verificationProfileId, hpKETestVPRequest)

Test HPKE Against Verification Profile Key

Encrypts the provided data against the PII encryption key configured on the given verification profile. This is intended for integration testing and development purposes.

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.DeveloperApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        DeveloperApi apiInstance = new DeveloperApi(defaultClient);
        UUID verificationProfileId = UUID.randomUUID(); // UUID | 
        HPKETestVPRequest hpKETestVPRequest = new HPKETestVPRequest(); // HPKETestVPRequest | 
        try {
            TrinsicHPKEBundle result = apiInstance.testAgainstVerificationProfile(verificationProfileId, hpKETestVPRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeveloperApi#testAgainstVerificationProfile");
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
| **hpKETestVPRequest** | [**HPKETestVPRequest**](HPKETestVPRequest.md)|  | [optional] |

### Return type

[**TrinsicHPKEBundle**](TrinsicHPKEBundle.md)


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

## testAgainstVerificationProfileWithHttpInfo

> ApiResponse<TrinsicHPKEBundle> testAgainstVerificationProfileWithHttpInfo(verificationProfileId, hpKETestVPRequest)

Test HPKE Against Verification Profile Key

Encrypts the provided data against the PII encryption key configured on the given verification profile. This is intended for integration testing and development purposes.

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.ApiResponse;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.DeveloperApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        DeveloperApi apiInstance = new DeveloperApi(defaultClient);
        UUID verificationProfileId = UUID.randomUUID(); // UUID | 
        HPKETestVPRequest hpKETestVPRequest = new HPKETestVPRequest(); // HPKETestVPRequest | 
        try {
            ApiResponse<TrinsicHPKEBundle> response = apiInstance.testAgainstVerificationProfileWithHttpInfo(verificationProfileId, hpKETestVPRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DeveloperApi#testAgainstVerificationProfile");
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
| **hpKETestVPRequest** | [**HPKETestVPRequest**](HPKETestVPRequest.md)|  | [optional] |

### Return type

ApiResponse<[**TrinsicHPKEBundle**](TrinsicHPKEBundle.md)>


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

