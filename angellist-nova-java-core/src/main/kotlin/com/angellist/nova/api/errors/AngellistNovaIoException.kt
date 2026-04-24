package com.angellist.nova.api.errors

class AngellistNovaIoException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) :
    AngellistNovaException(message, cause)
