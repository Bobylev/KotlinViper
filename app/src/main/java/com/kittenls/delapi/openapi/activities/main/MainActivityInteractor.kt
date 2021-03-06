package com.kittenls.delapi.openapi.activities.main

import com.kittenls.delapi.openapi.activities.base.BaseInteractor
import com.kittenls.delapi.openapi.activities.main.MainActivityContracts.*
import com.kittenls.delapi.openapi.network.ICallHub
import com.kittenls.delapi.openapi.network.data.MealCategories
import com.kittenls.delapi.openapi.network.data.Meals
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class MainActivityInteractor @Inject constructor() : BaseInteractor<InteractorOutput>(), Interactor {

    @Inject
    lateinit var mealApiService: ICallHub

    override fun loadCategories(): Observable<MealCategories> {
        return mealApiService.getCategories()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
    }

    override fun searchRequest(str: String): Observable<Meals> {
        return mealApiService.search(str)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
    }
}
