package com.parenthings.kalv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FirstLoginActionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_login_action)

        val age03Button: Button = findViewById(R.id.age03_button)
        val age48Button: Button = findViewById(R.id.age48_button)
        val age911Button: Button = findViewById(R.id.age911_button)
        val age1214Button: Button = findViewById(R.id.age1214_button)
        val age1517Button: Button = findViewById(R.id.age1517_button)

        age03Button.setOnClickListener {

            gotoMainActivity()

        }

        age48Button.setOnClickListener {

            gotoMainActivity()

        }

        age911Button.setOnClickListener {

            gotoMainActivity()

        }

        age1214Button.setOnClickListener {

            gotoMainActivity()

        }

        age1517Button.setOnClickListener {

            gotoMainActivity()

        }
    }

    fun gotoMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        this.finish()
    }
}