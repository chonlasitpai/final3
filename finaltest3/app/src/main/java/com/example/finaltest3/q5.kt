package com.example.finaltest3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_q2.*
import kotlinx.android.synthetic.main.activity_q5.*

class q5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q5)
        var ture5 = 0
        a5.setOnClickListener {
            Toast.makeText(this, "ตอบผิดโปรดเลือกคำตอบที่ถูกต้อง", Toast.LENGTH_LONG).show()
        }
        b5.setOnClickListener {
            Toast.makeText(this, "ตอบผิดโปรดเลือกคำตอบที่ถูกต้อง", Toast.LENGTH_LONG).show()
        }
        c5.setOnClickListener {
            Toast.makeText(
                this,
                "คำตอบถูกต้องสามารถกดไปข้อถัดไปได้",
                Toast.LENGTH_LONG
            ).show()
            ture5 = 1
        }
        d5.setOnClickListener {
            Toast.makeText(this, "ตอบผิดโปรดเลือกคำตอบที่ถูกต้อง", Toast.LENGTH_LONG).show()
        }
        next5.setOnClickListener {
            if (ture5 == 1) {
                val it = Intent(this, q5::class.java)
                startActivity(it)
            } else {
                Toast.makeText(this, "โปรดตอบคำถามให้ถูกต้องเพื่อไปข้อถัดไป", Toast.LENGTH_LONG)
                    .show()
            }
        }
    }
}