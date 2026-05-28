

# IdemiaPreviewProviderOutput

Exposed properties for the `idemia-preview` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sub** | **String** | The OpenID Connect subject identifier for the verified individual. |  [optional] |
|**name** | **String** | The individual&#39;s full name. |  [optional] |
|**givenName** | **String** | The individual&#39;s given name. |  [optional] |
|**middleName** | **String** | The individual&#39;s middle name. |  [optional] |
|**familyName** | **String** | The individual&#39;s family name. |  [optional] |
|**nickname** | **String** | The individual&#39;s nickname. |  [optional] |
|**preferredUsername** | **String** | The individual&#39;s preferred username. |  [optional] |
|**profile** | **String** | The individual&#39;s profile URL. |  [optional] |
|**picture** | **String** | URL of the individual&#39;s profile picture. |  [optional] |
|**website** | **String** | The individual&#39;s website URL. |  [optional] |
|**birthdate** | **String** | The individual&#39;s date of birth in YYYY-MM-DD format. |  [optional] |
|**dateOfBirth** | **LocalDate** | The individual&#39;s date of birth as returned by legacy Idemia claim sets. |  [optional] |
|**gender** | **String** | The individual&#39;s gender. |  [optional] |
|**zoneinfo** | **String** | The individual&#39;s time zone. |  [optional] |
|**locale** | **String** | The individual&#39;s locale. |  [optional] |
|**preferredLanguage** | **String** | The individual&#39;s preferred language. |  [optional] |
|**updatedAt** | **Long** | Timestamp when the individual&#39;s profile data was last updated. |  [optional] |
|**email** | **String** | The individual&#39;s email address. |  [optional] |
|**emailVerified** | **Boolean** | Whether the individual&#39;s email address has been verified. |  [optional] |
|**phoneNumber** | **String** | The individual&#39;s phone number. |  [optional] |
|**phoneNumberVerified** | **Boolean** | Whether the individual&#39;s phone number has been verified. |  [optional] |
|**mobilePhoneNumber** | **String** | The individual&#39;s mobile phone number returned by the mobile_phone scope. |  [optional] |
|**address** | [**IdemiaPreviewProviderAddress**](IdemiaPreviewProviderAddress.md) | The individual&#39;s address. |  [optional] |
|**pcr** | **String** | Idemia pairwise relying-party correlation reference. |  [optional] |
|**midUid** | **String** | Idemia Mobile ID unique identifier. |  [optional] |
|**userName** | **String** | The user name returned by Idemia. |  [optional] |
|**inum** | **String** | Idemia client information identifier. |  [optional] |
|**role** | **String** | Permission role returned by Idemia. |  [optional] |
|**personalIdentityCode** | **String** | Personal identity code returned by Idemia when available. |  [optional] |
|**personIdentityCodeSample** | **String** | Sample personal identity code returned by Idemia when available. |  [optional] |



