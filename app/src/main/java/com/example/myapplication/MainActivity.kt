package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

fun main() {
    val symbol = listOf(
        "♪ ",
        "♫ ",
        "☼",)
    var list = mutableListOf<String>()
    for (s in symbol){
        list.add(s)
    }
    println(list)
}


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}