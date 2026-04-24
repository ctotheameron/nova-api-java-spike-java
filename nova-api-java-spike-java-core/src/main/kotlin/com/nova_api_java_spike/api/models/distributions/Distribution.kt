// File generated from our OpenAPI spec by Stainless.

package com.nova_api_java_spike.api.models.distributions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.nova_api_java_spike.api.core.Enum
import com.nova_api_java_spike.api.core.ExcludeMissing
import com.nova_api_java_spike.api.core.JsonField
import com.nova_api_java_spike.api.core.JsonMissing
import com.nova_api_java_spike.api.core.JsonValue
import com.nova_api_java_spike.api.core.checkKnown
import com.nova_api_java_spike.api.core.checkRequired
import com.nova_api_java_spike.api.core.toImmutable
import com.nova_api_java_spike.api.errors.NovaApiJavaSpikeInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Distribution
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val approvedAt: JsonField<OffsetDateTime>,
    private val cancelledAt: JsonField<OffsetDateTime>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val distributionDate: JsonField<OffsetDateTime>,
    private val executedAt: JsonField<OffsetDateTime>,
    private val name: JsonField<String>,
    private val payments: JsonField<List<Payment>>,
    private val publishedAt: JsonField<OffsetDateTime>,
    private val shortId: JsonField<String>,
    private val status: JsonField<Status>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val vehicleId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("approved_at")
        @ExcludeMissing
        approvedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("cancelled_at")
        @ExcludeMissing
        cancelledAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("distribution_date")
        @ExcludeMissing
        distributionDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("executed_at")
        @ExcludeMissing
        executedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payments")
        @ExcludeMissing
        payments: JsonField<List<Payment>> = JsonMissing.of(),
        @JsonProperty("published_at")
        @ExcludeMissing
        publishedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("short_id") @ExcludeMissing shortId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("vehicle_id") @ExcludeMissing vehicleId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        approvedAt,
        cancelledAt,
        createdAt,
        distributionDate,
        executedAt,
        name,
        payments,
        publishedAt,
        shortId,
        status,
        updatedAt,
        vehicleId,
        mutableMapOf(),
    )

    /**
     * UUID of the distribution
     *
     * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun approvedAt(): Optional<OffsetDateTime> = approvedAt.getOptional("approved_at")

    /**
     * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun cancelledAt(): Optional<OffsetDateTime> = cancelledAt.getOptional("cancelled_at")

    /**
     * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * Distribution date
     *
     * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun distributionDate(): OffsetDateTime = distributionDate.getRequired("distribution_date")

    /**
     * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun executedAt(): Optional<OffsetDateTime> = executedAt.getOptional("executed_at")

    /**
     * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun payments(): List<Payment> = payments.getRequired("payments")

    /**
     * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an unexpected type (e.g.
     *   if the server responded with an unexpected value).
     */
    fun publishedAt(): Optional<OffsetDateTime> = publishedAt.getOptional("published_at")

    /**
     * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun shortId(): String = shortId.getRequired("short_id")

    /**
     * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * UUID of the vehicle this distribution pays from
     *
     * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun vehicleId(): String = vehicleId.getRequired("vehicle_id")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [approvedAt].
     *
     * Unlike [approvedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("approved_at")
    @ExcludeMissing
    fun _approvedAt(): JsonField<OffsetDateTime> = approvedAt

    /**
     * Returns the raw JSON value of [cancelledAt].
     *
     * Unlike [cancelledAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cancelled_at")
    @ExcludeMissing
    fun _cancelledAt(): JsonField<OffsetDateTime> = cancelledAt

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

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
     * Returns the raw JSON value of [executedAt].
     *
     * Unlike [executedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("executed_at")
    @ExcludeMissing
    fun _executedAt(): JsonField<OffsetDateTime> = executedAt

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
    @JsonProperty("payments") @ExcludeMissing fun _payments(): JsonField<List<Payment>> = payments

    /**
     * Returns the raw JSON value of [publishedAt].
     *
     * Unlike [publishedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("published_at")
    @ExcludeMissing
    fun _publishedAt(): JsonField<OffsetDateTime> = publishedAt

    /**
     * Returns the raw JSON value of [shortId].
     *
     * Unlike [shortId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("short_id") @ExcludeMissing fun _shortId(): JsonField<String> = shortId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
         * Returns a mutable builder for constructing an instance of [Distribution].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .approvedAt()
         * .cancelledAt()
         * .createdAt()
         * .distributionDate()
         * .executedAt()
         * .name()
         * .payments()
         * .publishedAt()
         * .shortId()
         * .status()
         * .updatedAt()
         * .vehicleId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Distribution]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var approvedAt: JsonField<OffsetDateTime>? = null
        private var cancelledAt: JsonField<OffsetDateTime>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var distributionDate: JsonField<OffsetDateTime>? = null
        private var executedAt: JsonField<OffsetDateTime>? = null
        private var name: JsonField<String>? = null
        private var payments: JsonField<MutableList<Payment>>? = null
        private var publishedAt: JsonField<OffsetDateTime>? = null
        private var shortId: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var vehicleId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(distribution: Distribution) = apply {
            id = distribution.id
            approvedAt = distribution.approvedAt
            cancelledAt = distribution.cancelledAt
            createdAt = distribution.createdAt
            distributionDate = distribution.distributionDate
            executedAt = distribution.executedAt
            name = distribution.name
            payments = distribution.payments.map { it.toMutableList() }
            publishedAt = distribution.publishedAt
            shortId = distribution.shortId
            status = distribution.status
            updatedAt = distribution.updatedAt
            vehicleId = distribution.vehicleId
            additionalProperties = distribution.additionalProperties.toMutableMap()
        }

        /** UUID of the distribution */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun approvedAt(approvedAt: OffsetDateTime?) = approvedAt(JsonField.ofNullable(approvedAt))

        /** Alias for calling [Builder.approvedAt] with `approvedAt.orElse(null)`. */
        fun approvedAt(approvedAt: Optional<OffsetDateTime>) = approvedAt(approvedAt.getOrNull())

        /**
         * Sets [Builder.approvedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.approvedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun approvedAt(approvedAt: JsonField<OffsetDateTime>) = apply {
            this.approvedAt = approvedAt
        }

        fun cancelledAt(cancelledAt: OffsetDateTime?) =
            cancelledAt(JsonField.ofNullable(cancelledAt))

        /** Alias for calling [Builder.cancelledAt] with `cancelledAt.orElse(null)`. */
        fun cancelledAt(cancelledAt: Optional<OffsetDateTime>) =
            cancelledAt(cancelledAt.getOrNull())

        /**
         * Sets [Builder.cancelledAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cancelledAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cancelledAt(cancelledAt: JsonField<OffsetDateTime>) = apply {
            this.cancelledAt = cancelledAt
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Distribution date */
        fun distributionDate(distributionDate: OffsetDateTime) =
            distributionDate(JsonField.of(distributionDate))

        /**
         * Sets [Builder.distributionDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.distributionDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun distributionDate(distributionDate: JsonField<OffsetDateTime>) = apply {
            this.distributionDate = distributionDate
        }

        fun executedAt(executedAt: OffsetDateTime?) = executedAt(JsonField.ofNullable(executedAt))

        /** Alias for calling [Builder.executedAt] with `executedAt.orElse(null)`. */
        fun executedAt(executedAt: Optional<OffsetDateTime>) = executedAt(executedAt.getOrNull())

        /**
         * Sets [Builder.executedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.executedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun executedAt(executedAt: JsonField<OffsetDateTime>) = apply {
            this.executedAt = executedAt
        }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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

        fun publishedAt(publishedAt: OffsetDateTime?) =
            publishedAt(JsonField.ofNullable(publishedAt))

        /** Alias for calling [Builder.publishedAt] with `publishedAt.orElse(null)`. */
        fun publishedAt(publishedAt: Optional<OffsetDateTime>) =
            publishedAt(publishedAt.getOrNull())

        /**
         * Sets [Builder.publishedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.publishedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun publishedAt(publishedAt: JsonField<OffsetDateTime>) = apply {
            this.publishedAt = publishedAt
        }

        fun shortId(shortId: String) = shortId(JsonField.of(shortId))

        /**
         * Sets [Builder.shortId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shortId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun shortId(shortId: JsonField<String>) = apply { this.shortId = shortId }

        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** UUID of the vehicle this distribution pays from */
        fun vehicleId(vehicleId: String) = vehicleId(JsonField.of(vehicleId))

        /**
         * Sets [Builder.vehicleId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.vehicleId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * Returns an immutable instance of [Distribution].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .approvedAt()
         * .cancelledAt()
         * .createdAt()
         * .distributionDate()
         * .executedAt()
         * .name()
         * .payments()
         * .publishedAt()
         * .shortId()
         * .status()
         * .updatedAt()
         * .vehicleId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Distribution =
            Distribution(
                checkRequired("id", id),
                checkRequired("approvedAt", approvedAt),
                checkRequired("cancelledAt", cancelledAt),
                checkRequired("createdAt", createdAt),
                checkRequired("distributionDate", distributionDate),
                checkRequired("executedAt", executedAt),
                checkRequired("name", name),
                checkRequired("payments", payments).map { it.toImmutable() },
                checkRequired("publishedAt", publishedAt),
                checkRequired("shortId", shortId),
                checkRequired("status", status),
                checkRequired("updatedAt", updatedAt),
                checkRequired("vehicleId", vehicleId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Distribution = apply {
        if (validated) {
            return@apply
        }

        id()
        approvedAt()
        cancelledAt()
        createdAt()
        distributionDate()
        executedAt()
        name()
        payments().forEach { it.validate() }
        publishedAt()
        shortId()
        status().validate()
        updatedAt()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (approvedAt.asKnown().isPresent) 1 else 0) +
            (if (cancelledAt.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (distributionDate.asKnown().isPresent) 1 else 0) +
            (if (executedAt.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (payments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (publishedAt.asKnown().isPresent) 1 else 0) +
            (if (shortId.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (vehicleId.asKnown().isPresent) 1 else 0)

    class Payment
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val amount: JsonField<Long>,
        private val contacts: JsonField<List<Contact>>,
        private val currency: JsonField<Currency>,
        private val entity: JsonField<Entity>,
        private val recipientConfirmedAt: JsonField<OffsetDateTime>,
        private val status: JsonField<Status>,
        private val verifiedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("contacts")
            @ExcludeMissing
            contacts: JsonField<List<Contact>> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("entity") @ExcludeMissing entity: JsonField<Entity> = JsonMissing.of(),
            @JsonProperty("recipient_confirmed_at")
            @ExcludeMissing
            recipientConfirmedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("verified_at")
            @ExcludeMissing
            verifiedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            id,
            amount,
            contacts,
            currency,
            entity,
            recipientConfirmedAt,
            status,
            verifiedAt,
            mutableMapOf(),
        )

        /**
         * UUID of the distribution payment
         *
         * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun id(): String = id.getRequired("id")

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
         * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun entity(): Entity = entity.getRequired("entity")

        /**
         * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun recipientConfirmedAt(): Optional<OffsetDateTime> =
            recipientConfirmedAt.getOptional("recipient_confirmed_at")

        /**
         * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an unexpected type or
         *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
         *   value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an unexpected type
         *   (e.g. if the server responded with an unexpected value).
         */
        fun verifiedAt(): Optional<OffsetDateTime> = verifiedAt.getOptional("verified_at")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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

        /**
         * Returns the raw JSON value of [recipientConfirmedAt].
         *
         * Unlike [recipientConfirmedAt], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("recipient_confirmed_at")
        @ExcludeMissing
        fun _recipientConfirmedAt(): JsonField<OffsetDateTime> = recipientConfirmedAt

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [verifiedAt].
         *
         * Unlike [verifiedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("verified_at")
        @ExcludeMissing
        fun _verifiedAt(): JsonField<OffsetDateTime> = verifiedAt

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
             * .id()
             * .amount()
             * .contacts()
             * .currency()
             * .entity()
             * .recipientConfirmedAt()
             * .status()
             * .verifiedAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Payment]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var amount: JsonField<Long>? = null
            private var contacts: JsonField<MutableList<Contact>>? = null
            private var currency: JsonField<Currency>? = null
            private var entity: JsonField<Entity>? = null
            private var recipientConfirmedAt: JsonField<OffsetDateTime>? = null
            private var status: JsonField<Status>? = null
            private var verifiedAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(payment: Payment) = apply {
                id = payment.id
                amount = payment.amount
                contacts = payment.contacts.map { it.toMutableList() }
                currency = payment.currency
                entity = payment.entity
                recipientConfirmedAt = payment.recipientConfirmedAt
                status = payment.status
                verifiedAt = payment.verifiedAt
                additionalProperties = payment.additionalProperties.toMutableMap()
            }

            /** UUID of the distribution payment */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

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

            fun entity(entity: Entity) = entity(JsonField.of(entity))

            /**
             * Sets [Builder.entity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entity] with a well-typed [Entity] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entity(entity: JsonField<Entity>) = apply { this.entity = entity }

            fun recipientConfirmedAt(recipientConfirmedAt: OffsetDateTime?) =
                recipientConfirmedAt(JsonField.ofNullable(recipientConfirmedAt))

            /**
             * Alias for calling [Builder.recipientConfirmedAt] with
             * `recipientConfirmedAt.orElse(null)`.
             */
            fun recipientConfirmedAt(recipientConfirmedAt: Optional<OffsetDateTime>) =
                recipientConfirmedAt(recipientConfirmedAt.getOrNull())

            /**
             * Sets [Builder.recipientConfirmedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recipientConfirmedAt] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun recipientConfirmedAt(recipientConfirmedAt: JsonField<OffsetDateTime>) = apply {
                this.recipientConfirmedAt = recipientConfirmedAt
            }

            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            fun verifiedAt(verifiedAt: OffsetDateTime?) =
                verifiedAt(JsonField.ofNullable(verifiedAt))

            /** Alias for calling [Builder.verifiedAt] with `verifiedAt.orElse(null)`. */
            fun verifiedAt(verifiedAt: Optional<OffsetDateTime>) =
                verifiedAt(verifiedAt.getOrNull())

            /**
             * Sets [Builder.verifiedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.verifiedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun verifiedAt(verifiedAt: JsonField<OffsetDateTime>) = apply {
                this.verifiedAt = verifiedAt
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
             * Returns an immutable instance of [Payment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .amount()
             * .contacts()
             * .currency()
             * .entity()
             * .recipientConfirmedAt()
             * .status()
             * .verifiedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Payment =
                Payment(
                    checkRequired("id", id),
                    checkRequired("amount", amount),
                    checkRequired("contacts", contacts).map { it.toImmutable() },
                    checkRequired("currency", currency),
                    checkRequired("entity", entity),
                    checkRequired("recipientConfirmedAt", recipientConfirmedAt),
                    checkRequired("status", status),
                    checkRequired("verifiedAt", verifiedAt),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Payment = apply {
            if (validated) {
                return@apply
            }

            id()
            amount()
            contacts().forEach { it.validate() }
            currency().validate()
            entity().validate()
            recipientConfirmedAt()
            status().validate()
            verifiedAt()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (amount.asKnown().isPresent) 1 else 0) +
                (contacts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (currency.asKnown().getOrNull()?.validity() ?: 0) +
                (entity.asKnown().getOrNull()?.validity() ?: 0) +
                (if (recipientConfirmedAt.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (verifiedAt.asKnown().isPresent) 1 else 0)

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

                fun person(person: Person) = person(JsonField.of(person))

                /**
                 * Sets [Builder.person] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.person] with a well-typed [Person] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun person(person: JsonField<Person>) = apply { this.person = person }

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
                    @JsonProperty("email")
                    @ExcludeMissing
                    email: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("external_references")
                    @ExcludeMissing
                    externalReferences: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                ) : this(id, email, externalReferences, name, mutableMapOf())

                /**
                 * UUID of an existing person
                 *
                 * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * Email address used for notifications and account linkage
                 *
                 * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun email(): String = email.getRequired("email")

                /**
                 * Your own identifiers for this person
                 *
                 * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun externalReferences(): List<String> =
                    externalReferences.getRequired("external_references")

                /**
                 * Full legal name
                 *
                 * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
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
                 * Unlike [email], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

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
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
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
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /** Email address used for notifications and account linkage */
                    fun email(email: String) = email(JsonField.of(email))

                    /**
                     * Sets [Builder.email] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.email] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun email(email: JsonField<String>) = apply { this.email = email }

                    /** Your own identifiers for this person */
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

                    /** Full legal name */
                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

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
                            checkRequired("externalReferences", externalReferences).map {
                                it.toImmutable()
                            },
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
             * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * Your own identifiers for this entity
             *
             * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun externalReferences(): List<String> =
                externalReferences.getRequired("external_references")

            /**
             * Legal name of the entity
             *
             * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * @throws NovaApiJavaSpikeInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
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
             * Unlike [externalReferences], this method doesn't throw if the JSON field has an
             * unexpected type.
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
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** Your own identifiers for this entity */
                fun externalReferences(externalReferences: List<String>) =
                    externalReferences(JsonField.of(externalReferences))

                /**
                 * Sets [Builder.externalReferences] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.externalReferences] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
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
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun type(type: EntityType) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [EntityType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun type(type: JsonField<EntityType>) = apply { this.type = type }

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
                        checkRequired("externalReferences", externalReferences).map {
                            it.toImmutable()
                        },
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

        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val STAGED = of("staged")

                @JvmField val RECIPIENT_CONFIRMED = of("recipient_confirmed")

                @JvmField val VERIFIED = of("verified")

                @JvmField val DISBURSED = of("disbursed")

                @JvmField val FAILED = of("failed")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                STAGED,
                RECIPIENT_CONFIRMED,
                VERIFIED,
                DISBURSED,
                FAILED,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                STAGED,
                RECIPIENT_CONFIRMED,
                VERIFIED,
                DISBURSED,
                FAILED,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws NovaApiJavaSpikeInvalidDataException if this class instance's value is a not
             *   a known member.
             */
            fun known(): Known =
                when (this) {
                    STAGED -> Known.STAGED
                    RECIPIENT_CONFIRMED -> Known.RECIPIENT_CONFIRMED
                    VERIFIED -> Known.VERIFIED
                    DISBURSED -> Known.DISBURSED
                    FAILED -> Known.FAILED
                    else -> throw NovaApiJavaSpikeInvalidDataException("Unknown Status: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws NovaApiJavaSpikeInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    NovaApiJavaSpikeInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Status = apply {
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Status && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Payment &&
                id == other.id &&
                amount == other.amount &&
                contacts == other.contacts &&
                currency == other.currency &&
                entity == other.entity &&
                recipientConfirmedAt == other.recipientConfirmedAt &&
                status == other.status &&
                verifiedAt == other.verifiedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                amount,
                contacts,
                currency,
                entity,
                recipientConfirmedAt,
                status,
                verifiedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Payment{id=$id, amount=$amount, contacts=$contacts, currency=$currency, entity=$entity, recipientConfirmedAt=$recipientConfirmedAt, status=$status, verifiedAt=$verifiedAt, additionalProperties=$additionalProperties}"
    }

    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val DRAFT = of("draft")

            @JvmField val PUBLISHED = of("published")

            @JvmField val APPROVED = of("approved")

            @JvmField val EXECUTED = of("executed")

            @JvmField val CANCELLED = of("cancelled")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            DRAFT,
            PUBLISHED,
            APPROVED,
            EXECUTED,
            CANCELLED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DRAFT,
            PUBLISHED,
            APPROVED,
            EXECUTED,
            CANCELLED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                DRAFT -> Value.DRAFT
                PUBLISHED -> Value.PUBLISHED
                APPROVED -> Value.APPROVED
                EXECUTED -> Value.EXECUTED
                CANCELLED -> Value.CANCELLED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws NovaApiJavaSpikeInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                DRAFT -> Known.DRAFT
                PUBLISHED -> Known.PUBLISHED
                APPROVED -> Known.APPROVED
                EXECUTED -> Known.EXECUTED
                CANCELLED -> Known.CANCELLED
                else -> throw NovaApiJavaSpikeInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws NovaApiJavaSpikeInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                NovaApiJavaSpikeInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): Status = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Distribution &&
            id == other.id &&
            approvedAt == other.approvedAt &&
            cancelledAt == other.cancelledAt &&
            createdAt == other.createdAt &&
            distributionDate == other.distributionDate &&
            executedAt == other.executedAt &&
            name == other.name &&
            payments == other.payments &&
            publishedAt == other.publishedAt &&
            shortId == other.shortId &&
            status == other.status &&
            updatedAt == other.updatedAt &&
            vehicleId == other.vehicleId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            approvedAt,
            cancelledAt,
            createdAt,
            distributionDate,
            executedAt,
            name,
            payments,
            publishedAt,
            shortId,
            status,
            updatedAt,
            vehicleId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Distribution{id=$id, approvedAt=$approvedAt, cancelledAt=$cancelledAt, createdAt=$createdAt, distributionDate=$distributionDate, executedAt=$executedAt, name=$name, payments=$payments, publishedAt=$publishedAt, shortId=$shortId, status=$status, updatedAt=$updatedAt, vehicleId=$vehicleId, additionalProperties=$additionalProperties}"
}
