// File generated from our OpenAPI spec by Stainless.

package com.angellist.nova.api.core

import com.angellist.nova.api.core.http.HttpClient
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.junit.jupiter.MockitoExtension
import org.mockito.kotlin.mock
import org.mockito.kotlin.never
import org.mockito.kotlin.verify

@ExtendWith(MockitoExtension::class)
internal class ClientOptionsTest {

    private val httpClient = mock<HttpClient>()

    @Test
    fun putHeader_canOverwriteDefaultHeader() {
        val clientOptions =
            ClientOptions.builder()
                .httpClient(httpClient)
                .putHeader("User-Agent", "My User Agent")
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()

        assertThat(clientOptions.headers.values("User-Agent")).containsExactly("My User Agent")
    }

    @Test
    fun toBuilder_organizationIdCanBeUpdated() {
        var clientOptions =
            ClientOptions.builder()
                .httpClient(httpClient)
                .organizationId("My Organization ID")
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()

        clientOptions =
            clientOptions.toBuilder().organizationId("another My Organization ID").build()

        assertThat(clientOptions.headers.values("X-Organization-Id"))
            .containsExactly("another My Organization ID")
    }

    @Test
    fun toBuilder_oAuth2CanBeUpdated() {
        var clientOptions =
            ClientOptions.builder()
                .httpClient(httpClient)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()

        clientOptions = clientOptions

        assertThat(clientOptions.headers.values("Authorization")).containsExactly(null)
    }

    @Test
    fun toBuilder_whenOriginalClientOptionsGarbageCollected_doesNotCloseOriginalClient() {
        var clientOptions =
            ClientOptions.builder()
                .httpClient(httpClient)
                .clientId("My Client ID")
                .clientSecret("My Client Secret")
                .build()
        verify(httpClient, never()).close()

        // Overwrite the `clientOptions` variable so that the original `ClientOptions` is GC'd.
        clientOptions = clientOptions.toBuilder().build()
        System.gc()
        Thread.sleep(100)

        verify(httpClient, never()).close()
        // This exists so that `clientOptions` is still reachable.
        assertThat(clientOptions).isEqualTo(clientOptions)
    }
}
