package com.example.ejercicio7pantallaclases

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ejercicio7pantallaclases.databinding.ActivityMain3Binding
import com.example.ejercicio7pantallaclases.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    final lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            binding.imageView2.setImageResource(R.drawable.guerrero)
        }

        binding.button2.setOnClickListener {
            binding.imageView2.setImageResource(R.drawable.ladron)
        }

        binding.button3.setOnClickListener {
            binding.imageView2.setImageResource(R.drawable.mago)
        }

        binding.button4.setOnClickListener {
            binding.imageView2.setImageResource(R.drawable.berserker)
        }

        binding.button7.setOnClickListener {
            val nuevaVista = Intent(this, MainActivity2::class.java)
            startActivity(nuevaVista)
        }


    }
}