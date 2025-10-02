

# MdlIdentityData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**iacaRootCertificate** | [**MdlCertificateData**](MdlCertificateData.md) | Information about the IACA Root Certificate which signed the Issuer Certificate for this mDL. |  |
|**documentSignerCertificate** | [**MdlCertificateData**](MdlCertificateData.md) | Information about the Document Signer Certificate which signed the mDL presented by the user. |  |
|**nameSpaces** | **Map&lt;String, Map&lt;String, ExternalMdlFieldData&gt;&gt;** | The namespaces, and fields within those namespaces, which were present in the processed mDL. |  |



