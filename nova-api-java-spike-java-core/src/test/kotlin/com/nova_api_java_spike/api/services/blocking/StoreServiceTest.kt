// File generated from our OpenAPI spec by Stainless.

package com.nova_api_java_spike.api.services.blocking

import com.nova_api_java_spike.api.client.okhttp.NovaApiJavaSpikeOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class StoreServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun listInventory() {
        val client = NovaApiJavaSpikeOkHttpClient.builder().apiKey("My API Key").build()
        val storeService = client.store()

        val response = storeService.listInventory()

        response.validate()
    }
}
