package com.nova_api_java_spike.api.errors

open class NovaApiJavaSpikeException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
