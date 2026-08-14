

# ClearProviderOutputDocument


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nationality** | **String** | The nationality scanned from the document, normalized to an ISO 3166-1 alpha-2 country code. |  [optional] |
|**documentType** | **String** | The document type scanned by CLEAR.              Known values: - drivers_license - paper_passport - passport_card - id_card - visa - health_care_card - other |  [optional] |
|**issuingCountry** | **String** | The ISO 3166-1 alpha-2 country code of issue. |  [optional] |
|**issuingSubdivision** | **String** | The ISO 3166 subdivision issuer of the document. |  [optional] |
|**documentNumber** | **String** | The document number scanned from the document. |  [optional] |
|**dateOfExpiry** | **LocalDate** | The document expiration date. |  [optional] |
|**gender** | **String** | The gender scanned from the document. CLEAR does not publish a closed set of possible values for this field. |  [optional] |
|**address** | [**ClearProviderOutputAddress**](ClearProviderOutputAddress.md) | The address scanned from the document. |  [optional] |
|**dateOfBirth** | **LocalDate** | The date of birth scanned from the document. |  [optional] |
|**firstName** | **String** | The first name scanned from the document. |  [optional] |
|**lastName** | **String** | The last name scanned from the document. |  [optional] |
|**middleName** | **String** | The middle name scanned from the document. |  [optional] |
|**fullName** | **String** | The full name scanned from the document. |  [optional] |



