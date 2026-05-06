

# BoliviaCiProviderOutput

Exposed properties for the `bolivia-ci-lookup` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fullName** | **String** | Full name as it appears on the CI (Cédula de Identidad). |  |
|**givenName** | **String** | Given name(s) of the holder as they appear on the CI (Cédula de Identidad). |  |
|**familyName** | **String** | Family name(s) of the holder (paternal and maternal) as they appear on the CI (Cédula de Identidad). |  |
|**dateOfBirth** | **LocalDate** | Date of birth as recorded in official Bolivian identity records (RUI — Registro Único de Identificación). |  [optional] |
|**documentNumber** | **String** | The CI (Cédula de Identidad) document number for the matched record.              The document is officially called the Cédula de Identidad and is commonly called carnet or carnet de identidad in Bolivia. This is the identifier assigned by the Servicio General de Identificación Personal (SEGIP) in the Registro Único de Identificación (RUI). The value is entirely numeric. There is no verification digit or other data encoded in the number.              Published regulations do not define a fixed length; digit count may vary. |  |



