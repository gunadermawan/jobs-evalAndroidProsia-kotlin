package com.gunder.evalprosia.utils

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences

class Prefs(activity: Activity) {
    private var sp: SharedPreferences? = null

    init {
        sp = activity.getSharedPreferences("MY_PREF", Context.MODE_PRIVATE)
    }

    fun setIsLogin(value: Boolean) {
        sp?.edit()?.putBoolean(IS_LOGIN, value)?.apply()
    }

    fun getIsLogin(): Boolean {
        return sp!!.getBoolean(IS_LOGIN, false)
    }

    companion object {
        const val IS_LOGIN = "IS_LOGIN"
    }
}