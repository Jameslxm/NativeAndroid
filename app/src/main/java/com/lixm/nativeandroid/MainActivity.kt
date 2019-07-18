package com.lixm.nativeandroid

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        openBtn.setOnClickListener {
            var intent = Intent()
            intent.setClass(MainActivity@this, MyFlutterActivity::class.java)
            startActivity(intent)
        }
    }
}
