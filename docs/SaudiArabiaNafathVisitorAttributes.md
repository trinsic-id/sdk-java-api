

# SaudiArabiaNafathVisitorAttributes


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**loginType** | **String** | Credential the visitor used to log in to Nafath.              Possible values: - VisaNumber: the visitor authenticated with the visa number printed on their visa   document. - BorderNumber: the visitor authenticated with their border number (raqam al-hudud), the   ten-digit identifier the General Directorate of Passports (Jawazat) assigns to a   foreign national on entry into Saudi Arabia, used as their entry-linked identifier   before any residency is issued. |  [optional] |
|**firstName** | **String** | First name in English.              Nafath describes firstName, secondName, thirdName, and lastName as English. translatedFirstName is the Arabic form. The session locale does not change either name. |  [optional] |
|**secondName** | **String** | Second name in English. Same script as firstName. |  [optional] |
|**thirdName** | **String** | Third name, from the Nafath thirdName attribute. See firstName for the script. |  [optional] |
|**lastName** | **String** | Last name, from the Nafath lastName attribute. See firstName for the script. |  [optional] |
|**translatedFirstName** | **String** | First name in Arabic, from the Nafath translatedFirstName attribute.              Nafath&#39;s descriptions of firstName, secondName, thirdName, and lastName call those fields English, so the translated names are treated as Arabic for both visa-number and border-number logins. The session locale does not change either script. |  [optional] |
|**translatedSecondName** | **String** | Second name in Arabic. Same script as translatedFirstName. |  [optional] |
|**translatedThirdName** | **String** | Third name in Arabic. Same script as translatedFirstName. |  [optional] |
|**translatedLastName** | **String** | Last name in Arabic. Same script as translatedFirstName. |  [optional] |
|**nationalityDescription** | **String** | English nationality name, from the Nafath nationalityDesc attribute. |  [optional] |
|**dateOfBirthHijri** | **String** | Date of birth in the Hijri (Umm al-Qura) calendar, in YYYY-MM-DD format, from the Nafath birthhDate attribute. Only returned for visa-number logins; the appendix defines no Hijri date of birth for border-number logins.              Nafath&#39;s examples also use DD-MM-YYYY and YYYY/MM/DD; Trinsic reorders those to YYYY-MM-DD and passes any other format through unchanged. |  [optional] |
|**visaNumber** | **String** | Visa number, from the Nafath visaNumber attribute. Can contain letters as well as digits. |  [optional] |
|**visaDurationDays** | **Integer** | Count of days from visa issue to visa expiry, parsed from the Nafath duration attribute. Null when duration is absent or not a valid integer. |  [optional] |
|**visaIssueDate** | **LocalDate** | Date the visa was issued, from the Nafath visaIssueDate attribute. |  [optional] |
|**visaExpiryDate** | **LocalDate** | Final date the visitor is permitted to enter Saudi Arabia, from the Nafath visaExpiryDate attribute. |  [optional] |
|**finalDepartureDate** | **LocalDate** | Last day the visitor may legally remain in Saudi Arabia, from the Nafath finalDepartureDate attribute. |  [optional] |
|**numberOfEntriesCode** | **String** | Number-of-entries code, from the Nafath numberOfEntriesCode attribute.              Known values: - 1: Single entry - 9: Multiple entry |  [optional] |
|**numberOfEntriesDescriptionArabic** | **String** | Arabic description of the entries the visa allows, from the Nafath numberOfEntriesDescAr attribute. |  [optional] |
|**visaTypeCode** | **String** | Visa type code, from the Nafath visaTypeCode attribute. The appendix publishes no lookup table; the sandbox returns BUS for a business visit visa. |  [optional] |
|**visaTypeDescriptionArabic** | **String** | Arabic visa type description, from the Nafath visaTypeDescAr attribute. |  [optional] |
|**visaTypeDescriptionEnglish** | **String** | English visa type description, from the Nafath visaTypeDescEn attribute. |  [optional] |
|**passportIssueDate** | **LocalDate** | Date the visitor&#39;s passport was issued, from the Nafath passportIssueDate attribute. |  [optional] |
|**passportExpiryDate** | **LocalDate** | Date the visitor&#39;s passport expires, from the Nafath passportExpiryDate attribute. |  [optional] |
|**occupationDescriptionArabic** | **String** | Arabic occupation description, from the Nafath occupationDescAr attribute. |  [optional] |
|**occupationDescriptionEnglish** | **String** | English occupation description, from the Nafath occupationDescEn attribute. |  [optional] |
|**birthCountryArabic** | **String** | Arabic name of the visitor&#39;s birth country, from the Nafath birthCountryDescAr attribute. |  [optional] |
|**birthCountryEnglish** | **String** | English name of the visitor&#39;s birth country, from the Nafath birthCountryDescEn attribute. |  [optional] |
|**entryDate** | **LocalDate** | Date the visitor entered Saudi Arabia, from the Nafath entryDate attribute. Only returned for border-number logins. |  [optional] |



