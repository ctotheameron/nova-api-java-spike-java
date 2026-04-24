// File generated from our OpenAPI spec by Stainless.

package io.github.ctotheameron.client

import io.github.ctotheameron.core.ClientOptions
import io.github.ctotheameron.core.getPackageVersion
import io.github.ctotheameron.services.blocking.DistributionService
import io.github.ctotheameron.services.blocking.DistributionServiceImpl
import io.github.ctotheameron.services.blocking.EntityService
import io.github.ctotheameron.services.blocking.EntityServiceImpl
import io.github.ctotheameron.services.blocking.PersonService
import io.github.ctotheameron.services.blocking.PersonServiceImpl
import java.util.function.Consumer

class AngellistNovaClientImpl(private val clientOptions: ClientOptions) : AngellistNovaClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: AngellistNovaClientAsync by lazy {
        AngellistNovaClientAsyncImpl(clientOptions)
    }

    private val withRawResponse: AngellistNovaClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val entities: EntityService by lazy { EntityServiceImpl(clientOptionsWithUserAgent) }

    private val persons: PersonService by lazy { PersonServiceImpl(clientOptionsWithUserAgent) }

    private val distributions: DistributionService by lazy {
        DistributionServiceImpl(clientOptionsWithUserAgent)
    }

    override fun async(): AngellistNovaClientAsync = async

    override fun withRawResponse(): AngellistNovaClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AngellistNovaClient =
        AngellistNovaClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun entities(): EntityService = entities

    override fun persons(): PersonService = persons

    /** Create and inspect fund distributions */
    override fun distributions(): DistributionService = distributions

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AngellistNovaClient.WithRawResponse {

        private val entities: EntityService.WithRawResponse by lazy {
            EntityServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val persons: PersonService.WithRawResponse by lazy {
            PersonServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val distributions: DistributionService.WithRawResponse by lazy {
            DistributionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AngellistNovaClient.WithRawResponse =
            AngellistNovaClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun entities(): EntityService.WithRawResponse = entities

        override fun persons(): PersonService.WithRawResponse = persons

        /** Create and inspect fund distributions */
        override fun distributions(): DistributionService.WithRawResponse = distributions
    }
}
