package com.kittenls.delapi.openapi.activities.base

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

abstract class BasePresenter<V : BaseContracts.View,
        I : BaseContracts.Interactor,
        R : BaseContracts.Router>
        (protected var view: V?, protected var interactor: I?, protected var router: R?) :
        BaseContracts.Presenter, BaseContracts.InteractorOutput {

    init {
        this.interactor?.setInteractorOutput(this)
    }

    private var compositeDisposable: CompositeDisposable? = CompositeDisposable()

    override fun onDestroy() {
        compositeDisposable?.dispose()
        view = null
        interactor?.unregister()
        interactor = null
        router?.unregister()
        router = null
    }

    fun addDisposable(disposable: Disposable){
        compositeDisposable?.add(disposable)
    }
}