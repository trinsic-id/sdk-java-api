

# KenyaNidLookup2ProviderOutput

Exposed properties for the `kenya-nid-lookup-2` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**firstName** | **String** | The first name (given name) of the ID holder as recorded in IPRS. |  |
|**surname** | **String** | The surname (family name) of the ID holder as recorded in IPRS. |  |
|**otherName** | **String** | The other name (middle name) of the ID holder as recorded in IPRS. |  [optional] |
|**sex** | **String** | The sex of the ID holder as recorded on the National ID.              Possible values: - Male - Female |  |
|**dateOfBirth** | **LocalDate** | The date of birth of the ID holder as recorded in IPRS. |  [optional] |
|**citizenship** | **String** | Citizenship status as recorded in the IPRS civil registry database.              For the Kenya National ID lookup, this value will always be \&quot;Kenyan\&quot; as the National ID is only issued to Kenyan citizens. Non-citizens residing in Kenya are issued different identification documents (Alien ID cards, refugee documentation, etc.) which are not supported by this provider. |  |
|**idNumber** | **String** | The Kenya National ID Number (Nambari ya Kitambulisho) or Unique Personal Identifier (Maisha Namba).              This is the primary unique identifier for Kenyan citizens in all government systems, issued by the National Registration Bureau (NRB). The format is either 8 digits for National ID or 9 digits for Maisha Namba UPI (the new format since 2023). |  |
|**serialNumber** | **String** | The physical card serial number printed on the Kenya National ID card.              This is distinct from the ID Number and serves as a card issuance tracking identifier maintained by IPRS. This value changes each time a new physical card is issued (loss, damage, renewal). |  |
|**dateOfIssue** | **LocalDate** | The date the National ID was issued by the National Registration Bureau (NRB). |  [optional] |
|**placeOfBirth** | [**KenyaNidLookup2Address**](KenyaNidLookup2Address.md) | Place of birth as recorded in Kenya&#39;s civil registry (IPRS).              This is structured according to Kenya&#39;s pre-2010 administrative hierarchy (District &gt; Division &gt; Location). |  [optional] |
|**placeOfResidence** | [**KenyaNidLookup2Address**](KenyaNidLookup2Address.md) | Current residence address as registered in IPRS.              This represents the address on file at the time of ID registration or last update, structured according to Kenya&#39;s pre-2010 administrative hierarchy (District &gt; Division &gt; Location). |  [optional] |



