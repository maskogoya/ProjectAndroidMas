package com.example.projectandroidmas

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.projectandroidmas.databinding.ActivityLoginBinding
import com.example.projectandroidmas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var textToShare = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        // Kirim teks
        binding.btnKirimText.setOnClickListener {
            textToShare = binding.edtKirimText.text.toString().trim()
            if (textToShare.isNotEmpty()) {
                // shareText()
                val intent = Intent(Intent.ACTION_SEND)
                intent.type = "text/plain"
                intent.putExtra(Intent.EXTRA_SUBJECT, "Subject here")
                intent.putExtra(Intent.EXTRA_TEXT, textToShare)
                startActivity(Intent.createChooser(intent, "Share Via"))
            }
            else {
                Toast.makeText(this,"Teks tidak boleh kosong..", Toast.LENGTH_SHORT).show()
            }
        }

        // Membuka maps
        binding.btnBukaMaps.setOnClickListener {
            val intentOpenMaps = Intent(Intent.ACTION_VIEW)
            intentOpenMaps.data = Uri.parse("https://www.google.com/maps/")
            startActivity(intentOpenMaps)
        }

        // Keluar dari aplikasi
        binding.btnKeluarApk.setOnClickListener{
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }


}