package com.example.latihanuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_send_data.*

class SendDataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send_data)
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            title = "Personal Data"

            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }

        var Tampil = intent
        val nim = Tampil.getStringExtra("Nim")
        val nama = Tampil.getStringExtra("Nama")
        val kelas = Tampil.getStringExtra("Kelas")

        val tampil_nim = findViewById<TextView>(R.id.tv_nim)
        val tampil_nama = findViewById<TextView>(R.id.tv_nama)
        val tampil_kelas = findViewById<TextView>(R.id.tv_kelas)

        tampil_nim.text = ": $nim"
        tampil_nama.text = ": $nama"
        tampil_kelas.text = ": $kelas"

        btn_backdash.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}