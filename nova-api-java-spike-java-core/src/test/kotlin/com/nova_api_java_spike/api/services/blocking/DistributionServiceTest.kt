// File generated from our OpenAPI spec by Stainless.

package com.nova_api_java_spike.api.services.blocking

import com.nova_api_java_spike.api.client.okhttp.NovaApiJavaSpikeOkHttpClient
import com.nova_api_java_spike.api.models.distributions.Currency
import com.nova_api_java_spike.api.models.distributions.DistributionCreateParams
import com.nova_api_java_spike.api.models.distributions.DistributionRetrieveParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DistributionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = NovaApiJavaSpikeOkHttpClient.builder().apiKey("My API Key").build()
        val distributionService = client.distributions()

        val distribution =
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

        distribution.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = NovaApiJavaSpikeOkHttpClient.builder().apiKey("My API Key").build()
        val distributionService = client.distributions()

        val distribution =
            distributionService.retrieve(
                DistributionRetrieveParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .xOrganizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        distribution.validate()
    }
}
