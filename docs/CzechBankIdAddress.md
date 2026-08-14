

# CzechBankIdAddress


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | The address type.              Possible values are: - PERMANENT_RESIDENCE - SECONDARY_RESIDENCE - UNKNOWN |  [optional] |
|**street** | **String** | The street name.              This is usually present, but unused for small villages. |  [optional] |
|**buildingApartment** | **String** | The address land registry number.              This is usually present, but unused for small houses. |  [optional] |
|**streetNumber** | **String** | The additional address house number.              This is usually present, but unused for small villages. |  [optional] |
|**evidenceNumber** | **String** | The house evidence number.              This is rarely used in suburbs. An evidence number is used for addresses that are residential, temporary or non-residential buildings, e.g. cabins, garages etc. |  [optional] |
|**city** | **String** | The city name. |  [optional] |
|**cityArea** | **String** | The city area name.              This is usually present. |  [optional] |
|**zipcode** | **String** | The zip of the address. |  [optional] |
|**country** | **String** | The country code in ISO 3166-1 alpha-2 format. |  [optional] |
|**ruianReference** | **String** | The address identifier in the Czech RUIAN address register.              RUIAN is the Czech Register of Territorial Identification, Addresses, and Real Estate. This value identifies the address record in that register and can be used to reconcile the address against Czech government address data. |  [optional] |



