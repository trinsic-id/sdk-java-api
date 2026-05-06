

# SingpassLoginProviderOutput

Exposed properties for the `singpass-login` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sub** | **String** | The Singpass subject identifier.              This is a public identifier which is globally unique across the Singpass system. |  [optional] |
|**accountType** | **String** | The Singpass account type for this user.              Possible values: - foreign (Singpass Foreign Account (SFA) holders) - standard (Singapore Citizens, Permanent Residents, or FIN holders) |  [optional] |
|**identityNumber** | **String** | The Unique Identifier Number (UINFIN) for the user.              The number can be either the National Registration Identity Card or Foreign Identification Number (NRIC/FIN). Follows the format @xxxxxxx#: - @ is the status of the holder.     - Singapore citizens and permanent residents born before 1 January 2000 are assigned the letter \&quot;S\&quot;.     - Singapore citizens and permanent residents born on or after 1 January 2000 are assigned the letter \&quot;T\&quot;.     - Foreigners issued with long-term passes before 1 January 2000 are assigned the letter \&quot;F\&quot;.     - Foreigners issued with long-term passes from 1 January 2000 to 31 December 2021 are assigned the letter \&quot;G\&quot;.     - Foreigners issued with long-term passes on or after 1 January 2022 are assigned the letter \&quot;M\&quot;. - xxxxxxx is seven digit serial number. - # is the checksum letter. |  [optional] |
|**countryOfIssuance** | **String** | The individual&#39;s identity country of issuance. |  [optional] |
|**name** | **String** | The individual&#39;s principal name. |  [optional] |
|**email** | **String** | The individual&#39;s email address. |  [optional] |
|**mobileNumber** | **String** | The individual&#39;s mobile number.              For Singpass Foreign Account (SFA) users, this will always be null. |  [optional] |



