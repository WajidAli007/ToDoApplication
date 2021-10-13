package com.example.todoapplication.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * @Author: Wajid.Ali
 * @Date: 10/13/2021
 */

@Entity(tableName = "task_entity")
class TaskEntity(
    @PrimaryKey(autoGenerate = true) val taskId: Int,
    @ColumnInfo(name = "title") val title : String,
    @ColumnInfo(name = "description") val description : String,
    @ColumnInfo(name = "timestamp") val timestamp : Long,
    @ColumnInfo(name = "isFavorite") val isFavorite : Boolean
)