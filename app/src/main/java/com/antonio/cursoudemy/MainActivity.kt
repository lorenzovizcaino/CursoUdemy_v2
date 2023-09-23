package com.antonio.cursoudemy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val fecha="05/06/1990"
        var nombre="jota"

        nombre="Adrian"
        println(nombre)
    }
}