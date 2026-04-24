// File generated from our OpenAPI spec by Stainless.

package io.github.ctotheameron.models.entities

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.github.ctotheameron.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AchInfoTest {

    @Test
    fun create() {
        val achInfo =
            AchInfo.builder()
                .accountNumber("123456789")
                .bankName("Bank of America")
                .beneficiaryName("Jane Doe")
                .routingNumber("021000021")
                .branchCode("123456")
                .build()

        assertThat(achInfo.accountNumber()).isEqualTo("123456789")
        assertThat(achInfo.bankName()).isEqualTo("Bank of America")
        assertThat(achInfo.beneficiaryName()).isEqualTo("Jane Doe")
        assertThat(achInfo.routingNumber()).isEqualTo("021000021")
        assertThat(achInfo.branchCode()).contains("123456")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val achInfo =
            AchInfo.builder()
                .accountNumber("123456789")
                .bankName("Bank of America")
                .beneficiaryName("Jane Doe")
                .routingNumber("021000021")
                .branchCode("123456")
                .build()

        val roundtrippedAchInfo =
            jsonMapper.readValue(jsonMapper.writeValueAsString(achInfo), jacksonTypeRef<AchInfo>())

        assertThat(roundtrippedAchInfo).isEqualTo(achInfo)
    }
}
