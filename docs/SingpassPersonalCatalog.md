

# SingpassPersonalCatalog

MyInfo Personal catalog.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**identityNumber** | **String** | The Unique Identifier Number (UINFIN) for the user.              The number can be either a National Registration Identity Card or a Foreign Identification Number (NRIC/FIN). Follows the format @xxxxxxx#: - @ is the status of the holder.     - Singapore citizens and permanent residents born before 1 January 2000 are assigned the letter \&quot;S\&quot;.     - Singapore citizens and permanent residents born on or after 1 January 2000 are assigned the letter \&quot;T\&quot;.     - Foreigners issued with long-term passes before 1 January 2000 are assigned the letter \&quot;F\&quot;.     - Foreigners issued with long-term passes from 1 January 2000 to 31 December 2021 are assigned the letter \&quot;G\&quot;.     - Foreigners issued with long-term passes on or after 1 January 2022 are assigned the letter \&quot;M\&quot;. - xxxxxxx is seven digit serial number. - # is the checksum letter. |  [optional] |
|**partialIdentityNumber** | **String** | The partial National Registration Identity Card or Foreign Identification Number (NRIC/FIN) shown by Singpass.              The value hides all but the last three digits and checksum. |  [optional] |
|**name** | **String** | The name of verified individual composed of all the possible names.              The name is assembled in the following format (where applicable): 1. Principal Name (The first name section) 2. Hanyu Pinyin Name 3. Alias Name 4. Hanyu Pinyin Alias Name 5. Married Name (optional): Available only for females, prefixed with \&quot;MRS\&quot; |  [optional] |
|**aliasName** | **String** | The individual&#39;s alternate legally recognized name. |  [optional] |
|**hanyuPinyinName** | **String** | The individual&#39;s Hanyu Pinyin name. |  [optional] |
|**hanyuPinyinAliasName** | **String** | The individual&#39;s Hanyu Pinyin alias name. |  [optional] |
|**marriedName** | **String** | The individual&#39;s married name.              This appears when Singpass has a legally recognized married surname on file. |  [optional] |
|**email** | **String** | The user&#39;s email address. |  [optional] |
|**mobileNumber** | [**SingpassPhoneNumber**](SingpassPhoneNumber.md) | The user&#39;s mobile number, split into prefix, area code, and subscriber number. |  [optional] |
|**dialect** | [**SingpassMyInfoDescription**](SingpassMyInfoDescription.md) | The user&#39;s dialect. |  [optional] |
|**dateOfBirth** | **LocalDate** | The user&#39;s date of birth. |  [optional] |
|**residentialStatus** | [**SingpassMyInfoDescription**](SingpassMyInfoDescription.md) | The user&#39;s residential status.              Possible values (code description): - A Alien - C Citizen - P PR - U Unknown - N NOT APPLICABLE |  [optional] |
|**nationality** | **String** | The user&#39;s nationality in IS0-2 country code format. |  [optional] |
|**birthCountry** | **String** | The user&#39;s birth country in IS0-2 country code format. |  [optional] |
|**passportNumber** | **String** | The user&#39;s passport number. |  [optional] |
|**passportExpiryDate** | **LocalDate** | The user&#39;s passport expiry date. |  [optional] |
|**passType** | [**SingpassMyInfoDescription**](SingpassMyInfoDescription.md) | The Pass type of the individual.              Possible values: (code description)              - RPass Work Permit - SPass S Pass - P1Pass Employment Pass - P2Pass Employment Pass - QPass Employment Pass - PEP Personalised Employment Pass - WHP Work Holiday Pass - TEP Training Employment Pass - Entre EntrePass - OVE Overseas Networks &amp; Expertise Pass - DP Dependent Pass - LTVP Long-Term Visit Pass - LOC Letter of Consent - MWP Miscellaneous Work Pass - STP Student&#39;s Pass - LTVP+ Long-Term Visit Pass Plus - IEO Immigration Exemption Order              Note that this only applies to a FIN holder. |  [optional] |
|**passStatus** | **String** | Pass status.              Possible values: - Live - Approved (Interim status in which the FIN holder has yet to receive the pass)              Note that this only applies to a FIN holder. |  [optional] |
|**passExpiryDate** | **LocalDate** | Pass expiration date.              Note that this only applies to a FIN holder. |  [optional] |
|**employmentSector** | **String** | The user&#39;s employment sector. |  [optional] |
|**registeredAddress** | [**SingpassMyInfoRegisteredAddressOutput**](SingpassMyInfoRegisteredAddressOutput.md) | The user&#39;s registered address. |  [optional] |
|**houseDevelopmenetBoardType** | [**SingpassMyInfoDescription**](SingpassMyInfoDescription.md) | Housing and Development Board (HBD) flat type code and description.              This value will be null if not HBD Possible values (code description): - 111 1-ROOM FLAT (HDB) - 112 2-ROOM FLAT (HDB) - 113 3-ROOM FLAT (HDB) - 114 4-ROOM FLAT (HDB) - 115 5-ROOM FLAT (HDB) - 116 EXECUTIVE FLAT (HDB) - 118 STUDIO APARTMENT (HDB) |  [optional] |
|**housingType** | [**SingpassMyInfoDescription**](SingpassMyInfoDescription.md) | The user&#39;s housing type.              Possible values (code description): - 121 DETACHED HOUSE - 122 SEMI-DETACHED HOUSE - 123 TERRACE HOUSE - 131 CONDOMINIUM - 132 EXECUTIVE CONDOMINIUM - 139 APARTMENT |  [optional] |
|**sex** | **String** | Sex of the individual.              Possible values: - Female - Male - Unknown |  [optional] |



