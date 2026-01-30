

# BelgiumIdCardProviderOutput

Exposed properties for the `a-be-id-login` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**firstName** | **String** | The first name of the verified individual |  |
|**lastName** | **String** | The last name of the verified individual |  |
|**dateOfBirth** | **LocalDate** | The date of birth of the verified individual |  |
|**nationalRegisterNumber** | **String** | The Belgian National Register Number (\&quot;Rijksregisternummer\&quot;) of the verified individual.              This is an 11-digit number in the format YYMMDDXXXCC, where: - YYMMDD represents the individual&#39;s date of birth (year, month, day). - XXX is a sequential birth number, odd for males and even for females. - CC is a checksum, calculated with the equation: 97 - (YYMMDDXXX mod 97)              For births in the year 2000 or later, the digit &#39;2&#39; is prepended to the first 9 digits during checksum calculation. |  |



