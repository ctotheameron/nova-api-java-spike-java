// File generated from our OpenAPI spec by Stainless.

@file:JvmName("ErrorHandler")

package com.nova_api_java_spike.api.core.handlers

import com.fasterxml.jackson.databind.json.JsonMapper
import com.nova_api_java_spike.api.core.JsonMissing
import com.nova_api_java_spike.api.core.JsonValue
import com.nova_api_java_spike.api.core.http.HttpResponse
import com.nova_api_java_spike.api.core.http.HttpResponse.Handler
import com.nova_api_java_spike.api.errors.BadRequestException
import com.nova_api_java_spike.api.errors.InternalServerException
import com.nova_api_java_spike.api.errors.NotFoundException
import com.nova_api_java_spike.api.errors.PermissionDeniedException
import com.nova_api_java_spike.api.errors.RateLimitException
import com.nova_api_java_spike.api.errors.UnauthorizedException
import com.nova_api_java_spike.api.errors.UnexpectedStatusCodeException
import com.nova_api_java_spike.api.errors.UnprocessableEntityException

@JvmSynthetic
internal fun errorBodyHandler(jsonMapper: JsonMapper): Handler<JsonValue> {
    val handler = jsonHandler<JsonValue>(jsonMapper)

    return object : Handler<JsonValue> {
        override fun handle(response: HttpResponse): JsonValue =
            try {
                handler.handle(response)
            } catch (e: Exception) {
                JsonMissing.of()
            }
    }
}

@JvmSynthetic
internal fun errorHandler(errorBodyHandler: Handler<JsonValue>): Handler<HttpResponse> =
    object : Handler<HttpResponse> {
        override fun handle(response: HttpResponse): HttpResponse =
            when (val statusCode = response.statusCode()) {
                in 200..299 -> response
                400 ->
                    throw BadRequestException.builder()
                        .headers(response.headers())
                        .body(errorBodyHandler.handle(response))
                        .build()
                401 ->
                    throw UnauthorizedException.builder()
                        .headers(response.headers())
                        .body(errorBodyHandler.handle(response))
                        .build()
                403 ->
                    throw PermissionDeniedException.builder()
                        .headers(response.headers())
                        .body(errorBodyHandler.handle(response))
                        .build()
                404 ->
                    throw NotFoundException.builder()
                        .headers(response.headers())
                        .body(errorBodyHandler.handle(response))
                        .build()
                422 ->
                    throw UnprocessableEntityException.builder()
                        .headers(response.headers())
                        .body(errorBodyHandler.handle(response))
                        .build()
                429 ->
                    throw RateLimitException.builder()
                        .headers(response.headers())
                        .body(errorBodyHandler.handle(response))
                        .build()
                in 500..599 ->
                    throw InternalServerException.builder()
                        .statusCode(statusCode)
                        .headers(response.headers())
                        .body(errorBodyHandler.handle(response))
                        .build()
                else ->
                    throw UnexpectedStatusCodeException.builder()
                        .statusCode(statusCode)
                        .headers(response.headers())
                        .body(errorBodyHandler.handle(response))
                        .build()
            }
    }
