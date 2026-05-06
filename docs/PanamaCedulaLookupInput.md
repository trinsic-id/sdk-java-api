

# PanamaCedulaLookupInput


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**documentNumber** | **String** | The number from the holder&#39;s cédula (Cédula de Identidad Personal).              Send the full number as {firstSegment}-{libro}-{tomo} (libro 1–4 digits, tomo 1–6), using only ASCII letters, digits, and hyphens. Hyphens are not inserted for you between segments. Trinsic uppercases letters, collapses repeated hyphens, trims leading and trailing hyphens, and merges a redundant hyphen between province and AV or PI (for example 10-AV-1234-12345 becomes 10AV-1234-12345).              Citizen category and format: - Born in Panama format: {province}-{libro}-{tomo} ({province} is official code 1 through 13). Examples   8-1234-12345, 4-56-789, 12-12-12345. - Panamanian born abroad format: PE-{libro}-{tomo}. Example PE-1234-12345. - Foreign national with cédula format: E-{libro}-{tomo}. Examples E-1234-12345, E-8-102017. - Naturalized citizen format: N-{libro}-{tomo}. Example N-1234-12345. - Pre-2006 civil registry (AV) format: {province}AV-{libro}-{tomo}. Example 10AV-1234-12345. - Indigenous (PI) format: {province}PI-{libro}-{tomo}. Example 1PI-1234-12345. |  [optional] |
|**dateOfBirth** | **LocalDate** | The user&#39;s date of birth, in &#x60;YYYY-MM-DD&#x60; format. |  [optional] |



