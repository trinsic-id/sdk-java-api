

# CreateSessionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**launchProviderDirectly** | **Boolean** | Whether to immediately launch the identity provider, without invoking the Trinsic Widget UI.                Users will not be shown the Widget; therefore, reuse of credentials, selection of an identity provider, and saving a verification for future reuse  are not available to the end user in this mode.                Sessions created with this option enabled must be created with a &#x60;RedirectUrl&#x60; specified, and cannot be invoked using the frontend SDK at this time. |  [optional] |
|**enableRememberMe** | **Boolean** | Whether to enable Trinsic&#39;s \&quot;Remember Me\&quot; feature, which allows users to save their credentials for future use.                This option is only relevant when &#x60;LaunchProviderDirectly&#x60; is unspecified or set to &#x60;false&#x60;.  If &#x60;LaunchProviderDirectly&#x60; is &#x60;true&#x60;, this field must be unspecified or set to &#x60;false&#x60;.                If this field is set to &#x60;true&#x60;, then:    - The user will be prompted to authenticate with their phone number at the start of the flow    - If the user has previously saved a verification for reuse with Trinsic, they will be offered the ability to reuse it    - After the user has verified their identity (and if the identity provider in question supports it), they will be prompted to save their credentials for future use                If this field is set to &#x60;false&#x60;, then:    - The user will not be prompted to authenticate with their phone number at the start of the flow.      - Instead, the user will be immediately shown the list of available providers    - The user will not be offered the ability to reuse a previously-saved Trinsic credential    - After the user has verified their identity, they will not be prompted to save their credentials for future use      - Instead, they will immediately return to your product |  [optional] |
|**providers** | **List&lt;String&gt;** | The list of allowed identity providers. If not specified, all available providers will be allowed.                If &#x60;LaunchMethodDirectly&#x60; is &#x60;true&#x60;, this field must be set, and must have only a single entry.  If &#x60;LaunchMethodDirectly&#x60; is not specified or is &#x60;false&#x60;, this field may have any number of entries. |  [optional] |
|**disclosedFields** | [**DisclosedFieldsRequest**](DisclosedFieldsRequest.md) | Specific identity attributes to request. If not provided, all available attributes will be requested. |  [optional] |



