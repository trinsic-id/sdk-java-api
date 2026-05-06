

# ConnectIdProviderOutput

Exposed properties for the `australia-connect-id` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**birthdate** | **LocalDate** | The date of birth of an individual in YYYY-MM-DD format. |  [optional] |
|**givenName** | **String** | The given name of an individual. |  [optional] |
|**middleName** | **String** | The middle name of an individual. |  [optional] |
|**familyName** | **String** | The family/last name of an individual. |  [optional] |
|**phoneNumber** | **String** | The phone number of an individual. |  [optional] |
|**email** | **String** | The email of an individual. |  [optional] |
|**sub** | **String** | The OpenID Connect (OIDC) subject identifier (sub). |  [optional] |
|**ageVerification** | [**ConnectIdAgeVerification**](ConnectIdAgeVerification.md) | The age verification claim and whether the individual meets the age requirement. |  [optional] |
|**transaction** | **String** | The verification session&#39;s transaction number.              This is a unique identifier assigned to a single ConnectID transaction flow. It can be used for audit purposes or to flag fraudulent activity. |  [optional] |
|**address** | [**ConnectIdAddress**](ConnectIdAddress.md) | The address. |  [optional] |



