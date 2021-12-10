package com.tugas.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragmentSatu = fragmentSatu()
        supportFragmentManager.beginTransaction()
            .add(R.id.container,fragmentSatu, fragmentSatufragmentDua::class.java.simpleName)
            .addToBackStack(null)
            .commit()
    }
    }
