

# ProviderContract


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the Provider for this contract. |  |
|**name** | **String** | The Provider&#39;s Name as it appears in Trinsic&#39;s Dashboard and Widget |  |
|**description** | **String** | The Provider&#39;s description as it appears in Trinsic&#39;s Widget.              This is flavor text, not a full, human-readable description of the provider. |  |
|**logoUrl** | **String** | A URL pointing to the Provider&#39;s logo on Trinsic&#39;s CDN.              May be a PNG, JPG, or SVG image. |  |
|**available** | **Boolean** | Whether the Provider is available for use in your App.              If &#x60;false&#x60;, you will need to contact Trinsic to enable this Provider for your App. |  |
|**geography** | **List&lt;String&gt;** | The geographies within the Regions the Provider is available. |  |
|**regions** | **List&lt;String&gt;** | The regions within which the Provider is available. |  |
|**launchMethod** | **IntegrationLaunchMethod** | Relevant only to Advanced Provider Sessions.              The &#x60;LaunchMethod&#x60; which must be supported to launch the Provider Session in Advanced Provider Sessions. |  |
|**collectionMethod** | **ResultCollectionMethod** | Relevant only to Advanced Provider Sessions.              The &#x60;CollectionMethod&#x60; which must be supported to launch the Provider Session in Advanced Provider Sessions. |  |
|**resultsMayBeDelayedAfterRedirect** | **Boolean** | If &#x60;true&#x60;, then the results for this Provider may not be available immediately after the user is redirected back to your application. In this case, the &#x60;GetSessionResults&#x60; API must be called until results are available.              This is an uncommon scenario, and typically only applies to Providers which use a biometric check or traditional document scan. |  |
|**hasRefreshableContent** | **Boolean** | Relevant only to Advanced Provider Sessions.              Whether the Provider requires the &#x60;RefreshStepContent&#x60; capability.              For example, Samsung Wallet&#39;s deep links expire every 30 seconds, and must be refreshed periodically for a resilient user flow. |  |
|**requiresInput** | **Boolean** | Relevant to Hosted Provider Sessions and Advanced Provider Sessions.              If &#x60;true&#x60;, this Provider requires provider-specific input on Session creation. If this input is not provided, Trinsic&#39;s Hosted UI will be invoked to collect the input from the user. |  |
|**hasTrinsicInterface** | **Boolean** | Whether there exists a Trinsic-hosted UI for this Provider.              This is &#x60;true&#x60; for any Provider which is not a simple, OIDC-like redirect flow. |  |
|**supportsAdvancedProviderSessions** | **Boolean** | Whether this Provider can be fully whitelabeled/OEMed through the Advanced Provider Sessions API.              If &#x60;false&#x60;, the Provider may still be launched through Advanced Provider Sessions; however, it will necessarily require a Trinsic-hosted UI to function. |  |
|**subProviders** | [**List&lt;SubProviderMetadata&gt;**](SubProviderMetadata.md) | Metadata about the sub-providers which are available for this Provider.              For example, Italy&#39;s SPID is a Provider which aggregates access to multiple sub-providers. |  [optional] |
|**status** | **ProviderHealth** | The current status of the provider and if it is available to launch. If the status is disabled, there is an issue that prevents a provider being able to launch a session. |  |



