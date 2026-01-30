

# MatchData

Match results for the data being matched against.              This applies to Providers which operate based on matching data / biometrics against a government database, returning match scores or results as opposed to the data itself.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nationalIdNumber** | [**Match**](Match.md) | Whether the provided National ID Number matched the information on file for the individual |  [optional] |
|**fullName** | [**Match**](Match.md) | The match score for the full name of the individual.              Higher values indicate a closer match. |  [optional] |
|**givenName** | [**Match**](Match.md) | The match score for the given (first) name of the individual.              Higher values indicate a closer match. |  [optional] |
|**middleName** | [**Match**](Match.md) | The match score for the middle name(s) of the individual.              Higher values indicate a closer match. |  [optional] |
|**familyName** | [**Match**](Match.md) | The match score for the family (last) name of the individual.              Higher values indicate a closer match. |  [optional] |
|**sex** | [**Match**](Match.md) | Whether the provided sex of the individual matched the information on file for the individual |  [optional] |
|**dateOfBirth** | [**Match**](Match.md) | Whether the provided date of birth matched the information on file for the individual |  [optional] |
|**phoneNumber** | [**Match**](Match.md) | Whether the provided phone number matched the information on file for the individual |  [optional] |
|**faceMatch** | [**Match**](Match.md) | The match score for the face match between the provided selfie image and the biometrics on file for the individual.              Higher values indicate greater match confidence. |  [optional] |
|**liveness** | [**Match**](Match.md) | The confidence score for the liveness check performed against the selfie image of the individual.              Higher values indicate lower suspicion. |  [optional] |
|**imageAuthenticity** | [**Match**](Match.md) | The confidence score for the image manipulation check performed against the selfie image of the individual.              Higher values indicate lower suspicion of image manipulation. |  [optional] |



