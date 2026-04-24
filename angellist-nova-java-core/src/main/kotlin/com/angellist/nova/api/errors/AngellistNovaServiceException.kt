// File generated from our OpenAPI spec by Stainless.

package com.angellist.nova.api.errors

import com.angellist.nova.api.core.JsonValue
import com.angellist.nova.api.core.http.Headers

abstract class AngellistNovaServiceException
protected constructor(message: String, cause: Throwable? = null) :
    AngellistNovaException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
