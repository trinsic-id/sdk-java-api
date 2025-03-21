

# BrazilDigitalCnhInput


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cpfNumber** | **String** | The user&#39;s 11-digit, numeric CPF Number |  |
|**digitalCnhFile** | **byte[]** | The raw bytes of the digital CNH file collected from the user.                TODO: Lucas or JP help me describe these below vvvvvvvv  This can be:  - An image containing a physical or digital QR code  - A PDF file exported from the CNH app  - Some scary third thing? |  [optional] |
|**digitalCnhFileContentType** | **String** | The MIME Type of the file contained in &#x60;DigitalCnhFile&#x60;.                Must be one of &#x60;application/pdf&#x60;, &#x60;image/jpeg&#x60;, or &#x60;image/png&#x60;. |  [optional] |
|**facialBiometryPhoto** | **byte[]** | The raw bytes of the image of the user&#39;s face, collected for biometric comparison. |  [optional] |



