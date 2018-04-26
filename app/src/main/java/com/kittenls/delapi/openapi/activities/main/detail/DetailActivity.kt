package com.kittenls.delapi.openapi.activities.main.detail

import android.os.Bundle
import com.kittenls.delapi.openapi.R
import com.kittenls.delapi.openapi.activities.base.BaseActivity
import com.kittenls.delapi.openapi.activities.main.adapter.DetailMealAdapter
import com.kittenls.delapi.openapi.network.data.Meals
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_detail.*
import javax.inject.Inject

class DetailActivity : BaseActivity(), DetailActivityContracts.View {
    @Inject
    lateinit var presenter: DetailActivityPresenter

    override fun showData(meals: Meals) {
        mealListRecyclerList.adapter = DetailMealAdapter(meals, presenter)

    }

    override fun showError(error: Throwable) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)

        setContentView(R.layout.activity_detail)
        setSupportActionBar(toolbar)

        val category = intent.extras.get("categoryId")
        if(category != null) presenter.showCategory(category as String)
    }

}
