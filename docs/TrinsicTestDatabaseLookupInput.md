

# TrinsicTestDatabaseLookupInput


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**givenName** | **String** | The given name to use for the output of the test Session.              This is required; if not provided, Trinsic&#39;s Fallback UI will be invoked to collect it from the user.              Can be any non-empty value. |  [optional] |
|**familyName** | **String** | The family name to use for the output of the test Session.              This is required; if not provided, Trinsic&#39;s Fallback UI will be invoked to collect it from the user.              Can be any non-empty value. |  [optional] |
|**identityCode** | **String** | A 6-digit code; must be \&quot;123456\&quot; for the Session to succeed.              This is required; if not provided, Trinsic&#39;s Fallback UI will be invoked to collect it from the user.              Any other value will cause the Session to fail. |  [optional] |
|**selfieBase64** | **String** | An optional selfie image, base64-encoded.              Will replace the existing test selfie attachment output if provided. |  [optional] |



