// File generated from our OpenAPI spec by Stainless.

package com.angellist.nova.api.models.entities

import com.angellist.nova.api.core.JsonValue
import com.angellist.nova.api.core.jsonMapper
import com.angellist.nova.api.errors.AngellistNovaInvalidDataException
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class WireInfoTest {

    @Test
    fun ofAch() {
        val ach =
            AchInfo.builder()
                .accountNumber("123456789")
                .bankName("Bank of America")
                .beneficiaryName("Jane Doe")
                .routingNumber("021000021")
                .branchCode("123456")
                .build()

        val wireInfo = WireInfo.ofAch(ach)

        assertThat(wireInfo.ach()).contains(ach)
        assertThat(wireInfo.domesticWire()).isEmpty
        assertThat(wireInfo.internationalWire()).isEmpty
    }

    @Test
    fun ofAchRoundtrip() {
        val jsonMapper = jsonMapper()
        val wireInfo =
            WireInfo.ofAch(
                AchInfo.builder()
                    .accountNumber("123456789")
                    .bankName("Bank of America")
                    .beneficiaryName("Jane Doe")
                    .routingNumber("021000021")
                    .branchCode("123456")
                    .build()
            )

        val roundtrippedWireInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(wireInfo),
                jacksonTypeRef<WireInfo>(),
            )

        assertThat(roundtrippedWireInfo).isEqualTo(wireInfo)
    }

    @Test
    fun ofDomesticWire() {
        val domesticWire =
            DomesticWire.builder()
                .accountNumber("123456789")
                .address(
                    WireAddress.builder()
                        .city("San Francisco")
                        .countryCode("US")
                        .street1("123 Main St")
                        .postalCode("94105")
                        .state("CA")
                        .street2("Suite 100")
                        .build()
                )
                .bankName("Bank of America")
                .beneficiaryName("Jane Doe")
                .routingNumber("021000021")
                .branchCode("123456")
                .intermediaryPartyName("Intermediary Bank")
                .intermediaryPartySwiftCode("INTBANKXXX")
                .originatorToBeneficiaryInstructionsLine1("For further credit to Jane Doe")
                .originatorToBeneficiaryInstructionsLine2("Invoice #12345")
                .originatorToBeneficiaryInstructionsLine3("Attn: Accounts Payable")
                .build()

        val wireInfo = WireInfo.ofDomesticWire(domesticWire)

        assertThat(wireInfo.ach()).isEmpty
        assertThat(wireInfo.domesticWire()).contains(domesticWire)
        assertThat(wireInfo.internationalWire()).isEmpty
    }

    @Test
    fun ofDomesticWireRoundtrip() {
        val jsonMapper = jsonMapper()
        val wireInfo =
            WireInfo.ofDomesticWire(
                DomesticWire.builder()
                    .accountNumber("123456789")
                    .address(
                        WireAddress.builder()
                            .city("San Francisco")
                            .countryCode("US")
                            .street1("123 Main St")
                            .postalCode("94105")
                            .state("CA")
                            .street2("Suite 100")
                            .build()
                    )
                    .bankName("Bank of America")
                    .beneficiaryName("Jane Doe")
                    .routingNumber("021000021")
                    .branchCode("123456")
                    .intermediaryPartyName("Intermediary Bank")
                    .intermediaryPartySwiftCode("INTBANKXXX")
                    .originatorToBeneficiaryInstructionsLine1("For further credit to Jane Doe")
                    .originatorToBeneficiaryInstructionsLine2("Invoice #12345")
                    .originatorToBeneficiaryInstructionsLine3("Attn: Accounts Payable")
                    .build()
            )

        val roundtrippedWireInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(wireInfo),
                jacksonTypeRef<WireInfo>(),
            )

        assertThat(roundtrippedWireInfo).isEqualTo(wireInfo)
    }

    @Test
    fun ofInternationalWire() {
        val internationalWire =
            InternationalWireInfo.builder()
                .accountNumber("123456789")
                .address(
                    WireAddress.builder()
                        .city("San Francisco")
                        .countryCode("US")
                        .street1("123 Main St")
                        .postalCode("94105")
                        .state("CA")
                        .street2("Suite 100")
                        .build()
                )
                .bankName("Bank of America")
                .beneficiaryName("Jane Doe")
                .swiftCode("swift_code")
                .branchCode("123456")
                .intermediaryPartyName("Intermediary Bank")
                .intermediaryPartySwiftCode("INTBANKXXX")
                .originatorToBeneficiaryInstructionsLine1("For further credit to Jane Doe")
                .originatorToBeneficiaryInstructionsLine2("Invoice #12345")
                .originatorToBeneficiaryInstructionsLine3("Attn: Accounts Payable")
                .build()

        val wireInfo = WireInfo.ofInternationalWire(internationalWire)

        assertThat(wireInfo.ach()).isEmpty
        assertThat(wireInfo.domesticWire()).isEmpty
        assertThat(wireInfo.internationalWire()).contains(internationalWire)
    }

    @Test
    fun ofInternationalWireRoundtrip() {
        val jsonMapper = jsonMapper()
        val wireInfo =
            WireInfo.ofInternationalWire(
                InternationalWireInfo.builder()
                    .accountNumber("123456789")
                    .address(
                        WireAddress.builder()
                            .city("San Francisco")
                            .countryCode("US")
                            .street1("123 Main St")
                            .postalCode("94105")
                            .state("CA")
                            .street2("Suite 100")
                            .build()
                    )
                    .bankName("Bank of America")
                    .beneficiaryName("Jane Doe")
                    .swiftCode("swift_code")
                    .branchCode("123456")
                    .intermediaryPartyName("Intermediary Bank")
                    .intermediaryPartySwiftCode("INTBANKXXX")
                    .originatorToBeneficiaryInstructionsLine1("For further credit to Jane Doe")
                    .originatorToBeneficiaryInstructionsLine2("Invoice #12345")
                    .originatorToBeneficiaryInstructionsLine3("Attn: Accounts Payable")
                    .build()
            )

        val roundtrippedWireInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(wireInfo),
                jacksonTypeRef<WireInfo>(),
            )

        assertThat(roundtrippedWireInfo).isEqualTo(wireInfo)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val wireInfo = jsonMapper().convertValue(testCase.value, jacksonTypeRef<WireInfo>())

        val e = assertThrows<AngellistNovaInvalidDataException> { wireInfo.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
