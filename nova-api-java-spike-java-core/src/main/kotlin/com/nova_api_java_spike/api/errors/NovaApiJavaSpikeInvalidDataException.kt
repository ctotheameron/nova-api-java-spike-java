package com.nova_api_java_spike.api.errors

class NovaApiJavaSpikeInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) :
    NovaApiJavaSpikeException(message, cause)
