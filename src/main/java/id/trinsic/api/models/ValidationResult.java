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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import id.trinsic.ApiClient;
/**
 * ValidationResult
 */
@JsonPropertyOrder({
  ValidationResult.JSON_PROPERTY_MEMBER_NAMES,
  ValidationResult.JSON_PROPERTY_ERROR_MESSAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-18T20:49:40.490361356Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ValidationResult {
  public static final String JSON_PROPERTY_MEMBER_NAMES = "memberNames";
  private List<String> memberNames = new ArrayList<>();

  public static final String JSON_PROPERTY_ERROR_MESSAGE = "errorMessage";
  private String errorMessage;

  public ValidationResult() { 
  }

  @JsonCreator
  public ValidationResult(
    @JsonProperty(JSON_PROPERTY_MEMBER_NAMES) List<String> memberNames
  ) {
  this();
    this.memberNames = memberNames;
  }

  /**
   * Get memberNames
   * @return memberNames
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MEMBER_NAMES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getMemberNames() {
    return memberNames;
  }




  public ValidationResult errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Get errorMessage
   * @return errorMessage
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getErrorMessage() {
    return errorMessage;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  /**
   * Return true if this ValidationResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationResult validationResult = (ValidationResult) o;
    return Objects.equals(this.memberNames, validationResult.memberNames) &&
        Objects.equals(this.errorMessage, validationResult.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberNames, errorMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationResult {\n");
    sb.append("    memberNames: ").append(toIndentedString(memberNames)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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

    // add `memberNames` to the URL query string
    if (getMemberNames() != null) {
      for (int i = 0; i < getMemberNames().size(); i++) {
        joiner.add(String.format("%smemberNames%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getMemberNames().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `errorMessage` to the URL query string
    if (getErrorMessage() != null) {
      joiner.add(String.format("%serrorMessage%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getErrorMessage()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

