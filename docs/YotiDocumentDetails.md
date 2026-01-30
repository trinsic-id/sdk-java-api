

# YotiDocumentDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | The type of document used to create the Yoti credential.              Possible values: - PASSPORT: A government-issued identity document - DRIVING_LICENCE: A government-issued identity card - NATIONAL_ID: A government-issued identity card - PASS_CARD: A physical or digital identity card that is accredited by the UK&#39;s national Proof of Age Standards Scheme (PASS) |  [optional] |
|**issuingCountry** | **String** | The issuing country&#39;s ISO alpha-3 code |  [optional] |
|**documentNumber** | **String** | The arbitrary document number for the provided document type |  [optional] |
|**expirationDate** | **LocalDate** | The document&#39;s expiration date in YYYY-MM-DD format |  [optional] |
|**issuingAuthority** | **String** | The document&#39;s issuing authority. This can either be a country code as a specified ISO alpha-3 or the name of the issuing authority. |  [optional] |



