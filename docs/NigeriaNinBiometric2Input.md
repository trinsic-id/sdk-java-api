

# NigeriaNinBiometric2Input


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**idNumber** | **String** | The user&#39;s Nigerian National ID number (NIN) |  [optional] |
|**livenessImages** | **List&lt;byte[]&gt;** | An array of exactly 8 images required for biometric liveness verification. The first 7 images should be liveness frames captured during the liveness detection process, and the last image (8th) should be a selfie of the user. All images must be in JPEG format and each image must be less than 15MB in size. |  [optional] |
|**testSelfie** | **byte[]** | Test selfie for test environment (optional, maximum 15MB). Must be JPEG format. |  [optional] |



