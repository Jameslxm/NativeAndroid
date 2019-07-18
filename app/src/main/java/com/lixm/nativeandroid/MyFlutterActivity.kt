package com.lixm.nativeandroid

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import io.flutter.facade.Flutter
import io.flutter.view.FlutterView
import kotlinx.android.synthetic.main.activity_my_flutter.*

class MyFlutterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_flutter)

        var flutterView = Flutter.createView(this,lifecycle,"route1")
        flFlutterContainer.addView(flutterView)
        var listeners = arrayOfNulls<FlutterView.FirstFrameListener>(1)
        listeners[0] = FlutterView.FirstFrameListener {
            flFlutterContainer.visibility = View.VISIBLE

        }
        flutterView.addFirstFrameListener {
            listeners[0]
        }
    }
}