// File generated from our OpenAPI spec by Stainless.

package com.nova_api_java_spike.api.models.distributions

import com.nova_api_java_spike.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DistributionRetrieveParamsTest {

    @Test
    fun create() {
        DistributionRetrieveParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .xOrganizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DistributionRetrieveParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .xOrganizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            DistributionRetrieveParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .xOrganizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put("X-Organization-Id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }
}
