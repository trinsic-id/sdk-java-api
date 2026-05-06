

# ElSalvadorDuiLookupInput


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**documentNumber** | **String** | The DUI (Documento Único de Identidad) number for the holder.              Nine numeric digits after sanitization. Commonly printed as ########-# (hyphen before the final digit). The input will automatically be sanitized of dots, hyphens, spaces, or other non-alphanumeric characters before lookup.              The ninth digit is a check digit. This is not publicly documented by the Salvadoran government, but the algorithm is available in the public domain for those who seek it. |  [optional] |
|**dateOfBirth** | **LocalDate** | The DUI holder&#39;s date of birth. Required to match the correct person in official records. |  [optional] |



