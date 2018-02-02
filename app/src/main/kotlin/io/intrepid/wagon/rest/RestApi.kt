package io.intrepid.wagon.rest

import io.intrepid.wagon.models.IpModel
import io.reactivex.Single
import retrofit2.http.GET

interface RestApi {
    @GET("/?format=json")
    fun getMyIp(): Single<IpModel>
}
