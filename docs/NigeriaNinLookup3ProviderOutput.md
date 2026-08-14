

# NigeriaNinLookup3ProviderOutput

Exposed properties for the `nigeria-nin-lookup-3` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nationalIdentityNumber** | **String** | National Identification Number (NIN).              This is a unique, permanent identifier assigned by the National Identity Management Commission (NIMC) upon enrollment.              Format: - 11 numeric digits - No publicly known encoding scheme is used to encode personal information in the NIN - Last digit is a checksum using the Verhoeff algorithm |  [optional] |
|**givenName** | **String** | The given name of the individual. |  [optional] |
|**middleName** | **String** | The middle name of the individual. |  [optional] |
|**familyName** | **String** | The family name of the individual. |  [optional] |
|**sex** | **String** | The sex of the individual.              Possible values: - Male - Female |  [optional] |
|**dateOfBirth** | **LocalDate** | The date of birth of the individual. |  [optional] |
|**birthCountry** | **String** | Country of birth as an ISO 3166-1 alpha-2 code. |  [optional] |
|**birthState** | **String** | State of birth as recorded by National Identity Management Commission (NIMC). |  [optional] |
|**phoneNumber** | **String** | Phone number registered with National Identity Management Commission (NIMC).              Format: - International E.164 |  [optional] |
|**streetAddress** | **String** | Street or residence line registered with National Identity Management Commission (NIMC).              This is the street-level address line only. Town, Local Government Area, and state are returned separately. |  [optional] |
|**residenceTown** | **String** | Town of residence registered with National Identity Management Commission (NIMC). |  [optional] |
|**localGovernmentArea** | **String** | Local Government Area of residence.              Nigeria is divided into 774 Local Government Areas (LGAs), which are the third-tier administrative divisions below states and the Federal Capital Territory. LGAs are roughly equivalent to counties or municipalities in other countries. |  [optional] |
|**state** | **String** | State of residence registered with National Identity Management Commission (NIMC). |  [optional] |
|**nextOfKinFirstName** | **String** | First name of the individual&#39;s next of kin. |  [optional] |
|**nextOfKinStreetAddress** | **String** | Street or residence line of the individual&#39;s next of kin. |  [optional] |
|**nextOfKinLocalGovernmentArea** | **String** | Local Government Area of the individual&#39;s next of kin. |  [optional] |
|**nextOfKinTown** | **String** | Town of residence of the individual&#39;s next of kin. |  [optional] |



