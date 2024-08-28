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
 * GetSessionResultRequest
 */
@JsonPropertyOrder({
  GetSessionResultRequest.JSON_PROPERTY_RESULTS_ACCESS_KEY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-28T18:10:34.132636Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetSessionResultRequest {
  public static final String JSON_PROPERTY_RESULTS_ACCESS_KEY = "resultsAccessKey";
  private String resultsAccessKey;

  public GetSessionResultRequest() { 
  }

  public GetSessionResultRequest resultsAccessKey(String resultsAccessKey) {
    this.resultsAccessKey = resultsAccessKey;
    return this;
  }

  /**
   * The Results Access Key to exchange
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
  public void setResultsAccessKey(String resultsAccessKey) {
    this.resultsAccessKey = resultsAccessKey;
  }


  /**
   * Return true if this GetSessionResultRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSessionResultRequest getSessionResultRequest = (GetSessionResultRequest) o;
    return Objects.equals(this.resultsAccessKey, getSessionResultRequest.resultsAccessKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultsAccessKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSessionResultRequest {\n");
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

    // add `resultsAccessKey` to the URL query string
    if (getResultsAccessKey() != null) {
      joiner.add(String.format("%sresultsAccessKey%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getResultsAccessKey()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

