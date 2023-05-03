package com.example.listview2

/*import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class user_activity : AppCompatActivity() {*/

    //@SuppressLint("MissingInflatedId")
    /*override fun onCreate(savedInstanceState:Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        val name =intent.getStringArrayExtra("name")
        val color =intent.getStringArrayExtra("color")
        val image =intent.getIntArrayExtra("imageid")

        val nameTv =findViewById<TextView>(R.id.name)
        val colorTv=findViewById<TextView>(R.id.color)
        //val imageid=findViewById<CircleImageView>(R.id.profile_image)

        nameTv.text= name.toString()
        colorTv.text= color.toString()

            nameTv.text= name.toString()
            colorTv.text= color.toString()
          //  imageid.setImageResource(image)




    }
}*/
    import androidx.appcompat.app.AppCompatActivity
    import android.os.Bundle
    import android.widget.TextView
    import de.hdodenhof.circleimageview.CircleImageView

    class user_activity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_user)

            val name = intent.getStringExtra("name")
            val color = intent.getStringExtra("color")
            val imageId = intent.getIntExtra("image", R.drawable.lotus)

            val nameTv = findViewById<TextView>(R.id.name)
            val colortv = findViewById<TextView>(R.id.color)
            val image = findViewById<CircleImageView>(R.id.profile_image)

            nameTv.text = name
            colortv.text = color
            image.setImageResource(imageId)
        }
    }




