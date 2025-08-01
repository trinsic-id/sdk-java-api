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
import id.trinsic.api.models.ResultCollectionMethod;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import id.trinsic.ApiClient;
/**
 * ResultCollection
 */
@JsonPropertyOrder({
  ResultCollection.JSON_PROPERTY_METHOD,
  ResultCollection.JSON_PROPERTY_RESULTS_ACCESS_KEY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-08-01T19:33:26.347436485Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class ResultCollection {
  public static final String JSON_PROPERTY_METHOD = "method";
  @javax.annotation.Nonnull
  private ResultCollectionMethod method;

  public static final String JSON_PROPERTY_RESULTS_ACCESS_KEY = "resultsAccessKey";
  @javax.annotation.Nonnull
  private String resultsAccessKey;

  public ResultCollection() { 
  }

  public ResultCollection method(@javax.annotation.Nonnull ResultCollectionMethod method) {
    this.method = method;
    return this;
  }

  /**
   * The method by which the results of the Acceptance Session should be collected.
   * @return method
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ResultCollectionMethod getMethod() {
    return method;
  }


  @JsonProperty(JSON_PROPERTY_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMethod(@javax.annotation.Nonnull ResultCollectionMethod method) {
    this.method = method;
  }


  public ResultCollection resultsAccessKey(@javax.annotation.Nonnull String resultsAccessKey) {
    this.resultsAccessKey = resultsAccessKey;
    return this;
  }

  /**
   * The &#x60;resultsAccessKey&#x60; for the Acceptance Session.              This is an encrypted payload which contains the decryption key necessary to access the Session&#39;s Data Vault.              Save this securely in your systems; it must be passed back with any API call which requires access to the Session&#39;s Data Vault.              Trinsic cannot access a Session&#39;s Data Vault without this key.
   * @return resultsAccessKey
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RESULTS_ACCESS_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getResultsAccessKey() {
    return resultsAccessKey;
  }


  @JsonProperty(JSON_PROPERTY_RESULTS_ACCESS_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResultsAccessKey(@javax.annotation.Nonnull String resultsAccessKey) {
    this.resultsAccessKey = resultsAccessKey;
  }


  /**
   * Return true if this ResultCollection object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultCollection resultCollection = (ResultCollection) o;
    return Objects.equals(this.method, resultCollection.method) &&
        Objects.equals(this.resultsAccessKey, resultCollection.resultsAccessKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method, resultsAccessKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultCollection {\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    resultsAccessKey: ").append(toIndentedString(resultsAccessKey)).append("\n");
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

    // add `method` to the URL query string
    if (getMethod() != null) {
      joiner.add(String.format("%smethod%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getMethod()))));
    }

    // add `resultsAccessKey` to the URL query string
    if (getResultsAccessKey() != null) {
      joiner.add(String.format("%sresultsAccessKey%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getResultsAccessKey()))));
    }

    return joiner.toString();
  }
}

