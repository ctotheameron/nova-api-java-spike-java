// File generated from our OpenAPI spec by Stainless.

package com.nova_api_java_spike.api.client

import com.nova_api_java_spike.api.core.ClientOptions
import com.nova_api_java_spike.api.core.getPackageVersion
import com.nova_api_java_spike.api.services.async.DistributionServiceAsync
import com.nova_api_java_spike.api.services.async.DistributionServiceAsyncImpl
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

    private val distributions: DistributionServiceAsync by lazy {
        DistributionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): NovaApiJavaSpikeClient = sync

    override fun withRawResponse(): NovaApiJavaSpikeClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): NovaApiJavaSpikeClientAsync =
        NovaApiJavaSpikeClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Create and inspect fund distributions */
    override fun distributions(): DistributionServiceAsync = distributions

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NovaApiJavaSpikeClientAsync.WithRawResponse {

        private val distributions: DistributionServiceAsync.WithRawResponse by lazy {
            DistributionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NovaApiJavaSpikeClientAsync.WithRawResponse =
            NovaApiJavaSpikeClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Create and inspect fund distributions */
        override fun distributions(): DistributionServiceAsync.WithRawResponse = distributions
    }
}
