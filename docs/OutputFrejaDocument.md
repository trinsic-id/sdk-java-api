

# OutputFrejaDocument


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | Type of document. Possible values are: * \&quot;PASS\&quot;: Passport * \&quot;DRILIC\&quot;: Driver&#39;s License * \&quot;NATID\&quot;: National ID * \&quot;IDSIS\&quot;: SiS certified ID document * \&quot;TAXID\&quot;: Tax Agency ID card * \&quot;OTHERID\&quot;: Other IDs |  [optional] |
|**serialNumber** | **String** | The document serial number. The structure of this number depends on the type and nationality of the document. |  [optional] |
|**expirationDate** | **LocalDate** | Expiration date of the document. Formatted as an ISO 8601 Date. |  [optional] |
|**country** | **String** | The ISO 3166-1 alpha-2 country code associated with the document. |  [optional] |



