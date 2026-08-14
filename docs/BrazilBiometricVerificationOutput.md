

# BrazilBiometricVerificationOutput


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**selfieVerificationProbability** | **String** | The probability of the selfie verification being successful.              Possible values: - VeryLow - Low - High - VeryHigh |  [optional] |
|**selfieLivenessOutcome** | **String** | The outcome of the selfie verification.              Possible values: - Real - Fake - BadQuality |  [optional] |
|**databaseSelfieAvailable** | **Boolean** | Whether the government database had biometrics available for the individual.              Also false in some cases biometrics are available but not sufficient for selfie verification. |  [optional] |
|**selfieSimilarityPercentage** | **Double** | Similarity match score of selfie verification.              Ranges from 0.0 to 1.0. |  [optional] |



