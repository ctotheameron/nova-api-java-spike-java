// File generated from our OpenAPI spec by Stainless.

package com.angellist.nova.api.models.entities

import com.angellist.nova.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WireAddressTest {

    @Test
    fun create() {
        val wireAddress =
            WireAddress.builder()
                .city("San Francisco")
                .countryCode("US")
                .street1("123 Main St")
                .postalCode("94105")
                .state("CA")
                .street2("Suite 100")
                .build()

        assertThat(wireAddress.city()).isEqualTo("San Francisco")
        assertThat(wireAddress.countryCode()).isEqualTo("US")
        assertThat(wireAddress.street1()).isEqualTo("123 Main St")
        assertThat(wireAddress.postalCode()).contains("94105")
        assertThat(wireAddress.state()).contains("CA")
        assertThat(wireAddress.street2()).contains("Suite 100")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val wireAddress =
            WireAddress.builder()
                .city("San Francisco")
                .countryCode("US")
                .street1("123 Main St")
                .postalCode("94105")
                .state("CA")
                .street2("Suite 100")
                .build()

        val roundtrippedWireAddress =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(wireAddress),
                jacksonTypeRef<WireAddress>(),
            )

        assertThat(roundtrippedWireAddress).isEqualTo(wireAddress)
    }
}
