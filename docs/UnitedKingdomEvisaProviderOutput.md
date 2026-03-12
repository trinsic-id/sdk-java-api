

# UnitedKingdomEvisaProviderOutput

Exposed properties for the `uk-evisa-lookup` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**firstName** | **String** | The first name of the individual as recorded on the eVisa. |  [optional] |
|**lastName** | **String** | The last name of the individual as recorded on the eVisa. |  [optional] |
|**dateOfBirth** | **LocalDate** | The date of birth of the individual. |  [optional] |
|**shareCode** | **String** | The 9-character share code used for the verification. |  [optional] |
|**referenceNumber** | **String** | The eVisa reference number issued by UK Visas and Immigration (UKVI). |  [optional] |
|**expirationDate** | **LocalDate** | The expiration date of the eVisa. Only present for immigration_status verifications. |  [optional] |
|**validFrom** | **LocalDate** | The start date from which the eVisa is valid. Only returned for immigration_status and right_to_rent verifications — not returned for right_to_work. |  [optional] |
|**nationality** | **String** | The nationality of the individual as recorded on the eVisa. Only present for immigration_status verifications. |  [optional] |
|**immigrationStatus** | **String** | The immigration status of the individual. Only present for immigration_status verifications. This is a personalized record for each individual, and there is no single definitive list. Some common values: - Settled - Pre-settled - Student - Graduate - Youth Mobility - Global Talent - Skilled Worker - Limited leave |  [optional] |
|**outcome** | **String** | Overall verification outcome: \&quot;pass\&quot; or \&quot;fail\&quot;. |  [optional] |
|**evidenceType** | **String** | Type of verification. List of possible values: - immigration_status - right_to_work - right_to_rent |  [optional] |



