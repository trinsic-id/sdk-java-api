

# GetAttachmentResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**content** | **byte[]** | The file contents of the Attachment. When using an SDK, this can be a raw byte array. In raw JSON form this is Base64. Combine this with the Content type to reconstruct the file.              This is empty when &#x60;encryptedContent&#x60; is present. |  |
|**encryptedContent** | [**TrinsicHPKEBundle**](TrinsicHPKEBundle.md) | The HPKE Bundle containing the encrypted contents of the Attachment, if secured via HPKE.              Decrypt it using the HPKE info string &#x60;trinsic-hpke:1:attachment-contents:{sessionId}:{attachmentId}&#x60;. |  [optional] |
|**contentType** | **String** | The MIME type of the Attachment data |  |



