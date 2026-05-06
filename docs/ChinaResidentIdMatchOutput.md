

# ChinaResidentIdMatchOutput

Exposed properties for the `china-resident-id-match` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fullName** | **String** | The fullname of the individual in Chinese. |  [optional] |
|**dateOfBirth** | **LocalDate** | The birthdate of the individual. |  [optional] |
|**residentIdNumber** | **String** | The Resident ID number from the People&#39;s Republic of China (PRC) ID card.              The Resident ID number is an 18-digit number follows the format (AAAAAAYYYYMMDDXXX@): - Six digits (AAAAAA) are the area code of where the person was born or the area of first issuance for those who were born before the resident system was created. - Eight digits are the birthdate of the individual in YYYYMMDD format - Three digits are the order code assigned to individual. Males are assigned odd numbers and females even numbers. - Final digit is the checksum confirming the validity of the ID number&#39;s first 17 digits using ISO 7064:1983, MOD 11-2. |  [optional] |



