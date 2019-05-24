package com.example.fluttermixapplication

import android.app.Activity
import android.app.Application
import android.content.Context
import com.taobao.idlefish.flutterboost.FlutterBoostPlugin
import com.taobao.idlefish.flutterboost.interfaces.IPlatform
import io.flutter.view.FlutterMain

class MainApp:Application() {
    override fun onCreate() {
        super.onCreate()
        FlutterBoostPlugin.init(object : IPlatform {
            override fun getSettings(): MutableMap<Any?, Any?>? {
             return null
            }

            override fun isDebug(): Boolean {
                return false
            }

            override fun getApplication(): Application {
                return this@MainApp
            }

            override fun getMainActivity(): Activity {
               return  MainActivity.sref!!;
            }

            override fun startActivity(p0: Context?, p1: String?, p2: Int): Boolean {
                return false
            }
        })
        FlutterMain.startInitialization(this)
    }
}