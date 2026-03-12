

# PhilippinesPhysicalNidProviderOutput

Exposed properties for the `philippines-physical-national-id-qr` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**philsysCardNumber** | **String** | The PhilSys Card Number (PCN). Every citizen or resident alien registered in PhilSys has a PhilSys Number (PSN). This number is tokenized into a card number to protect the PSN. The PhilSys Card Number is 12 characters long, and often is written in octets with dashes in between. |  |
|**givenName** | **String** | The given (first) name of the individual. |  [optional] |
|**middleName** | **String** | The middle name of the individual. |  [optional] |
|**familyName** | **String** | The family (last) name of the individual. |  [optional] |
|**dateOfBirth** | **LocalDate** | The date of birth of the individual. |  [optional] |
|**suffix** | **String** | The name suffix of the individual (e.g. Jr., III). |  [optional] |
|**sex** | **String** | The sex of the individual.              Possible values: - Male - Female |  [optional] |
|**placeOfBirth** | **String** | The place of birth of the individual as recorded on the PhilSys credential. |  [optional] |
|**documentIssueDate** | **LocalDate** | The date the document was issued. |  [optional] |



