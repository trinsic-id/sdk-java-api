

# ProviderInfo

A provider that can be specified when creating a `Session`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the provider |  |
|**name** | **String** | The friendly, human-readable name of the provider |  |
|**logoUrl** | **String** | A URL pointing to the provider&#39;s logo |  |
|**subtext** | **String** | The Provider&#39;s subtext recommended to be shown next to the name.              This is flavor text, not a full, human-readable description of the provider. |  |
|**description** | **String** | The Provider&#39;s description recommended to be shown next to the name.              This is flavor text, not a full, human-readable description of the provider. |  |
|**health** | **String** | The current health status of the provider |  |
|**subProviders** | [**List&lt;SubProviderMetadata&gt;**](SubProviderMetadata.md) | Metadata about the sub-providers which are available for this Provider.              For example, Italy&#39;s SPID is a Provider which aggregates access to multiple sub-providers. |  [optional] |



