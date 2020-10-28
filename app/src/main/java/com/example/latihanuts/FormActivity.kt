package com.example.latihanuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_form.*

class FormActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            title = "Personal Data Form"
        }

        val txt_nim = findViewById<EditText>(R.id.txt_nim)
        val txt_nama = findViewById<EditText>(R.id.txt_nama)
        val txt_kelas = findViewById<EditText>(R.id.txt_kelas)

        btn_batal.setOnClickListener {
            txt_nim.text.clear()
            txt_nama.text.clear()
            txt_kelas.text.clear()
        }

        btn_kirim.setOnClickListener {
            val nim = txt_nim.text.toString()
            val nama = txt_nama.text.toString()
            val kelas = txt_kelas.text.toString()

            if (nim.isEmpty()){
                txt_nim.error = "Please enter your NIM!"
                return@setOnClickListener
            }
            if (nama.isEmpty()){
                txt_nama.error= "Please enter your name!"
                return@setOnClickListener
            }
            if (kelas.isEmpty()){
                txt_kelas.error ="Please enter your class!"
                return@setOnClickListener
            }
            val intent = Intent(this, SendDataActivity ::class.java)
            intent.putExtra("Nim", nim)
            intent.putExtra("Nama", nama)
            intent.putExtra("Kelas", kelas)
            startActivity(intent)
            Toast.makeText(this,"Success!", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
