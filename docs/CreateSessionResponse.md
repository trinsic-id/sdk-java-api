

# CreateSessionResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**session** | [**Session**](Session.md) | The created Acceptance Session |  |
|**launchUrl** | **String** | The URL that should be used to invoke the Acceptance Session on your user&#39;s device.                You can use our frontend SDKs to launch the user into the Acceptance Session, or you can redirect the user&#39;s browser to this URL.  If the Session was created with &#x60;LaunchProviderDirectly&#x60; set to &#x60;true&#x60;, you can&#39;t use the iFrame mode.                This URL is sensitive and as such can only be obtained once. If you need to obtain it again, you will need to create a new Acceptance Session. |  [optional] |



