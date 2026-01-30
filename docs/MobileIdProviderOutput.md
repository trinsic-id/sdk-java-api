

# MobileIdProviderOutput

Exposed properties for the `mobile-id` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**givenName** | **String** | The given name of the individual, extracted from the Mobile ID authentication certificate&#39;s Subject Distinguished Name \&quot;G\&quot; (givenName) attribute. |  [optional] |
|**familyName** | **String** | The family name (surname) of the individual, extracted from the Mobile ID authentication certificate&#39;s Subject Distinguished Name \&quot;SN\&quot; (surname) attribute. |  [optional] |
|**dateOfBirth** | **LocalDate** | The individual&#39;s date of birth, derived from the personal code. |  [optional] |
|**sex** | **String** | The individual&#39;s sex, derived from the first digit of the personal code.              Possible values: - Male - Female |  [optional] |
|**country** | **String** | The ISO 3166-1 alpha-2 country code extracted from the Mobile ID authentication certificate&#39;s Subject Distinguished Name \&quot;C\&quot; (country) attribute.              This represents the country of the certificate issuer, not the person&#39;s nationality or citizenship. For Mobile ID, this will be \&quot;EE\&quot; (Estonia) or \&quot;LT\&quot; (Lithuania). |  [optional] |
|**identityType** | **String** | The identity document type, extracted from the first 3 characters of the SERIALNUMBER field (before the country code).              Possible values: - PNO: Personal Number (national civic registration number) - PAS: Passport - IDC: National identity card |  [optional] |
|**personalCode** | **String** | The personal code (Estonian: isikukood, Lithuanian: asmens kodas) of the individual, extracted from the SERIALNUMBER field of the Mobile ID authentication certificate. This is the portion after the identity type and country prefix (e.g., \&quot;48501010014\&quot; from \&quot;PNOEE-48501010014\&quot;).              Both Estonian and Lithuanian personal codes are 11 digits in the format GYYMMDDSSSC where: - G &#x3D; century/gender (3-4 &#x3D; 1900s, 5-6 &#x3D; 2000s; odd &#x3D; male, even &#x3D; female) - YYMMDD &#x3D; date of birth - SSS &#x3D; sequence number - C &#x3D; checksum digit              See: - https://en.wikipedia.org/wiki/National_identification_number#Estonia - https://en.wikipedia.org/wiki/National_identification_number#Lithuania |  [optional] |
|**serialNumber** | **String** | The SERIALNUMBER attribute from the Mobile ID authentication certificate&#39;s Subject Distinguished Name. Format: \&quot;{identity-type}{country-code}-{identifier}\&quot;              Components: - identity-type (3 chars): PNO (Personal Number), PAS (Passport), IDC (ID Card) - country-code (2 chars): ISO 3166-1 alpha-2 (EE, LT) - identifier: The personal code |  [optional] |
|**certificateSubject** | **String** | The full Subject Distinguished Name (Subject DN) from the Mobile ID authentication certificate. Contains comma-separated RDN (Relative Distinguished Name) components including C (Country), CN (Common Name), SN (Surname), G (Given Name), and SERIALNUMBER (Personal identifier). |  [optional] |



