// File generated from our OpenAPI spec by Stainless.

package com.angellist.nova.api.services.async

import com.angellist.nova.api.TestServerExtension
import com.angellist.nova.api.client.okhttp.AngellistNovaOkHttpClientAsync
import com.angellist.nova.api.models.distributions.Currency
import com.angellist.nova.api.models.distributions.DistributionCreateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DistributionServiceAsyncTest {

    @Test
    fun create() {
        val client =
            AngellistNovaOkHttpClientAsync.builder()
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
            AngellistNovaOkHttpClientAsync.builder()
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
