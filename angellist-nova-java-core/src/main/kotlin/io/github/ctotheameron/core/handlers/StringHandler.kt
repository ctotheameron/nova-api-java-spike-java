@file:JvmName("StringHandler")

package io.github.ctotheameron.core.handlers

import io.github.ctotheameron.core.http.HttpResponse
import io.github.ctotheameron.core.http.HttpResponse.Handler

@JvmSynthetic internal fun stringHandler(): Handler<String> = StringHandlerInternal

private object StringHandlerInternal : Handler<String> {
    override fun handle(response: HttpResponse): String =
        response.body().readBytes().toString(Charsets.UTF_8)
}
