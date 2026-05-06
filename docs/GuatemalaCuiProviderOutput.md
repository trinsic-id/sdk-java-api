

# GuatemalaCuiProviderOutput

Exposed properties for the `guatemala-cui-lookup` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fullName** | **String** | Full name, including given and family names of the CUI holder. |  |
|**givenName** | **String** | Given name(s) of the CUI holder. |  |
|**familyName** | **String** | Family name(s) of the CUI holder, including maternal and paternal names. |  |
|**dateOfBirth** | **LocalDate** | Date of birth of the CUI holder. |  [optional] |
|**documentNumber** | **String** | The Guatemalan Código Único de Identificación (CUI) number.              Assigned and maintained by RENAP (Registro Nacional de las Personas). Official format: exactly 13 numeric digits. 8 RENAP-assigned serial digits, 1 verifier digit (dígito verificador), and 4 geographic digits for department and municipality of birth. The CUI is printed on the Documento Personal de Identificación (DPI) in three groups (4–5–4) separated by spaces.              Trinsic normalizes to digits-only when returning the result, automatically removing spaces, dots, hyphens, and other non-alphanumeric characters.              No verifier algorithm appears in publicly accessible RENAP resources. Community-maintained validators often use modulus-11 (non-official). |  |
|**serialDigits** | **String** | The first 8 digits of the CUI: the portion RENAP assigns from its registration system, before the verifier digit and the four-place geographic codes. Called the “serial” numbers in community-maintained validators. |  |
|**verifierDigit** | **String** | The 9th digit of the CUI (verifier digit / dígito verificador). No verifier algorithm appears in publicly accessible RENAP resources.              However, community-maintained validators often use modulus-11 (non-official). |  |
|**geographicDigits** | **String** | The last four digits encode birthplace department and municipality. There is not a publicly accessible dataset from RENAP for geographic codes. The INE (Instituto Nacional de Estadística y Censos) provides a dictionary of variables (Educación Formal 2024) that includes statistical codes for decoding departments and municipalities. Be careful using these resources, as these codes are not official RENAP codes. They may not always map to the correct department and municipality for consular registrations, naturalizations, foreign residents, and other edge cases.              For the dataset, see: https://datos.ine.gob.gt/dataset/educacion-formal-2024 under \&quot;Diccionario de Variables (Educación Formal 2024)\&quot; |  |
|**sex** | **String** | Sex of the CUI holder.              Possible values: - Male - Female - Unknown |  |
|**arrayName** | **List&lt;String&gt;** | All names of the CUI holder, as an array of strings (e.g. given and family name parts). |  |



