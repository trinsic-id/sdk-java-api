

# PeruDniProviderOutput

Exposed properties for the `peru-dni-lookup` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**address** | [**PeruDniAddress**](PeruDniAddress.md) | Information about the general area in which the DNI holder resides.              This field is not always available. |  [optional] |
|**arrayName** | **List&lt;String&gt;** | All names that appear on DNI, as an array of strings.              Format: - All uppercase - Ordered by paternal family name, then maternal family name, then given names. |  |
|**civilStatus** | **String** | Marital status as it appears on the DNI.              This field is not always available.              Valid values: - \&quot;Single\&quot; - \&quot;Married\&quot; - \&quot;Divorced\&quot; - \&quot;Widowed\&quot; |  [optional] |
|**dateOfBirth** | **LocalDate** | Date of birth as it appears on the DNI.              This field is not always available. |  [optional] |
|**documentNumber** | **String** | The individual&#39;s National Identity Document number (Documento Nacional de Identidad or DNI).              Format: - 8 digits - Does NOT include verification digit. On the DNI card, a ninth digit appears next to the first eight. It is   0-9 or A-K. This is NOT included in the DNI number when returned from Peru&#39;s database. - Does NOT include dots or hyphens |  |
|**documentType** | **String** | Should always be \&quot;DNI\&quot;. |  |
|**expeditionDate** | **LocalDate** | Date that the DNI was issued.              This field is not always available.              Format: - yyyy-MM-dd |  [optional] |
|**expirationDate** | **LocalDate** | Date that the DNI will expire. DNI expires every 8 years, unless the citizen is &gt;&#x3D; 60 years old, in which case it never expires.              This field is not always available.              Format: - yyyy-MM-dd |  [optional] |
|**firstName** | **String** | Given names as they appear on DNI.              Format: - All uppercase - Space-separated - Will include all given names |  |
|**fullName** | **String** | All names as they appear on DNI.              Format: - All uppercase - Space-separated - Will include all names, given and family - Ordered by given names first, then paternal family name, then maternal family name |  |
|**lastName** | **String** | Family names as they appear on DNI.              Format: - All uppercase - Will include all family names - Ordered by paternal family name first, then maternal family name |  |
|**maternalLastName** | **String** | Maternal last name as it appears on DNI.              Format: - All uppercase |  |
|**paternalLastName** | **String** | Paternal last name as it appears on DNI.              Format: - All uppercase |  |
|**sex** | **String** | Sex as it appears on DNI.              This field is not always available.              Values: - \&quot;Male\&quot; - \&quot;Female\&quot; |  [optional] |
|**ubigeoReniec** | **String** | In Peru, geographical locations have an official geographical code called UBIGEO, from the spanish \&quot;UBIcación GEOgráfica\&quot; (Geographic Location). This is an administrative geocode, is different from a postal code (which Peru also has) and is used to specifically delineate the administrative region, province and district hierarchy.              There are two coding systems for UBIGEO: one from INEI (National Institute of Statistics and Informatics) and another from RENIEC (National Registry of Identification and Civil Status). The two coding systems are similar but are not 100% the same (some numbers will map to different geographic locations). This field follows the coding system from RENIEC.              This field is not always available.              Format: - Always 6 digits - First two digits represent region - Middle two are province - Last two are district              Given the example 081304, that would correspond to: - 08 - Cusco Region - 0813 - Urubamba Province - 081304 - Machupicchu District |  [optional] |
|**verificationDigit** | **String** | The final (ninth) digit of the DNI, which serves as a checksum over the first eight digits.              This field is not always available.              Format: - Single character - Either 0-9 or A-K              Read more here:   https://elcomercio.pe/mag/respuestas/cual-es-el-digito-verificador-de-mi-dni-documento-nacional-de-identidad-reniec-peru-nnda-nnlt-noticia/ |  [optional] |



