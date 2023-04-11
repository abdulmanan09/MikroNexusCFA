package com.mikronexus.cfa

import android.annotation.SuppressLint
import android.content.ComponentName
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton


class MainActivity : AppCompatActivity() {
    lateinit var button: MaterialButton
    lateinit var textView: TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.proceed)
        textView = findViewById(R.id.packageName)
        textView.text = "" + packageName
        button.setOnClickListener {
            val intent = Intent(Intent.ACTION_MAIN)
            intent.component =
                ComponentName("com.mikronexus.dejavoo", "com.mikronexus.dejavoo.MainActivity")
            try {
                startActivity(intent)
            } catch (e: Exception) {
                Toast.makeText(
                    this, "Please Install the other Application to Proceed", Toast.LENGTH_SHORT
                ).show()
                e.printStackTrace()
            }


        }

    }
}