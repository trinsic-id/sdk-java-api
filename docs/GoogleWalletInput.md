

# GoogleWalletInput


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**exchangeMechanism** | **MdlExchangeMechanism** | The exchange mechanism to use for this Google Wallet verification.              Use &#x60;DigitalCredentialsApi&#x60; for Digital Credentials API on web, or &#x60;NativeApp&#x60; for a native Android app. |  [optional] |
|**previewRaw18013Request** | [**Raw18013RequestInput**](Raw18013RequestInput.md) | **Preview feature: not suitable for production use cases**              The raw 18013-7 exchange request to use for this verification.              If set, this overrides any default configuration on your Verification Profile.              NOTE: This parameter has no effect in live mode for Google Wallet verifications. Dynamic requests are currently only supported in test mode for Google Wallet. |  [optional] |



