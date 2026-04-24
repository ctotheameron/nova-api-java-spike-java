// File generated from our OpenAPI spec by Stainless.

package com.angellist.nova.api.services.async

import com.angellist.nova.api.core.ClientOptions
import java.util.function.Consumer

interface PersonServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PersonServiceAsync

    /**
     * A view of [PersonServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PersonServiceAsync.WithRawResponse
    }
}
