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
 * PhilippineMatchInput
 */
@JsonPropertyOrder({
  PhilippineMatchInput.JSON_PROPERTY_GIVEN_NAME,
  PhilippineMatchInput.JSON_PROPERTY_MIDDLE_NAME,
  PhilippineMatchInput.JSON_PROPERTY_FAMILY_NAME,
  PhilippineMatchInput.JSON_PROPERTY_SUFFIX,
  PhilippineMatchInput.JSON_PROPERTY_DATE_OF_BIRTH
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-21T00:14:35.168070879Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PhilippineMatchInput {
  public static final String JSON_PROPERTY_GIVEN_NAME = "givenName";
  private JsonNullable<String> givenName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MIDDLE_NAME = "middleName";
  private JsonNullable<String> middleName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FAMILY_NAME = "familyName";
  private JsonNullable<String> familyName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SUFFIX = "suffix";
  private JsonNullable<String> suffix = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DATE_OF_BIRTH = "dateOfBirth";
  private JsonNullable<LocalDate> dateOfBirth = JsonNullable.<LocalDate>undefined();

  public PhilippineMatchInput() { 
  }

  public PhilippineMatchInput givenName(String givenName) {
    this.givenName = JsonNullable.<String>of(givenName);
    return this;
  }

  /**
   * The user&#39;s given / first name
   * @return givenName
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getGivenName() {
        return givenName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GIVEN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getGivenName_JsonNullable() {
    return givenName;
  }
  
  @JsonProperty(JSON_PROPERTY_GIVEN_NAME)
  public void setGivenName_JsonNullable(JsonNullable<String> givenName) {
    this.givenName = givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = JsonNullable.<String>of(givenName);
  }


  public PhilippineMatchInput middleName(String middleName) {
    this.middleName = JsonNullable.<String>of(middleName);
    return this;
  }

  /**
   * The user&#39;s middle name
   * @return middleName
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getMiddleName() {
        return middleName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MIDDLE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMiddleName_JsonNullable() {
    return middleName;
  }
  
  @JsonProperty(JSON_PROPERTY_MIDDLE_NAME)
  public void setMiddleName_JsonNullable(JsonNullable<String> middleName) {
    this.middleName = middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = JsonNullable.<String>of(middleName);
  }


  public PhilippineMatchInput familyName(String familyName) {
    this.familyName = JsonNullable.<String>of(familyName);
    return this;
  }

  /**
   * The user&#39;s family / last name
   * @return familyName
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getFamilyName() {
        return familyName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FAMILY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFamilyName_JsonNullable() {
    return familyName;
  }
  
  @JsonProperty(JSON_PROPERTY_FAMILY_NAME)
  public void setFamilyName_JsonNullable(JsonNullable<String> familyName) {
    this.familyName = familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = JsonNullable.<String>of(familyName);
  }


  public PhilippineMatchInput suffix(String suffix) {
    this.suffix = JsonNullable.<String>of(suffix);
    return this;
  }

  /**
   * The user&#39;s name suffix
   * @return suffix
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getSuffix() {
        return suffix.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUFFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSuffix_JsonNullable() {
    return suffix;
  }
  
  @JsonProperty(JSON_PROPERTY_SUFFIX)
  public void setSuffix_JsonNullable(JsonNullable<String> suffix) {
    this.suffix = suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = JsonNullable.<String>of(suffix);
  }


  public PhilippineMatchInput dateOfBirth(LocalDate dateOfBirth) {
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

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = JsonNullable.<LocalDate>of(dateOfBirth);
  }


  /**
   * Return true if this PhilippineMatchInput object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhilippineMatchInput philippineMatchInput = (PhilippineMatchInput) o;
    return equalsNullable(this.givenName, philippineMatchInput.givenName) &&
        equalsNullable(this.middleName, philippineMatchInput.middleName) &&
        equalsNullable(this.familyName, philippineMatchInput.familyName) &&
        equalsNullable(this.suffix, philippineMatchInput.suffix) &&
        equalsNullable(this.dateOfBirth, philippineMatchInput.dateOfBirth);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(givenName), hashCodeNullable(middleName), hashCodeNullable(familyName), hashCodeNullable(suffix), hashCodeNullable(dateOfBirth));
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
    sb.append("class PhilippineMatchInput {\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
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

    // add `givenName` to the URL query string
    if (getGivenName() != null) {
      joiner.add(String.format("%sgivenName%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getGivenName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `middleName` to the URL query string
    if (getMiddleName() != null) {
      joiner.add(String.format("%smiddleName%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getMiddleName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `familyName` to the URL query string
    if (getFamilyName() != null) {
      joiner.add(String.format("%sfamilyName%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getFamilyName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `suffix` to the URL query string
    if (getSuffix() != null) {
      joiner.add(String.format("%ssuffix%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSuffix()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `dateOfBirth` to the URL query string
    if (getDateOfBirth() != null) {
      joiner.add(String.format("%sdateOfBirth%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDateOfBirth()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

