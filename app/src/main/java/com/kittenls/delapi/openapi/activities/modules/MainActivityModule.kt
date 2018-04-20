package com.kittenls.delapi.openapi.activities.modules

import com.kittenls.delapi.openapi.activities.main.*
import com.kittenls.delapi.openapi.application.ActivityScope
import dagger.Binds
import dagger.Module

@Module
interface MainActivityModule {
    @ActivityScope
    @Binds
    fun provideMainView(registrationActivity: MainActivity): MainActivityContracts.View

    @ActivityScope
    @Binds
    fun provideMainPresenter(presenter: MainActivityPresenter): MainActivityContracts.Presenter

    @ActivityScope
    @Binds
    fun provideMainRouter(router: MainActivityRouter): MainActivityContracts.Router

    @ActivityScope
    @Binds
    fun provideMainInteractor(interactor: MainActivityInteractor): MainActivityContracts.Interactor
}
