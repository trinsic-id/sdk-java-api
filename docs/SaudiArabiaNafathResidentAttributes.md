

# SaudiArabiaNafathResidentAttributes


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**arabicFirstName** | **String** | Given name in Arabic.              Nafath always returns this in Arabic. romanizedFirstName is the English form, and the session locale does not change either name. |  [optional] |
|**arabicSecondName** | **String** | Second name in Arabic. Same script as arabicFirstName. |  [optional] |
|**arabicThirdName** | **String** | Third name in Arabic. Same script as arabicFirstName. |  [optional] |
|**arabicLastName** | **String** | Last name in Arabic. Same script as arabicFirstName. |  [optional] |
|**romanizedFirstName** | **String** | Given name in English.              Nafath always returns this in English, including when the session locale is Arabic. |  [optional] |
|**romanizedSecondName** | **String** | Second name in English. Same script as romanizedFirstName. |  [optional] |
|**romanizedThirdName** | **String** | Third name in English. Same script as romanizedFirstName. |  [optional] |
|**romanizedLastName** | **String** | Last name in English. Same script as romanizedFirstName. |  [optional] |
|**nationalityDescription** | **String** | English nationality name. |  [optional] |
|**dateOfBirthHijri** | **String** | Date of birth in the Hijri (Umm al-Qura) calendar, in YYYY-MM-DD format. |  [optional] |
|**iqamaIssueDateGregorian** | **LocalDate** | Date the Iqama was issued in the Gregorian calendar. |  [optional] |
|**iqamaIssueDateHijri** | **String** | Date the Iqama was issued in the Hijri calendar, in YYYY-MM-DD format. |  [optional] |
|**iqamaExpiryDateGregorian** | **LocalDate** | Date the Iqama expires in the Gregorian calendar. |  [optional] |
|**iqamaExpiryDateHijri** | **String** | Date the Iqama expires in the Hijri calendar, in YYYY-MM-DD format. |  [optional] |
|**iqamaVersionNumber** | **String** | Version number printed on the Iqama.              Represents the Iqama permit generation version. |  [optional] |
|**iqamaIssuePlace** | **String** | Name of the city or office that issued the Iqama, in Arabic.              The session locale does not change it. |  [optional] |
|**iqamaIssuePlaceCode** | **String** | Code for the office that issued the Iqama. |  [optional] |
|**occupationDescription** | **String** | Free-text occupation description. |  [optional] |
|**socialStatusCode** | **String** | Social-status (marital-status) code, from the Nafath socialStatusCode attribute. The numeric code is not unique on its own. The same code maps to different states depending on the value of the top-level sex field.              Code by sex: - 0, M: Single - 1, F: Single - 1, M: One wife - 2, F: Married - 2, M: Two wives - 3, F: Divorced - 3, M: Three wives - 4, F: Widow - 4, M: Four wives - 5, F: Pending divorced              Combinations not listed are not defined by Nafath. |  [optional] |
|**socialStatus** | **String** | Social status in uppercase English, for example MARRIED, from the Nafath socialStatus attribute.              Possible English values include: Single, Married, Divorced, Widow, Pending Divorced, One Wife, Two Wives, Three Wives, Four Wives. |  [optional] |
|**placeOfBirth** | **String** | Place of birth name. |  [optional] |
|**placeOfBirthCode** | **String** | Code for the place of birth. |  [optional] |
|**sponsorName** | **String** | Name of the entity sponsoring the Iqama, typically an employer. |  [optional] |
|**legalStatus** | **String** | Legal status. |  [optional] |
|**inOutIndicator** | **String** | Whether the resident is currently inside or outside Saudi Arabia based on their last recorded travel event.              Possible values include: - IN: most recent travel event was an entry into Saudi Arabia. - OUT: most recent travel event was an exit from Saudi Arabia. |  [optional] |
|**nationalAddresses** | [**List&lt;SaudiArabiaNafathAddress&gt;**](SaudiArabiaNafathAddress.md) | Registered Saudi national addresses.              Saudi Post (SPL) documents how to enter a national address on checkout and international forms: Line 1 is building number, unit number, and street name. Line 2 is the additional number and district. Then city and postal code. The country is always Saudi Arabia.              https://splonline.com.sa/en/door-step/ |  [optional] |



