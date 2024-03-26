package com.example.projectandroidmas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projectandroidmas.databinding.ActivityLupaPasswordBinding

class LupaPassword : AppCompatActivity() {

    private lateinit var binding: ActivityLupaPasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLupaPasswordBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // Link (text view) navigasi ke halaman Login
        binding.btnKembaliKeLogin.setOnClickListener {
            val intentLogin = Intent(this, Login::class.java)
            startActivity(intentLogin)
        }
    }
}