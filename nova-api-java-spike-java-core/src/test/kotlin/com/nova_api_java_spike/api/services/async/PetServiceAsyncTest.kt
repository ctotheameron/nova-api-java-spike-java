// File generated from our OpenAPI spec by Stainless.

package com.nova_api_java_spike.api.services.async

import com.nova_api_java_spike.api.client.okhttp.NovaApiJavaSpikeOkHttpClientAsync
import com.nova_api_java_spike.api.models.pets.Category
import com.nova_api_java_spike.api.models.pets.Pet
import com.nova_api_java_spike.api.models.pets.PetFindByStatusParams
import com.nova_api_java_spike.api.models.pets.PetFindByTagsParams
import com.nova_api_java_spike.api.models.pets.PetUpdateByIdParams
import com.nova_api_java_spike.api.models.pets.PetUploadImageParams
import com.nova_api_java_spike.api.models.pets.Tag
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PetServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = NovaApiJavaSpikeOkHttpClientAsync.builder().apiKey("My API Key").build()
        val petServiceAsync = client.pets()

        val petFuture =
            petServiceAsync.create(
                Pet.builder()
                    .name("doggie")
                    .addPhotoUrl("string")
                    .id(10L)
                    .category(Category.builder().id(1L).name("Dogs").build())
                    .status(Pet.Status.AVAILABLE)
                    .addTag(Tag.builder().id(0L).name("name").build())
                    .build()
            )

        val pet = petFuture.get()
        pet.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = NovaApiJavaSpikeOkHttpClientAsync.builder().apiKey("My API Key").build()
        val petServiceAsync = client.pets()

        val petFuture = petServiceAsync.retrieve(0L)

        val pet = petFuture.get()
        pet.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = NovaApiJavaSpikeOkHttpClientAsync.builder().apiKey("My API Key").build()
        val petServiceAsync = client.pets()

        val petFuture =
            petServiceAsync.update(
                Pet.builder()
                    .name("doggie")
                    .addPhotoUrl("string")
                    .id(10L)
                    .category(Category.builder().id(1L).name("Dogs").build())
                    .status(Pet.Status.AVAILABLE)
                    .addTag(Tag.builder().id(0L).name("name").build())
                    .build()
            )

        val pet = petFuture.get()
        pet.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = NovaApiJavaSpikeOkHttpClientAsync.builder().apiKey("My API Key").build()
        val petServiceAsync = client.pets()

        val future = petServiceAsync.delete(0L)

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun findByStatus() {
        val client = NovaApiJavaSpikeOkHttpClientAsync.builder().apiKey("My API Key").build()
        val petServiceAsync = client.pets()

        val petsFuture =
            petServiceAsync.findByStatus(
                PetFindByStatusParams.builder()
                    .status(PetFindByStatusParams.Status.AVAILABLE)
                    .build()
            )

        val pets = petsFuture.get()
        pets.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun findByTags() {
        val client = NovaApiJavaSpikeOkHttpClientAsync.builder().apiKey("My API Key").build()
        val petServiceAsync = client.pets()

        val petsFuture =
            petServiceAsync.findByTags(PetFindByTagsParams.builder().addTag("string").build())

        val pets = petsFuture.get()
        pets.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateById() {
        val client = NovaApiJavaSpikeOkHttpClientAsync.builder().apiKey("My API Key").build()
        val petServiceAsync = client.pets()

        val future =
            petServiceAsync.updateById(
                PetUpdateByIdParams.builder().petId(0L).name("name").status("status").build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun uploadImage() {
        val client = NovaApiJavaSpikeOkHttpClientAsync.builder().apiKey("My API Key").build()
        val petServiceAsync = client.pets()

        val responseFuture =
            petServiceAsync.uploadImage(
                PetUploadImageParams.builder()
                    .petId(0L)
                    .additionalMetadata("additionalMetadata")
                    .image("Example data")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
