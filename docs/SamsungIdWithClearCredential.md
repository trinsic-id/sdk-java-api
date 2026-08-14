

# SamsungIdWithClearCredential

A Samsung ID with CLEAR credential, retrieved from Samsung Wallet.              This is a passport-derived digital credential issued by Samsung in partnership with CLEAR.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**givenName** | **String** | First name(s), other name(s), or secondary identifier of the individual. |  [optional] |
|**familyName** | **String** | Last name, surname, or primary identifier of the individual. |  [optional] |
|**dateOfBirth** | **LocalDate** | The date of birth of the individual. |  [optional] |
|**issueDate** | **LocalDate** | The date the Samsung ID was issued.              This is not the issue date of the passport used to create the Samsung ID; see &#x60;originalDocumentIssueDate&#x60;. |  [optional] |
|**expiryDate** | **LocalDate** | The date the Samsung ID expires.              This is not necessarily the expiry date of the passport used to create the Samsung ID; see &#x60;originalDocumentExpiryDate&#x60;. |  [optional] |
|**originalDocumentIssueDate** | **LocalDate** | Issue date of the underlying passport used to create the Samsung ID. |  [optional] |
|**originalDocumentExpiryDate** | **LocalDate** | Expiry date of the underlying passport used to create the Samsung ID. |  [optional] |
|**documentNumber** | **String** | The document number of the underlying passport used to create the Samsung ID. |  [optional] |
|**issuingAuthority** | **String** | Identifier of Samsung as the issuing authority of the Samsung ID credential.              This always begins with \&quot;XS-\&quot;. |  [optional] |
|**sex** | **Integer** | The individual&#39;s sex as an ISO/IEC 5218 code.              Possible values: - 0: Unknown - 1: Male - 2: Female - 9: Not Applicable |  [optional] |
|**dhsCompliance** | **Boolean** | Whether the credential is compliant with REAL ID.              This is always &#x60;true&#x60; for Samsung ID with CLEAR credentials. |  [optional] |
|**ageInYears** | **Integer** | Age of the individual in years. |  [optional] |
|**ageBirthYear** | **Integer** | Year of birth of the individual. |  [optional] |
|**ageOver** | [**List&lt;AgeOverOutput&gt;**](AgeOverOutput.md) | Processed age-over claims returned by the credential. |  [optional] |



