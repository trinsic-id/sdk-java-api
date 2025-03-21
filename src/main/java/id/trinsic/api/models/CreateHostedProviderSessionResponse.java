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
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import id.trinsic.ApiClient;
/**
 * CreateHostedProviderSessionResponse
 */
@JsonPropertyOrder({
  CreateHostedProviderSessionResponse.JSON_PROPERTY_SESSION_ID,
  CreateHostedProviderSessionResponse.JSON_PROPERTY_LAUNCH_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-21T00:14:35.168070879Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CreateHostedProviderSessionResponse {
  public static final String JSON_PROPERTY_SESSION_ID = "sessionId";
  private UUID sessionId;

  public static final String JSON_PROPERTY_LAUNCH_URL = "launchUrl";
  private JsonNullable<String> launchUrl = JsonNullable.<String>undefined();

  public CreateHostedProviderSessionResponse() { 
  }

  public CreateHostedProviderSessionResponse sessionId(UUID sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  /**
   * The ID of the newly-created Acceptance Session
   * @return sessionId
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getSessionId() {
    return sessionId;
  }


  @JsonProperty(JSON_PROPERTY_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSessionId(UUID sessionId) {
    this.sessionId = sessionId;
  }


  public CreateHostedProviderSessionResponse launchUrl(String launchUrl) {
    this.launchUrl = JsonNullable.<String>of(launchUrl);
    return this;
  }

  /**
   * The URL that should be used to launch the Hosted Provider Session on your user&#39;s device.                There are two recommended ways to do so:  - Redirect their browser to the &#x60;LaunchUrl&#x60; as a top-level navigation  - Open a popup window and navigate it to the &#x60;LaunchUrl&#x60;                This URL is sensitive and as such can only be obtained once. If you need to obtain it again, you will need to create a new Acceptance Session.
   * @return launchUrl
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public String getLaunchUrl() {
        return launchUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAUNCH_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLaunchUrl_JsonNullable() {
    return launchUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_LAUNCH_URL)
  public void setLaunchUrl_JsonNullable(JsonNullable<String> launchUrl) {
    this.launchUrl = launchUrl;
  }

  public void setLaunchUrl(String launchUrl) {
    this.launchUrl = JsonNullable.<String>of(launchUrl);
  }


  /**
   * Return true if this CreateHostedProviderSessionResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateHostedProviderSessionResponse createHostedProviderSessionResponse = (CreateHostedProviderSessionResponse) o;
    return Objects.equals(this.sessionId, createHostedProviderSessionResponse.sessionId) &&
        equalsNullable(this.launchUrl, createHostedProviderSessionResponse.launchUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionId, hashCodeNullable(launchUrl));
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
    sb.append("class CreateHostedProviderSessionResponse {\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    launchUrl: ").append(toIndentedString(launchUrl)).append("\n");
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

    // add `sessionId` to the URL query string
    if (getSessionId() != null) {
      joiner.add(String.format("%ssessionId%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSessionId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `launchUrl` to the URL query string
    if (getLaunchUrl() != null) {
      joiner.add(String.format("%slaunchUrl%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getLaunchUrl()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

