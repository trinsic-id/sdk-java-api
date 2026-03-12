

# FrejaProviderOutput

Exposed properties for the `freja` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The individual&#39;s full name. |  [optional] |
|**givenName** | **String** | The individual&#39;s first name. |  [optional] |
|**familyName** | **String** | The individual&#39;s last name. |  [optional] |
|**dateOfBirth** | **LocalDate** | The date of birth of the individual.              Formatted as an ISO 8601 Date. |  [optional] |
|**email** | **String** | The individual&#39;s primary email address within Freja. |  [optional] |
|**emailVerified** | **Boolean** | A boolean which indicates whether the individual&#39;s primary email address has been verified by Freja. |  [optional] |
|**allEmailAddresses** | **List&lt;String&gt;** | An array of all associated email addresses of the individual. |  [optional] |
|**primaryPhysicalAddress** | [**OutputFrejaAddress**](OutputFrejaAddress.md) | The individual&#39;s primary address on file. |  [optional] |
|**allPhysicalAddresses** | [**List&lt;OutputFrejaAddress&gt;**](OutputFrejaAddress.md) | A list of all associated addresses of the individual. |  [optional] |
|**age** | **Integer** | The individual&#39;s age in years. |  [optional] |
|**phoneNumber** | **String** | The individual&#39;s phone number in the E.164 format. |  [optional] |
|**phoneNumberVerified** | **Boolean** | Whether the individual&#39;s phone number has been verified by Freja. |  [optional] |
|**personalIdentityNumber** | **String** | The individual&#39;s personal identity number. The actual value of this field depends on the country of origin used to create the Freja credential. It is typically a Social Security Number, National Identification Number, or equivalent personal identifier. |  [optional] |
|**country** | **String** | The ISO 3166-1 alpha-2 country code associated with the individual&#39;s country of origin. |  [optional] |
|**document** | [**OutputFrejaDocument**](OutputFrejaDocument.md) | The underlying document, such as a passport, used to create the Freja credential. |  [optional] |
|**registrationLevel** | **String** | The Freja registration level associated with this individual. This can be BASIC, EXTENDED, or PLUS. * BASIC: Individual has a registered account with Freja. * EXTENDED: Individual has an official identity document verified by Freja. * PLUS: Individual has undergone in-person verification with Freja. |  [optional] |
|**relyingPartyUserId** | **String** | The relying party user identifier for this individual. This is an identifier specific to the individual and the relying party (your service). |  [optional] |
|**transactionReference** | **String** | The Freja transaction reference for this verification. This is an identifier specific to the verification transaction. |  [optional] |



