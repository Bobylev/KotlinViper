package com.kittenls.delapi.openapi.activities.main.detail

import com.kittenls.delapi.openapi.activities.base.BaseContracts
import com.kittenls.delapi.openapi.network.data.MealCategories
import com.kittenls.delapi.openapi.network.data.Meals
import io.reactivex.Observable

interface DetailActivityContracts {

    interface View : BaseContracts.View {
        fun showError(error: Throwable)
    }

    interface Presenter : BaseContracts.Presenter {

    }

    interface Interactor : BaseContracts.Interactor {

    }

    interface InteractorOutput : BaseContracts.InteractorOutput {
    }

    interface Router : BaseContracts.Router {
    }

}