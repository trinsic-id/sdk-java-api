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
import id.trinsic.api.models.KnownPersonData;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import id.trinsic.ApiClient;
/**
 * Known identity data of an individual being verified.                Provide this to Trinsic during Session creation to enable improved identity provider selection recommendations.
 */
@JsonPropertyOrder({
  KnownIdentityData.JSON_PROPERTY_PERSON
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-21T00:14:35.168070879Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class KnownIdentityData {
  public static final String JSON_PROPERTY_PERSON = "person";
  private JsonNullable<KnownPersonData> person = JsonNullable.<KnownPersonData>undefined();

  public KnownIdentityData() { 
  }

  public KnownIdentityData person(KnownPersonData person) {
    this.person = JsonNullable.<KnownPersonData>of(person);
    return this;
  }

  /**
   * Known identity data specific to the person being verified
   * @return person
   */
  @javax.annotation.Nullable
  @JsonIgnore
  public KnownPersonData getPerson() {
        return person.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PERSON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<KnownPersonData> getPerson_JsonNullable() {
    return person;
  }
  
  @JsonProperty(JSON_PROPERTY_PERSON)
  public void setPerson_JsonNullable(JsonNullable<KnownPersonData> person) {
    this.person = person;
  }

  public void setPerson(KnownPersonData person) {
    this.person = JsonNullable.<KnownPersonData>of(person);
  }


  /**
   * Return true if this KnownIdentityData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnownIdentityData knownIdentityData = (KnownIdentityData) o;
    return equalsNullable(this.person, knownIdentityData.person);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(person));
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
    sb.append("class KnownIdentityData {\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
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

    // add `person` to the URL query string
    if (getPerson() != null) {
      joiner.add(getPerson().toUrlQueryString(prefix + "person" + suffix));
    }

    return joiner.toString();
  }
}

