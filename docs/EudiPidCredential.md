

# EudiPidCredential

An EUDI Person Identification Data (PID) credential, with document type `eu.europa.ec.eudi.pid.1`.              This is the primary identity credential type defined in the EUDI Wallet framework.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**givenName** | **String** | Current first name(s), including middle name(s) where applicable, of the individual to whom the PID relates. |  [optional] |
|**givenNameBirth** | **String** | First name(s), including middle name(s), of the individual at the time of birth. |  [optional] |
|**familyName** | **String** | Current last name(s) or surname(s) of the individuals. |  [optional] |
|**familyNameBirth** | **String** | Last name(s) or surname(s) of the individual at the time of birth. |  [optional] |
|**dateOfBirth** | **LocalDate** | The date of birth of the individual. |  [optional] |
|**birthPlace** | **String** | Country (ISO 3166-1 alpha-2), state, province, district, local area, municipality, city, town, or village where the individual was born. |  [optional] |
|**nationality** | **List&lt;String&gt;** | One or more ISO 3166-1 alpha-2 country codes representing the nationality of the individual. |  [optional] |
|**expiryDate** | **LocalDate** | Date when the PID expires.              Because PIDs are not necessarily backed by a physical document, this does not correspond to the expiration date of such. |  [optional] |
|**issuingAuthority** | **String** | Name of the administrative authority that issued the PID, or the ISO 3166 alpha-2 country code of the respective Member State if there is no separate authority entitled to issue PIDs. |  [optional] |
|**issuingCountry** | **String** | ISO 3166-1 alpha-2 country code of the country or territory of the issuer of the PID. |  [optional] |
|**issuanceDate** | **LocalDate** | Date when the PID was issued and/or the administrative validity period began. |  [optional] |
|**trustAnchor** | **String** | URL where a machine-readable trust anchor for verifying the PID can be found. |  [optional] |
|**attestationLegalCategory** | **String** | Indicator that this credential has been issued specifically as PID.              When present, typically equal to \&quot;PID\&quot;. |  [optional] |
|**documentNumber** | **String** | A number assigned to the PID by the issuer.              This does not correspond to the document number of a physical document. |  [optional] |
|**issuingJurisdiction** | **String** | ISO 3166-2 country-subdivision code for the jurisdiction that issued the PID. |  [optional] |
|**locationStatus** | **String** | Location of validity status information for the PID, where revocation information is published. |  [optional] |
|**sex** | **Integer** | Sex of the individual.              This is a superset of the ISO/IEC 5218 sex code standard, defining additional \&quot;other\&quot;, \&quot;inter\&quot;, \&quot;diverse\&quot;, and \&quot;open\&quot; values.              Possible values: - 0: Unknown - 1: Male - 2: Female - 3: Other - 4: Inter - 5: Diverse - 6: Open - 9: Not Applicable              For values 0, 1, 2, and 9, ISO/IEC 5218 applies. |  [optional] |
|**emailAddress** | **String** | The individual&#39;s email address. |  [optional] |
|**mobilePhoneNumber** | **String** | The mobile phone number of the individual, in international format. |  [optional] |
|**personalAdministrativeNumber** | **String** | A value assigned to the individual that is unique among all personal administrative numbers issued by the provider. |  [optional] |
|**residentAddress** | **String** | The full address of the individual&#39;s permanent residence. |  [optional] |
|**residentStreet** | **String** | The street name of the individual&#39;s permanent residence. |  [optional] |
|**residentHouseNumber** | **String** | The house number of the individual&#39;s permanent residence. |  [optional] |
|**residentCity** | **String** | The municipality, city, town, or village of the individual&#39;s permanent residence. |  [optional] |
|**residentState** | **String** | The state, province, district, or local area of the individual&#39;s permanent residence. |  [optional] |
|**residentPostalCode** | **String** | The postal code of the individual&#39;s permanent residence. |  [optional] |
|**residentCountry** | **String** | The ISO 3166-1 alpha-2 country code of the individual&#39;s permanent residence. |  [optional] |



