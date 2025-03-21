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
import id.trinsic.api.models.Address;
import id.trinsic.api.models.Sex;
import java.time.LocalDate;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import id.trinsic.ApiClient;
/**
 * PersonData
 */
@JsonPropertyOrder({
  PersonData.JSON_PROPERTY_GIVEN_NAME,
  PersonData.JSON_PROPERTY_FAMILY_NAME,
  PersonData.JSON_PROPERTY_MIDDLE_NAME,
  PersonData.JSON_PROPERTY_FULL_NAME,
  PersonData.JSON_PROPERTY_SUFFIX,
  PersonData.JSON_PROPERTY_NATIONALITY,
  PersonData.JSON_PROPERTY_SEX,
  PersonData.JSON_PROPERTY_PHONE_NUMBER,
  PersonData.JSON_PROPERTY_ADDRESS,
  PersonData.JSON_PROPERTY_DATE_OF_BIRTH
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-21T00:14:35.168070879Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PersonData {
  public static final String JSON_PROPERTY_GIVEN_NAME = "givenName";
  private JsonNullable<String> givenName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FAMILY_NAME = "familyName";
  private JsonNullable<String> familyName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MIDDLE_NAME = "middleName";
  private JsonNullable<String> middleName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FULL_NAME = "fullName";
  private JsonNullable<String> fullName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SUFFIX = "suffix";
  private JsonNullable<String> suffix = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NATIONALITY = "nationality";
  private JsonNullable<String> nationality = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SEX = "sex";
  private JsonNullable<Sex> sex = JsonNullable.<Sex>undefined();

  public static final String JSON_PROPERTY_PHONE_NUMBER = "phoneNumber";
  private JsonNullable<String> phoneNumber = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private JsonNullable<Address> address = JsonNullable.<Address>undefined();

  public static final String JSON_PROPERTY_DATE_OF_BIRTH = "dateOfBirth";
  private JsonNullable<LocalDate> dateOfBirth = JsonNullable.<LocalDate>undefined();

  public PersonData() { 
  }

  public PersonData givenName(String givenName) {
    this.givenName = JsonNullable.<String>of(givenName);
    return this;
  }

  /**
   * Get givenName
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


  public PersonData familyName(String familyName) {
    this.familyName = JsonNullable.<String>of(familyName);
    return this;
  }

  /**
   * Get familyName
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


  public PersonData middleName(String middleName) {
    this.middleName = JsonNullable.<String>of(middleName);
    return this;
  }

  /**
   * Get middleName
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


  public PersonData fullName(String fullName) {
    this.fullName = JsonNullable.<String>of(fullName);
    return this;
  }

  /**
   * Get fullName
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

  public void setFullName(String fullName) {
    this.fullName = JsonNullable.<String>of(fullName);
  }


  public PersonData suffix(String suffix) {
    this.suffix = JsonNullable.<String>of(suffix);
    return this;
  }

  /**
   * Get suffix
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


  public PersonData nationality(String nationality) {
    this.nationality = JsonNullable.<String>of(nationality);
    return this;
  }

  /**
   * Get nationality
   * @return nationality
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getNationality() {
        return nationality.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NATIONALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getNationality_JsonNullable() {
    return nationality;
  }
  
  @JsonProperty(JSON_PROPERTY_NATIONALITY)
  public void setNationality_JsonNullable(JsonNullable<String> nationality) {
    this.nationality = nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = JsonNullable.<String>of(nationality);
  }


  public PersonData sex(Sex sex) {
    this.sex = JsonNullable.<Sex>of(sex);
    return this;
  }

  /**
   * Get sex
   * @return sex
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public Sex getSex() {
        return sex.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Sex> getSex_JsonNullable() {
    return sex;
  }
  
  @JsonProperty(JSON_PROPERTY_SEX)
  public void setSex_JsonNullable(JsonNullable<Sex> sex) {
    this.sex = sex;
  }

  public void setSex(Sex sex) {
    this.sex = JsonNullable.<Sex>of(sex);
  }


  public PersonData phoneNumber(String phoneNumber) {
    this.phoneNumber = JsonNullable.<String>of(phoneNumber);
    return this;
  }

  /**
   * Get phoneNumber
   * @return phoneNumber
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getPhoneNumber() {
        return phoneNumber.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPhoneNumber_JsonNullable() {
    return phoneNumber;
  }
  
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  public void setPhoneNumber_JsonNullable(JsonNullable<String> phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = JsonNullable.<String>of(phoneNumber);
  }


  public PersonData address(Address address) {
    this.address = JsonNullable.<Address>of(address);
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public Address getAddress() {
        return address.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Address> getAddress_JsonNullable() {
    return address;
  }
  
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  public void setAddress_JsonNullable(JsonNullable<Address> address) {
    this.address = address;
  }

  public void setAddress(Address address) {
    this.address = JsonNullable.<Address>of(address);
  }


  public PersonData dateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = JsonNullable.<LocalDate>of(dateOfBirth);
    return this;
  }

  /**
   * Get dateOfBirth
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
    return equalsNullable(this.givenName, personData.givenName) &&
        equalsNullable(this.familyName, personData.familyName) &&
        equalsNullable(this.middleName, personData.middleName) &&
        equalsNullable(this.fullName, personData.fullName) &&
        equalsNullable(this.suffix, personData.suffix) &&
        equalsNullable(this.nationality, personData.nationality) &&
        equalsNullable(this.sex, personData.sex) &&
        equalsNullable(this.phoneNumber, personData.phoneNumber) &&
        equalsNullable(this.address, personData.address) &&
        equalsNullable(this.dateOfBirth, personData.dateOfBirth);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(givenName), hashCodeNullable(familyName), hashCodeNullable(middleName), hashCodeNullable(fullName), hashCodeNullable(suffix), hashCodeNullable(nationality), hashCodeNullable(sex), hashCodeNullable(phoneNumber), hashCodeNullable(address), hashCodeNullable(dateOfBirth));
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
    sb.append("class PersonData {\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
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

    // add `suffix` to the URL query string
    if (getSuffix() != null) {
      joiner.add(String.format("%ssuffix%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSuffix()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `nationality` to the URL query string
    if (getNationality() != null) {
      joiner.add(String.format("%snationality%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getNationality()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `sex` to the URL query string
    if (getSex() != null) {
      joiner.add(String.format("%ssex%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSex()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
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

