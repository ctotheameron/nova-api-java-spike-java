// File generated from our OpenAPI spec by Stainless.

package io.github.ctotheameron.models.distributions

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
import io.github.ctotheameron.core.BaseDeserializer
import io.github.ctotheameron.core.BaseSerializer
import io.github.ctotheameron.core.ExcludeMissing
import io.github.ctotheameron.core.JsonField
import io.github.ctotheameron.core.JsonMissing
import io.github.ctotheameron.core.JsonValue
import io.github.ctotheameron.core.Params
import io.github.ctotheameron.core.allMaxBy
import io.github.ctotheameron.core.checkKnown
import io.github.ctotheameron.core.checkRequired
import io.github.ctotheameron.core.getOrThrow
import io.github.ctotheameron.core.http.Headers
import io.github.ctotheameron.core.http.QueryParams
import io.github.ctotheameron.core.toImmutable
import io.github.ctotheameron.errors.NovaApiJavaSpikeInvalidDataException
import io.github.ctotheameron.models.entities.AchInfo
import io.github.ctotheameron.models.entities.DomesticWire
import io.github.ctotheameron.models.entities.EntityType
import io.github.ctotheameron.models.entities.InternationalWireInfo
import io.github.ctotheameron.models.entities.WireInfo
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
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

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

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(distributionCreateParams: DistributionCreateParams) = apply {
            body = distributionCreateParams.body.toBuilder()
            additionalHeaders = distributionCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = distributionCreateParams.additionalQueryParams.toBuilder()
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
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

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
                    fun wireInfo(ach: AchInfo) = wireInfo(WireInfo.ofAch(ach))

                    /**
                     * Alias for calling [wireInfo] with `WireInfo.ofDomesticWire(domesticWire)`.
                     */
                    fun wireInfo(domesticWire: DomesticWire) =
                        wireInfo(WireInfo.ofDomesticWire(domesticWire))

                    /**
                     * Alias for calling [wireInfo] with
                     * `WireInfo.ofInternationalWire(internationalWire)`.
                     */
                    fun wireInfo(internationalWire: InternationalWireInfo) =
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
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DistributionCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
