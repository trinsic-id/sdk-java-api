

# SaudiArabiaNafathCitizenAttributes


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**arabicFirstName** | **String** | Given name in Arabic.              Nafath always returns this in Arabic. romanizedFirstName is the English form, and the session locale does not change either name. |  [optional] |
|**arabicFatherName** | **String** | Father&#39;s given name in Arabic. Same script as arabicFirstName. |  [optional] |
|**arabicGrandFatherName** | **String** | Grandfather&#39;s given name in Arabic. Same script as arabicFirstName. |  [optional] |
|**arabicFamilyName** | **String** | Family name in Arabic. Same script as arabicFirstName. |  [optional] |
|**romanizedFirstName** | **String** | Given name in English.              Nafath always returns this in English, including when the session locale is Arabic. |  [optional] |
|**romanizedSecondName** | **String** | Father&#39;s given name in English. Same script as romanizedFirstName. |  [optional] |
|**romanizedThirdName** | **String** | Grandfather&#39;s given name in English. Same script as romanizedFirstName. |  [optional] |
|**romanizedLastName** | **String** | Family name in English. Same script as romanizedFirstName. |  [optional] |
|**dateOfBirthHijri** | **String** | Date of birth in the Hijri (Umm al-Qura) calendar, in YYYY-MM-DD format. |  [optional] |
|**idIssueDateGregorian** | **LocalDate** | Date the national ID card was issued in the Gregorian calendar. |  [optional] |
|**idIssueDateHijri** | **String** | Date the national ID card was issued in the Hijri calendar, in YYYY-MM-DD format. |  [optional] |
|**idExpiryDateGregorian** | **LocalDate** | Date the national ID card expires in the Gregorian calendar. |  [optional] |
|**idExpiryDateHijri** | **String** | Date the national ID card expires in the Hijri calendar, in YYYY-MM-DD format. |  [optional] |
|**idVersionNumber** | **String** | Version number printed on the national ID card.              Represents the generation of national ID card this document was issued in. |  [optional] |
|**idIssuePlace** | **String** | City or office where the national ID card was issued, in Arabic.              The session locale does not change it. |  [optional] |
|**socialStatusCode** | **String** | Social-status (marital-status) code, from the Nafath socialStatusCode attribute. The numeric code is not unique on its own. The same code maps to different states depending on the value of the top-level sex field.              Code by sex: - 0, M: Single - 1, F: Single - 1, M: One wife - 2, F: Married - 2, M: Two wives - 3, F: Divorced - 3, M: Three wives - 4, F: Widow - 4, M: Four wives - 5, F: Pending divorced              Combinations not listed are not defined by Nafath. |  [optional] |
|**socialStatus** | **String** | Social status description in Arabic, from the Nafath socialStatusDesc attribute.              The session locale does not change it. socialStatusCode is the separate numeric code. |  [optional] |
|**dependentCount** | **Integer** | Number of current dependents. |  [optional] |
|**placeOfBirth** | **String** | Place of birth in Arabic.              The session locale does not change it. |  [optional] |
|**lastTravelExitDateGregorian** | **LocalDate** | Most recent travel exit date in the Gregorian calendar. |  [optional] |
|**lastTravelExitDateHijri** | **String** | Most recent travel exit date in the Hijri calendar, in YYYY-MM-DD format. |  [optional] |
|**lastTravelEntryDateGregorian** | **LocalDate** | Most recent travel entry date in the Gregorian calendar. |  [optional] |
|**lastTravelEntryDateHijri** | **String** | Most recent travel entry date in the Hijri calendar, in YYYY-MM-DD format. |  [optional] |
|**isMinor** | **Boolean** | True when the citizen is a minor. |  [optional] |
|**headOfHousehold** | [**SaudiArabiaNafathHeadOfHousehold**](SaudiArabiaNafathHeadOfHousehold.md) | Head of household information, intended for minor citizen workflows such as guardian consent for opening a bank account.              The sandbox also returns it for adults, so it is included whenever present. |  [optional] |
|**nationalAddresses** | [**List&lt;SaudiArabiaNafathAddress&gt;**](SaudiArabiaNafathAddress.md) | Registered Saudi national addresses, as structured fields.              Saudi Post (SPL) documents how to enter a national address on checkout and international forms: Line 1 is building number, unit number, and street name. Line 2 is the additional number and district. Then city and postal code.              The country is always Saudi Arabia because Nafath only ever returns Saudi national addresses.              https://splonline.com.sa/en/door-step/ |  [optional] |



