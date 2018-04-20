package com.kittenls.delapi.openapi.activities.main

import com.kittenls.delapi.openapi.activities.base.BaseRouter
import javax.inject.Inject

class MainActivityRouter @Inject constructor(activity : MainActivity): BaseRouter<MainActivity>(activity), MainActivityContracts.Router{
    
}