

# IndiaPanStructuredNumber


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**seriesCode** | **String** | Three-letter block issued by the Income Tax Department of India.              Ties the number to a specific Income Tax Office or jurisdiction using an internal labeling system.              Position: - Characters 1 through 3 of the PAN              Possible values: - Any three-letter block of uppercase Latin letters |  |
|**assesseeCategoryCode** | **String** | Code that represents the entity that is subject to income tax in India.              Position: - Character 4 of the PAN              Possible values: - \&quot;A\&quot; for Association of Persons (AOP) - \&quot;B\&quot; for Body of Individuals (BOI) - \&quot;C\&quot; for Company - \&quot;F\&quot; for Firm - \&quot;G\&quot; for Government - \&quot;H\&quot; for Hindu Undivided Family (HUF) - \&quot;J\&quot; for Artificial Juridical Person - \&quot;L\&quot; for Local Authority - \&quot;P\&quot; for Individual - \&quot;T\&quot; for Trust |  |
|**assesseeCategoryName** | **String** | Human-readable label for the assessee category when it matches a known code.              Possible values: - Association of Persons (AOP) - Body of Individuals (BOI) - Company - Firm - Government - Hindu Undivided Family (HUF) - Artificial Juridical Person - Local Authority - Individual - Trust              Omitted when the letter is not a standard category code. |  [optional] |
|**namePrefixLetter** | **String** | First letter of the name of the entity that is subject to income tax in India.              Position: - Character 5 of the PAN.              Format: - When AssesseeCategoryCode is P, this character is the first letter of the individual&#39;s   family name as recorded for the PAN. - When AssesseeCategoryCode is A, B, C, F, G, H, J, L, or T, this character is the first letter   of the name of the association, body, company, firm, government, HUF, local authority, or   trust.              Possible values: - Any uppercase Latin letter |  |
|**serialNumber** | **String** | Sequential four-digit field assigned by the Income Tax Department of India.              Each PAN receives a unique serial within the given series code and assessee category.              Position: - Characters 6 through 9 of the PAN.              Possible values: - Four-digit strings 0001 through 9999 inclusive, using only digits 0 through 9 |  |
|**checkLetter** | **String** | Alphabetic check character for the first nine characters of the PAN.              The algorithm has not been made publicly available by the Income Tax Department of India.              Position: - Character 10 of the PAN.              Possible values: - One uppercase Latin letter A through Z |  |



