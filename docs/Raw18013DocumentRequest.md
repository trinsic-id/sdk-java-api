

# Raw18013DocumentRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**documentType** | **String** | The type of the document being requested, as defined by ISO specifications 18013-5, 18013-7, 23220-2, or a similar or related standard.              Common values: - \&quot;org.iso.18013.5.1.mDL\&quot; -- a Mobile Driver&#39;s License - \&quot;eu.europa.ec.eudi.pid.1\&quot; -- an EUDI Wallet PID - \&quot;com.google.wallet.idcard.1\&quot; -- a Google Wallet ID Pass - \&quot;org.iso.23220.photoid.1\&quot; -- a generic ISO 23220-2 compliant Photo ID (used by Apple Wallet&#39;s ID Pass) |  |
|**nameSpaces** | **Map&lt;String, Map&lt;String, Boolean&gt;&gt;** | The namespaces and attributes (PII) to request from the document.              This is a map of (nameSpaceName -&gt; (attributeName -&gt; willRetain)), where:              - nameSpaceName is the name of a NameSpace within the document - attributeName is the name of a specific attribute within the NameSpace - willRetain indicates, to the Wallet, whether you as the Relying Party intend to retain the data for longer than the scope of the transaction              Common namespace values: - \&quot;org.iso.18013.5.1\&quot; -- the primary namespace of a Mobile Driver&#39;s License or a Google Wallet ID Pass - \&quot;org.iso.18013.5.1.aamva\&quot; -- the secondary, AAMVA-defined namespace of a Mobile Driver&#39;s License - \&quot;eu.europa.ec.eudi.pid.1\&quot; -- the primary namespace of an EUDI Wallet PID - \&quot;org.iso.23220.1\&quot; -- the primary namespace of an ISO 23220-2 credential or an Apple Wallet ID Pass |  |



