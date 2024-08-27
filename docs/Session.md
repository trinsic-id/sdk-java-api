

# Session


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**state** | **SessionState** | The state of the session |  |
|**failCode** | **SessionFailCode** | If the session is in state &#x60;IdvFailed&#x60;, this field contains the reason for failure. |  [optional] |
|**verification** | [**Verification**](Verification.md) | The underlying verification for this Session |  |
|**disclosedFields** | [**DisclosedFields**](DisclosedFields.md) | The fields that were requested to be disclosed when the Session was created |  |
|**created** | **Long** | The unix timestamp, in seconds, when this session was created |  |
|**updated** | **Long** | The unix timestamp, in seconds, when this session&#39;s state last changed |  |



