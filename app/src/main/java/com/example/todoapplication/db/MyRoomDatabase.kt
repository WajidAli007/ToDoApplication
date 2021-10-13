package com.example.todoapplication.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.todoapplication.db.daos.TaskDao
import com.example.todoapplication.db.entities.TaskEntity

/**
 * @Author: Wajid.Ali
 * @Date: 10/13/2021
 */

@Database(entities = [TaskEntity::class], version = 1)
abstract class MyRoomDatabase : RoomDatabase() {
    abstract fun taskDao() : TaskDao
}