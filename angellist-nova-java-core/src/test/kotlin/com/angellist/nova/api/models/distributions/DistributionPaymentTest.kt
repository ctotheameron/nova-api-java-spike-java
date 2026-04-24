// File generated from our OpenAPI spec by Stainless.

package com.angellist.nova.api.models.distributions

import com.angellist.nova.api.core.jsonMapper
import com.angellist.nova.api.models.entities.Entity
import com.angellist.nova.api.models.entities.EntityType
import com.angellist.nova.api.models.persons.Person
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DistributionPaymentTest {

    @Test
    fun create() {
        val distributionPayment =
            DistributionPayment.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(1000L)
                .addContact(
                    DistributionPaymentContact.builder()
                        .notify(true)
                        .person(
                            Person.builder()
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
                    Entity.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addExternalReference("entity-123")
                        .name("Jane Doe, LLC")
                        .type(EntityType.INDIVIDUAL)
                        .build()
                )
                .recipientConfirmedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(DistributionPaymentStatus.STAGED)
                .verifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(distributionPayment.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(distributionPayment.amount()).isEqualTo(1000L)
        assertThat(distributionPayment.contacts())
            .containsExactly(
                DistributionPaymentContact.builder()
                    .notify(true)
                    .person(
                        Person.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .email("jane.doe@example.com")
                            .addExternalReference("person-123")
                            .name("Jane Doe")
                            .build()
                    )
                    .build()
            )
        assertThat(distributionPayment.currency()).isEqualTo(Currency.USD)
        assertThat(distributionPayment.entity())
            .isEqualTo(
                Entity.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addExternalReference("entity-123")
                    .name("Jane Doe, LLC")
                    .type(EntityType.INDIVIDUAL)
                    .build()
            )
        assertThat(distributionPayment.recipientConfirmedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(distributionPayment.status()).isEqualTo(DistributionPaymentStatus.STAGED)
        assertThat(distributionPayment.verifiedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val distributionPayment =
            DistributionPayment.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(1000L)
                .addContact(
                    DistributionPaymentContact.builder()
                        .notify(true)
                        .person(
                            Person.builder()
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
                    Entity.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addExternalReference("entity-123")
                        .name("Jane Doe, LLC")
                        .type(EntityType.INDIVIDUAL)
                        .build()
                )
                .recipientConfirmedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(DistributionPaymentStatus.STAGED)
                .verifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedDistributionPayment =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(distributionPayment),
                jacksonTypeRef<DistributionPayment>(),
            )

        assertThat(roundtrippedDistributionPayment).isEqualTo(distributionPayment)
    }
}
