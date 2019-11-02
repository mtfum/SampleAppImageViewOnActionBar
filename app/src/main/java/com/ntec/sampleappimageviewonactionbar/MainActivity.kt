package com.ntec.sampleappimageviewonactionbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.setCustomView(R.layout.logo_image_view)
        supportActionBar?.setDisplayShowCustomEnabled(true)
    }
}
