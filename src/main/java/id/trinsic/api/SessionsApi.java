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

import id.trinsic.api.models.CancelSessionResponse;
import id.trinsic.api.models.CreateAdvancedProviderSessionRequest;
import id.trinsic.api.models.CreateAdvancedProviderSessionResponse;
import id.trinsic.api.models.CreateHostedProviderSessionRequest;
import id.trinsic.api.models.CreateHostedProviderSessionResponse;
import id.trinsic.api.models.CreateWidgetSessionRequest;
import id.trinsic.api.models.CreateWidgetSessionResponse;
import id.trinsic.api.models.GetSessionResponse;
import id.trinsic.api.models.GetSessionResultRequest;
import id.trinsic.api.models.GetSessionResultResponse;
import id.trinsic.api.models.ListSessionsResponse;
import id.trinsic.api.models.OrderDirection;
import id.trinsic.api.models.ProblemDetails;
import id.trinsic.api.models.RefreshStepContentRequest;
import id.trinsic.api.models.RefreshStepContentResponse;
import id.trinsic.api.models.SessionOrdering;
import java.util.UUID;

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
public class SessionsApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public SessionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SessionsApi(ApiClient apiClient) {
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
   * Cancel Session
   * Cancel a Session by its ID
   * @param sessionId  (required)
   * @return CancelSessionResponse
   * @throws ApiException if fails to make API call
   */
  public CancelSessionResponse cancelSession(@javax.annotation.Nonnull UUID sessionId) throws ApiException {
    ApiResponse<CancelSessionResponse> localVarResponse = cancelSessionWithHttpInfo(sessionId);
    return localVarResponse.getData();
  }

  /**
   * Cancel Session
   * Cancel a Session by its ID
   * @param sessionId  (required)
   * @return ApiResponse&lt;CancelSessionResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CancelSessionResponse> cancelSessionWithHttpInfo(@javax.annotation.Nonnull UUID sessionId) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = cancelSessionRequestBuilder(sessionId);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("cancelSession", localVarResponse);
        }
        if (localVarResponse.body() == null) {
          return new ApiResponse<CancelSessionResponse>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        String responseBody = new String(localVarResponse.body().readAllBytes());
        localVarResponse.body().close();

        return new ApiResponse<CancelSessionResponse>(
            localVarResponse.statusCode(),
            localVarResponse.headers().map(),
            responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<CancelSessionResponse>() {})
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

  private HttpRequest.Builder cancelSessionRequestBuilder(@javax.annotation.Nonnull UUID sessionId) throws ApiException {
    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionId' when calling cancelSession");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/api/v1/sessions/{sessionId}/cancel"
        .replace("{sessionId}", ApiClient.urlEncode(sessionId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "text/plain, application/json, text/json, application/problem+json");

    localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * Create Advanced Provider Session
   * Verify a user&#39;s identity with a specific provider, handling additional user interaction in your own UI.   Signal which kinds of user interactions your UI can handle using the &#x60;Capabilities&#x60; field.   If &#x60;FallbackToHostedUi&#x60; is &#x60;true&#x60;, Trinsic&#39;s hosted UI will automatically be invoked to handle any capabilities you do not support.
   * @param createAdvancedProviderSessionRequest  (optional)
   * @return CreateAdvancedProviderSessionResponse
   * @throws ApiException if fails to make API call
   */
  public CreateAdvancedProviderSessionResponse createAdvancedProviderSession(@javax.annotation.Nullable CreateAdvancedProviderSessionRequest createAdvancedProviderSessionRequest) throws ApiException {
    ApiResponse<CreateAdvancedProviderSessionResponse> localVarResponse = createAdvancedProviderSessionWithHttpInfo(createAdvancedProviderSessionRequest);
    return localVarResponse.getData();
  }

