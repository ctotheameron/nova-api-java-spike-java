// File generated from our OpenAPI spec by Stainless.

package io.github.ctotheameron.models.distributions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import io.github.ctotheameron.core.ExcludeMissing
import io.github.ctotheameron.core.JsonField
import io.github.ctotheameron.core.JsonMissing
import io.github.ctotheameron.core.JsonValue
import io.github.ctotheameron.core.checkRequired
import io.github.ctotheameron.errors.AngellistNovaInvalidDataException
import io.github.ctotheameron.models.persons.Person
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class DistributionPaymentContact
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val notify: JsonField<Boolean>,
    private val person: JsonField<Person>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("notify") @ExcludeMissing notify: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("person") @ExcludeMissing person: JsonField<Person> = JsonMissing.of(),
    ) : this(notify, person, mutableMapOf())

    /**
     * Whether the person was notified
     *
     * @throws AngellistNovaInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun notify(): Boolean = notify.getRequired("notify")

    /**
     * @throws AngellistNovaInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun person(): Person = person.getRequired("person")

    /**
     * Returns the raw JSON value of [notify].
     *
     * Unlike [notify], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("notify") @ExcludeMissing fun _notify(): JsonField<Boolean> = notify

    /**
     * Returns the raw JSON value of [person].
     *
     * Unlike [person], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("person") @ExcludeMissing fun _person(): JsonField<Person> = person

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
         * Returns a mutable builder for constructing an instance of [DistributionPaymentContact].
         *
         * The following fields are required:
         * ```java
         * .notify()
         * .person()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DistributionPaymentContact]. */
    class Builder internal constructor() {

        private var notify: JsonField<Boolean>? = null
        private var person: JsonField<Person>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(distributionPaymentContact: DistributionPaymentContact) = apply {
            notify = distributionPaymentContact.notify
            person = distributionPaymentContact.person
            additionalProperties = distributionPaymentContact.additionalProperties.toMutableMap()
        }

        /** Whether the person was notified */
        fun notify(notify: Boolean) = notify(JsonField.of(notify))

        /**
         * Sets [Builder.notify] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notify] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun notify(notify: JsonField<Boolean>) = apply { this.notify = notify }

        fun person(person: Person) = person(JsonField.of(person))

        /**
         * Sets [Builder.person] to an arbitrary JSON value.
         *
         * You should usually call [Builder.person] with a well-typed [Person] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun person(person: JsonField<Person>) = apply { this.person = person }

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
         * Returns an immutable instance of [DistributionPaymentContact].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .notify()
         * .person()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DistributionPaymentContact =
            DistributionPaymentContact(
                checkRequired("notify", notify),
                checkRequired("person", person),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DistributionPaymentContact = apply {
        if (validated) {
            return@apply
        }

        notify()
        person().validate()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: AngellistNovaInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (notify.asKnown().isPresent) 1 else 0) + (person.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DistributionPaymentContact &&
            notify == other.notify &&
            person == other.person &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(notify, person, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DistributionPaymentContact{notify=$notify, person=$person, additionalProperties=$additionalProperties}"
}
