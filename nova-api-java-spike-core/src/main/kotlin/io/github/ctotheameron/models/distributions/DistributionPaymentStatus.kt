// File generated from our OpenAPI spec by Stainless.

package io.github.ctotheameron.models.distributions

import com.fasterxml.jackson.annotation.JsonCreator
import io.github.ctotheameron.core.Enum
import io.github.ctotheameron.core.JsonField
import io.github.ctotheameron.errors.NovaApiJavaSpikeInvalidDataException

class DistributionPaymentStatus
@JsonCreator
private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val STAGED = of("staged")

        @JvmField val RECIPIENT_CONFIRMED = of("recipient_confirmed")

        @JvmField val VERIFIED = of("verified")

        @JvmField val DISBURSED = of("disbursed")

        @JvmField val FAILED = of("failed")

        @JvmStatic fun of(value: String) = DistributionPaymentStatus(JsonField.of(value))
    }

    /** An enum containing [DistributionPaymentStatus]'s known values. */
    enum class Known {
        STAGED,
        RECIPIENT_CONFIRMED,
        VERIFIED,
        DISBURSED,
        FAILED,
    }

    /**
     * An enum containing [DistributionPaymentStatus]'s known values, as well as an [_UNKNOWN]
     * member.
     *
     * An instance of [DistributionPaymentStatus] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        STAGED,
        RECIPIENT_CONFIRMED,
        VERIFIED,
        DISBURSED,
        FAILED,
        /**
         * An enum member indicating that [DistributionPaymentStatus] was instantiated with an
         * unknown value.
         */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            STAGED -> Value.STAGED
            RECIPIENT_CONFIRMED -> Value.RECIPIENT_CONFIRMED
            VERIFIED -> Value.VERIFIED
            DISBURSED -> Value.DISBURSED
            FAILED -> Value.FAILED
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws NovaApiJavaSpikeInvalidDataException if this class instance's value is a not a known
     *   member.
     */
    fun known(): Known =
        when (this) {
            STAGED -> Known.STAGED
            RECIPIENT_CONFIRMED -> Known.RECIPIENT_CONFIRMED
            VERIFIED -> Known.VERIFIED
            DISBURSED -> Known.DISBURSED
            FAILED -> Known.FAILED
            else ->
                throw NovaApiJavaSpikeInvalidDataException(
                    "Unknown DistributionPaymentStatus: $value"
                )
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws NovaApiJavaSpikeInvalidDataException if this class instance's value does not have the
     *   expected primitive type.
     */
    fun asString(): String =
        _value().asString().orElseThrow {
            NovaApiJavaSpikeInvalidDataException("Value is not a String")
        }

    private var validated: Boolean = false

    fun validate(): DistributionPaymentStatus = apply {
        if (validated) {
            return@apply
        }

        known()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: NovaApiJavaSpikeInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DistributionPaymentStatus && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
