package com.example.filemanagementimport

import com.example.filemanagement.R
import com.example.filemanagement.Student

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RCItemAdapter(val items : ArrayList<Student>): RecyclerView.Adapter<RCItemAdapter.RCItemViewAdapter>() {
    class RCItemViewAdapter(private val itemView: View): RecyclerView.ViewHolder(itemView) {
        var name = itemView.findViewById<TextView>(R.id.name)
        var stdNum = itemView.findViewById<TextView>(R.id.stdNum)
        var email = itemView.findViewById<TextView>(R.id.email)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RCItemAdapter.RCItemViewAdapter {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.custom_row_icon_label, parent, false)
        return RCItemViewAdapter(itemView)
    }

    override fun onBindViewHolder(holder: RCItemAdapter.RCItemViewAdapter, position: Int) {
        holder.name.text = items[position].name
        holder.stdNum.text = items[position].stdNum.toString()
        holder.email.text = buildString {
            append(items[position].name)
            append(".")
            append(items[position].stdNum.toString())
            append("@sis.hust.edu.vn")
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
}