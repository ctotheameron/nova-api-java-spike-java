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

class AngellistNovaJavaSpikeClientAsyncImpl(private val clientOptions: ClientOptions) :
    AngellistNovaJavaSpikeClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: AngellistNovaJavaSpikeClient by lazy {
        AngellistNovaJavaSpikeClientImpl(clientOptions)
    }

    private val withRawResponse: AngellistNovaJavaSpikeClientAsync.WithRawResponse by lazy {
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

    override fun sync(): AngellistNovaJavaSpikeClient = sync

    override fun withRawResponse(): AngellistNovaJavaSpikeClientAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): AngellistNovaJavaSpikeClientAsync =
        AngellistNovaJavaSpikeClientAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun entities(): EntityServiceAsync = entities

    override fun persons(): PersonServiceAsync = persons

    /** Create and inspect fund distributions */
    override fun distributions(): DistributionServiceAsync = distributions

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AngellistNovaJavaSpikeClientAsync.WithRawResponse {

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
        ): AngellistNovaJavaSpikeClientAsync.WithRawResponse =
            AngellistNovaJavaSpikeClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun entities(): EntityServiceAsync.WithRawResponse = entities

        override fun persons(): PersonServiceAsync.WithRawResponse = persons

        /** Create and inspect fund distributions */
        override fun distributions(): DistributionServiceAsync.WithRawResponse = distributions
    }
}
