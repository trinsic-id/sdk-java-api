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
import id.trinsic.api.models.FieldAvailability;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import id.trinsic.ApiClient;
/**
 * Information about a field that a Provider will return in verification results.
 */
@JsonPropertyOrder({
  ContractField.JSON_PROPERTY_NAME,
  ContractField.JSON_PROPERTY_OUTPUTTED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-08-01T19:33:26.347436485Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class ContractField {
  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nonnull
  private String name;

  public static final String JSON_PROPERTY_OUTPUTTED = "outputted";
  @javax.annotation.Nonnull
  private FieldAvailability outputted;

  public ContractField() { 
  }

  public ContractField name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the field as it appears in verification results.
   * @return name
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public ContractField outputted(@javax.annotation.Nonnull FieldAvailability outputted) {
    this.outputted = outputted;
    return this;
  }

  /**
   * Indicates when this field will be present in verification results.
   * @return outputted
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_OUTPUTTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FieldAvailability getOutputted() {
    return outputted;
  }


  @JsonProperty(JSON_PROPERTY_OUTPUTTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOutputted(@javax.annotation.Nonnull FieldAvailability outputted) {
    this.outputted = outputted;
  }


  /**
   * Return true if this ContractField object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractField contractField = (ContractField) o;
    return Objects.equals(this.name, contractField.name) &&
        Objects.equals(this.outputted, contractField.outputted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, outputted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractField {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    outputted: ").append(toIndentedString(outputted)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getName()))));
    }

    // add `outputted` to the URL query string
    if (getOutputted() != null) {
      joiner.add(String.format("%soutputted%s=%s", prefix, suffix, ApiClient.urlEncode(ApiClient.valueToString(getOutputted()))));
    }

    return joiner.toString();
  }
}

