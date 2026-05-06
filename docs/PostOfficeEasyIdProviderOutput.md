

# PostOfficeEasyIdProviderOutput

Exposed properties for the `post-office-easyid` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rememberMeId** | **UUID** | A Yoti-generated unique ID for this individual, consistent across repeat shares and different for each Relying Party. |  [optional] |
|**email** | **String** | The email address of the individual |  [optional] |
|**givenName** | **String** | The given name of the individual. This can correspond to first and middle names in English. |  [optional] |
|**familyName** | **String** | The family name of the individual |  [optional] |
|**fullName** | **String** | Full name of the individual which is composed of the given and family name. Unverified full name may be safe to use. For example, Aadhaar card provides full name, but due to certain limitations of verifying Aadhaar, Yoti is unable to verify this property so it is listed as \&quot;unverified\&quot;. |  [optional] |
|**dateOfBirth** | **LocalDate** | The date of birth of the individual. Unverified date of birth may be safe to use. For example, Aadhaar card provides date of birth, but due to certain limitations of verifying Aadhaar, Yoti is unable to verify this property so it is listed as \&quot;unverified\&quot;. |  [optional] |
|**gender** | **String** | The gender of the individual. Depending on the source or country, gender may not be verified. This is a setting that can be configured while setting up scopes.              Unverified gender may be safe to use. For example, Aadhaar card provides gender, but due to certain limitations of verifying Aadhaar, Yoti is unable to verify this property so it is listed as \&quot;unverified\&quot;. In some countries Possible values: - \&quot;MALE\&quot; - \&quot;FEMALE\&quot; - \&quot;TRANSGENDER\&quot; - \&quot;OTHER\&quot; |  [optional] |
|**nationality** | **String** | The nationality of the individual as a ISO alpha-3 code |  [optional] |
|**mobileNumber** | **String** | The mobile phone number of the individual. This number was verified with a one time password (OTP) during the individual&#39;s registration with Yoti. In some cases, Yoti may do additional checks against its sources to confirm the individual&#39;s identity. |  [optional] |
|**structuredPostalAddress** | [**YotiStructuredPostalAddress**](YotiStructuredPostalAddress.md) | A structured postal address for the individual that comes from the underlying document or can be manually added. In the case of being manually added, the address is considered \&quot;unverified\&quot;. Unverified addresses may be safe to use. For example, Aadhaar card provides an address, but due to certain limitations of verifying Aadhaar, Yoti is unable to verify this property so it is listed as \&quot;unverified\&quot;. |  [optional] |
|**postalAddress** | **String** | The whole address for the individual that comes from the underlying document or can be manually added. In the case of being manually added, the address is considered \&quot;unverified\&quot;. The format of this will be different for each country. Refer to &#x60;StructuredPostalAddress&#x60; for a detailed version of the address. |  [optional] |
|**documentDetails** | [**YotiDocumentDetails**](YotiDocumentDetails.md) | The details of the underlying document used to help create the Yoti credential |  [optional] |



