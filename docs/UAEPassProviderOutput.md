

# UAEPassProviderOutput

Exposed properties for the `uae-pass` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sub** | **String** | OIDC subject (&#x60;sub&#x60;) returned by UAE Pass.              This is an opaque identifier for the authenticated user in the UAE Pass OIDC transaction. It can be prefixed or unprefixed; do not parse this value or assume it matches the Emirates ID number, UAE Pass UUID, or UAE unified ID. |  [optional] |
|**fullNameArabic** | **String** | Full name in Arabic. |  [optional] |
|**gender** | **String** | Normalized sex parsed from the UAE Pass gender value.              Possible values: - Male - Female - Unknown - NotApplicable              This is null when the UAE Pass value cannot be parsed. |  [optional] |
|**mobile** | **String** | Mobile number. |  [optional] |
|**lastNameEnglish** | **String** | Last name in the Latin-script value returned by UAE Pass. |  [optional] |
|**fullNameEnglish** | **String** | Full name in the Latin-script value returned by UAE Pass. |  [optional] |
|**uaePassUuid** | **String** | UAE Pass UUID.              The unique UAE Pass user identifier. It is separate from the OIDC subject identifier, Emirates ID number, and UAE unified ID. |  [optional] |
|**smartPassUuid** | **String** | SmartPass unique user identifier, if returned.              SmartPass was a previous UAE government single-sign-on identity system. UAE Pass can return this legacy identifier for SOP2 and SOP3 accounts that were verified through SmartPass. |  [optional] |
|**lastNameArabic** | **String** | Last name in Arabic. |  [optional] |
|**emiratesIdNumber** | **String** |  Verified Emirates ID number, if returned for the user profile type and scope.   The Emirates ID is issued by the Federal Authority for Identity, Citizenship, Customs and Port  Security (ICP). The number is a 15-digit identifier following the format 784-YYYY-NNNNNNN-C:  The number is a 15-digit identifier following the format 784-YYYY-NNNNNNN-C:  - 784: UAE ISO 3166-1 numeric country code.  - YYYY: A year value, which could be birth year, registration year, or another year value. This should      not be relied upon to infer birth or registration details.  - NNNNNNN: 7-digit random serial number for the individual.  - C: Check digit.   This field may not be returned for visitor profiles. |  [optional] |
|**idType** | **String** | ID type.              Known values: - ID: Emirates ID or national identity document.              Returned for SOP2 and SOP3 citizen or resident profiles and SOP3 visitor profiles. |  [optional] |
|**nationalityEnglish** | **String** | Nationality in the Latin-script value returned by UAE Pass. |  [optional] |
|**firstNameEnglish** | **String** | First name in the Latin-script value returned by UAE Pass. |  [optional] |
|**userType** | **String** | UAE Pass user type.              Possible values: - SOP1: Basic account. Unverified account with verified email and mobile number. - SOP2: Advanced account. Verified account with Emirates ID verification through SmartPass,     Dubai ID, or Emirates ID PIN registration. - SOP3: Qualified account. Verified account with Emirates ID verification through finger     biometrics or face biometrics. |  [optional] |
|**nationalityArabic** | **String** | Nationality in Arabic. |  [optional] |
|**firstNameArabic** | **String** | First name in Arabic. |  [optional] |
|**email** | **String** | Email address. |  [optional] |
|**titleEnglish** | **String** | Title in the Latin-script value returned by UAE Pass.              Returned for SOP2 and SOP3 citizen or resident profiles and SOP3 visitor profiles. |  [optional] |
|**titleArabic** | **String** | Title in Arabic.              Returned for SOP2 and SOP3 citizen or resident profiles and SOP3 visitor profiles. |  [optional] |
|**profileType** | **Integer** | UAE Pass profile type, if returned for the requested scope.              Possible values: - 1: Citizen or resident profile. - 2: Visitor profile. |  [optional] |
|**unifiedId** | **String** | UAE unified ID, if returned for the requested scope.              A unique ID for the user. It is separate from the Emirates ID number, UAE Pass UUID, and OIDC subject identifier. |  [optional] |
|**authenticationAssuranceLevel** | **String** | UAE Pass authentication assurance level, if present.              This classifies the authentication policy that was satisfied for the session. Known values include: - urn:safelayer:tws:policies:authentication:level:low - urn:safelayer:tws:policies:authentication:level:high |  [optional] |
|**authenticationMethods** | **List&lt;String&gt;** | UAE Pass authentication methods, if present.              This classifies the concrete methods used during authentication. Known values include: - urn:safelayer:tws:policies:authentication:adaptive:methods:mobileid - urn:uae:authentication:method:verified - urn:oasis:names:tc:SAML:1:0:am:password |  [optional] |



