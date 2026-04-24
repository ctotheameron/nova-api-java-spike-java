// File generated from our OpenAPI spec by Stainless.

package com.nova_api_java_spike.api.models.distributions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.nova_api_java_spike.api.core.BaseDeserializer
import com.nova_api_java_spike.api.core.BaseSerializer
import com.nova_api_java_spike.api.core.ExcludeMissing
import com.nova_api_java_spike.api.core.JsonField
import com.nova_api_java_spike.api.core.JsonMissing
import com.nova_api_java_spike.api.core.JsonValue
import com.nova_api_java_spike.api.core.Params
import com.nova_api_java_spike.api.core.allMaxBy
import com.nova_api_java_spike.api.core.checkKnown
import com.nova_api_java_spike.api.core.checkRequired
import com.nova_api_java_spike.api.core.getOrThrow
import com.nova_api_java_spike.api.core.http.Headers
import com.nova_api_java_spike.api.core.http.QueryParams
import com.nova_api_java_spike.api.core.toImmutable
import com.nova_api_java_spike.api.errors.NovaApiJavaSpikeInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Stages a new fund distribution with one or more payments. Each payment targets a single receiving
 * entity (either referenced by id or created inline) and one or more people associated with that
 * entity.
 */
class DistributionCreateParams
private constructor(
    private val xOrganizationId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** UUID of the organization the request acts on */
    fun xOrganizationId(): String = xOrganizationId

    /**
     * Distribution date
     *
     * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun distributionDate(): OffsetDateTime = body.distributionDate()

    /**
     * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * List of payments
     *
     * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun payments(): List<Payment> = body.payments()

    /**
     * UUID of the vehicle this distribution pays from
     *
     * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun vehicleId(): String = body.vehicleId()

    /**
     * Returns the raw JSON value of [distributionDate].
     *
     * Unlike [distributionDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _distributionDate(): JsonField<OffsetDateTime> = body._distributionDate()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [payments].
     *
     * Unlike [payments], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _payments(): JsonField<List<Payment>> = body._payments()

    /**
     * Returns the raw JSON value of [vehicleId].
     *
     * Unlike [vehicleId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _vehicleId(): JsonField<String> = body._vehicleId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DistributionCreateParams].
         *
         * The following fields are required:
         * ```java
         * .xOrganizationId()
         * .distributionDate()
         * .name()
         * .payments()
         * .vehicleId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DistributionCreateParams]. */
    class Builder internal constructor() {

        private var xOrganizationId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(distributionCreateParams: DistributionCreateParams) = apply {
            xOrganizationId = distributionCreateParams.xOrganizationId
            body = distributionCreateParams.body.toBuilder()
            additionalHeaders = distributionCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = distributionCreateParams.additionalQueryParams.toBuilder()
        }

        /** UUID of the organization the request acts on */
        fun xOrganizationId(xOrganizationId: String) = apply {
            this.xOrganizationId = xOrganizationId
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [distributionDate]
         * - [name]
         * - [payments]
         * - [vehicleId]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Distribution date */
        fun distributionDate(distributionDate: OffsetDateTime) = apply {
            body.distributionDate(distributionDate)
        }

        /**
         * Sets [Builder.distributionDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.distributionDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun distributionDate(distributionDate: JsonField<OffsetDateTime>) = apply {
            body.distributionDate(distributionDate)
        }

        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** List of payments */
        fun payments(payments: List<Payment>) = apply { body.payments(payments) }

        /**
         * Sets [Builder.payments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payments] with a well-typed `List<Payment>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun payments(payments: JsonField<List<Payment>>) = apply { body.payments(payments) }

        /**
         * Adds a single [Payment] to [payments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPayment(payment: Payment) = apply { body.addPayment(payment) }

        /** UUID of the vehicle this distribution pays from */
        fun vehicleId(vehicleId: String) = apply { body.vehicleId(vehicleId) }

        /**
         * Sets [Builder.vehicleId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vehicleId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun vehicleId(vehicleId: JsonField<String>) = apply { body.vehicleId(vehicleId) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [DistributionCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .xOrganizationId()
         * .distributionDate()
         * .name()
         * .payments()
         * .vehicleId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DistributionCreateParams =
            DistributionCreateParams(
                checkRequired("xOrganizationId", xOrganizationId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                put("X-Organization-Id", xOrganizationId)
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val distributionDate: JsonField<OffsetDateTime>,
        private val name: JsonField<String>,
        private val payments: JsonField<List<Payment>>,
        private val vehicleId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("distribution_date")
            @ExcludeMissing
            distributionDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("payments")
            @ExcludeMissing
            payments: JsonField<List<Payment>> = JsonMissing.of(),
            @JsonProperty("vehicle_id")
            @ExcludeMissing
            vehicleId: JsonField<String> = JsonMissing.of(),
        ) : this(distributionDate, name, payments, vehicleId, mutableMapOf())

        /**
         * Distribution date
         *
         * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun distributionDate(): OffsetDateTime = distributionDate.getRequired("distribution_date")

        /**
         * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * List of payments
         *
         * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun payments(): List<Payment> = payments.getRequired("payments")

        /**
         * UUID of the vehicle this distribution pays from
         *
         * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun vehicleId(): String = vehicleId.getRequired("vehicle_id")

        /**
         * Returns the raw JSON value of [distributionDate].
         *
         * Unlike [distributionDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("distribution_date")
        @ExcludeMissing
        fun _distributionDate(): JsonField<OffsetDateTime> = distributionDate

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [payments].
         *
         * Unlike [payments], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("payments")
        @ExcludeMissing
        fun _payments(): JsonField<List<Payment>> = payments

        /**
         * Returns the raw JSON value of [vehicleId].
         *
         * Unlike [vehicleId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("vehicle_id") @ExcludeMissing fun _vehicleId(): JsonField<String> = vehicleId

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .distributionDate()
             * .name()
             * .payments()
             * .vehicleId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var distributionDate: JsonField<OffsetDateTime>? = null
            private var name: JsonField<String>? = null
            private var payments: JsonField<MutableList<Payment>>? = null
            private var vehicleId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                distributionDate = body.distributionDate
                name = body.name
                payments = body.payments.map { it.toMutableList() }
                vehicleId = body.vehicleId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Distribution date */
            fun distributionDate(distributionDate: OffsetDateTime) =
                distributionDate(JsonField.of(distributionDate))

            /**
             * Sets [Builder.distributionDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.distributionDate] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun distributionDate(distributionDate: JsonField<OffsetDateTime>) = apply {
                this.distributionDate = distributionDate
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** List of payments */
            fun payments(payments: List<Payment>) = payments(JsonField.of(payments))

            /**
             * Sets [Builder.payments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.payments] with a well-typed `List<Payment>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun payments(payments: JsonField<List<Payment>>) = apply {
                this.payments = payments.map { it.toMutableList() }
            }

            /**
             * Adds a single [Payment] to [payments].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPayment(payment: Payment) = apply {
                payments =
                    (payments ?: JsonField.of(mutableListOf())).also {
                        checkKnown("payments", it).add(payment)
                    }
            }

            /** UUID of the vehicle this distribution pays from */
            fun vehicleId(vehicleId: String) = vehicleId(JsonField.of(vehicleId))

            /**
             * Sets [Builder.vehicleId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vehicleId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun vehicleId(vehicleId: JsonField<String>) = apply { this.vehicleId = vehicleId }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .distributionDate()
             * .name()
             * .payments()
             * .vehicleId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("distributionDate", distributionDate),
                    checkRequired("name", name),
                    checkRequired("payments", payments).map { it.toImmutable() },
                    checkRequired("vehicleId", vehicleId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            distributionDate()
            name()
            payments().forEach { it.validate() }
            vehicleId()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (distributionDate.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (payments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (vehicleId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                distributionDate == other.distributionDate &&
                name == other.name &&
                payments == other.payments &&
                vehicleId == other.vehicleId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(distributionDate, name, payments, vehicleId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{distributionDate=$distributionDate, name=$name, payments=$payments, vehicleId=$vehicleId, additionalProperties=$additionalProperties}"
    }

    class Payment
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val amount: JsonField<Long>,
        private val contacts: JsonField<List<Contact>>,
        private val currency: JsonField<Currency>,
        private val entity: JsonField<Entity>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("contacts")
            @ExcludeMissing
            contacts: JsonField<List<Contact>> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("entity") @ExcludeMissing entity: JsonField<Entity> = JsonMissing.of(),
        ) : this(amount, contacts, currency, entity, mutableMapOf())

        /**
         * Amount in the smallest currency unit
         *
         * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * Each contact is linked to the entity (created if provided inline) and, when `notify` is
         * true, emailed when the payment is published.
         *
         * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun contacts(): List<Contact> = contacts.getRequired("contacts")

        /**
         * ISO 4217 currency code (USD-only currently)
         *
         * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun currency(): Currency = currency.getRequired("currency")

        /**
         * UUID of an existing entity
         *
         * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun entity(): Entity = entity.getRequired("entity")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * Returns the raw JSON value of [contacts].
         *
         * Unlike [contacts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("contacts")
        @ExcludeMissing
        fun _contacts(): JsonField<List<Contact>> = contacts

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

        /**
         * Returns the raw JSON value of [entity].
         *
         * Unlike [entity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entity") @ExcludeMissing fun _entity(): JsonField<Entity> = entity

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
             * Returns a mutable builder for constructing an instance of [Payment].
             *
             * The following fields are required:
             * ```java
             * .amount()
             * .contacts()
             * .currency()
             * .entity()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Payment]. */
        class Builder internal constructor() {

            private var amount: JsonField<Long>? = null
            private var contacts: JsonField<MutableList<Contact>>? = null
            private var currency: JsonField<Currency>? = null
            private var entity: JsonField<Entity>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(payment: Payment) = apply {
                amount = payment.amount
                contacts = payment.contacts.map { it.toMutableList() }
                currency = payment.currency
                entity = payment.entity
                additionalProperties = payment.additionalProperties.toMutableMap()
            }

            /** Amount in the smallest currency unit */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /**
             * Each contact is linked to the entity (created if provided inline) and, when `notify`
             * is true, emailed when the payment is published.
             */
            fun contacts(contacts: List<Contact>) = contacts(JsonField.of(contacts))

            /**
             * Sets [Builder.contacts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contacts] with a well-typed `List<Contact>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contacts(contacts: JsonField<List<Contact>>) = apply {
                this.contacts = contacts.map { it.toMutableList() }
            }

            /**
             * Adds a single [Contact] to [contacts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addContact(contact: Contact) = apply {
                contacts =
                    (contacts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("contacts", it).add(contact)
                    }
            }

            /** ISO 4217 currency code (USD-only currently) */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [Currency] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            /** UUID of an existing entity */
            fun entity(entity: Entity) = entity(JsonField.of(entity))

            /**
             * Sets [Builder.entity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entity] with a well-typed [Entity] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entity(entity: JsonField<Entity>) = apply { this.entity = entity }

            /** Alias for calling [entity] with `Entity.ofString(string)`. */
            fun entity(string: String) = entity(Entity.ofString(string))

            /** Alias for calling [entity] with `Entity.ofNewEntityInput(newEntityInput)`. */
            fun entity(newEntityInput: Entity.NewEntityInput) =
                entity(Entity.ofNewEntityInput(newEntityInput))

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
             * Returns an immutable instance of [Payment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .amount()
             * .contacts()
             * .currency()
             * .entity()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Payment =
                Payment(
                    checkRequired("amount", amount),
                    checkRequired("contacts", contacts).map { it.toImmutable() },
                    checkRequired("currency", currency),
                    checkRequired("entity", entity),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Payment = apply {
            if (validated) {
                return@apply
            }

            amount()
            contacts().forEach { it.validate() }
            currency().validate()
            entity().validate()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (amount.asKnown().isPresent) 1 else 0) +
                (contacts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (currency.asKnown().getOrNull()?.validity() ?: 0) +
                (entity.asKnown().getOrNull()?.validity() ?: 0)

        class Contact
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val notify: JsonField<Boolean>,
            private val person: JsonField<Person>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("notify")
                @ExcludeMissing
                notify: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("person") @ExcludeMissing person: JsonField<Person> = JsonMissing.of(),
            ) : this(notify, person, mutableMapOf())

            /**
             * Whether the person was notified
             *
             * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun notify(): Boolean = notify.getRequired("notify")

            /**
             * UUID of an existing person
             *
             * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
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
                 * Returns a mutable builder for constructing an instance of [Contact].
                 *
                 * The following fields are required:
                 * ```java
                 * .notify()
                 * .person()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Contact]. */
            class Builder internal constructor() {

                private var notify: JsonField<Boolean>? = null
                private var person: JsonField<Person>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(contact: Contact) = apply {
                    notify = contact.notify
                    person = contact.person
                    additionalProperties = contact.additionalProperties.toMutableMap()
                }

                /** Whether the person was notified */
                fun notify(notify: Boolean) = notify(JsonField.of(notify))

                /**
                 * Sets [Builder.notify] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.notify] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun notify(notify: JsonField<Boolean>) = apply { this.notify = notify }

                /** UUID of an existing person */
                fun person(person: Person) = person(JsonField.of(person))

                /**
                 * Sets [Builder.person] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.person] with a well-typed [Person] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun person(person: JsonField<Person>) = apply { this.person = person }

                /** Alias for calling [person] with `Person.ofString(string)`. */
                fun person(string: String) = person(Person.ofString(string))

                /** Alias for calling [person] with `Person.ofNewPersonInput(newPersonInput)`. */
                fun person(newPersonInput: Person.NewPersonInput) =
                    person(Person.ofNewPersonInput(newPersonInput))

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Contact].
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
                fun build(): Contact =
                    Contact(
                        checkRequired("notify", notify),
                        checkRequired("person", person),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Contact = apply {
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
                } catch (e: NovaApiJavaSpikeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (notify.asKnown().isPresent) 1 else 0) +
                    (person.asKnown().getOrNull()?.validity() ?: 0)

            /** UUID of an existing person */
            @JsonDeserialize(using = Person.Deserializer::class)
            @JsonSerialize(using = Person.Serializer::class)
            class Person
            private constructor(
                private val string: String? = null,
                private val newPersonInput: NewPersonInput? = null,
                private val _json: JsonValue? = null,
            ) {

                /** UUID of an existing person */
                fun string(): Optional<String> = Optional.ofNullable(string)

                fun newPersonInput(): Optional<NewPersonInput> = Optional.ofNullable(newPersonInput)

                fun isString(): Boolean = string != null

                fun isNewPersonInput(): Boolean = newPersonInput != null

                /** UUID of an existing person */
                fun asString(): String = string.getOrThrow("string")

                fun asNewPersonInput(): NewPersonInput = newPersonInput.getOrThrow("newPersonInput")

                fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                fun <T> accept(visitor: Visitor<T>): T =
                    when {
                        string != null -> visitor.visitString(string)
                        newPersonInput != null -> visitor.visitNewPersonInput(newPersonInput)
                        else -> visitor.unknown(_json)
                    }

                private var validated: Boolean = false

                fun validate(): Person = apply {
                    if (validated) {
                        return@apply
                    }

                    accept(
                        object : Visitor<Unit> {
                            override fun visitString(string: String) {}

                            override fun visitNewPersonInput(newPersonInput: NewPersonInput) {
                                newPersonInput.validate()
                            }
                        }
                    )
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    accept(
                        object : Visitor<Int> {
                            override fun visitString(string: String) = 1

                            override fun visitNewPersonInput(newPersonInput: NewPersonInput) =
                                newPersonInput.validity()

                            override fun unknown(json: JsonValue?) = 0
                        }
                    )

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Person &&
                        string == other.string &&
                        newPersonInput == other.newPersonInput
                }

                override fun hashCode(): Int = Objects.hash(string, newPersonInput)

                override fun toString(): String =
                    when {
                        string != null -> "Person{string=$string}"
                        newPersonInput != null -> "Person{newPersonInput=$newPersonInput}"
                        _json != null -> "Person{_unknown=$_json}"
                        else -> throw IllegalStateException("Invalid Person")
                    }

                companion object {

                    /** UUID of an existing person */
                    @JvmStatic fun ofString(string: String) = Person(string = string)

                    @JvmStatic
                    fun ofNewPersonInput(newPersonInput: NewPersonInput) =
                        Person(newPersonInput = newPersonInput)
                }

                /**
                 * An interface that defines how to map each variant of [Person] to a value of type
                 * [T].
                 */
                interface Visitor<out T> {

                    /** UUID of an existing person */
                    fun visitString(string: String): T

                    fun visitNewPersonInput(newPersonInput: NewPersonInput): T

                    /**
                     * Maps an unknown variant of [Person] to a value of type [T].
                     *
                     * An instance of [Person] can contain an unknown variant if it was deserialized
                     * from data that doesn't match any known variant. For example, if the SDK is on
                     * an older version than the API, then the API may respond with new variants
                     * that the SDK is unaware of.
                     *
                     * @throws NovaApiJavaSpikeInvalidDataException in the default implementation.
                     */
                    fun unknown(json: JsonValue?): T {
                        throw NovaApiJavaSpikeInvalidDataException("Unknown Person: $json")
                    }
                }

                internal class Deserializer : BaseDeserializer<Person>(Person::class) {

                    override fun ObjectCodec.deserialize(node: JsonNode): Person {
                        val json = JsonValue.fromJsonNode(node)

                        val bestMatches =
                            sequenceOf(
                                    tryDeserialize(node, jacksonTypeRef<NewPersonInput>())?.let {
                                        Person(newPersonInput = it, _json = json)
                                    },
                                    tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                        Person(string = it, _json = json)
                                    },
                                )
                                .filterNotNull()
                                .allMaxBy { it.validity() }
                                .toList()
                        return when (bestMatches.size) {
                            // This can happen if what we're deserializing is completely
                            // incompatible with all the possible variants (e.g. deserializing from
                            // boolean).
                            0 -> Person(_json = json)
                            1 -> bestMatches.single()
                            // If there's more than one match with the highest validity, then use
                            // the first completely valid match, or simply the first match if none
                            // are completely valid.
                            else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                        }
                    }
                }

                internal class Serializer : BaseSerializer<Person>(Person::class) {

                    override fun serialize(
                        value: Person,
                        generator: JsonGenerator,
                        provider: SerializerProvider,
                    ) {
                        when {
                            value.string != null -> generator.writeObject(value.string)
                            value.newPersonInput != null ->
                                generator.writeObject(value.newPersonInput)
                            value._json != null -> generator.writeObject(value._json)
                            else -> throw IllegalStateException("Invalid Person")
                        }
                    }
                }

                class NewPersonInput
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val email: JsonField<String>,
                    private val name: JsonField<String>,
                    private val externalReferences: JsonField<List<String>>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("email")
                        @ExcludeMissing
                        email: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("name")
                        @ExcludeMissing
                        name: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("external_references")
                        @ExcludeMissing
                        externalReferences: JsonField<List<String>> = JsonMissing.of(),
                    ) : this(email, name, externalReferences, mutableMapOf())

                    /**
                     * Email address used for notifications and account linkage
                     *
                     * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an
                     *   unexpected type or is unexpectedly missing or null (e.g. if the server
                     *   responded with an unexpected value).
                     */
                    fun email(): String = email.getRequired("email")

                    /**
                     * Full legal name
                     *
                     * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an
                     *   unexpected type or is unexpectedly missing or null (e.g. if the server
                     *   responded with an unexpected value).
                     */
                    fun name(): String = name.getRequired("name")

                    /**
                     * Your own identifiers for this person
                     *
                     * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an
                     *   unexpected type (e.g. if the server responded with an unexpected value).
                     */
                    fun externalReferences(): Optional<List<String>> =
                        externalReferences.getOptional("external_references")

                    /**
                     * Returns the raw JSON value of [email].
                     *
                     * Unlike [email], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

                    /**
                     * Returns the raw JSON value of [name].
                     *
                     * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                    /**
                     * Returns the raw JSON value of [externalReferences].
                     *
                     * Unlike [externalReferences], this method doesn't throw if the JSON field has
                     * an unexpected type.
                     */
                    @JsonProperty("external_references")
                    @ExcludeMissing
                    fun _externalReferences(): JsonField<List<String>> = externalReferences

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
                         * Returns a mutable builder for constructing an instance of
                         * [NewPersonInput].
                         *
                         * The following fields are required:
                         * ```java
                         * .email()
                         * .name()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [NewPersonInput]. */
                    class Builder internal constructor() {

                        private var email: JsonField<String>? = null
                        private var name: JsonField<String>? = null
                        private var externalReferences: JsonField<MutableList<String>>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(newPersonInput: NewPersonInput) = apply {
                            email = newPersonInput.email
                            name = newPersonInput.name
                            externalReferences =
                                newPersonInput.externalReferences.map { it.toMutableList() }
                            additionalProperties =
                                newPersonInput.additionalProperties.toMutableMap()
                        }

                        /** Email address used for notifications and account linkage */
                        fun email(email: String) = email(JsonField.of(email))

                        /**
                         * Sets [Builder.email] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.email] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun email(email: JsonField<String>) = apply { this.email = email }

                        /** Full legal name */
                        fun name(name: String) = name(JsonField.of(name))

                        /**
                         * Sets [Builder.name] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.name] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun name(name: JsonField<String>) = apply { this.name = name }

                        /** Your own identifiers for this person */
                        fun externalReferences(externalReferences: List<String>) =
                            externalReferences(JsonField.of(externalReferences))

                        /**
                         * Sets [Builder.externalReferences] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.externalReferences] with a well-typed
                         * `List<String>` value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun externalReferences(externalReferences: JsonField<List<String>>) =
                            apply {
                                this.externalReferences =
                                    externalReferences.map { it.toMutableList() }
                            }

                        /**
                         * Adds a single [String] to [externalReferences].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addExternalReference(externalReference: String) = apply {
                            externalReferences =
                                (externalReferences ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("externalReferences", it).add(externalReference)
                                }
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [NewPersonInput].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .email()
                         * .name()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): NewPersonInput =
                            NewPersonInput(
                                checkRequired("email", email),
                                checkRequired("name", name),
                                (externalReferences ?: JsonMissing.of()).map { it.toImmutable() },
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): NewPersonInput = apply {
                        if (validated) {
                            return@apply
                        }

                        email()
                        name()
                        externalReferences()
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
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int =
                        (if (email.asKnown().isPresent) 1 else 0) +
                            (if (name.asKnown().isPresent) 1 else 0) +
                            (externalReferences.asKnown().getOrNull()?.size ?: 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is NewPersonInput &&
                            email == other.email &&
                            name == other.name &&
                            externalReferences == other.externalReferences &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(email, name, externalReferences, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "NewPersonInput{email=$email, name=$name, externalReferences=$externalReferences, additionalProperties=$additionalProperties}"
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Contact &&
                    notify == other.notify &&
                    person == other.person &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(notify, person, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Contact{notify=$notify, person=$person, additionalProperties=$additionalProperties}"
        }

        /** UUID of an existing entity */
        @JsonDeserialize(using = Entity.Deserializer::class)
        @JsonSerialize(using = Entity.Serializer::class)
        class Entity
        private constructor(
            private val string: String? = null,
            private val newEntityInput: NewEntityInput? = null,
            private val _json: JsonValue? = null,
        ) {

            /** UUID of an existing entity */
            fun string(): Optional<String> = Optional.ofNullable(string)

            fun newEntityInput(): Optional<NewEntityInput> = Optional.ofNullable(newEntityInput)

            fun isString(): Boolean = string != null

            fun isNewEntityInput(): Boolean = newEntityInput != null

            /** UUID of an existing entity */
            fun asString(): String = string.getOrThrow("string")

            fun asNewEntityInput(): NewEntityInput = newEntityInput.getOrThrow("newEntityInput")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    string != null -> visitor.visitString(string)
                    newEntityInput != null -> visitor.visitNewEntityInput(newEntityInput)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Entity = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitString(string: String) {}

                        override fun visitNewEntityInput(newEntityInput: NewEntityInput) {
                            newEntityInput.validate()
                        }
                    }
                )
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                accept(
                    object : Visitor<Int> {
                        override fun visitString(string: String) = 1

                        override fun visitNewEntityInput(newEntityInput: NewEntityInput) =
                            newEntityInput.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Entity &&
                    string == other.string &&
                    newEntityInput == other.newEntityInput
            }

            override fun hashCode(): Int = Objects.hash(string, newEntityInput)

            override fun toString(): String =
                when {
                    string != null -> "Entity{string=$string}"
                    newEntityInput != null -> "Entity{newEntityInput=$newEntityInput}"
                    _json != null -> "Entity{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Entity")
                }

            companion object {

                /** UUID of an existing entity */
                @JvmStatic fun ofString(string: String) = Entity(string = string)

                @JvmStatic
                fun ofNewEntityInput(newEntityInput: NewEntityInput) =
                    Entity(newEntityInput = newEntityInput)
            }

            /**
             * An interface that defines how to map each variant of [Entity] to a value of type [T].
             */
            interface Visitor<out T> {

                /** UUID of an existing entity */
                fun visitString(string: String): T

                fun visitNewEntityInput(newEntityInput: NewEntityInput): T

                /**
                 * Maps an unknown variant of [Entity] to a value of type [T].
                 *
                 * An instance of [Entity] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws NovaApiJavaSpikeInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw NovaApiJavaSpikeInvalidDataException("Unknown Entity: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Entity>(Entity::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Entity {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<NewEntityInput>())?.let {
                                    Entity(newEntityInput = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                    Entity(string = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> Entity(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<Entity>(Entity::class) {

                override fun serialize(
                    value: Entity,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.string != null -> generator.writeObject(value.string)
                        value.newEntityInput != null -> generator.writeObject(value.newEntityInput)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Entity")
                    }
                }
            }

            class NewEntityInput
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val name: JsonField<String>,
                private val type: JsonField<EntityType>,
                private val externalReferences: JsonField<List<String>>,
                private val wireInfo: JsonField<WireInfo>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("type")
                    @ExcludeMissing
                    type: JsonField<EntityType> = JsonMissing.of(),
                    @JsonProperty("external_references")
                    @ExcludeMissing
                    externalReferences: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("wire_info")
                    @ExcludeMissing
                    wireInfo: JsonField<WireInfo> = JsonMissing.of(),
                ) : this(name, type, externalReferences, wireInfo, mutableMapOf())

                /**
                 * Legal name of the entity
                 *
                 * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun type(): EntityType = type.getRequired("type")

                /**
                 * Your own identifiers for this entity
                 *
                 * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun externalReferences(): Optional<List<String>> =
                    externalReferences.getOptional("external_references")

                /**
                 * US ACH payment
                 *
                 * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun wireInfo(): Optional<WireInfo> = wireInfo.getOptional("wire_info")

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [type].
                 *
                 * Unlike [type], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<EntityType> = type

                /**
                 * Returns the raw JSON value of [externalReferences].
                 *
                 * Unlike [externalReferences], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("external_references")
                @ExcludeMissing
                fun _externalReferences(): JsonField<List<String>> = externalReferences

                /**
                 * Returns the raw JSON value of [wireInfo].
                 *
                 * Unlike [wireInfo], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("wire_info")
                @ExcludeMissing
                fun _wireInfo(): JsonField<WireInfo> = wireInfo

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
                     * Returns a mutable builder for constructing an instance of [NewEntityInput].
                     *
                     * The following fields are required:
                     * ```java
                     * .name()
                     * .type()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [NewEntityInput]. */
                class Builder internal constructor() {

                    private var name: JsonField<String>? = null
                    private var type: JsonField<EntityType>? = null
                    private var externalReferences: JsonField<MutableList<String>>? = null
                    private var wireInfo: JsonField<WireInfo> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(newEntityInput: NewEntityInput) = apply {
                        name = newEntityInput.name
                        type = newEntityInput.type
                        externalReferences =
                            newEntityInput.externalReferences.map { it.toMutableList() }
                        wireInfo = newEntityInput.wireInfo
                        additionalProperties = newEntityInput.additionalProperties.toMutableMap()
                    }

                    /** Legal name of the entity */
                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun type(type: EntityType) = type(JsonField.of(type))

                    /**
                     * Sets [Builder.type] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.type] with a well-typed [EntityType] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun type(type: JsonField<EntityType>) = apply { this.type = type }

                    /** Your own identifiers for this entity */
                    fun externalReferences(externalReferences: List<String>) =
                        externalReferences(JsonField.of(externalReferences))

                    /**
                     * Sets [Builder.externalReferences] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.externalReferences] with a well-typed
                     * `List<String>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
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

                    /** US ACH payment */
                    fun wireInfo(wireInfo: WireInfo) = wireInfo(JsonField.of(wireInfo))

                    /**
                     * Sets [Builder.wireInfo] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.wireInfo] with a well-typed [WireInfo] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun wireInfo(wireInfo: JsonField<WireInfo>) = apply { this.wireInfo = wireInfo }

                    /** Alias for calling [wireInfo] with `WireInfo.ofAch(ach)`. */
                    fun wireInfo(ach: WireInfo.Ach) = wireInfo(WireInfo.ofAch(ach))

                    /**
                     * Alias for calling [wireInfo] with `WireInfo.ofDomesticWire(domesticWire)`.
                     */
                    fun wireInfo(domesticWire: WireInfo.DomesticWire) =
                        wireInfo(WireInfo.ofDomesticWire(domesticWire))

                    /**
                     * Alias for calling [wireInfo] with
                     * `WireInfo.ofInternationalWire(internationalWire)`.
                     */
                    fun wireInfo(internationalWire: WireInfo.InternationalWire) =
                        wireInfo(WireInfo.ofInternationalWire(internationalWire))

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [NewEntityInput].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .name()
                     * .type()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): NewEntityInput =
                        NewEntityInput(
                            checkRequired("name", name),
                            checkRequired("type", type),
                            (externalReferences ?: JsonMissing.of()).map { it.toImmutable() },
                            wireInfo,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): NewEntityInput = apply {
                    if (validated) {
                        return@apply
                    }

                    name()
                    type().validate()
                    externalReferences()
                    wireInfo().ifPresent { it.validate() }
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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (name.asKnown().isPresent) 1 else 0) +
                        (type.asKnown().getOrNull()?.validity() ?: 0) +
                        (externalReferences.asKnown().getOrNull()?.size ?: 0) +
                        (wireInfo.asKnown().getOrNull()?.validity() ?: 0)

                /** US ACH payment */
                @JsonDeserialize(using = WireInfo.Deserializer::class)
                @JsonSerialize(using = WireInfo.Serializer::class)
                class WireInfo
                private constructor(
                    private val ach: Ach? = null,
                    private val domesticWire: DomesticWire? = null,
                    private val internationalWire: InternationalWire? = null,
                    private val _json: JsonValue? = null,
                ) {

                    /** US ACH payment */
                    fun ach(): Optional<Ach> = Optional.ofNullable(ach)

                    /** US domestic wire */
                    fun domesticWire(): Optional<DomesticWire> = Optional.ofNullable(domesticWire)

                    /** International wire */
                    fun internationalWire(): Optional<InternationalWire> =
                        Optional.ofNullable(internationalWire)

                    fun isAch(): Boolean = ach != null

                    fun isDomesticWire(): Boolean = domesticWire != null

                    fun isInternationalWire(): Boolean = internationalWire != null

                    /** US ACH payment */
                    fun asAch(): Ach = ach.getOrThrow("ach")

                    /** US domestic wire */
                    fun asDomesticWire(): DomesticWire = domesticWire.getOrThrow("domesticWire")

                    /** International wire */
                    fun asInternationalWire(): InternationalWire =
                        internationalWire.getOrThrow("internationalWire")

                    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

                    fun <T> accept(visitor: Visitor<T>): T =
                        when {
                            ach != null -> visitor.visitAch(ach)
                            domesticWire != null -> visitor.visitDomesticWire(domesticWire)
                            internationalWire != null ->
                                visitor.visitInternationalWire(internationalWire)
                            else -> visitor.unknown(_json)
                        }

                    private var validated: Boolean = false

                    fun validate(): WireInfo = apply {
                        if (validated) {
                            return@apply
                        }

                        accept(
                            object : Visitor<Unit> {
                                override fun visitAch(ach: Ach) {
                                    ach.validate()
                                }

                                override fun visitDomesticWire(domesticWire: DomesticWire) {
                                    domesticWire.validate()
                                }

                                override fun visitInternationalWire(
                                    internationalWire: InternationalWire
                                ) {
                                    internationalWire.validate()
                                }
                            }
                        )
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
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int =
                        accept(
                            object : Visitor<Int> {
                                override fun visitAch(ach: Ach) = ach.validity()

                                override fun visitDomesticWire(domesticWire: DomesticWire) =
                                    domesticWire.validity()

                                override fun visitInternationalWire(
                                    internationalWire: InternationalWire
                                ) = internationalWire.validity()

                                override fun unknown(json: JsonValue?) = 0
                            }
                        )

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is WireInfo &&
                            ach == other.ach &&
                            domesticWire == other.domesticWire &&
                            internationalWire == other.internationalWire
                    }

                    override fun hashCode(): Int =
                        Objects.hash(ach, domesticWire, internationalWire)

                    override fun toString(): String =
                        when {
                            ach != null -> "WireInfo{ach=$ach}"
                            domesticWire != null -> "WireInfo{domesticWire=$domesticWire}"
                            internationalWire != null ->
                                "WireInfo{internationalWire=$internationalWire}"
                            _json != null -> "WireInfo{_unknown=$_json}"
                            else -> throw IllegalStateException("Invalid WireInfo")
                        }

                    companion object {

                        /** US ACH payment */
                        @JvmStatic fun ofAch(ach: Ach) = WireInfo(ach = ach)

                        /** US domestic wire */
                        @JvmStatic
                        fun ofDomesticWire(domesticWire: DomesticWire) =
                            WireInfo(domesticWire = domesticWire)

                        /** International wire */
                        @JvmStatic
                        fun ofInternationalWire(internationalWire: InternationalWire) =
                            WireInfo(internationalWire = internationalWire)
                    }

                    /**
                     * An interface that defines how to map each variant of [WireInfo] to a value of
                     * type [T].
                     */
                    interface Visitor<out T> {

                        /** US ACH payment */
                        fun visitAch(ach: Ach): T

                        /** US domestic wire */
                        fun visitDomesticWire(domesticWire: DomesticWire): T

                        /** International wire */
                        fun visitInternationalWire(internationalWire: InternationalWire): T

                        /**
                         * Maps an unknown variant of [WireInfo] to a value of type [T].
                         *
                         * An instance of [WireInfo] can contain an unknown variant if it was
                         * deserialized from data that doesn't match any known variant. For example,
                         * if the SDK is on an older version than the API, then the API may respond
                         * with new variants that the SDK is unaware of.
                         *
                         * @throws NovaApiJavaSpikeInvalidDataException in the default
                         *   implementation.
                         */
                        fun unknown(json: JsonValue?): T {
                            throw NovaApiJavaSpikeInvalidDataException("Unknown WireInfo: $json")
                        }
                    }

                    internal class Deserializer : BaseDeserializer<WireInfo>(WireInfo::class) {

                        override fun ObjectCodec.deserialize(node: JsonNode): WireInfo {
                            val json = JsonValue.fromJsonNode(node)
                            val type =
                                json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

                            when (type) {
                                "ach" -> {
                                    return tryDeserialize(node, jacksonTypeRef<Ach>())?.let {
                                        WireInfo(ach = it, _json = json)
                                    } ?: WireInfo(_json = json)
                                }
                                "domestic_wire" -> {
                                    return tryDeserialize(node, jacksonTypeRef<DomesticWire>())
                                        ?.let { WireInfo(domesticWire = it, _json = json) }
                                        ?: WireInfo(_json = json)
                                }
                                "international_wire" -> {
                                    return tryDeserialize(node, jacksonTypeRef<InternationalWire>())
                                        ?.let { WireInfo(internationalWire = it, _json = json) }
                                        ?: WireInfo(_json = json)
                                }
                            }

                            return WireInfo(_json = json)
                        }
                    }

                    internal class Serializer : BaseSerializer<WireInfo>(WireInfo::class) {

                        override fun serialize(
                            value: WireInfo,
                            generator: JsonGenerator,
                            provider: SerializerProvider,
                        ) {
                            when {
                                value.ach != null -> generator.writeObject(value.ach)
                                value.domesticWire != null ->
                                    generator.writeObject(value.domesticWire)
                                value.internationalWire != null ->
                                    generator.writeObject(value.internationalWire)
                                value._json != null -> generator.writeObject(value._json)
                                else -> throw IllegalStateException("Invalid WireInfo")
                            }
                        }
                    }

                    /** US ACH payment */
                    class Ach
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val accountNumber: JsonField<String>,
                        private val bankName: JsonField<String>,
                        private val beneficiaryName: JsonField<String>,
                        private val routingNumber: JsonField<String>,
                        private val type: JsonValue,
                        private val branchCode: JsonField<String>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("account_number")
                            @ExcludeMissing
                            accountNumber: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("bank_name")
                            @ExcludeMissing
                            bankName: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("beneficiary_name")
                            @ExcludeMissing
                            beneficiaryName: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("routing_number")
                            @ExcludeMissing
                            routingNumber: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("type")
                            @ExcludeMissing
                            type: JsonValue = JsonMissing.of(),
                            @JsonProperty("branch_code")
                            @ExcludeMissing
                            branchCode: JsonField<String> = JsonMissing.of(),
                        ) : this(
                            accountNumber,
                            bankName,
                            beneficiaryName,
                            routingNumber,
                            type,
                            branchCode,
                            mutableMapOf(),
                        )

                        /**
                         * Bank account number
                         *
                         * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun accountNumber(): String = accountNumber.getRequired("account_number")

                        /**
                         * Name of the bank
                         *
                         * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun bankName(): String = bankName.getRequired("bank_name")

                        /**
                         * Name of the account holder, as registered with the bank
                         *
                         * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun beneficiaryName(): String =
                            beneficiaryName.getRequired("beneficiary_name")

                        /**
                         * ABA routing number
                         *
                         * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun routingNumber(): String = routingNumber.getRequired("routing_number")

                        /**
                         * Expected to always return the following:
                         * ```java
                         * JsonValue.from("ach")
                         * ```
                         *
                         * However, this method can be useful for debugging and logging (e.g. if the
                         * server responded with an unexpected value).
                         */
                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                        /**
                         * Bank branch code (e.g. sort code, IFSC, etc.)
                         *
                         * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun branchCode(): Optional<String> = branchCode.getOptional("branch_code")

                        /**
                         * Returns the raw JSON value of [accountNumber].
                         *
                         * Unlike [accountNumber], this method doesn't throw if the JSON field has
                         * an unexpected type.
                         */
                        @JsonProperty("account_number")
                        @ExcludeMissing
                        fun _accountNumber(): JsonField<String> = accountNumber

                        /**
                         * Returns the raw JSON value of [bankName].
                         *
                         * Unlike [bankName], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("bank_name")
                        @ExcludeMissing
                        fun _bankName(): JsonField<String> = bankName

                        /**
                         * Returns the raw JSON value of [beneficiaryName].
                         *
                         * Unlike [beneficiaryName], this method doesn't throw if the JSON field has
                         * an unexpected type.
                         */
                        @JsonProperty("beneficiary_name")
                        @ExcludeMissing
                        fun _beneficiaryName(): JsonField<String> = beneficiaryName

                        /**
                         * Returns the raw JSON value of [routingNumber].
                         *
                         * Unlike [routingNumber], this method doesn't throw if the JSON field has
                         * an unexpected type.
                         */
                        @JsonProperty("routing_number")
                        @ExcludeMissing
                        fun _routingNumber(): JsonField<String> = routingNumber

                        /**
                         * Returns the raw JSON value of [branchCode].
                         *
                         * Unlike [branchCode], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("branch_code")
                        @ExcludeMissing
                        fun _branchCode(): JsonField<String> = branchCode

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
                             * Returns a mutable builder for constructing an instance of [Ach].
                             *
                             * The following fields are required:
                             * ```java
                             * .accountNumber()
                             * .bankName()
                             * .beneficiaryName()
                             * .routingNumber()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [Ach]. */
                        class Builder internal constructor() {

                            private var accountNumber: JsonField<String>? = null
                            private var bankName: JsonField<String>? = null
                            private var beneficiaryName: JsonField<String>? = null
                            private var routingNumber: JsonField<String>? = null
                            private var type: JsonValue = JsonValue.from("ach")
                            private var branchCode: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(ach: Ach) = apply {
                                accountNumber = ach.accountNumber
                                bankName = ach.bankName
                                beneficiaryName = ach.beneficiaryName
                                routingNumber = ach.routingNumber
                                type = ach.type
                                branchCode = ach.branchCode
                                additionalProperties = ach.additionalProperties.toMutableMap()
                            }

                            /** Bank account number */
                            fun accountNumber(accountNumber: String) =
                                accountNumber(JsonField.of(accountNumber))

                            /**
                             * Sets [Builder.accountNumber] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.accountNumber] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun accountNumber(accountNumber: JsonField<String>) = apply {
                                this.accountNumber = accountNumber
                            }

                            /** Name of the bank */
                            fun bankName(bankName: String) = bankName(JsonField.of(bankName))

                            /**
                             * Sets [Builder.bankName] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.bankName] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun bankName(bankName: JsonField<String>) = apply {
                                this.bankName = bankName
                            }

                            /** Name of the account holder, as registered with the bank */
                            fun beneficiaryName(beneficiaryName: String) =
                                beneficiaryName(JsonField.of(beneficiaryName))

                            /**
                             * Sets [Builder.beneficiaryName] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.beneficiaryName] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun beneficiaryName(beneficiaryName: JsonField<String>) = apply {
                                this.beneficiaryName = beneficiaryName
                            }

                            /** ABA routing number */
                            fun routingNumber(routingNumber: String) =
                                routingNumber(JsonField.of(routingNumber))

                            /**
                             * Sets [Builder.routingNumber] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.routingNumber] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun routingNumber(routingNumber: JsonField<String>) = apply {
                                this.routingNumber = routingNumber
                            }

                            /**
                             * Sets the field to an arbitrary JSON value.
                             *
                             * It is usually unnecessary to call this method because the field
                             * defaults to the following:
                             * ```java
                             * JsonValue.from("ach")
                             * ```
                             *
                             * This method is primarily for setting the field to an undocumented or
                             * not yet supported value.
                             */
                            fun type(type: JsonValue) = apply { this.type = type }

                            /** Bank branch code (e.g. sort code, IFSC, etc.) */
                            fun branchCode(branchCode: String) =
                                branchCode(JsonField.of(branchCode))

                            /**
                             * Sets [Builder.branchCode] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.branchCode] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun branchCode(branchCode: JsonField<String>) = apply {
                                this.branchCode = branchCode
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [Ach].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .accountNumber()
                             * .bankName()
                             * .beneficiaryName()
                             * .routingNumber()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): Ach =
                                Ach(
                                    checkRequired("accountNumber", accountNumber),
                                    checkRequired("bankName", bankName),
                                    checkRequired("beneficiaryName", beneficiaryName),
                                    checkRequired("routingNumber", routingNumber),
                                    type,
                                    branchCode,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): Ach = apply {
                            if (validated) {
                                return@apply
                            }

                            accountNumber()
                            bankName()
                            beneficiaryName()
                            routingNumber()
                            _type().let {
                                if (it != JsonValue.from("ach")) {
                                    throw NovaApiJavaSpikeInvalidDataException(
                                        "'type' is invalid, received $it"
                                    )
                                }
                            }
                            branchCode()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            (if (accountNumber.asKnown().isPresent) 1 else 0) +
                                (if (bankName.asKnown().isPresent) 1 else 0) +
                                (if (beneficiaryName.asKnown().isPresent) 1 else 0) +
                                (if (routingNumber.asKnown().isPresent) 1 else 0) +
                                type.let { if (it == JsonValue.from("ach")) 1 else 0 } +
                                (if (branchCode.asKnown().isPresent) 1 else 0)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Ach &&
                                accountNumber == other.accountNumber &&
                                bankName == other.bankName &&
                                beneficiaryName == other.beneficiaryName &&
                                routingNumber == other.routingNumber &&
                                type == other.type &&
                                branchCode == other.branchCode &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(
                                accountNumber,
                                bankName,
                                beneficiaryName,
                                routingNumber,
                                type,
                                branchCode,
                                additionalProperties,
                            )
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Ach{accountNumber=$accountNumber, bankName=$bankName, beneficiaryName=$beneficiaryName, routingNumber=$routingNumber, type=$type, branchCode=$branchCode, additionalProperties=$additionalProperties}"
                    }

                    /** US domestic wire */
                    class DomesticWire
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val accountNumber: JsonField<String>,
                        private val address: JsonField<WireAddress>,
                        private val bankName: JsonField<String>,
                        private val beneficiaryName: JsonField<String>,
                        private val routingNumber: JsonField<String>,
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
                            @JsonProperty("address")
                            @ExcludeMissing
                            address: JsonField<WireAddress> = JsonMissing.of(),
                            @JsonProperty("bank_name")
                            @ExcludeMissing
                            bankName: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("beneficiary_name")
                            @ExcludeMissing
                            beneficiaryName: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("routing_number")
                            @ExcludeMissing
                            routingNumber: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("type")
                            @ExcludeMissing
                            type: JsonValue = JsonMissing.of(),
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
                            originatorToBeneficiaryInstructionsLine1: JsonField<String> =
                                JsonMissing.of(),
                            @JsonProperty("originator_to_beneficiary_instructions_line2")
                            @ExcludeMissing
                            originatorToBeneficiaryInstructionsLine2: JsonField<String> =
                                JsonMissing.of(),
                            @JsonProperty("originator_to_beneficiary_instructions_line3")
                            @ExcludeMissing
                            originatorToBeneficiaryInstructionsLine3: JsonField<String> =
                                JsonMissing.of(),
                        ) : this(
                            accountNumber,
                            address,
                            bankName,
                            beneficiaryName,
                            routingNumber,
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
                         * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun accountNumber(): String = accountNumber.getRequired("account_number")

                        /**
                         * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun address(): WireAddress = address.getRequired("address")

                        /**
                         * Name of the bank
                         *
                         * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun bankName(): String = bankName.getRequired("bank_name")

                        /**
                         * Name of the account holder, as registered with the bank
                         *
                         * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun beneficiaryName(): String =
                            beneficiaryName.getRequired("beneficiary_name")

                        /**
                         * ABA routing number
                         *
                         * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun routingNumber(): String = routingNumber.getRequired("routing_number")

                        /**
                         * Expected to always return the following:
                         * ```java
                         * JsonValue.from("domestic_wire")
                         * ```
                         *
                         * However, this method can be useful for debugging and logging (e.g. if the
                         * server responded with an unexpected value).
                         */
                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                        /**
                         * Bank branch code (e.g. sort code, IFSC, etc.)
                         *
                         * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun branchCode(): Optional<String> = branchCode.getOptional("branch_code")

                        /**
                         * Name of the intermediary bank
                         *
                         * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun intermediaryPartyName(): Optional<String> =
                            intermediaryPartyName.getOptional("intermediary_party_name")

                        /**
                         * SWIFT/BIC code of the intermediary bank
                         *
                         * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun intermediaryPartySwiftCode(): Optional<String> =
                            intermediaryPartySwiftCode.getOptional("intermediary_party_swift_code")

                        /**
                         * Payment instructions line 1
                         *
                         * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun originatorToBeneficiaryInstructionsLine1(): Optional<String> =
                            originatorToBeneficiaryInstructionsLine1.getOptional(
                                "originator_to_beneficiary_instructions_line1"
                            )

                        /**
                         * Payment instructions line 2
                         *
                         * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun originatorToBeneficiaryInstructionsLine2(): Optional<String> =
                            originatorToBeneficiaryInstructionsLine2.getOptional(
                                "originator_to_beneficiary_instructions_line2"
                            )

                        /**
                         * Payment instructions line 3
                         *
                         * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun originatorToBeneficiaryInstructionsLine3(): Optional<String> =
                            originatorToBeneficiaryInstructionsLine3.getOptional(
                                "originator_to_beneficiary_instructions_line3"
                            )

                        /**
                         * Returns the raw JSON value of [accountNumber].
                         *
                         * Unlike [accountNumber], this method doesn't throw if the JSON field has
                         * an unexpected type.
                         */
                        @JsonProperty("account_number")
                        @ExcludeMissing
                        fun _accountNumber(): JsonField<String> = accountNumber

                        /**
                         * Returns the raw JSON value of [address].
                         *
                         * Unlike [address], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("address")
                        @ExcludeMissing
                        fun _address(): JsonField<WireAddress> = address

                        /**
                         * Returns the raw JSON value of [bankName].
                         *
                         * Unlike [bankName], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("bank_name")
                        @ExcludeMissing
                        fun _bankName(): JsonField<String> = bankName

                        /**
                         * Returns the raw JSON value of [beneficiaryName].
                         *
                         * Unlike [beneficiaryName], this method doesn't throw if the JSON field has
                         * an unexpected type.
                         */
                        @JsonProperty("beneficiary_name")
                        @ExcludeMissing
                        fun _beneficiaryName(): JsonField<String> = beneficiaryName

                        /**
                         * Returns the raw JSON value of [routingNumber].
                         *
                         * Unlike [routingNumber], this method doesn't throw if the JSON field has
                         * an unexpected type.
                         */
                        @JsonProperty("routing_number")
                        @ExcludeMissing
                        fun _routingNumber(): JsonField<String> = routingNumber

                        /**
                         * Returns the raw JSON value of [branchCode].
                         *
                         * Unlike [branchCode], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("branch_code")
                        @ExcludeMissing
                        fun _branchCode(): JsonField<String> = branchCode

                        /**
                         * Returns the raw JSON value of [intermediaryPartyName].
                         *
                         * Unlike [intermediaryPartyName], this method doesn't throw if the JSON
                         * field has an unexpected type.
                         */
                        @JsonProperty("intermediary_party_name")
                        @ExcludeMissing
                        fun _intermediaryPartyName(): JsonField<String> = intermediaryPartyName

                        /**
                         * Returns the raw JSON value of [intermediaryPartySwiftCode].
                         *
                         * Unlike [intermediaryPartySwiftCode], this method doesn't throw if the
                         * JSON field has an unexpected type.
                         */
                        @JsonProperty("intermediary_party_swift_code")
                        @ExcludeMissing
                        fun _intermediaryPartySwiftCode(): JsonField<String> =
                            intermediaryPartySwiftCode

                        /**
                         * Returns the raw JSON value of [originatorToBeneficiaryInstructionsLine1].
                         *
                         * Unlike [originatorToBeneficiaryInstructionsLine1], this method doesn't
                         * throw if the JSON field has an unexpected type.
                         */
                        @JsonProperty("originator_to_beneficiary_instructions_line1")
                        @ExcludeMissing
                        fun _originatorToBeneficiaryInstructionsLine1(): JsonField<String> =
                            originatorToBeneficiaryInstructionsLine1

                        /**
                         * Returns the raw JSON value of [originatorToBeneficiaryInstructionsLine2].
                         *
                         * Unlike [originatorToBeneficiaryInstructionsLine2], this method doesn't
                         * throw if the JSON field has an unexpected type.
                         */
                        @JsonProperty("originator_to_beneficiary_instructions_line2")
                        @ExcludeMissing
                        fun _originatorToBeneficiaryInstructionsLine2(): JsonField<String> =
                            originatorToBeneficiaryInstructionsLine2

                        /**
                         * Returns the raw JSON value of [originatorToBeneficiaryInstructionsLine3].
                         *
                         * Unlike [originatorToBeneficiaryInstructionsLine3], this method doesn't
                         * throw if the JSON field has an unexpected type.
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
                             * Returns a mutable builder for constructing an instance of
                             * [DomesticWire].
                             *
                             * The following fields are required:
                             * ```java
                             * .accountNumber()
                             * .address()
                             * .bankName()
                             * .beneficiaryName()
                             * .routingNumber()
                             * ```
                             */
                            @JvmStatic fun builder() = Builder()
                        }

                        /** A builder for [DomesticWire]. */
                        class Builder internal constructor() {

                            private var accountNumber: JsonField<String>? = null
                            private var address: JsonField<WireAddress>? = null
                            private var bankName: JsonField<String>? = null
                            private var beneficiaryName: JsonField<String>? = null
                            private var routingNumber: JsonField<String>? = null
                            private var type: JsonValue = JsonValue.from("domestic_wire")
                            private var branchCode: JsonField<String> = JsonMissing.of()
                            private var intermediaryPartyName: JsonField<String> = JsonMissing.of()
                            private var intermediaryPartySwiftCode: JsonField<String> =
                                JsonMissing.of()
                            private var originatorToBeneficiaryInstructionsLine1:
                                JsonField<String> =
                                JsonMissing.of()
                            private var originatorToBeneficiaryInstructionsLine2:
                                JsonField<String> =
                                JsonMissing.of()
                            private var originatorToBeneficiaryInstructionsLine3:
                                JsonField<String> =
                                JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(domesticWire: DomesticWire) = apply {
                                accountNumber = domesticWire.accountNumber
                                address = domesticWire.address
                                bankName = domesticWire.bankName
                                beneficiaryName = domesticWire.beneficiaryName
                                routingNumber = domesticWire.routingNumber
                                type = domesticWire.type
                                branchCode = domesticWire.branchCode
                                intermediaryPartyName = domesticWire.intermediaryPartyName
                                intermediaryPartySwiftCode = domesticWire.intermediaryPartySwiftCode
                                originatorToBeneficiaryInstructionsLine1 =
                                    domesticWire.originatorToBeneficiaryInstructionsLine1
                                originatorToBeneficiaryInstructionsLine2 =
                                    domesticWire.originatorToBeneficiaryInstructionsLine2
                                originatorToBeneficiaryInstructionsLine3 =
                                    domesticWire.originatorToBeneficiaryInstructionsLine3
                                additionalProperties =
                                    domesticWire.additionalProperties.toMutableMap()
                            }

                            /** Bank account number */
                            fun accountNumber(accountNumber: String) =
                                accountNumber(JsonField.of(accountNumber))

                            /**
                             * Sets [Builder.accountNumber] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.accountNumber] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun accountNumber(accountNumber: JsonField<String>) = apply {
                                this.accountNumber = accountNumber
                            }

                            fun address(address: WireAddress) = address(JsonField.of(address))

                            /**
                             * Sets [Builder.address] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.address] with a well-typed
                             * [WireAddress] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun address(address: JsonField<WireAddress>) = apply {
                                this.address = address
                            }

                            /** Name of the bank */
                            fun bankName(bankName: String) = bankName(JsonField.of(bankName))

                            /**
                             * Sets [Builder.bankName] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.bankName] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun bankName(bankName: JsonField<String>) = apply {
                                this.bankName = bankName
                            }

                            /** Name of the account holder, as registered with the bank */
                            fun beneficiaryName(beneficiaryName: String) =
                                beneficiaryName(JsonField.of(beneficiaryName))

                            /**
                             * Sets [Builder.beneficiaryName] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.beneficiaryName] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun beneficiaryName(beneficiaryName: JsonField<String>) = apply {
                                this.beneficiaryName = beneficiaryName
                            }

                            /** ABA routing number */
                            fun routingNumber(routingNumber: String) =
                                routingNumber(JsonField.of(routingNumber))

                            /**
                             * Sets [Builder.routingNumber] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.routingNumber] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun routingNumber(routingNumber: JsonField<String>) = apply {
                                this.routingNumber = routingNumber
                            }

                            /**
                             * Sets the field to an arbitrary JSON value.
                             *
                             * It is usually unnecessary to call this method because the field
                             * defaults to the following:
                             * ```java
                             * JsonValue.from("domestic_wire")
                             * ```
                             *
                             * This method is primarily for setting the field to an undocumented or
                             * not yet supported value.
                             */
                            fun type(type: JsonValue) = apply { this.type = type }

                            /** Bank branch code (e.g. sort code, IFSC, etc.) */
                            fun branchCode(branchCode: String) =
                                branchCode(JsonField.of(branchCode))

                            /**
                             * Sets [Builder.branchCode] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.branchCode] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun branchCode(branchCode: JsonField<String>) = apply {
                                this.branchCode = branchCode
                            }

                            /** Name of the intermediary bank */
                            fun intermediaryPartyName(intermediaryPartyName: String) =
                                intermediaryPartyName(JsonField.of(intermediaryPartyName))

                            /**
                             * Sets [Builder.intermediaryPartyName] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.intermediaryPartyName] with a
                             * well-typed [String] value instead. This method is primarily for
                             * setting the field to an undocumented or not yet supported value.
                             */
                            fun intermediaryPartyName(intermediaryPartyName: JsonField<String>) =
                                apply {
                                    this.intermediaryPartyName = intermediaryPartyName
                                }

                            /** SWIFT/BIC code of the intermediary bank */
                            fun intermediaryPartySwiftCode(intermediaryPartySwiftCode: String) =
                                intermediaryPartySwiftCode(JsonField.of(intermediaryPartySwiftCode))

                            /**
                             * Sets [Builder.intermediaryPartySwiftCode] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.intermediaryPartySwiftCode] with a
                             * well-typed [String] value instead. This method is primarily for
                             * setting the field to an undocumented or not yet supported value.
                             */
                            fun intermediaryPartySwiftCode(
                                intermediaryPartySwiftCode: JsonField<String>
                            ) = apply {
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
                             * Sets [Builder.originatorToBeneficiaryInstructionsLine1] to an
                             * arbitrary JSON value.
                             *
                             * You should usually call
                             * [Builder.originatorToBeneficiaryInstructionsLine1] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun originatorToBeneficiaryInstructionsLine1(
                                originatorToBeneficiaryInstructionsLine1: JsonField<String>
                            ) = apply {
                                this.originatorToBeneficiaryInstructionsLine1 =
                                    originatorToBeneficiaryInstructionsLine1
                            }

                            /** Payment instructions line 2 */
                            fun originatorToBeneficiaryInstructionsLine2(
                                originatorToBeneficiaryInstructionsLine2: String
                            ) =
                                originatorToBeneficiaryInstructionsLine2(
                                    JsonField.of(originatorToBeneficiaryInstructionsLine2)
                                )

                            /**
                             * Sets [Builder.originatorToBeneficiaryInstructionsLine2] to an
                             * arbitrary JSON value.
                             *
                             * You should usually call
                             * [Builder.originatorToBeneficiaryInstructionsLine2] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun originatorToBeneficiaryInstructionsLine2(
                                originatorToBeneficiaryInstructionsLine2: JsonField<String>
                            ) = apply {
                                this.originatorToBeneficiaryInstructionsLine2 =
                                    originatorToBeneficiaryInstructionsLine2
                            }

                            /** Payment instructions line 3 */
                            fun originatorToBeneficiaryInstructionsLine3(
                                originatorToBeneficiaryInstructionsLine3: String
                            ) =
                                originatorToBeneficiaryInstructionsLine3(
                                    JsonField.of(originatorToBeneficiaryInstructionsLine3)
                                )

                            /**
                             * Sets [Builder.originatorToBeneficiaryInstructionsLine3] to an
                             * arbitrary JSON value.
                             *
                             * You should usually call
                             * [Builder.originatorToBeneficiaryInstructionsLine3] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun originatorToBeneficiaryInstructionsLine3(
                                originatorToBeneficiaryInstructionsLine3: JsonField<String>
                            ) = apply {
                                this.originatorToBeneficiaryInstructionsLine3 =
                                    originatorToBeneficiaryInstructionsLine3
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [DomesticWire].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```java
                             * .accountNumber()
                             * .address()
                             * .bankName()
                             * .beneficiaryName()
                             * .routingNumber()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): DomesticWire =
                                DomesticWire(
                                    checkRequired("accountNumber", accountNumber),
                                    checkRequired("address", address),
                                    checkRequired("bankName", bankName),
                                    checkRequired("beneficiaryName", beneficiaryName),
                                    checkRequired("routingNumber", routingNumber),
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

                        fun validate(): DomesticWire = apply {
                            if (validated) {
                                return@apply
                            }

                            accountNumber()
                            address().validate()
                            bankName()
                            beneficiaryName()
                            routingNumber()
                            _type().let {
                                if (it != JsonValue.from("domestic_wire")) {
                                    throw NovaApiJavaSpikeInvalidDataException(
                                        "'type' is invalid, received $it"
                                    )
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
                            } catch (e: NovaApiJavaSpikeInvalidDataException) {
                                false
                            }

                        /**
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int =
                            (if (accountNumber.asKnown().isPresent) 1 else 0) +
                                (address.asKnown().getOrNull()?.validity() ?: 0) +
                                (if (bankName.asKnown().isPresent) 1 else 0) +
                                (if (beneficiaryName.asKnown().isPresent) 1 else 0) +
                                (if (routingNumber.asKnown().isPresent) 1 else 0) +
                                type.let { if (it == JsonValue.from("domestic_wire")) 1 else 0 } +
                                (if (branchCode.asKnown().isPresent) 1 else 0) +
                                (if (intermediaryPartyName.asKnown().isPresent) 1 else 0) +
                                (if (intermediaryPartySwiftCode.asKnown().isPresent) 1 else 0) +
                                (if (originatorToBeneficiaryInstructionsLine1.asKnown().isPresent) 1
                                else 0) +
                                (if (originatorToBeneficiaryInstructionsLine2.asKnown().isPresent) 1
                                else 0) +
                                (if (originatorToBeneficiaryInstructionsLine3.asKnown().isPresent) 1
                                else 0)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is DomesticWire &&
                                accountNumber == other.accountNumber &&
                                address == other.address &&
                                bankName == other.bankName &&
                                beneficiaryName == other.beneficiaryName &&
                                routingNumber == other.routingNumber &&
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
                                routingNumber,
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
                            "DomesticWire{accountNumber=$accountNumber, address=$address, bankName=$bankName, beneficiaryName=$beneficiaryName, routingNumber=$routingNumber, type=$type, branchCode=$branchCode, intermediaryPartyName=$intermediaryPartyName, intermediaryPartySwiftCode=$intermediaryPartySwiftCode, originatorToBeneficiaryInstructionsLine1=$originatorToBeneficiaryInstructionsLine1, originatorToBeneficiaryInstructionsLine2=$originatorToBeneficiaryInstructionsLine2, originatorToBeneficiaryInstructionsLine3=$originatorToBeneficiaryInstructionsLine3, additionalProperties=$additionalProperties}"
                    }

                    /** International wire */
                    class InternationalWire
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
                            @JsonProperty("address")
                            @ExcludeMissing
                            address: JsonField<WireAddress> = JsonMissing.of(),
                            @JsonProperty("bank_name")
                            @ExcludeMissing
                            bankName: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("beneficiary_name")
                            @ExcludeMissing
                            beneficiaryName: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("swift_code")
                            @ExcludeMissing
                            swiftCode: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("type")
                            @ExcludeMissing
                            type: JsonValue = JsonMissing.of(),
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
                            originatorToBeneficiaryInstructionsLine1: JsonField<String> =
                                JsonMissing.of(),
                            @JsonProperty("originator_to_beneficiary_instructions_line2")
                            @ExcludeMissing
                            originatorToBeneficiaryInstructionsLine2: JsonField<String> =
                                JsonMissing.of(),
                            @JsonProperty("originator_to_beneficiary_instructions_line3")
                            @ExcludeMissing
                            originatorToBeneficiaryInstructionsLine3: JsonField<String> =
                                JsonMissing.of(),
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
                         * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun accountNumber(): String = accountNumber.getRequired("account_number")

                        /**
                         * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun address(): WireAddress = address.getRequired("address")

                        /**
                         * Name of the bank
                         *
                         * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun bankName(): String = bankName.getRequired("bank_name")

                        /**
                         * Name of the account holder, as registered with the bank
                         *
                         * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun beneficiaryName(): String =
                            beneficiaryName.getRequired("beneficiary_name")

                        /**
                         * SWIFT/BIC code
                         *
                         * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an
                         *   unexpected type or is unexpectedly missing or null (e.g. if the server
                         *   responded with an unexpected value).
                         */
                        fun swiftCode(): String = swiftCode.getRequired("swift_code")

                        /**
                         * Expected to always return the following:
                         * ```java
                         * JsonValue.from("international_wire")
                         * ```
                         *
                         * However, this method can be useful for debugging and logging (e.g. if the
                         * server responded with an unexpected value).
                         */
                        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

                        /**
                         * Bank branch code (e.g. sort code, IFSC, etc.)
                         *
                         * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun branchCode(): Optional<String> = branchCode.getOptional("branch_code")

                        /**
                         * Name of the intermediary bank
                         *
                         * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun intermediaryPartyName(): Optional<String> =
                            intermediaryPartyName.getOptional("intermediary_party_name")

                        /**
                         * SWIFT/BIC code of the intermediary bank
                         *
                         * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun intermediaryPartySwiftCode(): Optional<String> =
                            intermediaryPartySwiftCode.getOptional("intermediary_party_swift_code")

                        /**
                         * Payment instructions line 1
                         *
                         * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun originatorToBeneficiaryInstructionsLine1(): Optional<String> =
                            originatorToBeneficiaryInstructionsLine1.getOptional(
                                "originator_to_beneficiary_instructions_line1"
                            )

                        /**
                         * Payment instructions line 2
                         *
                         * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun originatorToBeneficiaryInstructionsLine2(): Optional<String> =
                            originatorToBeneficiaryInstructionsLine2.getOptional(
                                "originator_to_beneficiary_instructions_line2"
                            )

                        /**
                         * Payment instructions line 3
                         *
                         * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an
                         *   unexpected type (e.g. if the server responded with an unexpected
                         *   value).
                         */
                        fun originatorToBeneficiaryInstructionsLine3(): Optional<String> =
                            originatorToBeneficiaryInstructionsLine3.getOptional(
                                "originator_to_beneficiary_instructions_line3"
                            )

                        /**
                         * Returns the raw JSON value of [accountNumber].
                         *
                         * Unlike [accountNumber], this method doesn't throw if the JSON field has
                         * an unexpected type.
                         */
                        @JsonProperty("account_number")
                        @ExcludeMissing
                        fun _accountNumber(): JsonField<String> = accountNumber

                        /**
                         * Returns the raw JSON value of [address].
                         *
                         * Unlike [address], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("address")
                        @ExcludeMissing
                        fun _address(): JsonField<WireAddress> = address

                        /**
                         * Returns the raw JSON value of [bankName].
                         *
                         * Unlike [bankName], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("bank_name")
                        @ExcludeMissing
                        fun _bankName(): JsonField<String> = bankName

                        /**
                         * Returns the raw JSON value of [beneficiaryName].
                         *
                         * Unlike [beneficiaryName], this method doesn't throw if the JSON field has
                         * an unexpected type.
                         */
                        @JsonProperty("beneficiary_name")
                        @ExcludeMissing
                        fun _beneficiaryName(): JsonField<String> = beneficiaryName

                        /**
                         * Returns the raw JSON value of [swiftCode].
                         *
                         * Unlike [swiftCode], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("swift_code")
                        @ExcludeMissing
                        fun _swiftCode(): JsonField<String> = swiftCode

                        /**
                         * Returns the raw JSON value of [branchCode].
                         *
                         * Unlike [branchCode], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("branch_code")
                        @ExcludeMissing
                        fun _branchCode(): JsonField<String> = branchCode

                        /**
                         * Returns the raw JSON value of [intermediaryPartyName].
                         *
                         * Unlike [intermediaryPartyName], this method doesn't throw if the JSON
                         * field has an unexpected type.
                         */
                        @JsonProperty("intermediary_party_name")
                        @ExcludeMissing
                        fun _intermediaryPartyName(): JsonField<String> = intermediaryPartyName

                        /**
                         * Returns the raw JSON value of [intermediaryPartySwiftCode].
                         *
                         * Unlike [intermediaryPartySwiftCode], this method doesn't throw if the
                         * JSON field has an unexpected type.
                         */
                        @JsonProperty("intermediary_party_swift_code")
                        @ExcludeMissing
                        fun _intermediaryPartySwiftCode(): JsonField<String> =
                            intermediaryPartySwiftCode

                        /**
                         * Returns the raw JSON value of [originatorToBeneficiaryInstructionsLine1].
                         *
                         * Unlike [originatorToBeneficiaryInstructionsLine1], this method doesn't
                         * throw if the JSON field has an unexpected type.
                         */
                        @JsonProperty("originator_to_beneficiary_instructions_line1")
                        @ExcludeMissing
                        fun _originatorToBeneficiaryInstructionsLine1(): JsonField<String> =
                            originatorToBeneficiaryInstructionsLine1

                        /**
                         * Returns the raw JSON value of [originatorToBeneficiaryInstructionsLine2].
                         *
                         * Unlike [originatorToBeneficiaryInstructionsLine2], this method doesn't
                         * throw if the JSON field has an unexpected type.
                         */
                        @JsonProperty("originator_to_beneficiary_instructions_line2")
                        @ExcludeMissing
                        fun _originatorToBeneficiaryInstructionsLine2(): JsonField<String> =
                            originatorToBeneficiaryInstructionsLine2

                        /**
                         * Returns the raw JSON value of [originatorToBeneficiaryInstructionsLine3].
                         *
                         * Unlike [originatorToBeneficiaryInstructionsLine3], this method doesn't
                         * throw if the JSON field has an unexpected type.
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
                             * Returns a mutable builder for constructing an instance of
                             * [InternationalWire].
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

                        /** A builder for [InternationalWire]. */
                        class Builder internal constructor() {

                            private var accountNumber: JsonField<String>? = null
                            private var address: JsonField<WireAddress>? = null
                            private var bankName: JsonField<String>? = null
                            private var beneficiaryName: JsonField<String>? = null
                            private var swiftCode: JsonField<String>? = null
                            private var type: JsonValue = JsonValue.from("international_wire")
                            private var branchCode: JsonField<String> = JsonMissing.of()
                            private var intermediaryPartyName: JsonField<String> = JsonMissing.of()
                            private var intermediaryPartySwiftCode: JsonField<String> =
                                JsonMissing.of()
                            private var originatorToBeneficiaryInstructionsLine1:
                                JsonField<String> =
                                JsonMissing.of()
                            private var originatorToBeneficiaryInstructionsLine2:
                                JsonField<String> =
                                JsonMissing.of()
                            private var originatorToBeneficiaryInstructionsLine3:
                                JsonField<String> =
                                JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            @JvmSynthetic
                            internal fun from(internationalWire: InternationalWire) = apply {
                                accountNumber = internationalWire.accountNumber
                                address = internationalWire.address
                                bankName = internationalWire.bankName
                                beneficiaryName = internationalWire.beneficiaryName
                                swiftCode = internationalWire.swiftCode
                                type = internationalWire.type
                                branchCode = internationalWire.branchCode
                                intermediaryPartyName = internationalWire.intermediaryPartyName
                                intermediaryPartySwiftCode =
                                    internationalWire.intermediaryPartySwiftCode
                                originatorToBeneficiaryInstructionsLine1 =
                                    internationalWire.originatorToBeneficiaryInstructionsLine1
                                originatorToBeneficiaryInstructionsLine2 =
                                    internationalWire.originatorToBeneficiaryInstructionsLine2
                                originatorToBeneficiaryInstructionsLine3 =
                                    internationalWire.originatorToBeneficiaryInstructionsLine3
                                additionalProperties =
                                    internationalWire.additionalProperties.toMutableMap()
                            }

                            /** Bank account number */
                            fun accountNumber(accountNumber: String) =
                                accountNumber(JsonField.of(accountNumber))

                            /**
                             * Sets [Builder.accountNumber] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.accountNumber] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun accountNumber(accountNumber: JsonField<String>) = apply {
                                this.accountNumber = accountNumber
                            }

                            fun address(address: WireAddress) = address(JsonField.of(address))

                            /**
                             * Sets [Builder.address] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.address] with a well-typed
                             * [WireAddress] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun address(address: JsonField<WireAddress>) = apply {
                                this.address = address
                            }

                            /** Name of the bank */
                            fun bankName(bankName: String) = bankName(JsonField.of(bankName))

                            /**
                             * Sets [Builder.bankName] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.bankName] with a well-typed [String]
                             * value instead. This method is primarily for setting the field to an
                             * undocumented or not yet supported value.
                             */
                            fun bankName(bankName: JsonField<String>) = apply {
                                this.bankName = bankName
                            }

                            /** Name of the account holder, as registered with the bank */
                            fun beneficiaryName(beneficiaryName: String) =
                                beneficiaryName(JsonField.of(beneficiaryName))

                            /**
                             * Sets [Builder.beneficiaryName] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.beneficiaryName] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun beneficiaryName(beneficiaryName: JsonField<String>) = apply {
                                this.beneficiaryName = beneficiaryName
                            }

                            /** SWIFT/BIC code */
                            fun swiftCode(swiftCode: String) = swiftCode(JsonField.of(swiftCode))

                            /**
                             * Sets [Builder.swiftCode] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.swiftCode] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun swiftCode(swiftCode: JsonField<String>) = apply {
                                this.swiftCode = swiftCode
                            }

                            /**
                             * Sets the field to an arbitrary JSON value.
                             *
                             * It is usually unnecessary to call this method because the field
                             * defaults to the following:
                             * ```java
                             * JsonValue.from("international_wire")
                             * ```
                             *
                             * This method is primarily for setting the field to an undocumented or
                             * not yet supported value.
                             */
                            fun type(type: JsonValue) = apply { this.type = type }

                            /** Bank branch code (e.g. sort code, IFSC, etc.) */
                            fun branchCode(branchCode: String) =
                                branchCode(JsonField.of(branchCode))

                            /**
                             * Sets [Builder.branchCode] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.branchCode] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun branchCode(branchCode: JsonField<String>) = apply {
                                this.branchCode = branchCode
                            }

                            /** Name of the intermediary bank */
                            fun intermediaryPartyName(intermediaryPartyName: String) =
                                intermediaryPartyName(JsonField.of(intermediaryPartyName))

                            /**
                             * Sets [Builder.intermediaryPartyName] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.intermediaryPartyName] with a
                             * well-typed [String] value instead. This method is primarily for
                             * setting the field to an undocumented or not yet supported value.
                             */
                            fun intermediaryPartyName(intermediaryPartyName: JsonField<String>) =
                                apply {
                                    this.intermediaryPartyName = intermediaryPartyName
                                }

                            /** SWIFT/BIC code of the intermediary bank */
                            fun intermediaryPartySwiftCode(intermediaryPartySwiftCode: String) =
                                intermediaryPartySwiftCode(JsonField.of(intermediaryPartySwiftCode))

                            /**
                             * Sets [Builder.intermediaryPartySwiftCode] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.intermediaryPartySwiftCode] with a
                             * well-typed [String] value instead. This method is primarily for
                             * setting the field to an undocumented or not yet supported value.
                             */
                            fun intermediaryPartySwiftCode(
                                intermediaryPartySwiftCode: JsonField<String>
                            ) = apply {
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
                             * Sets [Builder.originatorToBeneficiaryInstructionsLine1] to an
                             * arbitrary JSON value.
                             *
                             * You should usually call
                             * [Builder.originatorToBeneficiaryInstructionsLine1] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun originatorToBeneficiaryInstructionsLine1(
                                originatorToBeneficiaryInstructionsLine1: JsonField<String>
                            ) = apply {
                                this.originatorToBeneficiaryInstructionsLine1 =
                                    originatorToBeneficiaryInstructionsLine1
                            }

                            /** Payment instructions line 2 */
                            fun originatorToBeneficiaryInstructionsLine2(
                                originatorToBeneficiaryInstructionsLine2: String
                            ) =
                                originatorToBeneficiaryInstructionsLine2(
                                    JsonField.of(originatorToBeneficiaryInstructionsLine2)
                                )

                            /**
                             * Sets [Builder.originatorToBeneficiaryInstructionsLine2] to an
                             * arbitrary JSON value.
                             *
                             * You should usually call
                             * [Builder.originatorToBeneficiaryInstructionsLine2] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun originatorToBeneficiaryInstructionsLine2(
                                originatorToBeneficiaryInstructionsLine2: JsonField<String>
                            ) = apply {
                                this.originatorToBeneficiaryInstructionsLine2 =
                                    originatorToBeneficiaryInstructionsLine2
                            }

                            /** Payment instructions line 3 */
                            fun originatorToBeneficiaryInstructionsLine3(
                                originatorToBeneficiaryInstructionsLine3: String
                            ) =
                                originatorToBeneficiaryInstructionsLine3(
                                    JsonField.of(originatorToBeneficiaryInstructionsLine3)
                                )

                            /**
                             * Sets [Builder.originatorToBeneficiaryInstructionsLine3] to an
                             * arbitrary JSON value.
                             *
                             * You should usually call
                             * [Builder.originatorToBeneficiaryInstructionsLine3] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun originatorToBeneficiaryInstructionsLine3(
                                originatorToBeneficiaryInstructionsLine3: JsonField<String>
                            ) = apply {
                                this.originatorToBeneficiaryInstructionsLine3 =
                                    originatorToBeneficiaryInstructionsLine3
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun removeAdditionalProperty(key: String) = apply {
                                additionalProperties.remove(key)
                            }

                            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                                keys.forEach(::removeAdditionalProperty)
                            }

                            /**
                             * Returns an immutable instance of [InternationalWire].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
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
                            fun build(): InternationalWire =
                                InternationalWire(
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

                        fun validate(): InternationalWire = apply {
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
                                    throw NovaApiJavaSpikeInvalidDataException(
                                        "'type' is invalid, received $it"
                                    )
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
                            } catch (e: NovaApiJavaSpikeInvalidDataException) {
                                false
                            }

                        /**
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
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
                                type.let {
                                    if (it == JsonValue.from("international_wire")) 1 else 0
                                } +
                                (if (branchCode.asKnown().isPresent) 1 else 0) +
                                (if (intermediaryPartyName.asKnown().isPresent) 1 else 0) +
                                (if (intermediaryPartySwiftCode.asKnown().isPresent) 1 else 0) +
                                (if (originatorToBeneficiaryInstructionsLine1.asKnown().isPresent) 1
                                else 0) +
                                (if (originatorToBeneficiaryInstructionsLine2.asKnown().isPresent) 1
                                else 0) +
                                (if (originatorToBeneficiaryInstructionsLine3.asKnown().isPresent) 1
                                else 0)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is InternationalWire &&
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
                            "InternationalWire{accountNumber=$accountNumber, address=$address, bankName=$bankName, beneficiaryName=$beneficiaryName, swiftCode=$swiftCode, type=$type, branchCode=$branchCode, intermediaryPartyName=$intermediaryPartyName, intermediaryPartySwiftCode=$intermediaryPartySwiftCode, originatorToBeneficiaryInstructionsLine1=$originatorToBeneficiaryInstructionsLine1, originatorToBeneficiaryInstructionsLine2=$originatorToBeneficiaryInstructionsLine2, originatorToBeneficiaryInstructionsLine3=$originatorToBeneficiaryInstructionsLine3, additionalProperties=$additionalProperties}"
                    }
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is NewEntityInput &&
                        name == other.name &&
                        type == other.type &&
                        externalReferences == other.externalReferences &&
                        wireInfo == other.wireInfo &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(name, type, externalReferences, wireInfo, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "NewEntityInput{name=$name, type=$type, externalReferences=$externalReferences, wireInfo=$wireInfo, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Payment &&
                amount == other.amount &&
                contacts == other.contacts &&
                currency == other.currency &&
                entity == other.entity &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(amount, contacts, currency, entity, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Payment{amount=$amount, contacts=$contacts, currency=$currency, entity=$entity, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DistributionCreateParams &&
            xOrganizationId == other.xOrganizationId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(xOrganizationId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DistributionCreateParams{xOrganizationId=$xOrganizationId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
