

# MoldovaIdentityCardCredential

A Moldovan Identity Card credential, with document type `md.gov.wallet.pid.1`, retrieved from the Moldovan EVO wallet.              This credential is derived from the individual's Moldovan National Identity Card.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**idnp** | **String** | The individual&#39;s IDNP (Numărul de Identificare Personal), the Moldovan state personal identification number.              This is a 13-digit number which uniquely identifies all natural persons in the Republic of Moldova. It has the format &#x60;2YYYOOOSSSSSX&#x60;, where: - &#x60;2&#x60; is the literal number &#x60;2&#x60; to indicate that the identifier belongs to a natural person - &#x60;YYY&#x60; is the last 3 digits of the year in which the identifier was issued - &#x60;OOO&#x60; is the code of the registrar office which issued the identifier - &#x60;SSSSS&#x60; is the sequential birth number for that year - &#x60;X&#x60; is a check digit              Note that the year encoded in the identifier is not necessarily the same as the year of birth of the individual. |  [optional] |
|**givenName** | **String** | The individual&#39;s given name(s), as recorded on their Moldovan identity card. |  [optional] |
|**familyName** | **String** | The individual&#39;s family name (surname), as recorded on their Moldovan identity card. |  [optional] |
|**sex** | **Integer** | The individual&#39;s sex, as an ISO/IEC 5218 numeric code.              Possible values: - 0: Not known - 1: Male - 2: Female - 9: Not applicable |  [optional] |
|**nationality** | **String** | The individual&#39;s nationality, as an ISO 3166-1 alpha-2 country code.              Moldovan nationals are &#x60;MD&#x60;. |  [optional] |
|**dateOfBirth** | **LocalDate** | The date of birth of the individual. |  [optional] |
|**ageOver18** | **Boolean** | Whether the individual is at least 18 years of age at the time of issuance of the digital credential. |  [optional] |
|**ageOver21** | **Boolean** | Whether the individual is at least 21 years of age at the time of issuance of the digital credential. |  [optional] |
|**residentAddress** | **String** | The individual&#39;s full registered residential address as a single formatted string. |  [optional] |
|**residentCountry** | **String** | The country of the individual&#39;s registered residence, as an ISO 3166-1 alpha-2 country code. |  [optional] |
|**residentRegion** | **String** | The region of the individual&#39;s registered residence. |  [optional] |
|**residentCity** | **String** | The locality (municipality, city, town, or village) of the individual&#39;s registered residence. |  [optional] |
|**residentStreet** | **String** | The street name of the individual&#39;s registered residence. |  [optional] |
|**residentHouseNumber** | **String** | The house or building number of the individual&#39;s registered residence. |  [optional] |
|**residentBlock** | **String** | The building block (bloc) of the individual&#39;s registered residence, where applicable. |  [optional] |
|**residentFlat** | **String** | The flat (apartment) number of the individual&#39;s registered residence, where applicable. |  [optional] |
|**issueDate** | **LocalDate** | The date the physical identity card, used to create this digital credential, was issued. |  [optional] |
|**expiryDate** | **LocalDate** | The date the physical identity card, used to create this digital credential, expires. |  [optional] |
|**issuingAuthority** | **String** | The name of the authority that issued the identity card. |  [optional] |
|**documentType** | **String** | The document type              TODO: Get example values |  [optional] |
|**documentSeries** | **String** | The series of the underlying physical identity card.              This is the prefix to the full Moldovan identity card number, which is in the format &#x60;SNNN...&#x60;, where:              - &#x60;S&#x60; is a one-letter document series - &#x60;NNN...&#x60; is a document number (typically 8 digits) |  [optional] |
|**documentNumber** | **String** | The number of the underlying physical identity card, excluding the series.              This is the suffix to the full Moldovan identity card number, which is in the format &#x60;SNNN...&#x60;, where:              - &#x60;S&#x60; is a one-letter document series - &#x60;NNN...&#x60; is a document number (typically 8 digits) |  [optional] |



