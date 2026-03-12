# VerificationProfilesApi

All URIs are relative to *https://api.trinsic.id*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createVerificationProfile**](VerificationProfilesApi.md#createVerificationProfile) | **POST** /api/valpha/verification-profiles | Create Verification Profile |
| [**createVerificationProfileWithHttpInfo**](VerificationProfilesApi.md#createVerificationProfileWithHttpInfo) | **POST** /api/valpha/verification-profiles | Create Verification Profile |
| [**getVerificationProfileById**](VerificationProfilesApi.md#getVerificationProfileById) | **GET** /api/valpha/verification-profiles/{id} | Get Verification Profile |
| [**getVerificationProfileByIdWithHttpInfo**](VerificationProfilesApi.md#getVerificationProfileByIdWithHttpInfo) | **GET** /api/valpha/verification-profiles/{id} | Get Verification Profile |
| [**listVerificationProfiles**](VerificationProfilesApi.md#listVerificationProfiles) | **GET** /api/valpha/verification-profiles | List Verification Profiles |
| [**listVerificationProfilesWithHttpInfo**](VerificationProfilesApi.md#listVerificationProfilesWithHttpInfo) | **GET** /api/valpha/verification-profiles | List Verification Profiles |



## createVerificationProfile

> CreateVerificationProfileResponse createVerificationProfile(alias, brandName, primaryColor, providers, logo, redactionPeriod, sessionExpiration, isProductionUsage)

Create Verification Profile

Creates a new verification profile within your organization.

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.VerificationProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        VerificationProfilesApi apiInstance = new VerificationProfilesApi(defaultClient);
        String alias = "alias_example"; // String | An alias of the verification profile shown to developers and administrators.
        String brandName = "brandName_example"; // String | The brand name of the verification profile shown to end-users.
        String primaryColor = "primaryColor_example"; // String | The primary color of the verification profile. Must be a 6-character hex string prefixed with a '#' character. Example: #000000
        List<String> providers = Arrays.asList(); // List<String> | The list of providers you'd like to select for this profile. We will not currently enable any providers.
        File logo = new File("/path/to/file"); // File | The logo of the verification profile.
        String redactionPeriod = "redactionPeriod_example"; // String | The redaction period for verification data. Must be between 0 and 31 days, and at least 15 minutes greater than the session expiration. If not specified, defaults to 31 days.
        String sessionExpiration = "sessionExpiration_example"; // String | The session expiration for verification sessions created with this profile. Must be between 15 minutes and 24 hours. Defaults to 1 hour if not specified.
        Boolean isProductionUsage = true; // Boolean | Whether this profile is for production usage. Only applicable for Live environment profiles. If not specified for Live profiles, defaults to false (Demo).
        try {
            CreateVerificationProfileResponse result = apiInstance.createVerificationProfile(alias, brandName, primaryColor, providers, logo, redactionPeriod, sessionExpiration, isProductionUsage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VerificationProfilesApi#createVerificationProfile");
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
| **alias** | **String**| An alias of the verification profile shown to developers and administrators. | |
| **brandName** | **String**| The brand name of the verification profile shown to end-users. | |
| **primaryColor** | **String**| The primary color of the verification profile. Must be a 6-character hex string prefixed with a &#39;#&#39; character. Example: #000000 | [optional] |
| **providers** | [**List&lt;String&gt;**](String.md)| The list of providers you&#39;d like to select for this profile. We will not currently enable any providers. | [optional] |
| **logo** | **File**| The logo of the verification profile. | [optional] |
| **redactionPeriod** | **String**| The redaction period for verification data. Must be between 0 and 31 days, and at least 15 minutes greater than the session expiration. If not specified, defaults to 31 days. | [optional] |
| **sessionExpiration** | **String**| The session expiration for verification sessions created with this profile. Must be between 15 minutes and 24 hours. Defaults to 1 hour if not specified. | [optional] |
| **isProductionUsage** | **Boolean**| Whether this profile is for production usage. Only applicable for Live environment profiles. If not specified for Live profiles, defaults to false (Demo). | [optional] |

### Return type

[**CreateVerificationProfileResponse**](CreateVerificationProfileResponse.md)


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: text/plain, application/json, text/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

## createVerificationProfileWithHttpInfo

> ApiResponse<CreateVerificationProfileResponse> createVerificationProfile createVerificationProfileWithHttpInfo(alias, brandName, primaryColor, providers, logo, redactionPeriod, sessionExpiration, isProductionUsage)

Create Verification Profile

Creates a new verification profile within your organization.

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.ApiResponse;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.VerificationProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        VerificationProfilesApi apiInstance = new VerificationProfilesApi(defaultClient);
        String alias = "alias_example"; // String | An alias of the verification profile shown to developers and administrators.
        String brandName = "brandName_example"; // String | The brand name of the verification profile shown to end-users.
        String primaryColor = "primaryColor_example"; // String | The primary color of the verification profile. Must be a 6-character hex string prefixed with a '#' character. Example: #000000
        List<String> providers = Arrays.asList(); // List<String> | The list of providers you'd like to select for this profile. We will not currently enable any providers.
        File logo = new File("/path/to/file"); // File | The logo of the verification profile.
        String redactionPeriod = "redactionPeriod_example"; // String | The redaction period for verification data. Must be between 0 and 31 days, and at least 15 minutes greater than the session expiration. If not specified, defaults to 31 days.
        String sessionExpiration = "sessionExpiration_example"; // String | The session expiration for verification sessions created with this profile. Must be between 15 minutes and 24 hours. Defaults to 1 hour if not specified.
        Boolean isProductionUsage = true; // Boolean | Whether this profile is for production usage. Only applicable for Live environment profiles. If not specified for Live profiles, defaults to false (Demo).
        try {
            ApiResponse<CreateVerificationProfileResponse> response = apiInstance.createVerificationProfileWithHttpInfo(alias, brandName, primaryColor, providers, logo, redactionPeriod, sessionExpiration, isProductionUsage);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling VerificationProfilesApi#createVerificationProfile");
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
| **alias** | **String**| An alias of the verification profile shown to developers and administrators. | |
| **brandName** | **String**| The brand name of the verification profile shown to end-users. | |
| **primaryColor** | **String**| The primary color of the verification profile. Must be a 6-character hex string prefixed with a &#39;#&#39; character. Example: #000000 | [optional] |
| **providers** | [**List&lt;String&gt;**](String.md)| The list of providers you&#39;d like to select for this profile. We will not currently enable any providers. | [optional] |
| **logo** | **File**| The logo of the verification profile. | [optional] |
| **redactionPeriod** | **String**| The redaction period for verification data. Must be between 0 and 31 days, and at least 15 minutes greater than the session expiration. If not specified, defaults to 31 days. | [optional] |
| **sessionExpiration** | **String**| The session expiration for verification sessions created with this profile. Must be between 15 minutes and 24 hours. Defaults to 1 hour if not specified. | [optional] |
| **isProductionUsage** | **Boolean**| Whether this profile is for production usage. Only applicable for Live environment profiles. If not specified for Live profiles, defaults to false (Demo). | [optional] |

### Return type

ApiResponse<[**CreateVerificationProfileResponse**](CreateVerificationProfileResponse.md)>


### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: text/plain, application/json, text/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |


## getVerificationProfileById

> VerificationProfileResponse getVerificationProfileById(id)

Get Verification Profile

Gets a specific verification profile by ID.

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.VerificationProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        VerificationProfilesApi apiInstance = new VerificationProfilesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            VerificationProfileResponse result = apiInstance.getVerificationProfileById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VerificationProfilesApi#getVerificationProfileById");
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
| **id** | **UUID**|  | |

### Return type

[**VerificationProfileResponse**](VerificationProfileResponse.md)


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

## getVerificationProfileByIdWithHttpInfo

> ApiResponse<VerificationProfileResponse> getVerificationProfileById getVerificationProfileByIdWithHttpInfo(id)

Get Verification Profile

Gets a specific verification profile by ID.

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.ApiResponse;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.VerificationProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        VerificationProfilesApi apiInstance = new VerificationProfilesApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | 
        try {
            ApiResponse<VerificationProfileResponse> response = apiInstance.getVerificationProfileByIdWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling VerificationProfilesApi#getVerificationProfileById");
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
| **id** | **UUID**|  | |

### Return type

ApiResponse<[**VerificationProfileResponse**](VerificationProfileResponse.md)>


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


## listVerificationProfiles

> ListVerificationProfilesResponse listVerificationProfiles(page, pageSize)

List Verification Profiles

List the verification profiles for the current organization and environment.

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.VerificationProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        VerificationProfilesApi apiInstance = new VerificationProfilesApi(defaultClient);
        Integer page = 1; // Integer | 
        Integer pageSize = 20; // Integer | Size of the list to be returned. Accepted range from 1 to 100
        try {
            ListVerificationProfilesResponse result = apiInstance.listVerificationProfiles(page, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VerificationProfilesApi#listVerificationProfiles");
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
| **page** | **Integer**|  | [optional] [default to 1] |
| **pageSize** | **Integer**| Size of the list to be returned. Accepted range from 1 to 100 | [optional] [default to 20] |

### Return type

[**ListVerificationProfilesResponse**](ListVerificationProfilesResponse.md)


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

## listVerificationProfilesWithHttpInfo

> ApiResponse<ListVerificationProfilesResponse> listVerificationProfiles listVerificationProfilesWithHttpInfo(page, pageSize)

List Verification Profiles

List the verification profiles for the current organization and environment.

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.ApiResponse;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.VerificationProfilesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        VerificationProfilesApi apiInstance = new VerificationProfilesApi(defaultClient);
        Integer page = 1; // Integer | 
        Integer pageSize = 20; // Integer | Size of the list to be returned. Accepted range from 1 to 100
        try {
            ApiResponse<ListVerificationProfilesResponse> response = apiInstance.listVerificationProfilesWithHttpInfo(page, pageSize);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling VerificationProfilesApi#listVerificationProfiles");
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
| **page** | **Integer**|  | [optional] [default to 1] |
| **pageSize** | **Integer**| Size of the list to be returned. Accepted range from 1 to 100 | [optional] [default to 20] |

### Return type

ApiResponse<[**ListVerificationProfilesResponse**](ListVerificationProfilesResponse.md)>


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

