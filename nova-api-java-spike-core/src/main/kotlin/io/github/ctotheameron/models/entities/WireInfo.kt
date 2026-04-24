// File generated from our OpenAPI spec by Stainless.

package io.github.ctotheameron.models.entities

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.github.ctotheameron.core.BaseDeserializer
import io.github.ctotheameron.core.BaseSerializer
import io.github.ctotheameron.core.JsonValue
import io.github.ctotheameron.core.getOrThrow
import io.github.ctotheameron.errors.NovaApiJavaSpikeInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** US ACH payment */
@JsonDeserialize(using = WireInfo.Deserializer::class)
@JsonSerialize(using = WireInfo.Serializer::class)
class WireInfo
private constructor(
    private val ach: AchInfo? = null,
    private val domesticWire: DomesticWire? = null,
    private val internationalWire: InternationalWireInfo? = null,
    private val _json: JsonValue? = null,
) {

    /** US ACH payment */
    fun ach(): Optional<AchInfo> = Optional.ofNullable(ach)

    /** US domestic wire */
    fun domesticWire(): Optional<DomesticWire> = Optional.ofNullable(domesticWire)

    /** International wire */
    fun internationalWire(): Optional<InternationalWireInfo> =
        Optional.ofNullable(internationalWire)

    fun isAch(): Boolean = ach != null

    fun isDomesticWire(): Boolean = domesticWire != null

    fun isInternationalWire(): Boolean = internationalWire != null

    /** US ACH payment */
    fun asAch(): AchInfo = ach.getOrThrow("ach")

    /** US domestic wire */
    fun asDomesticWire(): DomesticWire = domesticWire.getOrThrow("domesticWire")

    /** International wire */
    fun asInternationalWire(): InternationalWireInfo =
        internationalWire.getOrThrow("internationalWire")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            ach != null -> visitor.visitAch(ach)
            domesticWire != null -> visitor.visitDomesticWire(domesticWire)
            internationalWire != null -> visitor.visitInternationalWire(internationalWire)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): WireInfo = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitAch(ach: AchInfo) {
                    ach.validate()
                }

                override fun visitDomesticWire(domesticWire: DomesticWire) {
                    domesticWire.validate()
                }

                override fun visitInternationalWire(internationalWire: InternationalWireInfo) {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitAch(ach: AchInfo) = ach.validity()

                override fun visitDomesticWire(domesticWire: DomesticWire) = domesticWire.validity()

                override fun visitInternationalWire(internationalWire: InternationalWireInfo) =
                    internationalWire.validity()

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

    override fun hashCode(): Int = Objects.hash(ach, domesticWire, internationalWire)

    override fun toString(): String =
        when {
            ach != null -> "WireInfo{ach=$ach}"
            domesticWire != null -> "WireInfo{domesticWire=$domesticWire}"
            internationalWire != null -> "WireInfo{internationalWire=$internationalWire}"
            _json != null -> "WireInfo{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid WireInfo")
        }

    companion object {

        /** US ACH payment */
        @JvmStatic fun ofAch(ach: AchInfo) = WireInfo(ach = ach)

        /** US domestic wire */
        @JvmStatic
        fun ofDomesticWire(domesticWire: DomesticWire) = WireInfo(domesticWire = domesticWire)

        /** International wire */
        @JvmStatic
        fun ofInternationalWire(internationalWire: InternationalWireInfo) =
            WireInfo(internationalWire = internationalWire)
    }

    /** An interface that defines how to map each variant of [WireInfo] to a value of type [T]. */
    interface Visitor<out T> {

        /** US ACH payment */
        fun visitAch(ach: AchInfo): T

        /** US domestic wire */
        fun visitDomesticWire(domesticWire: DomesticWire): T

        /** International wire */
        fun visitInternationalWire(internationalWire: InternationalWireInfo): T

        /**
         * Maps an unknown variant of [WireInfo] to a value of type [T].
         *
         * An instance of [WireInfo] can contain an unknown variant if it was deserialized from data
         * that doesn't match any known variant. For example, if the SDK is on an older version than
         * the API, then the API may respond with new variants that the SDK is unaware of.
         *
         * @throws NovaApiJavaSpikeInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw NovaApiJavaSpikeInvalidDataException("Unknown WireInfo: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<WireInfo>(WireInfo::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): WireInfo {
            val json = JsonValue.fromJsonNode(node)
            val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

            when (type) {
                "ach" -> {
                    return tryDeserialize(node, jacksonTypeRef<AchInfo>())?.let {
                        WireInfo(ach = it, _json = json)
                    } ?: WireInfo(_json = json)
                }
                "domestic_wire" -> {
                    return tryDeserialize(node, jacksonTypeRef<DomesticWire>())?.let {
                        WireInfo(domesticWire = it, _json = json)
                    } ?: WireInfo(_json = json)
                }
                "international_wire" -> {
                    return tryDeserialize(node, jacksonTypeRef<InternationalWireInfo>())?.let {
                        WireInfo(internationalWire = it, _json = json)
                    } ?: WireInfo(_json = json)
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
                value.domesticWire != null -> generator.writeObject(value.domesticWire)
                value.internationalWire != null -> generator.writeObject(value.internationalWire)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid WireInfo")
            }
        }
    }
}
