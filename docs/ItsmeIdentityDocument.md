

# ItsmeIdentityDocument


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**serialNumber** | **String** | The identity document serial number.              Availability by ID document issuing country: always returned for all supported issuing countries. |  [optional] |
|**typeCode** | **String** | The identity document type code.              Availability by ID document issuing country: always returned for all supported issuing countries.              itsme documents this as a 1 or 2 character ICAO code. - Identity cards start with &#x60;I&#x60; - passports start with &#x60;P&#x60; |  [optional] |
|**issuingCountry** | **String** | The issuing country as an ISO 3166-1 alpha-2 country code.              Availability by ID document issuing country: always returned for all supported issuing countries. |  [optional] |
|**validityFrom** | **OffsetDateTime** | The identity document validity start date time.              Availability by ID document issuing country: best effort for Belgian-issued ID documents; not returned for other supported issuing countries. |  [optional] |
|**validityTo** | **OffsetDateTime** | The identity document validity end date time.              Availability by ID document issuing country: always returned for supported issuing countries except Belgium, where it is best effort. |  [optional] |



