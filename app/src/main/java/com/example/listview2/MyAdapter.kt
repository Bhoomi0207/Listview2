package com.example.listview2

import android.app.Activity
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class MyAdapter(private val context:Activity, private val arrayList:ArrayList<user>) :
    ArrayAdapter<user>(context,R.layout.each_item,arrayList) {


    override fun getView(position:Int, convertView:View?, parent:ViewGroup):View {

        val inflater : LayoutInflater= LayoutInflater.from(context)
        val view:View=inflater.inflate(R.layout.each_item,null)
        val image= view.findViewById<ImageView>(R.id.profile_image)
        val name= view.findViewById<TextView>(R.id.textView)
        val color= view.findViewById<TextView>(R.id.textView2)
        val lastmsgTime=view.findViewById<TextView>(R.id.textView3)

        name.text=arrayList.get(position).name
        color.text=arrayList.get(position).color
        lastmsgTime.text=arrayList.get(position).lastmsgTime

        image.setImageResource(arrayList[position].imageid)

    return view
    }
}

