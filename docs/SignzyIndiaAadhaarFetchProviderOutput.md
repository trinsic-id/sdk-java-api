

# SignzyIndiaAadhaarFetchProviderOutput

Exposed properties for the `india-digilocker-aadhaar-fetch` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**documentType** | **String** | The document type from which the identity data was retrieved. |  [optional] |
|**timestamp** | **OffsetDateTime** | The timestamp when the signed document was generated and verified. |  [optional] |
|**timeToLive** | **OffsetDateTime** | The validity expiration timestamp for the verification document. |  [optional] |
|**aadhaarNumberLastFour** | **String** | The Aadhaar number (UID) value for the individual.              This is only the last four digits of the Aadhaar number. |  [optional] |
|**claims** | [**AadhaarClaims**](AadhaarClaims.md) | The claims extracted from the Aadhaar document. |  [optional] |
|**localizedClaims** | [**AadhaarLocalizedClaims**](AadhaarLocalizedClaims.md) | The localized claims extracted from the Aadhaar document. |  [optional] |
|**documentSignatureValidated** | **Boolean** | Whether our own validation of the Aadhaar document signature and certificate chain succeeded.              When the signed document (e.g. Digilocker XML) is available, we validate it using the standard CCA/SafeScrypt chain. When the document is not returned, the signature cannot be validated and this is false. Some providers (e.g. Signzy) also supply a separate DSC validation indicator in the webhook payload; that is independent of this flag, which reflects only our validation. |  |
|**digilockerId** | **String** | DigiLocker&#39;s 36-character stable account identifier.              This identifier is deemed safe to use to reference the individual. *Note, the format is not guaranteed to be a UUID. |  [optional] |
|**issuerId** | **String** | The identifier for the issuer of the DigiLocker document. |  [optional] |
|**issuer** | **String** | Issuer name for the DigiLocker document. |  [optional] |
|**mobilePhone** | **String** | The individual&#39;s mobile phone number from DigiLocker&#39;s account details. |  [optional] |
|**scope** | **List&lt;String&gt;** | DigiLocker consent scopes that the individual actually consented to for this session. Included in provider output so customers can verify what was granted: the customer does not control these—the individual chooses scopes in the DigiLocker consent UI, and there is no way to pre-select or enforce them. This is a common source of error (e.g. the individual skips a scope), so surfacing the granted scopes lets customers confirm the session had the expected consent. |  |



