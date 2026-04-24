// File generated from our OpenAPI spec by Stainless.

package com.angellist.nova.api.models.entities

import com.angellist.nova.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InternationalWireInfoTest {

    @Test
    fun create() {
        val internationalWireInfo =
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

        assertThat(internationalWireInfo.accountNumber()).isEqualTo("123456789")
        assertThat(internationalWireInfo.address())
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
        assertThat(internationalWireInfo.bankName()).isEqualTo("Bank of America")
        assertThat(internationalWireInfo.beneficiaryName()).isEqualTo("Jane Doe")
        assertThat(internationalWireInfo.swiftCode()).isEqualTo("swift_code")
        assertThat(internationalWireInfo.branchCode()).contains("123456")
        assertThat(internationalWireInfo.intermediaryPartyName()).contains("Intermediary Bank")
        assertThat(internationalWireInfo.intermediaryPartySwiftCode()).contains("INTBANKXXX")
        assertThat(internationalWireInfo.originatorToBeneficiaryInstructionsLine1())
            .contains("For further credit to Jane Doe")
        assertThat(internationalWireInfo.originatorToBeneficiaryInstructionsLine2())
            .contains("Invoice #12345")
        assertThat(internationalWireInfo.originatorToBeneficiaryInstructionsLine3())
            .contains("Attn: Accounts Payable")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val internationalWireInfo =
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

        val roundtrippedInternationalWireInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(internationalWireInfo),
                jacksonTypeRef<InternationalWireInfo>(),
            )

        assertThat(roundtrippedInternationalWireInfo).isEqualTo(internationalWireInfo)
    }
}
