// File generated from our OpenAPI spec by Stainless.

package com.nova_api_java_spike.api.errors

import com.nova_api_java_spike.api.core.JsonValue
import com.nova_api_java_spike.api.core.http.Headers

abstract class NovaApiJavaSpikeServiceException
protected constructor(message: String, cause: Throwable? = null) :
    NovaApiJavaSpikeException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
