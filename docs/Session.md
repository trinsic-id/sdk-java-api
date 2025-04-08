

# Session


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**done** | **Boolean** | Whether the Session is in a terminal / final state.              If this is &#x60;true&#x60;, inspect the value of &#x60;Success&#x60; to determine whether the Session was successful. |  |
|**success** | **Boolean** | Whether the Session has completed successfully.              If this is &#x60;false&#x60;, the Session is either not yet done, or has failed. Inspect &#x60;Done&#x60; and &#x60;ErrorCode&#x60; for more information. If this is &#x60;true&#x60;, the Session has completed successfully. |  |
|**errorCode** | **SessionErrorCode** | The reason for the Session&#39;s failure.              Only present if &#x60;Success&#x60; is &#x60;false&#x60;. |  [optional] |
|**created** | **Long** | The unix timestamp, in seconds, when this session was created |  |
|**updated** | **Long** | The unix timestamp, in seconds, when this session&#39;s state last changed |  |



