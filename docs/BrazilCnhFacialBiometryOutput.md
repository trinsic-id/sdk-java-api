

# BrazilCnhFacialBiometryOutput


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**databaseFaceAvailable** | **Boolean** | Whether the government database had facial biometrics available for comparison. |  [optional] |
|**probability** | **String** | Probability bucket returned by Serpro for the facial biometric comparison.              Known values: - VeryLow - Low - High - VeryHigh |  [optional] |
|**similarityScore** | **Double** | Similarity score returned by Serpro for the facial biometric comparison.              Ranges from 0.0 to 1.0, where 1.0 is a perfect match. |  [optional] |
|**liveness** | **String** | Liveness result returned by Serpro when liveness is part of the validation response.              Known values: - BAD_QUALITY: The image quality was too low for liveness validation. - FAKE: Liveness validation detected a presentation attack or non-live face. - REAL: Liveness validation detected a live face. |  [optional] |



