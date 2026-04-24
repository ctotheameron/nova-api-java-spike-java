// File generated from our OpenAPI spec by Stainless.

package com.nova_api_java_spike.api.services.blocking.store

import com.nova_api_java_spike.api.client.okhttp.NovaApiJavaSpikeOkHttpClient
import com.nova_api_java_spike.api.models.Order
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OrderServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = NovaApiJavaSpikeOkHttpClient.builder().apiKey("My API Key").build()
        val orderService = client.store().orders()

        val order =
            orderService.create(
                Order.builder()
                    .id(10L)
                    .complete(true)
                    .petId(198772L)
                    .quantity(7)
                    .shipDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(Order.Status.APPROVED)
                    .build()
            )

        order.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = NovaApiJavaSpikeOkHttpClient.builder().apiKey("My API Key").build()
        val orderService = client.store().orders()

        val order = orderService.retrieve(0L)

        order.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = NovaApiJavaSpikeOkHttpClient.builder().apiKey("My API Key").build()
        val orderService = client.store().orders()

        orderService.delete(0L)
    }
}
