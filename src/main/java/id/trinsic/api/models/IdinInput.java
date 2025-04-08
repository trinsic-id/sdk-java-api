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
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import id.trinsic.ApiClient;
/**
 * IdinInput
 */
@JsonPropertyOrder({
  IdinInput.JSON_PROPERTY_SUB_PROVIDER_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-08T20:37:53.342254032Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class IdinInput {
  public static final String JSON_PROPERTY_SUB_PROVIDER_ID = "subProviderId";
  private JsonNullable<String> subProviderId = JsonNullable.<String>undefined();

  public IdinInput() { 
  }

  public IdinInput subProviderId(String subProviderId) {
    this.subProviderId = JsonNullable.<String>of(subProviderId);
    return this;
  }

  /**
   * The ID of the specific bank to invoke with IDIN.              If not specified, the user will be prompted to select a bank.
   * @return subProviderId
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getSubProviderId() {
        return subProviderId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUB_PROVIDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSubProviderId_JsonNullable() {
    return subProviderId;
  }
  
  @JsonProperty(JSON_PROPERTY_SUB_PROVIDER_ID)
  public void setSubProviderId_JsonNullable(JsonNullable<String> subProviderId) {
    this.subProviderId = subProviderId;
  }

  public void setSubProviderId(String subProviderId) {
    this.subProviderId = JsonNullable.<String>of(subProviderId);
  }


  /**
   * Return true if this IdinInput object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdinInput idinInput = (IdinInput) o;
    return equalsNullable(this.subProviderId, idinInput.subProviderId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(subProviderId));
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
    sb.append("class IdinInput {\n");
    sb.append("    subProviderId: ").append(toIndentedString(subProviderId)).append("\n");
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

    // add `subProviderId` to the URL query string
    if (getSubProviderId() != null) {
      joiner.add(String.format("%ssubProviderId%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSubProviderId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

