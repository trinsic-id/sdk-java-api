

# ColombiaCcProviderOutput

Exposed properties for the `colombia-cc-lookup` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fullName** | **String** | Full name as it appears on the CC. |  [optional] |
|**givenName** | **String** | Given name(s) of the holder as they appear on the CC. |  [optional] |
|**familyName** | **String** | Family name(s) of the holder as they appear on the CC. Space-separated when both paternal and maternal family names are present. |  [optional] |
|**dateOfBirth** | **LocalDate** | Date of birth as recorded in the civil registry (Registraduría Nacional). |  [optional] |
|**sex** | **String** | Sex of the holder as recorded in the civil registry (Registraduría Nacional).              Possible values: - Male - Female - Unknown (when the sex is not recorded or cannot be confidently determined) |  [optional] |
|**isAlive** | **Boolean** | Whether the person is reported as alive in Colombia&#39;s official civil registry (Registraduría Nacional).              Used to detect identity fraud when the holder is deceased. |  [optional] |
|**documentNumber** | **String** | The Cédula de Ciudadanía (CC) document number.              This is the unique identifier assigned by the Registraduría Nacional when the person is first issued a CC. It does not change when the person renews or receives a new physical card; it remains the same for the individual for life.              Cédulas issued after 2004 use the NUIP (Número Único de Identificación Personal), which is 10 digits. Older documents may have fewer than 10 digits and are still valid. |  [optional] |
|**expeditionDate** | **LocalDate** | Date the CC was issued (fecha de expedición).              Format: - yyyy-MM-dd |  [optional] |
|**expeditionPlace** | [**ColombiaExpeditionPlace**](ColombiaExpeditionPlace.md) | Place where the CC was issued (lugar de expedición): municipality and department as recorded by the Registraduría Nacional. |  [optional] |
|**arrayName** | **List&lt;String&gt;** | All names as they appear on the CC, as an array of strings.              Format: - Order follows the civil registry: typically family name(s) first, then given name(s). |  [optional] |



