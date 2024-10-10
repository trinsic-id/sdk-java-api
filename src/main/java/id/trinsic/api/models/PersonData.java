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
import id.trinsic.api.models.Address;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import id.trinsic.ApiClient;
/**
 * Identity information for the individual being verified
 */
@JsonPropertyOrder({
  PersonData.JSON_PROPERTY_GIVEN_NAME,
  PersonData.JSON_PROPERTY_FAMILY_NAME,
  PersonData.JSON_PROPERTY_MIDDLE_NAME,
  PersonData.JSON_PROPERTY_FULL_NAME,
  PersonData.JSON_PROPERTY_NATIONALITY,
  PersonData.JSON_PROPERTY_GENDER,
  PersonData.JSON_PROPERTY_PHONE_NUMBER,
  PersonData.JSON_PROPERTY_ADDRESS,
  PersonData.JSON_PROPERTY_DATE_OF_BIRTH
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-10T20:08:35.008294877Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PersonData {
  public static final String JSON_PROPERTY_GIVEN_NAME = "givenName";
  private String givenName;

  public static final String JSON_PROPERTY_FAMILY_NAME = "familyName";
  private String familyName;

  public static final String JSON_PROPERTY_MIDDLE_NAME = "middleName";
  private String middleName;

  public static final String JSON_PROPERTY_FULL_NAME = "fullName";
  private String fullName;

  public static final String JSON_PROPERTY_NATIONALITY = "nationality";
  private String nationality;

  public static final String JSON_PROPERTY_GENDER = "gender";
  private String gender;

  public static final String JSON_PROPERTY_PHONE_NUMBER = "phoneNumber";
  private String phoneNumber;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private Address address;

  public static final String JSON_PROPERTY_DATE_OF_BIRTH = "dateOfBirth";
  private String dateOfBirth;

  public PersonData() { 
  }

  public PersonData givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

  /**
   * Given (first) name of the individual
   * @return givenName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GIVEN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getGivenName() {
    return givenName;
  }


  @JsonProperty(JSON_PROPERTY_GIVEN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }


  public PersonData familyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

  /**
   * Family (last) name of the individual
   * @return familyName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAMILY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFamilyName() {
    return familyName;
  }


  @JsonProperty(JSON_PROPERTY_FAMILY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }


  public PersonData middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Middle name of the individual
   * @return middleName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MIDDLE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMiddleName() {
    return middleName;
  }


  @JsonProperty(JSON_PROPERTY_MIDDLE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }


  public PersonData fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * The individual&#39;s full name as a single string.                Useful for names which do not fit into a \&quot;first middle last\&quot; structure.
   * @return fullName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFullName() {
    return fullName;
  }


  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }


  public PersonData nationality(String nationality) {
    this.nationality = nationality;
    return this;
  }

  /**
   * Get nationality
   * @return nationality
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NATIONALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNationality() {
    return nationality;
  }


  @JsonProperty(JSON_PROPERTY_NATIONALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNationality(String nationality) {
    this.nationality = nationality;
  }


  public PersonData gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GENDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getGender() {
    return gender;
  }


  @JsonProperty(JSON_PROPERTY_GENDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGender(String gender) {
    this.gender = gender;
  }


  public PersonData phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber
   * @return phoneNumber
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPhoneNumber() {
    return phoneNumber;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public PersonData address(Address address) {
    this.address = address;
    return this;
  }

  /**
   * Address information for an individual
   * @return address
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Address getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress(Address address) {
    this.address = address;
  }


  public PersonData dateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Get dateOfBirth
   * @return dateOfBirth
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_OF_BIRTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDateOfBirth() {
    return dateOfBirth;
  }


  @JsonProperty(JSON_PROPERTY_DATE_OF_BIRTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  /**
   * Return true if this PersonData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonData personData = (PersonData) o;
    return Objects.equals(this.givenName, personData.givenName) &&
        Objects.equals(this.familyName, personData.familyName) &&
        Objects.equals(this.middleName, personData.middleName) &&
        Objects.equals(this.fullName, personData.fullName) &&
        Objects.equals(this.nationality, personData.nationality) &&
        Objects.equals(this.gender, personData.gender) &&
        Objects.equals(this.phoneNumber, personData.phoneNumber) &&
        Objects.equals(this.address, personData.address) &&
        Objects.equals(this.dateOfBirth, personData.dateOfBirth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(givenName, familyName, middleName, fullName, nationality, gender, phoneNumber, address, dateOfBirth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonData {\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

    // add `familyName` to the URL query string
    if (getFamilyName() != null) {
      joiner.add(String.format("%sfamilyName%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getFamilyName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `middleName` to the URL query string
    if (getMiddleName() != null) {
      joiner.add(String.format("%smiddleName%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getMiddleName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `fullName` to the URL query string
    if (getFullName() != null) {
      joiner.add(String.format("%sfullName%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getFullName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `nationality` to the URL query string
    if (getNationality() != null) {
      joiner.add(String.format("%snationality%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getNationality()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `gender` to the URL query string
    if (getGender() != null) {
      joiner.add(String.format("%sgender%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getGender()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `phoneNumber` to the URL query string
    if (getPhoneNumber() != null) {
      joiner.add(String.format("%sphoneNumber%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getPhoneNumber()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `address` to the URL query string
    if (getAddress() != null) {
      joiner.add(getAddress().toUrlQueryString(prefix + "address" + suffix));
    }

    // add `dateOfBirth` to the URL query string
    if (getDateOfBirth() != null) {
      joiner.add(String.format("%sdateOfBirth%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDateOfBirth()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

