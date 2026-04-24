package com.angellist.nova.api.errors

open class AngellistNovaException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
