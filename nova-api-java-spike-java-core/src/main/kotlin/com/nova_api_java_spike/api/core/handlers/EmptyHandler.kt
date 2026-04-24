@file:JvmName("EmptyHandler")

package com.nova_api_java_spike.api.core.handlers

import com.nova_api_java_spike.api.core.http.HttpResponse
import com.nova_api_java_spike.api.core.http.HttpResponse.Handler

@JvmSynthetic internal fun emptyHandler(): Handler<Void?> = EmptyHandlerInternal

private object EmptyHandlerInternal : Handler<Void?> {
    override fun handle(response: HttpResponse): Void? = null
}
