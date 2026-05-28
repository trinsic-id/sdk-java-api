

# IndonesiaDukcapilMatchNationalIdNumberField


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**inputValue** | **String** | The NIK (Nomor Induk Kependudukan) submitted for this check.              NIK is Indonesia&#39;s unique population identity number, issued by Indonesia&#39;s population administration and civil registration authority (Dukcapil) under the Ministry of Home Affairs.              Format: - 16 numeric digits. - Digits 1-2 are the province code. - Digits 3-4 are the regency or city code within that province. - Digits 5-6 are the district code within that regency or city. - Digits 7-12 encode date of birth as DDMMYY. For female NIK holders, the day is increased by 40. - Digits 13-16 are an issuance serial number. |  |
|**outcome** | **Double** | The provider assessment result for the submitted NIK.              Local integration code expects the provider to return 0 or 1 for this assessment. |  |



