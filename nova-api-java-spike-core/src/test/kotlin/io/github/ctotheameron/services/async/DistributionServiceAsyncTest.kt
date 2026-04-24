// File generated from our OpenAPI spec by Stainless.

package io.github.ctotheameron.services.async

import io.github.ctotheameron.TestServerExtension
import io.github.ctotheameron.client.okhttp.NovaApiJavaSpikeOkHttpClientAsync
import io.github.ctotheameron.models.distributions.Currency
import io.github.ctotheameron.models.distributions.DistributionCreateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DistributionServiceAsyncTest {

    @Test
    fun create() {
        val client =
            NovaApiJavaSpikeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val distributionServiceAsync = client.distributions()

        val distributionFuture =
            distributionServiceAsync.create(
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
                    .build()
            )

        val distribution = distributionFuture.get()
        distribution.validate()
    }

    @Test
    fun retrieve() {
        val client =
            NovaApiJavaSpikeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val distributionServiceAsync = client.distributions()

        val distributionFuture =
            distributionServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val distribution = distributionFuture.get()
        distribution.validate()
    }
}
