// File generated from our OpenAPI spec by Stainless.

package com.angellist.nova.api.models.entities

import com.angellist.nova.api.core.ExcludeMissing
import com.angellist.nova.api.core.JsonField
import com.angellist.nova.api.core.JsonMissing
import com.angellist.nova.api.core.JsonValue
import com.angellist.nova.api.core.checkRequired
import com.angellist.nova.api.errors.AngellistNovaInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** International wire */
class InternationalWireInfo
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accountNumber: JsonField<String>,
    private val address: JsonField<WireAddress>,
    private val bankName: JsonField<String>,
    private val beneficiaryName: JsonField<String>,
    private val swiftCode: JsonField<String>,
    private val type: JsonValue,
    private val branchCode: JsonField<String>,
    private val intermediaryPartyName: JsonField<String>,
    private val intermediaryPartySwiftCode: JsonField<String>,
    private val originatorToBeneficiaryInstructionsLine1: JsonField<String>,
    private val originatorToBeneficiaryInstructionsLine2: JsonField<String>,
    private val originatorToBeneficiaryInstructionsLine3: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("account_number")
        @ExcludeMissing
        accountNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("address") @ExcludeMissing address: JsonField<WireAddress> = JsonMissing.of(),
        @JsonProperty("bank_name") @ExcludeMissing bankName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("beneficiary_name")
        @ExcludeMissing
        beneficiaryName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("swift_code") @ExcludeMissing swiftCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        @JsonProperty("branch_code")
        @ExcludeMissing
        branchCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("intermediary_party_name")
        @ExcludeMissing
        intermediaryPartyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("intermediary_party_swift_code")
        @ExcludeMissing
        intermediaryPartySwiftCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_to_beneficiary_instructions_line1")
        @ExcludeMissing
        originatorToBeneficiaryInstructionsLine1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_to_beneficiary_instructions_line2")
        @ExcludeMissing
        originatorToBeneficiaryInstructionsLine2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("originator_to_beneficiary_instructions_line3")
        @ExcludeMissing
        originatorToBeneficiaryInstructionsLine3: JsonField<String> = JsonMissing.of(),
    ) : this(
        accountNumber,
        address,
        bankName,
        beneficiaryName,
        swiftCode,
        type,
        branchCode,
        intermediaryPartyName,
        intermediaryPartySwiftCode,
        originatorToBeneficiaryInstructionsLine1,
        originatorToBeneficiaryInstructionsLine2,
        originatorToBeneficiaryInstructionsLine3,
        mutableMapOf(),
    )

    /**
     * Bank account number
     *
     * @throws AngellistNovaInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountNumber(): String = accountNumber.getRequired("account_number")

    /**
     * @throws AngellistNovaInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun address(): WireAddress = address.getRequired("address")

    /**
     * Name of the bank
     *
     * @throws AngellistNovaInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun bankName(): String = bankName.getRequired("bank_name")

    /**
     * Name of the account holder, as registered with the bank
     *
     * @throws AngellistNovaInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun beneficiaryName(): String = beneficiaryName.getRequired("beneficiary_name")

    /**
     * SWIFT/BIC code
     *
     * @throws AngellistNovaInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun swiftCode(): String = swiftCode.getRequired("swift_code")

    /**
     * Expected to always return the following:
     * ```java
     * JsonValue.from("international_wire")
     * ```
     *
     * However, this method can be useful for debugging and logging (e.g. if the server responded
     * with an unexpected value).
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

    /**
     * Bank branch code (e.g. sort code, IFSC, etc.)
     *
     * @throws AngellistNovaInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun branchCode(): Optional<String> = branchCode.getOptional("branch_code")

    /**
     * Name of the intermediary bank
     *
     * @throws AngellistNovaInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun intermediaryPartyName(): Optional<String> =
        intermediaryPartyName.getOptional("intermediary_party_name")

    /**
     * SWIFT/BIC code of the intermediary bank
     *
     * @throws AngellistNovaInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun intermediaryPartySwiftCode(): Optional<String> =
        intermediaryPartySwiftCode.getOptional("intermediary_party_swift_code")

    /**
     * Payment instructions line 1
     *
     * @throws AngellistNovaInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun originatorToBeneficiaryInstructionsLine1(): Optional<String> =
        originatorToBeneficiaryInstructionsLine1.getOptional(
            "originator_to_beneficiary_instructions_line1"
        )

    /**
     * Payment instructions line 2
     *
     * @throws AngellistNovaInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun originatorToBeneficiaryInstructionsLine2(): Optional<String> =
        originatorToBeneficiaryInstructionsLine2.getOptional(
            "originator_to_beneficiary_instructions_line2"
        )

    /**
     * Payment instructions line 3
     *
     * @throws AngellistNovaInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun originatorToBeneficiaryInstructionsLine3(): Optional<String> =
        originatorToBeneficiaryInstructionsLine3.getOptional(
            "originator_to_beneficiary_instructions_line3"
        )

    /**
     * Returns the raw JSON value of [accountNumber].
     *
     * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_number")
    @ExcludeMissing
    fun _accountNumber(): JsonField<String> = accountNumber

    /**
     * Returns the raw JSON value of [address].
     *
     * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<WireAddress> = address

    /**
     * Returns the raw JSON value of [bankName].
     *
     * Unlike [bankName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bank_name") @ExcludeMissing fun _bankName(): JsonField<String> = bankName

    /**
     * Returns the raw JSON value of [beneficiaryName].
     *
     * Unlike [beneficiaryName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("beneficiary_name")
    @ExcludeMissing
    fun _beneficiaryName(): JsonField<String> = beneficiaryName

    /**
     * Returns the raw JSON value of [swiftCode].
     *
     * Unlike [swiftCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("swift_code") @ExcludeMissing fun _swiftCode(): JsonField<String> = swiftCode

    /**
     * Returns the raw JSON value of [branchCode].
     *
     * Unlike [branchCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("branch_code") @ExcludeMissing fun _branchCode(): JsonField<String> = branchCode

    /**
     * Returns the raw JSON value of [intermediaryPartyName].
     *
     * Unlike [intermediaryPartyName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("intermediary_party_name")
    @ExcludeMissing
    fun _intermediaryPartyName(): JsonField<String> = intermediaryPartyName

    /**
     * Returns the raw JSON value of [intermediaryPartySwiftCode].
     *
     * Unlike [intermediaryPartySwiftCode], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("intermediary_party_swift_code")
    @ExcludeMissing
    fun _intermediaryPartySwiftCode(): JsonField<String> = intermediaryPartySwiftCode

    /**
     * Returns the raw JSON value of [originatorToBeneficiaryInstructionsLine1].
     *
     * Unlike [originatorToBeneficiaryInstructionsLine1], this method doesn't throw if the JSON
     * field has an unexpected type.
     */
    @JsonProperty("originator_to_beneficiary_instructions_line1")
    @ExcludeMissing
    fun _originatorToBeneficiaryInstructionsLine1(): JsonField<String> =
        originatorToBeneficiaryInstructionsLine1

    /**
     * Returns the raw JSON value of [originatorToBeneficiaryInstructionsLine2].
     *
     * Unlike [originatorToBeneficiaryInstructionsLine2], this method doesn't throw if the JSON
     * field has an unexpected type.
     */
    @JsonProperty("originator_to_beneficiary_instructions_line2")
    @ExcludeMissing
    fun _originatorToBeneficiaryInstructionsLine2(): JsonField<String> =
        originatorToBeneficiaryInstructionsLine2

    /**
     * Returns the raw JSON value of [originatorToBeneficiaryInstructionsLine3].
     *
     * Unlike [originatorToBeneficiaryInstructionsLine3], this method doesn't throw if the JSON
     * field has an unexpected type.
     */
    @JsonProperty("originator_to_beneficiary_instructions_line3")
    @ExcludeMissing
    fun _originatorToBeneficiaryInstructionsLine3(): JsonField<String> =
        originatorToBeneficiaryInstructionsLine3

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
         * Returns a mutable builder for constructing an instance of [InternationalWireInfo].
         *
         * The following fields are required:
         * ```java
         * .accountNumber()
         * .address()
         * .bankName()
         * .beneficiaryName()
         * .swiftCode()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InternationalWireInfo]. */
    class Builder internal constructor() {

        private var accountNumber: JsonField<String>? = null
        private var address: JsonField<WireAddress>? = null
        private var bankName: JsonField<String>? = null
        private var beneficiaryName: JsonField<String>? = null
        private var swiftCode: JsonField<String>? = null
        private var type: JsonValue = JsonValue.from("international_wire")
        private var branchCode: JsonField<String> = JsonMissing.of()
        private var intermediaryPartyName: JsonField<String> = JsonMissing.of()
        private var intermediaryPartySwiftCode: JsonField<String> = JsonMissing.of()
        private var originatorToBeneficiaryInstructionsLine1: JsonField<String> = JsonMissing.of()
        private var originatorToBeneficiaryInstructionsLine2: JsonField<String> = JsonMissing.of()
        private var originatorToBeneficiaryInstructionsLine3: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(internationalWireInfo: InternationalWireInfo) = apply {
            accountNumber = internationalWireInfo.accountNumber
            address = internationalWireInfo.address
            bankName = internationalWireInfo.bankName
            beneficiaryName = internationalWireInfo.beneficiaryName
            swiftCode = internationalWireInfo.swiftCode
            type = internationalWireInfo.type
            branchCode = internationalWireInfo.branchCode
            intermediaryPartyName = internationalWireInfo.intermediaryPartyName
            intermediaryPartySwiftCode = internationalWireInfo.intermediaryPartySwiftCode
            originatorToBeneficiaryInstructionsLine1 =
                internationalWireInfo.originatorToBeneficiaryInstructionsLine1
            originatorToBeneficiaryInstructionsLine2 =
                internationalWireInfo.originatorToBeneficiaryInstructionsLine2
            originatorToBeneficiaryInstructionsLine3 =
                internationalWireInfo.originatorToBeneficiaryInstructionsLine3
            additionalProperties = internationalWireInfo.additionalProperties.toMutableMap()
        }

        /** Bank account number */
        fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

        /**
         * Sets [Builder.accountNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountNumber(accountNumber: JsonField<String>) = apply {
            this.accountNumber = accountNumber
        }

        fun address(address: WireAddress) = address(JsonField.of(address))

        /**
         * Sets [Builder.address] to an arbitrary JSON value.
         *
         * You should usually call [Builder.address] with a well-typed [WireAddress] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun address(address: JsonField<WireAddress>) = apply { this.address = address }

        /** Name of the bank */
        fun bankName(bankName: String) = bankName(JsonField.of(bankName))

        /**
         * Sets [Builder.bankName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bankName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bankName(bankName: JsonField<String>) = apply { this.bankName = bankName }

        /** Name of the account holder, as registered with the bank */
        fun beneficiaryName(beneficiaryName: String) =
            beneficiaryName(JsonField.of(beneficiaryName))

        /**
         * Sets [Builder.beneficiaryName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beneficiaryName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun beneficiaryName(beneficiaryName: JsonField<String>) = apply {
            this.beneficiaryName = beneficiaryName
        }

        /** SWIFT/BIC code */
        fun swiftCode(swiftCode: String) = swiftCode(JsonField.of(swiftCode))

        /**
         * Sets [Builder.swiftCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.swiftCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun swiftCode(swiftCode: JsonField<String>) = apply { this.swiftCode = swiftCode }

        /**
         * Sets the field to an arbitrary JSON value.
         *
         * It is usually unnecessary to call this method because the field defaults to the
         * following:
         * ```java
         * JsonValue.from("international_wire")
         * ```
         *
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun type(type: JsonValue) = apply { this.type = type }

        /** Bank branch code (e.g. sort code, IFSC, etc.) */
        fun branchCode(branchCode: String) = branchCode(JsonField.of(branchCode))

        /**
         * Sets [Builder.branchCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.branchCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun branchCode(branchCode: JsonField<String>) = apply { this.branchCode = branchCode }

        /** Name of the intermediary bank */
        fun intermediaryPartyName(intermediaryPartyName: String) =
            intermediaryPartyName(JsonField.of(intermediaryPartyName))

        /**
         * Sets [Builder.intermediaryPartyName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.intermediaryPartyName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun intermediaryPartyName(intermediaryPartyName: JsonField<String>) = apply {
            this.intermediaryPartyName = intermediaryPartyName
        }

        /** SWIFT/BIC code of the intermediary bank */
        fun intermediaryPartySwiftCode(intermediaryPartySwiftCode: String) =
            intermediaryPartySwiftCode(JsonField.of(intermediaryPartySwiftCode))

        /**
         * Sets [Builder.intermediaryPartySwiftCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.intermediaryPartySwiftCode] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun intermediaryPartySwiftCode(intermediaryPartySwiftCode: JsonField<String>) = apply {
            this.intermediaryPartySwiftCode = intermediaryPartySwiftCode
        }

        /** Payment instructions line 1 */
        fun originatorToBeneficiaryInstructionsLine1(
            originatorToBeneficiaryInstructionsLine1: String
        ) =
            originatorToBeneficiaryInstructionsLine1(
                JsonField.of(originatorToBeneficiaryInstructionsLine1)
            )

        /**
         * Sets [Builder.originatorToBeneficiaryInstructionsLine1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatorToBeneficiaryInstructionsLine1] with a
         * well-typed [String] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun originatorToBeneficiaryInstructionsLine1(
            originatorToBeneficiaryInstructionsLine1: JsonField<String>
        ) = apply {
            this.originatorToBeneficiaryInstructionsLine1 = originatorToBeneficiaryInstructionsLine1
        }

        /** Payment instructions line 2 */
        fun originatorToBeneficiaryInstructionsLine2(
            originatorToBeneficiaryInstructionsLine2: String
        ) =
            originatorToBeneficiaryInstructionsLine2(
                JsonField.of(originatorToBeneficiaryInstructionsLine2)
            )

        /**
         * Sets [Builder.originatorToBeneficiaryInstructionsLine2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatorToBeneficiaryInstructionsLine2] with a
         * well-typed [String] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun originatorToBeneficiaryInstructionsLine2(
            originatorToBeneficiaryInstructionsLine2: JsonField<String>
        ) = apply {
            this.originatorToBeneficiaryInstructionsLine2 = originatorToBeneficiaryInstructionsLine2
        }

        /** Payment instructions line 3 */
        fun originatorToBeneficiaryInstructionsLine3(
            originatorToBeneficiaryInstructionsLine3: String
        ) =
            originatorToBeneficiaryInstructionsLine3(
                JsonField.of(originatorToBeneficiaryInstructionsLine3)
            )

        /**
         * Sets [Builder.originatorToBeneficiaryInstructionsLine3] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originatorToBeneficiaryInstructionsLine3] with a
         * well-typed [String] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun originatorToBeneficiaryInstructionsLine3(
            originatorToBeneficiaryInstructionsLine3: JsonField<String>
        ) = apply {
            this.originatorToBeneficiaryInstructionsLine3 = originatorToBeneficiaryInstructionsLine3
        }

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
         * Returns an immutable instance of [InternationalWireInfo].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountNumber()
         * .address()
         * .bankName()
         * .beneficiaryName()
         * .swiftCode()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InternationalWireInfo =
            InternationalWireInfo(
                checkRequired("accountNumber", accountNumber),
                checkRequired("address", address),
                checkRequired("bankName", bankName),
                checkRequired("beneficiaryName", beneficiaryName),
                checkRequired("swiftCode", swiftCode),
                type,
                branchCode,
                intermediaryPartyName,
                intermediaryPartySwiftCode,
                originatorToBeneficiaryInstructionsLine1,
                originatorToBeneficiaryInstructionsLine2,
                originatorToBeneficiaryInstructionsLine3,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InternationalWireInfo = apply {
        if (validated) {
            return@apply
        }

        accountNumber()
        address().validate()
        bankName()
        beneficiaryName()
        swiftCode()
        _type().let {
            if (it != JsonValue.from("international_wire")) {
                throw AngellistNovaInvalidDataException("'type' is invalid, received $it")
            }
        }
        branchCode()
        intermediaryPartyName()
        intermediaryPartySwiftCode()
        originatorToBeneficiaryInstructionsLine1()
        originatorToBeneficiaryInstructionsLine2()
        originatorToBeneficiaryInstructionsLine3()
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
        (if (accountNumber.asKnown().isPresent) 1 else 0) +
            (address.asKnown().getOrNull()?.validity() ?: 0) +
            (if (bankName.asKnown().isPresent) 1 else 0) +
            (if (beneficiaryName.asKnown().isPresent) 1 else 0) +
            (if (swiftCode.asKnown().isPresent) 1 else 0) +
            type.let { if (it == JsonValue.from("international_wire")) 1 else 0 } +
            (if (branchCode.asKnown().isPresent) 1 else 0) +
            (if (intermediaryPartyName.asKnown().isPresent) 1 else 0) +
            (if (intermediaryPartySwiftCode.asKnown().isPresent) 1 else 0) +
            (if (originatorToBeneficiaryInstructionsLine1.asKnown().isPresent) 1 else 0) +
            (if (originatorToBeneficiaryInstructionsLine2.asKnown().isPresent) 1 else 0) +
            (if (originatorToBeneficiaryInstructionsLine3.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InternationalWireInfo &&
            accountNumber == other.accountNumber &&
            address == other.address &&
            bankName == other.bankName &&
            beneficiaryName == other.beneficiaryName &&
            swiftCode == other.swiftCode &&
            type == other.type &&
            branchCode == other.branchCode &&
            intermediaryPartyName == other.intermediaryPartyName &&
            intermediaryPartySwiftCode == other.intermediaryPartySwiftCode &&
            originatorToBeneficiaryInstructionsLine1 ==
                other.originatorToBeneficiaryInstructionsLine1 &&
            originatorToBeneficiaryInstructionsLine2 ==
                other.originatorToBeneficiaryInstructionsLine2 &&
            originatorToBeneficiaryInstructionsLine3 ==
                other.originatorToBeneficiaryInstructionsLine3 &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            accountNumber,
            address,
            bankName,
            beneficiaryName,
            swiftCode,
            type,
            branchCode,
            intermediaryPartyName,
            intermediaryPartySwiftCode,
            originatorToBeneficiaryInstructionsLine1,
            originatorToBeneficiaryInstructionsLine2,
            originatorToBeneficiaryInstructionsLine3,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InternationalWireInfo{accountNumber=$accountNumber, address=$address, bankName=$bankName, beneficiaryName=$beneficiaryName, swiftCode=$swiftCode, type=$type, branchCode=$branchCode, intermediaryPartyName=$intermediaryPartyName, intermediaryPartySwiftCode=$intermediaryPartySwiftCode, originatorToBeneficiaryInstructionsLine1=$originatorToBeneficiaryInstructionsLine1, originatorToBeneficiaryInstructionsLine2=$originatorToBeneficiaryInstructionsLine2, originatorToBeneficiaryInstructionsLine3=$originatorToBeneficiaryInstructionsLine3, additionalProperties=$additionalProperties}"
}
