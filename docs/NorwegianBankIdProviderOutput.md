

# NorwegianBankIdProviderOutput

Exposed properties for the `norway-bankid` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fullName** | **String** | The full name of the individual. |  [optional] |
|**dateOfBirth** | **LocalDate** | The date of birth of the individual. |  [optional] |
|**personalIdentifier** | **String** | The personal identifier for Norwegian BankID.              This uniquely identifies the user in the Norwegian BankID system and is considered a stable identifier to use. |  [optional] |
|**nationalIdentityNumber** | **String** | The 11-digit Norwegian National Identity Number (fødselsnummer) of the verified individual.              This is in the format DDMMYYZZZCC, where: - DDMMYY is the date of birth (In some cases, this is not the date of birth due to no available identity numbers for some dates - ZZZ is an individual number, indicating gender - CC is a checksum character              If ZZZ is even, the individual is female. If ZZZ is odd, the individual is male. |  [optional] |
|**givenName** | **String** | The given name of the individual. |  [optional] |
|**familyName** | **String** | The family name of the individual. |  [optional] |
|**levelOfAssurance** | **String** | The level of assurance (LOA) for the verification.              The LOA refers to the degree of confidence in the claimed identity of a person. The European Digital Identity Framework (EUDI) measures the confidence of the digital identity&#39;s verification and authentication strength by a set of requirements for different levels. To learn more, see: https://ec.europa.eu/digital-building-blocks/sites/spaces/DIGITAL/pages/467110081/eIDAS+Levels+of+Assurance              Possible values: - Low: The user has self asserted their identity and multifactor authentication is not required. - Substantial: The user has performed either a remote or in-person identity verification and multifactor authentication is required. - High: The user has performed an in-person identity proofing with an authorized representative and has strong cryptographic authentication requirements such as using a smart card. |  [optional] |
|**authenticationMethod** | **String** | The authentication method used by the individual.              Possible values: - urn:bankid:bis - BankID with Biometrics - urn:bankid:bid - Standard BankID with High Assurance |  [optional] |



