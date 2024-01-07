package com.example.filemanagement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ListView
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val studentDao = StudentDatabase.getInstance(application).studentDao()
//        val newStudent = Student(name = "Huy", stdNum = "20205086", dob ="2002-11-15", hometown = "Hanoi" )
        val result = studentDao.getAllStudents();
        val itemList = result
        for (i in 1..13){
            itemList.(
                ItemModel("Data $i",
                    resources.getIdentifier("dice_$i", "drawable", packageName),
                    getString(R.string.content)
                )
            )
        }
        val adapter = RCItemAdapter(itemList)
        val listView: RecyclerView = findViewById<RecyclerView>(R.id.rcView)
        listView.layoutManager = LinearLayoutManager(this)
        listView.adapter = adapter

    }
}