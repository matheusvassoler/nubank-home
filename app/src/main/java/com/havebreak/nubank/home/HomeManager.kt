package com.havebreak.nubank.home

import android.content.Context
import android.content.Intent

class HomeManager private constructor() {

    class Builder {

        fun build(): HomeManager {
            return HomeManager()
        }
    }

    fun start(context: Context) {
        val intent = Intent(context, HomeActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
        }
        context.startActivity(intent)
    }
}