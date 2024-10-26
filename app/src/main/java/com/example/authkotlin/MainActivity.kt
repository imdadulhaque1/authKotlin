package com.example.authkotlin

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import com.example.authkotlin.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {

    // Declare Binding Variable
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate the binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        // Set the content view to binding's root
        setContentView(binding.root)
        enableEdgeToEdge()

        // Now, this line works correctly without setting the layout twice
        binding.navigateToSignUp.setOnClickListener {
            Toast.makeText(this, "Navigating to Sign-Up!", Toast.LENGTH_SHORT).show()
        }
    }
}