  /**
   * Create Advanced Provider Session
   * Verify a user&#39;s identity with a specific provider, handling additional user interaction in your own UI.   Signal which kinds of user interactions your UI can handle using the &#x60;Capabilities&#x60; field.   If &#x60;FallbackToHostedUi&#x60; is &#x60;true&#x60;, Trinsic&#39;s hosted UI will automatically be invoked to handle any capabilities you do not support.
   * @param createAdvancedProviderSessionRequest  (optional)
   * @return ApiResponse&lt;CreateAdvancedProviderSessionResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CreateAdvancedProviderSessionResponse> createAdvancedProviderSessionWithHttpInfo(@javax.annotation.Nullable CreateAdvancedProviderSessionRequest createAdvancedProviderSessionRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = createAdvancedProviderSessionRequestBuilder(createAdvancedProviderSessionRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("createAdvancedProviderSession", localVarResponse);
        }
        if (localVarResponse.body() == null) {
          return new ApiResponse<CreateAdvancedProviderSessionResponse>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        String responseBody = new String(localVarResponse.body().readAllBytes());
        localVarResponse.body().close();

        return new ApiResponse<CreateAdvancedProviderSessionResponse>(
            localVarResponse.statusCode(),
            localVarResponse.headers().map(),
            responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<CreateAdvancedProviderSessionResponse>() {})
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

  private HttpRequest.Builder createAdvancedProviderSessionRequestBuilder(@javax.annotation.Nullable CreateAdvancedProviderSessionRequest createAdvancedProviderSessionRequest) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/api/v1/sessions/provider/advanced";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "text/plain, application/json, text/json, application/problem+json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(createAdvancedProviderSessionRequest);
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

  /**
   * Create Hosted Provider Session
   * Verify a user&#39;s identity with a specific provider, using Trinsic-hosted UI for providers which require additional user interaction.
   * @param createHostedProviderSessionRequest  (optional)
   * @return CreateHostedProviderSessionResponse
   * @throws ApiException if fails to make API call
   */
  public CreateHostedProviderSessionResponse createHostedProviderSession(@javax.annotation.Nullable CreateHostedProviderSessionRequest createHostedProviderSessionRequest) throws ApiException {
    ApiResponse<CreateHostedProviderSessionResponse> localVarResponse = createHostedProviderSessionWithHttpInfo(createHostedProviderSessionRequest);
    return localVarResponse.getData();
  }

  /**
   * Create Hosted Provider Session
   * Verify a user&#39;s identity with a specific provider, using Trinsic-hosted UI for providers which require additional user interaction.
   * @param createHostedProviderSessionRequest  (optional)
   * @return ApiResponse&lt;CreateHostedProviderSessionResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CreateHostedProviderSessionResponse> createHostedProviderSessionWithHttpInfo(@javax.annotation.Nullable CreateHostedProviderSessionRequest createHostedProviderSessionRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = createHostedProviderSessionRequestBuilder(createHostedProviderSessionRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("createHostedProviderSession", localVarResponse);
        }
        if (localVarResponse.body() == null) {
          return new ApiResponse<CreateHostedProviderSessionResponse>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        String responseBody = new String(localVarResponse.body().readAllBytes());
        localVarResponse.body().close();

        return new ApiResponse<CreateHostedProviderSessionResponse>(
            localVarResponse.statusCode(),
            localVarResponse.headers().map(),
            responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<CreateHostedProviderSessionResponse>() {})
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

  private HttpRequest.Builder createHostedProviderSessionRequestBuilder(@javax.annotation.Nullable CreateHostedProviderSessionRequest createHostedProviderSessionRequest) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/api/v1/sessions/provider/hosted";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "text/plain, application/json, text/json, application/problem+json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(createHostedProviderSessionRequest);
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

  /**
   * Create Widget Session
   * Verify a user&#39;s identity using Trinsic&#39;s hosted Widget flow.
   * @param createWidgetSessionRequest  (optional)
   * @return CreateWidgetSessionResponse
   * @throws ApiException if fails to make API call
   */
  public CreateWidgetSessionResponse createWidgetSession(@javax.annotation.Nullable CreateWidgetSessionRequest createWidgetSessionRequest) throws ApiException {
    ApiResponse<CreateWidgetSessionResponse> localVarResponse = createWidgetSessionWithHttpInfo(createWidgetSessionRequest);
    return localVarResponse.getData();
  }

