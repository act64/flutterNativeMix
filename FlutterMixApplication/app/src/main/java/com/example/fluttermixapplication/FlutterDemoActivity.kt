package com.example.fluttermixapplication

import com.taobao.idlefish.flutterboost.containers.BoostFlutterActivity
import io.flutter.plugin.common.PluginRegistry
import io.flutter.plugins.GeneratedPluginRegistrant



class FlutterDemoActivity :BoostFlutterActivity(){
    override fun getContainerParams(): MutableMap<String,String> {
        val params = HashMap<String,String>()
        params.put("key", "value")
        return params
    }

    override fun onRegisterPlugins(p0: PluginRegistry?) {
        GeneratedPluginRegistrant.registerWith(p0);

    }

    override fun getContainerName(): String {
        return "sample://firstPage";
    }

}