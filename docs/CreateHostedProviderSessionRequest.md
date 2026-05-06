

# CreateHostedProviderSessionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**provider** | **String** | The ID of the provider to launch |  |
|**verificationProfileId** | **UUID** | The ID of the Verification Profile to use for this session. |  |
|**redirectUrl** | **String** | The Redirect URL to which the user should be sent after the session is complete. |  |
|**browserLanguages** | **List&lt;String&gt;** | Preferences for languages to show first in the Hosted UI. If left empty, the Hosted UI defaults to the user&#39;s navigator languages. If no preferred language is available, the Hosted UI falls back to English. |  [optional] |
|**providerInput** | [**ProviderInput**](ProviderInput.md) | Provider-specific input for those providers which require it.   &lt;b&gt;Deprecated:&lt;/b&gt; In the future, Hosted Provider Sessions will not accept input on creation, and will instead always redirect the user to a hosted interface to collect input. If you need to collect input from the user yourself, please use the Create Direct Session endpoint instead. |  [optional] |



