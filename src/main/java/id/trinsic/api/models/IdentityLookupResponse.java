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
 * IdentityLookupResponse
 */
@JsonPropertyOrder({
  IdentityLookupResponse.JSON_PROPERTY_IDENTITY_IN_NETWORK
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-08-28T18:15:16.114476Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class IdentityLookupResponse {
  public static final String JSON_PROPERTY_IDENTITY_IN_NETWORK = "identityInNetwork";
  private Boolean identityInNetwork;

  public IdentityLookupResponse() { 
  }

  public IdentityLookupResponse identityInNetwork(Boolean identityInNetwork) {
    this.identityInNetwork = identityInNetwork;
    return this;
  }

  /**
   * Whether the given phone number is known to have an identity in the network.
   * @return identityInNetwork
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IDENTITY_IN_NETWORK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIdentityInNetwork() {
    return identityInNetwork;
  }


  @JsonProperty(JSON_PROPERTY_IDENTITY_IN_NETWORK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIdentityInNetwork(Boolean identityInNetwork) {
    this.identityInNetwork = identityInNetwork;
  }


  /**
   * Return true if this IdentityLookupResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityLookupResponse identityLookupResponse = (IdentityLookupResponse) o;
    return Objects.equals(this.identityInNetwork, identityLookupResponse.identityInNetwork);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identityInNetwork);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityLookupResponse {\n");
    sb.append("    identityInNetwork: ").append(toIndentedString(identityInNetwork)).append("\n");
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

    // add `identityInNetwork` to the URL query string
    if (getIdentityInNetwork() != null) {
      joiner.add(String.format("%sidentityInNetwork%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getIdentityInNetwork()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

