package com.example.wifistatechange

import android.content.Context
import android.net.wifi.WifiManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnWifiOn = findViewById<Button>(R.id.wifiOn)
        val btnWifioff = findViewById<Button>(R.id.wifiOff)

        btnWifiOn.setOnClickListener {
            val wifiManager = applicationContext.getSystemService(Context.WIFI_SERVICE) as WifiManager
            wifiManager.setWifiEnabled(true)
            Toast.makeText(this@MainActivity,"Wifi on",Toast.LENGTH_SHORT).show()
        }
        btnWifioff.setOnClickListener {
            val wifiManager  = applicationContext.getSystemService(Context.WIFI_SERVICE) as WifiManager
            wifiManager.setWifiEnabled(false)
            Toast.makeText(this@MainActivity,"Wifi Off",Toast.LENGTH_SHORT).show()
        }
    }
}