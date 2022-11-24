package com.example.spotium

import android.content.Intent
import android.icu.util.Output
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class StartWindow : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_window)
    }




    fun open_main_window(view: View){

        val open = Intent(this, MainActivity::class.java)
        startActivity(open)
    }
}