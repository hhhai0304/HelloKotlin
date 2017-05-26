package com.h3solution.hellokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById(R.id.btn_say_hello) as Button
        btn.setOnClickListener {
            showHello("Hellooooooooooooooooooo!", 5)
        }
    }

    //Test function
    fun showHello(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

    //Test loops
    fun showHello(message: String, times: Int) {
        var messageToShow: String = ""
        var index: Int = 0
        while (index < times) {
            messageToShow += message + "\n"
            index++
        }

        Toast.makeText(this, messageToShow.trim(), Toast.LENGTH_LONG).show()
    }
}