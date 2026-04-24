@file:JvmName("JsonHandler")

package io.github.ctotheameron.core.handlers

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.github.ctotheameron.core.http.HttpResponse
import io.github.ctotheameron.core.http.HttpResponse.Handler
import io.github.ctotheameron.errors.AngellistNovaInvalidDataException

@JvmSynthetic
internal inline fun <reified T> jsonHandler(jsonMapper: JsonMapper): Handler<T> =
    object : Handler<T> {
        override fun handle(response: HttpResponse): T =
            try {
                jsonMapper.readValue(response.body(), jacksonTypeRef())
            } catch (e: Exception) {
                throw AngellistNovaInvalidDataException("Error reading response", e)
            }
    }
