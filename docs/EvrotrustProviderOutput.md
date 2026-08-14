

# EvrotrustProviderOutput

Exposed properties for the `evrotrust` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**names** | **String** | The full name of the individual. |  [optional] |
|**latinNames** | **String** | The full Latin-script name of the individual. |  [optional] |
|**firstName** | **String** | The given name of the individual. |  [optional] |
|**middleName** | **String** | The middle name of the individual. |  [optional] |
|**lastName** | **String** | The family name of the individual. |  [optional] |
|**firstNameLatin** | **String** | The Latin-script given name of the individual. |  [optional] |
|**middleNameLatin** | **String** | The Latin-script middle name of the individual. |  [optional] |
|**lastNameLatin** | **String** | The Latin-script family name of the individual. |  [optional] |
|**nationality** | **String** | The nationality label of the individual. |  [optional] |
|**nationalityCountry** | **String** | The nationality country of the individual. |  [optional] |
|**nationalityCountryCode** | **String** | The nationality country code of the individual.              Evrotrust uses ISO 3166-1 alpha-3 country codes. |  [optional] |
|**gender** | **String** | The gender label of the individual.              Known values in Evrotrust API docs: - Male: the individual is male. - Female: the individual is female. |  [optional] |
|**genderLatin** | **String** | The Latin-script gender label of the individual.              Known values in Evrotrust API docs: - Male: the individual is male. - Female: the individual is female. |  [optional] |
|**userGender** | **String** | The gender value from Evrotrust&#39;s user data object.              Evrotrust documents this separately from the identification metadata gender labels. Known values: - Male: the individual is male. - Female: the individual is female. |  [optional] |
|**dateOfBirth** | **LocalDate** | The date of birth of the individual in YYYY-MM-DD format. |  [optional] |
|**placeOfBirth** | **String** | The place of birth of the individual, if available. |  [optional] |
|**identificationNumber** | **String** | The national identification number of the individual.              The format depends on the verified document and issuing country. |  [optional] |
|**documentType** | **String** | The localized document type label of the identity document.              For Evrotrust&#39;s canonical document type code, see &#x60;docType&#x60;. |  [optional] |
|**docType** | **String** | The canonical Evrotrust document type code.              Known values: - IDcard: an identity card. - Passport: a passport. |  [optional] |
|**documentNumber** | **String** | The identity document number. |  [optional] |
|**documentIssuerName** | **String** | The name of the authority that issued the identity document. |  [optional] |
|**documentIssueDate** | **LocalDate** | The identity document issue date in YYYY-MM-DD format.              Evrotrust documents timestamp &#x60;0&#x60; for this field as no value; it is omitted from provider-specific output. |  [optional] |
|**documentValidDate** | **LocalDate** | The identity document expiration date in YYYY-MM-DD format.              Evrotrust documents timestamp &#x60;0&#x60; for this field as no value; it is omitted from provider-specific output. |  [optional] |
|**documentCountry** | **String** | The identity document issuing country. |  [optional] |
|**documentCountryCode** | **String** | The identity document issuing country code.              Evrotrust uses ISO 3166-1 alpha-3 country codes. |  [optional] |
|**address** | **String** | The full address of the individual. |  [optional] |
|**addressComponents** | [**EvrotrustAddressComponents**](EvrotrustAddressComponents.md) | The structured address fragments of the individual, if available. |  [optional] |
|**emailAddresses** | **List&lt;String&gt;** | The email addresses of the individual, if available. |  [optional] |
|**phoneNumbers** | **List&lt;String&gt;** | The phone numbers of the individual in E.164 format, if available. |  [optional] |
|**identificationReason** | **String** | The relying party-provided reason for requesting identification. |  [optional] |
|**identificationBefore** | **String** | The deadline or contextual value supplied for the identification request. |  [optional] |



