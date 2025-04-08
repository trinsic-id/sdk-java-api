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
import id.trinsic.api.models.Session;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import id.trinsic.ApiClient;
/**
 * ListSessionsResponse
 */
@JsonPropertyOrder({
  ListSessionsResponse.JSON_PROPERTY_SESSIONS,
  ListSessionsResponse.JSON_PROPERTY_TOTAL,
  ListSessionsResponse.JSON_PROPERTY_MORE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-08T20:37:53.342254032Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ListSessionsResponse {
  public static final String JSON_PROPERTY_SESSIONS = "sessions";
  private List<Session> sessions = new ArrayList<>();

  public static final String JSON_PROPERTY_TOTAL = "total";
  private Integer total;

  public static final String JSON_PROPERTY_MORE = "more";
  private Boolean more;

  public ListSessionsResponse() { 
  }

  public ListSessionsResponse sessions(List<Session> sessions) {
    this.sessions = sessions;
    return this;
  }

  public ListSessionsResponse addSessionsItem(Session sessionsItem) {
    if (this.sessions == null) {
      this.sessions = new ArrayList<>();
    }
    this.sessions.add(sessionsItem);
    return this;
  }

  /**
   * Get sessions
   * @return sessions
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SESSIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<Session> getSessions() {
    return sessions;
  }


  @JsonProperty(JSON_PROPERTY_SESSIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSessions(List<Session> sessions) {
    this.sessions = sessions;
  }


  public ListSessionsResponse total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * The total number of sessions tied to your account
   * @return total
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getTotal() {
    return total;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotal(Integer total) {
    this.total = total;
  }


  public ListSessionsResponse more(Boolean more) {
    this.more = more;
    return this;
  }

  /**
   * Whether there are additional pages of sessions to retrieve
   * @return more
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MORE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getMore() {
    return more;
  }


  @JsonProperty(JSON_PROPERTY_MORE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMore(Boolean more) {
    this.more = more;
  }


  /**
   * Return true if this ListSessionsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListSessionsResponse listSessionsResponse = (ListSessionsResponse) o;
    return Objects.equals(this.sessions, listSessionsResponse.sessions) &&
        Objects.equals(this.total, listSessionsResponse.total) &&
        Objects.equals(this.more, listSessionsResponse.more);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessions, total, more);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListSessionsResponse {\n");
    sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    more: ").append(toIndentedString(more)).append("\n");
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

    // add `sessions` to the URL query string
    if (getSessions() != null) {
      for (int i = 0; i < getSessions().size(); i++) {
        if (getSessions().get(i) != null) {
          joiner.add(getSessions().get(i).toUrlQueryString(String.format("%ssessions%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `total` to the URL query string
    if (getTotal() != null) {
      joiner.add(String.format("%stotal%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getTotal()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `more` to the URL query string
    if (getMore() != null) {
      joiner.add(String.format("%smore%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getMore()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

