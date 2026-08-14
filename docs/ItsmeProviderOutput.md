

# ItsmeProviderOutput

Exposed properties for the `itsme` Provider which do not directly map to the normalized IdentityData model.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dateOfBirth** | **LocalDate** | The date of birth of the verified individual.              Availability by ID document issuing country: always returned for supported issuing countries except Belgium, where it is best effort. |  [optional] |
|**email** | **String** | The email address of the verified individual.              Availability by ID document issuing country: best effort for all supported issuing countries. |  [optional] |
|**phoneNumber** | **String** | The phone number of the verified individual, with a leading + country calling code.              Availability by ID document issuing country: always returned for all supported issuing countries. |  [optional] |
|**sub** | **String** | The stable OpenID Connect (OIDC) subject (sub) identifier.              This should be a stable identifier, however, if a user deletes and recreates an account, this identifier will change. |  [optional] |
|**fullName** | **String** | The full name of the verified individual.              Availability by ID document issuing country: always returned for all supported issuing countries. |  [optional] |
|**givenName** | **String** | The given name of the verified individual.              Availability by ID document issuing country: best effort for all supported issuing countries. |  [optional] |
|**familyName** | **String** | The family name of the verified individual.              Availability by ID document issuing country: always returned for all supported issuing countries. |  [optional] |
|**dateOfBirthAsString** | **String** | The date of birth of the verified individual in itsme&#39;s document-facing string format.              Availability by ID document issuing country: best effort for Belgian-issued ID documents; not returned for other supported issuing countries. |  [optional] |
|**gender** | **String** | The gender claim for the verified individual.              Availability by ID document issuing country: always returned for supported issuing countries except Netherlands, where it is best effort.              Known values: - Female - Male - Unknown |  [optional] |
|**locale** | **String** | The itsme app language as an uppercase language code.              Availability by ID document issuing country: best effort for all supported issuing countries.              Known values: - NL - FR - DE - EN |  [optional] |
|**pictureUrl** | **String** | The URL of the profile picture resource.              Availability by ID document issuing country: always returned for supported issuing countries except Belgium, where it is best effort. |  [optional] |
|**emailVerified** | **Boolean** | Whether itsme reports the email address as verified.              Availability by ID document issuing country: returned only if &#x60;email&#x60; is available.              Note: itsme currently documents that this value is usually false because email verification is not implemented in its systems. |  [optional] |
|**phoneNumberVerified** | **Boolean** | Whether itsme reports the phone number as verified.              Availability by ID document issuing country: always returned for all supported issuing countries. |  [optional] |
|**address** | [**ItsmeProviderAddress**](ItsmeProviderAddress.md) | The address of the verified individual.              Availability by ID document issuing country: always returned for Belgian-issued ID documents, best effort for Netherlands-issued ID documents, and not returned for other supported issuing countries. |  [optional] |
|**citizenship** | **String** | The citizenship of the verified individual as an ISO 3166-1 alpha-2 country code.              Availability by ID document issuing country: always returned for supported issuing countries except Belgium, where it is best effort. |  [optional] |
|**belgianNationalNumber** | [**ItsmeBelgianNationalNumber**](ItsmeBelgianNationalNumber.md) | The Belgian National Register Number and related metadata.              Availability by ID document issuing country: returned only for Belgian-issued ID documents. |  [optional] |
|**belgianIdentityCard** | [**ItsmeBelgianIdentityCard**](ItsmeBelgianIdentityCard.md) | The Belgian eID card document number and related metadata.              Availability by ID document issuing country: returned only for Belgian-issued ID documents. |  [optional] |
|**identityDocument** | [**ItsmeIdentityDocument**](ItsmeIdentityDocument.md) | The identity document and related metadata.              Availability by ID document issuing country: always returned for all supported issuing countries. |  [optional] |
|**placeOfBirth** | [**ItsmePlaceOfBirth**](ItsmePlaceOfBirth.md) | The place of birth.              Availability by ID document issuing country: best effort for Belgian-issued ID documents; not returned for other supported issuing countries. |  [optional] |
|**device** | [**ItsmeDirectDevice**](ItsmeDirectDevice.md) | The device metadata for the verification.              Availability by ID document issuing country: best effort for all supported issuing countries. |  [optional] |



