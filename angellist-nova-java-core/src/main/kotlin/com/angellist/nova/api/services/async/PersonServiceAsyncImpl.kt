// File generated from our OpenAPI spec by Stainless.

package com.angellist.nova.api.services.async

import com.angellist.nova.api.core.ClientOptions
import java.util.function.Consumer

class PersonServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PersonServiceAsync {

    private val withRawResponse: PersonServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PersonServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PersonServiceAsync =
        PersonServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PersonServiceAsync.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PersonServiceAsync.WithRawResponse =
            PersonServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
