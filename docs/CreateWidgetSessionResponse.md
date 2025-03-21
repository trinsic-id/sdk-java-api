

# CreateWidgetSessionResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sessionId** | **UUID** | The ID of the newly-created Acceptance Session |  |
|**launchUrl** | **String** | The URL that should be used to invoke the Acceptance Session on your user&#39;s device.                You can use our frontend SDKs to launch the user into the Acceptance Session, or you can redirect the user&#39;s browser to this URL.                This URL is sensitive and as such can only be obtained once. If you need to obtain it again, you will need to create a new Acceptance Session. |  [optional] |



