

# Iso180135DrivingPrivilege

A single driving privilege entry from the mDL `driving_privileges` field, per ISO 18013-5.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**vehicleCategoryCode** | **String** | Vehicle category code that the holder is authorized to operate. |  |
|**issueDate** | **LocalDate** | Date when this driving privilege was issued. |  [optional] |
|**expiryDate** | **LocalDate** | Date when this driving privilege expires. |  [optional] |
|**codes** | [**List&lt;Iso180135DrivingPrivilegeCode&gt;**](Iso180135DrivingPrivilegeCode.md) | Restriction, condition, or special privilege codes attached to this entry. |  [optional] |



