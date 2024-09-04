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
 * Address information for an individual
 */
@JsonPropertyOrder({
  Address.JSON_PROPERTY_LINE1,
  Address.JSON_PROPERTY_LINE2,
  Address.JSON_PROPERTY_LINE3,
  Address.JSON_PROPERTY_CITY,
  Address.JSON_PROPERTY_STATE,
  Address.JSON_PROPERTY_POSTAL_CODE,
  Address.JSON_PROPERTY_COUNTRY,
  Address.JSON_PROPERTY_FULL_ADDRESS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-04T00:30:10.165450Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class Address {
  public static final String JSON_PROPERTY_LINE1 = "line1";
  private String line1;

  public static final String JSON_PROPERTY_LINE2 = "line2";
  private String line2;

  public static final String JSON_PROPERTY_LINE3 = "line3";
  private String line3;

  public static final String JSON_PROPERTY_CITY = "city";
  private String city;

  public static final String JSON_PROPERTY_STATE = "state";
  private String state;

  public static final String JSON_PROPERTY_POSTAL_CODE = "postalCode";
  private String postalCode;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private String country;

  public static final String JSON_PROPERTY_FULL_ADDRESS = "fullAddress";
  private String fullAddress;

  public Address() { 
  }

  public Address line1(String line1) {
    this.line1 = line1;
    return this;
  }

  /**
   * Get line1
   * @return line1
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLine1() {
    return line1;
  }


  @JsonProperty(JSON_PROPERTY_LINE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLine1(String line1) {
    this.line1 = line1;
  }


  public Address line2(String line2) {
    this.line2 = line2;
    return this;
  }

  /**
   * Get line2
   * @return line2
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLine2() {
    return line2;
  }


  @JsonProperty(JSON_PROPERTY_LINE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLine2(String line2) {
    this.line2 = line2;
  }


  public Address line3(String line3) {
    this.line3 = line3;
    return this;
  }

  /**
   * Get line3
   * @return line3
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINE3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLine3() {
    return line3;
  }


  @JsonProperty(JSON_PROPERTY_LINE3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLine3(String line3) {
    this.line3 = line3;
  }


  public Address city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCity() {
    return city;
  }


  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCity(String city) {
    this.city = city;
  }


  public Address state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(String state) {
    this.state = state;
  }


  public Address postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Get postalCode
   * @return postalCode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPostalCode() {
    return postalCode;
  }


  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public Address country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCountry() {
    return country;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountry(String country) {
    this.country = country;
  }


  public Address fullAddress(String fullAddress) {
    this.fullAddress = fullAddress;
    return this;
  }

  /**
   * The full address as a single string
   * @return fullAddress
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FULL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFullAddress() {
    return fullAddress;
  }


  @JsonProperty(JSON_PROPERTY_FULL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFullAddress(String fullAddress) {
    this.fullAddress = fullAddress;
  }


  /**
   * Return true if this Address object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.line1, address.line1) &&
        Objects.equals(this.line2, address.line2) &&
        Objects.equals(this.line3, address.line3) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.state, address.state) &&
        Objects.equals(this.postalCode, address.postalCode) &&
        Objects.equals(this.country, address.country) &&
        Objects.equals(this.fullAddress, address.fullAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(line1, line2, line3, city, state, postalCode, country, fullAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    line2: ").append(toIndentedString(line2)).append("\n");
    sb.append("    line3: ").append(toIndentedString(line3)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    fullAddress: ").append(toIndentedString(fullAddress)).append("\n");
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

    // add `line1` to the URL query string
    if (getLine1() != null) {
      joiner.add(String.format("%sline1%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getLine1()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `line2` to the URL query string
    if (getLine2() != null) {
      joiner.add(String.format("%sline2%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getLine2()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `line3` to the URL query string
    if (getLine3() != null) {
      joiner.add(String.format("%sline3%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getLine3()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `city` to the URL query string
    if (getCity() != null) {
      joiner.add(String.format("%scity%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCity()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `state` to the URL query string
    if (getState() != null) {
      joiner.add(String.format("%sstate%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getState()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `postalCode` to the URL query string
    if (getPostalCode() != null) {
      joiner.add(String.format("%spostalCode%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getPostalCode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `country` to the URL query string
    if (getCountry() != null) {
      joiner.add(String.format("%scountry%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCountry()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `fullAddress` to the URL query string
    if (getFullAddress() != null) {
      joiner.add(String.format("%sfullAddress%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getFullAddress()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

