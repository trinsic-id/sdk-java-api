

# ItsmeBelgianIdentityCard


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**number** | **String** | The Belgian eID card number. This identifies the card document, not the person&#39;s Belgian National Register Number.              Availability by ID document issuing country: returned only for Belgian-issued ID documents.              Belgian citizen examples are 12 digits in the form &#x60;xxx-xxxxxxx-yy&#x60;; EU, EEA, and Swiss resident card examples can start with a letter followed by digits. |  [optional] |
|**issuingCountry** | **String** | The issuing country as an ISO 3166-1 alpha-2 country code.              Availability by ID document issuing country: always returned for all supported issuing countries. |  [optional] |
|**validityFrom** | **OffsetDateTime** | The identity card validity start date time.              Availability by ID document issuing country: best effort for Belgian-issued ID documents; not returned for other supported issuing countries. |  [optional] |
|**validityTo** | **OffsetDateTime** | The identity card validity end date time.              Availability by ID document issuing country: always returned for supported issuing countries except Belgium, where it is best effort. |  [optional] |
|**issuanceLocality** | **String** | The locality that issued the identity card.              Availability by ID document issuing country: best effort for Belgian-issued ID documents; not returned for other supported issuing countries. |  [optional] |



