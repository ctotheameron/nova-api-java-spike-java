// File generated from our OpenAPI spec by Stainless.

package com.angellist.nova.api.models.persons

import com.angellist.nova.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PersonTest {

    @Test
    fun create() {
        val person =
            Person.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .email("jane.doe@example.com")
                .addExternalReference("person-123")
                .name("Jane Doe")
                .build()

        assertThat(person.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(person.email()).isEqualTo("jane.doe@example.com")
        assertThat(person.externalReferences()).containsExactly("person-123")
        assertThat(person.name()).isEqualTo("Jane Doe")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val person =
            Person.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .email("jane.doe@example.com")
                .addExternalReference("person-123")
                .name("Jane Doe")
                .build()

        val roundtrippedPerson =
            jsonMapper.readValue(jsonMapper.writeValueAsString(person), jacksonTypeRef<Person>())

        assertThat(roundtrippedPerson).isEqualTo(person)
    }
}
