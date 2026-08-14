

# MoldovaVehicleRegistrationCertificateCredential

A Moldovan Vehicle Registration Certificate credential, with document type `md.gov.wallet.vrc.1`, retrieved from the Moldovan EVO wallet.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**plateNumber** | **String** | The registered vehicle&#39;s plate number. |  [optional] |
|**idnv** | **String** | The registered vehicle&#39;s IDNV (Numărul de Identificare a Vehiculului), the identifier assigned to the vehicle in the Moldovan State Register of Transport.              This is a Moldovan registry identifier and is distinct from the manufacturer&#39;s VIN. |  [optional] |
|**vin** | **String** | The vehicle&#39;s manufacturer-assigned Vehicle Identification Number (VIN), per ISO 3779. |  [optional] |
|**make** | **String** | The make (manufacturer brand) of the vehicle. |  [optional] |
|**model** | **String** | The commercial model name of the vehicle. |  [optional] |
|**color** | **String** | The color of the vehicle, as recorded by the issuer.              TODO: Possible values? |  [optional] |
|**category** | **String** | The vehicle&#39;s EU vehicle category code. |  [optional] |
|**year** | **Integer** | The vehicle&#39;s year of manufacture. |  [optional] |
|**bodyNumber** | **String** | The body number of the vehicle, if recorded separately from the VIN. |  [optional] |
|**bodyType** | **String** | The body type of the vehicle, as recorded by the issuer.              This is a free text field with no guaranteed format. |  [optional] |
|**chassisNumber** | **String** | The chassis number of the vehicle, if recorded separately from the VIN. |  [optional] |
|**engineVolume** | **String** | The engine displacement volume of the vehicle, as recorded by the issuer (typically in cubic centimeters).              This is a free text field with no guaranteed format. |  [optional] |
|**engineType** | **String** | The engine/fuel type of the vehicle, as recorded by the issuer.              This is a free text field with no guaranteed format. |  [optional] |
|**engineNumber** | **String** | The engine number of the vehicle. |  [optional] |
|**authorizedWeight** | **Integer** | The maximum technically permissible laden mass of the vehicle, in kilograms. |  [optional] |
|**weight** | **Integer** | The mass of the vehicle in service (unladen / kerb weight), in kilograms. |  [optional] |
|**places** | **Integer** | The number of seating positions in the vehicle, including the driver. |  [optional] |
|**idnp** | **String** | The IDNP (Numărul de Identificare Personal) of the vehicle&#39;s registered holder.              This is a 13-digit number which uniquely identifies all natural persons in the Republic of Moldova. It has the format &#x60;2YYYOOOSSSSSX&#x60;, where: - &#x60;2&#x60; is the literal number &#x60;2&#x60; to indicate that the identifier belongs to a natural person - &#x60;YYY&#x60; is the last 3 digits of the year in which the identifier was issued - &#x60;OOO&#x60; is the code of the registrar office which issued the identifier - &#x60;SSSSS&#x60; is the sequential birth number for that year - &#x60;X&#x60; is a check digit              Note that the year encoded in the identifier is not necessarily the same as the year of birth of the individual. |  [optional] |
|**familyName** | **String** | The family name (surname) of the vehicle&#39;s registered holder. |  [optional] |
|**givenName** | **String** | The given name(s) of the vehicle&#39;s registered holder. |  [optional] |
|**address** | **String** | The registered address of the vehicle&#39;s holder, as a single formatted string. |  [optional] |
|**vehicleRight** | **String** | The legal relationship the registration holder has to the vehicle (e.g. owner vs. authorized user), as recorded by the issuer.              TODO: Values |  [optional] |
|**specialRemarks** | **List&lt;String&gt;** | Free-text remarks or annotations recorded on the registration certificate. |  [optional] |
|**issueDate** | **LocalDate** | The date the registration certificate was issued. |  [optional] |
|**expiryDate** | **LocalDate** | The date the registration certificate expires. |  [optional] |
|**issuingAuthority** | **String** | The name of the authority that issued the registration certificate. |  [optional] |
|**documentNumber** | **String** | The number of the registration certificate document itself. |  [optional] |



