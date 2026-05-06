

# KenyaNidBiometric2Input


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**idNumber** | **String** | The Kenya National ID Number (Nambari ya Kitambulisho) or Unique Personal Identifier (Maisha Namba).              This is the primary unique identifier for Kenyan citizens in all government systems, issued by the National Registration Bureau (NRB). The format is either 8 digits for National ID or 9 digits for Maisha Namba UPI (the new format since 2023). |  [optional] |
|**livenessImages** | **List&lt;byte[]&gt;** | An array of exactly 8 images required for biometric liveness verification. The first 7 images should be liveness frames captured during the liveness detection process, and the last image (8th) should be a selfie of the user. All images must be in JPEG format and each image must be less than 15MB in size. |  [optional] |
|**testSelfie** | **byte[]** | Test selfie for test environment (optional, maximum 15MB). Must be JPEG format. |  [optional] |



