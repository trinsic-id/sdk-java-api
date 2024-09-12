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
 * GetAttachmentRequest
 */
@JsonPropertyOrder({
  GetAttachmentRequest.JSON_PROPERTY_ATTACHMENT_ACCESS_KEY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-12T18:15:29.677466657Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetAttachmentRequest {
  public static final String JSON_PROPERTY_ATTACHMENT_ACCESS_KEY = "attachmentAccessKey";
  private String attachmentAccessKey;

  public GetAttachmentRequest() { 
  }

  public GetAttachmentRequest attachmentAccessKey(String attachmentAccessKey) {
    this.attachmentAccessKey = attachmentAccessKey;
    return this;
  }

  /**
   * The Attachment Access Key to exchange for the raw file contents of the related Attachment
   * @return attachmentAccessKey
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ATTACHMENT_ACCESS_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAttachmentAccessKey() {
    return attachmentAccessKey;
  }


  @JsonProperty(JSON_PROPERTY_ATTACHMENT_ACCESS_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAttachmentAccessKey(String attachmentAccessKey) {
    this.attachmentAccessKey = attachmentAccessKey;
  }


  /**
   * Return true if this GetAttachmentRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAttachmentRequest getAttachmentRequest = (GetAttachmentRequest) o;
    return Objects.equals(this.attachmentAccessKey, getAttachmentRequest.attachmentAccessKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachmentAccessKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAttachmentRequest {\n");
    sb.append("    attachmentAccessKey: ").append(toIndentedString(attachmentAccessKey)).append("\n");
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

    // add `attachmentAccessKey` to the URL query string
    if (getAttachmentAccessKey() != null) {
      joiner.add(String.format("%sattachmentAccessKey%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAttachmentAccessKey()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

