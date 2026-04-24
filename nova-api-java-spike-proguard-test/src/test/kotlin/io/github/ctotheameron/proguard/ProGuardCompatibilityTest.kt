// File generated from our OpenAPI spec by Stainless.

package io.github.ctotheameron.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.github.ctotheameron.client.okhttp.AngellistNovaOkHttpClient
import io.github.ctotheameron.core.jsonMapper
import io.github.ctotheameron.models.distributions.Currency
import io.github.ctotheameron.models.distributions.Distribution
import io.github.ctotheameron.models.distributions.DistributionPayment
import io.github.ctotheameron.models.distributions.DistributionPaymentContact
import io.github.ctotheameron.models.distributions.DistributionPaymentStatus
import io.github.ctotheameron.models.distributions.DistributionStatus
import io.github.ctotheameron.models.entities.AchInfo
import io.github.ctotheameron.models.entities.Entity
import io.github.ctotheameron.models.entities.EntityType
import io.github.ctotheameron.models.entities.WireInfo
import io.github.ctotheameron.models.persons.Person
import java.time.OffsetDateTime
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream(
                "META-INF/proguard/nova-api-java-spike-core.pro"
            )

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client =
            AngellistNovaOkHttpClient.builder()
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()

        assertThat(client).isNotNull()
        assertThat(client.entities()).isNotNull()
        assertThat(client.persons()).isNotNull()
        assertThat(client.distributions()).isNotNull()
    }

    @Test
    fun distributionRoundtrip() {
        val jsonMapper = jsonMapper()
        val distribution =
            Distribution.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .approvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .distributionDate(OffsetDateTime.parse("2024-04-20T00:00:00Z"))
                .executedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("April 20th Distribution from XYZ Sale")
                .addPayment(
                    DistributionPayment.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amount(1000L)
                        .addContact(
                            DistributionPaymentContact.builder()
                                .notify(true)
                                .person(
                                    Person.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .email("jane.doe@example.com")
                                        .addExternalReference("person-123")
                                        .name("Jane Doe")
                                        .build()
                                )
                                .build()
                        )
                        .currency(Currency.USD)
                        .entity(
                            Entity.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .addExternalReference("entity-123")
                                .name("Jane Doe, LLC")
                                .type(EntityType.INDIVIDUAL)
                                .build()
                        )
                        .recipientConfirmedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .status(DistributionPaymentStatus.STAGED)
                        .verifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .shortId("short_id")
                .status(DistributionStatus.DRAFT)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .vehicleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedDistribution =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(distribution),
                jacksonTypeRef<Distribution>(),
            )

        assertThat(roundtrippedDistribution).isEqualTo(distribution)
    }

    @Test
    fun wireInfoRoundtrip() {
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
    fun currencyRoundtrip() {
        val jsonMapper = jsonMapper()
        val currency = Currency.USD

        val roundtrippedCurrency =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(currency),
                jacksonTypeRef<Currency>(),
            )

        assertThat(roundtrippedCurrency).isEqualTo(currency)
    }
}
