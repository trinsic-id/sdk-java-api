

# CreateHostedProviderSessionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**provider** | **String** | The ID of the provider to launch |  |
|**redirectUrl** | **String** | The Redirect URL to which the user should be sent after the session is complete. |  |
|**providerInput** | [**ProviderInput**](ProviderInput.md) | Provider-specific input for those providers which require it.   &lt;b&gt;Deprecated:&lt;/b&gt; In the future, Hosted Provider Sessions will not accept input on creation, and will instead always redirect the user to a hosted interface to collect input. If you need to collect input from the user yourself, please use the Create Advanced Session endpoint instead. |  [optional] |



