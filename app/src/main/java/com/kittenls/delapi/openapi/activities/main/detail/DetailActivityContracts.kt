package com.kittenls.delapi.openapi.activities.main.detail

import com.kittenls.delapi.openapi.activities.base.BaseContracts

interface DetailActivityContracts {

    interface View : BaseContracts.View {
        fun showError(error: Throwable)
    }

    interface Presenter : BaseContracts.Presenter

    interface Interactor : BaseContracts.Interactor

    interface InteractorOutput : BaseContracts.InteractorOutput

    interface Router : BaseContracts.Router

}