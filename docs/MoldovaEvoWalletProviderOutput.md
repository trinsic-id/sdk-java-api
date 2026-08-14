

# MoldovaEvoWalletProviderOutput

Exposed properties for the `moldova-evo-wallet` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**identityCard** | [**MoldovaIdentityCardCredential**](MoldovaIdentityCardCredential.md) | A Moldovan Identity Card credential, retrieved from the individual&#39;s wallet. |  [optional] |
|**driverLicense** | [**MoldovaDriverLicenseCredential**](MoldovaDriverLicenseCredential.md) | A Moldovan Driver License credential, retrieved from the individual&#39;s wallet. |  [optional] |
|**pid** | [**EudiPidCredential**](EudiPidCredential.md) | An EUDI Person Identification Data (PID) credential, retrieved from the individual&#39;s wallet.              NOTE: Although this credential aligns with the EUDI PID specification, Moldova is not an EU member state. |  [optional] |
|**vehicleRegistrationCertificate** | [**MoldovaVehicleRegistrationCertificateCredential**](MoldovaVehicleRegistrationCertificateCredential.md) | A Moldovan Vehicle Registration Certificate credential, retrieved from the individual&#39;s wallet. |  [optional] |
|**raw18013Output** | [**MdlOutput**](MdlOutput.md) | The raw output of the 18013-7 exchange performed through EVO Wallet. |  [optional] |



