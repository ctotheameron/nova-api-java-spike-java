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
import io.github.ctotheameron.core.checkRequired
import io.github.ctotheameron.errors.AngellistNovaJavaSpikeInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class WireAddress
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val city: JsonField<String>,
    private val countryCode: JsonField<String>,
    private val street1: JsonField<String>,
    private val postalCode: JsonField<String>,
    private val state: JsonField<String>,
    private val street2: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country_code")
        @ExcludeMissing
        countryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("street1") @ExcludeMissing street1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postal_code")
        @ExcludeMissing
        postalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
        @JsonProperty("street2") @ExcludeMissing street2: JsonField<String> = JsonMissing.of(),
    ) : this(city, countryCode, street1, postalCode, state, street2, mutableMapOf())

    /**
     * City
     *
     * @throws AngellistNovaJavaSpikeInvalidDataException if the JSON field has an unexpected type
     *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun city(): String = city.getRequired("city")

    /**
     * ISO 3166-1 alpha-2 country code
     *
     * @throws AngellistNovaJavaSpikeInvalidDataException if the JSON field has an unexpected type
     *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun countryCode(): String = countryCode.getRequired("country_code")

    /**
     * Street address line 1
     *
     * @throws AngellistNovaJavaSpikeInvalidDataException if the JSON field has an unexpected type
     *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun street1(): String = street1.getRequired("street1")

    /**
     * Postal code
     *
     * @throws AngellistNovaJavaSpikeInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun postalCode(): Optional<String> = postalCode.getOptional("postal_code")

    /**
     * State or province
     *
     * @throws AngellistNovaJavaSpikeInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun state(): Optional<String> = state.getOptional("state")

    /**
     * Street address line 2
     *
     * @throws AngellistNovaJavaSpikeInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun street2(): Optional<String> = street2.getOptional("street2")

    /**
     * Returns the raw JSON value of [city].
     *
     * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

    /**
     * Returns the raw JSON value of [countryCode].
     *
     * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("country_code")
    @ExcludeMissing
    fun _countryCode(): JsonField<String> = countryCode

    /**
     * Returns the raw JSON value of [street1].
     *
     * Unlike [street1], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("street1") @ExcludeMissing fun _street1(): JsonField<String> = street1

    /**
     * Returns the raw JSON value of [postalCode].
     *
     * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("postal_code") @ExcludeMissing fun _postalCode(): JsonField<String> = postalCode

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

    /**
     * Returns the raw JSON value of [street2].
     *
     * Unlike [street2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("street2") @ExcludeMissing fun _street2(): JsonField<String> = street2

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
         * Returns a mutable builder for constructing an instance of [WireAddress].
         *
         * The following fields are required:
         * ```java
         * .city()
         * .countryCode()
         * .street1()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WireAddress]. */
    class Builder internal constructor() {

        private var city: JsonField<String>? = null
        private var countryCode: JsonField<String>? = null
        private var street1: JsonField<String>? = null
        private var postalCode: JsonField<String> = JsonMissing.of()
        private var state: JsonField<String> = JsonMissing.of()
        private var street2: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(wireAddress: WireAddress) = apply {
            city = wireAddress.city
            countryCode = wireAddress.countryCode
            street1 = wireAddress.street1
            postalCode = wireAddress.postalCode
            state = wireAddress.state
            street2 = wireAddress.street2
            additionalProperties = wireAddress.additionalProperties.toMutableMap()
        }

        /** City */
        fun city(city: String) = city(JsonField.of(city))

        /**
         * Sets [Builder.city] to an arbitrary JSON value.
         *
         * You should usually call [Builder.city] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun city(city: JsonField<String>) = apply { this.city = city }

        /** ISO 3166-1 alpha-2 country code */
        fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

        /**
         * Sets [Builder.countryCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.countryCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun countryCode(countryCode: JsonField<String>) = apply { this.countryCode = countryCode }

        /** Street address line 1 */
        fun street1(street1: String) = street1(JsonField.of(street1))

        /**
         * Sets [Builder.street1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.street1] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun street1(street1: JsonField<String>) = apply { this.street1 = street1 }

        /** Postal code */
        fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

        /**
         * Sets [Builder.postalCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.postalCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

        /** State or province */
        fun state(state: String) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<String>) = apply { this.state = state }

        /** Street address line 2 */
        fun street2(street2: String) = street2(JsonField.of(street2))

        /**
         * Sets [Builder.street2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.street2] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun street2(street2: JsonField<String>) = apply { this.street2 = street2 }

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
         * Returns an immutable instance of [WireAddress].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .city()
         * .countryCode()
         * .street1()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WireAddress =
            WireAddress(
                checkRequired("city", city),
                checkRequired("countryCode", countryCode),
                checkRequired("street1", street1),
                postalCode,
                state,
                street2,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): WireAddress = apply {
        if (validated) {
            return@apply
        }

        city()
        countryCode()
        street1()
        postalCode()
        state()
        street2()
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
        (if (city.asKnown().isPresent) 1 else 0) +
            (if (countryCode.asKnown().isPresent) 1 else 0) +
            (if (street1.asKnown().isPresent) 1 else 0) +
            (if (postalCode.asKnown().isPresent) 1 else 0) +
            (if (state.asKnown().isPresent) 1 else 0) +
            (if (street2.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WireAddress &&
            city == other.city &&
            countryCode == other.countryCode &&
            street1 == other.street1 &&
            postalCode == other.postalCode &&
            state == other.state &&
            street2 == other.street2 &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(city, countryCode, street1, postalCode, state, street2, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WireAddress{city=$city, countryCode=$countryCode, street1=$street1, postalCode=$postalCode, state=$state, street2=$street2, additionalProperties=$additionalProperties}"
}
