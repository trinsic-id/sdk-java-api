

# KenyaNidLookup2Address

Represents a Kenya address as stored in the IPRS (Integrated Population Registration System) database.              The structure reflects the pre-2010 provincial administration system: District > Division > Location. Since the 2010 constitutional change to counties, these legacy administrative divisions are still maintained in IPRS records for historical continuity.              The raw address from IPRS is a newline-separated string with labeled administrative components. Example format:              ``` P O BOX 41842 NAIROBI PARLIAMENT BUILDINGS LOCATION - CITY SQUARE DIVISION - CENTRAL DISTRICT - NAIROBI ```              The first lines contain informal address details (village, P.O. Box) while the suffixed lines contain official administrative designations prefixed with labels like \"LOCATION -\", \"DIVISION -\", \"DISTRICT -\".

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**district** | **String** | The district where the person resides.              This is the highest level of the pre-2010 administrative hierarchy stored in IPRS. Districts were the primary administrative units under Kenya&#39;s provincial system before the change to counties in 2010. Districts roughly correspond to sub-counties in the current administrative structure. |  [optional] |
|**division** | **String** | The division within the district.              This is the second level of the pre-2010 administrative hierarchy. Divisions were administrative units between districts and locations. |  [optional] |
|**location** | **String** | The location within the division.              This is the third level of the pre-2010 administrative hierarchy. Locations were the smallest administrative units. |  [optional] |
|**additionalLines** | **List&lt;String&gt;** | Additional address lines that appear before the structured administrative parts.              May include P.O. Box (format: \&quot;P O BOX [number] [location]\&quot;), village names, estate names, or other informal locality information. |  [optional] |
|**raw** | **String** | The raw, unparsed address string as returned from IPRS (Integrated Population Registration System).              This preserves the original newline-separated format containing both informal address components (village, P.O. Box) and labeled administrative divisions (LOCATION, DIVISION, DISTRICT). |  [optional] |



