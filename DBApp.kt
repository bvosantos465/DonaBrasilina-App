package com.example.byah_.donabrasilina

import android.app.Application
import java.lang.IllegalStateException

class DBApp: Application() {
    // chamado quando android iniciar o processo da aplicação
    override fun onCreate() {
        super.onCreate()
        appInstance = this
    }

    companion object {
        // singleton
        private var appInstance: DBApp?  = null
        fun getInstance(): DBApp {
            if (appInstance == null) {
                throw IllegalStateException("Configural application no Android Manifest")
            }
            return appInstance!!
        }
    }

    // chamado quando android terminar processo da aplicação
    override fun onTerminate() {
        super.onTerminate()
    }
}