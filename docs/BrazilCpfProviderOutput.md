

# BrazilCpfProviderOutput

Exposed properties for the `brazil-cpf-lookup` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**previewRawErrorCode** | **String** | The raw error code for the verification, returned by Serpro.              This is a temporary preview to support detailed error handling. When building against this please let the Trinsic team know. Preview features can be turned off without an obsoletion notice. |  [optional] |
|**cpfNumber** | **String** | The individual&#39;s CPF number.              A CPF (Cadastro de Pessoas Físicas) is the Brazilian individual taxpayer identification number for residents and foreigners. It is an 11-digit number managed by the Federal Revenue Service, the last 2 digits are check digits, calculated based on the first 9 digits. The 9th digit indicates the fiscal region responsible for the registration, |  [optional] |
|**fiscalRegions** | **List&lt;String&gt;** | List of Brazilian fiscal regions that could have issued this number.              This is calculated based off of the CPF number. A CPF number encodes information about what region it is issued from, but some regions share the identifier.              Possible values: Formatted as two characters. The digit represents the region code this applies to. - AC (Acre) - 2 - AL (Alagoas) - 4 - AP (Amapá) - 2 - AM (Amazonas) - 2 - BA (Bahia) - 5 - CE (Ceará) - 3 - DF (Distrito Federal) - 1 - ES (Espírito Santo) - 7 - GO (Goiás) - 1 - MA (Maranhão) - 3 - MT (Mato Grosso) - 1 - MS (Mato Grosso do Sul) - 1 - MG (Minas Gerais) - 6 - PA (Pará) - 2 - PB (Paraíba) - 4 - PR (Paraná) - 9 - PE (Pernambuco) - 4 - PI (Piauí) - 3 - RJ (Rio de Janeiro) - 7 - RN (Rio Grande do Norte) - 4 - RO (Rondônia) - 2 - RS (Rio Grande do Sul) - 0 - RR (Roraima) - 2 - SC (Santa Catarina) - 9 - SP (São Paulo) - 8 - SE (Sergipe) - 5 - TO (Tocantins) - 1 |  [optional] |
|**statusCode** | **Integer** | The CPF Status. Possible values: 0 - Regular. The CPF is valid and in good standing. There are no pending issues, registration inconsistencies, or missing mandatory Individual Income Tax Returns (DIRPF). 2 - Suspended. The CPF record contains incorrect or incomplete registration data (e.g., name, date of birth, or voter registration number). This status is typically caused by discrepancies with the Superior Electoral Court (TSE) database or failure to update personal information. 3 - Deceased Holder. The CPF has been registered as belonging to a deceased individual. This status is recorded to prevent post-mortem misuse. 4 - Pending Regularization. The taxpayer has failed to submit one or more mandatory Individual Income Tax Returns (DIRPF) within the last five years. This can occur for various reasons, such as failure to file a mandatory declaration, changes of address, name, marital status, or other important information that does not conform to the records. Regularization requires submission of the overdue returns. 5 - Canceled by Multiplicity. The CPF has been cancelled due to duplicate registration (multiple CPFs assigned to the same individual or a single CPF linked to multiple individuals). 8 - Null. The CPF registration was cancelled due to confirmed fraud or a serious issuance error. Regularization requires in-person verification at a Federal Revenue Service office and may not be guaranteed. 9 - Cancelled Ex Officio. The CPF was cancelled due to administrative or judicial decision, or other registration inconsistencies. |  [optional] |
|**statusDescription** | **String** | Description of the CPF Status. |  [optional] |
|**name** | **String** | The full legal name of the individual. |  [optional] |
|**socialName** | **String** | The social name of the individual in case the individual would like to use a different name than their full legal name. |  [optional] |
|**dateOfBirth** | **LocalDate** | The date of birth of the individual. |  [optional] |
|**yearOfDeath** | **String** | Deprecated as of September 19, 2026.              The year of death of the individual, if applicable. |  [optional] |
|**dateOfRegistration** | **LocalDate** | The date of registration of the individual with the Federal Revenue Service. |  [optional] |
|**biometricVerification** | [**BrazilBiometricVerificationOutput**](BrazilBiometricVerificationOutput.md) | The biometric verification results.              This is an optional configurable check. |  [optional] |



