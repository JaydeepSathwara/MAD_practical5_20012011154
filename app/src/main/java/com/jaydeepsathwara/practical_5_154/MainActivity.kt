package com.jaydeepsathwara.practical_5_154

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.jaydeepsathwara.practical_5_154.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // using explicit Intent we start/stop service
    fun play(view: View) {
        Intent(applicationContext, MyService::class.java)
            .putExtra(MyService.DATA_KEY, MyService.DATA_VALUE)
            .apply { startService(this) }
        Toast.makeText(this, "Music Play", Toast.LENGTH_LONG).show()
    }

    fun stop(view: View) {
        Intent(applicationContext, MyService::class.java)
            .apply { stopService(this) }
        Toast.makeText(this, "Music Paused", Toast.LENGTH_LONG).show()
    }
}