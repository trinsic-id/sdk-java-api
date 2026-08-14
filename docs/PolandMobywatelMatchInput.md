

# PolandMobywatelMatchInput


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**givenName** | **String** | Given name as it appears on mobile ID (mDowód). |  [optional] |
|**familyName** | **String** | Current legal family name (nazwisko) as it appears on mobile ID (mDowód).              In Poland the current legal family name (nazwisko) is a separate idea from your birth family name (nazwisko rodowe). They often match, but they can differ after marriage, adoption, or a court-ordered change. |  [optional] |
|**dateOfBirth** | **String** | Date of birth as it appears on mobile ID (mDowód). |  [optional] |
|**nationality** | **String** | Nationality as it appears on mobile ID (mDowód).              Format: - Must be a valid ISO 3166-1 alpha-2 or alpha-3 country code. - Matching against mObywatel is an exact string comparison on the alpha-3 code.   Alpha-2 values are accepted and normalized to alpha-3 before matching. |  [optional] |
|**personalNumber** | **String** | Polish national identification number (PESEL) as it appears on mobile ID (mDowód).              NOTE: The provided example value is a randomly generated, but valid PESEL number that does not correspond to a real person. |  [optional] |
|**expirationDate** | **String** | Document expiration date as it appears on mobile ID (mDowód). |  [optional] |
|**selfieBytes** | **byte[]** | The raw bytes of an optional selfie image collected from the individual.              Requirements from the provider: - JPEG or PNG - At least 720 pixels wide (1080 pixels recommended) - Not exceeding 10 MB - Clear, front-facing photo with good lighting and no sunglasses or face coverings. |  [optional] |
|**selfieImageMimeType** | **String** | The MIME type of the file contained in SelfieBytes.              Must be one of &#x60;image/jpeg&#x60; or &#x60;image/png&#x60;. |  [optional] |



