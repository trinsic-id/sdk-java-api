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

package id.trinsic.api;

import id.trinsic.ApiClient;
import id.trinsic.ApiException;
import id.trinsic.ApiResponse;
import id.trinsic.Pair;

import id.trinsic.api.models.CancelSessionResponse;
import id.trinsic.api.models.CreateSessionRequest;
import id.trinsic.api.models.CreateSessionResponse;
import id.trinsic.api.models.FailureMessage;
import id.trinsic.api.models.GetSessionResponse;
import id.trinsic.api.models.GetSessionResultRequest;
import id.trinsic.api.models.GetSessionResultResponse;
import id.trinsic.api.models.ListSessionsResponse;
import id.trinsic.api.models.OrderDirection;
import id.trinsic.api.models.SessionOrdering;
import id.trinsic.api.models.ValidationResult;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-04T00:30:10.165450Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class SessionsApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public SessionsApi() {
    this(new ApiClient());
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
  public CancelSessionResponse cancelSession(String sessionId) throws ApiException {
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
  public ApiResponse<CancelSessionResponse> cancelSessionWithHttpInfo(String sessionId) throws ApiException {
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
        return new ApiResponse<CancelSessionResponse>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<CancelSessionResponse>() {}) // closes the InputStream
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

  private HttpRequest.Builder cancelSessionRequestBuilder(String sessionId) throws ApiException {
    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionId' when calling cancelSession");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/api/v1/sessions/{sessionId}/cancel"
        .replace("{sessionId}", ApiClient.urlEncode(sessionId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "text/plain, application/json, text/json");

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
   * Create Session
   * Create a Session to verify a user&#39;s identity
   * @param createSessionRequest  (optional)
   * @return CreateSessionResponse
   * @throws ApiException if fails to make API call
   */
  public CreateSessionResponse createSession(CreateSessionRequest createSessionRequest) throws ApiException {
    ApiResponse<CreateSessionResponse> localVarResponse = createSessionWithHttpInfo(createSessionRequest);
    return localVarResponse.getData();
  }

  /**
   * Create Session
   * Create a Session to verify a user&#39;s identity
   * @param createSessionRequest  (optional)
   * @return ApiResponse&lt;CreateSessionResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<CreateSessionResponse> createSessionWithHttpInfo(CreateSessionRequest createSessionRequest) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = createSessionRequestBuilder(createSessionRequest);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("createSession", localVarResponse);
        }
        return new ApiResponse<CreateSessionResponse>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<CreateSessionResponse>() {}) // closes the InputStream
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

  private HttpRequest.Builder createSessionRequestBuilder(CreateSessionRequest createSessionRequest) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/api/v1/sessions";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "text/plain, application/json, text/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(createSessionRequest);
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
  public GetSessionResponse getSession(String sessionId) throws ApiException {
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
  public ApiResponse<GetSessionResponse> getSessionWithHttpInfo(String sessionId) throws ApiException {
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
        return new ApiResponse<GetSessionResponse>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<GetSessionResponse>() {}) // closes the InputStream
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

  private HttpRequest.Builder getSessionRequestBuilder(String sessionId) throws ApiException {
    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionId' when calling getSession");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/api/v1/sessions/{sessionId}"
        .replace("{sessionId}", ApiClient.urlEncode(sessionId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "text/plain, application/json, text/json");

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
  public GetSessionResultResponse getSessionResult(String sessionId, GetSessionResultRequest getSessionResultRequest) throws ApiException {
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
  public ApiResponse<GetSessionResultResponse> getSessionResultWithHttpInfo(String sessionId, GetSessionResultRequest getSessionResultRequest) throws ApiException {
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
        return new ApiResponse<GetSessionResultResponse>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<GetSessionResultResponse>() {}) // closes the InputStream
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

  private HttpRequest.Builder getSessionResultRequestBuilder(String sessionId, GetSessionResultRequest getSessionResultRequest) throws ApiException {
    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionId' when calling getSessionResult");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/api/v1/sessions/{sessionId}/results"
        .replace("{sessionId}", ApiClient.urlEncode(sessionId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "text/plain, application/json, text/json");

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
  public ListSessionsResponse listSessions(SessionOrdering orderBy, OrderDirection orderDirection, Integer pageSize, Integer page) throws ApiException {
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
  public ApiResponse<ListSessionsResponse> listSessionsWithHttpInfo(SessionOrdering orderBy, OrderDirection orderDirection, Integer pageSize, Integer page) throws ApiException {
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
        return new ApiResponse<ListSessionsResponse>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<ListSessionsResponse>() {}) // closes the InputStream
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

  private HttpRequest.Builder listSessionsRequestBuilder(SessionOrdering orderBy, OrderDirection orderDirection, Integer pageSize, Integer page) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/api/v1/sessions";

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

    localVarRequestBuilder.header("Accept", "text/plain, application/json, text/json");

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
   * Redact a Session, removing all identity data from Trinsic&#39;s servers.                Identity data that a user has chosen to save in their passkey-protected wallet will not be deleted.
   * @param sessionId  (required)
   * @throws ApiException if fails to make API call
   */
  public void redactSession(String sessionId) throws ApiException {
    redactSessionWithHttpInfo(sessionId);
  }

  /**
   * Redact Session
   * Redact a Session, removing all identity data from Trinsic&#39;s servers.                Identity data that a user has chosen to save in their passkey-protected wallet will not be deleted.
   * @param sessionId  (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> redactSessionWithHttpInfo(String sessionId) throws ApiException {
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
        return new ApiResponse<Void>(
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

  private HttpRequest.Builder redactSessionRequestBuilder(String sessionId) throws ApiException {
    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionId' when calling redactSession");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/api/v1/sessions/{sessionId}/redact"
        .replace("{sessionId}", ApiClient.urlEncode(sessionId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

}
