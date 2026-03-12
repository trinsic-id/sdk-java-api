

# FinnishTrustNetworkProviderOutput

Exposed properties for the `finnish-trust-network` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fullName** | **String** | The full name of the individual. |  [optional] |
|**dateOfBirth** | **LocalDate** | The date of birth of the individual. |  [optional] |
|**personalIdentificationCode** | **String** | The 11-digit Finnish Personal Identification Code (Henkilötunnus) of the verified individual.              This is in the format DDMMYYCZZZQ, where: - DDMMYY is the date of birth - C is a symbol which determines the century of birth - ZZZ is an individual number, indicating gender - Q is a checksum character              If ZZZ is even, the individual is female. If ZZZ is odd, the individual is male.              If C is &#39;+&#39;, the individual was born in the 19th century (1800-1899). If C is &#39;-&#39;, &#39;U&#39;, &#39;V&#39;, &#39;W&#39;, &#39;X&#39;, or &#39;Y&#39;, the individual was born in the 20th century (1900-1999). If C is &#39;A&#39;, &#39;B&#39;, &#39;C&#39;, &#39;D&#39;, &#39;E&#39;, or &#39;F&#39;, the individual was born in the 21st century (2000-2099). |  [optional] |
|**uniqueIdentificationNumber** | **String** | The 9-digit Finnish Unique Identification Number (FINUID, or sähköinen asiointitunnus SATU) of the verified individual. This number is typically used for online transactions and unlike the Finnish Personal Identification Code, does not reveal personal information such as birthdate.              The first 8 digits are randomly generated and the last character is a check control. |  [optional] |
|**givenName** | **String** | The given name of the individual. |  [optional] |
|**familyName** | **String** | The family name of the individual. |  [optional] |
|**levelOfAssurance** | **String** | The level of assurance (LOA) for the verification.              The LOA refers to the degree of confidence in the claimed identity of a person. The European Digital Identity Framework (EUDI) measures the confidence of the digital identity&#39;s verification and authentication strength by a set of requirements for different levels. To learn more, see: https://ec.europa.eu/digital-building-blocks/sites/spaces/DIGITAL/pages/467110081/eIDAS+Levels+of+Assurance              Possible values: - Low: The user has self asserted their identity and multifactor authentication is not required. - Substantial: The user has performed either a remote or in-person identity verification and multifactor authentication is required. - High: The user has performed an in-person identity proofing with an authorized representative and has strong cryptographic authentication requirements such as using a smart card. |  [optional] |
|**bank** | **String** | The bank used to perform the identification for the verified individual. |  [optional] |
|**phoneNumber** | **String** | The phone number of the verified individual.              This is only returned if the user authenticated with MobileID (Mobiilivarmenne). |  [optional] |
|**organizationName** | **String** | The organization name that the individual is associated with.              This is returned for requests that contain the organization scope. |  [optional] |
|**vatNumber** | **String** | The VAT number of the organization that the individual is associated with.              This is returned for requests that contain the organization scope. |  [optional] |



