

# VerificationProfileResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The ID of the verification profile |  |
|**alias** | **String** | An alias of the verification profile shown to developers and administrators. |  |
|**brandName** | **String** | The brand name of the verification profile shown to end-users. |  |
|**externalId** | **String** | A customer-defined external ID for this verification profile, unique within your organization. |  [optional] |
|**logoUrl** | **String** | The URL of the verification profile&#39;s logo. |  |
|**primaryColor** | **String** | The primary color of the verification profile. |  |
|**enabledProviders** | **List&lt;String&gt;** | The providers that are currently enabled for the verification profile. |  |
|**sessionExpiration** | **String** | The session expiration for verification sessions created with this profile. |  |
|**isProductionUsage** | **Boolean** | Whether this profile is for production usage. Only applicable for Live environment profiles. |  |



