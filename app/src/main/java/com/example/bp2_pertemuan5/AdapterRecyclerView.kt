package com.example.bp2_pertemuan5

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AdapterRecyclerView(private val data:ArrayList<DataRecyclerView>): RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ViewHolder(inflater, parent)
    }
    override fun onBindViewHolder(holder: ViewHolder,position: Int) {
        holder.tampilData(data[position])
    }
    override fun getItemCount(): Int {
        return data.size
    }
}