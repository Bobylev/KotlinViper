package com.kittenls.delapi.openapi.activities.base

import android.support.v4.app.FragmentManager
import android.support.v7.app.AppCompatActivity

abstract class BaseRouter<A : AppCompatActivity>(protected var activity: A?) : BaseContracts.Router {
    protected val fragmentManager: FragmentManager? = activity?.getSupportFragmentManager()

    override fun unregister() {
        activity = null
    }

}