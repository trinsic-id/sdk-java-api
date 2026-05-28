

# Iso180132BiometricTemplate

A single biometric template per ISO 18013-2 Table C.12.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**header** | [**Iso180132BiometricTemplateHeader**](Iso180132BiometricTemplateHeader.md) | Header describing the biometric template. |  |
|**dataBlock** | **byte[]** | The raw data block, in a biometric type- and format-specific encoding.              For &#x60;face&#x60; and &#x60;signature_usual_mark&#x60;, this is a raw JPEG or JPEG2000 image.              See ISO 18013-2 and 18013-5. |  |
|**dataIsEncrypted** | **Boolean** | Whether the data block is encrypted. |  |
|**biometricInformationRecordPayload** | **byte[]** | Optional Biometric Information Record payload, containing arbitrary domestic data. |  [optional] |



