package com.example.sportkotlinproject.ui.authorization

import android.content.Intent
import android.os.Bundle
import android.text.TextWatcher
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.sportkotlinproject.MainActivity
import com.example.sportkotlinproject.MainActivity.Companion.USER
import com.example.sportkotlinproject.R
import com.example.sportkotlinproject.pojo.User
import com.google.android.material.textfield.TextInputLayout

class AuthActivity: AppCompatActivity() {
    lateinit var edUserName: TextInputLayout
    lateinit var edUserFamily: TextInputLayout



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authorization)
        val imgLoginUser: ImageView  = findViewById(R.id.imgLoginUser)
        Glide.with(this).load(R.drawable.img_login).into(imgLoginUser)
        edUserName = findViewById(R.id.edUserName)
        edUserFamily = findViewById(R.id.edUserFamily)
        val btnLogin: Button = findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener {
            val name = edUserName.editText.toString()
            val family = edUserFamily.editText.toString()
            val user = User(name, family)
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(USER, user)
            startActivity(intent)
        }
    }
}