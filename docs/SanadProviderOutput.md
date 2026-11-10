

# SanadProviderOutput

Exposed properties for the `jordan-sanad` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nationalNumber** | **String** | The national number (الرقم الوطني).              This is a ten-digit number, with leading zeros preserved. The number is different from the identity-card number. |  [optional] |
|**dateOfBirth** | **LocalDate** | The date of birth of the individual. |  [optional] |
|**fullName** | **String** | The full name of the individual. |  [optional] |
|**documentNumber** | **String** | The identity-card number, separate from the national number.              The format is three letters and five digits. |  [optional] |
|**expirationDate** | **LocalDate** | The document expiration date. |  [optional] |
|**qrCreatedDate** | **LocalDate** | The QR creation date, not the document&#39;s issue date. |  [optional] |



