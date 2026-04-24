// File generated from our OpenAPI spec by Stainless.

package io.github.ctotheameron.services.async

import io.github.ctotheameron.core.ClientOptions
import io.github.ctotheameron.core.RequestOptions
import io.github.ctotheameron.core.checkRequired
import io.github.ctotheameron.core.handlers.errorBodyHandler
import io.github.ctotheameron.core.handlers.errorHandler
import io.github.ctotheameron.core.handlers.jsonHandler
import io.github.ctotheameron.core.http.HttpMethod
import io.github.ctotheameron.core.http.HttpRequest
import io.github.ctotheameron.core.http.HttpResponse
import io.github.ctotheameron.core.http.HttpResponse.Handler
import io.github.ctotheameron.core.http.HttpResponseFor
import io.github.ctotheameron.core.http.json
import io.github.ctotheameron.core.http.parseable
import io.github.ctotheameron.core.prepareAsync
import io.github.ctotheameron.models.distributions.Distribution
import io.github.ctotheameron.models.distributions.DistributionCreateParams
import io.github.ctotheameron.models.distributions.DistributionRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Create and inspect fund distributions */
class DistributionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DistributionServiceAsync {

    private val withRawResponse: DistributionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DistributionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DistributionServiceAsync =
        DistributionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: DistributionCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Distribution> =
        // post /distributions
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: DistributionRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Distribution> =
        // get /distributions/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DistributionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DistributionServiceAsync.WithRawResponse =
            DistributionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Distribution> =
            jsonHandler<Distribution>(clientOptions.jsonMapper)

        override fun create(
            params: DistributionCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Distribution>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("distributions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<Distribution> =
            jsonHandler<Distribution>(clientOptions.jsonMapper)

        override fun retrieve(
            params: DistributionRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Distribution>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("distributions", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
