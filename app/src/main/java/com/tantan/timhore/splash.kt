package com.tantan.timhore

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import java.lang.Exception

class splash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //menyembunyikan title bar
        window.requestFeature(Window.FEATURE_NO_TITLE)
        //Menmbuat fullscreen
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_splash)


        //2 detik
        Handler().postDelayed({
            val intent = Intent(this@splash, masuk::class.java)
            startActivity(intent)
        }, 2000)

    }
}
