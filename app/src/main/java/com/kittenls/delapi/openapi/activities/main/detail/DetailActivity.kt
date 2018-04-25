package com.kittenls.delapi.openapi.activities.main.detail

import android.os.Bundle
import com.kittenls.delapi.openapi.R
import com.kittenls.delapi.openapi.activities.base.BaseActivity
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : BaseActivity(), DetailActivityContracts.View {

    override fun showError(error: Throwable) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setSupportActionBar(toolbar)

    }

}
