// File generated from our OpenAPI spec by Stainless.

package io.github.ctotheameron.models.entities

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.github.ctotheameron.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EntityTest {

    @Test
    fun create() {
        val entity =
            Entity.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addExternalReference("entity-123")
                .name("Jane Doe, LLC")
                .type(EntityType.INDIVIDUAL)
                .build()

        assertThat(entity.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(entity.externalReferences()).containsExactly("entity-123")
        assertThat(entity.name()).isEqualTo("Jane Doe, LLC")
        assertThat(entity.type()).isEqualTo(EntityType.INDIVIDUAL)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val entity =
            Entity.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addExternalReference("entity-123")
                .name("Jane Doe, LLC")
                .type(EntityType.INDIVIDUAL)
                .build()

        val roundtrippedEntity =
            jsonMapper.readValue(jsonMapper.writeValueAsString(entity), jacksonTypeRef<Entity>())

        assertThat(roundtrippedEntity).isEqualTo(entity)
    }
}
