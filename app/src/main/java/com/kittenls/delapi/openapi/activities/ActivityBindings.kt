package com.kittenls.delapi.openapi.activities

import com.kittenls.delapi.openapi.activities.main.MainActivity
import com.kittenls.delapi.openapi.activities.modules.MainActivityModule
import com.kittenls.delapi.openapi.application.ActivityScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindings {

    @ActivityScope
    @ContributesAndroidInjector(modules = arrayOf(MainActivityModule::class))
    abstract fun contributeMainActivity(): MainActivity

}