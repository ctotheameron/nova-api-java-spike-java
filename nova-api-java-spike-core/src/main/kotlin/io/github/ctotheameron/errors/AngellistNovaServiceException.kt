// File generated from our OpenAPI spec by Stainless.

package io.github.ctotheameron.errors

import io.github.ctotheameron.core.JsonValue
import io.github.ctotheameron.core.http.Headers

abstract class AngellistNovaServiceException
protected constructor(message: String, cause: Throwable? = null) :
    AngellistNovaException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
