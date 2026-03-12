

# NigeriaNinLookup2ProviderOutput

Exposed properties for the `nigeria-nin-lookup-2` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**firstName** | **String** | The first name (given name) of the ID holder. |  |
|**middleName** | **String** | The middle name of the ID holder. |  [optional] |
|**surname** | **String** | The surname (family name) of the ID holder. |  |
|**sex** | **String** | The sex of the ID holder.              Possible values: - Male - Female |  [optional] |
|**dateOfBirth** | **LocalDate** | The date of birth of the ID holder. |  [optional] |
|**birthCountry** | **String** | Country of birth as an ISO 3166-1 alpha-2 code. |  [optional] |
|**nationalIdentityNumber** | **String** | National Identification Number (NIN).              This is a unique, permanent identifier assigned by the National Identity Management Commission upon enrollment.              Format: 11 numeric digits (regex: /^[0-9]{11}$/). The digits are validated using the Verhoeff algorithm, meaning the last digit serves as a check digit. |  |
|**phoneNumber** | **String** | Phone number registered with the National Identity Management Commission. |  [optional] |
|**email** | **String** | Email address registered with the National Identity Management Commission. |  [optional] |
|**address** | **String** | Full residential address as a single string, normalized to lowercase without delimiters. |  [optional] |
|**localGovernmentArea** | **String** | Local Government Area of residence.              Nigeria is divided into 774 Local Government Areas (LGAs), which are the third-tier administrative divisions below states and the Federal Capital Territory. LGAs are roughly equivalent to counties or municipalities in other countries. |  [optional] |
|**state** | **String** | State of residence. |  [optional] |



