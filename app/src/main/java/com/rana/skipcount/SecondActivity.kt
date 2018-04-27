package com.rana.skipcount

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        buttonClick.setOnClickListener {
            startActivity(Intent(this@SecondActivity, ThirdActivity::class.java))
        }
    }
}
