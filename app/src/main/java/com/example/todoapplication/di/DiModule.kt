package com.example.todoapplication.di

import android.content.Context
import androidx.room.Room
import com.example.todoapplication.AppController
import com.example.todoapplication.db.MyRoomDatabase
import com.example.todoapplication.db.daos.TaskDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * @Author: Wajid.Ali
 * @Date: 10/13/2021
 */

@Module
class DiModule {

    //DB
    @Singleton
    @Provides
    fun provideDatabase(context: Context): MyRoomDatabase {
        return Room.databaseBuilder(
            context,
            MyRoomDatabase::class.java,
            "database_todo"
        ).build()
    }

    @Singleton
    @Provides
    fun provideTaskDao(db : MyRoomDatabase) : TaskDao {
        return db.taskDao()
    }

    @Singleton
    @Provides
    fun provideApplication() : AppController {
        return AppController.getInstance()
    }

    @Singleton
    @Provides
    fun provideContext() : Context {
        return AppController.getInstance()
    }

}