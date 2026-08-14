

# GoogleWalletProviderOutput

Exposed properties for the `google-wallet` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mobileDriversLicense** | [**Iso180135MobileDriversLicenseCredential**](Iso180135MobileDriversLicenseCredential.md) | A standard 18013-5 Mobile Driver&#39;s License credential, retrieved from the individual&#39;s wallet. |  [optional] |
|**idPass** | [**GoogleWalletIdPassCredential**](GoogleWalletIdPassCredential.md) | A Google Wallet ID Pass credential (&#x60;com.google.wallet.idcard.1&#x60;), retrieved from the individual&#39;s wallet. |  [optional] |
|**rawMdlOutput** | [**MdlOutput**](MdlOutput.md) | The raw output of the mDL exchange performed through Google Wallet. |  [optional] |



