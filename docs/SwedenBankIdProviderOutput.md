

# SwedenBankIdProviderOutput

Exposed properties for the `sweden-bankid` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fullName** | **String** | The full name of the individual. |  [optional] |
|**dateOfBirth** | **LocalDate** | The date of birth of the individual. |  [optional] |
|**personalIdentityNumber** | **String** | The Swedish personal number (personnummer) associated with the verified individual. The value is typically a 12-digit number. This is in the format YYYYMMDDXXXX, where: - YYYYMMDD is the date of birth. - XXXX is an individual number, indicating gender.              If XXXX is even, the individual is female. If XXXX is odd, the individual is male. |  [optional] |
|**givenName** | **String** | The given name of the individual |  [optional] |
|**familyName** | **String** | The family name of the individual |  [optional] |
|**country** | **String** | The individual&#39;s country on the verified certificate. This is ISO 2-character code of the country. |  [optional] |
|**certificatePolicy** | **String** | The object identifier policy of the individual&#39;s verified certificate |  [optional] |
|**commonName** | **String** | The common name of the individual&#39;s verified certificate |  [optional] |
|**distinguishedName** | **String** | The distinguished name of the individual&#39;s verified certificate |  [optional] |
|**personalIdentityNumberIssuingCountry** | **String** | The country that issued the Swedish personal number. This is an ISO 2-character code of the country and is extracted from the certificate. This will always be &#x60;SE&#x60;. |  [optional] |
|**authenticationDeviceIp** | **String** | The IP address of the device used for authentication |  [optional] |
|**notBefore** | **OffsetDateTime** | The certificate validity start date (not before) in UTC |  [optional] |
|**notAfter** | **OffsetDateTime** | The certificate validity end date (not after) in UTC |  [optional] |



