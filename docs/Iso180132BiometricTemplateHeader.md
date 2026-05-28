

# Iso180132BiometricTemplateHeader

Header fields of a biometric template per ISO 18013-2 Table C.12.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**patronHeaderVersion** | **Integer** | Patron header version (defaults to 0x0101). |  |
|**biometricType** | **Integer** | Biometric type code per ISO 18013-2. |  [optional] |
|**biometricSubType** | **Integer** | Biometric sub-type code per ISO 18013-2. |  [optional] |
|**creationDate** | **OffsetDateTime** | Date and time the biometric template was created. |  [optional] |
|**biometricInformationRecordCreator** | **String** | Name of the Biometric Information Record (BIR) creator. |  [optional] |
|**validityPeriod** | [**Iso180132BiometricValidityPeriod**](Iso180132BiometricValidityPeriod.md) | Validity period of the biometric data block. |  [optional] |
|**biometricDataBlockProduct** | [**Iso180132BiometricDataBlockProduct**](Iso180132BiometricDataBlockProduct.md) | Owner and type identifying the product that produced the biometric data block. |  [optional] |
|**biometricDataBlockFormatOwner** | **Integer** | Format owner of the biometric data block. |  |
|**biometricDataBlockFormatType** | **Integer** | Format type of the biometric data block. |  |
|**biometricInformationRecordIndex** | **String** | Index identifier of the Biometric Information Record, when present. |  [optional] |



