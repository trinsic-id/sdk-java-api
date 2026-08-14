

# AppleWalletProviderOutput

Exposed properties for the `apple-wallet` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mobileDriversLicense** | [**Iso180135MobileDriversLicenseCredential**](Iso180135MobileDriversLicenseCredential.md) | A standard 18013-5 Mobile Driver&#39;s License credential, retrieved from the individual&#39;s wallet. |  [optional] |
|**digitalId** | [**AppleWalletDigitalIdCredential**](AppleWalletDigitalIdCredential.md) | An Apple Wallet Digital ID credential (&#x60;org.iso.23220.photoid.1&#x60;), retrieved from the individual&#39;s wallet. |  [optional] |
|**rawMdlOutput** | [**MdlOutput**](MdlOutput.md) | The raw output of the mDL exchange performed through Apple Wallet. |  [optional] |



