

# Iso180135AamvaNamespaceOutput

Fields from the AAMVA mDL namespace.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**domesticDrivingPrivileges** | [**List&lt;Iso180135AamvaDomesticDrivingPrivilege&gt;**](Iso180135AamvaDomesticDrivingPrivilege.md) | Domestic categories of vehicles, restrictions, and conditions, parsed per AAMVA Section 7.2.4. |  [optional] |
|**nameSuffix** | **String** | Name suffix of the individual that has been issued the credential. |  [optional] |
|**organDonor** | **Boolean** | Whether the individual is an organ donor. |  [optional] |
|**veteran** | **Boolean** | Whether the individual is a veteran. |  [optional] |
|**familyNameTruncation** | **String** | Indicates whether the family name has been truncated.              Possible values: - &#39;T&#39;: Truncated - &#39;N&#39;: Not truncated - &#39;U&#39;: Unknown whether truncated |  [optional] |
|**givenNameTruncation** | **String** | Indicates whether the given name has been truncated.              Possible values: - &#39;T&#39;: Truncated - &#39;N&#39;: Not truncated - &#39;U&#39;: Unknown whether truncated |  [optional] |
|**akaFamilyNameV2** | **String** | Other family name by which the individual is known. |  [optional] |
|**akaGivenNameV2** | **String** | Other given name by which the individual is known. |  [optional] |
|**akaSuffix** | **String** | Other suffix by which the individual is known. |  [optional] |
|**weightRange** | [**Iso180135AamvaWeightRange**](Iso180135AamvaWeightRange.md) | Approximate weight range of the individual, in kilograms. |  [optional] |
|**raceEthnicity** | **String** | AAMVA D20 race or ethnicity code of the individual. |  [optional] |
|**sex** | **Integer** | The sex of the individual as an AAMVA-defined sex code.              This is distinct from an ISO/IEC 5218 sex code in two ways: there is no \&quot;Unknown\&quot; value, and \&quot;Not Applicable\&quot; is replaced with \&quot;Not Specified\&quot;.              Possible values: - 1: Male - 2: Female - 9: Not Specified |  [optional] |
|**firstName** | **String** | First name of the individual. |  [optional] |
|**middleNames** | **String** | Middle name or names of the individual. |  [optional] |
|**firstNameTruncation** | **String** | Whether the first name has been truncated. |  [optional] |
|**middleNamesTruncation** | **String** | Whether the middle name has been truncated. |  [optional] |
|**edlCredential** | **Integer** | Deprecated AAMVA EDL (Enhanced Driver&#39;s License) credential indicator.              If present, indicates the type of the EDL credential.              Possible values: 1: Driver&#39;s License 2: Identification Card |  [optional] |
|**edlCredentialV2** | **Boolean** | Whether the credential is an Enhanced Driver&#39;s License (EDL). |  [optional] |
|**dhsCompliance** | **Boolean** | Whether the credential is REAL ID compliant. &#x60;true&#x60; for fully compliant (\&quot;F\&quot;), &#x60;false&#x60; for non-compliant (\&quot;N\&quot;), &#x60;null&#x60; when not present. |  [optional] |
|**residentCounty** | **String** | Deprecated county code for the county where the individual lives. |  [optional] |
|**residentCountyV2** | **String** | County code for the county where the individual lives. |  [optional] |
|**hazmatEndorsementExpirationDate** | **LocalDate** | Date on which the hazardous material endorsement expires. |  [optional] |
|**cdlIndicator** | **Boolean** | Whether the credential is a Commercial Driver&#39;s License (CDL) per FMCSA. |  [optional] |
|**cdlNonDomiciled** | **Boolean** | Deprecated. Whether the CDL holder is non-domiciled in the issuing jurisdiction. |  [optional] |
|**cdlNonDomiciledV2** | **Boolean** | Whether the CDL holder is non-domiciled in the issuing jurisdiction. |  [optional] |
|**dhsComplianceText** | **String** | Text agreed on between the issuing authority and DHS for non-compliant credentials. |  [optional] |
|**dhsTemporaryLawfulStatus** | **Boolean** | Whether the individual has DHS temporary lawful status. |  [optional] |



