

# AttachmentInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The unique identifier of the Attachment.              Pass this to the &#x60;GetAttachment&#x60; endpoint, along with the Session ID and the &#x60;resultsAccessKey&#x60; for said Session. |  |
|**type** | **String** | The type of the Attachment.              Possible values: - \&quot;selfie\&quot; - \&quot;document_front\&quot; - \&quot;document_back\&quot; - \&quot;document_portrait\&quot; - \&quot;document_signature\&quot; - \&quot;document_scan_report\&quot;              Additional attachment types may be defined for specific Providers. |  |
|**contentType** | **String** | The MIME type of the attachment&#39;s contents; eg, \&quot;image/jpeg\&quot; or \&quot;application/pdf\&quot;. |  |
|**sizeBytes** | **Integer** | The size in bytes of the attachment. |  |



