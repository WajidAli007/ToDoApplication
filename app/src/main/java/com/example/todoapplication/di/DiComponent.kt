package com.example.todoapplication.di

import android.content.Context
import com.example.todoapplication.AppController
import com.example.todoapplication.ui.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

/**
 * @Author: Wajid.Ali
 * @Date: 10/13/2021
 */

@Singleton
@Component(modules = [DiModule::class])
interface DiComponent {

    fun inject(mainActivity: MainActivity)
}