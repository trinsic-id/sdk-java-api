

# BrazilCnhProviderOutput

Exposed properties for the `brazil-digital-cnh` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fullName** | [**BrazilCnhMatchFieldString**](BrazilCnhMatchFieldString.md) | Full name decoded from the CNH QR Code and whether it matched the government database. |  [optional] |
|**fullNameSimilarity** | **Double** | Similarity score for the decoded full name from the CNH QR Code.              Ranges from 0.0 to 1.0, where 1.0 is an exact match. |  [optional] |
|**originDocument** | **String** | Source identity document number/reference for the CNH record, decoded from the CNH QR Code. |  [optional] |
|**dateOfBirth** | [**BrazilCnhMatchFieldDateOnly**](BrazilCnhMatchFieldDateOnly.md) | Date of birth decoded from the CNH QR Code and whether it matched the government database. |  [optional] |
|**motherFullName** | **String** | Mother&#39;s full name decoded from the CNH QR Code. |  [optional] |
|**fatherFullName** | **String** | Father&#39;s full name decoded from the CNH QR Code. |  [optional] |
|**category** | **String** | Driver license category decoded from the CNH QR Code.              Known values: - A: Two- or three-wheeled motor vehicles, with or without a sidecar. - B: Motor vehicles outside category A up to 3,500 kg, with capacity for up to eight passengers besides the driver, and without articulation or trailer. - C: Category B vehicles and rigid cargo vehicles above 3,500 kg. - D: Category C vehicles and passenger vehicles with capacity above eight passengers besides the driver. - E: Category D vehicles, trailers, semi-trailers, and articulated buses. |  [optional] |
|**registrationNumber** | [**BrazilCnhMatchFieldString**](BrazilCnhMatchFieldString.md) | National Registry (Registro Nacional de Habilitacao) number decoded from the CNH QR Code and whether it matched the government database.              Is an 11-character ID with the format XXXXXXXXX@@: - XXXXXXXXX: Base characters. The value is unique to the driver for their lifetime. - @@: Security check digits |  [optional] |
|**registrationNumberCheckDigitsValid** | **Boolean** | Whether the National Registry number satisfies the CNH modulo-11 check digit routine. |  [optional] |
|**firstIssueDate** | **LocalDate** | Date when the driver was first licensed, decoded from the CNH QR Code. |  [optional] |
|**observations** | **String** | CNH observations decoded from the QR Code.              May include EAR for paid driving activity and one or more restriction codes: - A: Corrective lenses required. - B: Hearing prosthesis required. - C: Left-side accelerator required. - D: Automatic transmission vehicle required. - E: Steering-wheel grip, handle, or knob required. - F: Power steering vehicle required. - G: Manual clutch, automated clutch, or automatic transmission vehicle required. - H: Hand accelerator and brake required. - I: Dashboard control adaptations to the steering wheel required. - J: Dashboard control adaptations for lower limbs or other body parts required. - K: Gear-shift lever extension and/or fixed height/depth compensation cushions required. - L: Pedal extensions and floor elevation and/or fixed height/depth compensation cushions required. - M: Motorcycle with adapted gear-shift pedal required. - N: Motorcycle with adapted rear-brake pedal required. - O: Motorcycle with adapted front-brake handle required. - P: Motorcycle with adapted clutch handle required. - Q: Motorcycle with sidecar or tricycle required. - R: Scooter with sidecar or tricycle required. - S: Motorcycle with automated gear shifting required. - T: Driving on highways and high-speed roads prohibited. - U: Driving after sunset prohibited. - V: Helmet with visor and unrestricted field of vision required. - X: Other restrictions. |  [optional] |
|**issueCity** | **String** | City where the CNH was issued, decoded from the QR Code. |  [optional] |
|**issueState** | **String** | Brazilian state where the CNH was issued, decoded from the QR Code.              Format is a two-letter Brazilian state abbreviation when present. |  [optional] |
|**validationNumber** | **String** | Numeric security validation code decoded from the CNH QR Code.              This is an 11-digit code generated from Departamento Estadual de Trânsito (State Traffic Department or DETRAN) owned data for each CNH and used to validate the document. The algorithm is proprietary, so no further information is available on this number. |  [optional] |
|**renachNumber** | **String** | Registro Nacional de Condutores Habilitados (RENACH) form number decoded from the CNH QR Code.              Is an 11-character ID with the format FFXXXXXXXX@: - FF: The issuing federation unit abbreviation. It identifies the state where the driver was licensed or last had record changes. - XXXXXXXXX: Serial number - @: Modulo-11 security check digit |  [optional] |
|**facialBiometry** | [**BrazilCnhFacialBiometryOutput**](BrazilCnhFacialBiometryOutput.md) | Facial biometric comparison result if submitted and available. |  [optional] |



