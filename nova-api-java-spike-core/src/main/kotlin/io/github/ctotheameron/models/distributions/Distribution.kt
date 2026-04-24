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
import io.github.ctotheameron.core.checkKnown
import io.github.ctotheameron.core.checkRequired
import io.github.ctotheameron.core.toImmutable
import io.github.ctotheameron.errors.AngellistNovaJavaSpikeInvalidDataException
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
    private val payments: JsonField<List<DistributionPayment>>,
    private val publishedAt: JsonField<OffsetDateTime>,
    private val shortId: JsonField<String>,
    private val status: JsonField<DistributionStatus>,
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
        payments: JsonField<List<DistributionPayment>> = JsonMissing.of(),
        @JsonProperty("published_at")
        @ExcludeMissing
        publishedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("short_id") @ExcludeMissing shortId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<DistributionStatus> = JsonMissing.of(),
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
     * @throws AngellistNovaJavaSpikeInvalidDataException if the JSON field has an unexpected type
     *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws AngellistNovaJavaSpikeInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun approvedAt(): Optional<OffsetDateTime> = approvedAt.getOptional("approved_at")

    /**
     * @throws AngellistNovaJavaSpikeInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun cancelledAt(): Optional<OffsetDateTime> = cancelledAt.getOptional("cancelled_at")

    /**
     * @throws AngellistNovaJavaSpikeInvalidDataException if the JSON field has an unexpected type
     *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * Distribution date
     *
     * @throws AngellistNovaJavaSpikeInvalidDataException if the JSON field has an unexpected type
     *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun distributionDate(): OffsetDateTime = distributionDate.getRequired("distribution_date")

    /**
     * @throws AngellistNovaJavaSpikeInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun executedAt(): Optional<OffsetDateTime> = executedAt.getOptional("executed_at")

    /**
     * @throws AngellistNovaJavaSpikeInvalidDataException if the JSON field has an unexpected type
     *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws AngellistNovaJavaSpikeInvalidDataException if the JSON field has an unexpected type
     *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun payments(): List<DistributionPayment> = payments.getRequired("payments")

    /**
     * @throws AngellistNovaJavaSpikeInvalidDataException if the JSON field has an unexpected type
     *   (e.g. if the server responded with an unexpected value).
     */
    fun publishedAt(): Optional<OffsetDateTime> = publishedAt.getOptional("published_at")

    /**
     * @throws AngellistNovaJavaSpikeInvalidDataException if the JSON field has an unexpected type
     *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun shortId(): String = shortId.getRequired("short_id")

    /**
     * @throws AngellistNovaJavaSpikeInvalidDataException if the JSON field has an unexpected type
     *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): DistributionStatus = status.getRequired("status")

    /**
     * @throws AngellistNovaJavaSpikeInvalidDataException if the JSON field has an unexpected type
     *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * UUID of the vehicle this distribution pays from
     *
     * @throws AngellistNovaJavaSpikeInvalidDataException if the JSON field has an unexpected type
     *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected value).
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
    @JsonProperty("payments")
    @ExcludeMissing
    fun _payments(): JsonField<List<DistributionPayment>> = payments

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
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<DistributionStatus> = status

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
        private var payments: JsonField<MutableList<DistributionPayment>>? = null
        private var publishedAt: JsonField<OffsetDateTime>? = null
        private var shortId: JsonField<String>? = null
        private var status: JsonField<DistributionStatus>? = null
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

        fun payments(payments: List<DistributionPayment>) = payments(JsonField.of(payments))

        /**
         * Sets [Builder.payments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payments] with a well-typed `List<DistributionPayment>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun payments(payments: JsonField<List<DistributionPayment>>) = apply {
            this.payments = payments.map { it.toMutableList() }
        }

        /**
         * Adds a single [DistributionPayment] to [payments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPayment(payment: DistributionPayment) = apply {
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

        fun status(status: DistributionStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [DistributionStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<DistributionStatus>) = apply { this.status = status }

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
