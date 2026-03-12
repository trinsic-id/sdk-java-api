

# DigilockerAadhaarProviderOutput

Exposed properties for the `india-digilocker-aadhaar` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**documentType** | **String** | The document type from which the identity data was retrieved from.              Possible values: - ADHAR - PANCR |  [optional] |
|**documentSignatureValidated** | **Boolean** | Whether the downloaded Aadhaar document signature and certificate chain validation succeeded.              In some cases, the document may not be returned, but the data is. When the document is received, a certificate validation is performed. When it is not, the signature can not be validated. |  |
|**timestamp** | **OffsetDateTime** | The timestamp when the signed document was generated and verified.              This is parsed as a date-time value. Aadhaar may omit timezone information. |  [optional] |
|**timeToLive** | **OffsetDateTime** | The validity expiration timestamp for the verification document.              This is parsed as a date-time value. Aadhaar may omit timezone information. |  [optional] |
|**aadhaarNumberLastFour** | **String** | The Aadhaar number (UID) value for the individual.              This is only the last four digits of the Aadhaar number. |  [optional] |
|**claims** | [**AadhaarClaims**](AadhaarClaims.md) | The claims extracted from the signed Aadhaar document. |  [optional] |
|**localizedClaims** | [**AadhaarLocalizedClaims**](AadhaarLocalizedClaims.md) | The localized claims extracted from the signed Aadhaar document. |  [optional] |



