// File generated from our OpenAPI spec by Stainless.

package com.nova_api_java_spike.api.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.nova_api_java_spike.api.client.NovaApiJavaSpikeClient
import com.nova_api_java_spike.api.client.okhttp.NovaApiJavaSpikeOkHttpClient
import com.nova_api_java_spike.api.core.JsonValue
import com.nova_api_java_spike.api.core.http.Headers
import com.nova_api_java_spike.api.core.jsonMapper
import com.nova_api_java_spike.api.errors.BadRequestException
import com.nova_api_java_spike.api.errors.InternalServerException
import com.nova_api_java_spike.api.errors.NotFoundException
import com.nova_api_java_spike.api.errors.NovaApiJavaSpikeException
import com.nova_api_java_spike.api.errors.PermissionDeniedException
import com.nova_api_java_spike.api.errors.RateLimitException
import com.nova_api_java_spike.api.errors.UnauthorizedException
import com.nova_api_java_spike.api.errors.UnexpectedStatusCodeException
import com.nova_api_java_spike.api.errors.UnprocessableEntityException
import com.nova_api_java_spike.api.models.distributions.Currency
import com.nova_api_java_spike.api.models.distributions.DistributionCreateParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ErrorHandlingTest {

    companion object {

        private val ERROR_JSON: JsonValue = JsonValue.from(mapOf("errorProperty" to "42"))

        private val ERROR_JSON_BYTES: ByteArray = jsonMapper().writeValueAsBytes(ERROR_JSON)

        private const val HEADER_NAME: String = "Error-Header"

        private const val HEADER_VALUE: String = "42"

        private const val NOT_JSON: String = "Not JSON"
    }

    private lateinit var client: NovaApiJavaSpikeClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            NovaApiJavaSpikeOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Test
    fun distributionsCreate400() {
        val distributionService = client.distributions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                distributionService.create(
                    DistributionCreateParams.builder()
                        .xOrganizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .distributionDate(OffsetDateTime.parse("2024-04-20T00:00:00Z"))
                        .name("April 20th Distribution from XYZ Sale")
                        .addPayment(
                            DistributionCreateParams.Payment.builder()
                                .amount(1000L)
                                .addContact(
                                    DistributionCreateParams.Payment.Contact.builder()
                                        .notify(true)
                                        .person("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .build()
                                )
                                .currency(Currency.USD)
                                .entity("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .vehicleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun distributionsCreate400WithRawResponse() {
        val distributionService = client.distributions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                distributionService.create(
                    DistributionCreateParams.builder()
                        .xOrganizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .distributionDate(OffsetDateTime.parse("2024-04-20T00:00:00Z"))
                        .name("April 20th Distribution from XYZ Sale")
                        .addPayment(
                            DistributionCreateParams.Payment.builder()
                                .amount(1000L)
                                .addContact(
                                    DistributionCreateParams.Payment.Contact.builder()
                                        .notify(true)
                                        .person("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .build()
                                )
                                .currency(Currency.USD)
                                .entity("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .vehicleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun distributionsCreate401() {
        val distributionService = client.distributions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                distributionService.create(
                    DistributionCreateParams.builder()
                        .xOrganizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .distributionDate(OffsetDateTime.parse("2024-04-20T00:00:00Z"))
                        .name("April 20th Distribution from XYZ Sale")
                        .addPayment(
                            DistributionCreateParams.Payment.builder()
                                .amount(1000L)
                                .addContact(
                                    DistributionCreateParams.Payment.Contact.builder()
                                        .notify(true)
                                        .person("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .build()
                                )
                                .currency(Currency.USD)
                                .entity("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .vehicleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun distributionsCreate401WithRawResponse() {
        val distributionService = client.distributions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                distributionService.create(
                    DistributionCreateParams.builder()
                        .xOrganizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .distributionDate(OffsetDateTime.parse("2024-04-20T00:00:00Z"))
                        .name("April 20th Distribution from XYZ Sale")
                        .addPayment(
                            DistributionCreateParams.Payment.builder()
                                .amount(1000L)
                                .addContact(
                                    DistributionCreateParams.Payment.Contact.builder()
                                        .notify(true)
                                        .person("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .build()
                                )
                                .currency(Currency.USD)
                                .entity("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .vehicleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun distributionsCreate403() {
        val distributionService = client.distributions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                distributionService.create(
                    DistributionCreateParams.builder()
                        .xOrganizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .distributionDate(OffsetDateTime.parse("2024-04-20T00:00:00Z"))
                        .name("April 20th Distribution from XYZ Sale")
                        .addPayment(
                            DistributionCreateParams.Payment.builder()
                                .amount(1000L)
                                .addContact(
                                    DistributionCreateParams.Payment.Contact.builder()
                                        .notify(true)
                                        .person("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .build()
                                )
                                .currency(Currency.USD)
                                .entity("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .vehicleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun distributionsCreate403WithRawResponse() {
        val distributionService = client.distributions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                distributionService.create(
                    DistributionCreateParams.builder()
                        .xOrganizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .distributionDate(OffsetDateTime.parse("2024-04-20T00:00:00Z"))
                        .name("April 20th Distribution from XYZ Sale")
                        .addPayment(
                            DistributionCreateParams.Payment.builder()
                                .amount(1000L)
                                .addContact(
                                    DistributionCreateParams.Payment.Contact.builder()
                                        .notify(true)
                                        .person("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .build()
                                )
                                .currency(Currency.USD)
                                .entity("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .vehicleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun distributionsCreate404() {
        val distributionService = client.distributions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                distributionService.create(
                    DistributionCreateParams.builder()
                        .xOrganizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .distributionDate(OffsetDateTime.parse("2024-04-20T00:00:00Z"))
                        .name("April 20th Distribution from XYZ Sale")
                        .addPayment(
                            DistributionCreateParams.Payment.builder()
                                .amount(1000L)
                                .addContact(
                                    DistributionCreateParams.Payment.Contact.builder()
                                        .notify(true)
                                        .person("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .build()
                                )
                                .currency(Currency.USD)
                                .entity("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .vehicleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun distributionsCreate404WithRawResponse() {
        val distributionService = client.distributions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                distributionService.create(
                    DistributionCreateParams.builder()
                        .xOrganizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .distributionDate(OffsetDateTime.parse("2024-04-20T00:00:00Z"))
                        .name("April 20th Distribution from XYZ Sale")
                        .addPayment(
                            DistributionCreateParams.Payment.builder()
                                .amount(1000L)
                                .addContact(
                                    DistributionCreateParams.Payment.Contact.builder()
                                        .notify(true)
                                        .person("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .build()
                                )
                                .currency(Currency.USD)
                                .entity("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .vehicleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun distributionsCreate422() {
        val distributionService = client.distributions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                distributionService.create(
                    DistributionCreateParams.builder()
                        .xOrganizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .distributionDate(OffsetDateTime.parse("2024-04-20T00:00:00Z"))
                        .name("April 20th Distribution from XYZ Sale")
                        .addPayment(
                            DistributionCreateParams.Payment.builder()
                                .amount(1000L)
                                .addContact(
                                    DistributionCreateParams.Payment.Contact.builder()
                                        .notify(true)
                                        .person("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .build()
                                )
                                .currency(Currency.USD)
                                .entity("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .vehicleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun distributionsCreate422WithRawResponse() {
        val distributionService = client.distributions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                distributionService.create(
                    DistributionCreateParams.builder()
                        .xOrganizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .distributionDate(OffsetDateTime.parse("2024-04-20T00:00:00Z"))
                        .name("April 20th Distribution from XYZ Sale")
                        .addPayment(
                            DistributionCreateParams.Payment.builder()
                                .amount(1000L)
                                .addContact(
                                    DistributionCreateParams.Payment.Contact.builder()
                                        .notify(true)
                                        .person("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .build()
                                )
                                .currency(Currency.USD)
                                .entity("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .vehicleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun distributionsCreate429() {
        val distributionService = client.distributions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                distributionService.create(
                    DistributionCreateParams.builder()
                        .xOrganizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .distributionDate(OffsetDateTime.parse("2024-04-20T00:00:00Z"))
                        .name("April 20th Distribution from XYZ Sale")
                        .addPayment(
                            DistributionCreateParams.Payment.builder()
                                .amount(1000L)
                                .addContact(
                                    DistributionCreateParams.Payment.Contact.builder()
                                        .notify(true)
                                        .person("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .build()
                                )
                                .currency(Currency.USD)
                                .entity("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .vehicleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun distributionsCreate429WithRawResponse() {
        val distributionService = client.distributions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                distributionService.create(
                    DistributionCreateParams.builder()
                        .xOrganizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .distributionDate(OffsetDateTime.parse("2024-04-20T00:00:00Z"))
                        .name("April 20th Distribution from XYZ Sale")
                        .addPayment(
                            DistributionCreateParams.Payment.builder()
                                .amount(1000L)
                                .addContact(
                                    DistributionCreateParams.Payment.Contact.builder()
                                        .notify(true)
                                        .person("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .build()
                                )
                                .currency(Currency.USD)
                                .entity("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .vehicleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun distributionsCreate500() {
        val distributionService = client.distributions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                distributionService.create(
                    DistributionCreateParams.builder()
                        .xOrganizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .distributionDate(OffsetDateTime.parse("2024-04-20T00:00:00Z"))
                        .name("April 20th Distribution from XYZ Sale")
                        .addPayment(
                            DistributionCreateParams.Payment.builder()
                                .amount(1000L)
                                .addContact(
                                    DistributionCreateParams.Payment.Contact.builder()
                                        .notify(true)
                                        .person("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .build()
                                )
                                .currency(Currency.USD)
                                .entity("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .vehicleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun distributionsCreate500WithRawResponse() {
        val distributionService = client.distributions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                distributionService.create(
                    DistributionCreateParams.builder()
                        .xOrganizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .distributionDate(OffsetDateTime.parse("2024-04-20T00:00:00Z"))
                        .name("April 20th Distribution from XYZ Sale")
                        .addPayment(
                            DistributionCreateParams.Payment.builder()
                                .amount(1000L)
                                .addContact(
                                    DistributionCreateParams.Payment.Contact.builder()
                                        .notify(true)
                                        .person("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .build()
                                )
                                .currency(Currency.USD)
                                .entity("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .vehicleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun distributionsCreate999() {
        val distributionService = client.distributions()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                distributionService.create(
                    DistributionCreateParams.builder()
                        .xOrganizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .distributionDate(OffsetDateTime.parse("2024-04-20T00:00:00Z"))
                        .name("April 20th Distribution from XYZ Sale")
                        .addPayment(
                            DistributionCreateParams.Payment.builder()
                                .amount(1000L)
                                .addContact(
                                    DistributionCreateParams.Payment.Contact.builder()
                                        .notify(true)
                                        .person("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .build()
                                )
                                .currency(Currency.USD)
                                .entity("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .vehicleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun distributionsCreate999WithRawResponse() {
        val distributionService = client.distributions().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                distributionService.create(
                    DistributionCreateParams.builder()
                        .xOrganizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .distributionDate(OffsetDateTime.parse("2024-04-20T00:00:00Z"))
                        .name("April 20th Distribution from XYZ Sale")
                        .addPayment(
                            DistributionCreateParams.Payment.builder()
                                .amount(1000L)
                                .addContact(
                                    DistributionCreateParams.Payment.Contact.builder()
                                        .notify(true)
                                        .person("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .build()
                                )
                                .currency(Currency.USD)
                                .entity("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .vehicleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun distributionsCreateInvalidJsonBody() {
        val distributionService = client.distributions()
        stubFor(
            post(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<NovaApiJavaSpikeException> {
                distributionService.create(
                    DistributionCreateParams.builder()
                        .xOrganizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .distributionDate(OffsetDateTime.parse("2024-04-20T00:00:00Z"))
                        .name("April 20th Distribution from XYZ Sale")
                        .addPayment(
                            DistributionCreateParams.Payment.builder()
                                .amount(1000L)
                                .addContact(
                                    DistributionCreateParams.Payment.Contact.builder()
                                        .notify(true)
                                        .person("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .build()
                                )
                                .currency(Currency.USD)
                                .entity("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .vehicleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            }

        assertThat(e).hasMessage("Error reading response")
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