  /**
   * Create Widget Session
   * Verify a user&#39;s identity using Trinsic&#39;s hosted Widget flow.
   * @param createWidgetSessionRequest  (optional)
   * @return ApiResponse&lt;CreateWidgetSessionResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CreateWidgetSessionResponse> createWidgetSessionWithHttpInfo(@javax.annotation.Nullable CreateWidgetSessionRequest createWidgetSessionRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = createWidgetSessionRequestBuilder(createWidgetSessionRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("createWidgetSession", localVarResponse);
        }
        if (localVarResponse.body() == null) {
          return new ApiResponse<CreateWidgetSessionResponse>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        String responseBody = new String(localVarResponse.body().readAllBytes());
        localVarResponse.body().close();

        return new ApiResponse<CreateWidgetSessionResponse>(
            localVarResponse.statusCode(),
            localVarResponse.headers().map(),
            responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<CreateWidgetSessionResponse>() {})
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

  private HttpRequest.Builder createWidgetSessionRequestBuilder(@javax.annotation.Nullable CreateWidgetSessionRequest createWidgetSessionRequest) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/api/v1/sessions/widget";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "text/plain, application/json, text/json, application/problem+json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(createWidgetSessionRequest);
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

  /**
   * Get Session
   * Get a Session by its ID
   * @param sessionId  (required)
   * @return GetSessionResponse
   * @throws ApiException if fails to make API call
   */
  public GetSessionResponse getSession(@javax.annotation.Nonnull String sessionId) throws ApiException {
    ApiResponse<GetSessionResponse> localVarResponse = getSessionWithHttpInfo(sessionId);
    return localVarResponse.getData();
  }

  /**
   * Get Session
   * Get a Session by its ID
   * @param sessionId  (required)
   * @return ApiResponse&lt;GetSessionResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetSessionResponse> getSessionWithHttpInfo(@javax.annotation.Nonnull String sessionId) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getSessionRequestBuilder(sessionId);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getSession", localVarResponse);
        }
        if (localVarResponse.body() == null) {
          return new ApiResponse<GetSessionResponse>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        String responseBody = new String(localVarResponse.body().readAllBytes());
        localVarResponse.body().close();

        return new ApiResponse<GetSessionResponse>(
            localVarResponse.statusCode(),
            localVarResponse.headers().map(),
            responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetSessionResponse>() {})
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

  private HttpRequest.Builder getSessionRequestBuilder(@javax.annotation.Nonnull String sessionId) throws ApiException {
    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionId' when calling getSession");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/api/v1/sessions/{sessionId}"
        .replace("{sessionId}", ApiClient.urlEncode(sessionId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "text/plain, application/json, text/json, application/problem+json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * Get Session Results
   * 
   * @param sessionId  (required)
   * @param getSessionResultRequest  (optional)
   * @return GetSessionResultResponse
   * @throws ApiException if fails to make API call
   */
  public GetSessionResultResponse getSessionResult(@javax.annotation.Nonnull String sessionId, @javax.annotation.Nullable GetSessionResultRequest getSessionResultRequest) throws ApiException {
    ApiResponse<GetSessionResultResponse> localVarResponse = getSessionResultWithHttpInfo(sessionId, getSessionResultRequest);
    return localVarResponse.getData();
  }

