// File generated from our OpenAPI spec by Stainless.

package com.nova_api_java_spike.api.services.async

import com.nova_api_java_spike.api.client.okhttp.NovaApiJavaSpikeOkHttpClientAsync
import com.nova_api_java_spike.api.models.users.User
import com.nova_api_java_spike.api.models.users.UserLoginParams
import com.nova_api_java_spike.api.models.users.UserUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = NovaApiJavaSpikeOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.users()

        val userFuture =
            userServiceAsync.create(
                User.builder()
                    .id(10L)
                    .email("john@email.com")
                    .firstName("John")
                    .lastName("James")
                    .password("12345")
                    .phone("12345")
                    .username("theUser")
                    .userStatus(1)
                    .build()
            )

        val user = userFuture.get()
        user.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = NovaApiJavaSpikeOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.users()

        val userFuture = userServiceAsync.retrieve("username")

        val user = userFuture.get()
        user.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = NovaApiJavaSpikeOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.users()

        val future =
            userServiceAsync.update(
                UserUpdateParams.builder()
                    .existingUsername("username")
                    .user(
                        User.builder()
                            .id(10L)
                            .email("john@email.com")
                            .firstName("John")
                            .lastName("James")
                            .password("12345")
                            .phone("12345")
                            .username("theUser")
                            .userStatus(1)
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = NovaApiJavaSpikeOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.users()

        val future = userServiceAsync.delete("username")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createWithList() {
        val client = NovaApiJavaSpikeOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.users()

        val userFuture =
            userServiceAsync.createWithList(
                listOf(
                    User.builder()
                        .id(10L)
                        .email("john@email.com")
                        .firstName("John")
                        .lastName("James")
                        .password("12345")
                        .phone("12345")
                        .username("theUser")
                        .userStatus(1)
                        .build()
                )
            )

        val user = userFuture.get()
        user.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun login() {
        val client = NovaApiJavaSpikeOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.users()

        val responseFuture =
            userServiceAsync.login(
                UserLoginParams.builder().password("password").username("username").build()
            )

        val response = responseFuture.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun logout() {
        val client = NovaApiJavaSpikeOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.users()

        val future = userServiceAsync.logout()

        val response = future.get()
    }
}
