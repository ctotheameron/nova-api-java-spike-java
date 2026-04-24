// File generated from our OpenAPI spec by Stainless.

package com.nova_api_java_spike.api.services.async.store

import com.nova_api_java_spike.api.client.okhttp.NovaApiJavaSpikeOkHttpClientAsync
import com.nova_api_java_spike.api.models.Order
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OrderServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = NovaApiJavaSpikeOkHttpClientAsync.builder().apiKey("My API Key").build()
        val orderServiceAsync = client.store().orders()

        val orderFuture =
            orderServiceAsync.create(
                Order.builder()
                    .id(10L)
                    .complete(true)
                    .petId(198772L)
                    .quantity(7)
                    .shipDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(Order.Status.APPROVED)
                    .build()
            )

        val order = orderFuture.get()
        order.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = NovaApiJavaSpikeOkHttpClientAsync.builder().apiKey("My API Key").build()
        val orderServiceAsync = client.store().orders()

        val orderFuture = orderServiceAsync.retrieve(0L)

        val order = orderFuture.get()
        order.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = NovaApiJavaSpikeOkHttpClientAsync.builder().apiKey("My API Key").build()
        val orderServiceAsync = client.store().orders()

        val future = orderServiceAsync.delete(0L)

        val response = future.get()
    }
}
