

# CreateHostedProviderSessionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**provider** | **String** | The ID of the provider to launch |  |
|**verificationProfileId** | **UUID** | The ID of the Verification Profile to use for this session. |  |
|**redirectUrl** | **String** | The Redirect URL to which the user should be sent after the session is complete. |  |
|**enableRedirectBackwardsCompatibility** | **Boolean** | Defaults to &#x60;true&#x60; if not provided. Controls backwards compatibility behavior.              If &#x60;true&#x60;, &#x60;redirectToken&#x60; validation is not required as part of the Session flow. If &#x60;false&#x60;, &#x60;redirectToken&#x60; validation is required as a core part of the Session flow; results cannot be fetched without it.              This parameter exists to enable backwards compatibility with existing integrations. In the future, this parameter will be removed and &#x60;redirectToken&#x60; validation will always be required.              If your integration supports &#x60;redirectToken&#x60;, you should explicitly set this parameter&#39;s value to &#x60;false&#x60;. Only set this value to &#x60;true&#x60; if your integration does not support &#x60;redirectToken&#x60; and you are not yet able to add support. |  |
|**browserLanguages** | **List&lt;String&gt;** | Preferences for languages to show first in the Hosted UI and supported provider launch flows. If left empty, the Hosted UI defaults to the user&#39;s navigator languages. If no preferred language is available, the Hosted UI falls back to English. |  [optional] |
|**providerInput** | [**ProviderInput**](ProviderInput.md) | Provider-specific input for those providers which require it.   &lt;b&gt;Deprecated:&lt;/b&gt; In the future, Hosted Provider Sessions will not accept input on creation, and will instead always redirect the user to a hosted interface to collect input. If you need to collect input from the user yourself, please use the Create Direct Session endpoint instead. |  [optional] |



