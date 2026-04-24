# Angellist Nova Java API Library

[![Maven Central](https://img.shields.io/maven-central/v/io.github.ctotheameron/angellist-nova-java)](https://central.sonatype.com/artifact/io.github.ctotheameron/angellist-nova-java/0.0.1)
[![javadoc](https://javadoc.io/badge2/io.github.ctotheameron/angellist-nova-java/0.0.1/javadoc.svg)](https://javadoc.io/doc/io.github.ctotheameron/angellist-nova-java/0.0.1)

The Angellist Nova Java SDK provides convenient access to the [Angellist Nova REST API](https://docs.angellist.com/nova-api) from applications written in Java.

It is generated with [Stainless](https://www.stainless.com/).

## MCP Server

Use the Angellist Nova MCP Server to enable AI assistants to interact with this API, allowing them to explore endpoints, make test requests, and use documentation to help integrate this SDK into your application.

[![Add to Cursor](https://cursor.com/deeplink/mcp-install-dark.svg)](https://cursor.com/en-US/install-mcp?name=%40angellist%2Fnova-mcp&config=eyJjb21tYW5kIjoibnB4IiwiYXJncyI6WyIteSIsIkBhbmdlbGxpc3Qvbm92YS1tY3AiXSwiZW52Ijp7IkFOR0VMTElTVF9DTElFTlRfSUQiOiJNeSBDbGllbnQgSUQiLCJBTkdFTExJU1RfQ0xJRU5UX1NFQ1JFVCI6Ik15IENsaWVudCBTZWNyZXQiLCJBTkdFTExJU1RfT1JHQU5JWkFUSU9OX0lEIjoiTXkgT3JnYW5pemF0aW9uIElEIn19)
[![Install in VS Code](https://img.shields.io/badge/_-Add_to_VS_Code-blue?style=for-the-badge&logo=data:image/svg%2bxml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIGZpbGw9Im5vbmUiIHZpZXdCb3g9IjAgMCA0MCA0MCI+PHBhdGggZmlsbD0iI0VFRSIgZmlsbC1ydWxlPSJldmVub2RkIiBkPSJNMzAuMjM1IDM5Ljg4NGEyLjQ5MSAyLjQ5MSAwIDAgMS0xLjc4MS0uNzNMMTIuNyAyNC43OGwtMy40NiAyLjYyNC0zLjQwNiAyLjU4MmExLjY2NSAxLjY2NSAwIDAgMS0xLjA4Mi4zMzggMS42NjQgMS42NjQgMCAwIDEtMS4wNDYtLjQzMWwtMi4yLTJhMS42NjYgMS42NjYgMCAwIDEgMC0yLjQ2M0w3LjQ1OCAyMCA0LjY3IDE3LjQ1MyAxLjUwNyAxNC41N2ExLjY2NSAxLjY2NSAwIDAgMSAwLTIuNDYzbDIuMi0yYTEuNjY1IDEuNjY1IDAgMCAxIDIuMTMtLjA5N2w2Ljg2MyA1LjIwOUwyOC40NTIuODQ0YTIuNDg4IDIuNDg4IDAgMCAxIDEuODQxLS43MjljLjM1MS4wMDkuNjk5LjA5MSAxLjAxOS4yNDVsOC4yMzYgMy45NjFhMi41IDIuNSAwIDAgMSAxLjQxNSAyLjI1M3YuMDk5LS4wNDVWMzMuMzd2LS4wNDUuMDk1YTIuNTAxIDIuNTAxIDAgMCAxLTEuNDE2IDIuMjU3bC04LjIzNSAzLjk2MWEyLjQ5MiAyLjQ5MiAwIDAgMS0xLjA3Ny4yNDZabS43MTYtMjguOTQ3LTExLjk0OCA5LjA2MiAxMS45NTIgOS4wNjUtLjAwNC0xOC4xMjdaIi8+PC9zdmc+)](https://vscode.stainless.com/mcp/%7B%22name%22%3A%22%40angellist%2Fnova-mcp%22%2C%22command%22%3A%22npx%22%2C%22args%22%3A%5B%22-y%22%2C%22%40angellist%2Fnova-mcp%22%5D%2C%22env%22%3A%7B%22ANGELLIST_CLIENT_ID%22%3A%22My%20Client%20ID%22%2C%22ANGELLIST_CLIENT_SECRET%22%3A%22My%20Client%20Secret%22%2C%22ANGELLIST_ORGANIZATION_ID%22%3A%22My%20Organization%20ID%22%7D%7D)

> Note: You may need to set environment variables in your MCP client.

The REST API documentation can be found on [docs.angellist.com](https://docs.angellist.com/nova-api). Javadocs are available on [javadoc.io](https://javadoc.io/doc/io.github.ctotheameron/angellist-nova-java/0.0.1).

## Installation

### Gradle

```kotlin
implementation("io.github.ctotheameron:angellist-nova-java:0.0.1")
```

### Maven

```xml
<dependency>
  <groupId>io.github.ctotheameron</groupId>
  <artifactId>angellist-nova-java</artifactId>
  <version>0.0.1</version>
</dependency>
```

## Requirements

This library requires Java 8 or later.

## Usage

```java
import io.github.ctotheameron.client.AngellistNovaClient;
import io.github.ctotheameron.client.okhttp.AngellistNovaOkHttpClient;
import io.github.ctotheameron.models.distributions.Currency;
import io.github.ctotheameron.models.distributions.Distribution;
import io.github.ctotheameron.models.distributions.DistributionCreateParams;
import io.github.ctotheameron.models.entities.EntityType;
import java.time.OffsetDateTime;

// Configures using the `angellistnova.angellistClientId`, `angellistnova.angellistClientSecret`, `angellistnova.angellistOrganizationId` and `angellistnova.baseUrl` system properties
// Or configures using the `ANGELLIST_CLIENT_ID`, `ANGELLIST_CLIENT_SECRET`, `ANGELLIST_ORGANIZATION_ID` and `ANGELLIST_NOVA_BASE_URL` environment variables
AngellistNovaClient client = AngellistNovaOkHttpClient.fromEnv();

DistributionCreateParams params = DistributionCreateParams.builder()
    .distributionDate(OffsetDateTime.parse("2026-07-01T00:00:00Z"))
    .name("Q4 2026 Distribution")
    .addPayment(DistributionCreateParams.Payment.builder()
        .amount(5000000L)
        .currency(Currency.USD)
        .entity(DistributionCreateParams.Payment.Entity.NewEntityInput.builder()
            .name("Acme Ventures LP")
            .type(EntityType.LLC)
            .build())
        .addContact(DistributionCreateParams.Payment.Contact.builder()
            .notify(true)
            .person(DistributionCreateParams.Payment.Contact.Person.NewPersonInput.builder()
                .name("Jane Doe")
                .email("jane@acmeventures.com")
                .build())
            .build())
        .build())
    .vehicleId("550e8400-e29b-41d4-a716-446655440000")
    .build();
Distribution distribution = client.distributions().create(params);
```

## Client configuration

Configure the client using system properties or environment variables:

```java
import io.github.ctotheameron.client.AngellistNovaClient;
import io.github.ctotheameron.client.okhttp.AngellistNovaOkHttpClient;

// Configures using the `angellistnova.angellistClientId`, `angellistnova.angellistClientSecret`, `angellistnova.angellistOrganizationId` and `angellistnova.baseUrl` system properties
// Or configures using the `ANGELLIST_CLIENT_ID`, `ANGELLIST_CLIENT_SECRET`, `ANGELLIST_ORGANIZATION_ID` and `ANGELLIST_NOVA_BASE_URL` environment variables
AngellistNovaClient client = AngellistNovaOkHttpClient.fromEnv();
```

Or manually:

```java
import io.github.ctotheameron.client.AngellistNovaClient;
import io.github.ctotheameron.client.okhttp.AngellistNovaOkHttpClient;

AngellistNovaClient client = AngellistNovaOkHttpClient.builder()
    .clientId("My Client ID")
    .clientSecret("My Client Secret")
    .build();
```

Or using a combination of the two approaches:

```java
import io.github.ctotheameron.client.AngellistNovaClient;
import io.github.ctotheameron.client.okhttp.AngellistNovaOkHttpClient;

AngellistNovaClient client = AngellistNovaOkHttpClient.builder()
    // Configures using the `angellistnova.angellistClientId`, `angellistnova.angellistClientSecret`, `angellistnova.angellistOrganizationId` and `angellistnova.baseUrl` system properties
    // Or configures using the `ANGELLIST_CLIENT_ID`, `ANGELLIST_CLIENT_SECRET`, `ANGELLIST_ORGANIZATION_ID` and `ANGELLIST_NOVA_BASE_URL` environment variables
    .fromEnv()
    .clientId("My Client ID")
    .build();
```

See this table for the available options:

| Setter           | System property                         | Environment variable        | Required | Default value                           |
| ---------------- | --------------------------------------- | --------------------------- | -------- | --------------------------------------- |
| `clientId`       | `angellistnova.angellistClientId`       | `ANGELLIST_CLIENT_ID`       | false    | -                                       |
| `clientSecret`   | `angellistnova.angellistClientSecret`   | `ANGELLIST_CLIENT_SECRET`   | false    | -                                       |
| `organizationId` | `angellistnova.angellistOrganizationId` | `ANGELLIST_ORGANIZATION_ID` | false    | -                                       |
| `baseUrl`        | `angellistnova.baseUrl`                 | `ANGELLIST_NOVA_BASE_URL`   | true     | `"https://portal.angellist.com/api/v1"` |

System properties take precedence over environment variables.

> [!TIP]
> Don't create more than one client in the same application. Each client has a connection pool and
> thread pools, which are more efficient to share between requests.

### Modifying configuration

To temporarily use a modified client configuration, while reusing the same connection and thread pools, call `withOptions()` on any client or service:

```java
import io.github.ctotheameron.client.AngellistNovaClient;

AngellistNovaClient clientWithOptions = client.withOptions(optionsBuilder -> {
    optionsBuilder.baseUrl("https://example.com");
    optionsBuilder.maxRetries(42);
});
```

The `withOptions()` method does not affect the original client or service.

## Requests and responses

To send a request to the Angellist Nova API, build an instance of some `Params` class and pass it to the corresponding client method. When the response is received, it will be deserialized into an instance of a Java class.

For example, `client.distributions().create(...)` should be called with an instance of `DistributionCreateParams`, and it will return an instance of `Distribution`.

## Immutability

Each class in the SDK has an associated [builder](https://blogs.oracle.com/javamagazine/post/exploring-joshua-blochs-builder-design-pattern-in-java) or factory method for constructing it.

Each class is [immutable](https://docs.oracle.com/javase/tutorial/essential/concurrency/immutable.html) once constructed. If the class has an associated builder, then it has a `toBuilder()` method, which can be used to convert it back to a builder for making a modified copy.

Because each class is immutable, builder modification will _never_ affect already built class instances.

## Asynchronous execution

The default client is synchronous. To switch to asynchronous execution, call the `async()` method:

```java
import io.github.ctotheameron.client.AngellistNovaClient;
import io.github.ctotheameron.client.okhttp.AngellistNovaOkHttpClient;
import io.github.ctotheameron.models.distributions.Currency;
import io.github.ctotheameron.models.distributions.Distribution;
import io.github.ctotheameron.models.distributions.DistributionCreateParams;
import io.github.ctotheameron.models.entities.EntityType;
import java.time.OffsetDateTime;
import java.util.concurrent.CompletableFuture;

// Configures using the `angellistnova.angellistClientId`, `angellistnova.angellistClientSecret`, `angellistnova.angellistOrganizationId` and `angellistnova.baseUrl` system properties
// Or configures using the `ANGELLIST_CLIENT_ID`, `ANGELLIST_CLIENT_SECRET`, `ANGELLIST_ORGANIZATION_ID` and `ANGELLIST_NOVA_BASE_URL` environment variables
AngellistNovaClient client = AngellistNovaOkHttpClient.fromEnv();

DistributionCreateParams params = DistributionCreateParams.builder()
    .distributionDate(OffsetDateTime.parse("2026-07-01T00:00:00Z"))
    .name("Q4 2026 Distribution")
    .addPayment(DistributionCreateParams.Payment.builder()
        .amount(5000000L)
        .currency(Currency.USD)
        .entity(DistributionCreateParams.Payment.Entity.NewEntityInput.builder()
            .name("Acme Ventures LP")
            .type(EntityType.LLC)
            .build())
        .addContact(DistributionCreateParams.Payment.Contact.builder()
            .notify(true)
            .person(DistributionCreateParams.Payment.Contact.Person.NewPersonInput.builder()
                .name("Jane Doe")
                .email("jane@acmeventures.com")
                .build())
            .build())
        .build())
    .vehicleId("550e8400-e29b-41d4-a716-446655440000")
    .build();
CompletableFuture<Distribution> distribution = client.async().distributions().create(params);
```

Or create an asynchronous client from the beginning:

```java
import io.github.ctotheameron.client.AngellistNovaClientAsync;
import io.github.ctotheameron.client.okhttp.AngellistNovaOkHttpClientAsync;
import io.github.ctotheameron.models.distributions.Currency;
import io.github.ctotheameron.models.distributions.Distribution;
import io.github.ctotheameron.models.distributions.DistributionCreateParams;
import io.github.ctotheameron.models.entities.EntityType;
import java.time.OffsetDateTime;
import java.util.concurrent.CompletableFuture;

// Configures using the `angellistnova.angellistClientId`, `angellistnova.angellistClientSecret`, `angellistnova.angellistOrganizationId` and `angellistnova.baseUrl` system properties
// Or configures using the `ANGELLIST_CLIENT_ID`, `ANGELLIST_CLIENT_SECRET`, `ANGELLIST_ORGANIZATION_ID` and `ANGELLIST_NOVA_BASE_URL` environment variables
AngellistNovaClientAsync client = AngellistNovaOkHttpClientAsync.fromEnv();

DistributionCreateParams params = DistributionCreateParams.builder()
    .distributionDate(OffsetDateTime.parse("2026-07-01T00:00:00Z"))
    .name("Q4 2026 Distribution")
    .addPayment(DistributionCreateParams.Payment.builder()
        .amount(5000000L)
        .currency(Currency.USD)
        .entity(DistributionCreateParams.Payment.Entity.NewEntityInput.builder()
            .name("Acme Ventures LP")
            .type(EntityType.LLC)
            .build())
        .addContact(DistributionCreateParams.Payment.Contact.builder()
            .notify(true)
            .person(DistributionCreateParams.Payment.Contact.Person.NewPersonInput.builder()
                .name("Jane Doe")
                .email("jane@acmeventures.com")
                .build())
            .build())
        .build())
    .vehicleId("550e8400-e29b-41d4-a716-446655440000")
    .build();
CompletableFuture<Distribution> distribution = client.distributions().create(params);
```

The asynchronous client supports the same options as the synchronous one, except most methods return `CompletableFuture`s.

## Raw responses

The SDK defines methods that deserialize responses into instances of Java classes. However, these methods don't provide access to the response headers, status code, or the raw response body.

To access this data, prefix any HTTP method call on a client or service with `withRawResponse()`:

```java
import io.github.ctotheameron.core.http.Headers;
import io.github.ctotheameron.core.http.HttpResponseFor;
import io.github.ctotheameron.models.distributions.Currency;
import io.github.ctotheameron.models.distributions.Distribution;
import io.github.ctotheameron.models.distributions.DistributionCreateParams;
import io.github.ctotheameron.models.entities.EntityType;
import io.github.ctotheameron.models.entities.InternationalWireInfo;
import io.github.ctotheameron.models.entities.WireAddress;
import java.time.OffsetDateTime;

DistributionCreateParams params = DistributionCreateParams.builder()
    .distributionDate(OffsetDateTime.parse("2026-07-01T00:00:00Z"))
    .name("Q4 2026 Distribution")
    .addPayment(DistributionCreateParams.Payment.builder()
        .amount(5000000L)
        .currency(Currency.USD)
        .entity(DistributionCreateParams.Payment.Entity.NewEntityInput.builder()
            .name("Acme Ventures LP")
            .type(EntityType.LLC)
            .addExternalReference("acme-001")
            .build())
        .addContact(DistributionCreateParams.Payment.Contact.builder()
            .notify(true)
            .person(DistributionCreateParams.Payment.Contact.Person.NewPersonInput.builder()
                .name("Jane Doe")
                .email("jane@acmeventures.com")
                .addExternalReference("acme-jane-001")
                .build())
            .build())
        .build())
    .addPayment(DistributionCreateParams.Payment.builder()
        .amount(7500000L)
        .currency(Currency.USD)
        .entity(DistributionCreateParams.Payment.Entity.NewEntityInput.builder()
            .name("Globex Capital Partners")
            .type(EntityType.PARTNERSHIP)
            .wireInfo(InternationalWireInfo.builder()
                .swiftCode("DEUTDEFFXXX")
                .beneficiaryName("Globex Capital Partners")
                .accountNumber("DE89370400440532013000")
                .bankName("Deutsche Bank AG")
                .address(WireAddress.builder()
                    .street1("Taunusanlage 12")
                    .city("Frankfurt")
                    .countryCode("DE")
                    .build())
                .build())
            .build())
        .addContact(DistributionCreateParams.Payment.Contact.builder()
            .notify(false)
            .person("7f8d9e10-1234-4abc-8def-1234567890ab")
            .build())
        .build())
    .vehicleId("550e8400-e29b-41d4-a716-446655440000")
    .build();
HttpResponseFor<Distribution> distribution = client.distributions().withRawResponse().create(params);

int statusCode = distribution.statusCode();
Headers headers = distribution.headers();
```

You can still deserialize the response into an instance of a Java class if needed:

```java
import io.github.ctotheameron.models.distributions.Distribution;

Distribution parsedDistribution = distribution.parse();
```

## Error handling

The SDK throws custom unchecked exception types:

- [`AngellistNovaServiceException`](angellist-nova-java-core/src/main/kotlin/io/github/ctotheameron/errors/AngellistNovaServiceException.kt): Base class for HTTP errors. See this table for which exception subclass is thrown for each HTTP status code:

  | Status | Exception                                                                                                                                  |
  | ------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
  | 400    | [`BadRequestException`](angellist-nova-java-core/src/main/kotlin/io/github/ctotheameron/errors/BadRequestException.kt)                     |
  | 401    | [`UnauthorizedException`](angellist-nova-java-core/src/main/kotlin/io/github/ctotheameron/errors/UnauthorizedException.kt)                 |
  | 403    | [`PermissionDeniedException`](angellist-nova-java-core/src/main/kotlin/io/github/ctotheameron/errors/PermissionDeniedException.kt)         |
  | 404    | [`NotFoundException`](angellist-nova-java-core/src/main/kotlin/io/github/ctotheameron/errors/NotFoundException.kt)                         |
  | 422    | [`UnprocessableEntityException`](angellist-nova-java-core/src/main/kotlin/io/github/ctotheameron/errors/UnprocessableEntityException.kt)   |
  | 429    | [`RateLimitException`](angellist-nova-java-core/src/main/kotlin/io/github/ctotheameron/errors/RateLimitException.kt)                       |
  | 5xx    | [`InternalServerException`](angellist-nova-java-core/src/main/kotlin/io/github/ctotheameron/errors/InternalServerException.kt)             |
  | others | [`UnexpectedStatusCodeException`](angellist-nova-java-core/src/main/kotlin/io/github/ctotheameron/errors/UnexpectedStatusCodeException.kt) |

- [`AngellistNovaIoException`](angellist-nova-java-core/src/main/kotlin/io/github/ctotheameron/errors/AngellistNovaIoException.kt): I/O networking errors.

- [`AngellistNovaRetryableException`](angellist-nova-java-core/src/main/kotlin/io/github/ctotheameron/errors/AngellistNovaRetryableException.kt): Generic error indicating a failure that could be retried by the client.

- [`AngellistNovaInvalidDataException`](angellist-nova-java-core/src/main/kotlin/io/github/ctotheameron/errors/AngellistNovaInvalidDataException.kt): Failure to interpret successfully parsed data. For example, when accessing a property that's supposed to be required, but the API unexpectedly omitted it from the response.

- [`AngellistNovaException`](angellist-nova-java-core/src/main/kotlin/io/github/ctotheameron/errors/AngellistNovaException.kt): Base class for all exceptions. Most errors will result in one of the previously mentioned ones, but completely generic errors may be thrown using the base class.

## Logging

The SDK uses the standard [OkHttp logging interceptor](https://github.com/square/okhttp/tree/master/okhttp-logging-interceptor).

Enable logging by setting the `ANGELLIST_NOVA_LOG` environment variable to `info`:

```sh
export ANGELLIST_NOVA_LOG=info
```

Or to `debug` for more verbose logging:

```sh
export ANGELLIST_NOVA_LOG=debug
```

## ProGuard and R8

Although the SDK uses reflection, it is still usable with [ProGuard](https://github.com/Guardsquare/proguard) and [R8](https://developer.android.com/topic/performance/app-optimization/enable-app-optimization) because `angellist-nova-java-core` is published with a [configuration file](angellist-nova-java-core/src/main/resources/META-INF/proguard/angellist-nova-java-core.pro) containing [keep rules](https://www.guardsquare.com/manual/configuration/usage).

ProGuard and R8 should automatically detect and use the published rules, but you can also manually copy the keep rules if necessary.

## Jackson

The SDK depends on [Jackson](https://github.com/FasterXML/jackson) for JSON serialization/deserialization. It is compatible with version 2.13.4 or higher, but depends on version 2.18.2 by default.

The SDK throws an exception if it detects an incompatible Jackson version at runtime (e.g. if the default version was overridden in your Maven or Gradle config).

If the SDK threw an exception, but you're _certain_ the version is compatible, then disable the version check using the `checkJacksonVersionCompatibility` on [`AngellistNovaOkHttpClient`](angellist-nova-java-client-okhttp/src/main/kotlin/io/github/ctotheameron/client/okhttp/AngellistNovaOkHttpClient.kt) or [`AngellistNovaOkHttpClientAsync`](angellist-nova-java-client-okhttp/src/main/kotlin/io/github/ctotheameron/client/okhttp/AngellistNovaOkHttpClientAsync.kt).

> [!CAUTION]
> We make no guarantee that the SDK works correctly when the Jackson version check is disabled.

Also note that there are bugs in older Jackson versions that can affect the SDK. We don't work around all Jackson bugs ([example](https://github.com/FasterXML/jackson-databind/issues/3240)) and expect users to upgrade Jackson for those instead.

## Network options

### Retries

The SDK automatically retries 2 times by default, with a short exponential backoff between requests.

Only the following error types are retried:

- Connection errors (for example, due to a network connectivity problem)
- 408 Request Timeout
- 409 Conflict
- 429 Rate Limit
- 5xx Internal

The API may also explicitly instruct the SDK to retry or not retry a request.

To set a custom number of retries, configure the client using the `maxRetries` method:

```java
import io.github.ctotheameron.client.AngellistNovaClient;
import io.github.ctotheameron.client.okhttp.AngellistNovaOkHttpClient;

AngellistNovaClient client = AngellistNovaOkHttpClient.builder()
    .fromEnv()
    .maxRetries(4)
    .build();
```

### Timeouts

Requests time out after 1 minute by default.

To set a custom timeout, configure the method call using the `timeout` method:

```java
import io.github.ctotheameron.models.distributions.Distribution;

Distribution distribution = client.distributions().create(
  params, RequestOptions.builder().timeout(Duration.ofSeconds(30)).build()
);
```

Or configure the default for all method calls at the client level:

```java
import io.github.ctotheameron.client.AngellistNovaClient;
import io.github.ctotheameron.client.okhttp.AngellistNovaOkHttpClient;
import java.time.Duration;

AngellistNovaClient client = AngellistNovaOkHttpClient.builder()
    .fromEnv()
    .timeout(Duration.ofSeconds(30))
    .build();
```

### Proxies

To route requests through a proxy, configure the client using the `proxy` method:

```java
import io.github.ctotheameron.client.AngellistNovaClient;
import io.github.ctotheameron.client.okhttp.AngellistNovaOkHttpClient;
import java.net.InetSocketAddress;
import java.net.Proxy;

AngellistNovaClient client = AngellistNovaOkHttpClient.builder()
    .fromEnv()
    .proxy(new Proxy(
      Proxy.Type.HTTP, new InetSocketAddress(
        "https://example.com", 8080
      )
    ))
    .build();
```

### Connection pooling

To customize the underlying OkHttp connection pool, configure the client using the `maxIdleConnections` and `keepAliveDuration` methods:

```java
import io.github.ctotheameron.client.AngellistNovaClient;
import io.github.ctotheameron.client.okhttp.AngellistNovaOkHttpClient;
import java.time.Duration;

AngellistNovaClient client = AngellistNovaOkHttpClient.builder()
    .fromEnv()
    // If `maxIdleConnections` is set, then `keepAliveDuration` must be set, and vice versa.
    .maxIdleConnections(10)
    .keepAliveDuration(Duration.ofMinutes(2))
    .build();
```

If both options are unset, OkHttp's default connection pool settings are used.

### HTTPS

> [!NOTE]
> Most applications should not call these methods, and instead use the system defaults. The defaults include
> special optimizations that can be lost if the implementations are modified.

To configure how HTTPS connections are secured, configure the client using the `sslSocketFactory`, `trustManager`, and `hostnameVerifier` methods:

```java
import io.github.ctotheameron.client.AngellistNovaClient;
import io.github.ctotheameron.client.okhttp.AngellistNovaOkHttpClient;

AngellistNovaClient client = AngellistNovaOkHttpClient.builder()
    .fromEnv()
    // If `sslSocketFactory` is set, then `trustManager` must be set, and vice versa.
    .sslSocketFactory(yourSSLSocketFactory)
    .trustManager(yourTrustManager)
    .hostnameVerifier(yourHostnameVerifier)
    .build();
```

### Environments

The SDK sends requests to the production by default. To send requests to a different environment, configure the client like so:

```java
import io.github.ctotheameron.client.AngellistNovaClient;
import io.github.ctotheameron.client.okhttp.AngellistNovaOkHttpClient;

AngellistNovaClient client = AngellistNovaOkHttpClient.builder()
    .fromEnv()
    .sandbox()
    .build();
```

### Custom HTTP client

The SDK consists of three artifacts:

- `angellist-nova-java-core`
  - Contains core SDK logic
  - Does not depend on [OkHttp](https://square.github.io/okhttp)
  - Exposes [`AngellistNovaClient`](angellist-nova-java-core/src/main/kotlin/io/github/ctotheameron/client/AngellistNovaClient.kt), [`AngellistNovaClientAsync`](angellist-nova-java-core/src/main/kotlin/io/github/ctotheameron/client/AngellistNovaClientAsync.kt), [`AngellistNovaClientImpl`](angellist-nova-java-core/src/main/kotlin/io/github/ctotheameron/client/AngellistNovaClientImpl.kt), and [`AngellistNovaClientAsyncImpl`](angellist-nova-java-core/src/main/kotlin/io/github/ctotheameron/client/AngellistNovaClientAsyncImpl.kt), all of which can work with any HTTP client
- `angellist-nova-java-client-okhttp`
  - Depends on [OkHttp](https://square.github.io/okhttp)
  - Exposes [`AngellistNovaOkHttpClient`](angellist-nova-java-client-okhttp/src/main/kotlin/io/github/ctotheameron/client/okhttp/AngellistNovaOkHttpClient.kt) and [`AngellistNovaOkHttpClientAsync`](angellist-nova-java-client-okhttp/src/main/kotlin/io/github/ctotheameron/client/okhttp/AngellistNovaOkHttpClientAsync.kt), which provide a way to construct [`AngellistNovaClientImpl`](angellist-nova-java-core/src/main/kotlin/io/github/ctotheameron/client/AngellistNovaClientImpl.kt) and [`AngellistNovaClientAsyncImpl`](angellist-nova-java-core/src/main/kotlin/io/github/ctotheameron/client/AngellistNovaClientAsyncImpl.kt), respectively, using OkHttp
- `angellist-nova-java`
  - Depends on and exposes the APIs of both `angellist-nova-java-core` and `angellist-nova-java-client-okhttp`
  - Does not have its own logic

This structure allows replacing the SDK's default HTTP client without pulling in unnecessary dependencies.

#### Customized [`OkHttpClient`](https://square.github.io/okhttp/3.x/okhttp/okhttp3/OkHttpClient.html)

> [!TIP]
> Try the available [network options](#network-options) before replacing the default client.

To use a customized `OkHttpClient`:

1. Replace your [`angellist-nova-java` dependency](#installation) with `angellist-nova-java-core`
2. Copy `angellist-nova-java-client-okhttp`'s [`OkHttpClient`](angellist-nova-java-client-okhttp/src/main/kotlin/io/github/ctotheameron/client/okhttp/OkHttpClient.kt) class into your code and customize it
3. Construct [`AngellistNovaClientImpl`](angellist-nova-java-core/src/main/kotlin/io/github/ctotheameron/client/AngellistNovaClientImpl.kt) or [`AngellistNovaClientAsyncImpl`](angellist-nova-java-core/src/main/kotlin/io/github/ctotheameron/client/AngellistNovaClientAsyncImpl.kt), similarly to [`AngellistNovaOkHttpClient`](angellist-nova-java-client-okhttp/src/main/kotlin/io/github/ctotheameron/client/okhttp/AngellistNovaOkHttpClient.kt) or [`AngellistNovaOkHttpClientAsync`](angellist-nova-java-client-okhttp/src/main/kotlin/io/github/ctotheameron/client/okhttp/AngellistNovaOkHttpClientAsync.kt), using your customized client

### Completely custom HTTP client

To use a completely custom HTTP client:

1. Replace your [`angellist-nova-java` dependency](#installation) with `angellist-nova-java-core`
2. Write a class that implements the [`HttpClient`](angellist-nova-java-core/src/main/kotlin/io/github/ctotheameron/core/http/HttpClient.kt) interface
3. Construct [`AngellistNovaClientImpl`](angellist-nova-java-core/src/main/kotlin/io/github/ctotheameron/client/AngellistNovaClientImpl.kt) or [`AngellistNovaClientAsyncImpl`](angellist-nova-java-core/src/main/kotlin/io/github/ctotheameron/client/AngellistNovaClientAsyncImpl.kt), similarly to [`AngellistNovaOkHttpClient`](angellist-nova-java-client-okhttp/src/main/kotlin/io/github/ctotheameron/client/okhttp/AngellistNovaOkHttpClient.kt) or [`AngellistNovaOkHttpClientAsync`](angellist-nova-java-client-okhttp/src/main/kotlin/io/github/ctotheameron/client/okhttp/AngellistNovaOkHttpClientAsync.kt), using your new client class

## Undocumented API functionality

The SDK is typed for convenient usage of the documented API. However, it also supports working with undocumented or not yet supported parts of the API.

### Parameters

To set undocumented parameters, call the `putAdditionalHeader`, `putAdditionalQueryParam`, or `putAdditionalBodyProperty` methods on any `Params` class:

```java
import io.github.ctotheameron.core.JsonValue;
import io.github.ctotheameron.models.distributions.DistributionCreateParams;

DistributionCreateParams params = DistributionCreateParams.builder()
    .putAdditionalHeader("Secret-Header", "42")
    .putAdditionalQueryParam("secret_query_param", "42")
    .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
    .build();
```

These can be accessed on the built object later using the `_additionalHeaders()`, `_additionalQueryParams()`, and `_additionalBodyProperties()` methods.

To set a documented parameter or property to an undocumented or not yet supported _value_, pass a [`JsonValue`](angellist-nova-java-core/src/main/kotlin/io/github/ctotheameron/core/Values.kt) object to its setter:

```java
import io.github.ctotheameron.core.JsonValue;
import io.github.ctotheameron.models.distributions.Currency;
import io.github.ctotheameron.models.distributions.DistributionCreateParams;
import io.github.ctotheameron.models.entities.EntityType;

DistributionCreateParams params = DistributionCreateParams.builder()
    .distributionDate(JsonValue.from(42))
    .name("Q4 2026 Distribution")
    .addPayment(DistributionCreateParams.Payment.builder()
        .amount(5000000L)
        .currency(Currency.USD)
        .entity(DistributionCreateParams.Payment.Entity.NewEntityInput.builder()
            .name("Acme Ventures LP")
            .type(EntityType.LLC)
            .build())
        .addContact(DistributionCreateParams.Payment.Contact.builder()
            .notify(true)
            .person(DistributionCreateParams.Payment.Contact.Person.NewPersonInput.builder()
                .name("Jane Doe")
                .email("jane@acmeventures.com")
                .build())
            .build())
        .build())
    .vehicleId("550e8400-e29b-41d4-a716-446655440000")
    .build();
```

The most straightforward way to create a [`JsonValue`](angellist-nova-java-core/src/main/kotlin/io/github/ctotheameron/core/Values.kt) is using its `from(...)` method:

```java
import io.github.ctotheameron.core.JsonValue;
import java.util.List;
import java.util.Map;

// Create primitive JSON values
JsonValue nullValue = JsonValue.from(null);
JsonValue booleanValue = JsonValue.from(true);
JsonValue numberValue = JsonValue.from(42);
JsonValue stringValue = JsonValue.from("Hello World!");

// Create a JSON array value equivalent to `["Hello", "World"]`
JsonValue arrayValue = JsonValue.from(List.of(
  "Hello", "World"
));

// Create a JSON object value equivalent to `{ "a": 1, "b": 2 }`
JsonValue objectValue = JsonValue.from(Map.of(
  "a", 1,
  "b", 2
));

// Create an arbitrarily nested JSON equivalent to:
// {
//   "a": [1, 2],
//   "b": [3, 4]
// }
JsonValue complexValue = JsonValue.from(Map.of(
  "a", List.of(
    1, 2
  ),
  "b", List.of(
    3, 4
  )
));
```

Normally a `Builder` class's `build` method will throw [`IllegalStateException`](https://docs.oracle.com/javase/8/docs/api/java/lang/IllegalStateException.html) if any required parameter or property is unset.

To forcibly omit a required parameter or property, pass [`JsonMissing`](angellist-nova-java-core/src/main/kotlin/io/github/ctotheameron/core/Values.kt):

```java
import io.github.ctotheameron.core.JsonMissing;
import io.github.ctotheameron.models.distributions.Currency;
import io.github.ctotheameron.models.distributions.DistributionCreateParams;

DistributionCreateParams params = DistributionCreateParams.builder()
    .name("April 20th Distribution from XYZ Sale")
    .addPayment(DistributionCreateParams.Payment.builder()
        .amount(1000L)
        .addContact(DistributionCreateParams.Payment.Contact.builder()
            .notify(true)
            .person("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build())
        .currency(Currency.USD)
        .entity("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        .build())
    .vehicleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    .distributionDate(JsonMissing.of())
    .build();
```

### Response properties

To access undocumented response properties, call the `_additionalProperties()` method:

```java
import io.github.ctotheameron.core.JsonValue;
import java.util.Map;

Map<String, JsonValue> additionalProperties = client.distributions().create(params)._additionalProperties();
JsonValue secretPropertyValue = additionalProperties.get("secretProperty");

String result = secretPropertyValue.accept(new JsonValue.Visitor<>() {
    @Override
    public String visitNull() {
        return "It's null!";
    }

    @Override
    public String visitBoolean(boolean value) {
        return "It's a boolean!";
    }

    @Override
    public String visitNumber(Number value) {
        return "It's a number!";
    }

    // Other methods include `visitMissing`, `visitString`, `visitArray`, and `visitObject`
    // The default implementation of each unimplemented method delegates to `visitDefault`, which throws by default, but can also be overridden
});
```

To access a property's raw JSON value, which may be undocumented, call its `_` prefixed method:

```java
import io.github.ctotheameron.core.JsonField;
import java.time.OffsetDateTime;
import java.util.Optional;

JsonField<OffsetDateTime> distributionDate = client.distributions().create(params)._distributionDate();

if (distributionDate.isMissing()) {
  // The property is absent from the JSON response
} else if (distributionDate.isNull()) {
  // The property was set to literal null
} else {
  // Check if value was provided as a string
  // Other methods include `asNumber()`, `asBoolean()`, etc.
  Optional<String> jsonString = distributionDate.asString();

  // Try to deserialize into a custom type
  MyClass myObject = distributionDate.asUnknown().orElseThrow().convert(MyClass.class);
}
```

### Response validation

In rare cases, the API may return a response that doesn't match the expected type. For example, the SDK may expect a property to contain a `String`, but the API could return something else.

By default, the SDK will not throw an exception in this case. It will throw [`AngellistNovaInvalidDataException`](angellist-nova-java-core/src/main/kotlin/io/github/ctotheameron/errors/AngellistNovaInvalidDataException.kt) only if you directly access the property.

If you would prefer to check that the response is completely well-typed upfront, then either call `validate()`:

```java
import io.github.ctotheameron.models.distributions.Distribution;

Distribution distribution = client.distributions().create(params).validate();
```

Or configure the method call to validate the response using the `responseValidation` method:

```java
import io.github.ctotheameron.models.distributions.Distribution;

Distribution distribution = client.distributions().create(
  params, RequestOptions.builder().responseValidation(true).build()
);
```

Or configure the default for all method calls at the client level:

```java
import io.github.ctotheameron.client.AngellistNovaClient;
import io.github.ctotheameron.client.okhttp.AngellistNovaOkHttpClient;

AngellistNovaClient client = AngellistNovaOkHttpClient.builder()
    .fromEnv()
    .responseValidation(true)
    .build();
```

## FAQ

### Why don't you use plain `enum` classes?

Java `enum` classes are not trivially [forwards compatible](https://www.stainless.com/blog/making-java-enums-forwards-compatible). Using them in the SDK could cause runtime exceptions if the API is updated to respond with a new enum value.

### Why do you represent fields using `JsonField<T>` instead of just plain `T`?

Using `JsonField<T>` enables a few features:

- Allowing usage of [undocumented API functionality](#undocumented-api-functionality)
- Lazily [validating the API response against the expected shape](#response-validation)
- Representing absent vs explicitly null values

### Why don't you use [`data` classes](https://kotlinlang.org/docs/data-classes.html)?

It is not [backwards compatible to add new fields to a data class](https://kotlinlang.org/docs/api-guidelines-backward-compatibility.html#avoid-using-data-classes-in-your-api) and we don't want to introduce a breaking change every time we add a field to a class.

### Why don't you use checked exceptions?

Checked exceptions are widely considered a mistake in the Java programming language. In fact, they were omitted from Kotlin for this reason.

Checked exceptions:

- Are verbose to handle
- Encourage error handling at the wrong level of abstraction, where nothing can be done about the error
- Are tedious to propagate due to the [function coloring problem](https://journal.stuffwithstuff.com/2015/02/01/what-color-is-your-function)
- Don't play well with lambdas (also due to the function coloring problem)

## Semantic versioning

This package generally follows [SemVer](https://semver.org/spec/v2.0.0.html) conventions, though certain backwards-incompatible changes may be released as minor versions:

1. Changes to library internals which are technically public but not intended or documented for external use. _(Please open a GitHub issue to let us know if you are relying on such internals.)_
2. Changes that we do not expect to impact the vast majority of users in practice.

We take backwards-compatibility seriously and work hard to ensure you can rely on a smooth upgrade experience.

We are keen for your feedback; please open an [issue](https://www.github.com/stainless-sdks/nova-api-java-spike-java/issues) with questions, bugs, or suggestions.
