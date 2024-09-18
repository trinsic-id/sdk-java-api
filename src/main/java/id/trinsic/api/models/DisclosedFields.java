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
 * DisclosedFields
 */
@JsonPropertyOrder({
  DisclosedFields.JSON_PROPERTY_ID_NUMBER,
  DisclosedFields.JSON_PROPERTY_GIVEN_NAME,
  DisclosedFields.JSON_PROPERTY_FAMILY_NAME,
  DisclosedFields.JSON_PROPERTY_ADDRESS,
  DisclosedFields.JSON_PROPERTY_DATE_OF_BIRTH,
  DisclosedFields.JSON_PROPERTY_COUNTRY,
  DisclosedFields.JSON_PROPERTY_ISSUE_DATE,
  DisclosedFields.JSON_PROPERTY_EXPIRATION_DATE,
  DisclosedFields.JSON_PROPERTY_DOCUMENT_FRONT,
  DisclosedFields.JSON_PROPERTY_DOCUMENT_BACK,
  DisclosedFields.JSON_PROPERTY_DOCUMENT_PORTRAIT,
  DisclosedFields.JSON_PROPERTY_SELFIE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-18T20:49:40.490361356Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class DisclosedFields {
  public static final String JSON_PROPERTY_ID_NUMBER = "idNumber";
  private Boolean idNumber;

  public static final String JSON_PROPERTY_GIVEN_NAME = "givenName";
  private Boolean givenName;

  public static final String JSON_PROPERTY_FAMILY_NAME = "familyName";
  private Boolean familyName;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private Boolean address;

  public static final String JSON_PROPERTY_DATE_OF_BIRTH = "dateOfBirth";
  private Boolean dateOfBirth;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private Boolean country;

  public static final String JSON_PROPERTY_ISSUE_DATE = "issueDate";
  private Boolean issueDate;

  public static final String JSON_PROPERTY_EXPIRATION_DATE = "expirationDate";
  private Boolean expirationDate;

  public static final String JSON_PROPERTY_DOCUMENT_FRONT = "documentFront";
  private Boolean documentFront;

  public static final String JSON_PROPERTY_DOCUMENT_BACK = "documentBack";
  private Boolean documentBack;

  public static final String JSON_PROPERTY_DOCUMENT_PORTRAIT = "documentPortrait";
  private Boolean documentPortrait;

  public static final String JSON_PROPERTY_SELFIE = "selfie";
  private Boolean selfie;

  public DisclosedFields() { 
  }

  public DisclosedFields idNumber(Boolean idNumber) {
    this.idNumber = idNumber;
    return this;
  }

  /**
   * Get idNumber
   * @return idNumber
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIdNumber() {
    return idNumber;
  }


  @JsonProperty(JSON_PROPERTY_ID_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIdNumber(Boolean idNumber) {
    this.idNumber = idNumber;
  }


  public DisclosedFields givenName(Boolean givenName) {
    this.givenName = givenName;
    return this;
  }

  /**
   * Get givenName
   * @return givenName
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_GIVEN_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getGivenName() {
    return givenName;
  }


  @JsonProperty(JSON_PROPERTY_GIVEN_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGivenName(Boolean givenName) {
    this.givenName = givenName;
  }


  public DisclosedFields familyName(Boolean familyName) {
    this.familyName = familyName;
    return this;
  }

  /**
   * Get familyName
   * @return familyName
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FAMILY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getFamilyName() {
    return familyName;
  }


  @JsonProperty(JSON_PROPERTY_FAMILY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFamilyName(Boolean familyName) {
    this.familyName = familyName;
  }


  public DisclosedFields address(Boolean address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAddress(Boolean address) {
    this.address = address;
  }


  public DisclosedFields dateOfBirth(Boolean dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Get dateOfBirth
   * @return dateOfBirth
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATE_OF_BIRTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getDateOfBirth() {
    return dateOfBirth;
  }


  @JsonProperty(JSON_PROPERTY_DATE_OF_BIRTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDateOfBirth(Boolean dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public DisclosedFields country(Boolean country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getCountry() {
    return country;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCountry(Boolean country) {
    this.country = country;
  }


  public DisclosedFields issueDate(Boolean issueDate) {
    this.issueDate = issueDate;
    return this;
  }

  /**
   * Get issueDate
   * @return issueDate
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ISSUE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIssueDate() {
    return issueDate;
  }


  @JsonProperty(JSON_PROPERTY_ISSUE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIssueDate(Boolean issueDate) {
    this.issueDate = issueDate;
  }


  public DisclosedFields expirationDate(Boolean expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * Get expirationDate
   * @return expirationDate
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXPIRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getExpirationDate() {
    return expirationDate;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExpirationDate(Boolean expirationDate) {
    this.expirationDate = expirationDate;
  }


  public DisclosedFields documentFront(Boolean documentFront) {
    this.documentFront = documentFront;
    return this;
  }

  /**
   * Get documentFront
   * @return documentFront
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DOCUMENT_FRONT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getDocumentFront() {
    return documentFront;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENT_FRONT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDocumentFront(Boolean documentFront) {
    this.documentFront = documentFront;
  }


  public DisclosedFields documentBack(Boolean documentBack) {
    this.documentBack = documentBack;
    return this;
  }

  /**
   * Get documentBack
   * @return documentBack
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DOCUMENT_BACK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getDocumentBack() {
    return documentBack;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENT_BACK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDocumentBack(Boolean documentBack) {
    this.documentBack = documentBack;
  }


  public DisclosedFields documentPortrait(Boolean documentPortrait) {
    this.documentPortrait = documentPortrait;
    return this;
  }

  /**
   * Get documentPortrait
   * @return documentPortrait
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DOCUMENT_PORTRAIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getDocumentPortrait() {
    return documentPortrait;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENT_PORTRAIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDocumentPortrait(Boolean documentPortrait) {
    this.documentPortrait = documentPortrait;
  }


  public DisclosedFields selfie(Boolean selfie) {
    this.selfie = selfie;
    return this;
  }

  /**
   * Get selfie
   * @return selfie
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SELFIE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getSelfie() {
    return selfie;
  }


  @JsonProperty(JSON_PROPERTY_SELFIE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSelfie(Boolean selfie) {
    this.selfie = selfie;
  }


  /**
   * Return true if this DisclosedFields object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisclosedFields disclosedFields = (DisclosedFields) o;
    return Objects.equals(this.idNumber, disclosedFields.idNumber) &&
        Objects.equals(this.givenName, disclosedFields.givenName) &&
        Objects.equals(this.familyName, disclosedFields.familyName) &&
        Objects.equals(this.address, disclosedFields.address) &&
        Objects.equals(this.dateOfBirth, disclosedFields.dateOfBirth) &&
        Objects.equals(this.country, disclosedFields.country) &&
        Objects.equals(this.issueDate, disclosedFields.issueDate) &&
        Objects.equals(this.expirationDate, disclosedFields.expirationDate) &&
        Objects.equals(this.documentFront, disclosedFields.documentFront) &&
        Objects.equals(this.documentBack, disclosedFields.documentBack) &&
        Objects.equals(this.documentPortrait, disclosedFields.documentPortrait) &&
        Objects.equals(this.selfie, disclosedFields.selfie);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idNumber, givenName, familyName, address, dateOfBirth, country, issueDate, expirationDate, documentFront, documentBack, documentPortrait, selfie);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisclosedFields {\n");
    sb.append("    idNumber: ").append(toIndentedString(idNumber)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    documentFront: ").append(toIndentedString(documentFront)).append("\n");
    sb.append("    documentBack: ").append(toIndentedString(documentBack)).append("\n");
    sb.append("    documentPortrait: ").append(toIndentedString(documentPortrait)).append("\n");
    sb.append("    selfie: ").append(toIndentedString(selfie)).append("\n");
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

    // add `idNumber` to the URL query string
    if (getIdNumber() != null) {
      joiner.add(String.format("%sidNumber%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getIdNumber()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `givenName` to the URL query string
    if (getGivenName() != null) {
      joiner.add(String.format("%sgivenName%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getGivenName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `familyName` to the URL query string
    if (getFamilyName() != null) {
      joiner.add(String.format("%sfamilyName%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getFamilyName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `address` to the URL query string
    if (getAddress() != null) {
      joiner.add(String.format("%saddress%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAddress()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `dateOfBirth` to the URL query string
    if (getDateOfBirth() != null) {
      joiner.add(String.format("%sdateOfBirth%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDateOfBirth()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `country` to the URL query string
    if (getCountry() != null) {
      joiner.add(String.format("%scountry%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCountry()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `issueDate` to the URL query string
    if (getIssueDate() != null) {
      joiner.add(String.format("%sissueDate%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getIssueDate()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `expirationDate` to the URL query string
    if (getExpirationDate() != null) {
      joiner.add(String.format("%sexpirationDate%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getExpirationDate()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `documentFront` to the URL query string
    if (getDocumentFront() != null) {
      joiner.add(String.format("%sdocumentFront%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDocumentFront()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `documentBack` to the URL query string
    if (getDocumentBack() != null) {
      joiner.add(String.format("%sdocumentBack%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDocumentBack()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `documentPortrait` to the URL query string
    if (getDocumentPortrait() != null) {
      joiner.add(String.format("%sdocumentPortrait%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDocumentPortrait()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `selfie` to the URL query string
    if (getSelfie() != null) {
      joiner.add(String.format("%sselfie%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSelfie()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

