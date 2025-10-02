

# CreateMdlExchangeRequest

Request to create an mDL Exchange.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**verificationProfileId** | **UUID** | The ID of the VerificationProfile to use for this mDL exchange. |  |
|**provider** | **String** | The ID of the provider to use for this mDL exchange. |  |
|**exchangeMechanism** | **MdlExchangeMechanism** | The mechanism by which the mDL exchange will occur (web, native SDK, etc.) |  |
|**documentType** | **String** | The document type to request from the wallet.              Typically, this is one of the following values:              - &#x60;org.iso.18013.5.1.mDL&#x60; (Mobile Driver&#39;s License) - &#x60;com.google.wallet.idcard.1&#x60; (Google Wallet ID Pass) |  |
|**nameSpaces** | **Map&lt;String, Map&lt;String, Boolean&gt;&gt;** | The namespaces and fields to request from the mDL.              This is a nested map / dictionary. The outer dictionary&#39;s keys are namespaces (e.g. \&quot;org.iso.18013.5.1\&quot;). The inner dictionary&#39;s keys are field names within each namespace, with boolean values indicating whether the specified field will be retained post-verification. |  |
|**digitalCredentialsApiHost** | **String** | If using the &#x60;DigitalCredentialsApi&#x60; exchange mechanism, this is the hostname on which the Digital Credentials API will be called.              For example, if the user is on the page &#x60;https://foo.example.com/verify-mdl&#x60;, the proper value to use is &#x60;foo.example.com&#x60;.              Present for ease of testing only. May be removed as this API is stabilized. |  [optional] |
|**androidNativeAppPackageName** | **String** | If using the &#x60;NativeApp&#x60; exchange mechanism with the &#x60;google-wallet&#x60; provider, this is the package name of the Android App which will execute the mDL exchange.              This should be set to the package name of your app.              Present for ease of testing only. May be removed as this API is stabilized. |  [optional] |
|**androidNativeAppSigningCertificateFingerprint** | **String** | If using the &#x60;NativeApp&#x60; exchange mechanism with the &#x60;google-wallet&#x60; provider, this is the SHA-256 fingerprint of the signing certificate used to sign the Android App which will execute the mDL exchange.              Present for ease of testing only. May be removed as this API is stabilized. |  [optional] |



