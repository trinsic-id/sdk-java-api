

# DiiaIssuerOutput


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**commonName** | **String** | Certificate issuer common name. |  [optional] |
|**organization** | **String** | Certificate issuer organization. |  [optional] |
|**country** | **String** | Issuer country code in ISO 3166-1 alpha-2 format. |  [optional] |
|**locality** | **String** | City or region where the issuer is located. |  [optional] |
|**serialNumber** | **String** | Unique identifier assigned to the issuing certificate authority.              Typically formatted as \&quot;{country}-{registration code}-{sequence}\&quot;. |  [optional] |
|**nationalRegistrationNumber** | **String** | The organizationIdentifier attribute from the certificate Issuer Distinguished Name.              Ukrainian organization identifiers commonly use the ETSI format \&quot;{identifier-type}{country-code}-{identifier}\&quot;.              Components: - identifier-type (3 chars): NTR (National Trade Register). - country-code (2 chars): ISO 3166-1 alpha-2 country code, typically UA. - identifier: The legal entity registration code.              For Diia.Signature, this is issuer metadata rather than a natural person&#39;s RNOKPP. |  [optional] |



