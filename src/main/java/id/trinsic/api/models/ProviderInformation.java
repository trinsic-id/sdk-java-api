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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import id.trinsic.ApiClient;
/**
 * ProviderInformation
 */
@JsonPropertyOrder({
  ProviderInformation.JSON_PROPERTY_PROVIDER_ID,
  ProviderInformation.JSON_PROPERTY_PROVIDER_DISPLAY_NAME,
  ProviderInformation.JSON_PROPERTY_PROVIDER_LOGO
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-16T14:56:32.436400402Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ProviderInformation {
  public static final String JSON_PROPERTY_PROVIDER_ID = "providerId";
  private String providerId;

  public static final String JSON_PROPERTY_PROVIDER_DISPLAY_NAME = "providerDisplayName";
  private String providerDisplayName;

  public static final String JSON_PROPERTY_PROVIDER_LOGO = "providerLogo";
  private String providerLogo;

  public ProviderInformation() { 
  }

  public ProviderInformation providerId(String providerId) {
    this.providerId = providerId;
    return this;
  }

  /**
   * Get providerId
   * @return providerId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROVIDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getProviderId() {
    return providerId;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProviderId(String providerId) {
    this.providerId = providerId;
  }


  public ProviderInformation providerDisplayName(String providerDisplayName) {
    this.providerDisplayName = providerDisplayName;
    return this;
  }

  /**
   * Get providerDisplayName
   * @return providerDisplayName
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROVIDER_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getProviderDisplayName() {
    return providerDisplayName;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDER_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProviderDisplayName(String providerDisplayName) {
    this.providerDisplayName = providerDisplayName;
  }


  public ProviderInformation providerLogo(String providerLogo) {
    this.providerLogo = providerLogo;
    return this;
  }

  /**
   * Get providerLogo
   * @return providerLogo
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROVIDER_LOGO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getProviderLogo() {
    return providerLogo;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDER_LOGO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProviderLogo(String providerLogo) {
    this.providerLogo = providerLogo;
  }


  /**
   * Return true if this ProviderInformation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProviderInformation providerInformation = (ProviderInformation) o;
    return Objects.equals(this.providerId, providerInformation.providerId) &&
        Objects.equals(this.providerDisplayName, providerInformation.providerDisplayName) &&
        Objects.equals(this.providerLogo, providerInformation.providerLogo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerId, providerDisplayName, providerLogo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProviderInformation {\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    providerDisplayName: ").append(toIndentedString(providerDisplayName)).append("\n");
    sb.append("    providerLogo: ").append(toIndentedString(providerLogo)).append("\n");
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

    // add `providerId` to the URL query string
    if (getProviderId() != null) {
      joiner.add(String.format("%sproviderId%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getProviderId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `providerDisplayName` to the URL query string
    if (getProviderDisplayName() != null) {
      joiner.add(String.format("%sproviderDisplayName%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getProviderDisplayName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `providerLogo` to the URL query string
    if (getProviderLogo() != null) {
      joiner.add(String.format("%sproviderLogo%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getProviderLogo()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}