  /**
   * Get Session Results
   * 
   * @param sessionId  (required)
   * @param getSessionResultRequest  (optional)
   * @return ApiResponse&lt;GetSessionResultResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<GetSessionResultResponse> getSessionResultWithHttpInfo(@javax.annotation.Nonnull String sessionId, @javax.annotation.Nullable GetSessionResultRequest getSessionResultRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getSessionResultRequestBuilder(sessionId, getSessionResultRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getSessionResult", localVarResponse);
        }
        if (localVarResponse.body() == null) {
          return new ApiResponse<GetSessionResultResponse>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        String responseBody = new String(localVarResponse.body().readAllBytes());
        localVarResponse.body().close();

        return new ApiResponse<GetSessionResultResponse>(
            localVarResponse.statusCode(),
            localVarResponse.headers().map(),
            responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<GetSessionResultResponse>() {})
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

  private HttpRequest.Builder getSessionResultRequestBuilder(@javax.annotation.Nonnull String sessionId, @javax.annotation.Nullable GetSessionResultRequest getSessionResultRequest) throws ApiException {
    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionId' when calling getSessionResult");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/api/v1/sessions/{sessionId}/results"
        .replace("{sessionId}", ApiClient.urlEncode(sessionId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "text/plain, application/json, text/json, application/problem+json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(getSessionResultRequest);
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

  /**
   * List Sessions
   * List Sessions created by your account
   * @param orderBy The field by which sessions should be ordered (optional)
   * @param orderDirection  (optional)
   * @param pageSize The number of items to return per page -- must be between &#x60;1&#x60; and &#x60;50&#x60; (optional)
   * @param page The page number to return -- starts at &#x60;1&#x60; (optional)
   * @return ListSessionsResponse
   * @throws ApiException if fails to make API call
   */
  public ListSessionsResponse listSessions(@javax.annotation.Nullable SessionOrdering orderBy, @javax.annotation.Nullable OrderDirection orderDirection, @javax.annotation.Nullable Integer pageSize, @javax.annotation.Nullable Integer page) throws ApiException {
    ApiResponse<ListSessionsResponse> localVarResponse = listSessionsWithHttpInfo(orderBy, orderDirection, pageSize, page);
    return localVarResponse.getData();
  }

  /**
   * List Sessions
   * List Sessions created by your account
   * @param orderBy The field by which sessions should be ordered (optional)
   * @param orderDirection  (optional)
   * @param pageSize The number of items to return per page -- must be between &#x60;1&#x60; and &#x60;50&#x60; (optional)
   * @param page The page number to return -- starts at &#x60;1&#x60; (optional)
   * @return ApiResponse&lt;ListSessionsResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ListSessionsResponse> listSessionsWithHttpInfo(@javax.annotation.Nullable SessionOrdering orderBy, @javax.annotation.Nullable OrderDirection orderDirection, @javax.annotation.Nullable Integer pageSize, @javax.annotation.Nullable Integer page) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = listSessionsRequestBuilder(orderBy, orderDirection, pageSize, page);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("listSessions", localVarResponse);
        }
        if (localVarResponse.body() == null) {
          return new ApiResponse<ListSessionsResponse>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        String responseBody = new String(localVarResponse.body().readAllBytes());
        localVarResponse.body().close();

        return new ApiResponse<ListSessionsResponse>(
            localVarResponse.statusCode(),
            localVarResponse.headers().map(),
            responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<ListSessionsResponse>() {})
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

  private HttpRequest.Builder listSessionsRequestBuilder(@javax.annotation.Nullable SessionOrdering orderBy, @javax.annotation.Nullable OrderDirection orderDirection, @javax.annotation.Nullable Integer pageSize, @javax.annotation.Nullable Integer page) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/api/v1/sessions/list";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "OrderBy";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("OrderBy", orderBy));
    localVarQueryParameterBaseName = "OrderDirection";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("OrderDirection", orderDirection));
    localVarQueryParameterBaseName = "PageSize";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("PageSize", pageSize));
    localVarQueryParameterBaseName = "Page";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("Page", page));

    if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      if (localVarQueryStringJoiner.length() != 0) {
        queryJoiner.add(localVarQueryStringJoiner.toString());
      }
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "text/plain, application/json, text/json, application/problem+json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * Redact Session
   * Redact a Session, removing all identity data from Trinsic&#39;s servers. Every application has a redaction period that dictates how long we will hold on to your users&#39; PII data. Once a session falls outside the redaction cutoff date, all PII will automatically be removed from that session. You can utilize this endpoint to redact a session immediately.
   * @param sessionId  (required)
   * @throws ApiException if fails to make API call
   */
  public void redactSession(@javax.annotation.Nonnull UUID sessionId) throws ApiException {
    redactSessionWithHttpInfo(sessionId);
  }

