

# VerimiProviderOutput

Exposed properties for the `verimi` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fullName** | **String** | The full name of the individual. |  [optional] |
|**dateOfBirth** | **LocalDate** | The date of birth of the individual. |  [optional] |
|**givenName** | **String** | The given name of the individual. |  [optional] |
|**middleName** | **String** | The middle name of the individual. |  [optional] |
|**familyName** | **String** | The family name of the individual. |  [optional] |
|**email** | **String** | The email address of the individual. |  [optional] |
|**emailVerified** | **Boolean** | Whether the email address has been verified by Verimi. |  [optional] |
|**phoneNumber** | **String** | The phone number of the individual in E.164 format. |  [optional] |
|**phoneNumberVerified** | **Boolean** | Whether the phone number has been verified by Verimi. |  [optional] |
|**gender** | **String** | The gender of the individual. |  [optional] |
|**zoneInformation** | **String** | The individual&#39;s time zone as an IANA Time Zone Database zoneinfo identifier. |  [optional] |
|**locale** | **String** | The selected language or locale of the individual as a BCP 47 language tag. |  [optional] |
|**citizenship** | **String** | The citizenship of the individual.              This is an ISO-3166-1 alpha-2 country code. |  [optional] |
|**placeOfBirth** | **String** | The place of birth of the individual. |  [optional] |
|**documentNumber** | **String** | The document number of the identity document used by the individual. |  [optional] |
|**documentType** | **String** | The identity document type.              Known values: - I: ID card. - P: Passport. |  [optional] |
|**documentExpirationDate** | **LocalDate** | The expiration date of the identity document. |  [optional] |
|**documentIssueDate** | **LocalDate** | The issue date of the identity document. |  [optional] |
|**documentIssuingAuthority** | **String** | The authority that issued the identity document. |  [optional] |
|**verificationMethod** | **String** | The verification method used to prove the individual&#39;s identity. |  [optional] |
|**verificationDate** | **LocalDate** | The date when the individual proved their identity with Verimi. |  [optional] |
|**levelOfAssurance** | **String** | The level of assurance for the verification.              Known values: - Low: The individual has self-asserted their identity. - Substantial: The individual has completed identity proofing and strong authentication. - High: The individual has completed identity proofing with stronger cryptographic authentication requirements. |  [optional] |
|**authenticationMethod** | **String** | The authentication method for the completed identification.              Known values: - email - loa.dipp.default - loa.dipp.2fa - idcard |  [optional] |
|**pseudonym** | **String** | The pseudonymous identifier.              For German eID, this is the restricted identifier (rID), scoped to the relying-party sector. |  [optional] |
|**address** | [**VerimiAddressOutput**](VerimiAddressOutput.md) | The individual&#39;s structured address. |  [optional] |
|**issuingCountry** | **String** | The ISO 3166-1 alpha-2 country code for the country that issued the identity document. |  [optional] |



