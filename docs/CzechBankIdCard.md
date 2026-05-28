

# CzechBankIdCard


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | The identity document type code.              Possible values are:              - ID - Identity card - P - Passport - DL - Driving license - IR - Residence permit - VS - Visa permit label - PS - Residential label - IX - Book with residence permit - IE - Form with temporary residence - OP - Identity card – without machine readable zone - CA - Passport of the Czech Republic resident – without machine readable zone - UNKNOWN - Unknown id card type |  |
|**description** | **String** | The localized identity document type description. |  [optional] |
|**country** | **String** | The country for which the identity document is valid. |  |
|**number** | **String** | The identity document number. |  |
|**validTo** | **LocalDate** | The identity document expiration date. |  |
|**issuer** | **String** | The office that issued the identity document. |  [optional] |
|**issueDate** | **LocalDate** | The identity document issue date. |  [optional] |



