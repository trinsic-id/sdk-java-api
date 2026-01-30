

# LaWalletProviderOutput

Exposed properties for the `usa-louisiana-wallet` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**driversLicenseNumber** | **String** | The number of the driver&#39;s license used to create the LA Wallet credential |  |
|**issueDate** | **LocalDate** | The issue date of the driver&#39;s license used to create the LA Wallet credential |  |
|**expirationDate** | **LocalDate** | The expiration date of the driver&#39;s license used to create the LA Wallet credential |  |
|**auditNumber** | **String** | The 4-digit audit number of the driver&#39;s license used to create the LA Wallet credential |  |
|**licenseStatus** | **String** | The license status from the LA Wallet credential |  |
|**licenseClass** | **String** | The license class from the LA Wallet credential              Possible values: - \&quot;A\&quot;: Commercial Driver&#39;s License, Combination Vehicles - \&quot;B\&quot;: Commercial Driver&#39;s License, Heavy Straight Vehicle - \&quot;C\&quot;: Commercial Driver&#39;s License, Light Straight Vehicle - \&quot;D\&quot;: Chauffeur&#39;s Driver&#39;s License - \&quot;E\&quot;: Driver&#39;s License for Personal Vehicle |  |
|**firstName** | **String** | The first name from the LA Wallet credential |  |
|**middleName** | **String** | The middle name from the LA Wallet credential |  |
|**lastName** | **String** | The last name from the LA Wallet credential |  |
|**dateOfBirth** | **LocalDate** | The date of birth from the LA Wallet credential |  |
|**sex** | **String** | The sex from the LA Wallet credential |  |
|**addressLine1** | **String** | The address&#39; line 1 from the LA Wallet credential |  |
|**addressLine2** | **String** | The address&#39; line 2 from the LA Wallet credential |  [optional] |
|**addressCity** | **String** | The address&#39; city from the LA Wallet credential |  |
|**addressState** | **String** | The address&#39; state from the LA Wallet credential |  |
|**addressZip** | **String** | The address&#39; ZIP from the LA Wallet credential |  |
|**county** | **String** | The county (\&quot;parish\&quot;) code from the LA Wallet credential.              This is a number from 1 to 64, representing one of Louisiana&#39;s 64 parishes. |  |
|**coarseAge** | **String** | The coarse age returned by LA Wallet for this credential              Possible values: - \&quot;Under 18\&quot; - \&quot;Under 21\&quot; - \&quot;Over 21\&quot; |  |



