package com.kittenls.delapi.openapi.activities.base

interface BaseContracts {

    interface View

    interface Presenter {
        fun onDestroy()
    }

    interface Interactor {
        fun setInteractorOutput(interactorOutput: Any)
        fun unregister()
    }

    interface InteractorOutput

    interface Router {
        fun unregister()
        //fun handleError(errorData: ErrorData): Boolean
    }

}