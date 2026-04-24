// File generated from our OpenAPI spec by Stainless.

package com.angellist.nova.api.services.async

import com.angellist.nova.api.core.ClientOptions
import com.angellist.nova.api.core.RequestOptions
import com.angellist.nova.api.core.checkRequired
import com.angellist.nova.api.core.handlers.errorBodyHandler
import com.angellist.nova.api.core.handlers.errorHandler
import com.angellist.nova.api.core.handlers.jsonHandler
import com.angellist.nova.api.core.http.HttpMethod
import com.angellist.nova.api.core.http.HttpRequest
import com.angellist.nova.api.core.http.HttpResponse
import com.angellist.nova.api.core.http.HttpResponse.Handler
import com.angellist.nova.api.core.http.HttpResponseFor
import com.angellist.nova.api.core.http.json
import com.angellist.nova.api.core.http.parseable
import com.angellist.nova.api.core.prepareAsync
import com.angellist.nova.api.models.distributions.Distribution
import com.angellist.nova.api.models.distributions.DistributionCreateParams
import com.angellist.nova.api.models.distributions.DistributionRetrieveParams
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
