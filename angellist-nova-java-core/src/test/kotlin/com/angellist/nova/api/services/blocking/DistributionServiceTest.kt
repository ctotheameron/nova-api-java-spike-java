// File generated from our OpenAPI spec by Stainless.

package com.angellist.nova.api.services.blocking

import com.angellist.nova.api.TestServerExtension
import com.angellist.nova.api.client.okhttp.AngellistNovaOkHttpClient
import com.angellist.nova.api.models.distributions.Currency
import com.angellist.nova.api.models.distributions.DistributionCreateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DistributionServiceTest {

    @Test
    fun create() {
        val client =
            AngellistNovaOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val distributionService = client.distributions()

        val distribution =
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
                    .build()
            )

        distribution.validate()
    }

    @Test
    fun retrieve() {
        val client =
            AngellistNovaOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        val distributionService = client.distributions()

        val distribution = distributionService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        distribution.validate()
    }
}
