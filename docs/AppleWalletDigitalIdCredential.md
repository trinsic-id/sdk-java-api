

# AppleWalletDigitalIdCredential

An Apple Wallet Digital ID credential, with document type `org.iso.23220.photoid.1`.              This is a passport-derived digital credential issued by Apple.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**givenNameUnicode** | **String** | First name(s), other name(s), or secondary identifier of the individual.              This field uses the full UTF-8 character set and can represent any name. |  [optional] |
|**givenNameLatin1** | **String** | First name(s), other name(s), or secondary identifier of the individual.              This field uses the Latin-1 character set and is limited to names represented by the English alphabet. represented using the English alphabet. |  [optional] |
|**familyNameUnicode** | **String** | Last name, surname, or primary identifier of the individual.              This field uses the full UTF-8 character set and can represent any name. |  [optional] |
|**familyNameLatin1** | **String** | Last name, surname, or primary identifier of the individual.              This field uses only the Latin-1 character set and is largely limited to names which can be represented using the English alphabet. |  [optional] |
|**sex** | **Integer** | The individual&#39;s sex as an ISO/IEC 5218 code.              Possible values: - 0: Unknown - 1: Male - 2: Female - 9: Not Applicable |  [optional] |
|**dateOfBirth** | [**AppleWalletDigitalIdBirthDate**](AppleWalletDigitalIdBirthDate.md) | The date of birth of the individual, possibly with an \&quot;approximate mask\&quot; indicating uncertain digits. |  [optional] |
|**documentNumber** | **String** | The document number of the underlying passport used to create the Digital ID. |  [optional] |
|**issuingAuthorityUnicode** | **String** | Name or identifier of the issuing authority of the credential, using the full UTF-8 character set.              This field&#39;s contents are arbitrary; it has no guaranteed format. |  [optional] |
|**issuingSubdivision** | **String** | ISO 3166-2 country-subdivision code for the jurisdiction that issued the credential. |  [optional] |
|**issuingCountry** | **String** | ISO 3166-1 alpha-2 country code of the issuing authority&#39;s country or territory. |  [optional] |
|**issueDate** | **LocalDate** | Date when the underlying passport used to create the Digital ID was issued. |  [optional] |
|**expiryDate** | **LocalDate** | Date when the underlying passport used to create the Digital ID expires. |  [optional] |
|**ageInYears** | **Integer** | The age of the individual, as of the issuance date of the credential. |  [optional] |
|**ageOver** | [**List&lt;AgeOverOutput&gt;**](AgeOverOutput.md) | Processed age-over claims returned by the credential. |  [optional] |
|**residentAddressUnicode** | **String** | The permanent address of the individual, using the full UTF-8 character set.              This is only present if the underlying passport contained an address, which is uncommon. |  [optional] |
|**residentCityUnicode** | **String** | City of the individual&#39;s permanent address, using the full UTF-8 character set.              This is only present if the underlying passport contained an address, which is uncommon. |  [optional] |
|**residentCityLatin1** | **String** | City of the individual&#39;s permanent address, using the Latin-1 character set.              This is only present if the underlying passport contained an address, which is uncommon. |  [optional] |
|**residentPostalCode** | **String** | Postal code of the individual&#39;s permanent address.              This is only present if the underlying passport contained an address, which is uncommon. |  [optional] |
|**residentCountry** | **String** | ISO 3166-1 alpha-2 country code of the individual&#39;s permanent address.              This is only present if the underlying passport contained an address, which is uncommon. |  [optional] |



