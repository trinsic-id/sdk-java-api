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
import id.trinsic.api.models.IdentityData;
import id.trinsic.api.models.Session;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import id.trinsic.ApiClient;
/**
 * GetSessionResultResponse
 */
@JsonPropertyOrder({
  GetSessionResultResponse.JSON_PROPERTY_SESSION,
  GetSessionResultResponse.JSON_PROPERTY_IDENTITY_DATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-18T20:49:40.490361356Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetSessionResultResponse {
  public static final String JSON_PROPERTY_SESSION = "session";
  private Session session;

  public static final String JSON_PROPERTY_IDENTITY_DATA = "identityData";
  private IdentityData identityData;

  public GetSessionResultResponse() { 
  }

  public GetSessionResultResponse session(Session session) {
    this.session = session;
    return this;
  }

  /**
   * Get session
   * @return session
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SESSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Session getSession() {
    return session;
  }


  @JsonProperty(JSON_PROPERTY_SESSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSession(Session session) {
    this.session = session;
  }


  public GetSessionResultResponse identityData(IdentityData identityData) {
    this.identityData = identityData;
    return this;
  }

  /**
   * Get identityData
   * @return identityData
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IDENTITY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IdentityData getIdentityData() {
    return identityData;
  }


  @JsonProperty(JSON_PROPERTY_IDENTITY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdentityData(IdentityData identityData) {
    this.identityData = identityData;
  }


  /**
   * Return true if this GetSessionResultResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSessionResultResponse getSessionResultResponse = (GetSessionResultResponse) o;
    return Objects.equals(this.session, getSessionResultResponse.session) &&
        Objects.equals(this.identityData, getSessionResultResponse.identityData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(session, identityData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSessionResultResponse {\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    identityData: ").append(toIndentedString(identityData)).append("\n");
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

    // add `session` to the URL query string
    if (getSession() != null) {
      joiner.add(getSession().toUrlQueryString(prefix + "session" + suffix));
    }

    // add `identityData` to the URL query string
    if (getIdentityData() != null) {
      joiner.add(getIdentityData().toUrlQueryString(prefix + "identityData" + suffix));
    }

    return joiner.toString();
  }
}

