package com.example.dndroller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //This is how the view is shown on this Activity

        //R stands for Resources
        findViewById<Button>(R.id.button).setOnClickListener{
            Log.i("Alexis", "Button is clicked") //search the message by looking up the tag
            findViewById<TextView>(R.id.textView).text = "You Rolled a :"
        }
    }
}