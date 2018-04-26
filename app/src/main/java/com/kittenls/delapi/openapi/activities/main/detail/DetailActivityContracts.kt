package com.kittenls.delapi.openapi.activities.main.detail

import com.kittenls.delapi.openapi.activities.base.BaseContracts
import com.kittenls.delapi.openapi.network.data.Meals
import io.reactivex.Observable

interface DetailActivityContracts {

    interface View : BaseContracts.View {
        fun showError(error: Throwable)
        fun showData(meals: Meals)
    }

    interface Presenter : BaseContracts.Presenter{
        fun showCategory(category: String)
    }

    interface Interactor : BaseContracts.Interactor{
        fun loadCategory(category: String): Observable<Meals>
    }

    interface InteractorOutput : BaseContracts.InteractorOutput

    interface Router : BaseContracts.Router

}