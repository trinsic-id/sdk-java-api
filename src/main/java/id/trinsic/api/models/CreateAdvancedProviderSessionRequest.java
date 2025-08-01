/*
 * Trinsic API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package id.trinsic.api.models;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import id.trinsic.api.models.IntegrationCapability;
import id.trinsic.api.models.ProviderInput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import id.trinsic.ApiClient;
/**
 * CreateAdvancedProviderSessionRequest
 */
@JsonPropertyOrder({
  CreateAdvancedProviderSessionRequest.JSON_PROPERTY_PROVIDER,
  CreateAdvancedProviderSessionRequest.JSON_PROPERTY_REDIRECT_URL,
  CreateAdvancedProviderSessionRequest.JSON_PROPERTY_CAPABILITIES,
  CreateAdvancedProviderSessionRequest.JSON_PROPERTY_FALLBACK_TO_HOSTED_U_I,
  CreateAdvancedProviderSessionRequest.JSON_PROPERTY_PROVIDER_INPUT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-08-01T19:33:26.347436485Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class CreateAdvancedProviderSessionRequest {
  public static final String JSON_PROPERTY_PROVIDER = "provider";
  @javax.annotation.Nonnull
  private String provider;

  public static final String JSON_PROPERTY_REDIRECT_URL = "redirectUrl";
  private JsonNullable<String> redirectUrl = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CAPABILITIES = "capabilities";
  @javax.annotation.Nonnull
  private List<IntegrationCapability> capabilities = new ArrayList<>();

  public static final String JSON_PROPERTY_FALLBACK_TO_HOSTED_U_I = "fallbackToHostedUI";
  private JsonNullable<Boolean> fallbackToHostedUI = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_PROVIDER_INPUT = "providerInput";
  private JsonNullable<ProviderInput> providerInput = JsonNullable.<ProviderInput>undefined();

  public CreateAdvancedProviderSessionRequest() { 
  }

  public CreateAdvancedProviderSessionRequest provider(@javax.annotation.Nonnull String provider) {
    this.provider = provider;
    return this;
  }

  /**
   * The ID of the provider to launch
   * @return provider
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getProvider() {
    return provider;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProvider(@javax.annotation.Nonnull String provider) {
    this.provider = provider;
  }


  public CreateAdvancedProviderSessionRequest redirectUrl(@javax.annotation.Nullable String redirectUrl) {
    this.redirectUrl = JsonNullable.<String>of(redirectUrl);
    return this;
  }

  /**
   * The Redirect URL to which the user should be sent after the session is complete.              This field is required for providers which employ a redirect-based flow.
   * @return redirectUrl
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getRedirectUrl() {
        return redirectUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REDIRECT_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getRedirectUrl_JsonNullable() {
    return redirectUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_REDIRECT_URL)
  public void setRedirectUrl_JsonNullable(JsonNullable<String> redirectUrl) {
    this.redirectUrl = redirectUrl;
  }

  public void setRedirectUrl(@javax.annotation.Nullable String redirectUrl) {
    this.redirectUrl = JsonNullable.<String>of(redirectUrl);
  }


  public CreateAdvancedProviderSessionRequest capabilities(@javax.annotation.Nonnull List<IntegrationCapability> capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  public CreateAdvancedProviderSessionRequest addCapabilitiesItem(IntegrationCapability capabilitiesItem) {
    if (this.capabilities == null) {
      this.capabilities = new ArrayList<>();
    }
    this.capabilities.add(capabilitiesItem);
    return this;
  }

  /**
   * The list of capabilities your integration supports. Capabilities are the core of Trinsic&#39;s whitelabel-with-optional-fallback offering.              Most capabilities align with either an &#x60;IntegrationLaunchMethod&#x60; or an &#x60;IntegrationCollectionMethod&#x60;. The exception being refresh content to support updating the content of the launch method.              For example, to support a basic redirect-based flow, you must include the &#x60;LaunchRedirect&#x60; and &#x60;CaptureRedirect&#x60; capabilities. To support a mobile deeplink / polling flow, you must include the &#x60;DeeplinkToMobile&#x60; and &#x60;PollForResults&#x60; capabilities.              If &#x60;FallbackToHostedUi&#x60; is &#x60;true&#x60;, Trinsic will automatically fall back to a Trinsic-hosted UI to cover any gaps in your integration&#39;s capabilities. If &#x60;FallbackToHostedUi&#x60; is &#x60;false&#x60;, gaps in your integration&#39;s capabilities will result in an error during Session creation.              Read more on how to integrate at &lt;a href&#x3D;\&quot;https://docs.trinsic.id/docs/advanced-provider-sessions\&quot;&gt;the guide on Advanced Provider Sessions&lt;/a&gt;
   * @return capabilities
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CAPABILITIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<IntegrationCapability> getCapabilities() {
    return capabilities;
  }


  @JsonProperty(JSON_PROPERTY_CAPABILITIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCapabilities(@javax.annotation.Nonnull List<IntegrationCapability> capabilities) {
    this.capabilities = capabilities;
  }


  public CreateAdvancedProviderSessionRequest fallbackToHostedUI(@javax.annotation.Nullable Boolean fallbackToHostedUI) {
    this.fallbackToHostedUI = JsonNullable.<Boolean>of(fallbackToHostedUI);
    return this;
  }

  /**
   * Whether the session should fall back to a Trinsic-hosted UI in certain instances.              Specifically, fallback will occur if any of the following are true: - You attempted to launch a provider which requires a capability you did not express support for     - In this case, Trinsic&#39;s hosted UI will perform the necessary capability - You attempted to launch a provider which requires input, and the input was either not provided or incomplete     - In this case, Trinsic&#39;s hosted UI will collect the necessary input from the user              If fallback occurs, the session&#39;s NextStep will always be LaunchBrowser, and the CollectionMethod will always be CaptureRedirect.              If this field is set to &#x60;true&#x60;, you must also: 1. Set the &#x60;RedirectUrl&#x60; field to a non-empty value 2. Include the &#x60;LaunchBrowser&#x60; and &#x60;CaptureRedirect&#x60; capabilities in the &#x60;Capabilities&#x60; field
   * @return fallbackToHostedUI
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public Boolean getFallbackToHostedUI() {
        return fallbackToHostedUI.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FALLBACK_TO_HOSTED_U_I)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getFallbackToHostedUI_JsonNullable() {
    return fallbackToHostedUI;
  }
  
  @JsonProperty(JSON_PROPERTY_FALLBACK_TO_HOSTED_U_I)
  public void setFallbackToHostedUI_JsonNullable(JsonNullable<Boolean> fallbackToHostedUI) {
    this.fallbackToHostedUI = fallbackToHostedUI;
  }

  public void setFallbackToHostedUI(@javax.annotation.Nullable Boolean fallbackToHostedUI) {
    this.fallbackToHostedUI = JsonNullable.<Boolean>of(fallbackToHostedUI);
  }


  public CreateAdvancedProviderSessionRequest providerInput(@javax.annotation.Nullable ProviderInput providerInput) {
    this.providerInput = JsonNullable.<ProviderInput>of(providerInput);
    return this;
  }

  /**
   * Provider-specific input for those providers which require it.
   * @return providerInput
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public ProviderInput getProviderInput() {
        return providerInput.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PROVIDER_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<ProviderInput> getProviderInput_JsonNullable() {
    return providerInput;
  }
  
  @JsonProperty(JSON_PROPERTY_PROVIDER_INPUT)
  public void setProviderInput_JsonNullable(JsonNullable<ProviderInput> providerInput) {
    this.providerInput = providerInput;
  }

  public void setProviderInput(@javax.annotation.Nullable ProviderInput providerInput) {
    this.providerInput = JsonNullable.<ProviderInput>of(providerInput);
  }


  /**
   * Return true if this CreateAdvancedProviderSessionRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAdvancedProviderSessionRequest createAdvancedProviderSessionRequest = (CreateAdvancedProviderSessionRequest) o;
    return Objects.equals(this.provider, createAdvancedProviderSessionRequest.provider) &&
        equalsNullable(this.redirectUrl, createAdvancedProviderSessionRequest.redirectUrl) &&
        Objects.equals(this.capabilities, createAdvancedProviderSessionRequest.capabilities) &&
        equalsNullable(this.fallbackToHostedUI, createAdvancedProviderSessionRequest.fallbackToHostedUI) &&
        equalsNullable(this.providerInput, createAdvancedProviderSessionRequest.providerInput);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(provider, hashCodeNullable(redirectUrl), capabilities, hashCodeNullable(fallbackToHostedUI), hashCodeNullable(providerInput));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAdvancedProviderSessionRequest {\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    fallbackToHostedUI: ").append(toIndentedString(fallbackToHostedUI)).append("\n");
    sb.append("    providerInput: ").append(toIndentedString(providerInput)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `provider` to the URL query string
    if (getProvider() != null) {
      joiner.add(String.format("%sprovider%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getProvider()))));
    }

    // add `redirectUrl` to the URL query string
    if (getRedirectUrl() != null) {
      joiner.add(String.format("%sredirectUrl%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getRedirectUrl()))));
    }

    // add `capabilities` to the URL query string
    if (getCapabilities() != null) {
      for (int i = 0; i < getCapabilities().size(); i++) {
        if (getCapabilities().get(i) != null) {
          joiner.add(String.format("%scapabilities%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              ApiClient.urlEncode(ApiClient.valueToString(getCapabilities().get(i)))));
        }
      }
    }

    // add `fallbackToHostedUI` to the URL query string
    if (getFallbackToHostedUI() != null) {
      joiner.add(String.format("%sfallbackToHostedUI%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFallbackToHostedUI()))));
    }

    // add `providerInput` to the URL query string
    if (getProviderInput() != null) {
      joiner.add(getProviderInput().toUrlQueryString(prefix + "providerInput" + suffix));
    }

    return joiner.toString();
  }
}

