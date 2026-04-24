// File generated from our OpenAPI spec by Stainless.

package com.angellist.nova.api.models.distributions

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DistributionCreateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.distributionDate()).isEqualTo(OffsetDateTime.parse("2024-04-20T00:00:00Z"))
        assertThat(body.name()).isEqualTo("April 20th Distribution from XYZ Sale")
        assertThat(body.payments())
            .containsExactly(
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
        assertThat(body.vehicleId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
