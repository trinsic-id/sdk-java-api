

# IndiaPanLookupProviderOutput

Exposed properties for the `india-pan-lookup` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**permanentAccountNumber** | **String** | Permanent Account Number (PAN) that was looked up.              PAN is a ten-character identifier issued by the Income Tax Department of India. |  [optional] |
|**structuredPermanentAccountNumber** | [**IndiaPanStructuredNumber**](IndiaPanStructuredNumber.md) | PAN split into structural parts for the canonical ten-character format.              Covers alphabetic series, assessee category, name prefix letter, serial number, and check letter. |  [optional] |
|**fullName** | **String** | Full name of the entity subject to income tax.              NOTE: Only available when PAN status is VALID. |  [optional] |
|**givenName** | **String** | Given name of the individual.              NOTE: Only available when PAN status is VALID and the verification is for an individual person. |  [optional] |
|**middleName** | **String** | Middle name of the individual.              NOTE: Only available when PAN status is VALID and the verification is for an individual person. |  [optional] |
|**familyName** | **String** | Family name of the individual.              NOTE: Only available when PAN status is VALID and the verification is for an individual person. |  [optional] |
|**dateOfBirth** | **String** | Date of birth of the individual.              NOTE: Only available when PAN status is VALID and the verification is for an individual person. |  [optional] |
|**panStatus** | **String** | PAN card status from Signzy for the lookup.              Possible values: - VALID - FAKE - DEACTIVATED - DELETED - INVALID - AMALGAMATION - ACQUISITION - DEATH - DISSOLUTION - LIQUIDATED - MERGER - PARTITION - SPLIT - UNDER LIQUIDATION - INOPERATIVE |  [optional] |



