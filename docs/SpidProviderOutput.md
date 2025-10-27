

# SpidProviderOutput


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**billingInformation** | [**SpidBillingInformation**](SpidBillingInformation.md) | Information about the billable status of this SPID Verification.              Present only if your account has period-based billing enabled for SPID. Contact Trinsic to enable this. |  [optional] |
|**fiscalNumber** | **String** | Fiscal tax number for the subject. |  [optional] |
|**spidCode** | **String** | Unique user identifier contained within the SPID identity. |  [optional] |
|**ivaCode** | **String** | VAT number for the subject. |  [optional] |
|**spidCredentialExpirationDate** | **LocalDate** | Expiration date of the user&#39;s SPID credential.              This is not the same as the expiration date of the underlying identity document (such as a passport) which was used to create the SPID identity. |  [optional] |



