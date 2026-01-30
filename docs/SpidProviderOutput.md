

# SpidProviderOutput

Exposed properties for the `italy-spid` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**billingInformation** | [**SpidBillingInformation**](SpidBillingInformation.md) | Information about the billable status of this SPID Verification.              Present only if your account has period-based billing enabled for SPID. Contact Trinsic to enable this. |  [optional] |
|**identityProviderEntityId** | **String** | The SPID Entity ID of the Identity Provider which issued the SPID identity.              This is an HTTPS URI which uniquely identifies the IdP within the SPID federation.              A normalized / simplified representation of this value is present in the &#x60;originatingSubProviderId&#x60; field in Trinsic&#39;s normalized data model. |  |
|**spidCode** | **String** | The identifier of the SPID credential, uniquely identifying it within the SPID federation.              The format of this string is specific to each individual Identity Provider. |  |
|**spidCredentialExpirationDate** | **LocalDate** | Expiration date of the SPID credential.              This is not the same as the expiration date of the underlying identity document (such as a passport) which was used to create the SPID identity. |  [optional] |
|**rawIdCard** | **String** | The raw, space-separated string value for the \&quot;IdCard\&quot; field from the SPID credential.              Trinsic additionally parses this field and uses it to populate the &#x60;Document&#x60; object in the normalized data model. |  [optional] |
|**givenName** | **String** | The individual&#39;s first / given name(s) |  [optional] |
|**familyName** | **String** | The individual&#39;s last / family name(s) |  [optional] |
|**dateOfBirth** | **LocalDate** | The date of birth of the individual |  [optional] |
|**gender** | **String** | The gender of the individual.              Possible values: \&quot;M\&quot; | \&quot;F\&quot; |  [optional] |
|**placeOfBirth** | **String** | The individual&#39;s place of birth.              This is a 4-digit Belfiore Code identifying either the municipality of birth (for births in Italy) or a foreign country (for births outside Italy). |  [optional] |
|**countyOfBirth** | **String** | The individual&#39;s county (province) of birth, abbreviated.              For foreign births, this is \&quot;EE\&quot;. |  [optional] |
|**domicileStreetAddress** | **String** | The street address of the individual&#39;s residence.              This includes street name, street type, and house number, in the standard format for the given state. |  [optional] |
|**domicilePostalCode** | **String** | The postal code of the individual&#39;s residence |  [optional] |
|**domicileMunicipality** | **String** | The municipality of the individual&#39;s residence |  [optional] |
|**domicileProvince** | **String** | The province of the individual&#39;s residence |  [optional] |
|**domicileNation** | **String** | The 2-digit country code of the individual&#39;s residence |  [optional] |
|**email** | **String** | The email address of the individual |  [optional] |
|**mobilePhone** | **String** | The mobile phone number of the individual, in Italian format. |  [optional] |
|**digitalAddress** | **String** | The PEC (Italian Certified Email) address of the individual or organization. |  [optional] |
|**fiscalNumber** | **String** | Fiscal tax number for the individual. |  [optional] |
|**ivaCode** | **String** | The VAT number of the organization which was verified, or of the organization which the verified individual is associated with. |  [optional] |
|**companyName** | **String** | The name of the organization which was verified, or of the organization which the verified individual is associated with. |  [optional] |
|**companyFiscalNumber** | **String** | The fiscal tax number of the organization which was verified, or of the organization which the verified individual is associated with. |  [optional] |
|**registeredOffice** | **String** | The registered office address of the organization which was verified, or of the organization which the verified individual is associated with. |  [optional] |



