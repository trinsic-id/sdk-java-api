

# RecommendRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**phoneNumber** | **String** | The phone number of the user you wish to generate a recommendation for. Will be used to look up the user&#39;s identity in the network |  [optional] |
|**countries** | **List&lt;String&gt;** | A list of countries, in alpha-2 ISO 3166 format, you wish to specify for the recommendation, this can include the user&#39;s country of residence, nationality, etc. |  [optional] |
|**subdivisions** | **List&lt;String&gt;** | If one of the countries has subdivisions, for example the US states, you can specify a list of these to further refine the recommendation (e.g., CA, UT, NY) |  [optional] |
|**ipAddresses** | **List&lt;String&gt;** | Provide the IP addresses of the user you wish to generate a recommendation for. Will be used to look up the user&#39;s geographic location. |  [optional] |
|**includeDisabledProviders** | **Boolean** | If true, the recommendation will include providers that are disabled for the app |  [optional] |



