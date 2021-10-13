package com.example.todoapplication.db.daos

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.todoapplication.db.entities.TaskEntity

/**
 * @Author: Wajid.Ali
 * @Date: 10/13/2021
 */

@Dao
interface TaskDao {

    @Query("SELECT * FROM task_entity")
    suspend fun getAllTasks(): List<TaskEntity>

    @Query("SELECT * FROM task_entity WHERE taskId = :id")
    suspend fun getTaskById(id: Int): TaskEntity

    @Insert
    suspend fun addTask(task: TaskEntity)

    @Delete
    suspend fun deleteTask(task: TaskEntity)

}