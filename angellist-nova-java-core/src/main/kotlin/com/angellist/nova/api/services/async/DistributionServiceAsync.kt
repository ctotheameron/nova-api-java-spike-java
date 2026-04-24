// File generated from our OpenAPI spec by Stainless.

package com.angellist.nova.api.services.async

import com.angellist.nova.api.core.ClientOptions
import com.angellist.nova.api.core.RequestOptions
import com.angellist.nova.api.core.http.HttpResponseFor
import com.angellist.nova.api.models.distributions.Distribution
import com.angellist.nova.api.models.distributions.DistributionCreateParams
import com.angellist.nova.api.models.distributions.DistributionRetrieveParams
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
    fun retrieve(id: String): CompletableFuture<Distribution> =
        retrieve(id, DistributionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DistributionRetrieveParams = DistributionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Distribution> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DistributionRetrieveParams = DistributionRetrieveParams.none(),
    ): CompletableFuture<Distribution> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DistributionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Distribution>

    /** @see retrieve */
    fun retrieve(params: DistributionRetrieveParams): CompletableFuture<Distribution> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Distribution> =
        retrieve(id, DistributionRetrieveParams.none(), requestOptions)

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
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<Distribution>> =
            retrieve(id, DistributionRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: DistributionRetrieveParams = DistributionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Distribution>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: DistributionRetrieveParams = DistributionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Distribution>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: DistributionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Distribution>>

        /** @see retrieve */
        fun retrieve(
            params: DistributionRetrieveParams
        ): CompletableFuture<HttpResponseFor<Distribution>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Distribution>> =
            retrieve(id, DistributionRetrieveParams.none(), requestOptions)
    }
}
