

# KoreaTelcoMatchProviderOutput

Exposed properties for the `korea-telco-match` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**phoneNumber** | **String** | The phone number submitted for the carrier match. |  [optional] |
|**teleType** | **String** | The mobile carrier used for the match.              Supported values: Lgu, Skt, Kt. |  [optional] |
|**resultCode** | **String** | The carrier match result code.              Common result codes: - \&quot;0000\&quot;: Successful match - \&quot;0001\&quot;: Failed - Verification Information Mismatch (General) - \&quot;0002\&quot;: Failed - Unable to Verify Phone Number - \&quot;0004\&quot;: Failed - Date of Birth Verification Error - \&quot;0005\&quot;: Failed - Gender Verification Error - \&quot;0006\&quot;: Failed - Name Verification Error - \&quot;0009\&quot;: Failed - Device OS Mismatch |  [optional] |



