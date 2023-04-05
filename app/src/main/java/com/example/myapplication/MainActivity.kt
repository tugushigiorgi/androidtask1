package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var registerbtn:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        registerbtn=findViewById(R.id.backbutton);

        registerbtn.setOnClickListener {

            var intent:Intent=Intent(this,MainActivity2::class.java)



            startActivity(intent)


        }



    }
}