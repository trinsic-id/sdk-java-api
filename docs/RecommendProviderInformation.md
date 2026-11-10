

# RecommendProviderInformation


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the provider |  [readonly] |
|**name** | **String** | The friendly, human-readable name of the provider |  [readonly] |
|**localizedDisplayNames** | **Map&lt;String, String&gt;** | Localized display names for the Provider, if any, keyed by lowercase BCP 47 language codes (eg \&quot;fr\&quot;).              If a particular language code is not present, fall back to &#x60;name&#x60;.              This should not be confused for the list of languages the Provider officially supports. |  [optional] [readonly] |
|**logoUrl** | **String** | A URL pointing to the provider&#39;s logo |  [readonly] |
|**subtext** | **String** | The Provider&#39;s subtext recommended to be shown next to the name.              This is flavor text, not a full, human-readable description of the provider. |  [readonly] |
|**health** | **String** | The current health status of the provider |  [readonly] |
|**subProviders** | [**List&lt;SubProviderMetadata&gt;**](SubProviderMetadata.md) | Metadata about the sub-providers which are available for this Provider.              For example, Italy&#39;s SPID is a Provider which aggregates access to multiple sub-providers. |  [optional] |
|**regions** | **List&lt;String&gt;** | The regions a provider is available in. |  [readonly] |
|**countries** | **List&lt;String&gt;** | A list of countries, in alpha-2 ISO 3166-1 format, that the provider is available in. |  [readonly] |
|**subdivisions** | **List&lt;String&gt;** | A list of subdivisions, in ISO 3166-2 format, that the provider is available in. |  [readonly] |



