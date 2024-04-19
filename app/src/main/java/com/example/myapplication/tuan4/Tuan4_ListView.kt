package com.example.myapplication.tuan4

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.R

class Tuan4_ListView : AppCompatActivity() {
    var adapter:T4Adapter? =null
    var ls = ArrayList<T4Contact>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tuan4_list_view)
        var lv = findViewById<ListView>(R.id.t4ListView)
        ls.add(T4Contact("NguyenVanA","20",R.drawable.duck1))
        ls.add(T4Contact("VitVang","21",R.drawable.duck2))
        ls.add(T4Contact("VitVang","22",R.drawable.duck3))

        adapter = T4Adapter(ls,this)
        lv!!.adapter=adapter
    }
}