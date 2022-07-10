package com.parenthings.kalv.ui.login

import android.app.Activity
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
import android.widget.EditText
import android.widget.Toast
import com.parenthings.kalv.databinding.ActivityLoginBinding

import com.parenthings.kalv.R

class LoginActivity : AppCompatActivity() {

    private lateinit var loginViewModel: LoginViewModel
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.setBackgroundDrawable(ColorDrawable(Color.parseColor("#CA80B2")))

        supportActionBar?.title = "Masuk";





    }

    fun forgotPassword(view: View) {

    }

    fun registerForm(view: View) {

    }
}
