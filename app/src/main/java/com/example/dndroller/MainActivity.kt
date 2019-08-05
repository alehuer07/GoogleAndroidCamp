package com.example.dndroller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //This is how the view is shown on this Activity

        //R stands for Resources
        findViewById<Button>(R.id.button).setOnClickListener{

            val lowerBound = 1
            val upperBound = 20
            //get randomNumber and change the view

            //if randomNumber is the winning number, then show a toast message
//            val winningNumber = findViewById<EditText>(R.id.editText).text.toString()
//            if(winningNumber == randomNumber){
//                Toast.makeText(this,"You Won!", Toast.LENGTH_LONG).show()
//            }

            var randomNumber = displayRandomNumber(lowerBound, upperBound).toString()


            if(lowerBound.toString() == randomNumber){
                Toast.makeText(this,"Critical Miss!", Toast.LENGTH_LONG).show()
            }

            if(upperBound.toString() == randomNumber){
                Toast.makeText(this,"Critical Hit!", Toast.LENGTH_LONG).show()
            }


//            var randomNumber = getRandomNumber(1,20)
//            buttonText = "You Rolled a : " + randomNumber + " !"

        }
    }

    private fun getRandomNumber(lowerBound: Int, upperBound: Int): Int {
        return (lowerBound..upperBound).random()
    }

    private fun displayRandomNumber(lowerBound: Int, upperBound: Int): Int {
        var randomNumber = getRandomNumber(lowerBound,upperBound)

        findViewById<TextView>(R.id.textView).text = "You Rolled a : " + randomNumber + " !"
        Log.i("Alexis", "Button is clicked" + randomNumber) //search the message by looking up the tag
        return randomNumber;
    }

}