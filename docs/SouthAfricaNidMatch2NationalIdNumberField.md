

# SouthAfricaNidMatch2NationalIdNumberField


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**inputValue** | **String** | The South African National Identity Number (13 digits) is issued for life by the Department of Home Affairs (DHA) and stored in the Home Affairs National Identification System (HANIS) database. The same number is mandatory for banking, employment, taxation, and voting, and is printed on both the legacy green ID book and the Smart ID Card (rolled out from 2013 onward).              Format: - YYMMDD G(4) C A Z - YYMMDD is the date of birth - G(4) is the gender code (below 5000 female, 5000 or above male) - C is the citizenship indicator (0 citizen, 1 permanent resident) - A is reserved (it had a politically sensitive meaning in the past, but is currently   semantically meaningless) - Z is a Luhn check digit |  |
|**outcome** | **String** | The outcome of verifying the national ID number.              Possible values: - Verified - Not Verified - Not Done - Issuer Unavailable - Not Returned |  |



