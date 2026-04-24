// File generated from our OpenAPI spec by Stainless.

package com.nova_api_java_spike.api.services.async

import com.nova_api_java_spike.api.core.ClientOptions
import com.nova_api_java_spike.api.core.RequestOptions
import com.nova_api_java_spike.api.core.http.HttpResponseFor
import com.nova_api_java_spike.api.models.distributions.Distribution
import com.nova_api_java_spike.api.models.distributions.DistributionCreateParams
import com.nova_api_java_spike.api.models.distributions.DistributionRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Create and inspect fund distributions */
interface DistributionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DistributionServiceAsync

    /**
     * Stages a new fund distribution with one or more payments. Each payment targets a single
     * receiving entity (either referenced by id or created inline) and one or more people
     * associated with that entity.
     */
    fun create(params: DistributionCreateParams): CompletableFuture<Distribution> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DistributionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Distribution>

    /** Retrieve a distribution with aggregated payment status. */
    fun retrieve(id: String, params: DistributionRetrieveParams): CompletableFuture<Distribution> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DistributionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Distribution> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: DistributionRetrieveParams): CompletableFuture<Distribution> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DistributionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Distribution>

    /**
     * A view of [DistributionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DistributionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /distributions`, but is otherwise the same as
         * [DistributionServiceAsync.create].
         */
        fun create(
            params: DistributionCreateParams
        ): CompletableFuture<HttpResponseFor<Distribution>> = create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: DistributionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Distribution>>

        /**
         * Returns a raw HTTP response for `get /distributions/{id}`, but is otherwise the same as
         * [DistributionServiceAsync.retrieve].
         */
        fun retrieve(
            id: String,
            params: DistributionRetrieveParams,
        ): CompletableFuture<HttpResponseFor<Distribution>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: DistributionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Distribution>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: DistributionRetrieveParams
        ): CompletableFuture<HttpResponseFor<Distribution>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: DistributionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Distribution>>
    }
}
