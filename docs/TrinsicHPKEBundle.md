

# TrinsicHPKEBundle


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**trinsicHpkeVersion** | **Integer** | The version of the Trinsic HPKE Exchange Protocol in use.              Always &#x60;1&#x60; at this time. |  |
|**metadata** | [**TrinsicHPKEMetadata**](TrinsicHPKEMetadata.md) | Information about the HPKE parameters in use.              Trinsic currently supports a fixed set of HPKE parameters: - Mode: Basic - KEM: DHKEM(P256, HKDF-SHA256) - KDF: HKDF-SHA256 - AEAD: AES-128-GCM |  |
|**ephemeralSenderPublicKey** | **byte[]** | Corresponds to the &#x60;enc&#x60; parameter of HPKE.              The raw bytes, in a format unique to the chosen HPKE KEM, of the ephemeral sender public key for this single-shot HPKE exchange.              Because Trinsic only supports DHKEM(P256, HKDF-SHA256), this is always a 65-byte array with the following format: [0x04][XCoord][YCoord]              Where [0x04] is a single byte with value &#x60;4&#x60;, and [XCoord] / [YCoord] are each 32-byte X/Y coordinates of a P-256 public key. |  |
|**ciphertext** | **byte[]** | Corresponds to the &#x60;ct&#x60; parameter of HPKE.              The encrypted ciphertext for this HPKE single-shot message.              Because Trinsic only supports AES-128-GCM, this byte array always has an exact format: [CipherText][Tag]              Where [ciphertext] is a variable-length array of bytes, and [tag] is a 16-length byte array. |  |



