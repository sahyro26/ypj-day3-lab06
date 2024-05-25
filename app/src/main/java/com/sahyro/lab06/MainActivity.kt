package com.sahyro.lab06

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.sahyro.lab06.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.courses.setOnClickListener {
            binding.infoTextView.text = "Android Application Development ,Android Security " +
                    "Adroid Ui UX and Monetize Android Applications"
        }

        binding.courses.setOnClickListener {
            binding.infoTextView.text = "The exam is 50 questions multichoice in 1 hour 30 min" +
                    "with passing mark 75"
        }

    }
}