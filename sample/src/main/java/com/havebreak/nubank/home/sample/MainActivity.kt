package com.havebreak.nubank.home.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.havebreak.nubank.home.HomeManager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            initModule()
        }
    }

    private fun initModule() {
        HomeManager.Builder()
            .build()
            .start(this)
    }
}