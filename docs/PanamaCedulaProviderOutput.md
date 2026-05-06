

# PanamaCedulaProviderOutput

Exposed properties for the `panama-cedula-lookup` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fullName** | **String** | Full name from Tribunal Electoral records. |  |
|**givenName** | **String** | Given name(s) from Tribunal Electoral records. |  |
|**familyName** | **String** | Family name(s) from Tribunal Electoral records. |  |
|**dateOfBirth** | **LocalDate** | Verified date of birth from Tribunal Electoral records. |  [optional] |
|**documentNumber** | **String** | The matched personal identity cédula (Cédula de Identidad Personal) number from Tribunal Electoral records.              On output, Trinsic applies the same normalization as for lookup input. Structure is always {firstSegment}-{libro}-{tomo}: libro is one to four digits and tomo is one to six digits, separated by hyphens.              Citizen category and format: - Born in Panama format: {province}-{libro}-{tomo} ({province} is official code 1 through 13). Examples   8-1234-12345, 4-56-789, 12-12-12345. - Panamanian born abroad format: PE-{libro}-{tomo}. Example PE-1234-12345. - Foreign national with cédula format: E-{libro}-{tomo}. Examples E-1234-12345, E-8-102017. - Naturalized citizen format: N-{libro}-{tomo}. Example N-1234-12345. - Pre-2006 civil registry (AV) format: {province}AV-{libro}-{tomo}. Example 10AV-1234-12345. - Indigenous (PI) format: {province}PI-{libro}-{tomo}. Example 1PI-1234-12345. |  |
|**nationalityOrResidenceType** | **String** | Inferred from DocumentNumber. Values are nationality or residence category.              Possible values: - BornInPanama - ForeignNational - BornAbroad - Naturalized - LegacyNumber - Indigenous - Unknown (we were unable to determine the category) |  |
|**subdivisionOfOrigin** | **String** | ISO 3166-2 principal subdivision code. Only available for BornInPanama, LegacyNumber, and Indigenous.              Possible values, matching cédula province digits 1–13: 1. PA-1 - Bocas del Toro 2. PA-2 - Coclé 3. PA-3 - Colón 4. PA-4 - Chiriquí 5. PA-5 - Darién 6. PA-6 - Herrera 7. PA-7 - Los Santos 8. PA-8 - Panamá 9. PA-9 - Veraguas 10. PA-KY - Guna Yala 11. PA-EM - Emberá 12. PA-NB - Ngäbe-Buglé 13. PA-10 - Panamá Oeste |  [optional] |
|**subdivisionOfOriginName** | **String** | Subdivision display name from the ISO 3166-2 registry, when available. |  [optional] |



