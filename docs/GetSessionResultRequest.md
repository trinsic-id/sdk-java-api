

# GetSessionResultRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**resultsAccessKey** | **String** | The Results Access Key to exchange |  |
|**redirectToken** | **String** | The &#x60;redirectToken&#x60; which Trinsic appended to your Redirect URL before sending the user back to your application.              This is only relevant for Sessions which involve a redirect flow.              If a &#x60;redirectToken&#x60; is required for a Session, it is only required for the first call to &#x60;GetSessionResult&#x60;. Future calls do not require a &#x60;redirectToken&#x60;. |  [optional] |



