package com.kittenls.delapi.openapi.activities.modules

import com.kittenls.delapi.openapi.activities.main.*
import com.kittenls.delapi.openapi.activities.main.detail.*
import com.kittenls.delapi.openapi.application.ActivityScope
import dagger.Binds
import dagger.Module

@Module
interface DetailActivityModule {
    @ActivityScope
    @Binds
    fun provideDetailView(detailActivity: DetailActivity): DetailActivityContracts.View

    @ActivityScope
    @Binds
    fun provideDetailPresenter(presenter: DetailActivityPresenter):DetailActivityContracts.Presenter

    @ActivityScope
    @Binds
    fun provideDetailRouter(router: DetailActivityRouter): DetailActivityContracts.Router

    @ActivityScope
    @Binds
    fun provideDetailInteractor(interactor: DetailActivityInteractor): DetailActivityContracts.Interactor
}
