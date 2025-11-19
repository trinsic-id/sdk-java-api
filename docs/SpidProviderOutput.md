

# SpidProviderOutput


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**billingInformation** | [**SpidBillingInformation**](SpidBillingInformation.md) | Information about the billable status of this SPID Verification.              Present only if your account has period-based billing enabled for SPID. Contact Trinsic to enable this. |  [optional] |
|**identityProviderEntityId** | **String** | The SPID Entity ID of the Identity Provider which issued the SPID identity.              This is an HTTPS URI which uniquely identifies the IdP within the SPID federation.              A normalized / simplified representation of this value is present in the &#x60;originatingSubProviderId&#x60; field in Trinsic&#39;s normalized data model. |  |
|**spidCode** | **String** | The identifier of the user&#39;s SPID credential.              This uniquely identifies the credential within the SPID federation. |  |
|**spidCredentialExpirationDate** | **LocalDate** | Expiration date of the user&#39;s SPID credential.              This is not the same as the expiration date of the underlying identity document (such as a passport) which was used to create the SPID identity. |  [optional] |
|**placeOfBirth** | **String** | The user&#39;s place of birth. |  [optional] |
|**countyOfBirth** | **String** | The user&#39;s county of birth. |  [optional] |
|**rawIdCard** | **String** | The raw, space-separated string value for the \&quot;IdCard\&quot; field from the SPID identity.              Trinsic additionally parses this field and uses it to populate the &#x60;Document&#x60; object in the normalized data model. |  [optional] |
|**email** | **String** | The email address of the user. |  [optional] |
|**digitalAddress** | **String** | The digital address of the user. |  [optional] |
|**fiscalNumber** | **String** | Fiscal tax number for the subject. |  [optional] |
|**ivaCode** | **String** | VAT number for the subject. |  [optional] |
|**companyName** | **String** | The name of the company which the user is associated with. |  [optional] |
|**companyFiscalNumber** | **String** | The fiscal tax number of the company which the user is associated with. |  [optional] |
|**registeredOffice** | **String** | The registered office address of the company which the user is associated with. |  [optional] |



