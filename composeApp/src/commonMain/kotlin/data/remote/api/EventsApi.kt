package data.remote.api

import data.remote.reponse.EventsResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.header
import io.ktor.client.request.parameter
import io.ktor.client.request.url

interface EventsApi {
    suspend fun fetchAll(): EventsResponse
}

class EventsApiImpl(private val client: HttpClient) : EventsApi {
    companion object {
        // the api url is here for simplicity
        private const val API_URL =
            "http://192.168.0.106:1337/api/"

        // token is here for simplicity
        private const val TOKEN =
            "Bearer e902ce57d294adb0ef86b951ab7685b14f16cedfbb0b2434866037932bbe30ac126fe775e50c61e7c56e95727f7dd9d3fe87aeb001a6f73cfb9b71ce245359bd7de7ebfc48435c6b951aafe519f38fa5a03d2d2d76b8c9b1d8fae1001c3016be100a564ff5782036919526dde66cc646007c2172d6b3259e796d251fd7e9d9a4"
    }

    override suspend fun fetchAll(): EventsResponse {
        return client.get {
            url(API_URL)
            parameter("pagination[page]", 1)
            parameter("pagination[pageSize]", 10)
            header(
                "Authorization",
                TOKEN
            )
        }.body()
    }

}