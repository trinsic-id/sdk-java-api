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
import id.trinsic.api.models.DisclosedFields;
import id.trinsic.api.models.SessionFailCode;
import id.trinsic.api.models.SessionState;
import id.trinsic.api.models.Verification;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import id.trinsic.ApiClient;
/**
 * Session
 */
@JsonPropertyOrder({
  Session.JSON_PROPERTY_ID,
  Session.JSON_PROPERTY_STATE,
  Session.JSON_PROPERTY_FAIL_CODE,
  Session.JSON_PROPERTY_VERIFICATION,
  Session.JSON_PROPERTY_DISCLOSED_FIELDS,
  Session.JSON_PROPERTY_CREATED,
  Session.JSON_PROPERTY_UPDATED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-27T16:04:29.952666Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class Session {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_STATE = "state";
  private SessionState state;

  public static final String JSON_PROPERTY_FAIL_CODE = "failCode";
  private SessionFailCode failCode;

  public static final String JSON_PROPERTY_VERIFICATION = "verification";
  private Verification verification;

  public static final String JSON_PROPERTY_DISCLOSED_FIELDS = "disclosedFields";
  private DisclosedFields disclosedFields;

  public static final String JSON_PROPERTY_CREATED = "created";
  private Long created;

  public static final String JSON_PROPERTY_UPDATED = "updated";
  private Long updated;

  public Session() { 
  }

  public Session id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public Session state(SessionState state) {
    this.state = state;
    return this;
  }

  /**
   * The state of the session
   * @return state
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SessionState getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setState(SessionState state) {
    this.state = state;
  }


  public Session failCode(SessionFailCode failCode) {
    this.failCode = failCode;
    return this;
  }

  /**
   * If the session is in state &#x60;IdvFailed&#x60;, this field contains the reason for failure.
   * @return failCode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAIL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SessionFailCode getFailCode() {
    return failCode;
  }


  @JsonProperty(JSON_PROPERTY_FAIL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailCode(SessionFailCode failCode) {
    this.failCode = failCode;
  }


  public Session verification(Verification verification) {
    this.verification = verification;
    return this;
  }

  /**
   * The underlying verification for this Session
   * @return verification
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VERIFICATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Verification getVerification() {
    return verification;
  }


  @JsonProperty(JSON_PROPERTY_VERIFICATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVerification(Verification verification) {
    this.verification = verification;
  }


  public Session disclosedFields(DisclosedFields disclosedFields) {
    this.disclosedFields = disclosedFields;
    return this;
  }

  /**
   * The fields that were requested to be disclosed when the Session was created
   * @return disclosedFields
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DISCLOSED_FIELDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public DisclosedFields getDisclosedFields() {
    return disclosedFields;
  }


  @JsonProperty(JSON_PROPERTY_DISCLOSED_FIELDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDisclosedFields(DisclosedFields disclosedFields) {
    this.disclosedFields = disclosedFields;
  }


  public Session created(Long created) {
    this.created = created;
    return this;
  }

  /**
   * The unix timestamp, in seconds, when this session was created
   * @return created
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getCreated() {
    return created;
  }


  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreated(Long created) {
    this.created = created;
  }


  public Session updated(Long updated) {
    this.updated = updated;
    return this;
  }

  /**
   * The unix timestamp, in seconds, when this session&#39;s state last changed
   * @return updated
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UPDATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getUpdated() {
    return updated;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUpdated(Long updated) {
    this.updated = updated;
  }


  /**
   * Return true if this Session object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Session session = (Session) o;
    return Objects.equals(this.id, session.id) &&
        Objects.equals(this.state, session.state) &&
        Objects.equals(this.failCode, session.failCode) &&
        Objects.equals(this.verification, session.verification) &&
        Objects.equals(this.disclosedFields, session.disclosedFields) &&
        Objects.equals(this.created, session.created) &&
        Objects.equals(this.updated, session.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, failCode, verification, disclosedFields, created, updated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Session {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    failCode: ").append(toIndentedString(failCode)).append("\n");
    sb.append("    verification: ").append(toIndentedString(verification)).append("\n");
    sb.append("    disclosedFields: ").append(toIndentedString(disclosedFields)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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

    // add `id` to the URL query string
    if (getId() != null) {
      joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `state` to the URL query string
    if (getState() != null) {
      joiner.add(String.format("%sstate%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getState()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `failCode` to the URL query string
    if (getFailCode() != null) {
      joiner.add(String.format("%sfailCode%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getFailCode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `verification` to the URL query string
    if (getVerification() != null) {
      joiner.add(getVerification().toUrlQueryString(prefix + "verification" + suffix));
    }

    // add `disclosedFields` to the URL query string
    if (getDisclosedFields() != null) {
      joiner.add(getDisclosedFields().toUrlQueryString(prefix + "disclosedFields" + suffix));
    }

    // add `created` to the URL query string
    if (getCreated() != null) {
      joiner.add(String.format("%screated%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCreated()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `updated` to the URL query string
    if (getUpdated() != null) {
      joiner.add(String.format("%supdated%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getUpdated()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}
