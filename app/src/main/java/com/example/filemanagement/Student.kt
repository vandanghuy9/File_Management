package com.example.filemanagement

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "students")
data class Student (
    @PrimaryKey(autoGenerate = true) var _id: Int = 0,
    var stdNum: String,
    var name: String,
    var dob: String,
    var hometown: String
)