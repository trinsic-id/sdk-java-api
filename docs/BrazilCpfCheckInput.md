

# BrazilCpfCheckInput


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cpfNumber** | **String** | The user&#39;s 11-digit, numeric CPF Number |  [optional] |
|**dateOfBirth** | **LocalDate** | The user&#39;s date of birth, in &#x60;YYYY-MM-DD&#x60; format. Optional in this request; required to complete CPF lookups. |  [optional] |
|**selfieImage** | **byte[]** | The selfie image collected from the user. When using an SDK, this can be a raw byte array. In raw JSON form this is Base64. |  [optional] |
|**selfieImageContentType** | **String** | The MIME Type of the file contained in &#x60;SelfieImage&#x60;.              Must be one of &#x60;image/jpeg&#x60; or &#x60;image/png&#x60;. |  [optional] |



