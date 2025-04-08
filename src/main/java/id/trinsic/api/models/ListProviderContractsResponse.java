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
import id.trinsic.api.models.ProviderContract;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import id.trinsic.ApiClient;
/**
 * ListProviderContractsResponse
 */
@JsonPropertyOrder({
  ListProviderContractsResponse.JSON_PROPERTY_PROVIDER_CONTRACTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-08T20:37:53.342254032Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ListProviderContractsResponse {
  public static final String JSON_PROPERTY_PROVIDER_CONTRACTS = "providerContracts";
  private List<ProviderContract> providerContracts = new ArrayList<>();

  public ListProviderContractsResponse() { 
  }

  public ListProviderContractsResponse providerContracts(List<ProviderContract> providerContracts) {
    this.providerContracts = providerContracts;
    return this;
  }

  public ListProviderContractsResponse addProviderContractsItem(ProviderContract providerContractsItem) {
    if (this.providerContracts == null) {
      this.providerContracts = new ArrayList<>();
    }
    this.providerContracts.add(providerContractsItem);
    return this;
  }

  /**
   * Contracts for all Providers available to your App, filtered by your App&#39;s current test mode setting.
   * @return providerContracts
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PROVIDER_CONTRACTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ProviderContract> getProviderContracts() {
    return providerContracts;
  }


  @JsonProperty(JSON_PROPERTY_PROVIDER_CONTRACTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProviderContracts(List<ProviderContract> providerContracts) {
    this.providerContracts = providerContracts;
  }


  /**
   * Return true if this ListProviderContractsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListProviderContractsResponse listProviderContractsResponse = (ListProviderContractsResponse) o;
    return Objects.equals(this.providerContracts, listProviderContractsResponse.providerContracts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerContracts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListProviderContractsResponse {\n");
    sb.append("    providerContracts: ").append(toIndentedString(providerContracts)).append("\n");
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

    // add `providerContracts` to the URL query string
    if (getProviderContracts() != null) {
      for (int i = 0; i < getProviderContracts().size(); i++) {
        if (getProviderContracts().get(i) != null) {
          joiner.add(getProviderContracts().get(i).toUrlQueryString(String.format("%sproviderContracts%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

