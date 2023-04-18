package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnPlay.setOnClickListener {
                val a = etA.text.toString().toInt()
                val b = etB.text.toString().toInt()
                val l = etL.text.toString().toInt()
                val w = etW.text.toString().toInt()
                val i = etI.text.toString().toInt()
                var ans = 0
                if (etA.text.toString().isEmpty() ) {
                    Toast.makeText(
                        applicationContext,
                        "Bosh orinlarni to'ldiring !!",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    ans = ((a * b * w) / l) * i
                    tvAnsNum.text = ans.toString()
                }
            }
        }
    }
}