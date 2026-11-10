

# RecommendProvidersRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**verificationProfileId** | **UUID** | The ID of the VerificationProfile to use for this recommendation. |  |
|**recommendationInfo** | [**RecommendationInfo**](RecommendationInfo.md) | Information about the user you wish to generate a recommendation for. When no location can be determined from this information, all eligible providers are returned in the remainder. |  [optional] |
|**health** | **RecommendProviderHealthOption** | Filter providers by health status. |  [optional] |



