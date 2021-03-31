package com.example.finaltest3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_q1.*
import kotlinx.android.synthetic.main.activity_q3.*

class q3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_q3)
        var ture3 = 0
        a3.setOnClickListener {
            Toast.makeText(this, "ตอบผิดโปรดเลือกคำตอบที่ถูกต้อง", Toast.LENGTH_LONG).show()
        }
        b3.setOnClickListener {
            Toast.makeText(this, "ตอบผิดโปรดเลือกคำตอบที่ถูกต้อง", Toast.LENGTH_LONG).show()
        }
        c3.setOnClickListener {
            Toast.makeText(this, "ตอบผิดโปรดเลือกคำตอบที่ถูกต้อง", Toast.LENGTH_LONG).show()
        }
        d3.setOnClickListener {
                Toast.makeText(
                    this,
                    "คำตอบถูกต้องสามารถกดไปข้อถัดไปได้",
                    Toast.LENGTH_LONG
                ).show()
                ture3 = 1
            }
            next.setOnClickListener {
                if (ture3 == 1) {
                    val it = Intent(this, q4::class.java)
                    startActivity(it)
                } else {
                    Toast.makeText(this, "โปรดตอบคำถามให้ถูกต้องเพื่อไปข้อถัดไป", Toast.LENGTH_LONG)
                        .show()
                }
            }
        }
    }

