package com.kittenls.delapi.openapi.activities.main.detail

import com.kittenls.delapi.openapi.activities.base.BaseInteractor
import com.kittenls.delapi.openapi.activities.main.detail.DetailActivityContracts.*
import com.kittenls.delapi.openapi.network.ICallHub

import javax.inject.Inject

class DetailActivityInteractor @Inject constructor() : BaseInteractor<InteractorOutput>(), Interactor {

    @Inject
    lateinit var mealApiService: ICallHub


}
