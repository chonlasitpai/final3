package com.example.finaltest3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_q1.*
import kotlinx.android.synthetic.main.activity_q2.*

class q2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q2)
        var ture2 = 0
        a2.setOnClickListener {
            Toast.makeText(
                this,
                "คำตอบถูกต้องสามารถกดไปข้อถัดไปได้",
                Toast.LENGTH_LONG
            ).show()
            ture2 = 1
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
            ture2 = 1
        }
        d2.setOnClickListener {
            Toast.makeText(this, "ตอบผิดโปรดเลือกคำตอบที่ถูกต้อง", Toast.LENGTH_LONG).show()
        }
        next2.setOnClickListener {
            if (ture2 == 1) {
                val it = Intent(this, q3::class.java)
                startActivity(it)
            } else {
                Toast.makeText(this, "โปรดตอบคำถามให้ถูกต้องเพื่อไปข้อถัดไป", Toast.LENGTH_LONG)
                    .show()
            }
        }
    }
}