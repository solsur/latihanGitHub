package com.tantan.timhore

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.tantan.timhore.R.string.login
import kotlinx.android.synthetic.main.activity_masuk.*

class masuk : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_masuk)

        ///Tombol login
        val login = findViewById<Button>(R.id.btn_login)
            login.setOnClickListener {
                startActivity(Intent(this@masuk, menu::class.java))
            }

        //Tombol sign up
        val signup = findViewById<Button>(R.id.btn_signup)
            signup.setOnClickListener {
                startActivity(Intent(this@masuk, daftar::class.java))
        }
    }
}
