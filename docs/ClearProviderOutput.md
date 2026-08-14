

# ClearProviderOutput

Exposed properties for the `clear` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authenticated** | **Boolean** | Whether CLEAR authenticated the individual. |  [optional] |
|**authenticationMethods** | **List&lt;String&gt;** | The methods the individual authenticated with during the CLEAR flow.              Known values: - webauthn - email - sms_otp |  [optional] |
|**activatedAuthenticationMethods** | **List&lt;String&gt;** | The authentication methods the individual activated but did not use as a pre-existing credential during this session.              Known values: - webauthn - totp |  [optional] |
|**checks** | [**List&lt;ClearProviderOutputCheck&gt;**](ClearProviderOutputCheck.md) | The checks CLEAR performed on the individual&#39;s data and each check&#39;s result. |  [optional] |
|**checkMetadata** | **List&lt;String&gt;** | CLEAR error or metadata codes that influenced check results. |  [optional] |
|**completedAt** | **OffsetDateTime** | The time the CLEAR verification session completed, as a UTC timestamp. |  [optional] |
|**createdAt** | **OffsetDateTime** | The time the CLEAR verification session was created, as a UTC timestamp. |  [optional] |
|**email** | **String** | The individual&#39;s verified email address from the session. |  [optional] |
|**expiresAt** | **OffsetDateTime** | The time the CLEAR verification session expires, as a UTC timestamp. |  [optional] |
|**fieldsToCollect** | **List&lt;String&gt;** | The fields CLEAR still required to complete the current verification step. |  [optional] |
|**ip** | **List&lt;String&gt;** | The IP addresses used to access this CLEAR verification session. |  [optional] |
|**phone** | **String** | The individual&#39;s verified phone number, normalized to international E.164 format. |  [optional] |
|**status** | **String** | The CLEAR verification session status.              Known values: - success - fail - awaiting_user_input - deferred - processing_data - expired - awaiting_manual_review - manual_success - manual_fail - canceled |  [optional] |
|**updatedAt** | **OffsetDateTime** | The time the CLEAR verification session was most recently updated, as a UTC timestamp. |  [optional] |
|**userAgent** | **List&lt;String&gt;** | The browser user agents that accessed this CLEAR verification session. |  [optional] |
|**userCreated** | **Boolean** | Whether CLEAR created a new individual account during this session. |  [optional] |
|**userId** | **String** | The CLEAR identifier for the individual. |  [optional] |
|**traits** | [**ClearProviderOutputTraits**](ClearProviderOutputTraits.md) | The individual traits CLEAR returned after collecting enough information to make a decision. |  [optional] |
|**idvStatus** | **String** | The identity verification status.              Known documented value: - verified: CLEAR indicates the individual is verified. |  [optional] |
|**sessions** | [**List&lt;ClearProviderOutputSessionInfo&gt;**](ClearProviderOutputSessionInfo.md) | Frontend session metadata CLEAR collected. |  [optional] |



