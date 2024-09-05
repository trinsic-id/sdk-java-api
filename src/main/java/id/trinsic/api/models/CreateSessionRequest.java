/*
 * Connect API
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
import id.trinsic.api.models.DisclosedFieldsRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import id.trinsic.ApiClient;
/**
 * CreateSessionRequest
 */
@JsonPropertyOrder({
  CreateSessionRequest.JSON_PROPERTY_LAUNCH_PROVIDER_DIRECTLY,
  CreateSessionRequest.JSON_PROPERTY_PROVIDERS,
  CreateSessionRequest.JSON_PROPERTY_DISCLOSED_FIELDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-05T17:58:46.930776Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CreateSessionRequest {
  public static final String JSON_PROPERTY_LAUNCH_PROVIDER_DIRECTLY = "launchProviderDirectly";
  private Boolean launchProviderDirectly;

  public static final String JSON_PROPERTY_PROVIDERS = "providers";
  private List<String> providers = new ArrayList<>();

  public static final String JSON_PROPERTY_DISCLOSED_FIELDS = "disclosedFields";
  private DisclosedFieldsRequest disclosedFields;

  public CreateSessionRequest() { 
  }

  public CreateSessionRequest launchProviderDirectly(Boolean launchProviderDirectly) {
    this.launchProviderDirectly = launchProviderDirectly;
    return this;
  }

  /**
   * Whether to immediately launch the identity provider, without invoking the Trinsic Widget UI.                Users will not be shown the Widget; therefore, reuse of credentials, selection of an identity provider, and saving a verification for future reuse  are not available to the end user in this mode.                Sessions created with this option enabled must be created with a &#x60;RedirectUrl&#x60; specified, and cannot be invoked using the frontend SDK at this time.
   * @return launchProviderDirectly
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAUNCH_PROVIDER_DIRECTLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getLaunchProviderDirectly() {
    return launchProviderDirectly;
  }


  @JsonProperty(JSON_PROPERTY_LAUNCH_PROVIDER_DIRECTLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLaunchProviderDirectly(Boolean launchProviderDirectly) {
    this.launchProviderDirectly = launchProviderDirectly;
  }


  public CreateSessionRequest providers(List<String> providers) {
    this.providers = providers;
    return this;
  }

  public CreateSessionRequest addProvidersItem(String providersItem) {
    if (this.providers == null) {
      this.providers = new ArrayList<>();
    }
    this.providers.add(providersItem);
    return this;
  }

  /**
   * The list of allowed identity providers. If not specified, all available providers will be allowed.                If &#x60;LaunchMethodDirectly&#x60; is &#x60;true&#x60;, this field must be set, and must have only a single entry.  If &#x60;LaunchMethodDirectly&#x60; is not specified or is &#x60;false&#x60;, this field may have any number of entries.
   * @return providers
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROVIDERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getProviders() {
    return providers;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProviders(List<String> providers) {
    this.providers = providers;
  }


  public CreateSessionRequest disclosedFields(DisclosedFieldsRequest disclosedFields) {
    this.disclosedFields = disclosedFields;
    return this;
  }

  /**
   * Specific identity attributes to request. If not provided, all available attributes will be requested.
   * @return disclosedFields
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISCLOSED_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DisclosedFieldsRequest getDisclosedFields() {
    return disclosedFields;
  }


  @JsonProperty(JSON_PROPERTY_DISCLOSED_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisclosedFields(DisclosedFieldsRequest disclosedFields) {
    this.disclosedFields = disclosedFields;
  }


  /**
   * Return true if this CreateSessionRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSessionRequest createSessionRequest = (CreateSessionRequest) o;
    return Objects.equals(this.launchProviderDirectly, createSessionRequest.launchProviderDirectly) &&
        Objects.equals(this.providers, createSessionRequest.providers) &&
        Objects.equals(this.disclosedFields, createSessionRequest.disclosedFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(launchProviderDirectly, providers, disclosedFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSessionRequest {\n");
    sb.append("    launchProviderDirectly: ").append(toIndentedString(launchProviderDirectly)).append("\n");
    sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
    sb.append("    disclosedFields: ").append(toIndentedString(disclosedFields)).append("\n");
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

    // add `launchProviderDirectly` to the URL query string
    if (getLaunchProviderDirectly() != null) {
      joiner.add(String.format("%slaunchProviderDirectly%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getLaunchProviderDirectly()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `providers` to the URL query string
    if (getProviders() != null) {
      for (int i = 0; i < getProviders().size(); i++) {
        joiner.add(String.format("%sproviders%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getProviders().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `disclosedFields` to the URL query string
    if (getDisclosedFields() != null) {
      joiner.add(getDisclosedFields().toUrlQueryString(prefix + "disclosedFields" + suffix));
    }

    return joiner.toString();
  }
}

