package com.example.bp2_pertemuan5

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder(inflater: LayoutInflater, parent: ViewGroup):
    RecyclerView.ViewHolder(inflater.inflate(R.layout.recycler_view_template, parent, false)) {
    private var ivGambar: ImageView? = null
    private var tvJudul: TextView? = null
    private var tvDeskripsi: TextView? = null
    init {
        ivGambar = itemView.findViewById(R.id.iv_gambar)
        tvJudul = itemView.findViewById(R.id.tv_judul)
        tvDeskripsi = itemView.findViewById(R.id.tv_deskripsi)
    }
    fun tampilData(data: DataRecyclerView){
        ivGambar?.setImageResource(data.ivGambar)
        tvJudul?.text = data.tvJudul
        tvDeskripsi?.text = data.tvDeskripsi
    }
}