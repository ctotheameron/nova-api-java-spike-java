@file:JvmName("JsonHandler")

package com.nova_api_java_spike.api.core.handlers

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.nova_api_java_spike.api.core.http.HttpResponse
import com.nova_api_java_spike.api.core.http.HttpResponse.Handler
import com.nova_api_java_spike.api.errors.NovaApiJavaSpikeInvalidDataException

@JvmSynthetic
internal inline fun <reified T> jsonHandler(jsonMapper: JsonMapper): Handler<T> =
    object : Handler<T> {
        override fun handle(response: HttpResponse): T =
            try {
                jsonMapper.readValue(response.body(), jacksonTypeRef())
            } catch (e: Exception) {
                throw NovaApiJavaSpikeInvalidDataException("Error reading response", e)
            }
    }
