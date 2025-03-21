

# CreateWidgetSessionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**redirectUrl** | **String** | The URL to redirect the user to after the widget session is complete.                *Note*: this should NOT be set if you intend to use Trinsic&#39;s Web UI SDK to launch the Widget  as an embedded iFrame or popup; in that case, session resolution is handled by our SDK, not via redirect. |  [optional] |
|**providers** | **List&lt;String&gt;** | The list of allowed identity providers. If not specified, all available providers will be allowed. |  [optional] |
|**knownIdentityData** | [**KnownIdentityData**](KnownIdentityData.md) | Known identity data of an individual being verified.                Provide this to Trinsic during Session creation to enable improved identity provider selection recommendations. |  [optional] |



