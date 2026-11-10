

# JapanMyNumberProviderOutput

Verified attributes for the `japan-mynumber` provider, including the original sex code.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The individual&#39;s full name as recorded on the card, preserving its original script and spacing. |  [optional] |
|**address** | **String** | The individual&#39;s full address as recorded on the card, preserving its original script and spacing. |  [optional] |
|**dateOfBirth** | **LocalDate** | The individual&#39;s Gregorian date of birth in YYYY-MM-DD format. |  [optional] |
|**sex** | **String** | The original sex code returned for the verified individual.              Known values: - 1: Male. - 2: Female. - 9: Other; omitted from normalized sex because it has no equivalent value. An absent code means it was not supplied. |  [optional] |



