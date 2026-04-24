// File generated from our OpenAPI spec by Stainless.

package io.github.ctotheameron.models.distributions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.github.ctotheameron.core.jsonMapper
import io.github.ctotheameron.models.persons.Person
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DistributionPaymentContactTest {

    @Test
    fun create() {
        val distributionPaymentContact =
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

        assertThat(distributionPaymentContact.notify()).isEqualTo(true)
        assertThat(distributionPaymentContact.person())
            .isEqualTo(
                Person.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .email("jane.doe@example.com")
                    .addExternalReference("person-123")
                    .name("Jane Doe")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val distributionPaymentContact =
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

        val roundtrippedDistributionPaymentContact =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(distributionPaymentContact),
                jacksonTypeRef<DistributionPaymentContact>(),
            )

        assertThat(roundtrippedDistributionPaymentContact).isEqualTo(distributionPaymentContact)
    }
}
