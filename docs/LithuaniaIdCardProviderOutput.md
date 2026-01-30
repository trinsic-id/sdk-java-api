

# LithuaniaIdCardProviderOutput

Exposed properties for the `a-lt-id-login` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**firstName** | **String** | The first name of the verified individual |  |
|**lastName** | **String** | The last name of the verified individual |  |
|**dateOfBirth** | **LocalDate** | The date of birth of the verified individual |  |
|**personalCode** | **String** | The 11-digit Lithuanian Personal Code (asmens kodas) of the verified individual.              If the first digit is \&quot;9\&quot; (rare), the rest of the identifier is random and has no structure.              Otherwise, this is in the format GYYMMDDSSSC, where:              - G is both gender and century of birth - YYMMDD is the date of birth - SSS is a sequential serial number - C is a checksum digit              If G is odd, the gender is male. If G is even, the gender is female.              If G is 1 or 2, the individual was born in the 19th century (1800-1899). If G is 3 or 4, the individual was born in the 20th century (1900-1999). If G is 5 or 6, the individual was born in the 21st century (2000-2099).              Rarely, the date of birth may be encoded as 000000 if it is not known. |  |



