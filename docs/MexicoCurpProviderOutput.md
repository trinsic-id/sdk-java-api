

# MexicoCurpProviderOutput

Exposed properties for the `mexico-curp-lookup` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**firstName** | **String** | First name of the individual. |  [optional] |
|**fatherLastName** | **String** | The last name of the father of the individual. |  [optional] |
|**motherLastName** | **String** | The last name of the mother of the individual. |  [optional] |
|**gender** | **String** | The gender of the individual.   List of possible values:   - Male  - Female |  [optional] |
|**dateOfBirth** | **LocalDate** | The date of birth of the individual. |  [optional] |
|**countryOfBirth** | **String** | The country of birth of the individual. |  [optional] |
|**stateOfBirth** | **String** | The state of birth of the individual. |  [optional] |
|**curp** | **String** | The CURP (Clave Única de Registro de Población) that was verified.              A CURP code is a unique identifier assigned to individuals in Mexico. It is 18 alphanumeric characters, with a structured meaning:              ABCD YYMMDD G SS XYZ M C The first 4 letters (ABCD): A: The first letter of the paternal last name. B: First internal vowel of paternal last name. C: First letter of maternal last name. D: First letter of first name.              YYMMDD: 2-digit year, month, day.              G: Gender, H for Hombre (male) and M for Mujer (female).              SS: State code (2 letters), e.g. NL for Nuevo León.              X: First internal consonant of paternal last name. Y: First internal consonant of maternal last name. Z: First internal consonant of given name.              M: Millennium indicator (0-9 for pre-2000 birth date, A-Z for post-2000&#39;s birth dates.              C: Checksum character |  [optional] |
|**curpStatus** | **String** | Curp status for the subject.              Possible values: - AN: Alta Normal (Normal registration) - Active - AH: Alta con Homonimia (Registration with homonymy) - Active - RCC: Registro de cambio afectando a CURP (Change affecting CURP) - Active - RCN: Registro de cambio no afectando a CURP (Change not affecting CURP) - Active - BAP: Baja por documento apócrifo (Low due to apocryphal document) - Inactive - BSU: Baja sin uso (Low curp without use) - Inactive - BD: Baja por defunción (Low curp due to death) - Inactive - BDM: Baja administrativa (Low, due to administrative process) - Inactive - BDP: Baja por adopción (Low, due to adoption) - Inactive - BJD: Baja Judicial (Low for judicial reasons) - Inactive |  [optional] |
|**registrationYear** | **Integer** | The year the CURP number was registered in. |  [optional] |
|**registrationState** | **String** | The state the CURP number was registered in. |  [optional] |
|**actNumber** | **String** | The ACT (Número de Acta) number of the individual.              The Act number is a civil registry index number. Various state have various formats of specifying these. |  [optional] |



