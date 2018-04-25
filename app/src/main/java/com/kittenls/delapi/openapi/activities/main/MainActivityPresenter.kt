package com.kittenls.delapi.openapi.activities.main

import com.kittenls.delapi.openapi.activities.base.BasePresenter
import com.kittenls.delapi.openapi.activities.main.MainActivityContracts.*
import javax.inject.Inject

class MainActivityPresenter @Inject constructor(view: View, interactor: Interactor, router: Router):
       BasePresenter<View, Interactor,Router>(view, interactor, router), Presenter, InteractorOutput{
    override fun categoryItemClick(index: Int?) {
        if(index != null){
            router?.navigateToDetail(index)
        }
    }

    override fun loadCategories() {
        interactor?.loadCategories()?.subscribe({
            view?.showData(it)
        }, {
            view?.showError(it)
        })
    }

    override fun getSearch(str: String) {
        interactor?.searchRequest(str)?.subscribe({
            //view?.showData(it)
        },
        {
            view?.showError(it)
        }
        )
    }
}