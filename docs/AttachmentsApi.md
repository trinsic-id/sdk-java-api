# AttachmentsApi

All URIs are relative to *https://api.trinsic.id*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAttachment**](AttachmentsApi.md#getAttachment) | **POST** /api/v1/attachments/attachment | Get Attachment |
| [**getAttachmentWithHttpInfo**](AttachmentsApi.md#getAttachmentWithHttpInfo) | **POST** /api/v1/attachments/attachment | Get Attachment |



## getAttachment

> void getAttachment(getAttachmentRequest)

Get Attachment

Exchange an Attachment Access Key (from &#x60;IdentityData.Attachments&#x60;) for the raw contents of the attachment.                Use this API to fetch document (front, back, portrait) or other (selfie) images from a verification, if relevant.                In some cases, attachments may not be immediately available after a verification is completed. If so, this endpoint will return an HTTP 202 code, and you should try again later.

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.AttachmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AttachmentsApi apiInstance = new AttachmentsApi(defaultClient);
        GetAttachmentRequest getAttachmentRequest = new GetAttachmentRequest(); // GetAttachmentRequest | 
        try {
            apiInstance.getAttachment(getAttachmentRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AttachmentsApi#getAttachment");
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
| **getAttachmentRequest** | [**GetAttachmentRequest**](GetAttachmentRequest.md)|  | [optional] |

### Return type


null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Validation Failed |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

## getAttachmentWithHttpInfo

> ApiResponse<Void> getAttachment getAttachmentWithHttpInfo(getAttachmentRequest)

Get Attachment

Exchange an Attachment Access Key (from &#x60;IdentityData.Attachments&#x60;) for the raw contents of the attachment.                Use this API to fetch document (front, back, portrait) or other (selfie) images from a verification, if relevant.                In some cases, attachments may not be immediately available after a verification is completed. If so, this endpoint will return an HTTP 202 code, and you should try again later.

### Example

```java
// Import classes:
import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.ApiResponse;
import id.trinsic.Configuration;
import id.trinsic.auth.*;
import id.trinsic.models.*;
import id.trinsic.api.AttachmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.trinsic.id");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        AttachmentsApi apiInstance = new AttachmentsApi(defaultClient);
        GetAttachmentRequest getAttachmentRequest = new GetAttachmentRequest(); // GetAttachmentRequest | 
        try {
            ApiResponse<Void> response = apiInstance.getAttachmentWithHttpInfo(getAttachmentRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling AttachmentsApi#getAttachment");
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
| **getAttachmentRequest** | [**GetAttachmentRequest**](GetAttachmentRequest.md)|  | [optional] |

### Return type


ApiResponse<Void>

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json, text/json, application/*+json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Validation Failed |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |
