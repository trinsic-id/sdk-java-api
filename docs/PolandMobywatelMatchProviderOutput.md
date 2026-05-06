

# PolandMobywatelMatchProviderOutput

Exposed properties for the `poland-mobywatel-match` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**givenName** | **String** | Given name as provided by the individual. |  [optional] |
|**familyName** | **String** | Current legal family name (nazwisko) as provided by the individual.              In Poland the current legal family name (nazwisko) is a separate concept from your birth family name (nazwisko rodowe). They often match, but they can differ after marriage, adoption, or a court-ordered change. |  [optional] |
|**nationality** | **String** | Nationality as provided by the individual. |  [optional] |
|**dateOfBirth** | **LocalDate** | Date of birth as provided by the individual. |  [optional] |
|**personalNumber** | **String** | Personal number (PESEL) as provided by the individual. |  [optional] |
|**expirationDate** | **LocalDate** | Expiration date as provided by the individual. |  [optional] |
|**isMatchForGivenNames** | **Boolean** | True when the provided given name matches mObywatel wallet data. |  [optional] |
|**isMatchForFamilyName** | **Boolean** | True when the provided family name matches mObywatel wallet data. |  [optional] |
|**isMatchForExpirationDate** | **Boolean** | True when the provided document expiration date matches mObywatel wallet data. |  [optional] |
|**isMatchForPersonalNumber** | **Boolean** | True when the provided personal number (PESEL) matches mObywatel wallet data. |  [optional] |
|**isMatchForNationality** | **Boolean** | True when the provided nationality matches mObywatel wallet data. |  [optional] |
|**isMatchForBirthDate** | **Boolean** | True when the provided birth date matches mObywatel wallet data. |  [optional] |
|**isMatchForSelfie** | **Boolean** | True when the face in the provided selfie matches the face in the document photo in mObywatel wallet. |  [optional] |
|**isNotTooSimilarToDocumentPortrait** | **Boolean** | True when the uploaded face and wallet portrait are not suspiciously identical. Often fails when using a document photo as a selfie. |  [optional] |
|**isNotDifferentFace** | **Boolean** | True when no other person&#39;s face has been used to verify this document (good). False when another person&#39;s face has been used to verify this document (possible fraud). |  [optional] |
|**isSingleFace** | **Boolean** | True when exactly one face was detected on the selfie image (good). False when multiple faces were detected on the selfie image (ambiguous result). |  [optional] |
|**isOverAge** | **Boolean** | True when the individual&#39;s age in digital wallet is over 18. |  [optional] |
|**isAgeEstimationMatchForSelfie** | **Boolean** | True when the individual&#39;s age estimated from the selfie matches the individual&#39;s age in digital wallet. |  [optional] |
|**ageEstimationThreshold** | **Integer** | Number of years allowed between the individual&#39;s age in digital wallet and the individual&#39;s age estimated from the selfie. |  [optional] |
|**estimatedAgeFromSelfie** | **Integer** | Estimated age from the selfie, if provided. |  [optional] |



