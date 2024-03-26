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

        // handle click, share text
        binding.btnKirimText.setOnClickListener {
            //get text from edit text
            textToShare = binding.edtKirimText.text.toString().trim()
            //check if text empty or not
            if (textToShare.isEmpty()) {
                showToast("Masukkan teks..")
            }
            else {
                shareText()
            }
        }

        // Membuka maps
        binding.btnBukaMaps.setOnClickListener {
            // Membuat intent utk terhubung ke maps
            val intentOpenMaps = Intent(Intent.ACTION_VIEW)
            intentOpenMaps.data = Uri.parse("https://www.google.com/maps/")
            startActivity(intentOpenMaps)
        }

        // Logout dari aplikasi
        binding.btnKeluarApk.setOnClickListener{
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }

    private fun shareText() {
        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "text/plain"
        intent.putExtra(Intent.EXTRA_SUBJECT, "Subject here")
        intent.putExtra(Intent.EXTRA_TEXT, textToShare)
        startActivity(Intent.createChooser(intent, "Share Via"))
    }

    private fun showToast(pesan: String) {
        Toast.makeText(this, pesan, Toast.LENGTH_SHORT).show()
    }
}