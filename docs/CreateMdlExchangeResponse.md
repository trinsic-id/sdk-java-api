

# CreateMdlExchangeResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**exchangeId** | **UUID** | The ID of the mDL exchange which was created. |  |
|**requestObjectBase64Url** | **String** | The request object for this mDL exchange.              Pass this into a Trinsic mDL SDK (Web, iOS, Android) exactly as-is to initiate the mDL exchange. |  |
|**exchangeContext** | **String** | The encrypted exchange context for this mDL exchange.              This must be passed back to the API during finalization, alongside the response token from the wallet. |  |



