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
import java.time.LocalDate;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import id.trinsic.ApiClient;
/**
 * AadhaarInput
 */
@JsonPropertyOrder({
  AadhaarInput.JSON_PROPERTY_FULL_NAME,
  AadhaarInput.JSON_PROPERTY_DATE_OF_BIRTH
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-08-01T19:33:26.347436485Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class AadhaarInput {
  public static final String JSON_PROPERTY_FULL_NAME = "fullName";
  private JsonNullable<String> fullName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DATE_OF_BIRTH = "dateOfBirth";
  private JsonNullable<LocalDate> dateOfBirth = JsonNullable.<LocalDate>undefined();

  public AadhaarInput() { 
  }

  public AadhaarInput fullName(@javax.annotation.Nullable String fullName) {
    this.fullName = JsonNullable.<String>of(fullName);
    return this;
  }

  /**
   * The user&#39;s full name
   * @return fullName
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getFullName() {
        return fullName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFullName_JsonNullable() {
    return fullName;
  }
  
  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  public void setFullName_JsonNullable(JsonNullable<String> fullName) {
    this.fullName = fullName;
  }

  public void setFullName(@javax.annotation.Nullable String fullName) {
    this.fullName = JsonNullable.<String>of(fullName);
  }


  public AadhaarInput dateOfBirth(@javax.annotation.Nullable LocalDate dateOfBirth) {
    this.dateOfBirth = JsonNullable.<LocalDate>of(dateOfBirth);
    return this;
  }

  /**
   * The user&#39;s date of birth, in &#x60;YYYY-MM-DD&#x60; format
   * @return dateOfBirth
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public LocalDate getDateOfBirth() {
        return dateOfBirth.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATE_OF_BIRTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<LocalDate> getDateOfBirth_JsonNullable() {
    return dateOfBirth;
  }
  
  @JsonProperty(JSON_PROPERTY_DATE_OF_BIRTH)
  public void setDateOfBirth_JsonNullable(JsonNullable<LocalDate> dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public void setDateOfBirth(@javax.annotation.Nullable LocalDate dateOfBirth) {
    this.dateOfBirth = JsonNullable.<LocalDate>of(dateOfBirth);
  }


  /**
   * Return true if this AadhaarInput object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AadhaarInput aadhaarInput = (AadhaarInput) o;
    return equalsNullable(this.fullName, aadhaarInput.fullName) &&
        equalsNullable(this.dateOfBirth, aadhaarInput.dateOfBirth);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(fullName), hashCodeNullable(dateOfBirth));
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
    sb.append("class AadhaarInput {\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
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

    // add `fullName` to the URL query string
    if (getFullName() != null) {
      joiner.add(String.format("%sfullName%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getFullName()))));
    }

    // add `dateOfBirth` to the URL query string
    if (getDateOfBirth() != null) {
      joiner.add(String.format("%sdateOfBirth%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getDateOfBirth()))));
    }

    return joiner.toString();
  }
}

