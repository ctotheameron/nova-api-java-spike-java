// File generated from our OpenAPI spec by Stainless.

package com.angellist.nova.api.services

import com.angellist.nova.api.client.AngellistNovaClient
import com.angellist.nova.api.client.okhttp.AngellistNovaOkHttpClient
import com.angellist.nova.api.core.JsonValue
import com.angellist.nova.api.models.distributions.Currency
import com.angellist.nova.api.models.distributions.DistributionCreateParams
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.matchingJsonPath
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import java.time.OffsetDateTime
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ServiceParamsTest {

    private lateinit var client: AngellistNovaClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            AngellistNovaOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
    }

    @Test
    fun create() {
        val distributionService = client.distributions()
        stubFor(post(anyUrl()).willReturn(ok("{}")))

        distributionService.create(
            DistributionCreateParams.builder()
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
                .putAdditionalHeader("Secret-Header", "42")
                .putAdditionalQueryParam("secret_query_param", "42")
                .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
                .build()
        )

        verify(
            postRequestedFor(anyUrl())
                .withHeader("Secret-Header", equalTo("42"))
                .withQueryParam("secret_query_param", equalTo("42"))
                .withRequestBody(matchingJsonPath("$.secretProperty", equalTo("42")))
        )
    }
}
