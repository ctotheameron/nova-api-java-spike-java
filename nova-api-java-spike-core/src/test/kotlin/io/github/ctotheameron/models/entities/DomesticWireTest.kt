// File generated from our OpenAPI spec by Stainless.

package io.github.ctotheameron.models.entities

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.github.ctotheameron.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DomesticWireTest {

    @Test
    fun create() {
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

        assertThat(domesticWire.accountNumber()).isEqualTo("123456789")
        assertThat(domesticWire.address())
            .isEqualTo(
                WireAddress.builder()
                    .city("San Francisco")
                    .countryCode("US")
                    .street1("123 Main St")
                    .postalCode("94105")
                    .state("CA")
                    .street2("Suite 100")
                    .build()
            )
        assertThat(domesticWire.bankName()).isEqualTo("Bank of America")
        assertThat(domesticWire.beneficiaryName()).isEqualTo("Jane Doe")
        assertThat(domesticWire.routingNumber()).isEqualTo("021000021")
        assertThat(domesticWire.branchCode()).contains("123456")
        assertThat(domesticWire.intermediaryPartyName()).contains("Intermediary Bank")
        assertThat(domesticWire.intermediaryPartySwiftCode()).contains("INTBANKXXX")
        assertThat(domesticWire.originatorToBeneficiaryInstructionsLine1())
            .contains("For further credit to Jane Doe")
        assertThat(domesticWire.originatorToBeneficiaryInstructionsLine2())
            .contains("Invoice #12345")
        assertThat(domesticWire.originatorToBeneficiaryInstructionsLine3())
            .contains("Attn: Accounts Payable")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
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

        val roundtrippedDomesticWire =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(domesticWire),
                jacksonTypeRef<DomesticWire>(),
            )

        assertThat(roundtrippedDomesticWire).isEqualTo(domesticWire)
    }
}
