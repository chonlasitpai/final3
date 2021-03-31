package com.example.finaltest3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_q2.*

class q4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q4)
        var ture4 = 0
        a2.setOnClickListener {
            Toast.makeText(this, "ตอบผิดโปรดเลือกคำตอบที่ถูกต้อง", Toast.LENGTH_LONG).show()
        }
        b2.setOnClickListener {
            Toast.makeText(this, "ตอบผิดโปรดเลือกคำตอบที่ถูกต้อง", Toast.LENGTH_LONG).show()
        }
        c2.setOnClickListener {
            Toast.makeText(
                this,
                "คำตอบถูกต้องสามารถกดไปข้อถัดไปได้",
                Toast.LENGTH_LONG
            ).show()
            ture4 = 1
        }
        d2.setOnClickListener {
            Toast.makeText(this, "ตอบผิดโปรดเลือกคำตอบที่ถูกต้อง", Toast.LENGTH_LONG).show()
        }
        next2.setOnClickListener {
            if (ture4 == 1) {
                val it = Intent(this, q5::class.java)
                startActivity(it)
            } else {
                Toast.makeText(this, "โปรดตอบคำถามให้ถูกต้องเพื่อไปข้อถัดไป", Toast.LENGTH_LONG)
                    .show()
            }
        }
    }
}