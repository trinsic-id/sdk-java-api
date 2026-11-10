

# SaudiArabiaNafathProviderOutput

Exposed properties for the `saudi-arabia-nafath` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nationalIdentityNumber** | **String** | Saudi Arabia national identity number used to authenticate the individual with Nafath.              Nafath supports three user types and the leading digit of this number identifies which one signed in: - 1: Saudi citizen national ID, issued by Civil Affairs (Al-Ahwal al-Madaniyya) under   the Ministry of Interior. - 2: Resident (Iqama or muqeem) number on the residence permit, issued by the General   Directorate of Passports (Al-Jawazat) under the Ministry of Interior. - 3 through 6: Visitor identity number (Hawiyyat Za&#39;ir) for foreign nationals admitted on   short-term visas, including tourist, business, family visit, and Umrah visas.              Format: - Exactly ten decimal digits. - First digit is the user type as listed above. - Digits two through nine are assigned serially and have no semantic meaning. - For citizen and resident numbers, the tenth digit is a check digit derived from the   first nine digits with a modulus-ten style algorithm. No check digit is documented for   visitor numbers, and the Nafath sandbox&#39;s visitor numbers do not follow it.              Nafath returns no identifier for visitors, so for them this is the number the user submitted. |  [optional] |
|**userType** | **String** | Nafath user type derived from the leading digit of nationalIdentityNumber. The matching attributes object carries the fields Nafath defines only for that user type.              Possible values: - Citizen: Saudi citizen national ID (1-series). See citizenSpecificAttributes. - Resident: legally resident foreign national, Iqama (2-series). See   residentSpecificAttributes. - Visitor: visitor identity (3 through 6-series). See visitorSpecificAttributes. |  [optional] |
|**sex** | **String** | Sex as returned by Nafath, normalized to the platform sex code.              Possible values: - Male - Female |  [optional] |
|**nationality** | **String** | Nationality as an ISO 3166-1 alpha-2 country code.              Not every nationality passed by back Nafath corresponds to an ISO 3166-1 alpha-2 code, for example code 335 (Tribes Emigrated) or 336 (Turkestan). In these cases, this field is null. See nationalityCode for the raw nationality code. |  [optional] |
|**nationalityCode** | **String** | Nationality code as returned by Nafath under nationalityCode.              This is the Saudi government&#39;s three-digit nationality code, grouped by region: - 1xx Arab states - 2xx North Africa - 3xx Asia, Middle East, and Oceania - 4xx Sub-Saharan Africa - 5xx Europe - 6xx Americas - 7xx Oceania              It is not an ISO 3166 numeric code. For example, 504 is Ireland according to Nafath but Morocco in ISO 3166.              See https://docs.trinsic.id/docs/saudi-arabia-nafath for a full list. |  [optional] |
|**dateOfBirthGregorian** | **LocalDate** | Date of birth in the Gregorian calendar. |  [optional] |
|**occupationCode** | **String** | Occupation code reported by Nafath.              Known values: - O: Other - G: Government |  [optional] |
|**passportNumber** | **String** | Passport number reported by Nafath. |  [optional] |
|**citizenSpecificAttributes** | [**SaudiArabiaNafathCitizenAttributes**](SaudiArabiaNafathCitizenAttributes.md) | Attributes Nafath defines only for Saudi citizens.              Present only when userType is Citizen. |  [optional] |
|**residentSpecificAttributes** | [**SaudiArabiaNafathResidentAttributes**](SaudiArabiaNafathResidentAttributes.md) | Attributes Nafath defines only for residents holding an Iqama.              Present only when userType is Resident. |  [optional] |
|**visitorSpecificAttributes** | [**SaudiArabiaNafathVisitorAttributes**](SaudiArabiaNafathVisitorAttributes.md) | Attributes Nafath defines only for visitors on short-term visas.              Present only when userType is Visitor. |  [optional] |



