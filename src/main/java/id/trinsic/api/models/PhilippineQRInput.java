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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import id.trinsic.ApiClient;
/**
 * PhilippineQRInput
 */
@JsonPropertyOrder({
  PhilippineQRInput.JSON_PROPERTY_QR_CODE_TEXT,
  PhilippineQRInput.JSON_PROPERTY_QR_CODE_IMAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-08-01T19:33:26.347436485Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class PhilippineQRInput {
  public static final String JSON_PROPERTY_QR_CODE_TEXT = "qrCodeText";
  private JsonNullable<String> qrCodeText = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_QR_CODE_IMAGE = "qrCodeImage";
  private JsonNullable<byte[]> qrCodeImage = JsonNullable.<byte[]>undefined();

  public PhilippineQRInput() { 
  }

  public PhilippineQRInput qrCodeText(@javax.annotation.Nullable String qrCodeText) {
    this.qrCodeText = JsonNullable.<String>of(qrCodeText);
    return this;
  }

  /**
   * The raw text of the user&#39;s QR code after decoding it.
   * @return qrCodeText
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getQrCodeText() {
        return qrCodeText.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_QR_CODE_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getQrCodeText_JsonNullable() {
    return qrCodeText;
  }
  
  @JsonProperty(JSON_PROPERTY_QR_CODE_TEXT)
  public void setQrCodeText_JsonNullable(JsonNullable<String> qrCodeText) {
    this.qrCodeText = qrCodeText;
  }

  public void setQrCodeText(@javax.annotation.Nullable String qrCodeText) {
    this.qrCodeText = JsonNullable.<String>of(qrCodeText);
  }


  public PhilippineQRInput qrCodeImage(@javax.annotation.Nullable byte[] qrCodeImage) {
    this.qrCodeImage = JsonNullable.<byte[]>of(qrCodeImage);
    return this;
  }

  /**
   * The raw bytes of the image containing the user&#39;s QR code.
   * @return qrCodeImage
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public byte[] getQrCodeImage() {
        return qrCodeImage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_QR_CODE_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<byte[]> getQrCodeImage_JsonNullable() {
    return qrCodeImage;
  }
  
  @JsonProperty(JSON_PROPERTY_QR_CODE_IMAGE)
  public void setQrCodeImage_JsonNullable(JsonNullable<byte[]> qrCodeImage) {
    this.qrCodeImage = qrCodeImage;
  }

  public void setQrCodeImage(@javax.annotation.Nullable byte[] qrCodeImage) {
    this.qrCodeImage = JsonNullable.<byte[]>of(qrCodeImage);
  }


  /**
   * Return true if this PhilippineQRInput object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhilippineQRInput philippineQRInput = (PhilippineQRInput) o;
    return equalsNullable(this.qrCodeText, philippineQRInput.qrCodeText) &&
        equalsNullable(this.qrCodeImage, philippineQRInput.qrCodeImage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(qrCodeText), hashCodeNullable(qrCodeImage));
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
    sb.append("class PhilippineQRInput {\n");
    sb.append("    qrCodeText: ").append(toIndentedString(qrCodeText)).append("\n");
    sb.append("    qrCodeImage: ").append(toIndentedString(qrCodeImage)).append("\n");
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

    // add `qrCodeText` to the URL query string
    if (getQrCodeText() != null) {
      joiner.add(String.format("%sqrCodeText%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getQrCodeText()))));
    }

    // add `qrCodeImage` to the URL query string
    if (getQrCodeImage() != null) {
      joiner.add(String.format("%sqrCodeImage%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getQrCodeImage()))));
    }

    return joiner.toString();
  }
}

