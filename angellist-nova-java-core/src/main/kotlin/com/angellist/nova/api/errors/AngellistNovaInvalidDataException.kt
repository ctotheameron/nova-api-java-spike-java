package com.angellist.nova.api.errors

class AngellistNovaInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) :
    AngellistNovaException(message, cause)
