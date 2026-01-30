

# FrejaProviderOutput

Exposed properties for the `a-freja-eid-login` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**firstName** | **String** | The first name of the verified individual |  |
|**lastName** | **String** | The last name of the verified individual |  |
|**personalNumber** | **String** | The value returned by Freja in the \&quot;ssn\&quot; field.              The actual value of this field depends on the country of origin used to create the Freja credential. It is typically a Social Security Number, National Identification Number, or equivalent personal identifier. |  |
|**personalNumberCountry** | **String** | The 2-digit ISO country code of the country which issued the personal number. |  |



