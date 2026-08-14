

# IndonesiaDukcapilMatchProviderOutput

Exposed properties for the `indonesia-dukcapil-match` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nationalIdNumber** | [**IndonesiaDukcapilMatchNationalIdNumberField**](IndonesiaDukcapilMatchNationalIdNumberField.md) | NIK submitted for this Dukcapil match and the assessment result returned for that value. |  [optional] |
|**fullName** | [**IndonesiaDukcapilMatchFullNameField**](IndonesiaDukcapilMatchFullNameField.md) | Full name submitted for this Dukcapil match and the assessment result returned for that value. |  [optional] |
|**dateOfBirth** | [**IndonesiaDukcapilMatchDateOfBirthField**](IndonesiaDukcapilMatchDateOfBirthField.md) | Date of birth submitted for this Dukcapil match and the assessment result returned for that value. |  [optional] |
|**provinceCode** | **String** | Two-digit Indonesian government administrative region code for the province, extracted from digits 1-2 of the submitted NIK number.              Source system: Kode Wilayah Administrasi Pemerintahan, maintained by Indonesia&#39;s Ministry of Home Affairs. The first digit indicates the island group: 1-2 Sumatra, 3-4 Java, 5 Bali and Nusa Tenggara, 6 Kalimantan, 7 Sulawesi, 8 Maluku, and 9 Papua. The second digit follows the province creation order. |  [optional] |
|**regencyOrCityCode** | **String** | Four-digit Indonesian government administrative region code for the regency or city, extracted from digits 1-4 of the submitted NIK number.              Source system: Kode Wilayah Administrasi Pemerintahan, maintained by Indonesia&#39;s Ministry of Home Affairs. Format: two-digit province code followed by a two-digit regency or city sequence; suffixes 01-69 identify regencies and suffixes 71-99 identify cities. The NIK stores this value without dot separators. |  [optional] |
|**districtCode** | **String** | Six-digit Indonesian government administrative region code for the district (kecamatan), extracted from digits 1-6 of the submitted NIK number.              Source system: Kode Wilayah Administrasi Pemerintahan, maintained by Indonesia&#39;s Ministry of Home Affairs. Format: two-digit province code, two-digit regency or city code, and two-digit district sequence. The NIK stores this value without dot separators. |  [optional] |
|**sexNationalIdNumber** | **String** | Sex extracted from the birth-day portion of the submitted NIK number.              Known values: - Male: The encoded day value is 40 or lower. - Female: The encoded day value is greater than 40. |  [optional] |
|**serialNumber** | **String** | Four-digit issuance serial number extracted from digits 13-16 of the submitted NIK number. |  [optional] |
|**phoneNumber** | **String** | The phone number submitted for this verification, if provided.              Format: international E.164 phone number. |  [optional] |
|**consentGivenAt** | **OffsetDateTime** | The consent timestamp submitted for this verification. |  [optional] |
|**email** | **String** | The email address submitted for this verification, if provided. |  [optional] |



