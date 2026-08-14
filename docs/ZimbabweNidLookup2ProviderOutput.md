

# ZimbabweNidLookup2ProviderOutput

Exposed properties for the `zimbabwe-nid-lookup-2` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nationalIdNumber** | **String** | Zimbabwe National ID number (NID) issued by the Zimbabwean government.              Format: - 8-9 digits followed by 1 letter and 2 digits - Regex: /^[0-9]{8,9}[A-Za-z]\\d{2}$/ - There is no publicly documented encoding scheme for encoding personal information in the NID - No check digit or algorithm has been publicly documented by the Zimbabwean government |  [optional] |
|**givenName** | **String** | Given name(s) of the individual. |  [optional] |
|**familyName** | **String** | Family name of the individual. |  [optional] |
|**fullName** | **String** | Full name of the individual. |  [optional] |
|**sex** | **String** | Sex of the individual.              Possible values: - Male - Female - Not Applicable - Unknown |  [optional] |
|**dateOfBirth** | **LocalDate** | Date of birth of the individual. |  [optional] |
|**placeOfBirth** | **String** | Place of birth, typically a municipality or city within Zimbabwe. |  [optional] |
|**isAlive** | **Boolean** | Whether individual is reported as alive by the Zimbabwean government. |  [optional] |
|**dateOfDeath** | **LocalDate** | Date of death of the individual, when available. |  [optional] |



