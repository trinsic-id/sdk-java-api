

# MdlOutput


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**iacaRootCertificate** | [**MdlOutputCertificateData**](MdlOutputCertificateData.md) | Information about the IACA Root Certificate which signed (directly or indirectly) the Document Signer Certificate for this mDL. |  |
|**documentSignerCertificate** | [**MdlOutputCertificateData**](MdlOutputCertificateData.md) | Information about the Document Signer Certificate which signed the mDL presented by the user. |  |
|**documentType** | **String** | The document type of the mDL presented by the user.              Common values: - \&quot;org.iso.18013.5.1.mDL\&quot; for ISO 18013-5 mDLs - \&quot;com.google.wallet.idcard.1\&quot; for Google Wallet ID Cards |  |
|**nameSpaces** | **Map&lt;String, Map&lt;String, MdlOutputFieldData&gt;&gt;** | The namespaces, and fields within those namespaces, which were present in the processed mDL. |  |



