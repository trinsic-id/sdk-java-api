# api

Connect API

- API version: v1

- Build date: 2024-08-27T15:39:48.457157Z[Etc/UTC]

- Generator version: 7.8.0

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 11+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>id.trinsic</groupId>
  <artifactId>api</artifactId>
  <version>0.3.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "id.trinsic:api:0.3.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/api-0.3.0.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import id.trinsic.*;
import id.trinsic.api.models.*;
import id.trinsic.api.AttachmentsApi;

public class AttachmentsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // Configure clients using the `defaultClient` object, such as
        // overriding the host and port, timeout, etc.
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

## Documentation for API Endpoints

All URIs are relative to *https://api.trinsic.id*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AttachmentsApi* | [**getAttachment**](docs/AttachmentsApi.md#getAttachment) | **POST** /api/v1/attachments/attachment | Get Attachment
*AttachmentsApi* | [**getAttachmentWithHttpInfo**](docs/AttachmentsApi.md#getAttachmentWithHttpInfo) | **POST** /api/v1/attachments/attachment | Get Attachment
*NetworkApi* | [**identityLookup**](docs/NetworkApi.md#identityLookup) | **GET** /api/v1/network/identities/{phoneNumber} | Lookup Identity
*NetworkApi* | [**identityLookupWithHttpInfo**](docs/NetworkApi.md#identityLookupWithHttpInfo) | **GET** /api/v1/network/identities/{phoneNumber} | Lookup Identity
*NetworkApi* | [**listProviders**](docs/NetworkApi.md#listProviders) | **GET** /api/v1/network/providers | List Identity Providers
*NetworkApi* | [**listProvidersWithHttpInfo**](docs/NetworkApi.md#listProvidersWithHttpInfo) | **GET** /api/v1/network/providers | List Identity Providers
*SessionsApi* | [**cancelSession**](docs/SessionsApi.md#cancelSession) | **POST** /api/v1/sessions/{sessionId}/cancel | Cancel Session
*SessionsApi* | [**cancelSessionWithHttpInfo**](docs/SessionsApi.md#cancelSessionWithHttpInfo) | **POST** /api/v1/sessions/{sessionId}/cancel | Cancel Session
*SessionsApi* | [**createSession**](docs/SessionsApi.md#createSession) | **POST** /api/v1/sessions | Create Session
*SessionsApi* | [**createSessionWithHttpInfo**](docs/SessionsApi.md#createSessionWithHttpInfo) | **POST** /api/v1/sessions | Create Session
*SessionsApi* | [**getSession**](docs/SessionsApi.md#getSession) | **GET** /api/v1/sessions/{sessionId} | Get Session
*SessionsApi* | [**getSessionWithHttpInfo**](docs/SessionsApi.md#getSessionWithHttpInfo) | **GET** /api/v1/sessions/{sessionId} | Get Session
*SessionsApi* | [**getSessionResult**](docs/SessionsApi.md#getSessionResult) | **POST** /api/v1/sessions/{sessionId}/results | Get Session Results
*SessionsApi* | [**getSessionResultWithHttpInfo**](docs/SessionsApi.md#getSessionResultWithHttpInfo) | **POST** /api/v1/sessions/{sessionId}/results | Get Session Results
*SessionsApi* | [**listSessions**](docs/SessionsApi.md#listSessions) | **GET** /api/v1/sessions | List Sessions
*SessionsApi* | [**listSessionsWithHttpInfo**](docs/SessionsApi.md#listSessionsWithHttpInfo) | **GET** /api/v1/sessions | List Sessions
*SessionsApi* | [**redactSession**](docs/SessionsApi.md#redactSession) | **POST** /api/v1/sessions/{sessionId}/redact | Redact Session
*SessionsApi* | [**redactSessionWithHttpInfo**](docs/SessionsApi.md#redactSessionWithHttpInfo) | **POST** /api/v1/sessions/{sessionId}/redact | Redact Session


## Documentation for Models

 - [Address](docs/Address.md)
 - [Attachments](docs/Attachments.md)
 - [CancelSessionResponse](docs/CancelSessionResponse.md)
 - [CreateSessionRequest](docs/CreateSessionRequest.md)
 - [CreateSessionResponse](docs/CreateSessionResponse.md)
 - [DisclosedFields](docs/DisclosedFields.md)
 - [DisclosedFieldsRequest](docs/DisclosedFieldsRequest.md)
 - [DocumentData](docs/DocumentData.md)
 - [FailureMessage](docs/FailureMessage.md)
 - [GetAttachmentRequest](docs/GetAttachmentRequest.md)
 - [GetSessionResponse](docs/GetSessionResponse.md)
 - [GetSessionResultRequest](docs/GetSessionResultRequest.md)
 - [GetSessionResultResponse](docs/GetSessionResultResponse.md)
 - [IdentityData](docs/IdentityData.md)
 - [IdentityLookupResponse](docs/IdentityLookupResponse.md)
 - [ListProvidersResponse](docs/ListProvidersResponse.md)
 - [ListSessionsResponse](docs/ListSessionsResponse.md)
 - [OrderDirection](docs/OrderDirection.md)
 - [PersonData](docs/PersonData.md)
 - [ProviderInfo](docs/ProviderInfo.md)
 - [Session](docs/Session.md)
 - [SessionFailCode](docs/SessionFailCode.md)
 - [SessionOrdering](docs/SessionOrdering.md)
 - [SessionState](docs/SessionState.md)
 - [ValidationResult](docs/ValidationResult.md)
 - [Verification](docs/Verification.md)
 - [VerificationFailCode](docs/VerificationFailCode.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="Bearer"></a>
### Bearer


- **Type**: HTTP Bearer Token authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.
However, the instances of the api clients created from the `ApiClient` are thread-safe and can be re-used.

## Author



