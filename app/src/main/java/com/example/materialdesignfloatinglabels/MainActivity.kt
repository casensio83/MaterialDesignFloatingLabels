package com.example.materialdesignfloatinglabels

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginButton.setOnClickListener { checkValidPassword()  }
    }

    private fun checkValidPassword() {
        if(password.text.toString().isBlank()) {
            textInputPassword.error = resources.getString(R.string.empty_password)
        }
    }
}
