

# GoogleWalletIdPassCredential

A Google Wallet ID Pass credential, with document type `com.google.wallet.idcard.1`.              This is a passport-derived digital credential issued by Google.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**givenName** | **String** | First name(s), other name(s), or secondary identifier of the individual. |  [optional] |
|**familyName** | **String** | Last name, surname, or primary identifier of the individual. |  [optional] |
|**dateOfBirth** | **LocalDate** | The date of birth of the individual. |  [optional] |
|**issueDate** | **LocalDate** | The date when the ID Pass was issued.              This is not the same as the issue date of the underlying physical passport used to create the ID Pass. |  [optional] |
|**expiryDate** | **LocalDate** | The date when the ID Pass expires.              This is not necessarily the same as the expiration date of the underlying physical passport used to create the ID Pass. |  [optional] |
|**issuingCountry** | **String** | Alpha-2 country code of the issuing authority&#39;s country or territory. |  [optional] |
|**issuingAuthority** | **String** | Name or identifier of the mDL issuing authority.              This field&#39;s contents are arbitrary; it has no guaranteed format. |  [optional] |
|**nationality** | **String** | Nationality of the individual as an ISO 3166-1 alpha-2 country code. |  [optional] |
|**documentNumber** | **String** | The number of the underlying passport used to create the ID Pass. |  [optional] |
|**sex** | **Integer** | The individual&#39;s sex as an ISO/IEC 5218 code.              Possible values: - 0: Unknown - 1: Male - 2: Female - 9: Not Applicable |  [optional] |
|**ageOver** | [**List&lt;AgeOverOutput&gt;**](AgeOverOutput.md) | Processed age-over claims returned by the ID Pass. |  [optional] |
|**issueDateOfUnderlyingDocument** | **LocalDate** | Date when the underlying passport backing this digital credential was originally issued. |  [optional] |



