

# ItsmeLoginProviderOutput

Exposed properties for the `a-itsme-login` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**firstName** | **String** | The first name of the verified individual |  [optional] |
|**lastName** | **String** | The last name of the verified individual |  [optional] |
|**dateOfBirth** | **LocalDate** | The date of birth of the verified individual |  [optional] |
|**hashedNationalRegisterNumber** | **String** | The hashed version of the Belgian National Register Number of the verified individual.              By default, itsme does not return the raw National Register Number of the individual; instead, only a hashed version is returned.              Your account must be approved by itsme to receive the raw, unhashed National Register Number. |  [optional] |
|**nationalRegisterNumber** | **String** | The raw (not hashed) Belgian National Register Number (\&quot;Rijksregisternummer\&quot;) of the verified individual.              Only returned if your account has been explicitly authorized to receive it by itsme; by law, this data is considered sensitive personal data.              This is an 11-digit number in the format YYMMDDXXXCC, where: - YYMMDD represents the individual&#39;s date of birth (year, month, day). - XXX is a sequential birth number, odd for females and even for males. - CC is a checksum, calculated with the equation: 97 - (YYMMDDXXX mod 97)              For births in the year 2000 or later, the digit &#39;2&#39; is prepended to the first 9 digits during checksum calculation. |  [optional] |
|**email** | **String** | The individual&#39;s email address. |  [optional] |
|**phoneNumber** | **String** | The individual&#39;s phone number in international format. |  [optional] |
|**gender** | **String** | The individual&#39;s gender.              Possible values: - Male - Female - Unknown - Not Applicable |  [optional] |
|**nationality** | **String** | The individual&#39;s nationality as an ISO 3166-1 alpha-3 code. |  [optional] |
|**birthPlace** | **String** | The individual&#39;s place of birth. |  [optional] |
|**documentNumber** | **String** | The document number |  [optional] |
|**identityDocumentExpirationDate** | **LocalDate** | The expiration date of the identity document. |  [optional] |
|**language** | **String** | The individual&#39;s language as an ISO 639-1 code. Expected values: NL, FR, DE, EN. |  [optional] |
|**address** | [**ItsmeAddress**](ItsmeAddress.md) | The individual&#39;s address |  [optional] |



