

# AudkenniProviderOutput

Exposed properties for the `audkenni` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nationalRegisterId** | **String** | National Register ID number (kennitala) of the individual.              Often written with a hyphen following the 6th digit (123456-1234). ID numbers are composed of ten digits. The first six of these are the individual’s date of birth in the format DDMMYY. The seventh and eighth digits are randomly chosen when the ID number is allocated, the ninth digit used to be a check digit (modulus (11) but this has been removed. The tenth indicates the century of the individual’s birth: ‘9’ for 1900–1999, ‘0’ for 2000 and beyond. |  |
|**subjectId** | **String** | Unique identifier for the individual across Audkenni.              It is recommended to use this identifier instead of using the national register ID directly. |  |
|**name** | **String** | The full name of the individual. |  |
|**dateOfBirth** | **LocalDate** | The date of birth of the individual as parsed from the National Register ID number. Is null if the date of birth could not be parsed, but should always be present |  [optional] |



