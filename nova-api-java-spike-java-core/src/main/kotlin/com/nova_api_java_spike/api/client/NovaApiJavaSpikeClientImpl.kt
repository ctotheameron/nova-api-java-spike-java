// File generated from our OpenAPI spec by Stainless.

package com.nova_api_java_spike.api.client

import com.nova_api_java_spike.api.core.ClientOptions
import com.nova_api_java_spike.api.core.getPackageVersion
import com.nova_api_java_spike.api.services.blocking.DistributionService
import com.nova_api_java_spike.api.services.blocking.DistributionServiceImpl
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

    private val distributions: DistributionService by lazy {
        DistributionServiceImpl(clientOptionsWithUserAgent)
    }

    override fun async(): NovaApiJavaSpikeClientAsync = async

    override fun withRawResponse(): NovaApiJavaSpikeClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NovaApiJavaSpikeClient =
        NovaApiJavaSpikeClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Create and inspect fund distributions */
    override fun distributions(): DistributionService = distributions

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NovaApiJavaSpikeClient.WithRawResponse {

        private val distributions: DistributionService.WithRawResponse by lazy {
            DistributionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NovaApiJavaSpikeClient.WithRawResponse =
            NovaApiJavaSpikeClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Create and inspect fund distributions */
        override fun distributions(): DistributionService.WithRawResponse = distributions
    }
}
