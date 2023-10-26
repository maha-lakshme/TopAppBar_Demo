package com.maha.topappbar_demo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter: RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    var data =  listOf<String>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }
    override fun getItemCount() =data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.txt.text= data[position]
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.list_item_view, parent, false)
        )
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val txt: TextView = itemView.findViewById(R.id.txtview)
    }
}