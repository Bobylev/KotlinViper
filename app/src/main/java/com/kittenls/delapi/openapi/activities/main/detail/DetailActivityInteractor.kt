package com.kittenls.delapi.openapi.activities.main.detail

import com.kittenls.delapi.openapi.activities.base.BaseInteractor
import com.kittenls.delapi.openapi.activities.main.detail.DetailActivityContracts.*
import com.kittenls.delapi.openapi.network.ICallHub
import com.kittenls.delapi.openapi.network.data.Meals
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

import javax.inject.Inject

class DetailActivityInteractor @Inject constructor() : BaseInteractor<InteractorOutput>(), Interactor {

    @Inject
    lateinit var mealApiService: ICallHub

    override fun loadCategory(category: String): Observable<Meals> {
        return mealApiService.getCategoryMealList(category)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
    }
}
