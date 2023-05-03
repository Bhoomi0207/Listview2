package com.example.listview2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    lateinit var userArrayList:ArrayList<user>
    override fun onCreate(savedInstanceState:Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = arrayOf("Lotus","Daisy","Lavendar","Hibiscus","Sunflower","Rose").asList()
        val color = arrayOf("white and pink", "white", "purple and violet", "red","Yellow","Red").asList()
        val lastmsgTime = arrayOf("6;00 AM", "6:30 AM", "7;00 AM", "7:45 AM","8;00 AM","8:15").asList()
        val imageid = intArrayOf(R.drawable.lotus,
            R.drawable.daisy,
            R.drawable.lavender,
            R.drawable.hibiscus1,R.drawable.sunflower,R.drawable.rose).asList()

        userArrayList = ArrayList()

        for (eachIndex in name.indices) {
            val User = user(name[eachIndex], color[eachIndex], lastmsgTime[eachIndex], imageid[eachIndex])
            userArrayList.add(User)
        }

        val listView = findViewById<ListView>(R.id.list)
        listView.isClickable = true
        listView.adapter = MyAdapter(this, userArrayList)
       listView.setOnItemClickListener{ parent,view,position,id->
         // open a new activity
           val userName = name[position]
           val usercolor = color[position]
           val imgid = imageid[position]
           val i = Intent(this,user_activity::class.java)

           i.putExtra("name",userName)
           i.putExtra("color",usercolor)
           i.putExtra("imageid",imgid)
           startActivity(i)





        }




    }
}
