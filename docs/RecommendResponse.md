

# RecommendResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**recognized** | [**List&lt;ProviderInformation&gt;**](ProviderInformation.md) | The providers which the user is known to have a credential with. |  |
|**relevant** | [**List&lt;ProviderInformation&gt;**](ProviderInformation.md) | The providers which the user is deemed sufficiently likely to have a credential with. |  |
|**remainder** | [**List&lt;ProviderInformation&gt;**](ProviderInformation.md) | The providers which the user is unlikely to have a credential with.              This includes all providers available to your app which were not included in the Recognized or Relevant lists. |  |



