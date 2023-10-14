package com.example.bp2_pertemuan5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: AdapterRecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
    private fun init(){
        recyclerView = findViewById(R.id.recycler_view)
        var data = ArrayList<DataRecyclerView>()
        data.add(DataRecyclerView(R.drawable.ic_smile,"Pilihan 1", "Deskripsi pilihan 1"))
        data.add(DataRecyclerView(R.drawable.ic_smile,"Pilihan 2", "Deskripsi pilihan 2"))
        data.add(DataRecyclerView(R.drawable.ic_smile,"Pilihan 3", "Deskripsi pilihan 3"))
        data.add(DataRecyclerView(R.drawable.ic_smile,"Pilihan 4", "Deskripsi pilihan 4"))
        data.add(DataRecyclerView(R.drawable.ic_smile,"Pilihan 5", "Deskripsi pilihan 5"))
        data.add(DataRecyclerView(R.drawable.ic_smile,"Pilihan 6", "Deskripsi pilihan 6"))
        data.add(DataRecyclerView(R.drawable.ic_smile,"Pilihan 7", "Deskripsi pilihan 7"))
        data.add(DataRecyclerView(R.drawable.ic_smile,"Pilihan 8", "Deskripsi pilihan 8"))
        data.add(DataRecyclerView(R.drawable.ic_smile,"Pilihan 9", "Deskripsi pilihan 9"))
        data.add(DataRecyclerView(R.drawable.ic_smile,"Pilihan 10", "Deskripsi pilihan 10"))
        adapter = AdapterRecyclerView(data)
    }

}