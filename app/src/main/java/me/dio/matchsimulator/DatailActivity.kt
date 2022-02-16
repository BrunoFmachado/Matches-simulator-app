package me.dio.matchsimulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.dio.matchsimulator.databinding.ActivityDatail2Binding

class DatailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDatail2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDatail2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}