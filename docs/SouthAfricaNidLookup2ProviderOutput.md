

# SouthAfricaNidLookup2ProviderOutput

Exposed properties for the `south-africa-nid-lookup-2` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nationalIdNumber** | **String** | The South African National Identity Number (13 digits).              Issued for life by the Department of Home Affairs (DHA) and stored in the HANIS (Home Affairs National Identification System) database. The same number is mandatory for banking, employment, taxation, and voting, and is printed on both the legacy green ID book and the Smart ID Card (rolled out from 2013 onward).              Format: - YYMMDD G(4) C A Z - YYMMDD is the date of birth - G(4) is the gender code (below 5000 female, 5000 or above male) - C is the citizenship indicator (0 citizen, 1 permanent resident) - A is reserved (it had a politically sensitive meaning in the past, but is currently   semantically meaningless) - Z is a Luhn check digit |  [optional] |
|**citizenshipStatus** | **String** | Citizenship status of the individual.              Possible values: - Citizen - PermanentResident - Refugee |  [optional] |
|**firstName** | **String** | First name of the individual. |  [optional] |
|**familyName** | **String** | Family name of the individual. |  [optional] |
|**fullName** | **String** | Full name of the individual. |  [optional] |
|**sex** | **String** | Sex of the individual.              Possible values: - Male - Female |  [optional] |
|**dateOfBirth** | **LocalDate** | Date of birth of the individual. |  [optional] |
|**nationality** | **String** | Nationality of the individual as an ISO 3166-1 alpha-2 country code.              Set to ZA when CitizenshipStatus is Citizen. Null when not a South African citizen (Permanent Resident or Refugee). |  [optional] |
|**dateOfDeath** | **LocalDate** | Date of death of the individual, if recorded by DHA (Department of Home Affairs).              Null if the individual is alive, or the data is missing from the registry. |  [optional] |
|**birthCountry** | **String** | Country of birth of the individual as an ISO 3166-1 alpha-2 country code. |  [optional] |



