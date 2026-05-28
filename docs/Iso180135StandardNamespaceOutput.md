

# Iso180135StandardNamespaceOutput

Fields from the ISO 18013-5 standard mDL namespace.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**givenName** | **String** | First name(s), other name(s), or secondary identifier of the individual. |  [optional] |
|**givenNameNationalCharacter** | **String** | The given name of the individual using the full UTF-8 character set. |  [optional] |
|**familyName** | **String** | Last name, surname, or primary identifier of the individual. |  [optional] |
|**familyNameNationalCharacter** | **String** | The family name of the individual using the full UTF-8 character set. |  [optional] |
|**dateOfBirth** | **LocalDate** | The date of birth of the individual. |  [optional] |
|**issueDate** | **LocalDate** | The date when the mDL was issued.              This date marks the beginning of the Administrative Validity Period of the mDL, which is usually (but not necessarily always) the same as the issue date of the underlying physical document used to create the mDL, if one exists. |  [optional] |
|**expiryDate** | **LocalDate** | The date when the mDL expires.              This date marks the end of the Administrative Validity Period of the mDL, which is usually (but not necessarily always) the same as the expiration date of the underlying physical document used to create the mDL, if one exists. |  [optional] |
|**issuingCountry** | **String** | Alpha-2 country code of the issuing authority&#39;s country or territory. |  [optional] |
|**issuingAuthority** | **String** | Name or identifier of the mDL issuing authority.              This field&#39;s contents are arbitrary; it has no guaranteed format. |  [optional] |
|**issuingJurisdiction** | **String** | ISO 3166-2 country-subdivision code for the jurisdiction that issued the mDL. |  [optional] |
|**nationality** | **String** | Nationality of the individual as an ISO 3166-1 alpha-2 country code. |  [optional] |
|**documentNumber** | **String** | The document number assigned to the mDL.              This is typically the same as the document number of the underlying physical document used to create the mDL, if one exists. |  [optional] |
|**drivingPrivileges** | [**List&lt;Iso180135DrivingPrivilege&gt;**](Iso180135DrivingPrivilege.md) | Driving privileges of the individual, parsed per ISO 18013-5. |  [optional] |
|**unDistinguishingSign** | **String** | The UN Distinguishing sign of the issuing country according to ISO/IEC 18013-1. |  [optional] |
|**administrativeNumber** | **String** | Audit control number assigned by the issuing authority.              The meaning and semantics of this field are defined by the issuing authority in question. |  [optional] |
|**sex** | **Integer** | The individual&#39;s sex as an ISO/IEC 5218 code.              Possible values:              - 0: Unknown - 1: Male - 2: Female - 9: Not Applicable |  [optional] |
|**heightCentimeters** | **Integer** | The individual&#39;s height in centimeters. |  [optional] |
|**weightKilograms** | **Integer** | The individual&#39;s weight in kilograms. |  [optional] |
|**eyeColor** | **String** | The individual&#39;s eye color.              Possible values:              - \&quot;black\&quot; - \&quot;blue\&quot; - \&quot;brown\&quot; - \&quot;dichromatic\&quot; - \&quot;grey\&quot; - \&quot;green\&quot; - \&quot;hazel\&quot; - \&quot;maroon\&quot; - \&quot;pink\&quot; - \&quot;unknown\&quot; |  [optional] |
|**hairColor** | **String** | The individual&#39;s hair color.              Possible values: - \&quot;bald\&quot; - \&quot;black\&quot; - \&quot;blond\&quot; - \&quot;brown\&quot; - \&quot;grey\&quot; - \&quot;red\&quot; - \&quot;auburn\&quot; - \&quot;sandy\&quot; - \&quot;white\&quot; - \&quot;unknown\&quot; |  [optional] |
|**birthPlace** | **String** | Country and municipality or state/province where the individual was born. |  [optional] |
|**residentAddress** | **String** | Address where the individual resides.              The exact format of this field is variable and depends on the issuer. It may map exactly to a \&quot;Line1\&quot;, or it may include city, state, and/or zip code as well. |  [optional] |
|**residentCity** | **String** | City where the individual resides. |  [optional] |
|**residentState** | **String** | State, province, or district where the individual resides. |  [optional] |
|**residentPostalCode** | **String** | Postal code where the individual resides. |  [optional] |
|**residentCountry** | **String** | Country where the individual resides as an ISO 3166-1 alpha-2 country code. |  [optional] |
|**portraitCaptureDate** | **OffsetDateTime** | Date and time when the portrait image was captured. |  [optional] |
|**ageInYears** | **Integer** | Age of the individual in years. |  [optional] |
|**ageBirthYear** | **Integer** | Year of birth of the individual. |  [optional] |
|**ageOver** | [**List&lt;AgeOverOutput&gt;**](AgeOverOutput.md) | Processed age-over claims returned by the mDL. |  [optional] |
|**biometricTemplateFace** | [**Iso180132BiometricGroupTemplate**](Iso180132BiometricGroupTemplate.md) | Facial biometric template group from &#x60;biometric_template_face&#x60;, parsed per ISO 18013-2 Annex C. |  [optional] |
|**biometricTemplateVoice** | [**Iso180132BiometricGroupTemplate**](Iso180132BiometricGroupTemplate.md) | Vocal biometric template group from &#x60;biometric_template_voice&#x60;, parsed per ISO 18013-2 Annex C. |  [optional] |
|**biometricTemplateFinger** | [**Iso180132BiometricGroupTemplate**](Iso180132BiometricGroupTemplate.md) | Fingerprint biometric template group from &#x60;biometric_template_finger&#x60;, parsed per ISO 18013-2 Annex C. |  [optional] |
|**biometricTemplateIris** | [**Iso180132BiometricGroupTemplate**](Iso180132BiometricGroupTemplate.md) | Iris biometric template group from &#x60;biometric_template_iris&#x60;, parsed per ISO 18013-2 Annex C. |  [optional] |
|**biometricTemplateRetina** | [**Iso180132BiometricGroupTemplate**](Iso180132BiometricGroupTemplate.md) | Retinal biometric template group from &#x60;biometric_template_retina&#x60;, parsed per ISO 18013-2 Annex C. |  [optional] |



