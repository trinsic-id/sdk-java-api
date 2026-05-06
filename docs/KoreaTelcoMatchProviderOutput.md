

# KoreaTelcoMatchProviderOutput

Exposed properties for the `korea-telco-match` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**phoneNumber** | **String** | The verified phone number as submitted by the relying party. |  |
|**teleType** | **String** | The mobile carrier used for verification. Possible values: &lt;list type&#x3D;\&quot;bullet\&quot;&gt;&lt;item&gt;&lt;description&gt;Lgu&lt;/description&gt;&lt;/item&gt;&lt;item&gt;&lt;description&gt;Skt&lt;/description&gt;&lt;/item&gt;&lt;item&gt;&lt;description&gt;Kt&lt;/description&gt;&lt;/item&gt;&lt;/list&gt; |  |
|**resultCode** | **String** | The RaonSecure result code returned by the carrier verification system. \&quot;0000\&quot; indicates a successful match.              Common error codes: - \&quot;0000\&quot;: Successful match - \&quot;0001\&quot;: Identity Verification Failed - Verification Information Mismatch (General) - \&quot;0002\&quot;: Identity Verification Failed - Unable to Verify Phone Number - \&quot;0004\&quot;: Identity Verification Failed - Date of Birth Verification Error - \&quot;0005\&quot;: Identity Verification Failed - Gender Verification Error - \&quot;0006\&quot;: Identity Verification Failed - Name Verification Error - \&quot;0009\&quot;: Identity Verification Failed - Device OS Mismatch |  |



