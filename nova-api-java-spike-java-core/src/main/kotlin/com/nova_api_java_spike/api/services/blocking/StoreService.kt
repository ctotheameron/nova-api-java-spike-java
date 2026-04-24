// File generated from our OpenAPI spec by Stainless.

package com.nova_api_java_spike.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.nova_api_java_spike.api.core.ClientOptions
import com.nova_api_java_spike.api.core.RequestOptions
import com.nova_api_java_spike.api.core.http.HttpResponseFor
import com.nova_api_java_spike.api.models.store.StoreListInventoryParams
import com.nova_api_java_spike.api.models.store.StoreListInventoryResponse
import com.nova_api_java_spike.api.services.blocking.store.OrderService
import java.util.function.Consumer

/** Access to Petstore orders */
interface StoreService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StoreService

    /** Access to Petstore orders */
    fun orders(): OrderService

    /** Returns a map of status codes to quantities */
    fun listInventory(): StoreListInventoryResponse = listInventory(StoreListInventoryParams.none())

    /** @see listInventory */
    fun listInventory(
        params: StoreListInventoryParams = StoreListInventoryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StoreListInventoryResponse

    /** @see listInventory */
    fun listInventory(
        params: StoreListInventoryParams = StoreListInventoryParams.none()
    ): StoreListInventoryResponse = listInventory(params, RequestOptions.none())

    /** @see listInventory */
    fun listInventory(requestOptions: RequestOptions): StoreListInventoryResponse =
        listInventory(StoreListInventoryParams.none(), requestOptions)

    /** A view of [StoreService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): StoreService.WithRawResponse

        /** Access to Petstore orders */
        fun orders(): OrderService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /store/inventory`, but is otherwise the same as
         * [StoreService.listInventory].
         */
        @MustBeClosed
        fun listInventory(): HttpResponseFor<StoreListInventoryResponse> =
            listInventory(StoreListInventoryParams.none())

        /** @see listInventory */
        @MustBeClosed
        fun listInventory(
            params: StoreListInventoryParams = StoreListInventoryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StoreListInventoryResponse>

        /** @see listInventory */
        @MustBeClosed
        fun listInventory(
            params: StoreListInventoryParams = StoreListInventoryParams.none()
        ): HttpResponseFor<StoreListInventoryResponse> =
            listInventory(params, RequestOptions.none())

        /** @see listInventory */
        @MustBeClosed
        fun listInventory(
            requestOptions: RequestOptions
        ): HttpResponseFor<StoreListInventoryResponse> =
            listInventory(StoreListInventoryParams.none(), requestOptions)
    }
}
