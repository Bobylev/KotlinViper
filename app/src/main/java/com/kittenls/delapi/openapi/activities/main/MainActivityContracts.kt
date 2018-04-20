package com.kittenls.delapi.openapi.activities.main

import com.kittenls.delapi.openapi.activities.base.BaseContracts
import com.kittenls.delapi.openapi.network.data.Meals
import io.reactivex.Observable

interface MainActivityContracts {

    interface View : BaseContracts.View {
        fun showData(meals: Meals)
        fun showError(error: Throwable)
    }

    interface Presenter : BaseContracts.Presenter {
        fun getSearch(str: String)
    }

    interface Interactor : BaseContracts.Interactor {
        fun searchRequest(str: String): Observable<Meals>
    }

    interface InteractorOutput : BaseContracts.InteractorOutput {
    }

    interface Router : BaseContracts.Router {
    }

}