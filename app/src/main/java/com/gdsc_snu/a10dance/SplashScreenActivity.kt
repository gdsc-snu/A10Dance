package com.gdsc_snu.a10dance

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SplashScreenActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        //this one is for hiding taskBar
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()

        //variables for animation
        // Animation topAnim,bottomAnim
        val backgroundImg : ImageView = findViewById(R.id.iv_logo)
        val topAnim = AnimationUtils.loadAnimation(this,R.anim.top_navigation)
        backgroundImg.startAnimation(topAnim)

        val textView1 : TextView = findViewById(R.id.textView1)
        val bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_navigation)
        textView1.startAnimation(bottomAnim)

        val textView2 : TextView = findViewById(R.id.textView1)
        val bottomAnim2 = AnimationUtils.loadAnimation(this,R.anim.bottom_navigation)
        textView2.startAnimation(bottomAnim2)

        Handler().postDelayed({
            startActivity(Intent(this,visit_page::class.java))
            finish()
        },5000)

    }
}