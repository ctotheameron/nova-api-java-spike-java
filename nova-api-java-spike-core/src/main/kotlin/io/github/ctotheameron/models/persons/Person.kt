// File generated from our OpenAPI spec by Stainless.

package io.github.ctotheameron.models.persons

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

class Person
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val email: JsonField<String>,
    private val externalReferences: JsonField<List<String>>,
    private val name: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("external_references")
        @ExcludeMissing
        externalReferences: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
    ) : this(id, email, externalReferences, name, mutableMapOf())

    /**
     * UUID of an existing person
     *
     * @throws AngellistNovaJavaSpikeInvalidDataException if the JSON field has an unexpected type
     *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Email address used for notifications and account linkage
     *
     * @throws AngellistNovaJavaSpikeInvalidDataException if the JSON field has an unexpected type
     *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun email(): String = email.getRequired("email")

    /**
     * Your own identifiers for this person
     *
     * @throws AngellistNovaJavaSpikeInvalidDataException if the JSON field has an unexpected type
     *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun externalReferences(): List<String> = externalReferences.getRequired("external_references")

    /**
     * Full legal name
     *
     * @throws AngellistNovaJavaSpikeInvalidDataException if the JSON field has an unexpected type
     *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

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
         * Returns a mutable builder for constructing an instance of [Person].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .email()
         * .externalReferences()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Person]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var email: JsonField<String>? = null
        private var externalReferences: JsonField<MutableList<String>>? = null
        private var name: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(person: Person) = apply {
            id = person.id
            email = person.email
            externalReferences = person.externalReferences.map { it.toMutableList() }
            name = person.name
            additionalProperties = person.additionalProperties.toMutableMap()
        }

        /** UUID of an existing person */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Email address used for notifications and account linkage */
        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** Your own identifiers for this person */
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

        /** Full legal name */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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
         * Returns an immutable instance of [Person].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .email()
         * .externalReferences()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Person =
            Person(
                checkRequired("id", id),
                checkRequired("email", email),
                checkRequired("externalReferences", externalReferences).map { it.toImmutable() },
                checkRequired("name", name),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Person = apply {
        if (validated) {
            return@apply
        }

        id()
        email()
        externalReferences()
        name()
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
            (if (email.asKnown().isPresent) 1 else 0) +
            (externalReferences.asKnown().getOrNull()?.size ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Person &&
            id == other.id &&
            email == other.email &&
            externalReferences == other.externalReferences &&
            name == other.name &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, email, externalReferences, name, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Person{id=$id, email=$email, externalReferences=$externalReferences, name=$name, additionalProperties=$additionalProperties}"
}
