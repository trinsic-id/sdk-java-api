

# NigeriaNinLookup2ProviderOutput

Exposed properties for the `nigeria-nin-lookup-2` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**firstName** | **String** | The first name (given name) of the ID holder. |  [optional] |
|**middleName** | **String** | The middle name of the ID holder. |  [optional] |
|**surname** | **String** | The surname (family name) of the ID holder. |  [optional] |
|**sex** | **String** | The sex of the ID holder.              Possible values: - Male - Female |  [optional] |
|**dateOfBirth** | **LocalDate** | The date of birth of the ID holder. |  [optional] |
|**birthCountry** | **String** | Country of birth as an ISO 3166-1 alpha-2 code. |  [optional] |
|**nationalIdentityNumber** | **String** | National Identification Number (NIN).              This is a unique, permanent identifier assigned by the National Identity Management Commission (NIMC) upon enrollment.              Format: - 11 numeric digits - No publicly known encoding scheme is used to encode personal information in the NIN - Last digit is a checksum using the Verhoeff algorithm |  [optional] |
|**phoneNumber** | **String** | Phone number registered with the National Identity Management Commission.              Format: - Valid Nigerian numbers are returned in international E.164 format   (for example, +2348031234567). - Otherwise, the value is returned in trunk notation (leading zero included)   as provided by the authority (for example, 0123456789). |  [optional] |
|**email** | **String** | Email address registered with the National Identity Management Commission. |  [optional] |
|**address** | **String** | Full residential address as a single string, normalized to lowercase without delimiters. |  [optional] |
|**localGovernmentArea** | **String** | Local Government Area of residence.              Nigeria is divided into 774 Local Government Areas (LGAs), which are the third-tier administrative divisions below states and the Federal Capital Territory. LGAs are roughly equivalent to counties or municipalities in other countries. |  [optional] |
|**state** | **String** | State of residence. |  [optional] |



