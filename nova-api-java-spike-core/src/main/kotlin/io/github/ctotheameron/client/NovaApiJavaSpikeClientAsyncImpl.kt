// File generated from our OpenAPI spec by Stainless.

package io.github.ctotheameron.client

import io.github.ctotheameron.core.ClientOptions
import io.github.ctotheameron.core.getPackageVersion
import io.github.ctotheameron.services.async.DistributionServiceAsync
import io.github.ctotheameron.services.async.DistributionServiceAsyncImpl
import io.github.ctotheameron.services.async.EntityServiceAsync
import io.github.ctotheameron.services.async.EntityServiceAsyncImpl
import io.github.ctotheameron.services.async.PersonServiceAsync
import io.github.ctotheameron.services.async.PersonServiceAsyncImpl
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

    private val entities: EntityServiceAsync by lazy {
        EntityServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val persons: PersonServiceAsync by lazy {
        PersonServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val distributions: DistributionServiceAsync by lazy {
        DistributionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): NovaApiJavaSpikeClient = sync

    override fun withRawResponse(): NovaApiJavaSpikeClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): NovaApiJavaSpikeClientAsync =
        NovaApiJavaSpikeClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun entities(): EntityServiceAsync = entities

    override fun persons(): PersonServiceAsync = persons

    /** Create and inspect fund distributions */
    override fun distributions(): DistributionServiceAsync = distributions

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NovaApiJavaSpikeClientAsync.WithRawResponse {

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
        ): NovaApiJavaSpikeClientAsync.WithRawResponse =
            NovaApiJavaSpikeClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun entities(): EntityServiceAsync.WithRawResponse = entities

        override fun persons(): PersonServiceAsync.WithRawResponse = persons

        /** Create and inspect fund distributions */
        override fun distributions(): DistributionServiceAsync.WithRawResponse = distributions
    }
}
