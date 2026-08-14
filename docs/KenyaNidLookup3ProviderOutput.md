

# KenyaNidLookup3ProviderOutput

Exposed properties for the `kenya-nid-lookup-3` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**idNumber** | **String** | The Kenya National ID Number (Nambari ya Kitambulisho) or Unique Personal Identifier (Maisha Namba).              This is the primary unique identifier for Kenyan citizens in all government systems, issued by the National Registration Bureau (NRB). The format is either 8 digits for National ID or 9 digits for Maisha Namba UPI (the new format since 2023). |  [optional] |
|**firstName** | **String** | The first name of the individual. |  [optional] |
|**surname** | **String** | The surname of the individual. |  [optional] |
|**otherName** | **String** | Other name (middle name) of the individual. |  [optional] |
|**sex** | **String** | The sex of the individual.              Possible values: - Male - Female |  [optional] |
|**dateOfBirth** | **LocalDate** | The date of birth of the individual.              Format - YYYY-MM-DD |  [optional] |
|**citizenship** | **String** | Citizenship of the individual.              Format - ISO 3166-1 alpha-2 country code |  [optional] |
|**serialNumber** | **String** | The physical card serial number printed on the Kenya National ID card.              This is distinct from the ID Number and serves as a card issuance tracking identifier maintained by IPRS. This value changes each time a new physical card is issued (loss, damage, renewal). |  [optional] |



