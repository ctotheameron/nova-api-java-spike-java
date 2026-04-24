// File generated from our OpenAPI spec by Stainless.

package com.nova_api_java_spike.api.client

import com.nova_api_java_spike.api.core.ClientOptions
import com.nova_api_java_spike.api.core.getPackageVersion
import com.nova_api_java_spike.api.services.async.PetServiceAsync
import com.nova_api_java_spike.api.services.async.PetServiceAsyncImpl
import com.nova_api_java_spike.api.services.async.StoreServiceAsync
import com.nova_api_java_spike.api.services.async.StoreServiceAsyncImpl
import com.nova_api_java_spike.api.services.async.UserServiceAsync
import com.nova_api_java_spike.api.services.async.UserServiceAsyncImpl
import java.util.function.Consumer

class NovaApiJavaSpikeClientAsyncImpl(private val clientOptions: ClientOptions) :
    NovaApiJavaSpikeClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: NovaApiJavaSpikeClient by lazy { NovaApiJavaSpikeClientImpl(clientOptions) }

    private val withRawResponse: NovaApiJavaSpikeClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val pets: PetServiceAsync by lazy { PetServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val store: StoreServiceAsync by lazy {
        StoreServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val users: UserServiceAsync by lazy { UserServiceAsyncImpl(clientOptionsWithUserAgent) }

    override fun sync(): NovaApiJavaSpikeClient = sync

    override fun withRawResponse(): NovaApiJavaSpikeClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): NovaApiJavaSpikeClientAsync =
        NovaApiJavaSpikeClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Everything about your Pets */
    override fun pets(): PetServiceAsync = pets

    /** Access to Petstore orders */
    override fun store(): StoreServiceAsync = store

    /** Operations about user */
    override fun users(): UserServiceAsync = users

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NovaApiJavaSpikeClientAsync.WithRawResponse {

        private val pets: PetServiceAsync.WithRawResponse by lazy {
            PetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val store: StoreServiceAsync.WithRawResponse by lazy {
            StoreServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val users: UserServiceAsync.WithRawResponse by lazy {
            UserServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NovaApiJavaSpikeClientAsync.WithRawResponse =
            NovaApiJavaSpikeClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Everything about your Pets */
        override fun pets(): PetServiceAsync.WithRawResponse = pets

        /** Access to Petstore orders */
        override fun store(): StoreServiceAsync.WithRawResponse = store

        /** Operations about user */
        override fun users(): UserServiceAsync.WithRawResponse = users
    }
}
