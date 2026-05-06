

# CzechMojeIdProviderOutput

Exposed properties for the `czech-moje-id` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**subjectIdentifier** | **String** | The subject identifier (sub) of the verified individual&#39;s MojeID account.              This is a unique identifier that represents the individual within the MojeID system. |  [optional] |
|**name** | **String** | The individual&#39;s full name. |  [optional] |
|**givenName** | **String** | The individual&#39;s given (first) name. |  [optional] |
|**familyName** | **String** | The individual&#39;s family (last) name. |  [optional] |
|**nickname** | **String** | The individual&#39;s nickname. |  [optional] |
|**email** | **String** | The individual&#39;s email address. |  [optional] |
|**emailVerified** | **Boolean** | Whether the individual&#39;s email address has been verified by MojeID. (Verification email and link clicked) |  [optional] |
|**phoneNumber** | **String** | The individual&#39;s phone number. |  [optional] |
|**phoneNumberVerified** | **Boolean** | An individual&#39;s phone number has been verified by MojeID. (SMS verification) |  [optional] |
|**dateOfBirth** | **LocalDate** | The individual&#39;s date of birth.              Formatted as an ISO 8601 Date. |  [optional] |
|**gender** | **String** | The individual&#39;s gender as reported by MojeID. |  [optional] |
|**idCardNumber** | **String** | The individual&#39;s Czech ID card number. |  [optional] |
|**passportNumber** | **String** | The individual&#39;s Czech passport number. |  [optional] |
|**socialSecurityNumber** | **String** | The individual&#39;s Ministry of Labour and Social Affairs identifier (Czech social security equivalent). |  [optional] |
|**isAdult** | **Boolean** | The individual is an adult (18 years or older). |  [optional] |
|**accountValidated** | **Boolean** | The MojeID account has been validated.              A validated account indicates the individual&#39;s identity has been verified to a higher level of assurance within the MojeID system. |  [optional] |
|**isdsId** | **String** | The individual&#39;s ISDS identifier (Informační systém datových schránek — Czech data box system), used for official electronic communication with Czech government authorities. |  [optional] |
|**isStudent** | **Boolean** | Whether the individual is a student. |  [optional] |
|**companyRegistrationNumber** | **String** | The individual&#39;s or organization&#39;s Czech Registration ID (ICO), the Czech company registration number. |  [optional] |
|**taxIdentificationNumber** | **String** | The individual&#39;s or organization&#39;s Danove Identifikacni Cislo (DIC), the Czech tax identification number. |  [optional] |
|**niaVerified** | **Boolean** | The individual&#39;s identity has been verified through the Czech National Identity Authority (NIA).              NIA verification indicates a higher level of identity assurance, typically involving government-issued credentials verified through the Czech eGovernment infrastructure. |  [optional] |
|**transactionId** | **String** | Unique login transaction identifier |  [optional] |
|**homeAddress** | [**CzechMojeIdAddressOutput**](CzechMojeIdAddressOutput.md) | The individual&#39;s home (default) address, from the &#x60;mojeid_address_def&#x60; claim. |  [optional] |
|**billingAddress** | [**CzechMojeIdAddressOutput**](CzechMojeIdAddressOutput.md) | The individual&#39;s billing address, from the &#x60;mojeid_address_bill&#x60; claim. |  [optional] |
|**shippingAddress** | [**CzechMojeIdAddressOutput**](CzechMojeIdAddressOutput.md) | The individual&#39;s shipping address, from the &#x60;mojeid_address_ship&#x60; claim. |  [optional] |



