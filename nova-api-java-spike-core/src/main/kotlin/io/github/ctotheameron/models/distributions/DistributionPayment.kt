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
import io.github.ctotheameron.errors.AngellistNovaInvalidDataException
import io.github.ctotheameron.models.entities.Entity
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class DistributionPayment
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val amount: JsonField<Long>,
    private val contacts: JsonField<List<DistributionPaymentContact>>,
    private val currency: JsonField<Currency>,
    private val entity: JsonField<Entity>,
    private val recipientConfirmedAt: JsonField<OffsetDateTime>,
    private val status: JsonField<DistributionPaymentStatus>,
    private val verifiedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("contacts")
        @ExcludeMissing
        contacts: JsonField<List<DistributionPaymentContact>> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("entity") @ExcludeMissing entity: JsonField<Entity> = JsonMissing.of(),
        @JsonProperty("recipient_confirmed_at")
        @ExcludeMissing
        recipientConfirmedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<DistributionPaymentStatus> = JsonMissing.of(),
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
     * @throws AngellistNovaInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Amount in the smallest currency unit
     *
     * @throws AngellistNovaInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * Each contact is linked to the entity (created if provided inline) and, when `notify` is true,
     * emailed when the payment is published.
     *
     * @throws AngellistNovaInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contacts(): List<DistributionPaymentContact> = contacts.getRequired("contacts")

    /**
     * ISO 4217 currency code (USD-only currently)
     *
     * @throws AngellistNovaInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * @throws AngellistNovaInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun entity(): Entity = entity.getRequired("entity")

    /**
     * @throws AngellistNovaInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun recipientConfirmedAt(): Optional<OffsetDateTime> =
        recipientConfirmedAt.getOptional("recipient_confirmed_at")

    /**
     * @throws AngellistNovaInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): DistributionPaymentStatus = status.getRequired("status")

    /**
     * @throws AngellistNovaInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
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
    fun _contacts(): JsonField<List<DistributionPaymentContact>> = contacts

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
     * Unlike [recipientConfirmedAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("recipient_confirmed_at")
    @ExcludeMissing
    fun _recipientConfirmedAt(): JsonField<OffsetDateTime> = recipientConfirmedAt

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status")
    @ExcludeMissing
    fun _status(): JsonField<DistributionPaymentStatus> = status

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
         * Returns a mutable builder for constructing an instance of [DistributionPayment].
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

    /** A builder for [DistributionPayment]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var amount: JsonField<Long>? = null
        private var contacts: JsonField<MutableList<DistributionPaymentContact>>? = null
        private var currency: JsonField<Currency>? = null
        private var entity: JsonField<Entity>? = null
        private var recipientConfirmedAt: JsonField<OffsetDateTime>? = null
        private var status: JsonField<DistributionPaymentStatus>? = null
        private var verifiedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(distributionPayment: DistributionPayment) = apply {
            id = distributionPayment.id
            amount = distributionPayment.amount
            contacts = distributionPayment.contacts.map { it.toMutableList() }
            currency = distributionPayment.currency
            entity = distributionPayment.entity
            recipientConfirmedAt = distributionPayment.recipientConfirmedAt
            status = distributionPayment.status
            verifiedAt = distributionPayment.verifiedAt
            additionalProperties = distributionPayment.additionalProperties.toMutableMap()
        }

        /** UUID of the distribution payment */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Amount in the smallest currency unit */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /**
         * Each contact is linked to the entity (created if provided inline) and, when `notify` is
         * true, emailed when the payment is published.
         */
        fun contacts(contacts: List<DistributionPaymentContact>) = contacts(JsonField.of(contacts))

        /**
         * Sets [Builder.contacts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contacts] with a well-typed
         * `List<DistributionPaymentContact>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun contacts(contacts: JsonField<List<DistributionPaymentContact>>) = apply {
            this.contacts = contacts.map { it.toMutableList() }
        }

        /**
         * Adds a single [DistributionPaymentContact] to [contacts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addContact(contact: DistributionPaymentContact) = apply {
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
         * You should usually call [Builder.currency] with a well-typed [Currency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        fun entity(entity: Entity) = entity(JsonField.of(entity))

        /**
         * Sets [Builder.entity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entity] with a well-typed [Entity] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * You should usually call [Builder.recipientConfirmedAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun recipientConfirmedAt(recipientConfirmedAt: JsonField<OffsetDateTime>) = apply {
            this.recipientConfirmedAt = recipientConfirmedAt
        }

        fun status(status: DistributionPaymentStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [DistributionPaymentStatus]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun status(status: JsonField<DistributionPaymentStatus>) = apply { this.status = status }

        fun verifiedAt(verifiedAt: OffsetDateTime?) = verifiedAt(JsonField.ofNullable(verifiedAt))

        /** Alias for calling [Builder.verifiedAt] with `verifiedAt.orElse(null)`. */
        fun verifiedAt(verifiedAt: Optional<OffsetDateTime>) = verifiedAt(verifiedAt.getOrNull())

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
         * Returns an immutable instance of [DistributionPayment].
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
        fun build(): DistributionPayment =
            DistributionPayment(
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

    fun validate(): DistributionPayment = apply {
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (amount.asKnown().isPresent) 1 else 0) +
            (contacts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (currency.asKnown().getOrNull()?.validity() ?: 0) +
            (entity.asKnown().getOrNull()?.validity() ?: 0) +
            (if (recipientConfirmedAt.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (verifiedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DistributionPayment &&
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
        "DistributionPayment{id=$id, amount=$amount, contacts=$contacts, currency=$currency, entity=$entity, recipientConfirmedAt=$recipientConfirmedAt, status=$status, verifiedAt=$verifiedAt, additionalProperties=$additionalProperties}"
}
