package com.parenthings.kalv.ui.login

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.parenthings.kalv.ForgotPasswordActivity
import com.parenthings.kalv.MainActivity
import com.parenthings.kalv.databinding.ActivityLoginBinding

import com.parenthings.kalv.R
import com.parenthings.kalv.RegisterActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var loginViewModel: LoginViewModel
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.setBackgroundDrawable(ColorDrawable(Color.parseColor("#CA80B2")))

        supportActionBar?.title = "Masuk";

        val registerButton:TextView = findViewById<Button>(R.id.register_button)
        val forgotPasswordButton:TextView = findViewById<Button>(R.id.forgotPassword_button)
        val loginButton:Button = findViewById(R.id.login_button)

        registerButton.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        forgotPasswordButton.setOnClickListener {
            val intent = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(intent)
        }

        loginButton.setOnClickListener(View.OnClickListener {
            val email: String = findViewById<EditText>(R.id.email).getText().toString()
            val password: String = findViewById<EditText>(R.id.password).getText().toString()

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

            //Toast.makeText(this, "Email: $email\nPassword: $password", Toast.LENGTH_LONG).show()
        })
    }
}
