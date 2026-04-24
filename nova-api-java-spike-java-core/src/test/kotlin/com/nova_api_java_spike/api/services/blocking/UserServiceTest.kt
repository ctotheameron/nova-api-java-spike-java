// File generated from our OpenAPI spec by Stainless.

package com.nova_api_java_spike.api.services.blocking

import com.nova_api_java_spike.api.client.okhttp.NovaApiJavaSpikeOkHttpClient
import com.nova_api_java_spike.api.models.users.User
import com.nova_api_java_spike.api.models.users.UserLoginParams
import com.nova_api_java_spike.api.models.users.UserUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = NovaApiJavaSpikeOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.users()

        val user =
            userService.create(
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

        user.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = NovaApiJavaSpikeOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.users()

        val user = userService.retrieve("username")

        user.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = NovaApiJavaSpikeOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.users()

        userService.update(
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
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = NovaApiJavaSpikeOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.users()

        userService.delete("username")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createWithList() {
        val client = NovaApiJavaSpikeOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.users()

        val user =
            userService.createWithList(
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

        user.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun login() {
        val client = NovaApiJavaSpikeOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.users()

        userService.login(
            UserLoginParams.builder().password("password").username("username").build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun logout() {
        val client = NovaApiJavaSpikeOkHttpClient.builder().apiKey("My API Key").build()
        val userService = client.users()

        userService.logout()
    }
}
