package io.intrepid.wagon.rest

import io.intrepid.wagon.rules.MockServerRule

object TestRestClient {
    fun getRestApi(mockServer: MockServerRule): RestApi {
        return RetrofitClient.getTestApi(mockServer.serverUrl)
    }
}
