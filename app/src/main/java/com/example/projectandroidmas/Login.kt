package com.example.projectandroidmas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projectandroidmas.databinding.ActivityLoginBinding
import com.example.projectandroidmas.databinding.ActivityRegisterBinding

class Login : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLoginBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // Tombol (button) navigasi ke halaman MainActivity
        binding.loginBtn.setOnClickListener {
            val intentMain = Intent(this, MainActivity::class.java)
            startActivity(intentMain)
        }

        // Link (text view) navigasi ke halaman Register
        binding.tvLinkToRegister.setOnClickListener {
            val intentRegister = Intent(this, Register::class.java)
            startActivity(intentRegister)
        }

        // Link (text view) navigasi ke halaman Lupa Password
        binding.linkLupaPassword.setOnClickListener {
            val intentLupaPass = Intent(this, LupaPassword::class.java)
            startActivity(intentLupaPass)
        }
    }
}