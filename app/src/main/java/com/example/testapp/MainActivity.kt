package com.example.testapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.testapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var clickCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupUI()
    }

    private fun setupUI() {
        binding.buttonTest.setOnClickListener {
            clickCount++
            binding.textViewCounter.text = getString(R.string.click_count, clickCount)
            Toast.makeText(this, "Button clicked $clickCount times!", Toast.LENGTH_SHORT).show()
        }

        binding.buttonReset.setOnClickListener {
            clickCount = 0
            binding.textViewCounter.text = getString(R.string.click_count, clickCount)
            Toast.makeText(this, "Counter reset!", Toast.LENGTH_SHORT).show()
        }
    }
}
