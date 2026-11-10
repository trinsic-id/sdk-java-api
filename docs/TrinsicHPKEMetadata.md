

# TrinsicHPKEMetadata


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mode** | **Integer** | The HPKE mode in use. Trinsic only currently supports the Basic mode.              There are four modes defined in the HPKE specification:              - Basic (0): Sender is not authenticated - PSK (1): Sender is authenticated by proving possession of a Pre-Shared Key (byte array) which the recipient also knows. - Auth (2): Sender is authenticated by proving possession of a Private Key, for which the recipient knows the corresponding Public Key. - AuthPSK (3): Sender is authenticated by proving possession of both a Pre-Shared Key and a Private Key. |  |
|**kem** | **Integer** | The Key Encapsulation Mechanism (KEM) used for the HPKE handshake.              Trinsic currently only supports the DHKEM(P256, HKDF-SHA256) KEM, meaning that only P-256 keys are supported. |  |
|**kdf** | **Integer** | The Key Derivation Function (KDF) used for the HPKE handshake.              Trinsic currently only supports HKDF-SHA256. |  |
|**aead** | **Integer** | The symmetric encryption cipher used for ciphertext encryption and decryption.              Trinsic currently only supports AES-128-GCM. |  |
|**infoHash** | **byte[]** | SHA-256 hash of the &#x60;info&#x60; parameter used during HPKE encryption.              This is not used in HPKE directly.              This is provided as a helper for debugging and development purposes, to verify that the same &#x60;info&#x60; hash is being used by both Trinsic and your integration. |  |
|**recipientPublicKeyHash** | **byte[]** | SHA-256 hash of the recipient&#39;s P-256 public key in raw uncompressed point encoding ([0x04][X][Y]).              This is not used in HPKE directly.              Use this to verify that an HPKE message was encrypted against your public key, and/or to identify which of your keys a message was encrypted against, before proceeding with decryption.              This and &#x60;recipientPublicKeyJwkThumbprint&#x60; are both effectively hashes of the recipient&#39;s (your) public key. Either is appropriate to use for the same purpose. |  |
|**recipientPublicKeyJwkThumbprint** | **String** | JWK Thumbprint of the recipient&#39;s P-256 public key, in base64url encoding.              This is not used in HPKE directly.              Use this to verify that an HPKE message was encrypted against your public key, and/or to identify which of your keys a message was encrypted against, before proceeding with decryption.              This and &#x60;recipientPublicKeyHash&#x60; are both effectively hashes of the recipient&#39;s (your) public key. Either is appropriate to use for the same purpose. |  |



