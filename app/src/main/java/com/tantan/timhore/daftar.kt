package com.tantan.timhore

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class daftar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)

        ///Tombol Register
        val register = findViewById<Button>(R.id.btn_register)
            register.setOnClickListener {
                startActivity(Intent(this@daftar, menu::class.java))
            }
    }
}
