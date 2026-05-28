

# AppleWalletDigitalIdBirthDate

A date of birth field as encoded in an Apple Wallet Digital ID credential, possibly with an \"approximate mask\" indicating uncertain digits.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dateOfBirth** | **LocalDate** | The encoded date of birth. |  |
|**approximateMask** | **String** | An 8-character mask of &#x60;1&#x60;s and &#x60;0&#x60;s, where a &#x60;1&#x60; indicates that the corresponding digit in the birth date (formatted as YYYYMMDD) is uncertain or unknown.              For example, a mask of \&quot;00000011\&quot; indicates that the day-of-month on which the individual was born is not certain. |  [optional] |



