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
import id.trinsic.api.models.VerificationFailCode;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import id.trinsic.ApiClient;
/**
 * A Verification contained within a Session
 */
@JsonPropertyOrder({
  Verification.JSON_PROPERTY_PROVIDER,
  Verification.JSON_PROPERTY_FAIL_CODE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-16T14:56:32.436400402Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class Verification {
  public static final String JSON_PROPERTY_PROVIDER = "provider";
  private String provider;

  public static final String JSON_PROPERTY_FAIL_CODE = "failCode";
  private VerificationFailCode failCode;

  public Verification() { 
  }

  public Verification provider(String provider) {
    this.provider = provider;
    return this;
  }

  /**
   * The identity provider that was used to perform the Verification, if any
   * @return provider
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getProvider() {
    return provider;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProvider(String provider) {
    this.provider = provider;
  }


  public Verification failCode(VerificationFailCode failCode) {
    this.failCode = failCode;
    return this;
  }

  /**
   * If the Verification is in state &#x60;VerificationFailed&#x60;, this field contains the reason for failure
   * @return failCode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAIL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public VerificationFailCode getFailCode() {
    return failCode;
  }


  @JsonProperty(JSON_PROPERTY_FAIL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailCode(VerificationFailCode failCode) {
    this.failCode = failCode;
  }


  /**
   * Return true if this Verification object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Verification verification = (Verification) o;
    return Objects.equals(this.provider, verification.provider) &&
        Objects.equals(this.failCode, verification.failCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provider, failCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Verification {\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    failCode: ").append(toIndentedString(failCode)).append("\n");
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
      joiner.add(String.format("%sprovider%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getProvider()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `failCode` to the URL query string
    if (getFailCode() != null) {
      joiner.add(String.format("%sfailCode%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getFailCode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

