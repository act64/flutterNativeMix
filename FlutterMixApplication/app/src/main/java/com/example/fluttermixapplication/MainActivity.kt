package com.example.fluttermixapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        var sref :MainActivity?=null
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sref=this

        tv_hello_word.setOnClickListener {
            startActivity(Intent(this,FlutterDemoActivity::class.java))
        }
    }
}
