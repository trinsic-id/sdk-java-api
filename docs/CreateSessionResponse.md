

# CreateSessionResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**session** | [**Session**](Session.md) | The created Acceptance Session |  |
|**launchUrl** | **String** | The URL that should be used to invoke the Acceptance Session on your user&#39;s device.                If the Session was created with &#x60;LaunchMethodDirectly&#x60; set to &#x60;true&#x60;, you should redirect your user&#39;s browser to this URL. The frontend SDK cannot presently be used to  invoke these Sessions.                Otherwise, you should pass this URL to your user&#39;s frontend and use the frontend SDK to invoke the Session.                This URL is sensitive and as such can only be obtained once. If you need to obtain it again, you will need to create a new Acceptance Session. |  [optional] |



