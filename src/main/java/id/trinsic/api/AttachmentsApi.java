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

package id.trinsic.api;

import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.ApiResponse;
import id.trinsic.Configuration;
import id.trinsic.Pair;

import id.trinsic.api.models.GetAttachmentRequest;
import id.trinsic.api.models.GetAttachmentResponse;
import id.trinsic.api.models.ProblemDetails;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.http.HttpRequest;
import java.nio.channels.Channels;
import java.nio.channels.Pipe;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-08-01T19:33:26.347436485Z[Etc/UTC]", comments = "Generator version: 7.13.0")
public class AttachmentsApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public AttachmentsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AttachmentsApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
    memberVarAsyncResponseInterceptor = apiClient.getAsyncResponseInterceptor();
  }

  protected ApiException getApiException(String operationId, HttpResponse<InputStream> response) throws IOException {
    String body = response.body() == null ? null : new String(response.body().readAllBytes());
    String message = formatExceptionMessage(operationId, response.statusCode(), body);
    return new ApiException(response.statusCode(), message, response.headers(), body);
  }

  private String formatExceptionMessage(String operationId, int statusCode, String body) {
    if (body == null || body.isEmpty()) {
      body = "[no body]";
    }
    return operationId + " call failed with: " + statusCode + " - " + body;
  }

  /**
   * Get Attachment
   * Exchange an Attachment Access Key (from &#x60;IdentityData.AttachmentAccessKeys&#x60;) for the raw contents of the attachment.              Use this API to fetch document (front, back, portrait) or other (selfie) images from a verification, if relevant.              In some cases, attachments may not be immediately available after a verification is completed. If so, this endpoint will return an HTTP 503 code, and you should try again later.
   * @param getAttachmentRequest  (optional)
   * @return GetAttachmentResponse
   * @throws ApiException if fails to make API call
   */
  public GetAttachmentResponse getAttachment(@javax.annotation.Nullable GetAttachmentRequest getAttachmentRequest) throws ApiException {
    ApiResponse<GetAttachmentResponse> localVarResponse = getAttachmentWithHttpInfo(getAttachmentRequest);
    return localVarResponse.getData();
  }

  /**
   * Get Attachment
   * Exchange an Attachment Access Key (from &#x60;IdentityData.AttachmentAccessKeys&#x60;) for the raw contents of the attachment.              Use this API to fetch document (front, back, portrait) or other (selfie) images from a verification, if relevant.              In some cases, attachments may not be immediately available after a verification is completed. If so, this endpoint will return an HTTP 503 code, and you should try again later.
   * @param getAttachmentRequest  (optional)
   * @return ApiResponse&lt;GetAttachmentResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetAttachmentResponse> getAttachmentWithHttpInfo(@javax.annotation.Nullable GetAttachmentRequest getAttachmentRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getAttachmentRequestBuilder(getAttachmentRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getAttachment", localVarResponse);
        }
        if (localVarResponse.body() == null) {
          return new ApiResponse<GetAttachmentResponse>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        String responseBody = new String(localVarResponse.body().readAllBytes());
        localVarResponse.body().close();

        return new ApiResponse<GetAttachmentResponse>(
            localVarResponse.statusCode(),
            localVarResponse.headers().map(),
            responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetAttachmentResponse>() {})
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder getAttachmentRequestBuilder(@javax.annotation.Nullable GetAttachmentRequest getAttachmentRequest) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/api/v1/attachments/attachment";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "text/plain, application/json, text/json, application/problem+json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(getAttachmentRequest);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

}
