package com.tantan.timhore

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.tantan.timhore.R.string.login

class masuk : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_masuk)

        ///Tombol login
        val login = findViewById<Button>(R.id.login)
            login.setOnClickListener {
                startActivity(Intent(this@masuk, menu::class.java))
            }

        //Tombol sign up
        val signup = findViewById<Button>(R.id.signup)
            signup.setOnClickListener {
                startActivity(Intent(this@masuk, daftar::class.java))
        }
    }
}
