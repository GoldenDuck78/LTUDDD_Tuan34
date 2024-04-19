package com.example.myapplication.tuan4

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.myapplication.R

class T4Adapter(val ls:ArrayList<T4Contact>, val context:Context): BaseAdapter() {
    override fun getCount(): Int {
        return ls.size
    }

    override fun getItem(position: Int): Any {
        return ls[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var cvv = convertView
        val vax: ViewAX
        if (convertView == null)
        {
            vax = ViewAX()
            cvv = LayoutInflater.from(context).inflate(R.layout.item_view_t4,null)
            vax.img_hinh = cvv!!.findViewById(R.id.tuan4ItemHinh)
            vax.tv_Ten = cvv!!.findViewById(R.id.tuan4Ten)
            vax.tv_Tuoi = cvv!!.findViewById(R.id.tuan4Tuoi)

            cvv.tag =vax
        }
        else {
            vax = cvv.tag as ViewAX
        }
        vax.img_hinh!!.setImageResource(ls[position].Hinh)
        vax.tv_Ten!!.text = ls[position].Ten
        vax.tv_Tuoi!!.text = ls[position].Tuoi
        return cvv
    }
    internal inner class ViewAX {
        var img_hinh = ImageView? = null
        var tv_Ten = TextView? = null
        var tv_Tuoi = TextView? =null
    }
}