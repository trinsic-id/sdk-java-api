

# CreateDirectProviderSessionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**provider** | **String** | The ID of the provider to launch |  |
|**verificationProfileId** | **UUID** | The ID of the Verification Profile to use for this session. |  |
|**redirectUrl** | **String** | The Redirect URL to which the user should be sent after the session is complete.              This field is required for providers which employ a redirect-based flow. |  [optional] |
|**capabilities** | **List&lt;IntegrationCapability&gt;** | The list of capabilities your integration supports. Capabilities are the core of Trinsic&#39;s whitelabel-with-optional-fallback offering.              Most capabilities align with either an &#x60;IntegrationLaunchMethod&#x60; or an &#x60;IntegrationCollectionMethod&#x60;. The exception being refresh content to support updating the content of the launch method.              For example, to support a basic redirect-based flow, you must include the &#x60;LaunchRedirect&#x60; and &#x60;CaptureRedirect&#x60; capabilities. To support a mobile deeplink / polling flow, you must include the &#x60;DeeplinkToMobile&#x60; and &#x60;PollForResults&#x60; capabilities.              If &#x60;FallbackToHostedUi&#x60; is &#x60;true&#x60;, Trinsic will automatically fall back to a Trinsic-hosted UI to cover any gaps in your integration&#39;s capabilities. If &#x60;FallbackToHostedUi&#x60; is &#x60;false&#x60;, gaps in your integration&#39;s capabilities will result in an error during Session creation.              Read more on how to integrate at &lt;a href&#x3D;\&quot;https://docs.trinsic.id/docs/direct-provider-sessions\&quot;&gt;the guide on Direct Provider Sessions&lt;/a&gt; |  |
|**fallbackToHostedUI** | **Boolean** | Whether the session should fall back to a Trinsic-hosted UI in certain instances.              Specifically, fallback will occur if any of the following are true: - You attempted to launch a provider which requires a capability you did not express support for     - In this case, Trinsic&#39;s hosted UI will perform the necessary capability - You attempted to launch a provider which requires input, and the input was either not provided or incomplete     - In this case, Trinsic&#39;s hosted UI will collect the necessary input from the user              If fallback occurs, the session&#39;s NextStep will always be LaunchBrowser, and the CollectionMethod will always be CaptureRedirect.              If this field is set to &#x60;true&#x60;, you must also: 1. Set the &#x60;RedirectUrl&#x60; field to a non-empty value 2. Include the &#x60;LaunchBrowser&#x60; and &#x60;CaptureRedirect&#x60; capabilities in the &#x60;Capabilities&#x60; field |  [optional] |
|**providerInput** | [**ProviderInput**](ProviderInput.md) | Provider-specific input for those providers which require it. |  [optional] |



