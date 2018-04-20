package com.kittenls.delapi.openapi.application

import android.app.Application
import com.kittenls.delapi.openapi.util.Logger
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class AppModule  {

    @Provides
    fun provideContext(application: ApiApplication): Application {
        return application
    }

    @Singleton
    @Provides
    fun provideLogger(): Logger {
        return Logger()
    }
}