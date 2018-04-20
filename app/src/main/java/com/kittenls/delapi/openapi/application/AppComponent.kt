package com.kittenls.delapi.openapi.application

import com.kittenls.delapi.openapi.activities.ActivityBindings
import com.kittenls.delapi.openapi.network.NetworkModule
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class,AndroidSupportInjectionModule::class,
        ActivityBindings::class,
        NetworkModule::class))

interface AppComponent {

    @Component.Builder
    interface Builder{
        fun build(): AppComponent
        fun appModule(appModule: AppModule)
        fun networkModule(networkModule: NetworkModule)
    }

    fun inject(app: ApiApplication)
}