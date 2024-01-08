package com.example.filemanagement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ListView
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.example.filemanagementimport.RCItemAdapter
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity<RecyclerView> : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycleScope.launch(Dispatchers.IO) {
            val studentDao = StudentDatabase.getInstance(application).studentDao()
            val newStudent = Student(name = "Huy", stdNum = "20205086", dob ="2002-11-15", hometown = "Hanoi" )

            val result = studentDao.insert(newStudent);
            Log.v("TAG", "${result[0]}")
            withContext(Dispatchers.Main) {
                Toast.makeText(this@MainActivity,
                    "New record inserted: ${result[0]}",
                    Toast.LENGTH_LONG).show()
            }

        }
//        for (i in 1..13){
//            itemList.(
//                ItemModel("Data $i",
//                    resources.getIdentifier("dice_$i", "drawable", packageName),
//                    getString(R.string.content)
//                )
//            )
//        }
//        val adapter = RCItemAdapter(itemList)
//        val listView: RecyclerView = findViewById(R.id.rcView)
//        listView.layoutManager = LinearLayoutManager(this)
//        listView.adapter = adapter

    }
}