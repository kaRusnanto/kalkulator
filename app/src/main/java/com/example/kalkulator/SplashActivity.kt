package com.example.kalkulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val time_duration: Long = 3000;

        Handler().postDelayed(
            {
                val intent = Intent(this, MainActivity::class.java);
                startActivity(intent);
                finish();
            }, time_duration
        )
    }
}