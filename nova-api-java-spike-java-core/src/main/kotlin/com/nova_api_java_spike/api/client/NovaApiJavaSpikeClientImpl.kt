// File generated from our OpenAPI spec by Stainless.

package com.nova_api_java_spike.api.client

import com.nova_api_java_spike.api.core.ClientOptions
import com.nova_api_java_spike.api.core.getPackageVersion
import com.nova_api_java_spike.api.services.blocking.PetService
import com.nova_api_java_spike.api.services.blocking.PetServiceImpl
import com.nova_api_java_spike.api.services.blocking.StoreService
import com.nova_api_java_spike.api.services.blocking.StoreServiceImpl
import com.nova_api_java_spike.api.services.blocking.UserService
import com.nova_api_java_spike.api.services.blocking.UserServiceImpl
import java.util.function.Consumer

class NovaApiJavaSpikeClientImpl(private val clientOptions: ClientOptions) :
    NovaApiJavaSpikeClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: NovaApiJavaSpikeClientAsync by lazy {
        NovaApiJavaSpikeClientAsyncImpl(clientOptions)
    }

    private val withRawResponse: NovaApiJavaSpikeClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val pets: PetService by lazy { PetServiceImpl(clientOptionsWithUserAgent) }

    private val store: StoreService by lazy { StoreServiceImpl(clientOptionsWithUserAgent) }

    private val users: UserService by lazy { UserServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): NovaApiJavaSpikeClientAsync = async

    override fun withRawResponse(): NovaApiJavaSpikeClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NovaApiJavaSpikeClient =
        NovaApiJavaSpikeClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Everything about your Pets */
    override fun pets(): PetService = pets

    /** Access to Petstore orders */
    override fun store(): StoreService = store

    /** Operations about user */
    override fun users(): UserService = users

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NovaApiJavaSpikeClient.WithRawResponse {

        private val pets: PetService.WithRawResponse by lazy {
            PetServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val store: StoreService.WithRawResponse by lazy {
            StoreServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val users: UserService.WithRawResponse by lazy {
            UserServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NovaApiJavaSpikeClient.WithRawResponse =
            NovaApiJavaSpikeClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Everything about your Pets */
        override fun pets(): PetService.WithRawResponse = pets

        /** Access to Petstore orders */
        override fun store(): StoreService.WithRawResponse = store

        /** Operations about user */
        override fun users(): UserService.WithRawResponse = users
    }
}
