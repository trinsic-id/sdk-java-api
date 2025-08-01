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
import id.trinsic.api.models.IntegrationStep;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import id.trinsic.ApiClient;
/**
 * RefreshStepContentResponse
 */
@JsonPropertyOrder({
  RefreshStepContentResponse.JSON_PROPERTY_NEXT_STEP
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-08-01T19:33:26.347436485Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class RefreshStepContentResponse {
  public static final String JSON_PROPERTY_NEXT_STEP = "nextStep";
  @javax.annotation.Nonnull
  private IntegrationStep nextStep;

  public RefreshStepContentResponse() { 
  }

  public RefreshStepContentResponse nextStep(@javax.annotation.Nonnull IntegrationStep nextStep) {
    this.nextStep = nextStep;
    return this;
  }

  /**
   * The integration&#39;s next step with refreshed content
   * @return nextStep
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NEXT_STEP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IntegrationStep getNextStep() {
    return nextStep;
  }


  @JsonProperty(JSON_PROPERTY_NEXT_STEP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNextStep(@javax.annotation.Nonnull IntegrationStep nextStep) {
    this.nextStep = nextStep;
  }


  /**
   * Return true if this RefreshStepContentResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefreshStepContentResponse refreshStepContentResponse = (RefreshStepContentResponse) o;
    return Objects.equals(this.nextStep, refreshStepContentResponse.nextStep);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextStep);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefreshStepContentResponse {\n");
    sb.append("    nextStep: ").append(toIndentedString(nextStep)).append("\n");
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

    // add `nextStep` to the URL query string
    if (getNextStep() != null) {
      joiner.add(getNextStep().toUrlQueryString(prefix + "nextStep" + suffix));
    }

    return joiner.toString();
  }
}

