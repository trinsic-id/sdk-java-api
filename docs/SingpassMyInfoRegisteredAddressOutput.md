

# SingpassMyInfoRegisteredAddressOutput

The structured MyInfo registered address payload.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | The address type.              Possible values: - SG (Structured Address) - UNFORMATTED              Structured addresses most likely will be a Singapore address. Unformatted are typically a non-Singapore address, however it might still be an unformatted Singapore address. |  [optional] |
|**block** | **String** | The block number.              This will only be present if the type is \&quot;SG\&quot; |  [optional] |
|**building** | **String** | The building name.              This will only be present if the type is \&quot;SG\&quot; |  [optional] |
|**floor** | **String** | The floor number.              This will only be present if the type is \&quot;SG\&quot; |  [optional] |
|**unit** | **String** | The unit number.              This will only be present if the type is \&quot;SG\&quot; |  [optional] |
|**street** | **String** | The street name.              This will only be present if the type is \&quot;SG\&quot; |  [optional] |
|**postal** | **String** | The postal code.              This will only be present if the type is \&quot;SG\&quot; |  [optional] |
|**country** | **String** | The ISO-2 country code and description for the address.              This will only be present if the type is \&quot;SG\&quot; |  [optional] |
|**line1** | **String** | The first line of the unformatted address.              This will only be present if the type is \&quot;UNFORMATTED\&quot; |  [optional] |
|**line2** | **String** | The second line of the unformatted address.              This will only be present if the type is \&quot;UNFORMATTED\&quot; |  [optional] |



