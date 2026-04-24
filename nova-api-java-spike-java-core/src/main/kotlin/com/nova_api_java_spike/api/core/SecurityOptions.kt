// File generated from our OpenAPI spec by Stainless.

package com.nova_api_java_spike.api.core

import java.util.Objects

/** A class for configuring which security schemes are enabled for a request. */
class SecurityOptions
private constructor(
    /** Whether the bearerAuth security scheme is enabled. */
    @get:JvmName("bearerAuth") val bearerAuth: Boolean
) {

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [SecurityOptions]. */
        @JvmStatic fun builder() = Builder()

        /** Returns a [Security] instance with all security schemes enabled. */
        @JvmStatic fun all(): SecurityOptions = builder().bearerAuth(true).build()

        /** Returns a [Security] instance with no security schemes enabled. */
        @JvmStatic fun none(): SecurityOptions = builder().build()
    }

    /** A builder for [SecurityOptions]. */
    class Builder internal constructor() {

        private var bearerAuth: Boolean = false

        @JvmSynthetic
        internal fun from(securityOptions: SecurityOptions) = apply {
            bearerAuth = securityOptions.bearerAuth
        }

        /** Whether the bearerAuth security scheme is enabled. */
        fun bearerAuth(bearerAuth: Boolean) = apply { this.bearerAuth = bearerAuth }

        /**
         * Returns an immutable instance of [SecurityOptions].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SecurityOptions = SecurityOptions(bearerAuth)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SecurityOptions && bearerAuth == other.bearerAuth
    }

    override fun hashCode(): Int = Objects.hash(bearerAuth)

    override fun toString() = "SecurityOptions{bearerAuth=$bearerAuth}"
}
