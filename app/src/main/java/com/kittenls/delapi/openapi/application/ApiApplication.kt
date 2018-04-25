package com.kittenls.delapi.openapi.application

import android.app.Activity
import android.app.Application
import com.facebook.drawee.backends.pipeline.Fresco
import com.facebook.imagepipeline.backends.okhttp3.OkHttpImagePipelineConfigFactory
import com.squareup.leakcanary.LeakCanary
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject
import dagger.android.AndroidInjector
import okhttp3.OkHttpClient

class ApiApplication : Application(), HasActivityInjector {
    override fun activityInjector(): AndroidInjector<Activity> {
        return activityInjector
    }

    @Inject lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    @Inject lateinit var okHttpClient: OkHttpClient

    override fun onCreate() {
        super.onCreate()

        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return
        }
        LeakCanary.install(this)

        DaggerAppComponent.builder() // Building the app component
                .build()
                .inject(this)
        // Injecting our android injector

        val config = OkHttpImagePipelineConfigFactory
                .newBuilder(this.applicationContext, okHttpClient)
                .build()

        Fresco.initialize(this, config)
    }


}