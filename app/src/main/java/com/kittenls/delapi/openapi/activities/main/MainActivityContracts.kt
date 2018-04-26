package com.kittenls.delapi.openapi.activities.main

import com.kittenls.delapi.openapi.activities.base.BaseContracts
import com.kittenls.delapi.openapi.network.data.MealCategories
import com.kittenls.delapi.openapi.network.data.Meals
import io.reactivex.Observable

interface MainActivityContracts {

    interface View : BaseContracts.View {
        fun showData(mealsCategories: MealCategories)
        fun showError(error: Throwable)
    }

    interface Presenter : BaseContracts.Presenter {
        fun getSearch(str: String)
        fun loadCategories()
        fun categoryItemClick(index: String?)
    }

    interface Interactor : BaseContracts.Interactor {
        fun searchRequest(str: String): Observable<Meals>
        fun loadCategories(): Observable<MealCategories>
    }

    interface InteractorOutput : BaseContracts.InteractorOutput

    interface Router : BaseContracts.Router {
        fun navigateToDetail(index: String)
    }

}