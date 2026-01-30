

# IdentityData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**originatingProviderId** | **String** | The ID of the provider from which this data originated (eg \&quot;yoti\&quot;, \&quot;clear\&quot;) |  [optional] |
|**originatingSubProviderId** | **String** | The sub-provider ID of the provider from which this data originated (eg \&quot;rabo\&quot;, \&quot;poste-italiane\&quot;)              This is applicable only to federated Identity Providers such as SPID and IDIN. |  [optional] |
|**person** | [**PersonData**](PersonData.md) | Identity data of the individual who was verified |  [optional] |
|**document** | [**DocumentData**](DocumentData.md) | Identity data of the document involved in verification, if relevant |  [optional] |
|**match** | [**MatchData**](MatchData.md) | Match results for the data being matched against.              This applies to Providers which operate based on matching data / biometrics against a government database, returning match scores or results as opposed to the data itself. |  [optional] |
|**attachments** | [**List&lt;AttachmentInfo&gt;**](AttachmentInfo.md) | Information for each attachment included with this set of identity data.              Use the Attachments API to fetch an attachment by its ID for a given Session. |  |
|**providerOutput** | [**ProviderOutput**](ProviderOutput.md) | Provider-specific output data that doesn&#39;t fit the standard identity data schema.              The structure of this object varies by provider. |  [optional] |



