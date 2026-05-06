

# BoliviaCiLookupInput


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**documentNumber** | **String** | The holder&#39;s CI (\&quot;Cédula de Identidad\&quot;) number from the Bolivian identity card (\&quot;carnet de identidad\&quot;). This is the identifier assigned by the Servicio General de Identificación Personal (SEGIP) in the Registro Único de Identificación (RUI). Is entirely numeric values. Any non-alphanumeric characters (dots, hyphens, spaces, etc.) will be stripped before lookup.              Published regulations do not define a fixed length; digit count may vary. |  [optional] |
|**dateOfBirth** | **LocalDate** | The holder&#39;s date of birth. Must match the CI record. |  [optional] |



