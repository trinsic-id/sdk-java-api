

# ClearProviderOutputCheck


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**verificationCheckName** | **String** | The verification check name as specified in the CLEAR verification configuration. |  [optional] |
|**value** | **Boolean** | The boolean check value.              This can be null when a check is skipped or unable to evaluate to a deterministic result. |  [optional] |
|**status** | **String** | Whether CLEAR performed the check.              Known values: - completed - skipped - error |  [optional] |
|**checkResult** | **String** | The granular CLEAR result for this check.              Known values: - success - failure - indeterminate - not_applicable - awaiting_async_response |  [optional] |
|**additionalDetails** | [**ClearProviderOutputCheckAdditionalDetails**](ClearProviderOutputCheckAdditionalDetails.md) | Additional structured details CLEAR used for this check. Currently modeled details: watchlistHits. |  [optional] |
|**params** | **Map&lt;String, Object&gt;** | Custom parameters configured for this CLEAR check. |  [optional] |



