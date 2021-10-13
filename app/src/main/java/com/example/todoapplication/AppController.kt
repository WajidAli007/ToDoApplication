package com.example.todoapplication

import androidx.multidex.MultiDexApplication
import com.example.todoapplication.di.DaggerDiComponent

/**
 * @Author: Wajid.Ali
 * @Date: 10/13/2021
 */


class AppController : MultiDexApplication() {

    companion object{
        private lateinit var appController : AppController
        fun getInstance() : AppController{
            return appController
        }
    }

    override fun onCreate() {
        super.onCreate()

        appController = this

//        DaggerDiComponent.builder()
////            .application(this)
////            .context(this)
//            .build()

    }

}