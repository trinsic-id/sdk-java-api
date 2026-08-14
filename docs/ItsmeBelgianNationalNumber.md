

# ItsmeBelgianNationalNumber


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**number** | **String** | The raw Belgian National Register Number of the verified individual.              Availability by ID document issuing country: returned only for Belgian-issued ID documents.              This is an 11-digit number in the format YYMMDDXXXCC: - YYMMDD is the date of birth. - XXX is a sequential birth number, odd for males and even for females. - CC is the checksum. |  [optional] |
|**issuingCountry** | **String** | The issuing country as an ISO 3166-1 alpha-2 country code.              Availability by ID document issuing country: always returned for all supported issuing countries. |  [optional] |
|**verificationDate** | **OffsetDateTime** | The date time when the document was last read.              Availability by ID document issuing country: always returned for supported issuing countries except Belgium, where it is best effort. |  [optional] |



