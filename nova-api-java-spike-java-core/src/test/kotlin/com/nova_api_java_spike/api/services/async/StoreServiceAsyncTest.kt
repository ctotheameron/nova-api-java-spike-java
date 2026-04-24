// File generated from our OpenAPI spec by Stainless.

package com.nova_api_java_spike.api.services.async

import com.nova_api_java_spike.api.client.okhttp.NovaApiJavaSpikeOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class StoreServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun listInventory() {
        val client = NovaApiJavaSpikeOkHttpClientAsync.builder().apiKey("My API Key").build()
        val storeServiceAsync = client.store()

        val responseFuture = storeServiceAsync.listInventory()

        val response = responseFuture.get()
        response.validate()
    }
}
