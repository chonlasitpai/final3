package com.example.finaltest3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_q1.*

class q1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q1)
        var ture = 0
        a.setOnClickListener {
            Toast.makeText(this, "ตอบผิดโปรดเลือกคำตอบที่ถูกต้อง", Toast.LENGTH_LONG).show()
        }
        b.setOnClickListener {
            Toast.makeText(this, "ตอบผิดโปรดเลือกคำตอบที่ถูกต้อง", Toast.LENGTH_LONG).show()
        }
        c.setOnClickListener {
            Toast.makeText(
                this,
                "คำตอบถูกต้องสามารถกดไปข้อถัดไปได้",
                Toast.LENGTH_LONG
            ).show()
            ture = 1
        }
        d.setOnClickListener {
            Toast.makeText(this, "ตอบผิดโปรดเลือกคำตอบที่ถูกต้อง", Toast.LENGTH_LONG).show()
        }
        next.setOnClickListener {
            if (ture == 1) {
                    val it = Intent(this, q2::class.java)
                startActivity(it)
            } else {
                Toast.makeText(this, "โปรดตอบคำถามให้ถูกต้องเพื่อไปข้อถัดไป", Toast.LENGTH_LONG)
                    .show()
            }
        }
    }
}

