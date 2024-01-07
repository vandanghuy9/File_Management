package com.example.filemanagement

import androidx.room.*

@Dao
interface StudentDao {

    @Query("select * from students")
    fun getAllStudents() : Array<Student>

    @Insert
    fun insert(vararg student: Student): Array<Long>

    @Update
    fun update(student: Student): Int

    @Delete
    fun delete(student: Student): Int
}