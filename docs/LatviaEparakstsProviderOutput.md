

# LatviaEparakstsProviderOutput

Exposed properties for the `a-lv-eparaksts-id-login` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**firstName** | **String** | The first name of the verified individual |  |
|**lastName** | **String** | The last name of the verified individual |  |
|**personalCode** | **String** | The 11-digit Latvian personal code (\&quot;personas kods\&quot;) of the verified individual.              This has two possible formats, depending on whether the personal code was issued after July 1, 2017.              For personal codes issued before July 1, 2017, the format is DDMMYY-CZZZQ, where: - DDMMYY is the date of birth, followed by an optional hyphen - C represents the century of birth (&#39;0&#39; for 1800-1899, &#39;1&#39; for 1900-1999, &#39;2&#39; for 2000-2099) - ZZZ is a serial number - Q is a checksum digit              For personal codes issued on or after July 1, 2017, the format is 32ZZZZZZZZQ, where: - 32 is a fixed prefix - ZZZZZZZQ are 8 random digits - Q is a checksum digit              NOTE: Individuals born before July 1, 2017 can elect to be issued a new personal code which does not contain their birthdate. Therefore, no concrete assumptions may be made about an individual&#39;s date of birth based solely on the format of their personal code. |  |



