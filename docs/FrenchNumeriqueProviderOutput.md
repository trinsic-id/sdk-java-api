

# FrenchNumeriqueProviderOutput

Exposed properties for the `france-identite-numerique` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**givenName** | [**FrenchNumeriqueGivenName**](FrenchNumeriqueGivenName.md) | Given name information including the full given name and its structured components (first name and middle name(s)). |  [optional] |
|**familyName** | **String** | Birth name (nom de naissance) as recorded on the individual&#39;s French identity document. In France, this is the family name given at birth and may differ from the usage name. |  [optional] |
|**preferredSurname** | **String** | Usage surname (\&quot;nom d&#39;usage\&quot;) - according to French law, this is the surname used in daily life. This is typically a married name or other preferred surname, as opposed to FamilyName which is the birth surname (\&quot;nom de naissance\&quot;). |  [optional] |
|**birthdate** | **String** | Date of birth in YYYY-MM-DD format, as recorded on the individual&#39;s French identity document. |  [optional] |
|**nationality** | [**FrenchNumeriqueNationality**](FrenchNumeriqueNationality.md) | Nationality information with ISO 3166 alpha-3 code and French label. The label is provided in French (e.g., \&quot;Française\&quot; for French nationality). |  [optional] |
|**sex** | **String** | Sex - \&quot;Male\&quot; or \&quot;Female\&quot;. |  [optional] |
|**majority** | **Boolean** | Majority status (majorité) indicating whether the individual has reached the French age of legal majority (18 years old). This value is computed by the provider from the individual&#39;s birthdate. |  [optional] |
|**phoneNumber** | [**FrenchNumeriquePhone**](FrenchNumeriquePhone.md) | Phone number information including the full phone number and its structured components (country prefix and national number). |  [optional] |
|**phoneNumberVerified** | **Boolean** | Whether the phone number has been verified by the provider. |  [optional] |
|**email** | **String** | Email address registered in the individual&#39;s digital identity account. |  [optional] |
|**emailVerified** | **Boolean** | Whether the email address has been verified by the provider. |  [optional] |
|**birthplace** | **String** | National Institute of Statistics and Economic Studies (INSEE) official geographic code (COG) of the birthplace. This is a 5-digit French administrative code identifying the commune (municipality) of birth. For births in metropolitan France, the first two digits represent the department.              See: https://www.insee.fr/fr/information/2560452 |  [optional] |
|**birthplaceLabel** | **String** | Name of the birthplace commune (municipality). If applicable, this includes the full name of the arrondissement (borough). |  [optional] |
|**birthCountry** | **String** | National Institute of Statistics and Economic Studies (INSEE) official geographic code (COG) for the individual&#39;s country of birth.              LaPoste returns this as a 5-character numeric string. This is a country/territory COG, so it always starts with \&quot;99\&quot; (99xxx). France is coded as 99100.              See full list here: https://www.insee.fr/fr/information/2560452 |  [optional] |
|**birthCountryIso** | **String** | Birth country as an ISO 3166 alpha-3 code. |  [optional] |
|**birthCountryLabel** | **String** | Label of the birth country, in English. |  [optional] |
|**birthDepartment** | **String** | Number of the department of birth (e.g., \&quot;75\&quot; for Paris, \&quot;2A\&quot; for Corse-du-Sud).              See full list here: https://en.wikipedia.org/wiki/Departments_of_France |  [optional] |
|**digitalIdentityCreationDate** | **LocalDate** | Date when the individual&#39;s digital identity was created. |  [optional] |
|**digitalIdentityExpirationDate** | **LocalDate** | Date when the digital identity expires. It is valid for 5 years from the date of identity verification. Individuals are notified ~1 month before and must re-verify identity via the app or in-person at La Poste. After expiration, the identity is deactivated but can be renewed within 1 year; otherwise deleted. |  [optional] |
|**identityDocumentType** | **String** | Type of identity document used for verification. Can be \&quot;ID_CARD\&quot;, \&quot;PASSPORT\&quot;, or \&quot;RESIDENCE_PERMIT\&quot;. |  [optional] |
|**identityDocumentNumber** | **String** | Identity document number as it appears on the ID Card, Passport or Residence Permit. |  [optional] |
|**identityDocumentEmittingDate** | **LocalDate** | Date when the identity document was issued. |  [optional] |
|**identityDocumentExpirationDate** | **LocalDate** | Date when the identity document expires. |  [optional] |
|**identityDocumentEmittingCountry** | **String** | Country that issued the identity document (ISO 3166 alpha-3 code). |  [optional] |
|**identityDocumentMrz** | **String** | Machine Readable Zone (MRZ) data from the ID Card, Passport or Residence Permit. |  [optional] |



