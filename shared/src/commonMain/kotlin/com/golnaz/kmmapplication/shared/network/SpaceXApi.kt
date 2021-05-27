package com.golnaz.kmmapplication.shared.network

import com.golnaz.kmmapplication.shared.Data
import io.ktor.client.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.request.*

class SpaceXApi {
    private val httpClient = HttpClient {
        install(JsonFeature) {
            val json = kotlinx.serialization.json.Json { ignoreUnknownKeys = true }
            serializer = KotlinxSerializer(json)
        }
    }

    suspend fun getAllData(): Data {
        return httpClient.get(LAUNCHES_ENDPOINT+"api/v1/movies")
    }

    companion object {
        private const val LAUNCHES_ENDPOINT = "http://moviesapi.ir/"
    }
}