package com.kittenls.delapi.openapi.activities.main

import android.content.Intent
import com.kittenls.delapi.openapi.activities.base.BaseRouter
import com.kittenls.delapi.openapi.activities.main.detail.DetailActivity
import javax.inject.Inject

class MainActivityRouter @Inject constructor(activity : MainActivity): BaseRouter<MainActivity>(activity), MainActivityContracts.Router{
    override fun navigateToDetail(index: Int) {

        var intent = Intent(activity, DetailActivity::class.java)
        activity?.startActivity(intent)

    }

}