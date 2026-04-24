// File generated from our OpenAPI spec by Stainless.

package com.nova_api_java_spike.api.services.blocking

import com.nova_api_java_spike.api.core.ClientOptions
import com.nova_api_java_spike.api.core.RequestOptions
import com.nova_api_java_spike.api.core.SecurityOptions
import com.nova_api_java_spike.api.core.checkRequired
import com.nova_api_java_spike.api.core.handlers.errorBodyHandler
import com.nova_api_java_spike.api.core.handlers.errorHandler
import com.nova_api_java_spike.api.core.handlers.jsonHandler
import com.nova_api_java_spike.api.core.http.HttpMethod
import com.nova_api_java_spike.api.core.http.HttpRequest
import com.nova_api_java_spike.api.core.http.HttpResponse
import com.nova_api_java_spike.api.core.http.HttpResponse.Handler
import com.nova_api_java_spike.api.core.http.HttpResponseFor
import com.nova_api_java_spike.api.core.http.json
import com.nova_api_java_spike.api.core.http.parseable
import com.nova_api_java_spike.api.core.prepare
import com.nova_api_java_spike.api.models.distributions.Distribution
import com.nova_api_java_spike.api.models.distributions.DistributionCreateParams
import com.nova_api_java_spike.api.models.distributions.DistributionRetrieveParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Create and inspect fund distributions */
class DistributionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DistributionService {

    private val withRawResponse: DistributionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DistributionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DistributionService =
        DistributionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: DistributionCreateParams,
        requestOptions: RequestOptions,
    ): Distribution =
        // post /distributions
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: DistributionRetrieveParams,
        requestOptions: RequestOptions,
    ): Distribution =
        // get /distributions/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DistributionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DistributionService.WithRawResponse =
            DistributionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Distribution> =
            jsonHandler<Distribution>(clientOptions.jsonMapper)

        override fun create(
            params: DistributionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Distribution> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("distributions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params, SecurityOptions.none())
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<Distribution> =
            jsonHandler<Distribution>(clientOptions.jsonMapper)

        override fun retrieve(
            params: DistributionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Distribution> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("distributions", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params, SecurityOptions.none())
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
