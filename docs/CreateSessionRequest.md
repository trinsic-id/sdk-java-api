

# CreateSessionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**launchMethodDirectly** | **Boolean** | Whether to immediately launch the identity provider, without invoking the Trinsic Connect Widget UI.                Users will not be shown the Connect Widget; therefore, reuse of Connect credentials, selection of an identity provider, and saving a verification for future reuse  are not available to the end user in this mode.                Sessions created with this option enabled must be created with a &#x60;RedirectUrl&#x60; specified, and cannot be invoked using the frontend SDK at this time. |  [optional] |
|**providers** | **List&lt;String&gt;** | The list of allowed identity providers. If not specified, all available providers will be allowed.                If &#x60;LaunchMethodDirectly&#x60; is &#x60;true&#x60;, this field must be set, and must have only a single entry.  If &#x60;LaunchMethodDirectly&#x60; is not specified or is &#x60;false&#x60;, this field may have any number of entries. |  [optional] |
|**disclosedFields** | [**DisclosedFieldsRequest**](DisclosedFieldsRequest.md) | Specific identity attributes to request. If not provided, all available attributes will be requested. |  [optional] |



