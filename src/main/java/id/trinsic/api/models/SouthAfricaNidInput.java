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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import id.trinsic.ApiClient;
/**
 * SouthAfricaNidInput
 */
@JsonPropertyOrder({
  SouthAfricaNidInput.JSON_PROPERTY_FULL_NAME,
  SouthAfricaNidInput.JSON_PROPERTY_DATE_OF_BIRTH,
  SouthAfricaNidInput.JSON_PROPERTY_GENDER,
  SouthAfricaNidInput.JSON_PROPERTY_NATIONAL_ID_NUMBER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-08T20:37:53.342254032Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class SouthAfricaNidInput {
  public static final String JSON_PROPERTY_FULL_NAME = "fullName";
  private String fullName;

  public static final String JSON_PROPERTY_DATE_OF_BIRTH = "dateOfBirth";
  private LocalDate dateOfBirth;

  public static final String JSON_PROPERTY_GENDER = "gender";
  private String gender;

  public static final String JSON_PROPERTY_NATIONAL_ID_NUMBER = "nationalIdNumber";
  private String nationalIdNumber;

  public SouthAfricaNidInput() { 
  }

  public SouthAfricaNidInput fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * The user&#39;s full name as it appears in their National ID
   * @return fullName
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFullName() {
    return fullName;
  }


  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }


  public SouthAfricaNidInput dateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * The user&#39;s date of birth, in &#x60;YYYY-MM-DD&#x60; format
   * @return dateOfBirth
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATE_OF_BIRTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }


  @JsonProperty(JSON_PROPERTY_DATE_OF_BIRTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public SouthAfricaNidInput gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * The user&#39;s gender as it appears in their National ID (e.g., male, female)
   * @return gender
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_GENDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getGender() {
    return gender;
  }


  @JsonProperty(JSON_PROPERTY_GENDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGender(String gender) {
    this.gender = gender;
  }


  public SouthAfricaNidInput nationalIdNumber(String nationalIdNumber) {
    this.nationalIdNumber = nationalIdNumber;
    return this;
  }

  /**
   * The user&#39;s South African National ID number
   * @return nationalIdNumber
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NATIONAL_ID_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getNationalIdNumber() {
    return nationalIdNumber;
  }


  @JsonProperty(JSON_PROPERTY_NATIONAL_ID_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNationalIdNumber(String nationalIdNumber) {
    this.nationalIdNumber = nationalIdNumber;
  }


  /**
   * Return true if this SouthAfricaNidInput object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SouthAfricaNidInput southAfricaNidInput = (SouthAfricaNidInput) o;
    return Objects.equals(this.fullName, southAfricaNidInput.fullName) &&
        Objects.equals(this.dateOfBirth, southAfricaNidInput.dateOfBirth) &&
        Objects.equals(this.gender, southAfricaNidInput.gender) &&
        Objects.equals(this.nationalIdNumber, southAfricaNidInput.nationalIdNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, dateOfBirth, gender, nationalIdNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SouthAfricaNidInput {\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    nationalIdNumber: ").append(toIndentedString(nationalIdNumber)).append("\n");
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
      joiner.add(String.format("%sfullName%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getFullName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `dateOfBirth` to the URL query string
    if (getDateOfBirth() != null) {
      joiner.add(String.format("%sdateOfBirth%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDateOfBirth()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `gender` to the URL query string
    if (getGender() != null) {
      joiner.add(String.format("%sgender%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getGender()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `nationalIdNumber` to the URL query string
    if (getNationalIdNumber() != null) {
      joiner.add(String.format("%snationalIdNumber%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getNationalIdNumber()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

