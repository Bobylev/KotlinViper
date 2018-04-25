package com.kittenls.delapi.openapi.activities.main.detail

import com.kittenls.delapi.openapi.activities.base.BaseRouter
import javax.inject.Inject

class DetailActivityRouter @Inject constructor(activity : DetailActivity): BaseRouter<DetailActivity>(activity), DetailActivityContracts.Router{
    
}