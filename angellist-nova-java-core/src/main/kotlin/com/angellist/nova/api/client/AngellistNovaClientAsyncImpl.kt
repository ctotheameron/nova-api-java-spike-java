// File generated from our OpenAPI spec by Stainless.

package com.angellist.nova.api.client

import com.angellist.nova.api.core.ClientOptions
import com.angellist.nova.api.core.getPackageVersion
import com.angellist.nova.api.services.async.DistributionServiceAsync
import com.angellist.nova.api.services.async.DistributionServiceAsyncImpl
import com.angellist.nova.api.services.async.EntityServiceAsync
import com.angellist.nova.api.services.async.EntityServiceAsyncImpl
import com.angellist.nova.api.services.async.PersonServiceAsync
import com.angellist.nova.api.services.async.PersonServiceAsyncImpl
import java.util.function.Consumer

class AngellistNovaClientAsyncImpl(private val clientOptions: ClientOptions) :
    AngellistNovaClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: AngellistNovaClient by lazy { AngellistNovaClientImpl(clientOptions) }

    private val withRawResponse: AngellistNovaClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val entities: EntityServiceAsync by lazy {
        EntityServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val persons: PersonServiceAsync by lazy {
        PersonServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val distributions: DistributionServiceAsync by lazy {
        DistributionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): AngellistNovaClient = sync

    override fun withRawResponse(): AngellistNovaClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AngellistNovaClientAsync =
        AngellistNovaClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun entities(): EntityServiceAsync = entities

    override fun persons(): PersonServiceAsync = persons

    /** Create and inspect fund distributions */
    override fun distributions(): DistributionServiceAsync = distributions

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AngellistNovaClientAsync.WithRawResponse {

        private val entities: EntityServiceAsync.WithRawResponse by lazy {
            EntityServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val persons: PersonServiceAsync.WithRawResponse by lazy {
            PersonServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val distributions: DistributionServiceAsync.WithRawResponse by lazy {
            DistributionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AngellistNovaClientAsync.WithRawResponse =
            AngellistNovaClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun entities(): EntityServiceAsync.WithRawResponse = entities

        override fun persons(): PersonServiceAsync.WithRawResponse = persons

        /** Create and inspect fund distributions */
        override fun distributions(): DistributionServiceAsync.WithRawResponse = distributions
    }
}
