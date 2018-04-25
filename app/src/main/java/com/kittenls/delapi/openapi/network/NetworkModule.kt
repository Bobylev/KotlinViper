package com.kittenls.delapi.openapi.network

import com.kittenls.delapi.openapi.util.Logger
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import javax.inject.Singleton

@Module
class NetworkModule {

    @Singleton
    @Provides
    fun provideOKHttp(logger: Logger) : OkHttpClient{
        return Client.create(logger)
    }

    @Singleton
    @Provides
    fun provideMealApi(clientOK: OkHttpClient) : ICallHub{
        return RetrofitClient.create(clientOK)
    }

}