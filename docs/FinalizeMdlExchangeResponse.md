

# FinalizeMdlExchangeResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**exchangeId** | **UUID** | The Exchange ID of the mDL exchange which was just finalized. |  |
|**createdSession** | [**Session**](Session.md) | The AcceptanceSession which was created as a result of finalizing this mDL exchange. |  |
|**mdlData** | [**MdlIdentityData**](MdlIdentityData.md) | The identity data from the mDL exchange, in a semi-normalized format.              Supports all possible fields and namespaces, but does not map them to Trinsic&#39;s common data model. |  [optional] |
|**normalizedIdentityData** | [**IdentityData**](IdentityData.md) | The identity data from the mDL exchange, normalized into Trinsic&#39;s common data model. |  [optional] |



