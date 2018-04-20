package com.kittenls.delapi.openapi.network

import com.kittenls.delapi.openapi.network.data.Meals
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface ICallHub {
    @GET("search.php")
    fun search(@Query("s") query: String): Observable<Meals>
}