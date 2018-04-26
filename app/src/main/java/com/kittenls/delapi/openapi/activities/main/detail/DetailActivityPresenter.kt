package com.kittenls.delapi.openapi.activities.main.detail

import com.kittenls.delapi.openapi.activities.base.BasePresenter
import com.kittenls.delapi.openapi.activities.main.detail.DetailActivityContracts.*
import javax.inject.Inject

class DetailActivityPresenter @Inject constructor(view: View, interactor: Interactor, router: Router):
       BasePresenter<View, Interactor,Router>(view, interactor, router), Presenter, InteractorOutput {

    override fun showCategory(category: String) {
        interactor?.loadCategory(category)?.subscribe({
            view?.showData(it)
        }, {
            view?.showError(it)
        })
    }
}