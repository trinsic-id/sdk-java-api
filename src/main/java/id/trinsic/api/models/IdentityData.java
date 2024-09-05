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
import id.trinsic.api.models.Attachments;
import id.trinsic.api.models.DocumentData;
import id.trinsic.api.models.PersonData;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import id.trinsic.ApiClient;
/**
 * IdentityData
 */
@JsonPropertyOrder({
  IdentityData.JSON_PROPERTY_ORIGINATING_PROVIDER_ID,
  IdentityData.JSON_PROPERTY_PERSON,
  IdentityData.JSON_PROPERTY_DOCUMENT,
  IdentityData.JSON_PROPERTY_ATTACHMENTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-05T17:58:46.930776Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class IdentityData {
  public static final String JSON_PROPERTY_ORIGINATING_PROVIDER_ID = "originatingProviderId";
  private String originatingProviderId;

  public static final String JSON_PROPERTY_PERSON = "person";
  private PersonData person;

  public static final String JSON_PROPERTY_DOCUMENT = "document";
  private DocumentData document;

  public static final String JSON_PROPERTY_ATTACHMENTS = "attachments";
  private Attachments attachments;

  public IdentityData() { 
  }

  public IdentityData originatingProviderId(String originatingProviderId) {
    this.originatingProviderId = originatingProviderId;
    return this;
  }

  /**
   * The ID of the integration from which this data originated (eg \&quot;yoti\&quot;, \&quot;clear\&quot;)
   * @return originatingProviderId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORIGINATING_PROVIDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOriginatingProviderId() {
    return originatingProviderId;
  }


  @JsonProperty(JSON_PROPERTY_ORIGINATING_PROVIDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginatingProviderId(String originatingProviderId) {
    this.originatingProviderId = originatingProviderId;
  }


  public IdentityData person(PersonData person) {
    this.person = person;
    return this;
  }

  /**
   * Identity data of the individual who was verified
   * @return person
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERSON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public PersonData getPerson() {
    return person;
  }


  @JsonProperty(JSON_PROPERTY_PERSON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPerson(PersonData person) {
    this.person = person;
  }


  public IdentityData document(DocumentData document) {
    this.document = document;
    return this;
  }

  /**
   * Identity data of the document involved in verification, if relevant
   * @return document
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOCUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DocumentData getDocument() {
    return document;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocument(DocumentData document) {
    this.document = document;
  }


  public IdentityData attachments(Attachments attachments) {
    this.attachments = attachments;
    return this;
  }

  /**
   * Access keys for attachments (eg document/selfie images)
   * @return attachments
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTACHMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Attachments getAttachments() {
    return attachments;
  }


  @JsonProperty(JSON_PROPERTY_ATTACHMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttachments(Attachments attachments) {
    this.attachments = attachments;
  }


  /**
   * Return true if this IdentityData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityData identityData = (IdentityData) o;
    return Objects.equals(this.originatingProviderId, identityData.originatingProviderId) &&
        Objects.equals(this.person, identityData.person) &&
        Objects.equals(this.document, identityData.document) &&
        Objects.equals(this.attachments, identityData.attachments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originatingProviderId, person, document, attachments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityData {\n");
    sb.append("    originatingProviderId: ").append(toIndentedString(originatingProviderId)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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

    // add `originatingProviderId` to the URL query string
    if (getOriginatingProviderId() != null) {
      joiner.add(String.format("%soriginatingProviderId%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getOriginatingProviderId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `person` to the URL query string
    if (getPerson() != null) {
      joiner.add(getPerson().toUrlQueryString(prefix + "person" + suffix));
    }

    // add `document` to the URL query string
    if (getDocument() != null) {
      joiner.add(getDocument().toUrlQueryString(prefix + "document" + suffix));
    }

    // add `attachments` to the URL query string
    if (getAttachments() != null) {
      joiner.add(getAttachments().toUrlQueryString(prefix + "attachments" + suffix));
    }

    return joiner.toString();
  }
}

