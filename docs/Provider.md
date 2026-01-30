

# Provider


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier of the provider |  |
|**name** | **String** | The display name of the provider |  |
|**logoUrl** | **String** | The URL of the provider&#39;s logo |  |
|**subtext** | **String** | The Provider&#39;s subtext recommended to be shown next to the name.              This is flavor text, not a full, human-readable description of the provider. |  |
|**description** | **String** | A description of the provider&#39;s capabilities |  [readonly] |
|**geography** | **List&lt;String&gt;** | Geographic regions where this provider operates |  |
|**regions** | **List&lt;String&gt;** | Specific regions supported by this provider |  |
|**countries** | **List&lt;String&gt;** | The countries where this Provider is available (as alpha-2 ISO codes). |  |
|**subdivisions** | **List&lt;String&gt;** | The subdivisions (states, provinces, etc.) where this Provider is available (as alpha-2 ISO codes). |  |
|**licensed** | **Boolean** | Whether this provider is licensed for use by your organization |  |
|**launchMethod** | **IntegrationLaunchMethod** | Relevant only to Direct Provider Sessions.              The &#x60;LaunchMethod&#x60; which must be supported to launch the Provider Session in Direct Provider Sessions. |  |
|**collectionMethod** | **ResultCollectionMethod** | Relevant only to Direct Provider Sessions.              The &#x60;CollectionMethod&#x60; which must be supported to launch the Provider Session in Direct Provider Sessions. |  |
|**resultsMayBeDelayedAfterRedirect** | **Boolean** | If &#x60;true&#x60;, then the results for this Provider may not be available immediately after the user is redirected back to your application. In this case, the &#x60;GetSessionResults&#x60; API must be called until results are available.              This is an uncommon scenario, and only applies to Providers which cannot guarantee the availability of results immediately after the user is redirected back to your application. |  |
|**hasRefreshableContent** | **Boolean** | Relevant only to Direct Provider Sessions.              Whether the Provider requires the &#x60;RefreshStepContent&#x60; capability.              For example, Samsung Wallet&#39;s deep links expire every 30 seconds, and must be refreshed periodically for a resilient user flow. |  |
|**requiresInput** | **Boolean** | Relevant to Hosted Provider Sessions and Direct Provider Sessions.              If &#x60;true&#x60;, this Provider requires provider-specific input on Session creation. If this input is not provided, Trinsic&#39;s Hosted UI will be invoked to collect the input from the user. |  |
|**hasTrinsicInterface** | **Boolean** | Whether there exists a Trinsic-hosted UI for this Provider.              This is &#x60;true&#x60; for any Provider which is not a simple, OIDC-like redirect flow. |  |
|**supportsDirectProviderSessions** | **Boolean** | Whether this Provider can be fully whitelabeled/OEMed through the Direct Provider Sessions API.              If &#x60;false&#x60;, the Provider may still be launched through Direct Provider Sessions; however, it will necessarily require a Trinsic-hosted UI to function. |  |
|**availableAttributes** | [**List&lt;ContractAttribute&gt;**](ContractAttribute.md) | Information about the user attributes that this Provider will return in verification results. |  [optional] |
|**availableAttachments** | [**List&lt;ContractAttachment&gt;**](ContractAttachment.md) | Information about the attachments that this Provider will return in verification results. |  [optional] |
|**subProviders** | [**List&lt;SubProviderMetadata&gt;**](SubProviderMetadata.md) | Metadata about the sub-providers which are available for this Provider in the current Environment.              For example, Italy&#39;s SPID is a Provider which aggregates access to multiple sub-providers. |  [optional] |
|**liveHealth** | **ProviderHealth** | The health for a provider in the live environment |  |
|**testHealth** | **ProviderHealth** | The health for a provider in the test environment |  |



