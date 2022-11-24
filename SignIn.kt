package com.example.spotium

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SignIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
    }




    fun open_main_window(view: View){
        val open = Intent(this, MainActivity::class.java)
        startActivity(open)
    }


    fun open_log(view: View){
        val open = Intent(this, LogIn::class.java)
        startActivity(open)
    }

}