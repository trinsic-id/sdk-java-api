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
 * DocumentData
 */
@JsonPropertyOrder({
  DocumentData.JSON_PROPERTY_TYPE,
  DocumentData.JSON_PROPERTY_NUMBER,
  DocumentData.JSON_PROPERTY_ISSUE_DATE,
  DocumentData.JSON_PROPERTY_EXPIRATION_DATE,
  DocumentData.JSON_PROPERTY_ISSUING_COUNTRY,
  DocumentData.JSON_PROPERTY_ISSUING_AUTHORITY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-10T20:13:31.458389607Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class DocumentData {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_NUMBER = "number";
  private String number;

  public static final String JSON_PROPERTY_ISSUE_DATE = "issueDate";
  private String issueDate;

  public static final String JSON_PROPERTY_EXPIRATION_DATE = "expirationDate";
  private String expirationDate;

  public static final String JSON_PROPERTY_ISSUING_COUNTRY = "issuingCountry";
  private String issuingCountry;

  public static final String JSON_PROPERTY_ISSUING_AUTHORITY = "issuingAuthority";
  private String issuingAuthority;

  public DocumentData() { 
  }

  public DocumentData type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public DocumentData number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getNumber() {
    return number;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumber(String number) {
    this.number = number;
  }


  public DocumentData issueDate(String issueDate) {
    this.issueDate = issueDate;
    return this;
  }

  /**
   * Get issueDate
   * @return issueDate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISSUE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIssueDate() {
    return issueDate;
  }


  @JsonProperty(JSON_PROPERTY_ISSUE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssueDate(String issueDate) {
    this.issueDate = issueDate;
  }


  public DocumentData expirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * Get expirationDate
   * @return expirationDate
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getExpirationDate() {
    return expirationDate;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }


  public DocumentData issuingCountry(String issuingCountry) {
    this.issuingCountry = issuingCountry;
    return this;
  }

  /**
   * Get issuingCountry
   * @return issuingCountry
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISSUING_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIssuingCountry() {
    return issuingCountry;
  }


  @JsonProperty(JSON_PROPERTY_ISSUING_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssuingCountry(String issuingCountry) {
    this.issuingCountry = issuingCountry;
  }


  public DocumentData issuingAuthority(String issuingAuthority) {
    this.issuingAuthority = issuingAuthority;
    return this;
  }

  /**
   * Get issuingAuthority
   * @return issuingAuthority
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISSUING_AUTHORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIssuingAuthority() {
    return issuingAuthority;
  }


  @JsonProperty(JSON_PROPERTY_ISSUING_AUTHORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssuingAuthority(String issuingAuthority) {
    this.issuingAuthority = issuingAuthority;
  }


  /**
   * Return true if this DocumentData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentData documentData = (DocumentData) o;
    return Objects.equals(this.type, documentData.type) &&
        Objects.equals(this.number, documentData.number) &&
        Objects.equals(this.issueDate, documentData.issueDate) &&
        Objects.equals(this.expirationDate, documentData.expirationDate) &&
        Objects.equals(this.issuingCountry, documentData.issuingCountry) &&
        Objects.equals(this.issuingAuthority, documentData.issuingAuthority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, number, issueDate, expirationDate, issuingCountry, issuingAuthority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentData {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    issuingCountry: ").append(toIndentedString(issuingCountry)).append("\n");
    sb.append("    issuingAuthority: ").append(toIndentedString(issuingAuthority)).append("\n");
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

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `number` to the URL query string
    if (getNumber() != null) {
      joiner.add(String.format("%snumber%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getNumber()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `issueDate` to the URL query string
    if (getIssueDate() != null) {
      joiner.add(String.format("%sissueDate%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getIssueDate()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `expirationDate` to the URL query string
    if (getExpirationDate() != null) {
      joiner.add(String.format("%sexpirationDate%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getExpirationDate()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `issuingCountry` to the URL query string
    if (getIssuingCountry() != null) {
      joiner.add(String.format("%sissuingCountry%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getIssuingCountry()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `issuingAuthority` to the URL query string
    if (getIssuingAuthority() != null) {
      joiner.add(String.format("%sissuingAuthority%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getIssuingAuthority()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

