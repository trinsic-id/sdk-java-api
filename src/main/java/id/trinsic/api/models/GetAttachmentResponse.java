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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import id.trinsic.ApiClient;
/**
 * GetAttachmentResponse
 */
@JsonPropertyOrder({
  GetAttachmentResponse.JSON_PROPERTY_CONTENT,
  GetAttachmentResponse.JSON_PROPERTY_CONTENT_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-08-01T19:33:26.347436485Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class GetAttachmentResponse {
  public static final String JSON_PROPERTY_CONTENT = "content";
  @javax.annotation.Nonnull
  private byte[] content;

  public static final String JSON_PROPERTY_CONTENT_TYPE = "contentType";
  @javax.annotation.Nonnull
  private String contentType;

  public GetAttachmentResponse() { 
  }

  public GetAttachmentResponse content(@javax.annotation.Nonnull byte[] content) {
    this.content = content;
    return this;
  }

  /**
   * The raw file contents of the Attachment
   * @return content
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public byte[] getContent() {
    return content;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContent(@javax.annotation.Nonnull byte[] content) {
    this.content = content;
  }


  public GetAttachmentResponse contentType(@javax.annotation.Nonnull String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * The MIME type of the Attachment data
   * @return contentType
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CONTENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getContentType() {
    return contentType;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContentType(@javax.annotation.Nonnull String contentType) {
    this.contentType = contentType;
  }


  /**
   * Return true if this GetAttachmentResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAttachmentResponse getAttachmentResponse = (GetAttachmentResponse) o;
    return Arrays.equals(this.content, getAttachmentResponse.content) &&
        Objects.equals(this.contentType, getAttachmentResponse.contentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(content), contentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAttachmentResponse {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
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

    // add `content` to the URL query string
    if (getContent() != null) {
      joiner.add(String.format("%scontent%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getContent()))));
    }

    // add `contentType` to the URL query string
    if (getContentType() != null) {
      joiner.add(String.format("%scontentType%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getContentType()))));
    }

    return joiner.toString();
  }
}

