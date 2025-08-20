

# IndonesiaDukcapilMatchInput


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fullName** | **String** | The user&#39;s full name |  [optional] |
|**dateOfBirth** | **LocalDate** | The user&#39;s date of birth, in &#x60;YYYY-MM-DD&#x60; format |  [optional] |
|**nikIdNumber** | **String** | The user&#39;s Indonesia NIK ID number |  [optional] |
|**email** | **String** | The email address of the individual.              Either email or phone number must be provided. |  [optional] |
|**phoneNumber** | **String** | The phone number of the individual.              Either email or phone number must be provided. |  [optional] |
|**selfieImage** | **byte[]** | The raw bytes of the selfie image of the individual.              Must be JPEG or PNG format; 10MB maximum. |  [optional] |
|**documentImage** | **byte[]** | The raw bytes of the image of the individual&#39;s KTP government ID.              Must be JPEG format; 1MB maximum.              Optional. |  [optional] |
|**consentGivenAt** | **OffsetDateTime** | The timestamp when consent was given by the user for the verification. |  [optional] |



