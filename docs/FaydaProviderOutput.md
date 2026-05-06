

# FaydaProviderOutput

Exposed properties for the `ethiopia-fayda` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sub** | **String** | A unique eKYC identifying token used to match the original eKYC token received from the provider when the individual was initially registered.              Since Fayda does not return identifying data, it is the responsibility of the relying party to keep the unique individual token received from Fayda when the individual was initially registered to do a comparison of the subs to verify that it is the same person. |  [optional] |
|**name** | **String** | The full name of the verified individual.              This may be an English or Arabic name if the individual only has it one language, otherwise this will be null and the other names will be populated. |  [optional] |
|**englishName** | **String** | The full English name of the verified individual. |  [optional] |
|**arabicName** | **String** | The full Arabic name of the verified individual. |  [optional] |
|**birthdate** | **LocalDate** | The date of birth of the verified individual.              This attribute is only available if registered directly. |  [optional] |
|**gender** | **String** | The sex of the verified individual.              Possible values: - Unknown - NotApplicable - Male - Female              This attribute is only available if registered directly. |  [optional] |
|**nationality** | **String** | The nationality of the verified individual as an ISO 3166-1 alpha-2 country code.              This attribute is only available if registered directly. |  [optional] |
|**phoneNumber** | **String** | The phone number of the verified individual.              This attribute is only available if registered directly. |  [optional] |
|**email** | **String** | The email address of the verified individual.              This attribute is only available if registered directly. |  [optional] |
|**address** | [**FaydaProviderAddress**](FaydaProviderAddress.md) | The address of the verified individual.              This attribute is only available if registered directly. |  [optional] |



