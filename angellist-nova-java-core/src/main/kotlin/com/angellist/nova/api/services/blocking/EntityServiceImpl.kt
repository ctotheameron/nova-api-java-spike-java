// File generated from our OpenAPI spec by Stainless.

package com.angellist.nova.api.services.blocking

import com.angellist.nova.api.core.ClientOptions
import java.util.function.Consumer

class EntityServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EntityService {

    private val withRawResponse: EntityService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EntityService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): EntityService =
        EntityServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EntityService.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EntityService.WithRawResponse =
            EntityServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
