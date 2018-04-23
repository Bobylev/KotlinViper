package com.kittenls.delapi.openapi.network

import com.kittenls.delapi.openapi.util.Logger
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

class Client {
    companion object {
        fun create(logger: Logger): OkHttpClient{
            val client = OkHttpClient.Builder()
                    .connectTimeout(10, TimeUnit.SECONDS)
                    .writeTimeout(10, TimeUnit.SECONDS)
                    .readTimeout(30, TimeUnit.SECONDS)
            client.interceptors().add(getLogInterceptor(logger))
            return client.build()
        }

        fun getLogInterceptor(logger: Logger): Interceptor {
            val interceptor = Interceptor { chain ->

                val requestUrl = chain.request()?.url().toString()
                val startRequest = System.nanoTime()

                logger.logEventInfo("OKHTTP", "start url : " + requestUrl + " : " + startRequest.toString())
                val result = chain.proceed(chain.request())
                logger.logEventInfo("OKHTTP", "finish url : " +  requestUrl + " : " +(System.nanoTime() - startRequest).toString())

                result
            }
            return interceptor
        }
    }
}
