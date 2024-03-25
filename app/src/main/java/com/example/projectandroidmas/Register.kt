package com.example.projectandroidmas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projectandroidmas.databinding.ActivityLoginBinding
import com.example.projectandroidmas.databinding.ActivityRegisterBinding

class Register : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // Tombol (button) navigasi ke halaman login
        binding.btnRegister.setOnClickListener {
            val intentActivityLogin = Intent(this, ActivityLoginBinding::class.java)
            startActivity(intentActivityLogin)


        // Link (text view) navigasi ke halaman login
        binding.tvLinkSudahPunyaAkun.setOnClickListener {
            val intentActivityLogin = Intent(this, ActivityLoginBinding::class.java)
            startActivity(intentActivityLogin)
        }
    }
}