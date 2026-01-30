

# MdlOutputCertificateData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**serialNumber** | **String** | The serial number of the certificate |  |
|**commonName** | **String** | The common name (CN) of the certificate |  |
|**stateOrProvinceName** | **String** | The stateOrProvinceName field from the signing certificate.              Per the ISO 18013-5 (mDL) spec, this is an ISO 3166-2:2020 country subdivision code (e.g., \&quot;US-CA\&quot; for California, USA).              May be an empty string for certificates which are not state-specific (e.g., Google Wallet&#39;s ID Pass certificates). |  |
|**notBefore** | **OffsetDateTime** | The date before which this certificate is not valid. |  |
|**notAfter** | **OffsetDateTime** | The date after which this certificate is not valid. |  |



