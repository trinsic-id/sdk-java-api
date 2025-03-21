

# IntegrationStep

A step to perform in the process of executing an Advanced Provider Session

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**method** | **IntegrationLaunchMethod** | The launch method to perform |  |
|**content** | **String** | Step type-specific content related to the step: a URL for &#x60;LaunchBrowser&#x60;, a deeplink for &#x60;DeeplinkToMobile&#x60; or a string to show to the user for &#x60;ShowContent&#x60;. |  |
|**refresh** | [**StepRefreshInfo**](StepRefreshInfo.md) | If non-null, contains metadata about how to refresh the value of &#x60;content&#x60;. |  |



