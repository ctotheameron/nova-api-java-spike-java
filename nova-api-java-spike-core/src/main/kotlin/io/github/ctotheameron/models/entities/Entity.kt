// File generated from our OpenAPI spec by Stainless.

package io.github.ctotheameron.models.entities

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.ctotheameron.core.ExcludeMissing
import io.github.ctotheameron.core.JsonField
import io.github.ctotheameron.core.JsonMissing
import io.github.ctotheameron.core.JsonValue
import io.github.ctotheameron.core.checkKnown
import io.github.ctotheameron.core.checkRequired
import io.github.ctotheameron.core.toImmutable
import io.github.ctotheameron.errors.AngellistNovaJavaSpikeInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class Entity
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val externalReferences: JsonField<List<String>>,
    private val name: JsonField<String>,
    private val type: JsonField<EntityType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("external_references")
        @ExcludeMissing
        externalReferences: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<EntityType> = JsonMissing.of(),
    ) : this(id, externalReferences, name, type, mutableMapOf())

    /**
     * UUID of an existing entity
     *
     * @throws AngellistNovaJavaSpikeInvalidDataException if the JSON field has an unexpected type
     *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Your own identifiers for this entity
     *
     * @throws AngellistNovaJavaSpikeInvalidDataException if the JSON field has an unexpected type
     *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun externalReferences(): List<String> = externalReferences.getRequired("external_references")

    /**
     * Legal name of the entity
     *
     * @throws AngellistNovaJavaSpikeInvalidDataException if the JSON field has an unexpected type
     *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws AngellistNovaJavaSpikeInvalidDataException if the JSON field has an unexpected type
     *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): EntityType = type.getRequired("type")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [externalReferences].
     *
     * Unlike [externalReferences], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("external_references")
    @ExcludeMissing
    fun _externalReferences(): JsonField<List<String>> = externalReferences

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<EntityType> = type

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Entity].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .externalReferences()
         * .name()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Entity]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var externalReferences: JsonField<MutableList<String>>? = null
        private var name: JsonField<String>? = null
        private var type: JsonField<EntityType>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(entity: Entity) = apply {
            id = entity.id
            externalReferences = entity.externalReferences.map { it.toMutableList() }
            name = entity.name
            type = entity.type
            additionalProperties = entity.additionalProperties.toMutableMap()
        }

        /** UUID of an existing entity */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Your own identifiers for this entity */
        fun externalReferences(externalReferences: List<String>) =
            externalReferences(JsonField.of(externalReferences))

        /**
         * Sets [Builder.externalReferences] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalReferences] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun externalReferences(externalReferences: JsonField<List<String>>) = apply {
            this.externalReferences = externalReferences.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [externalReferences].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExternalReference(externalReference: String) = apply {
            externalReferences =
                (externalReferences ?: JsonField.of(mutableListOf())).also {
                    checkKnown("externalReferences", it).add(externalReference)
                }
        }

        /** Legal name of the entity */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun type(type: EntityType) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [EntityType] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<EntityType>) = apply { this.type = type }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [Entity].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .externalReferences()
         * .name()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Entity =
            Entity(
                checkRequired("id", id),
                checkRequired("externalReferences", externalReferences).map { it.toImmutable() },
                checkRequired("name", name),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Entity = apply {
        if (validated) {
            return@apply
        }

        id()
        externalReferences()
        name()
        type().validate()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: AngellistNovaJavaSpikeInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (externalReferences.asKnown().getOrNull()?.size ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Entity &&
            id == other.id &&
            externalReferences == other.externalReferences &&
            name == other.name &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, externalReferences, name, type, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Entity{id=$id, externalReferences=$externalReferences, name=$name, type=$type, additionalProperties=$additionalProperties}"
}
