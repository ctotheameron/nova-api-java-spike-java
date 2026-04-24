// File generated from our OpenAPI spec by Stainless.

package com.nova_api_java_spike.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.nova_api_java_spike.api.core.ClientOptions
import com.nova_api_java_spike.api.core.RequestOptions
import com.nova_api_java_spike.api.core.http.HttpResponseFor
import com.nova_api_java_spike.api.models.distributions.Distribution
import com.nova_api_java_spike.api.models.distributions.DistributionCreateParams
import com.nova_api_java_spike.api.models.distributions.DistributionRetrieveParams
import java.util.function.Consumer

/** Create and inspect fund distributions */
interface DistributionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DistributionService

    /**
     * Stages a new fund distribution with one or more payments. Each payment targets a single
     * receiving entity (either referenced by id or created inline) and one or more people
     * associated with that entity.
     */
    fun create(params: DistributionCreateParams): Distribution =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DistributionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Distribution

    /** Retrieve a distribution with aggregated payment status. */
    fun retrieve(id: String, params: DistributionRetrieveParams): Distribution =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DistributionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Distribution = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: DistributionRetrieveParams): Distribution =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DistributionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Distribution

    /**
     * A view of [DistributionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DistributionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /distributions`, but is otherwise the same as
         * [DistributionService.create].
         */
        @MustBeClosed
        fun create(params: DistributionCreateParams): HttpResponseFor<Distribution> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: DistributionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Distribution>

        /**
         * Returns a raw HTTP response for `get /distributions/{id}`, but is otherwise the same as
         * [DistributionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: DistributionRetrieveParams,
        ): HttpResponseFor<Distribution> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: DistributionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Distribution> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: DistributionRetrieveParams): HttpResponseFor<Distribution> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DistributionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Distribution>
    }
}
