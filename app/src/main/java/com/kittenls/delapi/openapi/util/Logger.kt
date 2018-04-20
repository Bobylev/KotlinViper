package com.kittenls.delapi.openapi.util

import android.util.Log

class Logger{

    fun logEventInfo(tag: String, msg: String){
        Log.i(tag, msg)
    }

    fun logEventError(tag: String, msg: String){
        Log.e(tag, msg)
    }

    fun logEventWarning(tag: String, msg: String){
        Log.w(tag, msg)
    }

}