  /**
   * Redact Session
   * Redact a Session, removing all identity data from Trinsic&#39;s servers. Every application has a redaction period that dictates how long we will hold on to your users&#39; PII data. Once a session falls outside the redaction cutoff date, all PII will automatically be removed from that session. You can utilize this endpoint to redact a session immediately.
   * @param sessionId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> redactSessionWithHttpInfo(@javax.annotation.Nonnull UUID sessionId) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = redactSessionRequestBuilder(sessionId);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("redactSession", localVarResponse);
        }
        return new ApiResponse<>(
            localVarResponse.statusCode(),
            localVarResponse.headers().map(),
            null
        );
      } finally {
        // Drain the InputStream
        while (localVarResponse.body().read() != -1) {
          // Ignore
        }
        localVarResponse.body().close();
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder redactSessionRequestBuilder(@javax.annotation.Nonnull UUID sessionId) throws ApiException {
    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionId' when calling redactSession");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/api/v1/sessions/{sessionId}/redact"
        .replace("{sessionId}", ApiClient.urlEncode(sessionId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/problem+json");

    localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * Refresh Step Content
   * Refreshes the content of a Step for an Advanced Provider Session.
   * @param acceptanceSessionId  (required)
   * @param refreshStepContentRequest  (optional)
   * @return RefreshStepContentResponse
   * @throws ApiException if fails to make API call
   */
  public RefreshStepContentResponse refreshStepContent(@javax.annotation.Nonnull UUID acceptanceSessionId, @javax.annotation.Nullable RefreshStepContentRequest refreshStepContentRequest) throws ApiException {
    ApiResponse<RefreshStepContentResponse> localVarResponse = refreshStepContentWithHttpInfo(acceptanceSessionId, refreshStepContentRequest);
    return localVarResponse.getData();
  }

  /**
   * Refresh Step Content
   * Refreshes the content of a Step for an Advanced Provider Session.
   * @param acceptanceSessionId  (required)
   * @param refreshStepContentRequest  (optional)
   * @return ApiResponse&lt;RefreshStepContentResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RefreshStepContentResponse> refreshStepContentWithHttpInfo(@javax.annotation.Nonnull UUID acceptanceSessionId, @javax.annotation.Nullable RefreshStepContentRequest refreshStepContentRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = refreshStepContentRequestBuilder(acceptanceSessionId, refreshStepContentRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("refreshStepContent", localVarResponse);
        }
        if (localVarResponse.body() == null) {
          return new ApiResponse<RefreshStepContentResponse>(
              localVarResponse.statusCode(),
              localVarResponse.headers().map(),
              null
          );
        }

        String responseBody = new String(localVarResponse.body().readAllBytes());
        localVarResponse.body().close();

        return new ApiResponse<RefreshStepContentResponse>(
            localVarResponse.statusCode(),
            localVarResponse.headers().map(),
            responseBody.isBlank()? null: memberVarObjectMapper.readValue(responseBody, new TypeReference<RefreshStepContentResponse>() {})
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

  private HttpRequest.Builder refreshStepContentRequestBuilder(@javax.annotation.Nonnull UUID acceptanceSessionId, @javax.annotation.Nullable RefreshStepContentRequest refreshStepContentRequest) throws ApiException {
    // verify the required parameter 'acceptanceSessionId' is set
    if (acceptanceSessionId == null) {
      throw new ApiException(400, "Missing the required parameter 'acceptanceSessionId' when calling refreshStepContent");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/api/v1/sessions/{acceptanceSessionId}/step/refresh"
        .replace("{acceptanceSessionId}", ApiClient.urlEncode(acceptanceSessionId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "text/plain, application/json, text/json, application/problem+json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(refreshStepContentRequest);
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
