package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var emailValidator: EmailValidator
    var arraylist: ArrayList<String> = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /*init {
        arraylist.add("ABC")
        arraylist.add("XYZ")
        Log.d("arraylist :", arraylist.size.toString());

        main()
    }

    fun main1() {
        val product = { a: Int, b: Int -> a * b }
        val result = product(9, 3)
        println(result)
    }

    fun callMe(greeting: () -> Unit) {
        greeting()
    }

    fun main() {
        callMe { println("Hello!") }
    }*/

}