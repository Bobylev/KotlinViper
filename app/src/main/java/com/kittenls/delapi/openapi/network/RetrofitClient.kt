package com.kittenls.delapi.openapi.network

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {

    companion object Factory {
        fun create(clientOK: OkHttpClient): ICallHub {
            val retrofit = Retrofit.Builder()
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(clientOK)
                    .baseUrl("https://www.themealdb.com/api/json/v1/1/")
                    .build()

            return retrofit.create(ICallHub::class.java)
        }
    }
}