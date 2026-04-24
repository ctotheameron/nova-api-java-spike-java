// File generated from our OpenAPI spec by Stainless.

package io.github.ctotheameron.models.entities

import com.fasterxml.jackson.annotation.JsonCreator
import io.github.ctotheameron.core.Enum
import io.github.ctotheameron.core.JsonField
import io.github.ctotheameron.errors.AngellistNovaInvalidDataException

class EntityType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val INDIVIDUAL = of("individual")

        @JvmField val INDIVIDUAL_RETIREMENT_PLAN = of("individualRetirementPlan")

        @JvmField val CORPORATION = of("corporation")

        @JvmField val LLC = of("llc")

        @JvmField val PARTNERSHIP = of("partnership")

        @JvmField val TRUST = of("trust")

        @JvmField val JOINT_TENANTS_ROS = of("jointTenantsROS")

        @JvmField val TENANTS_IN_COMMON = of("tenantsInCommon")

        @JvmField val COMMUNITY_PROPERTY = of("communityProperty")

        @JvmField val REGISTERED_INVESTMENT_COMPANY = of("registeredInvestmentCompany")

        @JvmField val FOUNDATION = of("foundation")

        @JvmField val CHARITABLE_REMAINDER_TRUST = of("charitableRemainderTrust")

        @JvmField val ENDOWMENT = of("endowment")

        @JvmField val EMPLOYEE_BENEFIT_PLAN = of("employeeBenefitPlan")

        @JvmField val KEOGH_PLAN = of("keoghPlan")

        @JvmField val OTHER_ENTITY = of("otherEntity")

        @JvmStatic fun of(value: String) = EntityType(JsonField.of(value))
    }

    /** An enum containing [EntityType]'s known values. */
    enum class Known {
        INDIVIDUAL,
        INDIVIDUAL_RETIREMENT_PLAN,
        CORPORATION,
        LLC,
        PARTNERSHIP,
        TRUST,
        JOINT_TENANTS_ROS,
        TENANTS_IN_COMMON,
        COMMUNITY_PROPERTY,
        REGISTERED_INVESTMENT_COMPANY,
        FOUNDATION,
        CHARITABLE_REMAINDER_TRUST,
        ENDOWMENT,
        EMPLOYEE_BENEFIT_PLAN,
        KEOGH_PLAN,
        OTHER_ENTITY,
    }

    /**
     * An enum containing [EntityType]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [EntityType] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        INDIVIDUAL,
        INDIVIDUAL_RETIREMENT_PLAN,
        CORPORATION,
        LLC,
        PARTNERSHIP,
        TRUST,
        JOINT_TENANTS_ROS,
        TENANTS_IN_COMMON,
        COMMUNITY_PROPERTY,
        REGISTERED_INVESTMENT_COMPANY,
        FOUNDATION,
        CHARITABLE_REMAINDER_TRUST,
        ENDOWMENT,
        EMPLOYEE_BENEFIT_PLAN,
        KEOGH_PLAN,
        OTHER_ENTITY,
        /** An enum member indicating that [EntityType] was instantiated with an unknown value. */
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
            INDIVIDUAL -> Value.INDIVIDUAL
            INDIVIDUAL_RETIREMENT_PLAN -> Value.INDIVIDUAL_RETIREMENT_PLAN
            CORPORATION -> Value.CORPORATION
            LLC -> Value.LLC
            PARTNERSHIP -> Value.PARTNERSHIP
            TRUST -> Value.TRUST
            JOINT_TENANTS_ROS -> Value.JOINT_TENANTS_ROS
            TENANTS_IN_COMMON -> Value.TENANTS_IN_COMMON
            COMMUNITY_PROPERTY -> Value.COMMUNITY_PROPERTY
            REGISTERED_INVESTMENT_COMPANY -> Value.REGISTERED_INVESTMENT_COMPANY
            FOUNDATION -> Value.FOUNDATION
            CHARITABLE_REMAINDER_TRUST -> Value.CHARITABLE_REMAINDER_TRUST
            ENDOWMENT -> Value.ENDOWMENT
            EMPLOYEE_BENEFIT_PLAN -> Value.EMPLOYEE_BENEFIT_PLAN
            KEOGH_PLAN -> Value.KEOGH_PLAN
            OTHER_ENTITY -> Value.OTHER_ENTITY
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws AngellistNovaInvalidDataException if this class instance's value is a not a known
     *   member.
     */
    fun known(): Known =
        when (this) {
            INDIVIDUAL -> Known.INDIVIDUAL
            INDIVIDUAL_RETIREMENT_PLAN -> Known.INDIVIDUAL_RETIREMENT_PLAN
            CORPORATION -> Known.CORPORATION
            LLC -> Known.LLC
            PARTNERSHIP -> Known.PARTNERSHIP
            TRUST -> Known.TRUST
            JOINT_TENANTS_ROS -> Known.JOINT_TENANTS_ROS
            TENANTS_IN_COMMON -> Known.TENANTS_IN_COMMON
            COMMUNITY_PROPERTY -> Known.COMMUNITY_PROPERTY
            REGISTERED_INVESTMENT_COMPANY -> Known.REGISTERED_INVESTMENT_COMPANY
            FOUNDATION -> Known.FOUNDATION
            CHARITABLE_REMAINDER_TRUST -> Known.CHARITABLE_REMAINDER_TRUST
            ENDOWMENT -> Known.ENDOWMENT
            EMPLOYEE_BENEFIT_PLAN -> Known.EMPLOYEE_BENEFIT_PLAN
            KEOGH_PLAN -> Known.KEOGH_PLAN
            OTHER_ENTITY -> Known.OTHER_ENTITY
            else -> throw AngellistNovaInvalidDataException("Unknown EntityType: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws AngellistNovaInvalidDataException if this class instance's value does not have the
     *   expected primitive type.
     */
    fun asString(): String =
        _value().asString().orElseThrow {
            AngellistNovaInvalidDataException("Value is not a String")
        }

    private var validated: Boolean = false

    fun validate(): EntityType = apply {
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
        } catch (e: AngellistNovaInvalidDataException) {
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

        return other is EntityType && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
