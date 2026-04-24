// File generated from our OpenAPI spec by Stainless.

package com.nova_api_java_spike.api.models.distributions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.nova_api_java_spike.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DistributionTest {

    @Test
    fun create() {
        val distribution =
            Distribution.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .approvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .distributionDate(OffsetDateTime.parse("2024-04-20T00:00:00Z"))
                .executedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("April 20th Distribution from XYZ Sale")
                .addPayment(
                    Distribution.Payment.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amount(1000L)
                        .addContact(
                            Distribution.Payment.Contact.builder()
                                .notify(true)
                                .person(
                                    Distribution.Payment.Contact.Person.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .email("jane.doe@example.com")
                                        .addExternalReference("person-123")
                                        .name("Jane Doe")
                                        .build()
                                )
                                .build()
                        )
                        .currency(Currency.USD)
                        .entity(
                            Distribution.Payment.Entity.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .addExternalReference("entity-123")
                                .name("Jane Doe, LLC")
                                .type(EntityType.INDIVIDUAL)
                                .build()
                        )
                        .recipientConfirmedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(Distribution.Payment.Status.STAGED)
                        .verifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .shortId("short_id")
                .status(Distribution.Status.DRAFT)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .vehicleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(distribution.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(distribution.approvedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(distribution.cancelledAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(distribution.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(distribution.distributionDate())
            .isEqualTo(OffsetDateTime.parse("2024-04-20T00:00:00Z"))
        assertThat(distribution.executedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(distribution.name()).isEqualTo("April 20th Distribution from XYZ Sale")
        assertThat(distribution.payments())
            .containsExactly(
                Distribution.Payment.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .amount(1000L)
                    .addContact(
                        Distribution.Payment.Contact.builder()
                            .notify(true)
                            .person(
                                Distribution.Payment.Contact.Person.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .email("jane.doe@example.com")
                                    .addExternalReference("person-123")
                                    .name("Jane Doe")
                                    .build()
                            )
                            .build()
                    )
                    .currency(Currency.USD)
                    .entity(
                        Distribution.Payment.Entity.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addExternalReference("entity-123")
                            .name("Jane Doe, LLC")
                            .type(EntityType.INDIVIDUAL)
                            .build()
                    )
                    .recipientConfirmedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(Distribution.Payment.Status.STAGED)
                    .verifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(distribution.publishedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(distribution.shortId()).isEqualTo("short_id")
        assertThat(distribution.status()).isEqualTo(Distribution.Status.DRAFT)
        assertThat(distribution.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(distribution.vehicleId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val distribution =
            Distribution.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .approvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .distributionDate(OffsetDateTime.parse("2024-04-20T00:00:00Z"))
                .executedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("April 20th Distribution from XYZ Sale")
                .addPayment(
                    Distribution.Payment.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amount(1000L)
                        .addContact(
                            Distribution.Payment.Contact.builder()
                                .notify(true)
                                .person(
                                    Distribution.Payment.Contact.Person.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .email("jane.doe@example.com")
                                        .addExternalReference("person-123")
                                        .name("Jane Doe")
                                        .build()
                                )
                                .build()
                        )
                        .currency(Currency.USD)
                        .entity(
                            Distribution.Payment.Entity.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .addExternalReference("entity-123")
                                .name("Jane Doe, LLC")
                                .type(EntityType.INDIVIDUAL)
                                .build()
                        )
                        .recipientConfirmedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(Distribution.Payment.Status.STAGED)
                        .verifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .shortId("short_id")
                .status(Distribution.Status.DRAFT)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .vehicleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedDistribution =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(distribution),
                jacksonTypeRef<Distribution>(),
            )

        assertThat(roundtrippedDistribution).isEqualTo(distribution)
    }
}
