

# CoteDIvoireNidLookup2ProviderOutput

Exposed properties for the `cote-divoire-nid-lookup-2` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fullName** | **String** | Full name as returned by ONECI (National Civil Registry and Identification Office). |  |
|**givenName** | **String** | Given name of the ID holder as returned by ONECI (National Civil Registry and Identification Office). |  |
|**familyName** | **String** | Family name of the ID holder as returned by ONECI (National Civil Registry and Identification Office). |  |
|**dateOfBirth** | **LocalDate** | Date of birth as returned by ONECI (National Civil Registry and Identification Office). |  |
|**sex** | **String** | Sex of the ID holder as returned by ONECI (National Civil Registry and Identification Office). Possible values: - Male - Female |  |
|**nationality** | **String** | Nationality as ISO 3166-1 alpha-2 country code (e.g. \&quot;CI\&quot; for Côte d&#39;Ivoire). |  |
|**address** | **String** | Address as returned from ONECI (National Civil Registry and Identification Office). Format is LOCALITY,COMMUNE: the locality (village, neighborhood, or sous-quartier) followed by the commune. Not a full street address. |  [optional] |
|**documentNumber** | **String** | The document&#39;s own identifier (printed on the card; often labeled \&quot;Immatriculation\&quot; on older cards or \&quot;Numéro CNI\&quot; in post-2020 cards). On older cards this is usually one letter followed by 10 digits. On new cards it appears as 1 or 2 leading letters plus 9 digits. |  [optional] |
|**nationalIdNumber** | **String** | The NNI (Numéro National d&#39;Identification): the person&#39;s 11-digit national ID, printed on the back of the new national id card and assigned by ONECI. It is always exactly 11 digits with no letters, and is semi-random, non-repetitive, and does not encode any extra data, such as date of birth, gender, or other readable attributes. |  [optional] |



