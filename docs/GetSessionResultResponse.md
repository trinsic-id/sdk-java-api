

# GetSessionResultResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**session** | [**Session**](Session.md) | The Session in its current state. |  |
|**identityData** | [**IdentityData**](IdentityData.md) | The IdentityData which resulted from the Session, if not HPKE-encrypted. |  [optional] |
|**encryptedIdentityData** | [**TrinsicHPKEBundle**](TrinsicHPKEBundle.md) | The HPKE-encrypted IdentityData which resulted from the Session, if HPKE-encrypted. |  [optional] |



