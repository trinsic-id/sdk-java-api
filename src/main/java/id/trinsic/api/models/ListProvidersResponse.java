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
import id.trinsic.api.models.ProviderInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import id.trinsic.ApiClient;
/**
 * ListProvidersResponse
 */
@JsonPropertyOrder({
  ListProvidersResponse.JSON_PROPERTY_PROVIDERS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-08-01T19:33:26.347436485Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class ListProvidersResponse {
  public static final String JSON_PROPERTY_PROVIDERS = "providers";
  @javax.annotation.Nonnull
  private List<ProviderInfo> providers = new ArrayList<>();

  public ListProvidersResponse() { 
  }

  public ListProvidersResponse providers(@javax.annotation.Nonnull List<ProviderInfo> providers) {
    this.providers = providers;
    return this;
  }

  public ListProvidersResponse addProvidersItem(ProviderInfo providersItem) {
    if (this.providers == null) {
      this.providers = new ArrayList<>();
    }
    this.providers.add(providersItem);
    return this;
  }

  /**
   * The list of identity providers available to your account
   * @return providers
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROVIDERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ProviderInfo> getProviders() {
    return providers;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProviders(@javax.annotation.Nonnull List<ProviderInfo> providers) {
    this.providers = providers;
  }


  /**
   * Return true if this ListProvidersResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListProvidersResponse listProvidersResponse = (ListProvidersResponse) o;
    return Objects.equals(this.providers, listProvidersResponse.providers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListProvidersResponse {\n");
    sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
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

    // add `providers` to the URL query string
    if (getProviders() != null) {
      for (int i = 0; i < getProviders().size(); i++) {
        if (getProviders().get(i) != null) {
          joiner.add(getProviders().get(i).toUrlQueryString(String.format("%sproviders%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

