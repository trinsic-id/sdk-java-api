

# DiiaSubjectOutput


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**commonName** | **String** | Full name. |  [optional] |
|**country** | **String** | Country code in ISO 3166-1 alpha-2 format. |  [optional] |
|**serialNumber** | **String** | The SERIALNUMBER attribute from the certificate Subject Distinguished Name. This is not the X.509 certificate serial number field.              For Ukrainian natural person certificates this commonly uses the ETSI natural person semantics identifier format \&quot;{identifier-type}{country-code}-{identifier}\&quot;.              Components: - identifier-type (3 chars): TIN (Tax Identification Number) for RNOKPP. - country-code (2 chars): ISO 3166-1 alpha-2 country code, typically UA. - identifier: RNOKPP, the Ukrainian individual taxpayer registration number. |  [optional] |
|**givenName** | **String** | Given name. |  [optional] |
|**surname** | **String** | Surname. |  [optional] |



