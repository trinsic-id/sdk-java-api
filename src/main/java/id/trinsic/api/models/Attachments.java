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
 * Attachment Access Keys for attachments (eg document / selfie images)
 */
@JsonPropertyOrder({
  Attachments.JSON_PROPERTY_SELFIE,
  Attachments.JSON_PROPERTY_DOCUMENT_FRONT,
  Attachments.JSON_PROPERTY_DOCUMENT_BACK,
  Attachments.JSON_PROPERTY_DOCUMENT_PORTRAIT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-27T15:39:48.457157Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class Attachments {
  public static final String JSON_PROPERTY_SELFIE = "selfie";
  private String selfie;

  public static final String JSON_PROPERTY_DOCUMENT_FRONT = "documentFront";
  private String documentFront;

  public static final String JSON_PROPERTY_DOCUMENT_BACK = "documentBack";
  private String documentBack;

  public static final String JSON_PROPERTY_DOCUMENT_PORTRAIT = "documentPortrait";
  private String documentPortrait;

  public Attachments() { 
  }

  public Attachments selfie(String selfie) {
    this.selfie = selfie;
    return this;
  }

  /**
   * Key to access the selfie image (if relevant) for this verification
   * @return selfie
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SELFIE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSelfie() {
    return selfie;
  }


  @JsonProperty(JSON_PROPERTY_SELFIE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSelfie(String selfie) {
    this.selfie = selfie;
  }


  public Attachments documentFront(String documentFront) {
    this.documentFront = documentFront;
    return this;
  }

  /**
   * Key to access the document front image (if relevant) for this verification
   * @return documentFront
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOCUMENT_FRONT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDocumentFront() {
    return documentFront;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENT_FRONT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocumentFront(String documentFront) {
    this.documentFront = documentFront;
  }


  public Attachments documentBack(String documentBack) {
    this.documentBack = documentBack;
    return this;
  }

  /**
   * Key to access the document back image (if relevant) for this verification
   * @return documentBack
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOCUMENT_BACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDocumentBack() {
    return documentBack;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENT_BACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocumentBack(String documentBack) {
    this.documentBack = documentBack;
  }


  public Attachments documentPortrait(String documentPortrait) {
    this.documentPortrait = documentPortrait;
    return this;
  }

  /**
   * Key to access the document portrait image (if relevant and available) for this verification.                Specifically, this is a cropped version of the document front image which includes only the portrait on the document.
   * @return documentPortrait
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOCUMENT_PORTRAIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDocumentPortrait() {
    return documentPortrait;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENT_PORTRAIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocumentPortrait(String documentPortrait) {
    this.documentPortrait = documentPortrait;
  }


  /**
   * Return true if this Attachments object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attachments attachments = (Attachments) o;
    return Objects.equals(this.selfie, attachments.selfie) &&
        Objects.equals(this.documentFront, attachments.documentFront) &&
        Objects.equals(this.documentBack, attachments.documentBack) &&
        Objects.equals(this.documentPortrait, attachments.documentPortrait);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selfie, documentFront, documentBack, documentPortrait);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attachments {\n");
    sb.append("    selfie: ").append(toIndentedString(selfie)).append("\n");
    sb.append("    documentFront: ").append(toIndentedString(documentFront)).append("\n");
    sb.append("    documentBack: ").append(toIndentedString(documentBack)).append("\n");
    sb.append("    documentPortrait: ").append(toIndentedString(documentPortrait)).append("\n");
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

    // add `selfie` to the URL query string
    if (getSelfie() != null) {
      joiner.add(String.format("%sselfie%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSelfie()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
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

    return joiner.toString();
  }
}

