

# MoldovaDriverLicenseCredential

A Moldovan Driver License credential, with document type `md.gov.wallet.dl.1`, retrieved from the Moldovan EVO wallet.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**idnp** | **String** | The individual&#39;s IDNP (Numărul de Identificare Personal), the Moldovan state personal identification number.              This is a 13-digit number which uniquely identifies all natural persons in the Republic of Moldova. It has the format &#x60;2YYYOOOSSSSSX&#x60;, where: - &#x60;2&#x60; is the literal number &#x60;2&#x60; to indicate that the identifier belongs to a natural person - &#x60;YYY&#x60; is the last 3 digits of the year in which the identifier was issued - &#x60;OOO&#x60; is the code of the registrar office which issued the identifier - &#x60;SSSSS&#x60; is the sequential birth number for that year - &#x60;X&#x60; is a check digit              Note that the year encoded in the identifier is not necessarily the same as the year of birth of the individual. |  [optional] |
|**givenName** | **String** | The individual&#39;s given name(s), as recorded on their Moldovan driver license. |  [optional] |
|**familyName** | **String** | The individual&#39;s family name (surname), as recorded on their Moldovan driver license. |  [optional] |
|**dateOfBirth** | **LocalDate** | The date of birth of the individual. |  [optional] |
|**ageOver18** | **Boolean** | Whether the individual is at least 18 years of age at the time of issuance of the digital credential. |  [optional] |
|**ageOver21** | **Boolean** | Whether the individual is at least 21 years of age at the time of issuance of the digital credential. |  [optional] |
|**birthCountry** | **String** | The country where the individual was born, as an ISO 3166-1 alpha-2 country code. |  [optional] |
|**birthCity** | **String** | The locality (municipality, city, town, or village) where the individual was born. |  [optional] |
|**issueDate** | **LocalDate** | The date the driver license was issued. |  [optional] |
|**expiryDate** | **LocalDate** | The date the driver license expires. |  [optional] |
|**issuingAuthority** | **String** | The name of the authority that issued the driver license. |  [optional] |
|**documentNumber** | **String** | The driver license number. |  [optional] |
|**drivingPrivileges** | [**List&lt;Iso180135DrivingPrivilege&gt;**](Iso180135DrivingPrivilege.md) | The categories of vehicle the individual is licensed to drive, parsed per ISO 18013-5.              Each entry has a vehicle category code with its own issue / expiry dates and possible restrictions. |  [optional] |



