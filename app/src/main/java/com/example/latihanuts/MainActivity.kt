package com.example.latihanuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_form.setOnClickListener {
            val form = Intent(this, FormActivity::class.java)
            startActivity(form)
        }

        btn_cal.setOnClickListener {
            val intent = Intent(this, CalActivity::class.java)
            startActivity(intent)
        }


        btn_about.setOnClickListener {
            val namaku = "Umar Ulkhak"
            val email = "alkhak24@gmail.com"
            val phone = "+62 857-1159-8638"

            val about = Intent(this, AboutActivity::class.java)
            about.putExtra("Namaku", namaku)
            about.putExtra("Email", email)
            about.putExtra("Phone", phone)
            startActivity(about)
        }
    }
}
